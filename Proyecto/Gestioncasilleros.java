import java.util.ArrayList;
import java.util.List;

public class Gestioncasilleros {
    private List<Casillero>casillero;
    private int cantidadCasilleros;

    public Gestioncasilleros(int cantidadCasilleros){
        this.cantidadCasilleros=cantidadCasilleros;
        this.casillero=new ArrayList<>();
        for(int i=0; i<cantidadCasilleros; i++){
            casillero.add(new Casillero(i));
        }
    }

    public List<Casillero> getCasillero() {
        return casillero;
    }

    public void setCasillero(List<Casillero> casillero) {
        this.casillero = casillero;
    }

    public int getCantidadCasilleros() {
        return cantidadCasilleros;
    }

    public void setCantidadCasilleros(int cantidadCasilleros) {
        this.cantidadCasilleros = cantidadCasilleros;
    }

    public void casillero()
}
