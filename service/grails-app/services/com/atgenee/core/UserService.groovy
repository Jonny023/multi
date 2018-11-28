package com.atgenee.core

import grails.transaction.Transactional

@Transactional
class UserService {

    def hello() {
        "Hi，call the UserService."
    }
}
