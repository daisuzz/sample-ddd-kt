package com.daisuzz.sampledddkt.domain.circle

class Circle private constructor(val circleId: CircleId, val circleName: CircleName) {

    companion object {
        fun of(circleName: String): Circle {
            return Circle(
                CircleId(),
                CircleName.of(circleName)
            )
        }
    }
}
