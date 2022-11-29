package com.samsung.service;

import com.samsung.model.Student;
import com.samsung.model.Teacher;
import com.samsung.model.University;

public class DemoService {
    private University university;

    public DemoService() {
    }

    public void demo() {
        Teacher teacher1 = new Teacher("Людмила",
                "Тихонова",
                "Викторовна",
                "+79872445467",
                "Математика");
        Teacher teacher2 = new Teacher("Валентина",
                "Панфилова",
                "Никандровна",
                "+79835738556",
                "Физика");
        Teacher teacher3 = new Teacher("Ирина",
                "Иванова",
                "Васильевна",
                "+7498594657",
                "Информатика");
        Student student1 = new Student(
                "Алексей",
                "Морозов",
                "Олегович",
                "+85476847667",
                6);
        Student student2 = new Student(
                "Александра",
                "Александрова",
                "Александровна",
                "+45765867568",
                5);
        Student student3 = new Student(
                "Иван",
                "Иванов",
                "Иванович",
                "+84957685767",
                5);
        Teacher[] teachers = {teacher1, teacher2, teacher3};
        Student[] students = {student1, student2, student3};
        University university1 = new University(
                "Шевченко 2",
                students,
                teachers
                );
        university1.printInfoToConsole();
    }
}
