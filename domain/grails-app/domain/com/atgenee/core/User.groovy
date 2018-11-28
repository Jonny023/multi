package com.atgenee.core

class User {

    String username
    String nickname
    Integer age

    static constraints = {

    }


    @Override
    public String toString() {
        return "User{" +
                "username='" + username + '\'' +
                ", nickname='" + nickname + '\'' +
                ", age=" + age +
                '}';
    }
}
