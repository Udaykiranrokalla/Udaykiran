package data;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class DAC{
	@Autowired
	DataDao dao;

	@RequestMapping("/insertdata")    
    public String showform(Model m){    
        m.addAttribute("command", new Data());  
        return "insertdata";   
    }    
	@RequestMapping(value = "/save", method = RequestMethod.POST)
	public String save(@ModelAttribute("d") Data d) {
		dao.addData(d);
		return "Done";
	}
	@RequestMapping("/view")    
    public String viewemp(Model m){    
        List<Data> list=dao.getData();    
        m.addAttribute("list",list);  
        return "view";    
    }    
}