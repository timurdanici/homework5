public class MusicAlbum {
    int ReleaseYear;
    String Artist;
    String Title;

    MusicAlbum(){
        ReleaseYear= 2017;
        Artist = "Mac DeMarco";
        Title = "This Old Dog";
    }
    MusicAlbum(int ReleaseYear, String Title){
        this.ReleaseYear=ReleaseYear;
        Artist="MF Doom";
        this.Title=Title;
    }
    MusicAlbum(MusicAlbum Klon){
        ReleaseYear = Klon.ReleaseYear;
        Title = Klon.Title;
        Artist = Klon.Artist;
    }

    void printinfo(){
        System.out.println("Artist: " + this.Artist);
        System.out.println("Title: " + this.Title);
        System.out.println("Release Date: " + this.ReleaseYear);
    }
    void checkDate(){
        if(this.ReleaseYear > 2010){
            System.out.println("This album was released later than 2010");
        }
        if(this.ReleaseYear < 2010){
            System.out.println("This album was released before 2010");
        }
        if(this.ReleaseYear == 2010){
            System.out.println("This album was released in 2010");
        }
    }
}
