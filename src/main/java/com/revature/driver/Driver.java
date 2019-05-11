package com.revature.driver;



import org.apache.log4j.Logger;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.revature.model.SwapiPerson;
import com.revature.model.SwapiStarship;
import com.revature.service.UserService;
import com.revature.service.swapi.SwapiPersonService;
import com.revature.service.swapi.SwapiPersonServiceImpl;
import com.revature.service.swapi.SwapiStarshipService;
import com.revature.service.swapi.SwapiStarshipServiceImpl;

public class Driver {
	private static Logger logger = Logger.getLogger(Driver.class);
	public static void main(String[] args) {
		//HeroService heroService = new HeroServiceImpl();
		//ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
		//UserService userService = context.getBean("userService", UserService.class);
		//logger.trace((heroService.registerHero(new Hero(0, "Spiderman", "Spider-sense", false))) ? "Spiderman registered sucessfully":"Could not register Spiderman");
		//logger.trace((heroService.registerHero(new Hero(0, "Thor", "Lightning", true))) ? "Thor registered sucessfully":"Could not register Thor");
		//logger.trace((heroService.registerHero(new Hero(0, "Hulk", "Smash", false))) ? "Hulk registered sucessfully":"Could not register Hulk");
		//logger.trace((heroService.registerHero(new Hero(0, "Iron Man", "Rich", false))) ? "Iron Man registered sucessfully":"Could not register Iron Man");
		//logger.trace("Finding Hulk: " + heroService.getHero("Hulk"));
		//logger.trace("Finding Iron Man: " + heroService.getHero("Iron Man"));
		//logger.trace(userService.getAllUsers());
//		SwapiPersonService service = context.getBean(SwapiPersonServiceImpl.class);
//		SwapiPerson lukeSkywalker = service.findSwapiPersonByName(1);
//		System.out.println(lukeSkywalker);
	
		
		
	}
}
