package com.atgenee

import com.atgenee.core.User
import com.atgenee.core.UserController
import com.atgenee.core.UserService
import geb.spock.GebSpec
import grails.test.mixin.Mock
import grails.test.mixin.TestFor
import grails.test.mixin.integration.Integration
import org.springframework.beans.factory.annotation.Autowired


/**
 * See http://www.gebish.org/manual/current/ for more instructions
 */
@Integration
@TestFor(UserController)
@Mock([User,UserService])
class CoreSpec extends GebSpec {

//    @Autowired
//    UserService userService


    def setup() {
//        controller.userService = userService

//        controller.userService = Spy(UserService)
    }

    def cleanup() {

    }

    void "test user save"() {
        given:
        // 构建需要的参数
        params.username = "zhangsan"
        params.nickname = "Mr.Zhang"
        params.age = 22

        // 请求方式
        // request.method = HttpMethod.POST

        when:
        // 调用save方法
        controller.save()

        then:
        println config.server.port
        println response.status // 网络响应状态码
        println response.contentAsString // 返回的数据
        assert User.count == 1 // 使用断言判断，若为false则控制台打印

        expect:
        println User.count()
    }

    void "test user update" () {
        given:
        println "init"
        when:
        println "当满足条件"
        then:
        println "打印结果"

    }
}
