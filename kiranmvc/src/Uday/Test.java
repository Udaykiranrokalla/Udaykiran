package Uday;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller  
public class Test {  
@RequestMapping("/test2")  
    public String view()  
    {  
        return "test";  
    }     

}  
