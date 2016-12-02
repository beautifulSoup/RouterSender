package com.tangotkk.routersender;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by kris on 16/12/1.
 */
@RestController
public class RouterController {
    static Map<String, String> routerMaps = new HashMap<>();

    static {
        routerMaps.put("main:one", "dynamic://three");
        routerMaps.put("main:two", "dynamicWeb://two");
        routerMaps.put("two:one", "http://www.baidu.com");
        routerMaps.put("three:one", "dynamic://four");
    }

    @RequestMapping("/router")
    public Map<String, String> sendRouter(){
        return routerMaps;
    }
}
