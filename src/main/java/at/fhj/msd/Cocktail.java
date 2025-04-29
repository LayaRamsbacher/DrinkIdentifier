package at.fhj.msd;

import java.util.ArrayList;
import java.util.List;

public class Cocktail extends  Drink {

       List<Liquid> liquid = new ArrayList<Liquid>();
       
       /**
        * 
        * Constructor for Cocktail
        * Cocktail is a extension of Drink who has a list of Liquids and a name (String), same as Drink
        * the methods getVolume, getAlcoholPercent and isAlcoholic are overridden and work different than in Drink
        * because they are calculated from the list of Liquids (so the volume is summed up and the alcohol percent is calculated from the average of the liquids in the list
        * and isAlcoholic is true if the average of the liquied in the list is greater than 0) 
        * @param name
        * @param liquid
       */
       public Cocktail(String name, List<Liquid> liquid) {
              super(name);
              this.liquid = liquid;
       }

       /**
        * The getVolume method is overridden and returns the sum of the volume of all liquids in the list
        * @return the sum of the volume of all liquids in the list
        */
       @Override
       public double getVolume() {
              double summedvolume = 0;
              for (Liquid l : liquid) {
                     summedvolume += l.getVolume();
              }
              return summedvolume;
       }

       /**
        * The getAlcoholPercent is overridden and returns the average alcohol percentage of all liquids in the list
        * so: all Alcohol Percentages summed up and divided by the number of liquids in the list
        * @return the average Alcohol Percentage
        */
       @Override
       public double getAlcoholPercent() {
              double summedalcohol = 0;
              for (Liquid l : liquid) {
                     summedalcohol += l.getAlcoholPercent();
              }
              return summedalcohol / liquid.size();
       }

       /**
        * The isAlcoholic Method is overwritten and retruns true or false depending on
        * if the average Alcohol Percentage is under or above 0. It is considered Alcoholic if it is above 0
        * and not if under
        * @return if the avarage number of liquids are alcoholic or not
        */

       @Override
       public boolean isAlcoholic() {
              double summedalcohol = 0;
              for (Liquid l : liquid) {
                     summedalcohol += l.getAlcoholPercent();
              }
                  return (summedalcohol / liquid.size()) > 0;
       }


}
