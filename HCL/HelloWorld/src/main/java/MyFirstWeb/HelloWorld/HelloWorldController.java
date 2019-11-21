package MyFirstWeb.HelloWorld;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;
@Controller
public class HelloWorldController {
	@RequestMapping("/hello")
public ModelAndView helloWorld(){
		
	return new ModelAndView("result","message","welcome to Spring 3.0");
}
	@RequestMapping("/bhargav")
public ModelAndView bhargav(){
	return new ModelAndView("result","message","Bhargav Welcomes us");
}
}
