![image-20231128155127861](C:\Users\LENOVO\AppData\Roaming\Typora\typora-user-images\image-20231128155127861.png)

（1）. 写出sql语句，查询所有年龄大于20岁的员工

select * from employees where Age > 20；

（2）. 写出sql语句，查询所有年龄大于等于22小于25的女性员工

select * from employees where Age >= 22 and Age < 25 and Sex = '女'；

（3）. 写出sql语句，统计男女员工各有多少名

select Sex count(*) from employees group by Sex；

（4）. 写出sql语句，按照年龄降序获取员工信息

select * from employees order by Age desc；

（5）.写出sql语句，获取员工中哪个姓名具有重名现象

select Name,count(*) from employees group by Name having count( *) > 1；

（6）. 写出sql语句，查询所有姓张的员工

select * from employees where Name like '张%'；

（7）. 写出sql语句，查询住址为北京的前3条记录

select * from employees where Address = '北京' limit 3；

（8）. 写出sql语句，查询员工总数

select count(*) from employees;

（9）.写出sql语句，向表中插入一条记录

insert into employees (Name,Sex,Age,Address) values ('王六','男',23,'北京');

（10）.写出sql语句，修改员工张四的住址为南京

update employees set Address = '南京' where Name = '张四'；

（11）.写出sql语句，删除年龄大于24岁的女员工

delect from employees where Sex = '女' and Age > 24;