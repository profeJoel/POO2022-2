public class Exterior{ //Outer Class

    public String mensaje;

    class Coordenada{
        public int x;
        public int y;

        public Coordenada(int x, int y){
            this.x=x;
            this.y=y;
        }
    }

    public Exterior(String mensaje){
        this.mensaje = mensaje;
    }

}