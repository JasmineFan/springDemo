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


#添加Rest风格 
@RequestBody @ResponseBody 
需要在<mvn:driven>中添加FastJsonHttpMessageConverter
或者 在handlerMapping 中添加 MappingJackson2HttpMessageConverter


localhost:8080/SpringDemo/rest/user/1 GET		查询
localhost:8080/SpringDemo/rest/user/1 DELETE	删除
localhost:8080/SpringDemo/rest/user/ PUT		修改
localhost:8080/SpringDemo/rest/user/ POST		增加

