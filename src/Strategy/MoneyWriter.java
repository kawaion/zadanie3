package Strategy;

public class MoneyWriter {
    public static void Write(double value, MyCurrency currency){
        System.out.printf("%7.2f %s \n", currency.convert(value), currency.getName());
    }
}
