# ftp安装（非必须）

### 构建ftp服务
<pre><code>docker run -it -d \
--name ftp \
-p 11021:21 \
-e FTP_USER=ftpuser -e FTP_PASS=123456  \
-v /home/blockchain/文档/ftproot:/data/ftpuser \
-p 65000-65004:65000-65004 \
-e PASV_MIN_PORT=65000 -e PASV_MAX_PORT=65004 \
mcreations/ftp
</code></pre>
默认用户名ftpuser，密码123456

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
