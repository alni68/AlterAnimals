package AlterAnimals;

public class DogFamily extends Animals {
    private String family;
    private String name;
    private Integer run;
    private Integer swim;

    public DogFamily(String family, String name, Integer run, Integer swim) {
        super(family,name,run, swim);
    }

    public void dogInfo() {
        System.out.println("Family: " + family + "Name: " + name + "   Will be able to run: " + run + " meters" + "   Will be able to swim: " + swim + " meters");
    }
}
