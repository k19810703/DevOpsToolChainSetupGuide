# Jenkin和gitlab的整合

1   默认plugin里没有安装gitlab插件，先安装插件
![Image text](https://raw.githubusercontent.com/k19810703/myimages/master/jenkinsgitlab1.png)
![Image text](https://raw.githubusercontent.com/k19810703/myimages/master/jenkinsgitlab2.png)
![Image text](https://raw.githubusercontent.com/k19810703/myimages/master/jenkinsgitlab3.png)
![Image text](https://raw.githubusercontent.com/k19810703/myimages/master/jenkinsgitlab4.png)

2 配置gitlab   
登录gitlab，为jenkins创建用户
![Image text](https://raw.githubusercontent.com/k19810703/myimages/master/jenkinsgitlab5.png)
![Image text](https://raw.githubusercontent.com/k19810703/myimages/master/jenkinsgitlab6.png)
![Image text](https://raw.githubusercontent.com/k19810703/myimages/master/jenkinsgitlab7.png)
![Image text](https://raw.githubusercontent.com/k19810703/myimages/master/jenkinsgitlab8.png)
创建完的user，直接edit编辑初始密码
![Image text](https://raw.githubusercontent.com/k19810703/myimages/master/jenkinsgitlab9.png)
用创建完的user登录后做以下操作
![Image text](https://raw.githubusercontent.com/k19810703/myimages/master/jenkinsgitlab10.png)
点完后会出现token，保存好这个token，后面会在设置jenkins里用，这个token不会再出现，请妥善保管

3 配置jenkins
由于配置jenkins的plugin时设置过代理，会导致无法访问docker的gitlab的地址，所以要先去掉
![Image text](https://raw.githubusercontent.com/k19810703/myimages/master/jenkinsgitlab11.png)
![Image text](https://raw.githubusercontent.com/k19810703/myimages/master/jenkinsgitlab12.png)
![Image text](https://raw.githubusercontent.com/k19810703/myimages/master/jenkinsgitlab13.png)
然后配置跟gitlab的连接
![Image text](https://raw.githubusercontent.com/k19810703/myimages/master/jenkinsgitlab14.png)
![Image text](https://raw.githubusercontent.com/k19810703/myimages/master/jenkinsgitlab15.png)
![Image text](https://raw.githubusercontent.com/k19810703/myimages/master/jenkinsgitlab16.png)

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
