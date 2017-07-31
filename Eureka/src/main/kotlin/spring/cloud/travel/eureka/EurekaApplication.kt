package spring.cloud.travel.eureka

import org.springframework.boot.SpringApplication
import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer

/**
 * Created by neng.liu@hand-china.com on 2017/7/28.
 */
@SpringBootApplication
@EnableEurekaServer
class EurekaApplication
fun main(args: Array<String>) {
    SpringApplication.run(EurekaApplication::class.java, *args)
}
