package edu.anudip.anudipLink.link;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AnudipWebLink {
	@RequestMapping(value = "/web", method = RequestMethod.GET)//This process get default
	public String demo1()//create method demo1
	{
		return "<body bgcolor='White' text='Black'><center><h1>Anudip Foundation WebLink</h1><h2> <a href=\"aln.anudip.org\">https:aln.anudip.org</a> </h2></center></body>";
	}
}
