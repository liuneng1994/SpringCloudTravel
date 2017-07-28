package spring.cloud.travel.eureka

import org.springframework.boot.SpringApplication
import org.springframework.boot.autoconfigure.SpringBootApplication

/**
 * Created by neng.liu@hand-china.com on 2017/7/28.
 */
@SpringBootApplication
class EurekaApplication
fun main(args: Array<String>) {
    SpringApplication.run(EurekaApplication::class.java, *args)
}
