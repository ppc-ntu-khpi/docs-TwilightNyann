package domain;

/**
 * Клас Editor представляє редактора, який є художником.
 * Він розширює клас Artist та додає функціонал, специфічний для редакторів.
 */
public class Editor extends Artist {

    /**
     * Конструктор створює об'єкт Editor з вказаними настройками редагування, навичками, ім'ям, посадою, рівнем та відділом.
     *
     * @param electronicEditing     наявність електронного редагування
     * @param skills                навички редактора
     * @param name                  ім'я редактора
     * @param jobTitle              посада редактора
     * @param level                 рівень редактора
     * @param dept                  відділ редактора
     */
    public Editor(boolean electronicEditing, String[] skills, String name, String jobTitle, int level, String dept) {
        super(skills, name, jobTitle, level, dept);
        this.electronicEditing = electronicEditing;
    }

    /**
     * Конструктор створює об'єкт Editor з вказаними настройками редагування та навичками.
     *
     * @param electronicEditing     наявність електронного редагування
     * @param skills                навички редактора
     */
    public Editor(boolean electronicEditing, String[] skills) {
        super(skills);
        this.electronicEditing = electronicEditing;
    }

    /**
     * Конструктор створює об'єкт Editor з вказаними настройками редагування.
     *
     * @param electronicEditing     наявність електронного редагування
     */
    public Editor(boolean electronicEditing) {
        super();
        this.electronicEditing = electronicEditing;
    }

    /**
     * Конструктор створює об'єкт Editor зі стандартними настройками редагування.
     */
    public Editor() {
        super();
        this.electronicEditing = true;
    }

    /**
     * Повертає рядкове представлення об'єкту Editor, включаючи настройки редагування.
     *
     * @return рядкове представлення об'єкту Editor
     */
    @Override
    public String toString() {
        String s = super.toString() + "\nНалаштування редагування= ";
        if (electronicEditing)
            s = s + "електронне";
        else
            s = s + "паперове";
        return s;
    }

    private boolean electronicEditing;

    /**
     * Повертає настройки редагування.
     *
     * @return наявність електронного редагування
     */
    public boolean getPreferences() {
        return electronicEditing;
    }

    /**
     * Встановлює настройки редагування.
     *
     * @param electronic     настройки редагування (true - електронне, false - паперове)
     */
    public void setPreferences(boolean electronic) {
        this.electronicEditing = electronic;
    }
}
