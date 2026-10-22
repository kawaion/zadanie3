package Strategy;

public class Dollar implements MyCurrency {
    @Override
    public double convert(double value) {
        return value / 82;
    }

    @Override
    public String getName() {
        return "долларов";
    }
}
