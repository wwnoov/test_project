package com.springmvc.chap08;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class LoginController {
  @GetMapping("/login")
  public  String login(){
    return "login";
  }

  @GetMapping("/loginfailed")
  public  String loginerror(Model model){
    model.addAttribute("error", "true");
    return "login";
  }

  @GetMapping("/mymber")
  public String requestMethod2(Model model) {
    return  "webpage08_04";
  }

  @GetMapping("/myany")
  public String requestMethod3(Model model) {  return  "webpage08_03"; }

}