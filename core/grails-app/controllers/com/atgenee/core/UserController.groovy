package com.atgenee.core

class UserController {

    def userService

    def index() {
        render userService.hello()
    }
}
