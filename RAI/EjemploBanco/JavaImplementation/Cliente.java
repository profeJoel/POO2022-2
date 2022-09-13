public class Cliente{
    private String rut;
    private String nombre;
    private Producto[] misProductos;
    private int limite;
    private int cupo;

    public Cliente(String rut, String nombre){
        this.rut = rut;
        this.nombre = nombre;
        this.misProductos = new Producto[4];
        this.limite = 4;
        this.cupo = 4;
    } 

    public String getNombre(){
        return this.nombre;
    }

    public void addProducto(Producto nuevo){
        if(this.cupo > 0){
            this.misProductos[this.limite - this.cupo] = nuevo;
            this.cupo--;
        }
    }

    public String toString(){
        String productos = "";
        for(Producto p:this.misProductos)
            productos += "\n" + p.toString();
        return "Cliente (" + this.rut + "): " + this.nombre + "\nProductos:" + productos;
    }

}