import stuff.ChatBot;

import java.util.Scanner;

void main(String[] args) {
    ChatBot StudentGPT = new ChatBot("StudentGPT", 0);
    Scanner myScanner = new Scanner(System.in);
    System.out.print("Enter your name: ");
    String yourName = myScanner.nextLine();
    StudentGPT.greeting(yourName);

    System.out.print("Enter your favorite number: ");
    int yourNumber = myScanner.nextInt();
    StudentGPT.favoriteNumber(yourNumber);

    StudentGPT.weather();

    System.out.print("Enter number of feet: ");
    int numFeet = myScanner.nextInt();
    double meter = StudentGPT.convertFeetToMeters(numFeet);
    System.out.println(numFeet + " feet to meters is " + meter + " meters ");

    System.out.println("Enter number 1: ");
    int num1 = myScanner.nextInt();
    System.out.println("Enter number 2: ");
    int num2 = myScanner.nextInt();
    System.out.println("Enter number 3: ");
    int num3 = myScanner.nextInt();
    int result = StudentGPT.addNumbers(num1,num2,num3);
    System.out.println("The total is: " + result);

    String feeling = StudentGPT.feeling();
    System.out.println(feeling);

    System.out.println("Enter max number: ");
    int max = myScanner.nextInt();
    myScanner.nextLine();
    int randomYA = StudentGPT.returnRandom(max);
    System.out.println("random number: "+ randomYA);

    System.out.println("Enter favorite season: ");
    String yourSeason = myScanner.nextLine();
    StudentGPT.favoriteSeason(yourSeason);

    System.out.println("Enter favorite color: ");
    String yourColor = myScanner.nextLine();
    System.out.println();
    System.out.println(StudentGPT.favoriteColor(yourColor));

    System.out.println("Enter your grade percentage (with no %): ");
    int yourGrade = myScanner.nextInt();
    myScanner.nextLine();
    System.out.println(StudentGPT.Percentage(yourGrade));


    System.out.println("Enter your favorite teacher: ");
    String teacher1 = myScanner.nextLine();
    System.out.println("Enter your second favorite teacher: ");
    String teacher2 = myScanner.nextLine();
    System.out.println("Enter your most mid teacher: ");
    String teacher3 = myScanner.nextLine();
    System.out.println("Enter a teacher you dislike: ");
    String teacher4 = myScanner.nextLine();
    System.out.println("Enter a teacher you hate: ");
    String teacher5 = myScanner.nextLine();
    StudentGPT.teacherRankings(teacher1, teacher2, teacher3, teacher4, teacher5);

    String bye = StudentGPT.goodbye();
    System.out.println(bye);




}
