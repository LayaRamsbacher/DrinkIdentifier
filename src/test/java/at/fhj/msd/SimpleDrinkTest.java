package at.fhj.msd;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class SimpleDrinkTest {
      @BeforeEach
      public void setUp() {
          SimpleDrink drink = new SimpleDrink("Coke", new Liquid("Coke", 1.0, 1.0));
      }

      
      @Test
      @DisplayName("Test SimpleDrink Constructor")
      void testSimpleDrinkConstructor() {
          // Test the constructor of SimpleDrink
          SimpleDrink drink = new SimpleDrink("Coke", new Liquid("Coke", 1.0, 1.0));
          assertEquals("Coke", drink.getName());
          assertEquals(1.0, drink.getVolume());
          assertEquals(1.0, drink.getAlcoholPercent());
      }

      @Test
      @DisplayName("Test isAlcoholic")
      void testIsAlcoholic() {
          // Test the isAlcoholic method
          SimpleDrink alcoholicDrink = new SimpleDrink("Beer", new Liquid("Beer", 1.0, 5.0));
          SimpleDrink nonAlcoholicDrink = new SimpleDrink("Juice", new Liquid("Juice", 1.0, 0.0));
          assertEquals(true, alcoholicDrink.isAlcoholic());
          assertEquals(false, nonAlcoholicDrink.isAlcoholic());
      }

}
