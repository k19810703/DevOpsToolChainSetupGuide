# 数据库安装


该数据库将会被工具链上的各个工具使用
<pre><code>docker run --name devopstoolchaindb -e MYSQL_ROOT_PASSWORD=123456 -p 3306:3306 -d mysql
</code></pre>
默认user为root，password为123456，如有需要请自行修改
