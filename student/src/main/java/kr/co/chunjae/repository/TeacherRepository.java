package kr.co.chunjae.repository;

import kr.co.chunjae.dto.TeacherDTO;
import lombok.RequiredArgsConstructor;
import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.stereotype.Repository;

@Repository
@RequiredArgsConstructor
public class TeacherRepository {

  private final SqlSessionTemplate sql;



  public TeacherDTO login(TeacherDTO teacherDTO) {
  return sql.selectOne("Teacher.login",teacherDTO);
  }

}
