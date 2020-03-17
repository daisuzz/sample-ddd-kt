package com.daisuzz.sampledddkt.domain.circle

import java.util.*

data class CircleId private constructor(val value: UUID){

    constructor(): this(UUID.randomUUID())
}
