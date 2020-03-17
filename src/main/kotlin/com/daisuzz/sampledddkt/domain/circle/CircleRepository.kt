package com.daisuzz.sampledddkt.domain.circle

interface CircleRepository {

    fun register(circle: Circle)

    fun findBy(circleName: CircleName): Circle?

    fun findAll(): List<Circle>
}
