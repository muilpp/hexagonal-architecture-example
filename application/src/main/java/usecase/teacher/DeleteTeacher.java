package usecase.teacher;


import entity.Teacher;
import port.teacher.TeacherRepository;

public class DeleteTeacher {
    TeacherRepository teacherRepository;

    public DeleteTeacher(TeacherRepository teacherRepository) {
        this.teacherRepository = teacherRepository;
    }

    public boolean delete(Teacher teacher) {
        return teacherRepository.deleteTeacher(teacher);
    }
}
