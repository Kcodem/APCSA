package stuff;

import java.util.Random;
     public class ChatBot {

         // instance variables
         private String name;
         private int number;

         // constructor
         public ChatBot(String chatBotName, int faveNum) {
             name = chatBotName;
             number = faveNum;
         }

         // void method that prints a greeting
         public void greeting(String yourName) {
             System.out.println("Hello, " + yourName + " my name is " + name); // name is an instance variable
             System.out.println("and I am a chat bot! How are you today?");
         }

         // void method that prints the weather
         public void weather() {
             System.out.println("I actually don't know much about the weather! Ha ha!");
             System.out.println("But I know it's warm and dry inside a computer! Ha ha!");
         }

         // method that converts feet to meters and returns the meters
         public double convertFeetToMeters(int numFeet) {
             final double METERS_PER_FOOT = 0.3048;
             return METERS_PER_FOOT * numFeet;
         }

         // void method that prints information about favorite numbers
         public void favoriteNumber(int yourNumber) {
             int distance = yourNumber - number;  // number is an instance variable
             System.out.println("My favorite number is " + number);
             System.out.println("That is " + distance + " away from your number!");
         }

         // method that adds and returns the sum of three numbers
         public int addNumbers(int num1, int num2, int num3) {
             return num1 + num2 + num3;
         }

         // method that returns a goodbye message -- note that this method does not print a string, but
         // rather RETURNS a string
         public String goodbye() {
             return "It was nice talking with you! Have a great day! Sincerely, " + name;
         }

         public String feeling() {
             return "How am I feeling? I'm a piece of code! How am I supposed to know?";
         }

         public void favoriteSeason(String yourSeason) {
             System.out.println("Your favorite season is " + yourSeason + "? Thats cool! My favorite season is Winter");
         }
         public int returnRandom(int max) {
             Random rand = new Random();
             int randomInt = rand.nextInt(max);
             return randomInt;
         }
         // Morgan's Methods
         public String favoriteColor(String yourColor) {
             if ((yourColor.equals("red")) || (yourColor.equals("Red"))){
                 return "Your favorite color is " + yourColor + "? Me too!";
             } else {
                 return "Your favorite color is " + yourColor + "? Thats cool! My favorite color is red!";
             }
         }

         public String Percentage(int yourGrade) {
             if (97 <= yourGrade){
                 return "You have an A+";
             } else if (93 <= yourGrade && yourGrade <= 96){
                 return "You have an A";
             } else if (90 <= yourGrade && yourGrade <= 92){
                 return "You have an A-";
             } else if (87 <= yourGrade && yourGrade <= 89){
                 return "You have a B+";
             } else if (83 <= yourGrade && yourGrade <= 86){
                 return "You have a B";
             } else if (80 <= yourGrade && yourGrade <= 82){
                 return "You have a B-";
             } else if (77 <= yourGrade && yourGrade <= 79){
                 return "You have a C+";
             } else if (73 <= yourGrade && yourGrade <= 76){
                 return "You have a C";
             } else if (70 <= yourGrade && yourGrade <= 72){
                 return "You have a C-";
             } else if (67 <= yourGrade && yourGrade <= 69){
                 return "You have a D+";
             } else if (65 <= yourGrade && yourGrade <= 66){
                 return "You have a D";
             } else
                 return "You have a F-   Go study now.";
         }

         public void teacherRankings(String teacher1, String teacher2, String teacher3, String teacher4, String teacher5) {
             System.out.println("Rank 1: " + teacher1);
             System.out.println("Rank 2: " + teacher2);
             System.out.println("Rank 3: " + teacher3);
             System.out.println("Rank 4: " + teacher4);
             System.out.println("Rank 5: " + teacher5);



         }

    }
