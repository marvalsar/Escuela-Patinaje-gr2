package com.escuela1.v1.Controller;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;



@Controller
@RequestMapping("/")


public class index {

    @GetMapping({"", "/", "index"})
    public String index(){
        return "index";
    }
    
    @GetMapping("/mision")
    public String mision(){
        return "mision";
    }

    @GetMapping("/vision")
    public String vision(){
        return "vision";
    }

    @GetMapping("/historia")
    public String historia(){
        return "historia";
    }
    
    @GetMapping("/valores")
    public String valores(){
        return "valores";
    }

    @GetMapping("/servicios")
    public String servicios(){
        return "servicios";
    }

    @GetMapping("/eventos")
    public String eventos(){
        return "eventos";
    }

}
