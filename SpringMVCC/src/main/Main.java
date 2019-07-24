package main;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class Main { 
@RequestMapping("/sai")  
    public String redirect()  
    {  
        return "Show";  
    }     

}

	


