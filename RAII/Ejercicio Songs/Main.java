package EjercicioCanciones;

import java.io.File;
import java.io.FileWriter;
import java.util.Scanner;
import java.io.IOException;
import java.io.FileNotFoundException;
import java.util.ArrayList;

public class Main{
    public static void main(String[] args){
        try{
            File bd = new File("EjercicioCanciones/SongCSV.csv");

            Scanner lector = new Scanner(bd);

            String linea = lector.nextLine();

            ArrayList<Artist> artistas = new ArrayList<Artist>();
            ArrayList<Song> canciones = new ArrayList<Song>();
            ArrayList<Album> albumes = new ArrayList<Album>();
            Artist artistaAuxiliar;
            Song cancionAuxiliar;
            Album albumAuxiliar;

            while(lector.hasNextLine()){
                //System.out.println(lector.nextLine());
                linea = lector.nextLine();

                String[] valor = linea.split(","); //El delimitador es uno o más caracteres

                //ALBUM
                //System.out.println("ALBUM ID: " + valor[2]);
                
                valor[3] = valor[3].replace("\"b\'", "");
                valor[3] = valor[3].replace("\"b\"", "");
                valor[3] = valor[3].replace("'\"", "");
                valor[3] = valor[3].replace("\"\"", "");
                //System.out.println("ALBUM name: " + valor[3]);
                //System.out.println("ALBUM year: " + valor[17]);

                int albumID = Integer.parseInt(valor[2]);
                String albumName = valor[3];
                int albumYear = Integer.parseInt(valor[17]);

                //ARTIST
                valor[4] = valor[4].replace("\"b\'", "");
                valor[4] = valor[4].replace("\"b\"", "");
                valor[4] = valor[4].replace("'\"", "");
                valor[4] = valor[4].replace("\"\"", "");
                //System.out.println("ARTIST ID: " + valor[4]);
                
                valor[8] = valor[8].replace("\"b\'", "");
                valor[8] = valor[8].replace("\"b\"", "");
                valor[8] = valor[8].replace("'\"", "");
                valor[8] = valor[8].replace("\"\"", "");
                //System.out.println("ARTIST name: " + valor[8]);

                String artistID = valor[4];
                String artistName = valor[8];



                //Limpiar el texto 
                valor[1] = valor[1].replace("\"b\'", "");
                valor[1] = valor[1].replace("\"b\"", "");
                valor[1] = valor[1].replace("'\"", "");
                valor[1] = valor[1].replace("\"\"", "");

                valor[16] = valor[16].replace("\"b\'", "");
                valor[16] = valor[16].replace("\"b\"", "");
                valor[16] = valor[16].replace("'\"", "");
                valor[16] = valor[16].replace("\"\"", "");

                //System.out.println("Song Id: " + valor[1]);
                //System.out.println("Song Title: " + valor[16]);

                String songID = valor[1];
                String songTitle = valor[16];


                //System.out.println("\n\n\n");

                /**La creación de los Objetos de cada Clase */

                //song
                cancionAuxiliar = new Song(songID, songTitle);
                albumAuxiliar = validarAlbum(new Album(albumID, albumName, albumYear), albumes);
                if(artistName.contains(";")){
                    String[] autores = artistName.split(";");
                    for(String author : autores){
                        artistaAuxiliar = validarArtista(new Artist(artistID, artistName), artistas);
                        cancionAuxiliar.addAuthor(artistaAuxiliar);
                        albumAuxiliar.addAuthor(artistaAuxiliar);
                    }
                }
                else{
                    
                    //System.out.println("Antes de..: " + valor[0]);
                    artistaAuxiliar = validarArtista(new Artist(artistID, artistName), artistas);
                    //System.out.println("Nombre: " + artistaAuxiliar.getName());
                    //System.out.println("Despues de..: " + valor[0]);

                    cancionAuxiliar.addAuthor(artistaAuxiliar);
                    albumAuxiliar.addAuthor(artistaAuxiliar);
                }

                albumAuxiliar.addSong(cancionAuxiliar);
                canciones.add(cancionAuxiliar);
                //System.out.println("Pasa canción: " + valor[0]);
            }
            lector.close();
            System.out.println("Cantidad de Artistas: " + artistas.size());
            System.out.println("Cantidad de Canciones: " + canciones.size());
            System.out.println("Cantidad de Albumes: " + albumes.size());

            imprimirArtista(artistas, 2021);
            imprimirCancion(canciones, 328);
            imprimirAlbum(albumes, 328);


        }catch(FileNotFoundException e){
            System.out.println("ERROR: Archivo no encontrado!!!");
            e.printStackTrace();
        }
    }

    private static Artist validarArtista(Artist nuevoArtista, ArrayList<Artist> lista){
        if(lista.contains(nuevoArtista))
        {
            Artist recuperado;
            int indiceEncontrado;
            indiceEncontrado = lista.indexOf(nuevoArtista); // busque la posición en el array
            recuperado = lista.get(indiceEncontrado); // Encontre el objeto
            nuevoArtista = recuperado;
        }
        else
            lista.add(nuevoArtista);

        return nuevoArtista;
    }

    private static Album validarAlbum(Album nuevoAlbum, ArrayList<Album> lista){
        if(lista.contains(nuevoAlbum)){
            Album recuperado;
            int indiceEncontrado;
            indiceEncontrado = lista.indexOf(nuevoAlbum);
            recuperado = lista.get(indiceEncontrado);
            nuevoAlbum = recuperado;
        }
        else
            lista.add(nuevoAlbum);

        return nuevoAlbum;
    }

    private static void imprimirArtista(ArrayList<Artist> lista, int i){
        Artist a = lista.get(i);
        System.out.println(a);
    }

    private static void imprimirCancion(ArrayList<Song> lista, int i){
        Song s = lista.get(i);
        System.out.println(s);
    }
    
    private static void imprimirAlbum(ArrayList<Album> lista, int i){
        Album a = lista.get(i);
        System.out.println(a);
    }
}