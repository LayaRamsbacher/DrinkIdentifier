package at.fhj.msd;
// put into drinkss
public class Liquid {
    
    private String name;
    // volume in l
     
    private double volume;

    // alcohohl percent (eg 42 ) 

    private double alcoholPercent;

    public Liquid(String name, double volume, double alcoholPercent) {

        if (name == null || name.trim().isEmpty()) {
            throw new IllegalArgumentException("Name cannot be null or empty");
        }
        if (volume < 0 || volume > 100) {
            throw new IllegalArgumentException("Volume must be non-negative");
        }
        if (alcoholPercent < 0 || alcoholPercent > 100) {
            throw new IllegalArgumentException("Alcohol percentage must be between 0 and 100");
        }
        this.name = name;
        this.volume = volume;
        this.alcoholPercent = alcoholPercent;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {

        if (name == null || name.trim().isEmpty()) {
            throw new IllegalArgumentException("Name cannot be null or empty");
        }

        this.name = name;
    }

    public double getVolume() {
        return volume;
    }

    public void setVolume(double volume) {
        
        if (volume < 0 || volume > 100) {
            throw new IllegalArgumentException("Volume must be non-negative");
        }

        this.volume = volume;
    }

    public double getAlcoholPercent() {
        return alcoholPercent;
    }
 
    public void setAlcoholPercent(double alcoholPercent) {
        if (alcoholPercent < 0 || alcoholPercent > 100) {
            throw new IllegalArgumentException("Alcohol percentage must be between 0 and 100");
        }
        this.alcoholPercent = alcoholPercent;
    }
}
