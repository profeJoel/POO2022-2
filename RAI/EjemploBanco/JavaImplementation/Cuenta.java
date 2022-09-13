public class Cuenta extends Producto{
    private int saldo;

    public Cuenta(int id, int saldo){
        super(id);
        this.saldo = saldo;
    }

    public int getSaldo(){
        return this.saldo;
    }

    public String toString(){
        return super.toString() + "Cuenta: " + this.saldo;
    }
}