public class Main {

    public static void main (String[] args) {

        // 1. Construcción de 3 Clientes con constructores diferentes
        Cliente cliente1 = new Cliente("Oscar","Lopez","112349876",'M',"Cartago");

        Cliente cliente2 = new Cliente("Manuela","Gutierrez","126453687","Heredia");

        Cliente cliente3 = new Cliente();

        // 2. Construcción de 3 Suscripciones
        Suscripcion suscripcion1 = new Suscripcion("Básica",25000,(byte)1);

        Suscripcion suscripcion2 = new Suscripcion("Intermedia",50000,(byte)6);

        Suscripcion suscripcion3 = new Suscripcion("Avanzada",75000,(byte)12);

        // 3. Pruebas suscripciones
        cliente1.suscribirse(suscripcion1);
        cliente2.suscribirse(suscripcion2);
        cliente3.suscribirse(new Suscripcion("Avanzada", 10000, (byte)3)); // suscripción anónima
    }

}
