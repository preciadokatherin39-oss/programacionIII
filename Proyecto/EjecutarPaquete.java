public class EjecutarPaquete {
    @SuppressWarnings("unused")
    public static void main(String[] args) {
        Paquete op =new Paquete(
        "katherin", 
        "Cra x 123", // Dirección
        "3104200350", // Teléfono
        "17-9-25", // Fecha de ingreso
        2.5, // Peso
        11.0, // Dimensiones
        false  // Paquete frágil
    );
    System.out.println("destinario:"+op.getDestinario());
     System.out.println("direccion:"+op.getDireccion());
      System.out.println("telefono:"+op.getTelefono());
       System.out.println("fecha:"+op.getFechadeingreso());
        System.out.println("peso:"+op.getPeso());

    
    
    

    
    }
}
