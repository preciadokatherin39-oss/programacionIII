public class Paquete {
   
  private String destinario;
    private String direccion;
    private String telefono;
    private String fechadeingreso;
    private double peso;
    public Paquete(String destinario, String direccion, String telefono, String fechadeingreso, double peso,
            double dimensiones, boolean paquetefragil) {
        this.destinario = destinario;
        this.direccion = direccion;
        this.telefono = telefono;
        this.fechadeingreso = fechadeingreso;
        this.peso = peso;
        this.dimensiones = dimensiones;
        this.paquetefragil = paquetefragil;
    }
    public Paquete() {
       
    }
    private double dimensiones;
    private boolean paquetefragil;
    public String getDestinario() {
        return destinario;
    }
    public void setDestinario(String destinario) {
        this.destinario = destinario;
    }
    public String getDireccion() {
        return direccion;
    }
    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }
    public String getTelefono() {
        return telefono;
    }
    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }
    public String getFechadeingreso() {
        return fechadeingreso;
    }
    public void setFechadeingreso(String fechadeingreso) {
        this.fechadeingreso = fechadeingreso;
    }
    public double getPeso() {
        return peso;
    }
    public void setPeso(double peso) {
        this.peso = peso;
    }
    public double getDimensiones() {
        return dimensiones;
    }
    public void setDimensiones(double dimensiones) {
        this.dimensiones = dimensiones;
    }
    public boolean isPaquetefragil() {
        return paquetefragil;
    }
    public void setPaquetefragil(boolean paquetefragil) {
        this.paquetefragil = paquetefragil;
    }
}
