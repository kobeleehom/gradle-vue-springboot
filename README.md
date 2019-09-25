# gradle-vue-springboot

#### 介绍
gradle构建的vue+springboot脚手架,启动后台会自动先编译前台，并编译后的代码作为静态资源加载到jar中，便于直接访问。
- server模块为后台
- view模块为前台

#### 软件架构
- 后台springboot工程
- 前台使用vue-cli生成的基本工程
- 前后台分离单独开发、测试，部署时前台作为后台资源文件一并部署，一个包包含前后台代码


#### 安装教程

1. 导入工程到对应ide工具，选择gradle构建
2. 前台本地启动：
- 方式一：直接使用gradle运行yarnStart的task即可
- 方式二：切换到view目录下，直接yarn dev或者npm run dev

3. 后台本地启动：
- 执行GvbootApplication的main方法即可

#### 参与贡献

1. Fork 本仓库
2. 新建 Feat_xxx 分支
3. 提交代码
4. 新建 Pull Request
