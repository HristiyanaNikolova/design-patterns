public class Main {
    public static void main(String[] args) {
        Trainer trainer = new Trainer();
        Spectator firstSpectator = new Spectator("Maria");
        Spectator secondSpectator = new Spectator("Ivan");
        Spectator thirdSpectator = new Spectator("Georgi");

        trainer.addSpectator(firstSpectator);
        trainer.addSpectator(secondSpectator);
        trainer.addSpectator(thirdSpectator);

        trainer.setExercise("Jumping Jacks");
    }
}
