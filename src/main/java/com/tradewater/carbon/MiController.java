package com.tradewater.carbon;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;

@RestController
public class MiController {
    
    @RequestMapping("/api/hola")
    public String hola() {
        return "Hola amigaaaaa";
    }
    
    @RequestMapping("/api/chao")
    public String chao() {
        return "Nos vemos amigaaaaa";
    }
    
    @RequestMapping("/api/hastapronto")
    public String hastapronto() {
        return "Hasta pronto amigaaaaa";
    }
}