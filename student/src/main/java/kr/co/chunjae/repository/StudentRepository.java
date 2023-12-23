package kr.co.chunjae.repository;

import kr.co.chunjae.dto.StudentDTO;
import lombok.RequiredArgsConstructor;
import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
@RequiredArgsConstructor
public class StudentRepository {

  private final SqlSessionTemplate sql;


  public int save(StudentDTO studentDTO) {
    return sql.insert("Student.save", studentDTO);
  }

  public StudentDTO login(StudentDTO studentDTO) {
  return sql.selectOne("Student.login",studentDTO);
  }

  public List<StudentDTO> findAll() {
    return sql.selectList("Student.findAll");
  }

  public StudentDTO idCheck(String studentId) {
    return sql.selectOne("Student.findById",studentId);
  }

  public int update(StudentDTO studentDTO) {
    return sql.update("Student.update",studentDTO);
  }

  public StudentDTO findById(String studentId) {
    return sql.selectOne("Student.findById",studentId);
  }

  public void delete(String studentId) {
    sql.delete(("Student.delete"),studentId);
  }
}
