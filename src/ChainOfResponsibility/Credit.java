package ChainOfResponsibility;

public class Credit {
    private Person person;
    private int amount;
    private int term;

    public Credit(Person person, int amount, int term) {
        this.person = person;
        this.amount = amount;
        this.term = term;
    }

    public Person getPerson() {
        return person;
    }

    public int getAmount() {
        return amount;
    }

    public int getTerm() {
        return term;
    }
}
