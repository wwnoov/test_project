package kr.co.chunjae.controller;


import kr.co.chunjae.dto.StudentDTO;
import kr.co.chunjae.service.StudentService;
import lombok.RequiredArgsConstructor;
import lombok.extern.log4j.Log4j2;
import org.springframework.stereotype.Controller;
import org.springframework.stereotype.Repository;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpSession;
import java.util.List;

@Log4j2
@Controller
@RequestMapping("/student")
@RequiredArgsConstructor
public class StudentController {

  private final StudentService studentService;

  @GetMapping("/save")
  public String saveForm() {
    return "save";
  }

  @PostMapping("/save")
  public String save(@ModelAttribute StudentDTO studentDTO) {
    int saveResult = studentService.save(studentDTO);
    if (saveResult > 0) {
      return "redirect:/student/list";
    } else {
      return "save";
    }
  }

  @GetMapping("/list")
  public String findAll(Model model) {
    List<StudentDTO> studentDTOList = studentService.findAll();
    model.addAttribute("studentList", studentDTOList);
    return "index";
  }

  @GetMapping
  public String findById(@RequestParam("studentId") String studentId, Model model) {
    StudentDTO studentDTO = studentService.findById(studentId);
    model.addAttribute("student", studentDTO);
    return "detail";
  }

  @PostMapping("/id-check")
  public @ResponseBody String idCheck(@RequestParam("studentId") String studentId){
    String checkResult = studentService.idCheck(studentId);
    return checkResult;
  }

    //수정 변경화면 요청
  @GetMapping("/update")
  public String updateForm(@RequestParam("studentId") String studentId, Model model) {
    StudentDTO studentDTO = studentService.findById(studentId);
    model.addAttribute("student", studentDTO);
    return "update";
  }
  //수정
  @PostMapping("/update")
  public String update(@ModelAttribute StudentDTO studentDTO ) {
    boolean result = studentService.update(studentDTO);

    if (result) {
      return "redirect:/student?studentId="+studentDTO.getStudentId();
    } else {
      return "index";
    }
  }

  @GetMapping("/delete")
  public String delete(@RequestParam("studentId") String studentId) {
    studentService.delete(studentId);
    return "redirect:/student/list";

  }
}

