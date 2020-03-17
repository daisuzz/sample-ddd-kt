package com.daisuzz.sampledddkt.domain.user

interface UserService {

    fun exists(user: User): Boolean
}
