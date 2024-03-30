public interface Observer {

    boolean receiveOffer(String nameCompany, Vacancy vacancy);

    VacancyType getVacancyType();

}
