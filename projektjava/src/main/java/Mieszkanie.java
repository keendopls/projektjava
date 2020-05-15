public class Mieszkanie extends ElementPietra{

    public String wizytowka;
    public Pomieszczenie[] pomieszczenia;

    @Override
    public int policzPole(){
        int pole = 0;

        for(Pomieszczenie o : pomieszczenia){
            pole += o.policzPole();
        }
        return pole;
    }

}