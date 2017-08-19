# Jenkins安装

##  1.构建镜像
本镜像在官方的Jenkins镜像基础上安装了ansible<br>

clone本工程(如果已经clone过，略过此步)
<pre><code>git clone git@github.ibm.com:wuhd/DevOpsToolChainSetupGuide.git
</code></pre>

编辑./jenkins/hosts文件，默认docker环境部署下无需更改，hosts文件里添加了host机的ip 172.17.0.1，特殊情况请自行添加修改
<pre><code>cd DevOpsToolChainSetupGuide
docker build -t bkfmjenkins .
</code></pre>

在ibm环境也可以直接拉取镜像
<pre><code>docker pull blockchain-03.cn.ibm.com:5000/bkfmjenkins
</code></pre>

##  2.启动
编辑镜像的情况下
<pre><code>docker run -d --network toolchainnetwork  --name jenkins　-v {jenkins配置目录}:/var/jenkins_home -v {ansible_hosts配置目录}:/etc/ansible -p 8081:8080 -p 50000:50000 bkfmjenkins
</code></pre>

拉取镜像的情况下
<pre><code>docker run -d --network toolchainnetwork  --name jenkins -v {jenkins配置目录}:/var/jenkins_home -v {ansible_hosts配置目录}:/etc/ansible -p 8081:8080 -p 50000:50000 blockchain-03.cn.ibm.com:5000/bkfmjenkins
</code></pre>
{jenkins配置目录}请各自指定你server上个目录以存放相关文件<br>

查看log
<pre><code>docker logs -f jenkins
</code></pre>

![Image text](https://raw.githubusercontent.com/k19810703/myimages/master/jenkins0.png)
复制下上图红框部分的密码

打开http://<服务器url>:8081
![Image text](https://raw.githubusercontent.com/k19810703/myimages/master/jenkins1.png)
黏贴密码，点continue后出现下图的配置画面，just wait
![Image text](https://raw.githubusercontent.com/k19810703/myimages/master/jenkins2.png)
出现下图
![Image text](https://raw.githubusercontent.com/k19810703/myimages/master/jenkins3.png)
IBM环境下可以连接外网，但是jenkins不知为何判断为没有internet连接，点configur proxy配置代理<br>
IBM环境代理：9.139.246.81:8080 , 填完点advanced
![Image text](https://raw.githubusercontent.com/k19810703/myimages/master/jenkins4.png)
输个UTL进行测试，通过后保存继续
![Image text](https://raw.githubusercontent.com/k19810703/myimages/master/jenkins5.png)
出现下图的配置画面，just wait
![Image text](https://raw.githubusercontent.com/k19810703/myimages/master/jenkins6.png)
出现下图点左边那个
![Image text](https://raw.githubusercontent.com/k19810703/myimages/master/jenkins7.png)
奋力安装中
![Image text](https://raw.githubusercontent.com/k19810703/myimages/master/jenkins8.png)
创建admin账号
![Image text](https://raw.githubusercontent.com/k19810703/myimages/master/jenkins9.png)
搞定
![Image text](https://raw.githubusercontent.com/k19810703/myimages/master/jenkins10.png)

##  3 添加ssh key到host机
<pre><code>bash addsshkey.sh
</code></pre>
参考
http://blog.csdn.net/permike/article/details/52386868

测试，出现提示按yes

<pre><code>docker exec -it jenkins bash
ansible all -m ping -u {your_host_user} 
</code></pre>
出现如下信息测试通过
<pre><code>172.17.0.1 | SUCCESS => {
    "changed": false, 
    "ping": "pong"
}
</code></pre>

##  4 ansible 控制windows
参考：<br>
http://www.ansible.com.cn/docs/intro_windows.html<br>
http://www.cnblogs.com/kingleft/p/6391652.html<br>


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
