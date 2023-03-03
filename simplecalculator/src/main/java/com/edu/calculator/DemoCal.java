package com.edu.calculator;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import Calculator1.Calciop;
@RestController
public class DemoCal 
{
	@GetMapping("/calculator/add")//it is use to get the request for the specific method
	public String calculate(@RequestParam(value="n1",required= true,defaultValue="1")int n1,
			@RequestParam(value="n2",required= true,defaultValue="2" )int n2)//it is a calculate method is use for the take the parameter.
	{
		return "<h1>The Addition is: "+ Calciop.addNum(n1, n2)+"</h1>";//call the addNum method by using Calciop class
	}
	

	@GetMapping("/calculator/sub")//it is use to get the request for the specific method
	public String calculate1(@RequestParam(value="n1",required= true,defaultValue="1")int n1,
			@RequestParam(value="n2",required= true,defaultValue="2" )int n2)//it is a calculate1 method is use for the take the parameter.
	{
		return "<h1>The Substraction  is: "+ Calciop.subNum(n1, n2)+"</h1>";//call the subNum method by using Calciop class
	}
	
	@GetMapping("/calculator/mul")//it is use to get the request for the specific method
	public String calculate2(@RequestParam(value="n1",required= true,defaultValue="1")int n1,
			@RequestParam(value="n2",required= true,defaultValue="2" )int n2)//it is a calculate2 method is use for the take the parameter.
	{
		return "<h1>The Multiplication is: "+ Calciop.mulNum(n1, n2)+"</h1>";//call the mulNum method by using Calciop class
	}
	
	@GetMapping("/calculator/div")//it is use to get the request for the specific method
	public String calculate3(@RequestParam(value="n1",required= true,defaultValue="1")int n1,
			@RequestParam(value="n2",required= true,defaultValue="2" )int n2)//it is a calculate3 method is use for the take the parameter.
	{
		return "<h1>The Division is: "+ Calciop.divNum(n1, n2)+"</h1>";//call the divNum method by using Calciop class
	}

}
