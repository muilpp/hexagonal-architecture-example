package usecase.teacher;

import entity.Teacher;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import port.notification.MailSender;
import port.teacher.TeacherRepository;

import static org.mockito.Mockito.*;


public class CreateTeacherTest {
    protected TeacherRepository repository;
    private MailSender mailSender;

    @Before
    public void setUp() {
        repository = spy(TeacherRepository.class);
        mailSender = spy(MailSender.class);
    }

    @Test
    public void createTeacherTest() {
        Teacher teacher = new Teacher("John", 22, "Barcelona");
        //when(repository.create(any(Teacher.class))).thenReturn(true);
        doReturn(true).when(repository).create(any(Teacher.class));

        CreateTeacher createTeacher = new CreateTeacher(repository, mailSender);
        Assert.assertTrue(createTeacher.create(teacher));
        verify(mailSender, atLeastOnce()).sendEmail(anyString(), anyString(), anyString());

    }
}
