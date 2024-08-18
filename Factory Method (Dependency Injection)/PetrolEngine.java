public class PetrolEngine implements Engine{

    @Override
    public void engineStart(){
        System.out.println("Petrol engine started");
    }
    
    @Override
    public void engineStop(){
        System.out.println("Petrol engine stopped");
    }


}
