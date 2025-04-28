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
              double summedvolume = 0;
              for (Liquid l : liquid) {
                     summedvolume += l.getVolume();
              }
              return summedvolume;
       }

       @Override
       public double getAlcoholPercent() {
              double summedalcohol = 0;
              for (Liquid l : liquid) {
                     summedalcohol += l.getAlcoholPercent();
              }
              return summedalcohol / liquid.size();
       }

       @Override
       public boolean isAlcoholic() {
              double summedalcohol = 0;
              for (Liquid l : liquid) {
                     summedalcohol += l.getAlcoholPercent();
              }
                  return summedalcohol > 0;
       }


}
