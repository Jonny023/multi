package com.atgenee.core

import grails.converters.JSON
import groovy.util.logging.Slf4j

@Slf4j
class UserController {

//    static allowedMethods = [save: "POST"]

    def userService

    def index() {
        def result = userService.hello()
        log.error("hello,the world! {}",result)
        render result
    }


    def save() {
        println params
        println userService
        def info = [code:0, msg:"保存失败"]
        def user = userService.save(params)
        if(user) {
            info.code = 1
            info.msg = "保存成功"
            info.user = user
        }
        render info as JSON
    }

    def update() {
        def info = [code:0, msg:"保存失败"]
        def user = userService.update(params)
        if(user) {
            info.code = 1
            info.msg = "保存成功"
            info.user = user
        }
        render info as JSON
    }
}
