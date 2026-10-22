package ChainOfResponsibility;

public class AbstractCreditHandler implements CreditHandler{

    private CreditHandler nextHandler;

    @Override
    public CreditHandler SetNext(CreditHandler handler) {
        nextHandler = handler;
        return handler;
    }

    @Override
    public String Handle(Credit credit) {
        if (nextHandler != null)
        {
            return nextHandler.Handle(credit);
        }
        else
        {
            return null;
        }
    }
}
