package ChainOfResponsibility;

public interface CreditHandler {
    CreditHandler SetNext(CreditHandler handler);

    String Handle(Credit credit);
}
