public class Producto{
    private int identificador;

    public Producto(int id){
        this.identificador = id;
    }

    public int getIdentificador(){
        return this.identificador;
    }

    public String toString(){
        return "producto [" + this.identificador +"]";
    }
}