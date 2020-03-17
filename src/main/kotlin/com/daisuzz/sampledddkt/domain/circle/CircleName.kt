package com.daisuzz.sampledddkt.domain.circle

class CircleName private constructor(val value: String) {

    companion object {
        fun of(circleName: String): CircleName {
            require(circleName.length >= 3){ "サークル名は3文字以上" }
            require(circleName.length <= 20){ "サークル名は20文字以下" }

            return CircleName(circleName)
        }
    }
}
