package com.daisuzz.sampledddkt.domain.user

class UserName private constructor(val value: String) {

    companion object{
        fun of(userName: String): UserName {
            require(userName.length >= 3){"ユーザ名は3文字以上です"}
            require(userName.length <= 10){"ユーザ名は10文字以下です"}
            return UserName(userName)
        }
    }
}
