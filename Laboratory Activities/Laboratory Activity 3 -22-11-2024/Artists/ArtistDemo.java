package Artists;

public class ArtistDemo {
    public static void main(String[] args) {
        // Ma'am, some of my inputs po are imbento lang po huhu 

        // Artist Instance
        Artist artist = new Artist("Kai Guatelara", "Chinese", 22, "Dance");
        artist.displayInfo();
        System.out.println();

        // Singer instance
        Singer singer = new Singer("Dionela", "Filipino", 25, "Music", Singer.Genre.POP);
        singer.displayInfo();
        System.out.println();

        // Painter instance
        Painter painter = new Painter("Leonardo Da Vinci", "Italian", 67, "Painting", Painter.Medium.OIL);
        painter.displayInfo();
        System.out.println();

        // Writer instance
        Writer writer = new Writer("Jang Su-rak", "Korean", 40, "Writing", Writer.WritingStyle.FICTION);
        writer.displayInfo();
        System.out.println();

        // Dancer instance
        Dancer dancer = new Dancer("Joseph Lubi", "Filipino", 21, "Dance", Dancer.DanceStyle.HIPHOP);
        dancer.displayInfo();
    }
}
