public class Spectator implements Observer {
    private String name;
    private Observable exercise;

    public Spectator(String name) {
        this.setName(name);
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    @Override
    public void update() {
        if(this.exercise == null) {
            System.out.println(this.getName() + " has no exercise set");
            return;
        }
        String updatedExercise = this.exercise.getUpdate();
        System.out.println(this.getName() + " received an update from topic: " + updatedExercise);
    }

    @Override
    public void setExercise(Observable exercise) {
        this.exercise = exercise;
    }
}
