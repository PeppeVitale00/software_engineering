//Concrete Prototype
import java.util.ArrayList;
import java.util.List;

public class NoteBook implements Agenda {
    private List<String> note;

    public NoteBook() {
        this.note = new ArrayList<>();
    }

    @Override
    public void aggiungi(String nota) {
        note.add(nota);
    }

    @Override
    public void stampa() {
        System.out.println("Note nel NoteBook:");
        for (String nota : note) {
            System.out.println(nota);
        }
    }

    @Override
    public NoteBook clone() {
        NoteBook clone = new NoteBook();
        clone.note = new ArrayList<>(this.note); // Copia profonda della lista
        return clone;
    }
}
