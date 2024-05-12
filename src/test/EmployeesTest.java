package test;

import domain.*;

/**
 * Клас EmployeesTest є класом для тестування функціоналу роботи з працівниками.
 * Він створює об'єкти різних типів працівників, додає їх до масиву та демонструє їх роботу.
 */
public class EmployeesTest {

    /**
     * Метод main є точкою входу в програму.
     * Він створює різні типи працівників, додає їх до масиву та виводить інформацію про керівника.
     *
     * @param args масив аргументів командного рядка
     */
    public static void main(String args[]) {

        // Навички для редактора
        String[] skills = {"Microsoft Word", "TeX", "OpenOffice", "Markdown"};

        // Створення об'єктів працівників
        Editor ed = new Editor(true, skills, "Phil Coulson", "Головний редактор", 3, "Видавничий");
        Employee em = new Employee("Melinda May", "Асистент", 1, "Видавничий");

        // Створення художника
        Artist art = new Artist(skills);

        // Масив працівників
        Employee[] people = {ed, em, art};

        // Створення керівника з масивом підлеглих
        Manager man = new Manager(people, "Steve Ballmer", "Генеральний директор", 3, "Видавничий");

        // Виведення інформації про керівника
        System.out.println(man);
    }
}
