package Strategy;

interface TariffStrategy {
    int monthlyCost(int minutes, int gb, int sms);
    String name();
}
