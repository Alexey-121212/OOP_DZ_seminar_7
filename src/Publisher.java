import java.util.ArrayList;

public interface Publisher {

    ArrayList<Observer> sendOffer(String companyName, Vacancy vacancy);

    void registerObserver(Observer observer);

    void removeObservers(ArrayList<Observer> observers);


}
