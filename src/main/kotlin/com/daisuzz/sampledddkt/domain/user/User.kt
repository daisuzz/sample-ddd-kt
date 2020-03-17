package com.daisuzz.sampledddkt.domain.user

class User private constructor(val userId: UserId, val userName: UserName) {

    companion object{
        fun of(userName: String): User {
            return User(
                UserId(),
                UserName.of(userName)
            )
        }
    }
}
