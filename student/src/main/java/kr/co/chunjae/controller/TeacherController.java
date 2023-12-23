package kr.co.chunjae.controller;


import kr.co.chunjae.dto.StudentDTO;
import kr.co.chunjae.dto.TeacherDTO;
import kr.co.chunjae.service.StudentService;
import kr.co.chunjae.service.TeacherService;
import lombok.RequiredArgsConstructor;
import lombok.extern.log4j.Log4j2;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpSession;

@Log4j2
@Controller
@RequestMapping("/teacher")
@RequiredArgsConstructor
public class TeacherController {

  private final TeacherService teacherService;



  @GetMapping("login")
  public String loginForm() {
    return "login";
  }

  @PostMapping("/login")
  public String login(@ModelAttribute TeacherDTO teacherDTO, HttpSession session) {
    boolean loginResult = teacherService.login(teacherDTO);
    if (loginResult) {
      session.setAttribute("loginId", teacherDTO.getId());
      return "index";
    } else {
      return "login2";
    }

  }

}

