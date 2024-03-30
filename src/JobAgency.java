import java.util.ArrayList;
import java.util.Collection;

public class JobAgency implements Publisher {

    private Collection<Observer> observers = new ArrayList<>();

    public ArrayList<Observer> sendOffer(String companyName, Vacancy vacancy) {
        ArrayList<Observer> observersWhoAccepted = new ArrayList<>();
        for (Observer observer : observers) {
            if (observer.getVacancyType() == vacancy.getName())
                if (observer.receiveOffer(companyName, vacancy))
                    observersWhoAccepted.add(observer);
        }
        return observersWhoAccepted;
    }

    @Override
    public void registerObserver(Observer observer) {
        observers.add(observer);
    }

    @Override
    public void removeObservers(ArrayList<Observer> observers) {
        for (Observer os : observers)
            this.observers.remove(os);
    }

}
