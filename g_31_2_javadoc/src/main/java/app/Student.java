package app;

import java.util.Objects;

/**
 * Класс, описывающий студента
 * Для работы с объектами студентов предусмотрен {@link StudentService}
 *
 * @author Mega coder
 * @version 2.0.0
 */
public class Student {

    /**
     * Идентификатор студента
     */
    private int id;

    /**
     * Имя студента
     */
    private String name;

    /**
     * Средний балл студента
     */
    private double averageRate;

    /**
     * Конструктор для создания студента
     *
     * @param id    идентификатор студента
     * @param name  имя студента
     * @see         Student#Student(int, String, double)
     * @since       2.0.0
     */
    public Student(int id, String name) {
        this.id = id;
        this.name = name;
    }

    /**
     * Конструктор для создания студента
     *
     * @param id            идентификатор студента
     * @param name          имя студента
     * @param averageRate   средний балл студента
     * @see                 Student#Student(int, String)
     * @since               1.0.0
     * @deprecated          при поступлении у студента ещё нет среднего балла
     */
    public Student(int id, String name, double averageRate) {
        this.id = id;
        this.name = name;
        this.averageRate = averageRate;
    }

    /**
     * Геттер
     *
     * @return  идентификатор студента
     * @see     Student#id
     */
    public int getId() {
        return id;
    }

    /**
     * Метод для преобразования объекта студента в его строковое представление
     *
     * @return объект студента в виде строки
     */
    @Override
    public String toString() {
        return "Student{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", averageRate=" + averageRate +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Student student = (Student) o;
        return id == student.id && Double.compare(student.averageRate, averageRate) == 0 && Objects.equals(name, student.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, name, averageRate);
    }
}