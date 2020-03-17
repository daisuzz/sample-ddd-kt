package com.daisuzz.sampledddkt

import com.daisuzz.sampledddkt.application.ApplicationService
import com.daisuzz.sampledddkt.application.QueryService
import org.springframework.boot.CommandLineRunner
import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
class SampleDddKtApplication(
    private val applicationService: ApplicationService,
    private val queryService: QueryService
) : CommandLineRunner {

    override fun run(vararg args: String?) {

        applicationService.registerUser("Taro")
        applicationService.registerCircle("Rugby")

        val users = queryService.getUsers()
        val circles = queryService.getCircles()

        println(users.joinToString(","))
        println(circles.joinToString(","))
    }
}

fun main(args: Array<String>) {
    runApplication<SampleDddKtApplication>(*args)
}
