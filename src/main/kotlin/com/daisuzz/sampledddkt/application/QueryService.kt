package com.daisuzz.sampledddkt.application

import com.daisuzz.sampledddkt.domain.circle.Circle
import com.daisuzz.sampledddkt.domain.user.User

interface QueryService {

    fun getUsers(): List<User>

    fun getCircles(): List<Circle>
}
