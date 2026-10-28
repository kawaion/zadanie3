package Builder;

public class PersonB {
    private int age;
    private int income;
    private int workExperience;
    private int creditCount;

    private PersonB(int age, int income, int workExperience, int creditCount) {
        this.age = age;
        this.income = income;
        this.workExperience = workExperience;
        this.creditCount = creditCount;
    }

    public static class Builder {
        private int age;
        private int income;
        private int workExperience;
        private int creditCount;

        public Builder setAge(int age) {
            this.age = age;
            return this;
        }

        public Builder setIncome(int income) {
            this.income = income;
            return this;
        }

        public Builder setWorkExperience(int workExperience) {
            this.workExperience = workExperience;
            return this;
        }

        public Builder setCreditCount(int creditCount) {
            this.creditCount = creditCount;
            return this;
        }

        public PersonB build() {
            return new PersonB(age, income, workExperience, creditCount);
        }
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
