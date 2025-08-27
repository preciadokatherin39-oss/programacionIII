package Clase4;

public class Libro {
     //Atributos
    private  String Titulo;
    private String Autor;
    private double Precio;
    public Libro(String titulo, String autor, double precio) {
        Titulo = titulo;
        Autor = autor;
        Precio = precio;
    }
    public String getTitulo() {
        return Titulo;
    }
    public void setTitulo(String titulo) {
        Titulo = titulo;
    }
    public String getAutor() {
        return Autor;
    }
    public void setAutor(String autor) {
        Autor = autor;
    }
    public double getPrecio() {
        return Precio;
    }
    public void setPrecio(double precio) {
        Precio = precio;
    }
    @Override
    public String toString() {
        
          return "Libro{ Titulo" + Titulo+ " Precio " + Precio+ " Autor " + Autor + "}";
    }
        public void precio(Libros[]Libros){
            double total =0.0;
        for(int i=0; i< Libros.length;i++){
            if(Libros)[i].getPrecio().equals(libros){
                contador++;
            }
        }
        }
    }




