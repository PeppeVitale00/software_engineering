

public class ArredamentoVintage implements ArredamentoFactory{
    public Letto creaLetto() {
        return new LettoVintage();
    }

    public Sedia creaSedia() {
        return new SediaVintage();
    }

    public Lampada creaLampada() {
        return new LampadaVintage();
    }

    
}
