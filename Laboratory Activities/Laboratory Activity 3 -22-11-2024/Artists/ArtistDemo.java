package Artists;

public class ArtistDemo {
    public static void main(String[] args) {
        // Ma'am, some of my inputs po are imbento lang po huhu 

        /* Ma'am, About po sa nationality kasama po kasi sya sa Artist pero wala po sa display info. Bali ni-follow ko lang po
        yung nasa repo nyo po na expected/sample outputs and hindi ko na po inalis nationality sa every class gawa po nung 
        Singer.java nyo po na example. Yun lang po thankyouu po*/ 
            

        // Artist Instance
        Artist artist = new Artist("Kai Guatelara", null, 22, "Dance");
        artist.displayInfo();
        System.out.println();

        // Singer instance
        Singer singer = new Singer("Dionela", null, 25, "Music", Singer.Genre.POP);
        singer.displayInfo();
        System.out.println();

        // Painter instance
        Painter painter = new Painter("Leonardo Da Vinci", null, 67, "Painting", Painter.Medium.OIL);
        painter.displayInfo();
        System.out.println();

        // Writer instance
        Writer writer = new Writer("Jang Su-rak", null, 40, "Writing", Writer.WritingStyle.FICTION);
        writer.displayInfo();
        System.out.println();

        // Dancer instance
        Dancer dancer = new Dancer("Joseph Lubi",null, 21, "Dance", Dancer.DanceStyle.HIPHOP);
        dancer.displayInfo();
    }
}
