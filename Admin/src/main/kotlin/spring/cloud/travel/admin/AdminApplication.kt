package spring.cloud.travel.admin

import de.codecentric.boot.admin.config.EnableAdminServer
import org.springframework.boot.SpringApplication
import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.cloud.netflix.eureka.EnableEurekaClient

/**
 * Created by neng.liu@hand-china.com on 2017/7/29.
 */
@EnableAdminServer
@EnableEurekaClient
@SpringBootApplication
class AdminApplication

fun main(args: Array<String>) {
    SpringApplication.run(AdminApplication::class.java)
}