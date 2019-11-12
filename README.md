# SpringDemo

#建立数据库
运行\tools\ssmm.sql，建立数据库和表

#生成mbatis相关
编辑\tools\CmdGenerator\generator.xml（文档中有说明），运行run.bat生成mapper.xml、java bean和dao文件。

#This is for Spring demo.

#取用户数据
localhost:8080/SpringDemo/user/1  localhost:8080/SpringDemo/user?id=1

#取用户列表
localhost:8080/SpringDemo/userList

#登记新用户
localhost:8080/SpringDemo/userRegister

