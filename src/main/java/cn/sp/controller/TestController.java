package cn.sp.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author Ship
 * @date 2020-04-20 18:01
 */
@RestController
@RequestMapping("test")
@RefreshScope
public class TestController {

    @Value("${test.enabled}")
    private boolean testEnabled;

    @GetMapping
    public String test() {
        return testEnabled + "";
    }
}
