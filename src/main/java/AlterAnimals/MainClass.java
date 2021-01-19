package AlterAnimals;

import java.util.Scanner;

public class MainClass {
    private static Object CatFamily;
    private static Object DogFamily;
    private static Integer obstacle;

    public static void main(String[] args) {


        Animals cat = new CatFamily("Cat", "Bagir", 200, 0);
        Animals.AnimalsInfo();
//        cat.AnimalsInfo();
//      cat.catInfo();


        Animals dog = new DogFamily("Dog", "Bobik", 500, 10);
        Animals.AnimalsInfo();
        //       dog.AnimalsInfo();
        //       dog.dogInfo();

        startRun(CatFamily, DogFamily);
    }


    public static void startRun(Object catFamily, Object dogFamily, Animals... Animalss) {
        System.out.println("Введите длину препятствия для кота в метрах");
        Scanner sc = new Scanner(System.in);
        int obstacle;
        obstacle = Integer.parseInt(sc.nextLine());

        if (obstacle > 200) {
            System.out.println("Cat will be fight");
        } else {
            System.out.println("Cat will be run");
        }


    }
}

