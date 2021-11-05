package home.work12.exploring.inheritance;

public class Yorkshire extends Dog
{
    private int breedWeight = 60;
    public Yorkshire(String name)
    {
        super(name);
    }

    public Yorkshire(String name, int breedWeight) {
        super(name);
    }

    // ------------------------------------------------------------
    // Small bark -- overrides speak method in Dog
    // ------------------------------------------------------------
    public String speak()
    {
        return "woof";
    }

    @Override
    public int avgBreedWeight()
    {
        return breedWeight;
    }
}