package IngredientTest;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import praktikum.Ingredient;
import praktikum.IngredientType;

import java.util.List;

import static org.junit.Assert.assertEquals;
import static praktikum.IngredientType.*;

@RunWith(Parameterized.class)
public class IngredientСonstructorParametrizedTest {
    private IngredientType type;
    private String name;
    private float price;

    public IngredientСonstructorParametrizedTest(IngredientType type, String name, float price) {
        this.type = type;
        this.name = name;
        this.price = price;
    }

    @Parameterized.Parameters(name = "Тестовые данные ингредиента: тип - {0}, наименование - {1}, цена - {2}")
    public static Object[][] getBunInfo() {
        return new Object[][]{
                {SAUCE,"hot sauce", 100},
                {FILLING,"cutlet", 100.0f},
                {null,"cutlet", 100.0f},
                {FILLING, null, 200.0f},
                {null, null, 0.0f}
        };
    }

    @Test
    public void Ingredient(){
        Ingredient ingredient = new Ingredient(type, name, price);

        IngredientType actualType = ingredient.getType();
        String actualName = ingredient.getName();
        float actualPrice = ingredient.getPrice();

        assertEquals("Тип бургера не соответствует", ingredient.getType(), actualType);
        assertEquals("Название бургера не соответствует", ingredient.getName(), actualName);
        assertEquals("Цена бургера не соответствует", ingredient.getPrice(), actualPrice,0);
    }
}