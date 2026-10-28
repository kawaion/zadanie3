package Strategy;

public class UnlimitedTariff implements TariffStrategy {
    private final int PackageCost = 1200;

    @Override
    public int monthlyCost(int minutes, int gb, int sms) {
        return PackageCost;
    }

    @Override
    public String name() {
        return "Безлимит";
    }
}
