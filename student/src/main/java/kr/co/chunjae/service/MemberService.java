//package kr.co.chunjae.service;
//
//import kr.co.chunjae.dto.MemberDTO;
//import kr.co.chunjae.repository.MemberRepository;
//import lombok.RequiredArgsConstructor;
//import org.springframework.stereotype.Service;
//
//import java.util.List;
//
//@Service
//@RequiredArgsConstructor
//public class MemberService {
//  private final MemberRepository memberRepository; // 필드 생성자 주입
//
//  public int save(MemberDTO memberDTO) {
//    return memberRepository.save(memberDTO);
//  }
//  public boolean login(MemberDTO memberDTO) {
//    MemberDTO loginMember = memberRepository.login(memberDTO);
//    if(loginMember != null){
//      return true;
//    }else{
//      return false;
//    }
//  }
//
//  public List<MemberDTO> findAll() {
//    return memberRepository.findAll();
//  }
//
//  public MemberDTO findById(long id) {
//    return memberRepository.findById(id);
//  }
//
//  public boolean update(MemberDTO memberDTO) {
//    int result = memberRepository.update(memberDTO);
//    if (result>0){
//      return true;
//    }else {
//      return false;
//    }
//  }
//
//
//  public void deleteId(long id){
//    memberRepository.deleteId(id);
//  }
//
//  public MemberDTO findByMemberEmail(String loginEmail) {
//    return memberRepository.findByMemberEmail(loginEmail);
//  }
//
//  public String emailCheck(String memberEmail){
//    MemberDTO memberDTO = memberRepository.findByMemberEmail(memberEmail);
//    if (memberDTO == null) {
//      System.out.println("이메일중복x");
//      return "ok";
//    }else{
//      System.out.println("이메일중복x");
//      return "no";
//      }
//    }
//}
