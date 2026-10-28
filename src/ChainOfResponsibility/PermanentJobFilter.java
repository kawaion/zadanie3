package ChainOfResponsibility;

public class PermanentJobFilter extends AbstractCreditHandler {
    @Override
    public String handle(Credit credit) {
        int workExperience = credit.getPerson().getWorkExperience();
        int minIncome = credit.getPerson().getIncome();
        if (workExperience < 3 || minIncome < 75000) {
            return "риск увольнения\n";
        } else {
            return super.handle(credit);
        }
    }
}
