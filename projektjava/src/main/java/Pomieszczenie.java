public class Pomieszczenie extends ElementPietra{

    public int szerokosc, dlugosc;
    public String nazwa;


    @Override
    public int policzPole() {
        return szerokosc * dlugosc;
    }

}