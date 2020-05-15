public class Garaz extends Pomieszczenie{
    public int szerokoscBramy;
    public int wysokoscBramy;

    @Override
    public int policzPole(){
        return szerokosc * dlugosc;
    }
}