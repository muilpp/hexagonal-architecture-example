package database;

import entity.Teacher;
import port.teacher.TeacherRepository;

import java.util.ArrayList;
import java.util.List;

public class InMemoryRepository implements TeacherRepository {
    private static final List<Teacher> inMemoryTeachers = new ArrayList<>();

    @Override
    public List<Teacher> findAll() {
        return inMemoryTeachers;
    }

    @Override
    public boolean create(Teacher teacher) {
        inMemoryTeachers.add(teacher);

        return inMemoryTeachers.contains(teacher);
    }

    @Override
    public boolean deleteTeacher(Teacher teacher) {
        inMemoryTeachers.remove(teacher);

        return inMemoryTeachers.contains(teacher);
    }
}
