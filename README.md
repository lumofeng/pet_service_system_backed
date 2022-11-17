# 宠物服务系统（前端）

前端代码仓库：https://github.com/lubenchu/pet_hospital_fronted.git

后端代码仓库：https://github.com/lubenchu/pet_hospital_backed.git

## 项目背景

随着越来越多的人对宠物的喜爱，关于饲养宠物、对宠物的健康情况管理落后的问题越来越突出。为了宠物医院服务的管理，需要提供一套合理的管理方案，宠物医院管理服务系统可以帮助宠物医院规范化工作流程，提供工作效率，全面提高对宠物医院服务的管理水平。

## 项目角色

### 管理员角色

（1）用户管理。管理员角色拥有删除用户信息、编辑用户信息、查询用户信息、添加用户等操作权限，根据名称、邮箱、地址关键字查询用户信息。

（2）角色管理。管理员角色拥有添加新角色、删除角色、编辑角色信息、分配角色的权限菜单等操作权限。

（3）权限菜单管理。可以新增菜单，添加菜单是填写名称、路径、备注和菜单的显示图标，也可以编辑和删除菜单信息，还可以根据关键字来查询已经存在的菜单信息。

### 普通用户角色

（1）宠物列表。根据宠物名称查询宠物，查询出宠物的信息。能够查看宠物的病例，可以预约就诊。

（2）宠物健康史。通过诊疗建议关键字能够查询宠物的健康史；可以删除宠物健康史。

（3）预约列表。可以通过搜索框输入关键字来查询预约列表，预约列表状态中有申请中、已完成、不通过、通过。

（4）健康指南。根据标题来查询健康指南列表。

（5）健康标准查询。可以根据宠物的种类进行查询健康标准。

（6）宠物日志。根据宠物名称查询宠物的日志；可以增加宠物的日志和删除宠物的日志。

### 医生角色

（1）预约统计。预约状态数量统计，统计预约不通过、申请中、申请通过、已完成的统计数量，并以图表的方式显示出来。

（2）发布指南。医生可以发布有关于宠物的健康指南，填写标题和内容即可。

（3）健康标准制定。可以根据宠物的种类进行查询和添加健康标准；可以删除和编辑已经存在的健康标准。

（4）指南列表。根据标题来查询健康指南列表；可以点击健康指南的详情进行查看；可以删除健康指南信息。

（5）预约列表。可以通过搜索框输入关键字来查询预约列表、；对已有的预约进行处理。

## 技术栈

### 前端

主要技术：

- Vue 2
- Vue-Router
- element-plus
- Axios
- wangEditor 富文本编辑器

### 后端

主要技术：

- Spring Boot
- MyBatis Plus
- Mysql

依赖库：

- Hutool 工具库
- mybatis-plus-generator 代码生成器
- swagger UI 接口文档生成
- JWT 认证授权

## 快速启动

### 后端

1. 运行 sql 目录下的 create_table_and_init_data 建表和初始化数据
2. 修改 application.yml 中的数据库地址为自己的
3. 安装完 Maven 依赖后，直接运行即可

### 前端

安装依赖：

```
npm install
```

运行：

```
npm run serve
```

