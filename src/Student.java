public class Student implements Observer {

    private String name;
    private int salary;
    private VacancyType vacancyType;

    public Student(String name, VacancyType vacancyType) {
        this.name = name;
        salary = 5000;
        this.vacancyType = vacancyType;
    }

    @Override
    public boolean receiveOffer(String nameCompany, Vacancy vacancy) {
        if (this.salary <= vacancy.getSalary()) {
            System.out.printf("Студент %s: Мне нужна эта работа! (компания: %s; должность: %s; заработная плата: %d)\n",
                    name, nameCompany, vacancy.getName(), vacancy.getSalary());
            this.salary = vacancy.getSalary();
            return true;
        } else {
            System.out.printf("Студент %s: Я найду работу получше! (компания: %s; должность: %s; заработная плата: %d)\n",
                    name, nameCompany, vacancy.getName(), vacancy.getSalary());
            return false;
        }
    }

    @Override
    public VacancyType getVacancyType() {
        return vacancyType;
    }
}
