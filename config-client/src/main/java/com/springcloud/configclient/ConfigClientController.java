package com.springcloud.configclient;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * ConfigClientController
 *
 * @author xcl
 * @date 2018/8/22 14:43
 */
@RestController
public class ConfigClientController {

    @Value("${from}")
    private String form;

    @GetMapping(value = "/from")
    public String form() {
        return form;
    }
}
