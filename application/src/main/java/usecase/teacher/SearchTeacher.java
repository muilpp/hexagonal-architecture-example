package usecase.teacher;


import entity.Teacher;
import port.teacher.TeacherRepository;
import java.util.List;

public class SearchTeacher {
    TeacherRepository teacherRepository;

    public SearchTeacher(TeacherRepository teacherRepository) {
        this.teacherRepository = teacherRepository;
    }

    public List<Teacher> search() {
        return teacherRepository.findAll();
    }
}
