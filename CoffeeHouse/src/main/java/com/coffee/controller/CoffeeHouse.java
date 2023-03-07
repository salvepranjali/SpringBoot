package com.coffee.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.coffee.entity.Coffee;
@RestController
public class CoffeeHouse {

	//creating the list
			private List<Coffee> coffee = new ArrayList<>();

			public CoffeeHouse()
			
			//Adding coffee to the List
			{
			
				coffee.addAll(List.of(new Coffee(200, " Espresso"), new Coffee(300, "Iced"), new Coffee(450, " Black Coffee"),
						new Coffee(500, "Latte"), new Coffee(350, "Brewed coffee"), new Coffee(550, "Mocha")));
				
			}
			//To display all the coffee in the list
			@RequestMapping(value = "/coffee", method = RequestMethod.GET)
			Iterable<Coffee> getAllLeds()
			{
				return coffee;
			}

			}






