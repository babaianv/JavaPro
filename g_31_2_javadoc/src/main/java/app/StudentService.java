package app;

import java.util.ArrayList;
import java.util.List;
import java.util.NoSuchElementException;

/**
 * Сервис, содержащий инструменты для работы со студентами {@link Student}
 *
 * @author Andrey
 * @version 2.0.0
 */
public class StudentService {

    /**
     * Список студентов
     */
    private List<Student> students = new ArrayList<>();

    /**
     * Добавление студента в сервис
     *
     * @param student добавляемый студент
     */
    public void addStudent(Student student) {
        students.add(student);
    }

    /**
     * Получение студента по идентификатору
     *
     * @param id    идентификатор, по которому требуется найти студента
     * @return      объект студента, соответствующий переданному идентификатору
     * @throws      NoSuchElementException в случае отсутствия студента с данным идентификатором
     */
    public Student getById(int id) {
        Student student = students
                .stream()
                .filter(s -> s.getId() == id)
                .findFirst()
                .orElse(null);

        if (student == null) {
            throw new NoSuchElementException("Не существующий идентификатор");
        }

        return student;
    }

//    public Student getById(int id) {
//        for (Student student : students) {
//            if (student.getId() == id) {
//                return student;
//            }
//        }
//        throw new NoSuchElementException("Не существующий идентификатор");
//    }
}