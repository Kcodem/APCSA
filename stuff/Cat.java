package stuff;

// stuff.Cat class definition
public class Cat {

  // instance variables
  private String name;
  private int age;
  private double weight;

  // constructor
  public Cat(String catName, int catAge, double catWeight) {
    name = catName;
    age = catAge;
    weight = catWeight;
  }

  // method that introduces the stuff.Cat
  public void introduce() {
    if (age < 4) {
      System.out.println("Hello my name is " + name + "I am the younger cat");
    } else {
      System.out.println("Hello my name is " + name + "I am the older cat");
    }
  }

    // method that prints stuff.Cat info
     public void printCatInfo() {
      System.out.println("Name: " + name);
      System.out.println("Age: " + age);
      System.out.println("Weight: " + weight);
    }
  }



