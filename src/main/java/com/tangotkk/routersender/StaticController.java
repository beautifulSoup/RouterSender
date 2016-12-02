package com.tangotkk.routersender;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.Date;

/**
 * Created by kris on 16/12/2.
 */
@Controller
public class StaticController {

    @RequestMapping("/two")
    public String loadTwo(){
        return "/index.html";
    }

    @RequestMapping("/four")
    public String loadFour(){
        return "/fourPage.html";
    }

}
