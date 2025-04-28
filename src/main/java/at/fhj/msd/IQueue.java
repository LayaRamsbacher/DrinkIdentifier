package at.fhj.msd;

/** 
  * The Interface for the StringQueue Class
  */ 
public interface IQueue {
  
  public abstract boolean offer(String obj);


  public abstract String poll();

  
  public abstract String remove();

 
   
  public abstract String peek();

  
  
  public abstract String element();
}