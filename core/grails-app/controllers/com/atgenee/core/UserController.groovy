package com.atgenee.core

import groovy.util.logging.Slf4j

@Slf4j
class UserController {

    def userService

    def index() {
        def result = userService.hello()
        log.error("hello,the world! {}",result)
        render result
    }
}
