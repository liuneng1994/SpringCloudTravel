package spring.cloud.travel.demo

import org.springframework.boot.SpringApplication
import org.springframework.cloud.client.SpringCloudApplication

/**
 * Created by neng.liu@hand-china.com on 2017/7/30.
 */
@SpringCloudApplication
class DemoApplication

fun main(args: Array<String>) {
    SpringApplication.run(DemoApplication::class.java)
}