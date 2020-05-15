public class Budynek implements Powierzchnia{
    
    public int powierzchniaDzialki;
    public int iloscPieter;
    public Pietro[] pietra;
    public Garaz[] garaze;
    
    @Override 
    public int policzPole(){
        int pole = 0;
        
        for(Pietro o : pietra) pole += o.policzPole();
        for(Garaz o : garaze) pole += o.policzPole();
        
        return pole;
    }
    
}
