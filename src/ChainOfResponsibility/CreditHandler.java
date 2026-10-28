package ChainOfResponsibility;

public interface CreditHandler {
    CreditHandler setNext(CreditHandler handler);

    String handle(Credit credit);
}
