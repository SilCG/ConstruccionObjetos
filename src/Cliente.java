public class Cliente {

    // Atributos
    private String nombre;
    private String apellido;
    private String cedula;
    private char sexo;
    private String ubicacion;

    // Métodos
    // Constructor completo
    public Cliente (String nombre,String apellido,String cedula,char sexo,String ubicacion) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.cedula = cedula;
        this.sexo = sexo;
        this.ubicacion = ubicacion;
    }

    // Constructor por sobrecarga
    public Cliente (String nombre,String apellido,String cedula,String ubicacion) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.cedula = cedula;
        this.ubicacion = ubicacion;
    }

    // Constructor por defecto
    Cliente (){}

    // Método suscribirse
    void suscribirse(Suscripcion suscripcion) {
        System.out.println(nombre + " " + apellido + " adquirió una suscripción " + suscripcion.getTipo() + ".");
    }

    // Getters - Devuelve información
    public String getNombre(){
        return nombre;
    }

    public String getApellido(){
        return apellido;
    }

    public String getCedula(){
        return cedula;
    }

    public char getSexo(){
        return sexo;
    }

    public String getUbicacion(){
        return ubicacion;
    }

    // Setters - Agrega valor y lo cambia
    public void setNombre(String nombre){
        this.nombre = nombre;
    }

    public void setApellido(String apellido){
        this.apellido = apellido;
    }

    public void setCedula(String cedula){
        this.cedula = cedula;
    }

    public void setSexo(char sexo){
        this.sexo = sexo;
    }

    public void setUbicacion(String ubicacion){
        this.ubicacion = ubicacion;
    }

    // equals()
    public boolean equals(Cliente cliente){
        return this.cedula.equals(cliente.cedula);
    }

    // toString()
    public String toString(){ // yo escojo los valores que quiero agregar y me hace el objeto imprimible
        return "\n El cliente: " + nombre + apellido + "\nCédula: " + cedula + "\nSe encuentra ubicado(a) en :" + ubicacion;
    }

}
