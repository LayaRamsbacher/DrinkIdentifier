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
      return false;
  }


      
  public String poll()
  {
      return "";
  }

 
     
  public Drink remove()
  {

    return elements.remove();
      
  }

   
  public String peek()
  {
    return "";
  }

  
  public String element()
  {
    return "";
  }

}
