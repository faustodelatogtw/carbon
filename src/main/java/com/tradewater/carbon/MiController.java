package com.tradewater.carbon;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;

@RestController
public class MiController {
    
    @RequestMapping("/api/hola")
    public String hola() {
        return "Hola amiga";
    }
    
    @RequestMapping("/api/chao")
    public String chao() {
        return "Nos vemos amiga";
    }
}