package Artists;

public class Writer extends Artist {
    public enum WritingStyle {
        FICTION, 
        NONFICTION, 
        POETRY, 
        DRAMA
    }

    private WritingStyle writingStyle;

    public Writer(String name, int age, String specialty, WritingStyle writingStyle) {
        super(name, age, specialty);
        this.writingStyle = writingStyle;
    }

    public WritingStyle getWritingStyle() {
        return writingStyle;
    }

    public void setWritingStyle(WritingStyle writingStyle) {
        this.writingStyle = writingStyle;
    }

    @Override
    public void displayInfo() {
        System.out.println("Writer Info: ");
        super.displayInfo();
        System.out.println("Writing Style: " + writingStyle);
    }
}
