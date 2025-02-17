package com.example.demo.controller;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HomeController{

  @GetMapping("/reserve")
   public String showReservePage() {
	  return "reserve";
  }
	  @GetMapping("/plans")
		  public String showPlansPage() {
		  return "plans";
	  }
	  @GetMapping("/about")
	  public String showAboutPage() {
		  return "about";
	  }
}
  

