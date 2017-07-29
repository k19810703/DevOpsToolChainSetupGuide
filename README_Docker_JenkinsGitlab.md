# Jenkin和gitlab的整合

1   默认plugin里没有安装gitlab插件，先安装插件
![Image text](https://raw.githubusercontent.com/k19810703/myimages/master/jenkinsgitlab1.png)
![Image text](https://raw.githubusercontent.com/k19810703/myimages/master/jenkinsgitlab2.png)
![Image text](https://raw.githubusercontent.com/k19810703/myimages/master/jenkinsgitlab3.png)
![Image text](https://raw.githubusercontent.com/k19810703/myimages/master/jenkinsgitlab4.png)
用同样的方法安装另外2个必要插件，"JIRA Pipeline Steps"，"Pipeline Utility Steps"


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

4 配置项目
在jinkins创建项目
![Image text](https://raw.githubusercontent.com/k19810703/myimages/master/jenkinsgitlab17.png)
起个名字，指定giturl 选个认证方式
![Image text](https://raw.githubusercontent.com/k19810703/myimages/master/jenkinsgitlab18.png)
获取jenkins的api token<br>
进入用户管理找到api token
![Image text](https://raw.githubusercontent.com/k19810703/myimages/master/jenkinsgitlab19.png)
![Image text](https://raw.githubusercontent.com/k19810703/myimages/master/jenkinsgitlab20.png)
![Image text](https://raw.githubusercontent.com/k19810703/myimages/master/jenkinsgitlab21.png)
![Image text](https://raw.githubusercontent.com/k19810703/myimages/master/jenkinsgitlab22.png)
进入gitlab，项目的设置里添加webhook，填上jenkins的地址：http://{ip}:{port}/project/{projectname}<br>
添加后进行测试
![Image text](https://raw.githubusercontent.com/k19810703/myimages/master/jenkinsgitlab23.png)
![Image text](https://raw.githubusercontent.com/k19810703/myimages/master/jenkinsgitlab24.png)
![Image text](https://raw.githubusercontent.com/k19810703/myimages/master/jenkinsgitlab25.png)
看到这个就成功了，这样设置完，当gitlab发生指定事件就会触发jenkins
![Image text](https://raw.githubusercontent.com/k19810703/myimages/master/jenkinsgitlab26.png)



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
