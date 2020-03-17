package com.daisuzz.sampledddkt.domain.user

interface UserRepository {

    fun register(user: User)

    fun findBy(userName: UserName): User?

    fun findAll(): List<User>
}
