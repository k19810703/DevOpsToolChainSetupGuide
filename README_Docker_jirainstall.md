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
至此初始化配置完成