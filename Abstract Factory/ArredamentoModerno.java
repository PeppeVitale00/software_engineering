

public class ArredamentoModerno implements ArredamentoFactory {
    @Override
    public Letto creaLetto() {
        return new LettoModerno();
    }
    @Override
    public Sedia creaSedia() {
        return new SediaModerna();
    }
    @Override
    public Lampada creaLampada() {
        return new LampadaModerna();
    }
    
}
