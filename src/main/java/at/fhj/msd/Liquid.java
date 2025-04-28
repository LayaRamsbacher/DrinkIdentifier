package at.fhj.msd;

/**
 * The Liquid Class serves as a Kind of Parameter for other classes that extend the Drink Class.
 * Its purpose is to save attribute like volume, alcohol percentage and name for it to be than used in other classes. It also comes
 * with getter and setter methods to all it's attributes, so it can be changed at any given moment. 
 */
public class Liquid {
    
    private String name;
    // volume in l
     
    private double volume;

    // alcohohl percent (eg 42 ) 

    private double alcoholPercent;

    /**
     * The Constructor of The Liquid Class
     * @param name
     * @param volume
     * @param alcoholPercent
     */
    public Liquid(String name, double volume, double alcoholPercent) {
        this.name = name;
        this.volume = volume;
        this.alcoholPercent = alcoholPercent;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getVolume() {
        return volume;
    }

    public void setVolume(double volume) {
        this.volume = volume;
    }

    public double getAlcoholPercent() {
        return alcoholPercent;
    }
 
    public void setAlcoholPercent(double alcoholPercent) {
        this.alcoholPercent = alcoholPercent;
    }
}
