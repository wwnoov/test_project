package kr.co.chunjae.controller;


import kr.co.chunjae.dto.StudentDTO;
import kr.co.chunjae.service.StudentService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpSession;
import java.util.List;

@Controller
@RequiredArgsConstructor
@RequestMapping("/student")
public class StudentController {

  private final StudentService studentService;

  @GetMapping("/save")
  public String saveForm(){
    return "save";
  }

  @PostMapping("/save")
  public String save(@ModelAttribute StudentDTO studentDTO){
    int saveResult = studentService.save(studentDTO);
    if(saveResult > 0){
      return "redirect:/student/list";
    }else {
      return "save";
    }
  }

  @GetMapping("login")
  public String loginForm(){
    return "login";
  }

  @PostMapping("/login")
  public String login(@ModelAttribute StudentDTO studentDTO, HttpSession session){
    boolean loginResult  = studentService.login(studentDTO);
    if (loginResult){
      session.setAttribute("studentId", studentDTO.getStudentId());
      return "redirect:/student/list";
    }else {
      return "login";
    }
  }

  @GetMapping("/list")
  public String findAll(Model model){
    List<StudentDTO> studentDTOList = studentService.findAll();
    model.addAttribute("studentList", studentDTOList);
    return "index";
  }

  @GetMapping
  public String findById(@RequestParam("studentId") String studentId , Model model){
    StudentDTO studentDTO = studentService.findById(studentId);
    model.addAttribute("student",studentDTO);
    return "detail";
  }
  @GetMapping("/update")
  public String updateForm(@RequestParam("studentId") String studentId , Model model){
    StudentDTO studentDTO = studentService.findById(studentId);
    model.addAttribute("student",studentDTO);
    return "update";
  }

  @PostMapping("/update")
  public String update(@ModelAttribute StudentDTO studentDTO){
    boolean result = studentService.update(studentDTO);
    if(result){
      return "redirect:/student/list";
    }else {
      return "update";
    }
  }
  @GetMapping("/delete")
  public String delete(@RequestParam("studentId") String studentId){
    studentService.delete(studentId);
    return "redirect:/student/list";
  }
}