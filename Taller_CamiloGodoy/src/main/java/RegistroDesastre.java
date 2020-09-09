import java.util.ArrayList;

public class RegistroDesastre {
    private ArrayList<Desastres> detalleDesastre=new ArrayList<Desastres>();
    private ArrayList<InfoDesaparecidos> listaDesaparecidos= new ArrayList<InfoDesaparecidos>();

    @Override
    public String toString() {
        return "RegistroDesastre{" +
                "detalleDesastre=" + detalleDesastre +
                ", listaDesaparecidos=" + listaDesaparecidos +
                '}';
    }

    public void actualizarListaDesaparecidos{
       listaDesaparecidos.add(new InfoDesaparecidos());

    }

}

