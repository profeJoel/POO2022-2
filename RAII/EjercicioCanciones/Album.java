package EjercicioCanciones;

import java.util.ArrayList;
import java.util.Objects;

public class Album{
    private int ID;
    private String name;
    private int year;
    private ArrayList<Artist> author;
    private ArrayList<Song> track;

    public Album(int ID, String name, int year, Artist author){
        this.ID = ID;
        this.name = name;
        this.year = year;
        this.author = new ArrayList<Artist>();
        this.author.add(author);
        this.track = new ArrayList<Song>();
    }
    
    public Album(int ID, String name, int year){
        this.ID = ID;
        this.name = name;
        this.year = year;
        this.author = new ArrayList<Artist>();
        this.track = new ArrayList<Song>();
    }

    public void addAuthor(Artist author){
        if(!this.author.contains(author))
            this.author.add(author);
    }

    public void addSong(Song s){
        this.track.add(s);
    }

    public String toString(){
        return "Album: " + this.name + "(" + this.ID + ") - " + this.author + "[" +this.year + "]" + this.track;
    }

    @Override
    public boolean equals(Object o){
        if (this == o)
            return true;
        if(o == null)
            return false;
        if (getClass() != o.getClass())
            return false;

        Album a = (Album) o;

        return Objects.equals(ID, a.ID) && Objects.equals(name, a.name);
    }
}