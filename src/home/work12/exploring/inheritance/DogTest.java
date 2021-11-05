package home.work12.exploring.inheritance;

public class DogTest
{
    public static void main(String[] args)
    {
        Dog labrador = new Labrador("Spake", "white");
        Dog yorkshire = new Yorkshire("Rex");

        System.out.println("Labrador average weight = " + labrador.avgBreedWeight());
        System.out.println("Yorkshire average weight = " + yorkshire.avgBreedWeight());
    }
}