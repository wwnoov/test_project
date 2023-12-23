//package kr.co.chunjae.controller;
//
//
//import kr.co.chunjae.dto.MemberDTO;
//import kr.co.chunjae.service.MemberService;
//import lombok.RequiredArgsConstructor;
//import lombok.extern.log4j.Log4j2;
//import org.springframework.stereotype.Controller;
//import org.springframework.ui.Model;
//import org.springframework.web.bind.annotation.*;
//
//import javax.servlet.http.HttpSession;
//import java.util.List;
//
//@Log4j2
//@Controller
//@RequestMapping("/member")
//@RequiredArgsConstructor
//public class MemberController {
//
//  private final MemberService memberService;
//
//  @GetMapping("/save")
//  public String saveForm() {
//    return "save";
//  }
//
//  @PostMapping("/save")
//  public String save(@ModelAttribute MemberDTO memberDTO) {
//    int saveResult = memberService.save(memberDTO);
//    if (saveResult > 0) {
//      return "login";
//    } else {
//      return "save";
//    }
//  }
//
//  @GetMapping("login")
//  public String loginForm() {
//    return "login";
//  }
//
//  @PostMapping("/login")
//  public String login(@ModelAttribute MemberDTO memberDTO, HttpSession session) {
//    boolean loginResult = memberService.login(memberDTO);
//    if (loginResult) {
//      session.setAttribute("loginEmail", memberDTO.getMemberEmail());
//      return "main";
//    } else {
//      return "login2";
//    }
//
//  }
//
//  @GetMapping("/")
//  public String findAll(Model model) {
//    List<MemberDTO> memberDTOList = memberService.findAll();
//    model.addAttribute("memberList", memberDTOList);
//    return "list";
//  }
//
//  @GetMapping
//  public String findById(@RequestParam("id") Long id, Model model) {
//    MemberDTO memberDTO = memberService.findById(id);
//    model.addAttribute("member", memberDTO);
//    return "detail";
//  }
//
//  //수정 변경화면 요청
//  @GetMapping("/update")
//  public String updateForm(HttpSession session, Model model) {
//
//    // 세션에 저장된 나의 이메일 가져오기
//    String loginEmail = (String) session.getAttribute("loginEmail");
//    MemberDTO memberDTO = memberService.findByMemberEmail(loginEmail);
//    model.addAttribute("member",memberDTO);
//    return "update";
//  }
//  //수정
//  @PostMapping("/update")
//  public String update(@ModelAttribute MemberDTO memberDTO ) {
//    boolean result = memberService.update(memberDTO);
//
//    if (result) {
//      return "redirect:/member?id="+memberDTO.getId();
//    } else {
//      return "index";
//    }
//  }
////삭제
//  @GetMapping("/deleteId")
//  public String deleteId(@RequestParam("id") Long id) {
//    memberService.deleteId(id);
//    return "redirect:/member/";
//
//  }
//
//  @PostMapping("/email-check")
//  public @ResponseBody String emailCheck(@RequestParam("memberEmail") String memberEmail){
//    String checkResult = memberService.emailCheck(memberEmail);
//    return checkResult;
//  }
//}
//
