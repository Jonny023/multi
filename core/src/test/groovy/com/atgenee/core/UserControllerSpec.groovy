package com.atgenee.core

import grails.test.mixin.Mock
import grails.test.mixin.TestFor
import spock.lang.Specification

/**
 * See the API for {@link grails.test.mixin.web.ControllerUnitTestMixin} for usage instructions
 */
@TestFor(UserController)
@Mock([UserService,User])
//@Integration
class UserControllerSpec extends Specification {

    def setup() {
    }

    def cleanup() {
    }

    void "test something"() {
        given:
            def uc = new UserController()
            uc.index()
    }

    void "save"() {
        given:
            def user = new User()
            user.age=30
            user.nickname="Jonny"
            user.username="lee"
            user.save(flush:true)
        expect:
            User.count() == 1
    }
}
