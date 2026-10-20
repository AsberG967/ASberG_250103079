
interface Pizza {
    String getDescription();
    double getCost();
}

class PlainPizza implements Pizza {
    @Override
    public String getDescription() {
        return "plain dough & sauce";
    }

    @Override
    public double getCost() {
        return 5.00;
    }
}

abstract class PizzaDecorator implements Pizza {
    protected final Pizza decoratedPizza;

    public PizzaDecorator(Pizza pizza) {
        this.decoratedPizza = pizza;
    }

    @Override
    public String getDescription() {
        return decoratedPizza.getDescription();
    }

    @Override
    public double getCost() {
        return decoratedPizza.getCost();
    }
}

class Cheese extends PizzaDecorator {
    public Cheese(Pizza pizza) {
        super(pizza);
    }

    @Override
    public String getDescription() {
        return decoratedPizza.getDescription() + ", Extra cheese";
    }

    @Override
    public double getCost() {
        return decoratedPizza.getCost() + 2.00;
    }
}

class Olives extends PizzaDecorator {
    public Olives(Pizza pizza) {
        super(pizza);
    }

    @Override
    public String getDescription() {
        return decoratedPizza.getDescription() + ", Olives";
    }

    @Override
    public double getCost() {
        return decoratedPizza.getCost() + 1.00;
    }
}

class Pineapple extends PizzaDecorator {
    public Pineapple(Pizza pizza) {
        super(pizza);
    }

    @Override
    public String getDescription() {
        return decoratedPizza.getDescription() + ", Pineapple";
    }

    @Override
    public double getCost() {
        return decoratedPizza.getCost() + 1.50;
    }
}

public class Main44 {
    public static void main(String[] args) {

        Pizza myPizza = new Pineapple(new Olives(new Cheese(new PlainPizza())));

        System.out.println("Order: " + myPizza.getDescription());
        System.out.println("Total Cost: $" + myPizza.getCost());
    }
}