package controller;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class FirstController {
	
	@RequestMapping("first")
	//use @RequestParam instead of HttpServletRequest
	public ModelAndView getFromFrontEnd(@RequestParam("sid") String sid, @RequestParam("sname") String sname) {
		System.out.println(sid);
		Student s1 = new Student();
		s1.setSid(Integer.parseInt(sid));
		s1.setSname(sname);
		
		ModelAndView mv = new ModelAndView();
		mv.setViewName("display.jsp");
		mv.addObject("studentobj",s1);
		
		return mv;
		
	}
	
	@RequestMapping("second")
	public int getLogic() {
		return 0;
	}

}
