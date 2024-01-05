package kr.co.chunjae.service;


import kr.co.chunjae.dto.StudentDTO;
import kr.co.chunjae.repository.StudentRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class StudentService {

  private final StudentRepository studentRepository;

  public int save(StudentDTO studentDTO) {
    return studentRepository.save(studentDTO);
  }

  public boolean login(StudentDTO studentDTO) {
    StudentDTO loginStudent = studentRepository.login(studentDTO);
    if (loginStudent !=null){
      return true;
    }else {
      return false;
    }
  }

  public List<StudentDTO> findAll() {
    return studentRepository.findAll();
  }

  public StudentDTO findById(String studentId) {
    return studentRepository.findById(studentId);
  }

  public boolean update(StudentDTO studentDTO) {
    int result =  studentRepository.update(studentDTO);
    if (result >0 ){
      return true;
    }else {
      return false;
    }
  }

  public void delete(String studentId) {
    studentRepository.delete(studentId);
  }
}
