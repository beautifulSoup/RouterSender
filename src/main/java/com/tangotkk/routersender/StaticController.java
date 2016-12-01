package com.tangotkk.routersender;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by kris on 16/12/1.
 */
@Controller
public class StaticController  {


    @RequestMapping("/index")
    public String indexPage(){
        return "index.html";
    }


}
