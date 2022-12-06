package EjercicioCanciones;

import java.util.ArrayList;

public class Song{
    private String ID;
    private String title;
    private ArrayList<Artist> author;

    public Song(String ID, String title, Artist author){
        this.ID = ID;
        this.title = title;
        this.author = new ArrayList<Artist>();
        this.author.add(author);
    }
    public Song(String ID, String title){
        this.ID = ID;
        this.title = title;
        this.author = new ArrayList<Artist>();
    }

    public void addAuthor(Artist author){
        this.author.add(author);
    }

    public String toString(){
        return "Song: " + this.title + "("+this.ID+") - " + this.author;
    }
}