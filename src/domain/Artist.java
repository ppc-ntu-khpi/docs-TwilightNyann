package domain;

/**
 * Клас Artist представляє собою художника, який є працівником.
 * Він розширює клас Employee та додає функціонал, специфічний для художників.
 */
public class Artist extends Employee {

    /**
     * Конструктор створює об'єкт Artist із вказаними навичками, ім'ям, посадою, рівнем та відділом.
     *
     * @param skills    навички художника
     * @param name      ім'я художника
     * @param jobTitle  посада художника
     * @param level     рівень художника
     * @param dept      відділ художника
     */
    public Artist(String[] skills, String name, String jobTitle, int level, String dept) {
        super(name, jobTitle, level, dept);
        this.skills = skills;
    }

    /**
     * Конструктор створює об'єкт Artist із вказаними навичками.
     *
     * @param skills    навички художника
     */
    public Artist(String[] skills) {
        super();
        this.skills = skills;
    }

    /**
     * Конструктор створює об'єкт Artist зі стандартними навичками.
     */
    public Artist() {
        super();
        this.skills = new String[10];
    }

    /**
     * Повертає рядкове представлення об'єкту Artist, включаючи навички.
     *
     * @return рядкове представлення об'єкту Artist
     */
    @Override
    public String toString() {
        return super.toString()+"\nНавички: "+getSkills();
    }

    private String[] skills;

    /**
     * Повертає навички художника.
     *
     * @return навички художника
     */
    public String getSkills() {
        String s = "";
        for (String e : skills) {
            s = s + e + ", ";
        }
        s=s.substring(0, s.length() - 2);
        return s;
    }

    /**
     * Встановлює навички художника.
     *
     * @param skills    навички, які потрібно встановити
     */
    public void setSkills(String[] skills) {
        this.skills = skills;
    }

    /**
     * Повертає навички художника у вигляді масиву.
     *
     * @return навички художника у вигляді масиву
     */
    public String[] getSkillsList() {
        return skills;
    }
}
