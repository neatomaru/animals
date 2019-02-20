import java.io.*;

class CanadaAnimals  {

      int cats = 10;
      int dogs = 44;
      int racoons = 1;
      String countryname = "Canada";

      void returnInfo() {
          System.out.println(countryname + ":");
          System.out.println("Cats: " + this.cats);
          System.out.println("Dogs: " + this.dogs);
          System.out.println("Racoons " + this.racoons);
          System.out.println("\n");
      }
}

class USAAnimals  {

    int cats = 80;
    int dogs = 62;
    int racoons = 2;
    String countryname = "USA";

    void returnInfo() {
        System.out.println(countryname + ":");
        System.out.println("Cats: " + this.cats);
        System.out.println("Dogs: " + this.dogs);
        System.out.println("Racoons " + this.racoons);
        System.out.println("\n");
    }
}

class RussiaAnimals  {

    int cats = 120;
    int dogs = 35;
    int racoons = 0;
    String countryname = "Russia";

    void returnInfo() {
        System.out.println(countryname + ":");
        System.out.println("Cats: " + this.cats);
        System.out.println("Dogs: " + this.dogs);
        System.out.println("Racoons " + this.racoons);
        System.out.println("\n");
    }
}

class UkraineAnimals  {

    int cats = 148;
    int dogs = 3;
    int racoons = 19;
    String countryname = "Ukraine";

    void returnInfo() {
        System.out.println(countryname + ":");
        System.out.println("Cats: " + this.cats);
        System.out.println("Dogs: " + this.dogs);
        System.out.println("Racoons " + this.racoons);
        System.out.println("\n");
    }
}

class JapanAnimals  {

    int cats = 1488;
    int dogs = 200;
    int racoons = 35;
    String countryname = "Japan";

    void returnInfo() {
        System.out.println(countryname + ":");
        System.out.println("Cats: " + this.cats);
        System.out.println("Dogs: " + this.dogs);
        System.out.println("Racoons " + this.racoons);
        System.out.println("\n");
    }
}

class WorldAnimals  {

    CanadaAnimals CanadAA = new CanadaAnimals();
    USAAnimals USAA = new USAAnimals();
    RussiaAnimals RussiaA = new RussiaAnimals();
    UkraineAnimals UkraineA = new UkraineAnimals();
    JapanAnimals JapanA = new JapanAnimals();

    int cats = CanadAA.cats + USAA.cats + RussiaA.cats + UkraineA.cats + JapanA.cats;
    int dogs = CanadAA.dogs + USAA.dogs + RussiaA.dogs + UkraineA.dogs + JapanA.dogs;
    int racoons = CanadAA.racoons + USAA.racoons + RussiaA.racoons + UkraineA.racoons + JapanA.racoons;
    String countryname = "World";

    void returnInfo() {
        System.out.println(countryname + ":");
        System.out.println("Cats: " + this.cats);
        System.out.println("Dogs: " + this.dogs);
        System.out.println("Racoons " + this.racoons);
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
