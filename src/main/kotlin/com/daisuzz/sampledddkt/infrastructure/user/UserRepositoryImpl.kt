package com.daisuzz.sampledddkt.infrastructure.user

import com.daisuzz.sampledddkt.domain.user.User
import com.daisuzz.sampledddkt.domain.user.UserName
import com.daisuzz.sampledddkt.domain.user.UserRepository
import org.springframework.stereotype.Repository
import java.util.*

@Repository
class UserRepositoryImpl : UserRepository {

    val map = mutableMapOf<UUID, User>()

    override fun register(user: User) {
        map[user.userId.value] = user
    }

    override fun findBy(userName: UserName): User? {
        return map.values.find { it.userName == userName }
    }

    override fun findAll(): List<User> {
        return map.values.toList()
    }
}
