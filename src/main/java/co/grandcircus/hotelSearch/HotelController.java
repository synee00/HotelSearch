package co.grandcircus.hotelSearch;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import co.grandcircus.hotelSearch.dao.HotelDao;
import co.grandcircus.hotelSearch.entity.Hotel;

@Controller
public class HotelController {
	
	@Autowired
	private HotelDao hotelDao;
	
	@RequestMapping("/")
	public ModelAndView showHomePage()
	{
		ModelAndView mav = new ModelAndView ("index");
		//List<String> cities= hotelDao.findAllCities();
		//mav.addObject("cities", cities);
		return mav;
	}
	
	
	@RequestMapping("/results")
	public ModelAndView showResults(@RequestParam("city") String city)
	{
		ModelAndView mav = new ModelAndView("results");
		List<Hotel> hotel = hotelDao.findByCity(city);
		System.out.println();
		mav.addObject("hotels", hotel);
		return mav;
		
	}

}
