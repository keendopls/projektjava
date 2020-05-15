public class Pietro implements Powierzchnia{
    
    public int numerPietra;
    public ElementPietra[] elementy;
    public int iloscPomieszczen;
    
    @Override
    public int policzPole(){
        int pole = 0;
        
        for(ElementyPietra e : elementy){
            pole+=e.policzPole();
        }
        return pole;
    }
    
}
