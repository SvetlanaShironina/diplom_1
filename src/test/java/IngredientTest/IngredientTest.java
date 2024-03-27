package IngredientTest;

import org.junit.Before;
import org.junit.Test;
import praktikum.Ingredient;

import static org.junit.Assert.assertEquals;
import static praktikum.IngredientType.*;

public class IngredientTest {
    private Ingredient ingredient;

    @Before
    public void createNewBun() {
        ingredient = new Ingredient(SAUCE, "hot sauce", 100);
    }

    @Test
    public void getType() {
        Enum actual = ingredient.getType();
        Enum expected = SAUCE;

        assertEquals("Проверяем возвращение типа ингредиента", expected, actual);
    }

    @Test
    public void getName() {
        String actual = ingredient.getName();
        String expected = "hot sauce";

        assertEquals("Проверяем возвращение названия ингредиента", expected, actual);
    }

    @Test
    public void getPrice() {
        float actual = ingredient.getPrice();
        float expected = 100;

        assertEquals("Проверяем возвращение цены ингредиента", expected, actual, 0);
    }
}
