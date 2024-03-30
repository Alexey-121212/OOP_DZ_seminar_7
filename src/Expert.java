public class Expert implements Observer {
    private String name;
    private int salary;

    public Expert(String name) {
        this.name = name;
        salary = 150000;
    }

    @Override
    public void receiveOffer(String nameCompany, Vacancy vacancy) {
        if (this.salary <= vacancy.getSalary()) {
            System.out.printf("Эксперт %s: Мне нужна эта работа! (компания: %s; должность: %s; заработная плата: %d)\n",
                    name, nameCompany, vacancy.getName(), vacancy.getSalary());
            this.salary = vacancy.getSalary();
        } else {
            System.out.printf("Эксперт %s: Я найду работу получше! (компания: %s; должность: %s; заработная плата: %d)\n",
                    name, nameCompany, vacancy.getName(), vacancy.getSalary());
        }
    }
}
