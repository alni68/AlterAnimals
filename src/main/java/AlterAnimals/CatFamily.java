package AlterAnimals;

public class CatFamily extends Animals {
    private String family;
    private String name;
    private Integer run;
    private Integer swim;

    public CatFamily(String family, String name, Integer run, Integer swim) {
        super(family, name, run, swim);
    }

    public void catInfo() {
        System.out.println("Family: " + family + "Name: " + name + "   Will be able to run: " + run + " meters" + "   Will be able to swim:" + swim);
    }
}
