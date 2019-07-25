package demo;
import org.springframework.stereotype.Controller;


import org.springframework.web.bind.annotation.RequestMapping;

@Controller  
public class Test {  
@RequestMapping("/hi")  
    public String redirect()  
    {  
        return "Hello";  
    }     

}  

