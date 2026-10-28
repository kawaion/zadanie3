package ChainOfResponsibility;

public class LifeFilter extends AbstractCreditHandler {
    @Override
    public String handle(Credit credit) {
        int age = credit.getPerson().getAge();
        int term = credit.getTerm();
        if (age + term > 60) {
            return "риск смерти должника\n";
        } else {
            return super.handle(credit);
        }
    }
}
