package fr.sop.pha.webapp.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.Controller;

public class IndexController implements Controller {

	@Override
	public ModelAndView handleRequest(HttpServletRequest request, HttpServletResponse response) throws Exception {
		ModelAndView mav = new ModelAndView();
		mav.addObject("greeting", "sophie");
		mav.setViewName("index");
		return mav;
	}

}

//@Controller
//@RequestMapping("/")
//public class IndexController {
// 
//    @RequestMapping(method = RequestMethod.GET)
//    public String sayHello(ModelMap model) {
//        model.addAttribute("greeting", "Hello World from Spring 4 MVC");
//        return "welcome";
//    }
// 
//    @RequestMapping(value="/helloagain", method = RequestMethod.GET)
//    public String sayHelloAgain(ModelMap model) {
//        model.addAttribute("greeting", "Hello World Again, from Spring 4 MVC");
//        return "welcome";
//    }
// 
//}
