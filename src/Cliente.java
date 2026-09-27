public class Cliente {

    // Atributos
    String nombre;
    String apellido;
    String cedula;
    char sexo;
    String ubicacion;

    // Métodos
    // Constructor completo
    Cliente (String nombre,String apellido,String cedula,char sexo,String ubicacion) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.cedula = cedula;
        this.sexo = sexo;
        this.ubicacion = ubicacion;
    }

    // Constructor por sobrecarga
    Cliente (String nombre,String apellido,String cedula,String ubicacion) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.cedula = cedula;
        this.ubicacion = ubicacion;
    }

    // Constructor por defecto
    Cliente (){}

    // Método suscribirse
    void suscribirse(Suscripcion suscripcion) {
        System.out.println(nombre + " " + apellido + " adquirió una suscripción " + suscripcion.tipo + ".");
    }

}
