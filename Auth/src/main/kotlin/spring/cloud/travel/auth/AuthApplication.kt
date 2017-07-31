package spring.cloud.travel.auth

import org.springframework.boot.SpringApplication
import org.springframework.boot.autoconfigure.security.oauth2.client.EnableOAuth2Sso
import org.springframework.cloud.client.SpringCloudApplication

/**
 * Created by neng.liu@hand-china.com on 2017/7/31.
 */
@SpringCloudApplication
@EnableOAuth2Sso
class AuthApplication

fun main(args: Array<String>) {
    SpringApplication.run(AuthApplication::class.java, *args)
}

