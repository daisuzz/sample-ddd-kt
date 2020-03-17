package com.daisuzz.sampledddkt.application

import com.daisuzz.sampledddkt.domain.circle.Circle
import com.daisuzz.sampledddkt.domain.circle.CircleRepository
import com.daisuzz.sampledddkt.domain.user.User
import com.daisuzz.sampledddkt.domain.user.UserRepository
import org.springframework.stereotype.Service

@Service
class QueryServiceImpl(
    private val userRepository: UserRepository,
    private val circleRepository: CircleRepository
) : QueryService {

    override fun getUsers(): List<User> {
        return userRepository.findAll()
    }

    override fun getCircles(): List<Circle> {
        return circleRepository.findAll()
    }
}
