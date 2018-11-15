package co.grandcircus1.coffeeshopdemo;

import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CookieValue;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class CoffeeShopController {

//	@Autowired
//	private BakeryList list;
//	@Autowired
//	User user;
//	
	@Autowired
	BakeryItemDao bakeryDao;

	@RequestMapping("/")
	public ModelAndView index() {
		return new ModelAndView("home");

	}

	@RequestMapping("/forms")
	public ModelAndView showForms() {
		return new ModelAndView("forms");
	}

	@RequestMapping("/registration")
	public ModelAndView showRegistration(@RequestParam("FirstName") String FirstName,
			@RequestParam("LastName") String LastName, @RequestParam("Email") String Email,
			@RequestParam("PhoneNumber") String PhoneNumber, @RequestParam("Password") String Password) {
		ModelAndView mv = new ModelAndView("registration");
		mv.addObject("FirstName", FirstName);
		mv.addObject("LastName", LastName);
		mv.addObject("Email", Email);
		mv.addObject("PhoneNumber", PhoneNumber);
		mv.addObject("Password", Password);
		return mv;
	}

	@RequestMapping("/admin/menu") // required=false, optional for the user and it's fine
	public ModelAndView showBakeryList(@RequestParam(name = "category", required = false) String category) {
		ModelAndView mav = new ModelAndView("admin");
		mav.addObject("BakeryItem", bakeryDao.findAll());
		return mav;
	}

	@RequestMapping("/admin/edit?")
	public ModelAndView showEdit(BakeryItem food) {
		ModelAndView mav1 = new ModelAndView("edit");
		bakeryDao.edit(food);
		return mav1;

	}

	@RequestMapping("admin/add-bakery")
	public ModelAndView showAddBakery(BakeryItem food) {
		ModelAndView mav2 = new ModelAndView("addbakery");// receiving form
		bakeryDao.create(food);
		mav2.addObject("BakeryItem", bakeryDao.findAll());

		return mav2;
	}

	@RequestMapping("/admin/add-bakery-form")
	public ModelAndView showAddBakeryForm() {// showing the form
		return new ModelAndView("addbakery");

	}

	@RequestMapping("/cart")
	public ModelAndView add(HttpServletResponse response,
			@CookieValue(name = "cart", defaultValue = "0") Integer oldCount) {
		Integer newCount = oldCount + 1;

		// Set cookie
		Cookie cookie = new Cookie("cart", newCount.toString());
//		cookie.setMaxAge(2 * 60); // 2 minutes
		response.addCookie(cookie);

		return new ModelAndView("cart");
	}
}