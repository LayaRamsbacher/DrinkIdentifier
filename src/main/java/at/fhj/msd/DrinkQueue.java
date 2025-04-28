package at.fhj.msd;

import java.util.ArrayList;

public class DrinkQueue implements IQueue {

      private ArrayList<Drink> elements = new ArrayList<Drink>();
      private int maxSize;

  public DrinkQueue(int maxSize) {
      this.maxSize = maxSize;
  }    

  public boolean offer(Drink obj)
  {
      if (elements.size() < maxSize) {
          elements.add(obj);
          return true;
      } else {
          return false;
      }
  }


      @Override
  public String poll()
  {
      if (elements.isEmpty()) {
              return null;
      } else {
          Drink firstElement = elements.get(0);
          elements.remove(0);
          return firstElement.toString();
      }
  }

 
      @Override
  public String remove()
  {
      
  }

   
  public String peek()
  {

  }

  
  public String element()
  {

  }

}
