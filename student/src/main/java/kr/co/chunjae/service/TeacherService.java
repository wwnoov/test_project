package kr.co.chunjae.service;

import kr.co.chunjae.dto.StudentDTO;
import kr.co.chunjae.dto.TeacherDTO;
import kr.co.chunjae.repository.StudentRepository;
import kr.co.chunjae.repository.TeacherRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class TeacherService {
  private final TeacherRepository teacherRepository; // 필드 생성자 주입

  public boolean login(TeacherDTO teacherDTO) {
    TeacherDTO loginTeacher = teacherRepository.login(teacherDTO);
    if(loginTeacher != null){
      return true;
    }else{
      return false;
    }
  }

}
