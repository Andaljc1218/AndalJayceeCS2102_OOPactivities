package Artists;

public class Dancer extends Artist {
    public enum DanceStyle {
        BALLET, 
        HIPHOP, 
        JAZZ, 
        CONTEMPORARY
    }

    private DanceStyle danceStyle;

    public Dancer(String name, int age, String specialty, DanceStyle danceStyle) {
        super(name, age, specialty);
        this.danceStyle = danceStyle;
    }

    public DanceStyle getDanceStyle() {
        return danceStyle;
    }

    public void setDanceStyle(DanceStyle danceStyle) {
        this.danceStyle = danceStyle;
    }

    @Override
    public void displayInfo() {
        System.out.println("Dancer Info: ");
        super.displayInfo();
        System.out.println("Dance Style: " + danceStyle);
    }
}
