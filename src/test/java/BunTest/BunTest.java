package BunTest;

import org.junit.Before;
import org.junit.Test;
import praktikum.Bun;

import static org.junit.Assert.assertEquals;


public class BunTest {
        private Bun bun;

    @Before
    public void createNewBun() {
        bun = new Bun("Булочка с кунжутом", 20.1F);
    }

    @Test
    public void getName() {
        String actual = bun.getName();
        String expected = "Булочка с кунжутом";

        assertEquals("Проверяем соответствие названия булочки", expected, actual);
    }

    @Test
    public void getPrice() {
        float actual = bun.getPrice();
        float expected = 20.1F;

        assertEquals("Проверяем соответствие цены", expected, actual, 0);
    }
}
