package com.rayed.portfolio;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

/**
 * Created by rayed on 4/29/17.
 */
@Controller
public class HomeController {

    @GetMapping(value = "/")
    public String getHomePage() {
        return "home";
    }
}
