package at.fhj.msd;

import java.util.LinkedList;

public class DrinkQueue  {

      private LinkedList<Drink> elements;
      int maxSize = 5;

  public DrinkQueue(int maxSize) {
      elements = new LinkedList<>();
      this.maxSize = maxSize;
  }    

  public boolean offer(Drink obj)
  {
    if(elements.size() > this.maxSize)
     {
      return false;
    }
    else
    {
      elements.add(obj);
      return true;
    }
}

      
  public Drink poll()
  {
      return null;
  }

 
     
  public Drink remove()
  {

    return elements.remove();
      
  }

   
  public Drink peek()
  {
    if (!elements.isEmpty()) {
      return null;
    } else {
      return elements.get(0);
    }
    
  }

  
  public Drink element()
  {
    return null;
  }

}