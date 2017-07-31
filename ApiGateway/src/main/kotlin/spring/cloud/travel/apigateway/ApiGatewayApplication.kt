package spring.cloud.travel.apigateway

import org.springframework.boot.SpringApplication
import org.springframework.cloud.client.SpringCloudApplication
import org.springframework.cloud.netflix.zuul.EnableZuulServer

/**
 * Created by neng.liu@hand-china.com on 2017/7/29.
 */
@SpringCloudApplication
@EnableZuulServer
class ApiGatewayApplication

fun main(args: Array<String>) {
    SpringApplication.run(ApiGatewayApplication::class.java)
}