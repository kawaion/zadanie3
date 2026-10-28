package Decorator;

public class Cheese extends AdditionalIngredient {
    public Cheese(Ingredient ingredient) {
        super(ingredient);
    }

    @Override
    public String show() {
        return super.show() + ", с сыром";
    }
}
