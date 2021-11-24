public class Jugador {
    private String nombre,deporte;

    public Jugador(String nombre, String deporte) {
        this.nombre = nombre;
        this.deporte = deporte;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDeporte() {
        return deporte;
    }

    public void setDeporte(String deporte) {
        this.deporte = deporte;
    }

    public String toString(){
        return " Nombre: "+nombre+", Deporte: "+deporte;
    }
}
