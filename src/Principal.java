public class Principal {
    private static Jugador[] jugadores = new Jugador[5];

    public static void main(String[] args) {

        jugadores[0] = new JugadorDeBasquet("Raul", "Basquet", 20);
        jugadores[1] = new Jugador("Pepe","Waterpolo");
        jugadores[2] = new JugadordeRugby("Lorenzo", "Rugby", 11);
        jugadores[3] = new JugadorDeBasquet("Roberto", "Basquet", 33);
        jugadores[4] = new Jugador("Omar","Tenis");

        System.out.println('\n' + "Excluyendo a los de Rugby y Basquet, los jugadores son: " + '\n');
        Jugadores();
        System.out.println('\n' + "Estos son todos los jugadores: " + '\n');
        Todos();
        System.out.println('\n' + "Fin, hasta luego!");
    }

    public static void Jugadores() {
        for (int i = 0; i < jugadores.length; i++)
            if (jugadores[i].getClass().getName().equals("Jugador")) {
                System.out.println("Jugador nro. " + (i+1) + " - " + jugadores[i].toString());
            }
    }

    public static void Todos() {
        for (int i = 0; i < jugadores.length; i++)
            System.out.println("Jugador nro. " + (i+1) + " - " + jugadores[i].toString());
    }
}
