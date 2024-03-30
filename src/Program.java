public class Program {

    /**
     * TODO: Доработать приложение, которое разрабатывалось на семинаре,
     *  поработать с шаблоном проектирования Observer,
     *  добавить новый тип соискателя.
     *  Добавить новую сущность "Вакансия", компания должна рассылать вакансии.
     *  Только после этого вы можете усложнить ваше приложение (при желании), например,
     *  добавить тип вакансии (enum),
     *  учитывать тип вакансии при отправке предложения соискателю.
     *  *** воспользоваться методом removeObserver для удаления соискателя после получения работы
     *
     * @param args
     */
    public static void main(String[] args) {
        Publisher publisher = new JobAgency();
        Company google = new Company("Google", publisher, 250000);
        Company yandex = new Company("Yandex", publisher, 95000);
        Company geekBrains = new Company("GeekBrains", publisher, 98000);

        Student student = new Student("Student #1", VacancyType.PROGRAMMER);
        Student student2 = new Student("Student #2", VacancyType.TESTER);
        Master master = new Master("Master #1", VacancyType.ANALYST);
        Expert expert = new Expert("Эксперт #1", VacancyType.PROGRAMMER);


        publisher.registerObserver(student);
        publisher.registerObserver(student2);
        publisher.registerObserver(master);
        publisher.registerObserver(expert);


        publisher.removeObservers(google.needEmployee(VacancyType.PROGRAMMER));

        publisher.removeObservers(google.needEmployee(VacancyType.TESTER));
        publisher.removeObservers(yandex.needEmployee(VacancyType.TESTER));
        publisher.removeObservers(geekBrains.needEmployee(VacancyType.ANALYST));
        publisher.removeObservers(google.needEmployee(VacancyType.PROGRAMMER));
    }


}
