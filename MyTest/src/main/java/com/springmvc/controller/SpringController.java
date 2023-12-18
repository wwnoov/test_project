package com.springmvc.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class SpringController {

  @RequestMapping(value = "/", method = RequestMethod.GET)
  public ModelAndView spring(Model model){
    ModelAndView mav = new ModelAndView();
    mav.addObject("subject", "풀스텍 3기");
    mav.addObject("name", "남원우");
    mav.setViewName("spring");
    return mav;
  }
}
