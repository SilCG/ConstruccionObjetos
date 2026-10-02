public class Suscripcion {

    // Atributos
    private String tipo;
    private int costo;
    private byte periodicidad;

    // Métodos
    // Constructor completo
    public Suscripcion(String tipo,int costo,byte periodicidad) {
        this.tipo = tipo;
        this.costo = costo;
        this.periodicidad = periodicidad;
    }

    // Getter
    public String getTipo(){
        return tipo;
    }

    public int getCosto (){
        return costo;
    }

    public byte getPeriodicidad(){
        return periodicidad;
    }

    // Setter

    public void setTipo(String tipo){
        this.tipo = tipo;
    }

    public void setCosto(int costo){
        this.costo = costo;
    }

    public void setPeriodicidad(byte periodicidad){
        this.periodicidad = periodicidad;
    }

    // equals ()
    public boolean equals(Suscripcion suscripcion){
        return getTipo().equals(suscripcion.getTipo()) && getPeriodicidad() == suscripcion.getPeriodicidad() && getCosto() == suscripcion.getCosto();
    }

    // toString()
    public String toString(){ // yo escojo los valores que quiero agregar y me hace el objeto imprimible
        return "\n Tipo: \n" + tipo + "\nCosto: \n" + costo + "\nPeriodicidad \n:" + periodicidad;
    }
}
