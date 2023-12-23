package kr.co.chunjae.controller;
import kr.co.chunjae.dto.StudentDTO;
import kr.co.chunjae.service.StudentService;
import lombok.RequiredArgsConstructor;
import org.checkerframework.checker.units.qual.A;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;

@Controller
@RequiredArgsConstructor
public class HomeController {

	private final StudentService studentService;

	@GetMapping({"/","index"})
	public String index(Model model){
		List<StudentDTO> studentDTOList = studentService.findAll();
		model.addAttribute("studentList", studentDTOList);
		return "index";
	}
}