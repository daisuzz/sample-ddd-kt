package com.daisuzz.sampledddkt.domain.user

import org.springframework.stereotype.Service

@Service
class UserServiceImpl(private val userRepository: UserRepository) : UserService {

    override fun exists(user: User): Boolean {
        val result = userRepository.findBy(user.userName)
        return result != null
    }
}
