package com.daisuzz.sampledddkt.infrastructure.circle

import com.daisuzz.sampledddkt.domain.circle.Circle
import com.daisuzz.sampledddkt.domain.circle.CircleName
import com.daisuzz.sampledddkt.domain.circle.CircleRepository
import org.springframework.stereotype.Repository
import java.util.*

@Repository
class CircleRepositoryImpl : CircleRepository {

    val map = mutableMapOf<UUID, Circle>()

    override fun findAll(): List<Circle> {
        return map.values.toList()
    }

    override fun register(circle: Circle) {
        map[circle.circleId.value] = circle
    }

    override fun findBy(circleName: CircleName): Circle? {
        return map.values.find { it.circleName == circleName }
    }
}
