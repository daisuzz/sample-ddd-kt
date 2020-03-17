package com.daisuzz.sampledddkt.domain.user

import java.util.*

data class UserId private constructor(val value: UUID){

    constructor():this(UUID.randomUUID())
}
