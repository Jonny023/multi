## 集成测试
* 使用`def contoller = new xxxController()` <==>`@TestFor(XxxController)` 
* 在setup中使用`controller.xxx=xxx`进行赋值
* `@Mock`注入需要的bean

# java.lang.IllegalStateException: No transactionManager was specified. Using @Transactional or @Rollback requires a valid configured transaction manager. If you are running in a unit test ensure the test has been properly configured and that you run the test suite not an individual test method.

## 官方文档3.2.8
* 如果控制器或服务使用@Transactional，则需要在单元测试的setup方法中分配事务管理器：


    def setup() {
        controller.transactionManager = transactionManager
    }