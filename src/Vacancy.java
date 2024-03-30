public class Vacancy {
    private VacancyType name;
    private int salary;

    public Vacancy(VacancyType name, int salary) {
        this.name = name;
        this.salary = salary;
    }

    public VacancyType getName() {
        return name;
    }

    public int getSalary() {
        return salary;
    }
}
