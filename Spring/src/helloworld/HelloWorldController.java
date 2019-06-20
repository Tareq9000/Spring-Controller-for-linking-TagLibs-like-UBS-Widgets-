package helloworld;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping("/HelloWorld.htm")
public class HelloWorldController {
	@RequestMapping(method = { RequestMethod.GET, RequestMethod.POST})
	
	public ModelAndView handleRequest(HttpServletRequest request, HttpServletResponse response) throws Exception{
		
		ModelAndView modelAndView = new ModelAndView("/jsp/HelloWorld.jsp");
		
		return modelAndView;
	}
}
