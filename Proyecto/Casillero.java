
public class Casillero {
    private int id;
    private boolean disponible;
   

    public Casillero(int id) {
        this.id = id;
        this.disponible = true; // Inicialmente, el casillero está disponible
       
    }

    public void asignarPaquete(Paquete paquete) {
        if (disponible) {
            this.disponible = false;
            System.out.println("Paquete asignado al casillero " + id);
        } else {
            System.out.println("El casillero " + id + " no está disponible");
        }
    }

    public void liberarCasillero() {
        if (!disponible) {
            this.disponible = true;
            System.out.println("Casillero " + id + " liberado");
        } else {
            System.out.println("El casillero " + id + " ya está disponible");
        }
    }
}