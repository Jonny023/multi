package com.atgenee.core

import grails.test.mixin.Mock
import grails.test.mixin.TestFor
import spock.lang.Specification

/**
 * See the API for {@link grails.test.mixin.web.ControllerUnitTestMixin} for usage instructions
 */
@TestFor(UserService)
@Mock([User])
class UserServiceSpec extends Specification {

    def setup() {
    }

    def cleanup() {
    }

    void "save"() {
        given:
            def user = new User()
            user.age = 30
            user.nickname = "Jonny"
            user.username = "lee"
            user.save(flush: true)
            println user
        expect:
            println User.count() == 1
    }
}
