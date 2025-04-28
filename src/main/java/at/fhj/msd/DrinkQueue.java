package at.fhj.msd;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

public class DrinkQueue  {

      private Queue<Drink> elements;

  public DrinkQueue() {
      elements = new LinkedList<>();
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

 
     
  public Drink remove()
  {

    return elements.remove();
      
  }

   
  public String peek()
  {

  }

  
  public String element()
  {

  }

}
