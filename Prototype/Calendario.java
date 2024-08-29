//Concrete Prototype
import java.util.ArrayList;
import java.util.List;

public class Calendario implements Agenda {
    private List<String> eventi;

    public Calendario() {
        this.eventi = new ArrayList<>();
    }

    @Override
    public void aggiungi(String evento) {
        eventi.add(evento);
    }

    @Override
    public void stampa() {
        System.out.println("Eventi nel Calendario:");
        for (String evento : eventi) {
            System.out.println(evento);
        }
    }

    @Override
    public Calendario clone() {
        Calendario clone = new Calendario();
        clone.eventi = new ArrayList<>(this.eventi); // Copia profonda della lista
        return clone;
    }
}
