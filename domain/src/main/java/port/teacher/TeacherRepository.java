package port.teacher;

import entity.Teacher;

import java.util.List;

public interface TeacherRepository {
    List<Teacher> findAll();
    boolean create(Teacher teacher);
    boolean deleteTeacher(Teacher teacher);
}
