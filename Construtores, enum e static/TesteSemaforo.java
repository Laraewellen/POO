ublic enum Semaforo {
    RED(30),
    GREEN(60),
    YELLOW(5);
    private final int duration;
    Semaforo(int duration) {
    this.duration = duration;
    }
    public int getDuration() {
    return duration;
    }
    }
    public class TesteSemaforo {
    public static void main(String[] args) {
    System.out.println("Durações das luzes do semáforo:");
    for (Semaforo luz : Semaforo.values()) {
    System.out.printf("%s: %d segundos%n", luz, luz.getDuration());
    }
    }
    }
    