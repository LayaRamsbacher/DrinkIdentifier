package at.fhj.msd;

/**
 * The interface for the DoubleQueue.java Class 
 */
public interface IDoubleQueue{
  
  public abstract boolean offer(Double obj);


  public abstract Double poll();

 
  public abstract Double remove();

   
  public abstract Double peek();

  
  public abstract Double element();

}