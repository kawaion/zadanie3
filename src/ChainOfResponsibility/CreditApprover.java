package ChainOfResponsibility;

public class CreditApprover {
    public static String CheckApprove(Credit credit, AbstractCreditHandler handler) {
        var result = handler.handle(credit);

        if (result != null) {
            return result;
        } else {
            return "одобрено";
        }
    }
}
