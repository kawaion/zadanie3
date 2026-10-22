package Decorator;

public abstract class additionalIngredient extends Ingredient{
    protected Ingredient ingredient;

    public additionalIngredient(Ingredient ingredient)
    {
        this.ingredient = ingredient;
    }

    public void SetComponent(Ingredient ingredient)
    {
        this.ingredient = ingredient;
    }

    @Override
    public String show() {
        if (this.ingredient != null)
        {
            return this.ingredient.show();
        }
        else
        {
            return "";
        }
    }
}
