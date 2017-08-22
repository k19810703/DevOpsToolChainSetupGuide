# Docker Registry安装

本步骤非必须

##  1.部署
https://github.com/vmware/harbor<br>
配置完后可以通过http://{yourserverip}:{yourport}来访问


##  2.UserGuide

### 2.1 配置
在docker配置文件里添加
<pre><code>"insecure-registries" : ["blockchain-03.cn.ibm.com:{yourregistryport}"]
</code></pre>

####    MAC
如下图配置后重启docker
![Image text](https://raw.githubusercontent.com/k19810703/myimages/master/dockerregistry1.png)

####    ubuntu
按下图添加编辑/etc/docker/daemon.json文件
![Image text](https://raw.githubusercontent.com/k19810703/myimages/master/dockerregistry2.png)

####    windows
概不负责


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

