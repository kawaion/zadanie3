package Strategy;

public class Dinar implements MyCurrency {
    @Override
    public double convert(double value) {
        return value / 27.35;
    }

    @Override
    public String getName() {
        return "динар";
    }
}
