package domain;

/**
 * Клас Manager представляє керівника.
 * Клас містить інформацію про керівника, таку як ім'я, посаду, рівень, відділ, а також список підлеглих.
 */
public class Manager extends Employee {

    /**
     * Конструктор створює об'єкт Manager з вказаними підлеглими, ім'ям, посадою, рівнем та відділом.
     *
     * @param employees список підлеглих
     * @param name      ім'я керівника
     * @param jobTitle  посада керівника
     * @param level     рівень керівника
     * @param dept      відділ керівника
     */
    public Manager(Employee[] employees, String name, String jobTitle, int level, String dept) {
        super(name, jobTitle, level, dept);
        this.employees = employees;
    }

    /**
     * Повертає рядкове представлення об'єкту Manager, включаючи інформацію про підлеглих.
     *
     * @return рядкове представлення об'єкту Manager
     */
    @Override
    public String toString() {
        return super.toString() + "\nПідлеглі: " + getEmployees();
    }

    /**
     * Конструктор створює об'єкт Manager зі списком підлеглих.
     *
     * @param employees список підлеглих
     */
    public Manager(Employee[] employees) {
        super();
        this.employees = employees;
    }

    /**
     * Конструктор створює об'єкт Manager зі стандартними налаштуваннями.
     */
    public Manager() {
        super();
        employees = new Employee[10];
    }

    private Employee[] employees;

    /**
     * Повертає рядок, що містить імена підлеглих керівника.
     *
     * @return рядок, що містить імена підлеглих керівника
     */
    public String getEmployees() {
        String s = "";
        for (Employee e : employees) {
            s = s + e.getName() + ", ";
        }
        s = s.substring(0, s.length() - 2);
        return s;
    }

    /**
     * Встановлює список підлеглих керівника.
     *
     * @param employees список підлеглих
     */
    public void setEmployees(Employee[] employees) {
        this.employees = employees;
    }

    /**
     * Повертає масив, що містить підлеглих керівника.
     *
     * @return масив, що містить підлеглих керівника
     */
    public Employee[] getEmployeesList() {
        return employees;
    }
}
