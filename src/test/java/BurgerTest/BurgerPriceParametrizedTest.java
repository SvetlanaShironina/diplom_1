package BurgerTest;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import praktikum.Bun;
import praktikum.Burger;
import praktikum.Ingredient;
import praktikum.IngredientType;

import static org.junit.Assert.assertEquals;

@RunWith(Parameterized.class)
public class BurgerPriceParametrizedTest {
    private Ingredient sauce;
    private Ingredient filling;
    private Burger burger;
    private String name;
    private float price;

    public BurgerPriceParametrizedTest(String name, float price) {
        this.name = name;
        this.price = price;
    }

    @Before
    public void createNewInstance() {
        sauce = new Ingredient(IngredientType.SAUCE, "hot sauce", 100.0f);
        filling = new Ingredient(IngredientType.FILLING, "cutlet", 100.0f);
        burger = new Burger();
    }

    @Parameterized.Parameters(name = "Тестовые данные: название булочки - {0}, цена булочки - {1}")
    public static Object[][] getBunInfo() {
        return new Object[][]{
                {"black bun", 100.0f},
                {"white bun", 200.0f}
        };
    }

    @Test
    public void setBuns(){
        Bun bun = new Bun(name, price);
        burger.setBuns(bun);
        burger.addIngredient(sauce);
        burger.addIngredient(filling);

        float expected = bun.price * 2 + sauce.price + filling.price;
        float actual = burger.getPrice();

        assertEquals("Проверяем итоговую сумму бургера", expected, actual, 0);
    }
}
