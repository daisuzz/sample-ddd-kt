package com.daisuzz.sampledddkt.application.exception

import java.lang.RuntimeException

sealed class ApplicationException(message: String): RuntimeException(message){

    class DuplicatedUserNameException(message: String): ApplicationException(message)

    class DuplicatedCircleNameException(message: String): ApplicationException(message)
}
