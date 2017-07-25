# DevOps工具链配置教程Docker版
<pre><code>docker run -d --publish 443:443 --publish 8203:8203 --publish 9000:22 --name gitlab --restart always --link devopstoolchaindb:gitlabdb --link jira:jira --volume {config目录}:/etc/gitlab --volume {log目录}:/var/log/gitlab --volume {data目录}:/var/opt/gitlab gitlab/gitlab-ce:latest
</code></pre>
{xxx目录}请各自指定你server上个目录以存放相关文件<br>
<pre><code>cd {config目录}
sudo chmod 777 gitlab.rb
</code></pre>
打开{config目录}下的gitlab.rb文件作如下改动<br>
1   external_url
<pre><code># external_url 'GENERATED_EXTERNAL_URL'
</code></pre>
改为
<pre><code>external_url 'http://<服务器ip>:8203'
</code></pre>
2   gitlab_shell_ssh_port
<pre><code># gitlab_rails['gitlab_shell_ssh_port'] = 22
</code></pre>
改为
<pre><code>gitlab_rails['gitlab_shell_ssh_port'] = 9000
</code></pre>
保存更改后重启镜像
<pre><code>docker restart gitlab
</code></pre>

启动成功后浏览器打开http://{服务器id}:8203看到如下画面时说明安装成功，如不是请稍等再试<br>
在下面这个画面初始化你的root用户的密码<br>
![Image text](https://raw.githubusercontent.com/k19810703/myimages/master/gitlab1.png)
密码初始化成功后可见如下画面，用root和刚初始化完的密码进行登录
![Image text](https://raw.githubusercontent.com/k19810703/myimages/master/gitlab2.png)
看到以下画面的话，gitlab就安装成功了
![Image text](https://raw.githubusercontent.com/k19810703/myimages/master/gitlab3.png)

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
