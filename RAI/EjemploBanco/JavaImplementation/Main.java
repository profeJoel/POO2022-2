public class Main{
    public static void main(String[] args){
        Cliente c1 = new Cliente("00000000-0", "NN");

        Vista cv = new Vista(1,1000000,2000000);
        Corriente cc = new Corriente(2,4000000, 10000000);
        Consumo cconsumo = new Consumo(3, 2.5, 20000000,24, 5.0);
        Hipotecario ch = new Hipotecario(4, 1.5, 300000000, 120, "Casa");

        c1.addProducto(cv);
        c1.addProducto(cc);
        c1.addProducto(cconsumo);
        c1.addProducto(ch);

        System.out.println(c1);
    }
}