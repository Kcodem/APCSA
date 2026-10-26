import stuff.Cat;

public static void main(String[] args) {

        // creating one instance/object from the Rectangle class
        Cat Cat1 = new Cat("Penny", 6, 20);
        Cat1.introduce();
        Cat1.printCatInfo();

        Cat Cat2 = new Cat("Washington", 2, 100);
        Cat2.printCatInfo();
        Cat2.introduce();
    }

