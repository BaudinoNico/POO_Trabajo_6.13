public class JugadorDeBasquet extends Jugador {
    private int triples;

    public JugadorDeBasquet(String nombre, String deporte, int triples) {
        super(nombre, deporte);
        this.triples = triples;
    }

    public int getTriples() {
        return triples;
    }

    public void setTriples(int triples) {
        this.triples = triples;
    }

    @Override
    public String toString() {
        return super.toString() + ", Triples: " + triples;
    }
}
