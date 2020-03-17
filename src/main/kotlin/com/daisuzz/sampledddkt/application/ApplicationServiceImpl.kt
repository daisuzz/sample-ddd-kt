package com.daisuzz.sampledddkt.application

import com.daisuzz.sampledddkt.application.exception.ApplicationException
import com.daisuzz.sampledddkt.domain.circle.Circle
import com.daisuzz.sampledddkt.domain.circle.CircleRepository
import com.daisuzz.sampledddkt.domain.circle.CircleService
import com.daisuzz.sampledddkt.domain.user.User
import com.daisuzz.sampledddkt.domain.user.UserRepository
import com.daisuzz.sampledddkt.domain.user.UserService
import org.springframework.stereotype.Service

@Service
class ApplicationServiceImpl(
    private val userService: UserService,
    private val userRepository: UserRepository,
    private val circleService: CircleService,
    private val circleRepository: CircleRepository
) : ApplicationService{

    override fun registerUser(userName: String){

        val newUser = User.of(userName)
        if(userService.exists(newUser)){
            throw ApplicationException.DuplicatedUserNameException("ユーザ名が重複しています")
        }

        userRepository.register(newUser)
    }

    override fun registerCircle(circleName: String){

        val newCircle = Circle.of(circleName)
        if(circleService.exists(newCircle)){
            throw ApplicationException.DuplicatedCircleNameException("サークル名が重複しています")
        }

        circleRepository.register(newCircle)
    }
}
