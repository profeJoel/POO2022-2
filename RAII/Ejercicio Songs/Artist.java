package EjercicioCanciones;

import java.util.Objects;

public class Artist{
    private String ID;
    private String name;

    public Artist(String ID, String name){
        this.ID = ID;
        this.name = name;
    }

    public String getName(){
        return this.name;
    }

    @Override
    public boolean equals(Object o){
        // Compara con el objeto o con una instancia
        if(this == o)
            return true;
        // Omitir los objetos nulos
        if(o == null)
            return false;

        //validamos la clase del objeto entregado
        if(getClass() != o.getClass())
            return false;

        Artist a = (Artist) o;

        //Comparando entre valores
        return Objects.equals(ID, a.ID) && Objects.equals(name, a.name);
    }
}