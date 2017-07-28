# Jira安装

### 构建jira
<pre><code>docker run --name jira -d --link devopstoolchaindb:jiradb --volume "{yourjiraconfigpath}:/var/atlassian/jira" --publish 8080:8080 cptactionhank/atlassian-jira-software:latest
</code></pre>
{yourjiraconfigpath}:请指定到host机的路径，jira的config文件会被存放到这里

### 创建jira数据库
使用mysql客户端连接到第一步中创建的数据库，创建一个名叫jiradb的database

### 初始化jira
打开http://服务器ip:8080可见下图,选择"I will setup myself" 按next
![Image text](https://raw.githubusercontent.com/k19810703/myimages/master/jira1.png)
如图配置，密码数据库密码如有更改自行修改其他
![Image text](https://raw.githubusercontent.com/k19810703/myimages/master/jira2.png)
一段时间后会变成下图，此时还未初始化完毕，请继续耐心等待
![Image text](https://raw.githubusercontent.com/k19810703/myimages/master/jira3.png)
用下面命令观察log，当log不再继续增加时，重新打开http://服务器ip:8080
<pre><code>docker logs -f jira
</code></pre>
出现下图时，jira初始化完毕，了填写Application Title并继续
![Image text](https://raw.githubusercontent.com/k19810703/myimages/master/jira4.png)
出现下图，先点"MyAtlassian"注册账号，注册细节此处不描述
![Image text](https://raw.githubusercontent.com/k19810703/myimages/master/jira5.png)
登录jira账号后，出现下图，点击Generate Liscence
![Image text](https://raw.githubusercontent.com/k19810703/myimages/master/jira6.png)
点击下图Next
![Image text](https://raw.githubusercontent.com/k19810703/myimages/master/jira7.png)
输入个人信息，继续Next
![Image text](https://raw.githubusercontent.com/k19810703/myimages/master/jira8.png)
陆续看到下图
![Image text](https://raw.githubusercontent.com/k19810703/myimages/master/jira9.png)
![Image text](https://raw.githubusercontent.com/k19810703/myimages/master/jira10.png)
![Image text](https://raw.githubusercontent.com/k19810703/myimages/master/jira11.png)
![Image text](https://raw.githubusercontent.com/k19810703/myimages/master/jira12.png)
至此初始化配置完成<br>

配置jira的邮件通知功能
![Image text](https://raw.githubusercontent.com/k19810703/myimages/master/jiramail1.png)
ibm环境请用如下配置，其他环境自行参考修改
![Image text](https://raw.githubusercontent.com/k19810703/myimages/master/jiramail2.png)

配置邮件转换成issue功能，通过该功能，jira会把邮箱内的邮件转换成特定的issue,方便工具链其他工具提交状态
![Image text](https://raw.githubusercontent.com/k19810703/myimages/master/jiramail3.png)
![Image text](https://raw.githubusercontent.com/k19810703/myimages/master/jiramail4.png)
![Image text](https://raw.githubusercontent.com/k19810703/myimages/master/jiramail5.png)
![Image text](https://raw.githubusercontent.com/k19810703/myimages/master/jiramail6.png)
![Image text](https://raw.githubusercontent.com/k19810703/myimages/master/jiramail7.png)
![Image text](https://raw.githubusercontent.com/k19810703/myimages/master/jiramail8.png)
参考上面几个图根据自己的环境修改



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
