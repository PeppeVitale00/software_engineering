
public class Main {
    public static void main(String[] args) {
        // Creare un calendario e aggiungere eventi
        Calendario calendario = new Calendario();
        calendario.aggiungi("Conferenza alle 10:00");
        calendario.aggiungi("Meeting alle 14:00");
        
        // Clonare il calendario
        Calendario calendarioClone = calendario.clone();
        calendarioClone.aggiungi("Cena alle 20:00");
        
        // Stampare il calendario originale e quello clonato
        calendario.stampa();
        calendarioClone.stampa();

        // Creare un notebook e aggiungere note
        NoteBook notebook = new NoteBook();
        notebook.aggiungi("Acquistare il latte");
        notebook.aggiungi("Leggere il libro di design patterns");
        
        // Clonare il notebook
        NoteBook notebookClone = notebook.clone();
        notebookClone.aggiungi("Fare jogging domani mattina");
        
        // Stampare il notebook originale e quello clonato
        notebook.stampa();
        notebookClone.stampa();
    }
    
}
