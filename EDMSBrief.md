企业文档管理系统白皮书


# 1 功能清单 #

## 1.1 文档管理 ##
### 1.1.1 文档目录 ###
支持多层级的文件夹和子文件夹结构。
### 1.1.2 文档操作 ###
> 可以通过上传文件操作创建单个文档，也可通过上载zip文件的方式创建多个文档；
> 可以下载整个文件夹，或将文件夹导出为zip文件；
> 支持多用户协同编辑文档属性、元数据。
### 1.1.3 版本管理 ###
通过签入、签出操作创建新的文档版本，用户可查看版本历史。
### 1.1.4 访问记录 ###
> 能记录文档操作过程中的每一个动作，包括操作者、操作日期及时间以及操作行为。
### 1.1.5 文档检索 ###
支持基于文档属性的检索；支持全文检索。
### 1.1.6 文档分类导航 ###
> > 能够将文档与相关文档、图纸及附件连接在一起，形成类似流程图的文档展示界面，图形的节点链接至相关文档。使用户能方便的查看一组相关文档；
> > 可以按关键字分类查看相关文档。

## 1.2 用户管理 ##
能按客户的实际需求自定义组织结构，将人员按部门分组，可按小组授权，便于批量操作，提升工作效率。

## 1.3 权限管理 ##
全面支持内容访问权限设置，可指定分组在指定文件夹或文档上的操作权限；
权限级别包括：完全控制、修改、阅读和不可访问，权限可继承到子文件夹。

## 1.4 消息系统与文档评论 ##
实现用户间的信息传递，方便文档管理的协作；
用户可以针对文档发表评论文章。

# 2. 技术参数 #
## 2.1 服务端运行环境 ##
  * RedHat AS 5，Windows Server 2003
  * MS SQLServer 2000，MySQL 4.1+，Oracle 9i+
  * WebSphere Application Server，Tomcat 6.0.16

## 2.2 客户端运行环境 ##
  * Internet Explorer 6.0、Firefox 2.0+

## 2.3 开发环境 ##
  * J2EE（JDK 1.6）