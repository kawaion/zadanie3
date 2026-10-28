package Strategy;

public class Subscriber {
    private final TariffStrategy tariff;
    private int minutes = 0;
    private int gb = 0;
    private int sms = 0;

    public Subscriber(TariffStrategy tariff) {
        this.tariff = tariff;
    }

    public void addMinutes(int minutes) {
        this.minutes += minutes;
    }

    public void addGb(int gb) {
        this.gb += gb;
    }

    public void addSms(int sms) {
        this.sms += sms;
    }

    public int showBill(){
        return tariff.monthlyCost(minutes, gb, sms);
    }
}
