package Artists;

public class Painter extends Artist {
    public enum Medium {
        OIL, 
        WATERCOLOR, 
        ACRYLIC, 
        PENCIL, 
        CHARCOAL
    }

    private Medium medium;

    public Painter(String name, String nationality, int age, String specialty, Medium medium) {
        super(name, age, specialty);
        this.medium = medium;
    }

    public Medium getMedium() {
        return medium;
    }

    public void setMedium(Medium medium) {
        this.medium = medium;
    }

    @Override
    public void displayInfo() {
        System.out.println("Painter Info: ");
        super.displayInfo();
        System.out.println("Medium: " + medium);
    }
}
