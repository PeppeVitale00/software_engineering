public class EngineFactory {

    public static Engine createEngine(String type){
        
        if(type.equalsIgnoreCase("Petrol")) {
            return new PetrolEngine();
        }
        else if(type.equalsIgnoreCase("Diesel")){
            return new DieselEngine();
        }throw new IllegalArgumentException("Unknown engine type");
        
    }
    
}
