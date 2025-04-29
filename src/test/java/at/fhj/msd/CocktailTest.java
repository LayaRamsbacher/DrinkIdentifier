package at.fhj.msd;

import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class CocktailTest {
      
      @Test
      @DisplayName("Test getVolume")
      void testConstructor() {
          Liquid l1 = new Liquid("L1", 1, 1);
          Liquid l2 = new Liquid("L2", 1, 1);
          Liquid l3 = new Liquid("L3", 1, 1);
          ArrayList<Liquid> l = new ArrayList<Liquid>();
          l.add(l1);
          l.add(l2);
          l.add(l3);
          Cocktail c = new Cocktail("Anok", l);
          double expected = 3.0;
          double actual = c.getVolume();
          assertEquals(expected, actual);
      }

      @Test
      @DisplayName("Test getAlcoholPercent")
      void testGetAlcoholPercent() {
          Liquid l1 = new Liquid("L1", 1, 1);
          Liquid l2 = new Liquid("L2", 1, 1);
          Liquid l3 = new Liquid("L3", 1, 1);
          ArrayList<Liquid> l = new ArrayList<Liquid>();
          l.add(l1);
          l.add(l2);
          l.add(l3);
          Cocktail c = new Cocktail("Anok", l);
          double expected = 1.0;
          double actual = c.getAlcoholPercent();
          assertEquals(expected, actual);
      }

      @Test
      @DisplayName("Test isAlcoholic")
      void testIsAlcoholic() {
          Liquid l1 = new Liquid("L1", 1, 1);
          Liquid l2 = new Liquid("L2", 1, 1);
          Liquid l3 = new Liquid("L3", 1, 1);
          ArrayList<Liquid> l = new ArrayList<Liquid>();
          l.add(l1);
          l.add(l2);
          l.add(l3);
          Cocktail c = new Cocktail("Anok", l);
          boolean expected = true;
          boolean actual = c.isAlcoholic();
          assertEquals(expected, actual);
      }

}
