# DevOps工具链配置教程Docker版
<pre><code>docker run -d --publish 443:443 --publish 8203:80 --publish 9000:22 --name gitlab --restart always --link devopstoolchaindb:gitlabdb --link jira:jira --volume {config目录}:/etc/gitlab --volume {log目录}:/var/log/gitlab --volume {data目录}:/var/opt/gitlab gitlab/gitlab-ce:latest
</code></pre>
{xxx目录}请各自指定你server上个目录以存放相关文件<br>
启动成功后浏览器打开http://{服务器id}:8203看到如下画面时说明安装成功，如不是请稍等再试<br>
在下面这个画面初始化你的root用户的密码<br>
![Image text](https://raw.githubusercontent.com/k19810703/myimages/master/gitlab1.png)
密码初始化成功后可见如下画面，用root和刚初始化完的密码进行登录
![Image text](https://raw.githubusercontent.com/k19810703/myimages/master/gitlab2.png)
看到以下画面的话，gitlab就安装成功了
![Image text](https://raw.githubusercontent.com/k19810703/myimages/master/gitlab3.png)
