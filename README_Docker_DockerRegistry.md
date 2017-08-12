# Docker Registry安装

本步骤非必须

##  1.部署
<pre><code>docker run -d -p 5000:5000 --restart always -v {localfolder}:/var/lib/registry --name dockerregistry registry:2
</code></pre>
{localfolder}用于存放data

##  2.UserGuide

### 2.1 配置
在docker配置文件里添加
<pre><code>"insecure-registries" : ["blockchain-03.cn.ibm.com:5000"]
</code></pre>

####    MAC
如下图配置后重启docker
![Image text](https://raw.githubusercontent.com/k19810703/myimages/master/dockerregistry1.png)

####    ubuntu
按下图添加编辑/etc/docker/daemon.json文件
![Image text](https://raw.githubusercontent.com/k19810703/myimages/master/dockerregistry2.png)

####    windows
概不负责

### 2.1 使用
####    push镜像
<pre><code>docker tag {yourimagename} blockchain-03.cn.ibm.com:5000/{yourimagename}
docker push blockchain-03.cn.ibm.com:5000/{yourimagename}
</code></pre>

####    pull镜像
<pre><code>docker pull blockchain-03.cn.ibm.com:5000/{yourimagename}
</code></pre>

####    获取镜像列表
浏览器打开<br>
http://{server_ip}:5000/v2/_catalog

或者
<pre><code>curl -X GET http://{server_ip}:5000/v2/_catalog
</code></pre>

####    获取镜像TAG列表
浏览器打开<br>
http://{server_ip}:5000/v2/{imagename}/tags/list
或者
<pre><code>curl -X GET http://{server_ip}:5000/v2/{imagename}/tags/list
</code></pre>

####    删除仓库镜像
先获取degist
<pre><code>curl --header "Accept: application/vnd.docker.distribution.manifest.v2+json" \
  -I \
  -X HEAD http://{server_ip}:5000/v2/<imagename>/manifests/<imagetag>
</code></pre>
红框部分为degist
![Image text](https://raw.githubusercontent.com/k19810703/myimages/master/dockerregistry3.png)
<pre><code>curl  -X DELETE http://{server_ip}:5000/v2/{imagename}/manifests/{degist}
</code></pre>

Link
* [Mysql安装](https://github.ibm.com/wuhd/DevOpsToolChainSetupGuide/blob/master/README_Docker_mysqlinstall.md)
* [Jira安装](https://github.ibm.com/wuhd/DevOpsToolChainSetupGuide/blob/master/README_Docker_jirainstall.md)
* [创建第一个Jira项目](https://github.ibm.com/wuhd/DevOpsToolChainSetupGuide/blob/master/README_Docker_jiracreateprj.md)
* [GitLab安装](https://github.ibm.com/wuhd/DevOpsToolChainSetupGuide/blob/master/README_Docker_GitLabInstall.md)
* [GitLab简易Guide](https://github.ibm.com/wuhd/DevOpsToolChainSetupGuide/blob/master/README_Docker_GitLabUserGuide.md)
* [Gitlab和Jira的整合](https://github.ibm.com/wuhd/DevOpsToolChainSetupGuide/blob/master/README_Docker_GitLabJira.md)
* [Jenkins安装](https://github.ibm.com/wuhd/DevOpsToolChainSetupGuide/blob/master/README_Docker_Jenkins.md)
* [Jenkins和Gitlab的整合](https://github.ibm.com/wuhd/DevOpsToolChainSetupGuide/blob/master/README_Docker_JenkinsGitlab.md)
* [私有docker镜像仓库](https://github.ibm.com/wuhd/DevOpsToolChainSetupGuide/blob/master/README_Docker_DockerRegistry.md)
* [ftp](https://github.ibm.com/wuhd/DevOpsToolChainSetupGuide/blob/master/README_Docker_ftp.md)

