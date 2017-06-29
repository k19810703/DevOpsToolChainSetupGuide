# DevOps工具链配置教程Docker版

这将是一个漫游而傻瓜式的教程

##  前提
OS：ubuntu
安装有Docker

##  1  数据库
该数据库将会被工具链上的各个工具使用
<pre><code>docker run --name devopstoolchaindb -e MYSQL_ROOT_PASSWORD=123456 -p 3306:3306 -d mysql
</code></pre>
默认user为root，password为123456，如有需要请自行修改

##  2  Jira

### 构建jira
<pre><code>docker run --name jira -d --link devopstoolchaindb:jiradb --publish 8080:8080 cptactionhank/atlassian-jira:latest
</code></pre>

### 创建jira数据库
使用mysql客户端连接到第一步中创建的数据库，创建一个名叫jiradb的database

### 初始化jira

打开
http://服务器ip:8080
按下图进行
