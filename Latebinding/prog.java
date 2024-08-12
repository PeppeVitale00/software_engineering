import java.util.Random;

public class prog {

    public static void main(String[] args) {
        Random random = new Random();

        Persona P = new Persona();
        Studente S = new Studente();
        Persona PX = new Persona();

        int i= random.nextInt(20);

        if(i<10) PX=P;
        else PX=S;

        PX.printAll();

    }
    


    //LATE BINDING: viene deciso a runtime quale metodo deve essere utilizzato. In questo caso, se i<10, ma lo sappiamo solo a runtime, viene PX diventa una persona
    //viene per tanto utilizzato il metodo printall() di persona, diversamente, verrà utilizzato printall() di studente
}
