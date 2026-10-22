package ChainOfResponsibility;

public class IncomeFilter extends AbstractCreditHandler {
    @Override
    public String Handle(Credit credit) {
        int income = credit.getPerson().getIncome();
        if (income < 50000 || income > 150000)
        {
            return "доход не подходит\n";
        }
        else
        {
            return super.Handle(credit);
        }
    }
}
