package kr.co.chunjae.service;

import kr.co.chunjae.dto.StudentDTO;
import kr.co.chunjae.repository.StudentRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class StudentService {
  private final StudentRepository studentRepository; // 필드 생성자 주입

  public int save(StudentDTO studentDTO) {
    return studentRepository.save(studentDTO);
  }

  public List<StudentDTO> findAll() {
    return studentRepository.findAll();
  }

  public String idCheck(String studentId) {
    StudentDTO studentDTO = studentRepository.idCheck(studentId);
    if (studentDTO == null){
      return "ok";
    }else {
      return "no";
    }
  }
  public StudentDTO findById(String studentId) {
    return studentRepository.findById(studentId);
  }

  public boolean update(StudentDTO studentDTO) {
    int result = studentRepository.update(studentDTO);
    if (result>0){
      return true;
    }else {
      return false;
    }
  }

  public void delete(String studentId) {
    studentRepository.delete(studentId);
  }
}
