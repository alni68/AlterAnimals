package AlterAnimals;

public class MainClass {
    public static void main(String[] args) {


        CatFamily cat = new CatFamily("Cat", "Bagir", 200, 0);
        Animals.AnimalsInfo();
//        cat.AnimalsInfo();
//      cat.catInfo();


        DogFamily dog = new DogFamily("Dog", "Bobik", 500, 10 );
        Animals.AnimalsInfo();
 //       dog.AnimalsInfo();
 //       dog.dogInfo();
    }
}
