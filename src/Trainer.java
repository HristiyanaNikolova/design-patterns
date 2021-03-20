import java.util.ArrayList;
import java.util.List;

public class Trainer implements Observable{
    private String exercise;
    private List<Observer> observers;

    public Trainer() {
        this.observers = new ArrayList<>();
    }

    public void setExercise(String exercise) {
        this.exercise = exercise;
        this.notifyObservers();
    }

    @Override
    public void addSpectator(Observer spectator) {
        this.observers.add(spectator);
        spectator.setExercise(this);
    }

    @Override
    public void removeSpectator(Observer spectator) {
        if(observers.isEmpty() || !observers.contains(spectator)){
            return;
        }
        this.observers.remove(spectator);
    }

    @Override
    public void notifyObservers() {
        for(Observer spectator: this.observers) {
            spectator.update();
        }

    }

    @Override
    public String getUpdate() {
        return this.exercise;
        }
}
