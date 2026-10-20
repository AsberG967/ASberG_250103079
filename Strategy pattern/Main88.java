
interface MoveStrategy {
    void move();
}

class WalkingStrategy implements MoveStrategy {
    @Override
    public void move() {
        System.out.println("Moving at 5 km/h Walking");
    }
}

class SkateboardingStrategy implements MoveStrategy {
    @Override
    public void move() {
        System.out.println("Moving at 15 km/h Skateboarding");
    }
}

class JetpackStrategy implements MoveStrategy {
    @Override
    public void move() {
        System.out.println("Moving at 60 km/h Jetpack");
    }
}

class Player {
    private MoveStrategy strategy;

    public Player(MoveStrategy strategy) {
        this.strategy = strategy;
    }

    public void setStrategy(MoveStrategy strategy) {
        this.strategy = strategy;
    }

    public void move() {
        this.strategy.move();
    }
}

public class Main88 {
    public static void main(String[] args) {
        Player racer = new Player(new WalkingStrategy());
        racer.move();
        racer.setStrategy(new JetpackStrategy());
        racer.move();
        racer.setStrategy(new SkateboardingStrategy());
        racer.move();
    }
}