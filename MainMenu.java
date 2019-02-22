import java.io.*;

class Cats {
    double foodCat = 0.3;
    int metersCat = 50, moneyCat = 200;
    String foodNameCat = "Fish & milk.";

}

class Dogs extends Cats {
    double foodDog = 0.7;
    int metersDog = 200, moneyDog = 500;
    String foodNameDog = "Dog food & bones.";
}

class Racoons extends Dogs {
    double foodRacoons = 0.4;
    int metersRacoons = 100, moneyRacoons = 1000;
    String foodNameRacoons = "Meat & water.";
}

class CanadaAnimals extends Racoons {

    int cats = 10;
    int metersForCat = metersCat * cats;
    int foodForCat = (int)(foodCat * 30 * cats);
    int moneyForCat = moneyCat * cats;
    int dogs = 44;
    int metersForDog = metersDog * dogs;
    int foodForDog = (int)(foodDog * 30 * dogs);
    int moneyForDog = moneyDog * dogs;
    int racoons = 1;
    int metersForRacoons = metersRacoons * racoons;
    int foodForRacoons = (int)(foodRacoons * 30 * racoons);
    int moneyForRacoons = moneyRacoons * racoons;

    String countryname = "Canada";

    void returnInfo() {
        System.out.println(countryname + ":");
        System.out.println("Cats: " + this.cats);
        System.out.println("CatMeters: " + this.metersForCat + " meters");
        System.out.println("Food per month: " + this.foodForCat + " kg.");
        System.out.println("Money for cats " + this.moneyForCat + "$");
        System.out.println("Cat's food: " + foodNameCat);
        System.out.println();
        System.out.println("Dogs: " + this.dogs);
        System.out.println("DogsMeters: " + this.metersForDog + " meters");
        System.out.println("Food per month: " + this.foodForDog + " kg.");
        System.out.println("Money for dogs " + this.moneyForDog + "$");
        System.out.println("Dog's food: " + foodNameDog);
        System.out.println();
        System.out.println("Racoons " + this.racoons);
        System.out.println("RacoonsMeters: " + this.metersForRacoons + " meters");
        System.out.println("Food per month: " + this.foodForRacoons + " kg.");
        System.out.println("Money for Racoons " + this.moneyForRacoons + "$");
        System.out.println("Racoons's food: " + foodNameRacoons);
        System.out.println("\n");
    }
}

class USAAnimals extends Racoons {

    int cats = 80;
    int metersForCat = metersCat * cats;
    int foodForCat = (int)(foodCat * 30 * cats);
    int moneyForCat = moneyCat * cats;
    int dogs = 62;
    int metersForDog = metersDog * dogs;
    int foodForDog = (int)(foodDog * 30 * dogs);
    int moneyForDog = moneyDog * dogs;
    int racoons = 3;
    int metersForRacoons = metersRacoons * racoons;
    int foodForRacoons = (int)(foodRacoons * 30 * racoons);
    int moneyForRacoons = moneyRacoons * racoons;
    String countryname = "USA";

    void returnInfo() {
        System.out.println(countryname + ":");
        System.out.println("Cats: " + this.cats);
        System.out.println("CatMeters: " + this.metersForCat + " meters");
        System.out.println("Food per month: " + this.foodForCat + " kg.");
        System.out.println("Money for cats " + this.moneyForCat + "$");
        System.out.println("Cat's food: " + foodNameCat);
        System.out.println();
        System.out.println("Dogs: " + this.dogs);
        System.out.println("DogsMeters: " + this.metersForDog + " meters");
        System.out.println("Food per month: " + this.foodForDog + " kg.");
        System.out.println("Money for dogs " + this.moneyForDog + "$");
        System.out.println("Dog's food: " + foodNameDog);
        System.out.println();
        System.out.println("Racoons " + this.racoons);
        System.out.println("RacoonsMeters: " + this.metersForRacoons + " meters");
        System.out.println("Food per month: " + this.foodForRacoons + " kg.");
        System.out.println("Money for Racoons " + this.moneyForRacoons + "$");
        System.out.println("Racoons's food: " + foodNameRacoons);
        System.out.println("\n");
    }
}

class RussiaAnimals extends Racoons {

    int cats = 120;
    int metersForCat = metersCat * cats;
    int foodForCat = (int)(foodCat * 30 * cats);
    int moneyForCat = moneyCat * cats;
    int dogs = 35;
    int metersForDog = metersDog * dogs;
    int foodForDog = (int)(foodDog * 30 * dogs);
    int moneyForDog = moneyDog * dogs;
    int racoons = 0;
    String countryname = "Russia";

    void returnInfo() {
        System.out.println(countryname + ":");
        System.out.println("Cats: " + this.cats);
        System.out.println("CatMeters: " + this.metersForCat + " meters");
        System.out.println("Food per month: " + this.foodForCat + " kg.");
        System.out.println("Money for cats " + this.moneyForCat + "$");
        System.out.println("Cat's food: " + foodNameCat);
        System.out.println();
        System.out.println("Dogs: " + this.dogs);
        System.out.println("DogsMeters: " + this.metersForDog + " meters");
        System.out.println("Food per month: " + this.foodForDog + " kg.");
        System.out.println("Money for dogs " + this.moneyForDog + "$");
        System.out.println("Dog's food: " + foodNameDog);
        System.out.println();
        System.out.println("Racoons " + this.racoons);
        System.out.println("\n");
    }
}

class UkraineAnimals extends Racoons {

    int cats = 148;
    int metersForCat = metersCat * cats;
    int foodForCat = (int)(foodCat * 30 * cats);
    int moneyForCat = moneyCat * cats;
    int dogs = 32;
    int metersForDog = metersDog * dogs;
    int foodForDog = (int)(foodDog * 30 * dogs);
    int moneyForDog = moneyDog * dogs;
    int racoons = 19;
    int metersForRacoons = metersRacoons * racoons;
    int foodForRacoons = (int)(foodRacoons * 30 * racoons);
    int moneyForRacoons = moneyRacoons * racoons;
    String countryname = "Ukraine: ";

    void returnInfo() {
        System.out.println(countryname + ":");
        System.out.println("Cats: " + this.cats);
        System.out.println("CatMeters: " + this.metersForCat + " meters");
        System.out.println("Food per month: " + this.foodForCat + " kg.");
        System.out.println("Money for cats " + this.moneyForCat + "$");
        System.out.println("Cat's food: " + foodNameCat);
        System.out.println();
        System.out.println("Dogs: " + this.dogs);
        System.out.println("DogsMeters: " + this.metersForDog + " meters");
        System.out.println("Food per month: " + this.foodForDog + " kg.");
        System.out.println("Money for dogs " + this.moneyForDog + "$");
        System.out.println("Dog's food: " + foodNameDog);
        System.out.println();
        System.out.println("Racoons " + this.racoons);
        System.out.println("RacoonsMeters: " + this.metersForRacoons + " meters");
        System.out.println("Food per month: " + this.foodForRacoons + " kg.");
        System.out.println("Money for Racoons " + this.moneyForRacoons + "$");
        System.out.println("Racoons's food: " + foodNameRacoons);
        System.out.println("\n");
    }
}

class JapanAnimals extends Racoons {

    int cats = 1488;
    int metersForCat = metersCat * cats;
    int foodForCat = (int)(foodCat * 30 * cats);
    int moneyForCat = moneyCat * cats;
    int dogs = 200;
    int metersForDog = metersDog * dogs;
    int foodForDog = (int)(foodDog * 30 * dogs);
    int moneyForDog = moneyDog * dogs;
    int racoons = 55;
    int metersForRacoons = metersRacoons * racoons;
    int foodForRacoons = (int)(foodRacoons * 30 * racoons);
    int moneyForRacoons = moneyRacoons * racoons;
    String countryname = "Japan";

    void returnInfo() {
        System.out.println(countryname + ":");
        System.out.println("Cats: " + this.cats);
        System.out.println("CatMeters: " + this.metersForCat + " meters");
        System.out.println("Food per month: " + this.foodForCat + " kg.");
        System.out.println("Money for cats " + this.moneyForCat + "$");
        System.out.println("Cat's food: " + foodNameCat);
        System.out.println();
        System.out.println("Dogs: " + this.dogs);
        System.out.println("DogsMeters: " + this.metersForDog + " meters");
        System.out.println("Food per month: " + this.foodForDog + " kg.");
        System.out.println("Money for dogs " + this.moneyForDog + "$");
        System.out.println("Dog's food: " + foodNameDog);
        System.out.println();
        System.out.println("Racoons " + this.racoons);
        System.out.println("RacoonsMeters: " + this.metersForRacoons + " meters");
        System.out.println("Food per month: " + this.foodForRacoons + " kg.");
        System.out.println("Money for Racoons " + this.moneyForRacoons + "$");
        System.out.println("Racoons's food: " + foodNameRacoons);
        System.out.println("\n");
    }
}

class WorldAnimals extends Racoons {

    CanadaAnimals CanadAA = new CanadaAnimals();
    USAAnimals USAA = new USAAnimals();
    RussiaAnimals RussiaA = new RussiaAnimals();
    UkraineAnimals UkraineA = new UkraineAnimals();
    JapanAnimals JapanA = new JapanAnimals();

    int cats = CanadAA.cats + USAA.cats + RussiaA.cats + UkraineA.cats + JapanA.cats;
    int metersForCat = metersCat * cats;
    int foodForCat = (int)(foodCat * 30 * cats);
    int moneyForCat = moneyCat * cats;
    int dogs = CanadAA.dogs + USAA.dogs + RussiaA.dogs + UkraineA.dogs + JapanA.dogs;
    int metersForDog = metersDog * dogs;
    int foodForDog = (int)(foodDog * 30 * dogs);
    int moneyForDog = moneyDog * dogs;
    int racoons = CanadAA.racoons + USAA.racoons + RussiaA.racoons + UkraineA.racoons + JapanA.racoons;
    int metersForRacoons = metersRacoons * racoons;
    int foodForRacoons = (int)(foodRacoons * 30 * racoons);
    int moneyForRacoons = moneyRacoons * racoons;
    String countryname = "World";

    void returnInfo() {
        System.out.println(countryname + ":");
        System.out.println("Cats: " + this.cats);
        System.out.println("CatMeters: " + this.metersForCat + " meters");
        System.out.println("Food per month: " + this.foodForCat + " kg.");
        System.out.println("Money for cats " + this.moneyForCat + "$");
        System.out.println("Cat's food: " + foodNameCat);
        System.out.println();
        System.out.println("Dogs: " + this.dogs);
        System.out.println("DogsMeters: " + this.metersForDog + " meters");
        System.out.println("Food per month: " + this.foodForDog + " kg.");
        System.out.println("Money for dogs " + this.moneyForDog + "$");
        System.out.println("Dog's food: " + foodNameDog);
        System.out.println();
        System.out.println("Racoons " + this.racoons);
        System.out.println("RacoonsMeters: " + this.metersForRacoons + " meters");
        System.out.println("Food per month: " + this.foodForRacoons + " kg.");
        System.out.println("Money for Racoons " + this.moneyForRacoons + "$");
        System.out.println("Racoons's food: " + foodNameRacoons);
        System.out.println("\n");
    }
}

class Menu {
    void showMainMenu() {
        System.out.println("Choose country: ");
        System.out.println(" 1. Canada");
        System.out.println(" 2. USA");
        System.out.println(" 3. Russia");
        System.out.println(" 4. Ukraine");
        System.out.println(" 5. Japan");
        System.out.println(" 6. World");
        System.out.println("If you wanna quit - press q");
    }

    boolean isValid(int ch) {
        if (ch < '1' | ch > '6' & ch != 'q') return false;
        else return true;
    }

    void animals(int what) {
        switch (what) {
            case '1': {
                CanadaAnimals CanadAA = new CanadaAnimals();
                CanadAA.returnInfo();
                break;

            }
            case '2': {
                USAAnimals USAA = new USAAnimals();
                USAA.returnInfo();
                break;
            }
            case '3': {
                RussiaAnimals RussiaA = new RussiaAnimals();
                RussiaA.returnInfo();
                break;
            }
            case '4': {
                UkraineAnimals UkraineA = new UkraineAnimals();
                UkraineA.returnInfo();
                break;
            }
            case '5': {
                JapanAnimals JapanA = new JapanAnimals();
                JapanA.returnInfo();
                break;
            }
            case '6': {
                WorldAnimals WorldA = new WorldAnimals();
                WorldA.returnInfo();
                break;
            }
        }
    }

}




class MainMenu {
    public static void main(String args[]) {
        char choice, ignore;
        Menu info = new Menu();
        try {
            for (; ; ) {
                do {
                    info.showMainMenu();

                    choice = (char) System.in.read();

                    do {
                        ignore = (char) System.in.read();
                    } while (ignore != '\n');
                } while (!info.isValid(choice));
                if (choice == 'q') break;
                System.out.println("\n");
                info.animals(choice);
            }
        } catch (IOException ex) {
            System.out.println("An exception has occured!");
        }
    }
}
