package Decorator;

public abstract class AdditionalIngredient extends Ingredient {
    protected Ingredient ingredient;

    public AdditionalIngredient(Ingredient ingredient) {
        this.ingredient = ingredient;
    }

    public void SetComponent(Ingredient ingredient) {
        this.ingredient = ingredient;
    }

    @Override
    public String show() {
        if (this.ingredient != null) {
            return this.ingredient.show();
        } else {
            return "";
        }
    }
}
