import java.util.Random;

public class Company {

    private Random random = new Random();


    private String name;

    private Publisher jobAgency;

    private int maxSalary;

    public Company(String name, Publisher jobAgency, int maxSalary){
        this.jobAgency = jobAgency;
        this.name = name;
        this.maxSalary = maxSalary;
    }

    public void needEmployee(String vacancyName){
        Vacancy vacancy = new Vacancy(vacancyName,random.nextInt(maxSalary));
        jobAgency.sendOffer(name, vacancy);
    }


}
