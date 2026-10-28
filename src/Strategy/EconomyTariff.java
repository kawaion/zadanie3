package Strategy;

public class EconomyTariff implements TariffStrategy {
    private final int PackageCost = 200;

    private final int minutesInPackage = 100;
    private final int gbInPackage = 2;
    private final int smsInPackage = 50;

    private final int perMinutesCost = 2;
    private final int perGbCost = 150;
    private final int perSmsCost = 1;

    @Override
    public int monthlyCost(int minutes, int gb, int sms) {
        int total = PackageCost;
        int overMin = Math.max(0, minutes - minutesInPackage);
        int overGb  = Math.max(0, gb - gbInPackage);
        int overSms = Math.max(0, sms - smsInPackage);
        total += overMin * perMinutesCost;
        total += overGb * perGbCost;
        total += overSms * perSmsCost;
        return total;
    }

    @Override
    public String name() {
        return "Эконом";
    }
}
