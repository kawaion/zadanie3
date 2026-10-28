package ChainOfResponsibility;

public class AgeFilter extends AbstractCreditHandler {
    @Override
    public String handle(Credit credit) {
        int age = credit.getPerson().getAge();
        if (age < 20 || age > 75) {
            return "возраст не подходит\n";
        } else {
            return super.handle(credit);
        }
    }
}
