package Strategy;

public class Ruble implements MyCurrency {
    @Override
    public double convert(double value) {
        return value;
    }

    @Override
    public String getName() {
        return "рублей";
    }
}
