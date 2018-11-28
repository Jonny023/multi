# Grails3 Multi Project

> 项目结构

    multi
      |
      |--core    web项目
      |--domain  plugin项目
      |--service plugin项目
      
> 依赖说明

* multi包含core、domain、service
* core依赖domain和service
* service依赖domain
   
> 依赖原则

* 需要用到谁就依赖谁

> 依赖引入

    grails {
        plugins {
            compile project(":domain")
        }
    }
    
    //或者直接在dependencies中引入
    compile project(":domain")
    
## 说明
* 项目中依赖的插件、版本等都可以提取成公共文件，这里为了演示就没做处理