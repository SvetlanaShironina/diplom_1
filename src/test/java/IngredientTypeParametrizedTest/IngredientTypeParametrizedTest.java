package IngredientTypeParametrizedTest;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import praktikum.IngredientType;

import static org.junit.Assert.assertEquals;
import static praktikum.IngredientType.*;

@RunWith(Parameterized.class)
public class IngredientTypeParametrizedTest {
    private  IngredientType type;
    private  String name;

    public IngredientTypeParametrizedTest(IngredientType type, String name) {
        this.type = type;
        this.name = name;
    }

    @Parameterized.Parameters(name = "{index} : name = {0}")
    public static Object[][] getIngredientTypeData() {
        return new Object[][]{
                {SAUCE, "SAUCE"},
                {FILLING, "FILLING"}
        };
    }

    @Test
    public void checkIngredientTypeName() {
        assertEquals("Проверяем соответствие списка enum и их название", name, type.name());
    }
}