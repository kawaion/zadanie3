package ChainOfResponsibility;

public class Person {
    private int age;
    private int income;
    private int workExperience;
    private int creditCount;

    public Person(int age, int income, int workExperience, int creditCount) {
        this.age = age;
        this.income = income;
        this.workExperience = workExperience;
        this.creditCount = creditCount;

    }

    public int getAge() {
        return age;
    }

    public int getCreditCount() {
        return creditCount;
    }

    public int getWorkExperience() {
        return workExperience;
    }

    public int getIncome() {
        return income;
    }
}
