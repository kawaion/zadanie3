package Decorator;

public class Olives extends additionalIngredient{
    public Olives(Ingredient ingredient) {
        super(ingredient);
    }

    @Override
    public String show() {
        return super.show() + ", с оливками";
    }
}
