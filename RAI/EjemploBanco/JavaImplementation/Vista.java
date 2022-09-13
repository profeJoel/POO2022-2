public class Vista extends Cuenta{
    private int limiteSaldo;

    public Vista(int id, int saldo, int limiteSaldo){
        super(id,saldo);
        this.limiteSaldo = limiteSaldo;
    }

    public int getLimiteSaldo(){
        return this.limiteSaldo;
    }

    public String toString(){
        return super.toString() + "(" + this.limiteSaldo + ")";
    }
}