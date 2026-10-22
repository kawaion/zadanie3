package Decorator;

public class Cheese extends additionalIngredient{
    public Cheese(Ingredient ingredient) {
        super(ingredient);
    }

    @Override
    public String show() {
        return super.show() + ", с сыром";
    }
}
