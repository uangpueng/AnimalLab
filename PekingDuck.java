public class PekingDuck extends Duck{
    
    @Override
    public void clean(Animal prey) {
        System.out.println(prey + "I cannot clane. I died already.");
    }
}
