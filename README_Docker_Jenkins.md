# Jenkins安装

启动jenkins
<pre><code>docker run -d --name jenkins --link gitlab:gitlab -v {jenkins配置目录}:/var/jenkins_home -p 8081:8080 -p 50000:50000 jenkins
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
