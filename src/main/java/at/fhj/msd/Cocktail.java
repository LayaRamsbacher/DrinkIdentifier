package at.fhj.msd;

import java.util.ArrayList;
import java.util.List;

public class Cocktail extends  Drink {

       List<Liquid> liquid = new ArrayList<Liquid>();
       

       public Cocktail(String name, List<Liquid> liquid) {
              super(name);
              this.liquid = liquid;
       }

       @Override
       public double getVolume() {
              return getVolume();
       }

       @Override
       public double getAlcoholPercent() {
         return getAlcoholPercent();
       }

       @Override
       public boolean isAlcoholic() {
                  return getAlcoholPercent() > 0;
       }


}
