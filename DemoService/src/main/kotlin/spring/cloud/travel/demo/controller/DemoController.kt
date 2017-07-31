package spring.cloud.travel.demo.controller

import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.PathVariable
import org.springframework.web.bind.annotation.RestController

/**
 * Created by neng.liu@hand-china.com on 2017/7/30.
 */
@RestController
class DemoController {
    @GetMapping("/demo/hello/{name}")
    fun hello(@PathVariable(name = "name") name: String): String {
        return "hello $name"
    }
}