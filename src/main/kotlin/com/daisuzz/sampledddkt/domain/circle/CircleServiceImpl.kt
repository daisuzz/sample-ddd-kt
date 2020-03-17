package com.daisuzz.sampledddkt.domain.circle

import org.springframework.stereotype.Service

@Service
class CircleServiceImpl(private val circleRepository: CircleRepository) : CircleService {

    override fun exists(circle: Circle): Boolean {
        val duplicatedCircle = circleRepository.findBy(circle.circleName)
        return duplicatedCircle != null
    }
}
