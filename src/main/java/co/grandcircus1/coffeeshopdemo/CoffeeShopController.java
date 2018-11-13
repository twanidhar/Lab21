package co.grandcircus1.coffeeshopdemo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;


@Controller
public class CoffeeShopController {

	@Autowired
	private BakeryList list;
//	@Autowired
//	User user;
//	
	

	@RequestMapping("/")
	public ModelAndView index() {
		return new ModelAndView("home");

	}
	@RequestMapping("/forms")
	public ModelAndView showForms() {
		return new ModelAndView("forms");
	}

	@RequestMapping("/registration")
	public ModelAndView showRegistration(@RequestParam("FirstName") String FirstName , @RequestParam("LastName") String LastName,
			@RequestParam("Email") String Email,@RequestParam("PhoneNumber") String PhoneNumber, @RequestParam ("Password") String Password) {
		ModelAndView mv = new ModelAndView("registration");
		mv.addObject("FirstName", FirstName);
		mv.addObject("LastName", LastName);
		mv.addObject("Email", Email);
		mv.addObject("PhoneNumber", PhoneNumber);
		mv.addObject("Password", Password);
		return mv;
	}
	@RequestMapping("/BakeryList")//required=false, optional for the user and it's fine
	public ModelAndView showBakeryList(@RequestParam(name="category", required=false) String category) {
		ModelAndView mav = new ModelAndView("list-bakery");
		mav.addObject("BakeryItem", list.getList());
		return mav;

}}