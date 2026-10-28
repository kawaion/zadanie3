package ChainOfResponsibility;

public abstract class AbstractCreditHandler implements CreditHandler {

    private CreditHandler nextHandler;

    @Override
    public CreditHandler setNext(CreditHandler handler) {
        nextHandler = handler;
        return handler;
    }

    @Override
    public String handle(Credit credit) {
        if (nextHandler != null) {
            return nextHandler.handle(credit);
        } else {
            return null;
        }
    }
}
