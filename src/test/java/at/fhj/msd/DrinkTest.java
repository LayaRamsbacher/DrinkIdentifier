package at.fhj.msd;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class DrinkTest {
      @BeforeEach
      void setUp() {
          
      }

      @Test
      @DisplayName("Test for Drink class")
      void testDrink() {
          // Create a mock object of the Drink class
          Drink drink = new Drink("Test Drink") {
              @Override
              public double getVolume() {
                  return 1.0;
              }

              @Override
              public double getAlcoholPercent() {
                  return 5.0;
              }

              @Override
              public boolean isAlcoholic() {
                  return true;
              }
          };

          
          assert drink.getName().equals("Test Drink");
          assert drink.getVolume() == 1.0;
          assert drink.getAlcoholPercent() == 5.0;
          assert drink.isAlcoholic() == true;
      }

      @Test
      @DisplayName("Test for Drink class with different name")
      void testDrinkWithDifferentName() {
          // Create a mock object of the Drink class with a different name
          Drink drink = new Drink("Test Drink") {
            @Override
            public double getVolume() {
                return 1.0;
            }

            @Override
            public double getAlcoholPercent() {
                return 5.0;
            }

            @Override
            public boolean isAlcoholic() {
                return true;
            }
        };
              drink.setName("And Another Test Drink");
              assert drink.getName().equals("And Another Test Drink");
      


}

}
