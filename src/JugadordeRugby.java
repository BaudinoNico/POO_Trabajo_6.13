public class JugadordeRugby extends Jugador {
    private int tackles_rec;

    public JugadordeRugby(String nombre, String deporte, int tackles_rec) {
        super(nombre, deporte);
        this.tackles_rec = tackles_rec;
    }

    public int getTackles_rec() {
        return tackles_rec;
    }

    public void setTackles_rec(int tackles_rec) {
        this.tackles_rec = tackles_rec;
    }

    @Override
    public String toString() {
        return super.toString() + ", Tackles recibidos: " + tackles_rec;
    }
}
