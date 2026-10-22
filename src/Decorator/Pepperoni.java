package Decorator;

public class Pepperoni extends additionalIngredient{
    public Pepperoni(Ingredient ingredient) {
        super(ingredient);
    }

    @Override
    public String show() {
        return super.show() + ", с пепперони";
    }
}
