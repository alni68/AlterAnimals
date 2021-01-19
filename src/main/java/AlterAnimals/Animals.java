package AlterAnimals;

public class Animals {
    private static String family;
    private static String name;
    private static Integer run;
    private static Integer swim;

    public Animals(String family, String name, Integer run, Integer swim) {
        this.family = family;
        this.name = name;
        this.run = run;
        this.swim = swim;
    }

    public String getFamily(){
        return family;
    }

    public String getName() {
        return name;
    }

    public Integer getRun() {
        return run;
    }

    public Integer getSwim(){
        return swim;
    }

    public static void AnimalsInfo() {
        System.out.println("Family: " + family + "    Name: " + name + "   Will be able to run: " + run + " meters" + "   Will be able to swim: " + swim + " meters");
    }
}
