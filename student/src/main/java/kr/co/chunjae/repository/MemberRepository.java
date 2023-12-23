//package kr.co.chunjae.repository;
//
//import kr.co.chunjae.dto.MemberDTO;
//import lombok.RequiredArgsConstructor;
//import org.mybatis.spring.SqlSessionTemplate;
//import org.springframework.stereotype.Repository;
//
//import java.util.List;
//
//@Repository
//@RequiredArgsConstructor
//public class MemberRepository {
//
//  private final SqlSessionTemplate sql;
//
//
//  public int save(MemberDTO memberDTO) {
//    System.out.println(memberDTO);
//    return sql.insert("Member.save", memberDTO);
//  }
//
//  public MemberDTO login(MemberDTO memberDTO) {
//  return sql.selectOne("Member.login",memberDTO);
//  }
//
//  public List<MemberDTO> findAll() {
//    return sql.selectList("Member.findAll");
//  }
//
//  public MemberDTO findById(Long id) {
//    return sql.selectOne("Member.findById",id);
//  }
//
//  public int update(MemberDTO memberDTO) {
//    return sql.update("Member.update",memberDTO);
//  }
//
//  public void deleteId(Long id){
//    sql.delete(("Member.deleteId"),id);
//  }
//
//  public MemberDTO findByMemberEmail(String loginEmail) {
//    return sql.selectOne("Member.findByMemberEmail",loginEmail);
//  }
//
//}
