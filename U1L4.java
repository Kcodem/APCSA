void main() {
    System.out.println("Welcome to the Game show! (10 Questions)");
    System.out.println("Would you like to continue?");
    System.out.println("Write 'Yes' or 'No'");
    Scanner input = new Scanner(System.in);
    String Start = input.nextLine();
    if (Start.equals("Yes")) {
        int Questions = 0;
        System.out.println("Question 1:");
        System.out.println("6x+5=14.");
        System.out.println("What is X?");
        Double Q1 = input.nextDouble();
        if (Q1.equals(1.5)) {
            System.out.println("Correct!");
            Questions++;
        } else
        {
            System.out.println("Incorrect.");
        }
        System.out.println("Question 2:");
        System.out.println("1+1");
        System.out.println("What is the answer?");
        int Q2 = input.nextInt();
        if (Q2 == 2) {
            System.out.println("Correct!");
            Questions++;
        } else
        {
            System.out.println("Incorrect.");
        }
        System.out.println("Question 3:");
        System.out.println("((3x + 1) / 2) + ((5x - 4) / 3) - ((2x + 7) / 4) = ((7x - 1) / 6) + 5");
        System.out.println("What is X? (Simplified)");
        String Q3 = input.nextLine();
        if (Q3.equals("idk")) {
            System.out.println("Correct!");
            Questions++;
        } else
        {
            System.out.println("Incorrect.");
        }
        System.out.println("Question 4: What is the Capital of France? (Uppercase)");
        String Q4 = input.nextLine();
        if (Q4.equals("Paris")) {
            System.out.println("Correct!");
            Questions++;
        } else
        {
            System.out.println("Incorrect.");
        }
        System.out.println("Question 5: How many states are in the U.S.?");
        int Q5 = input.nextInt();
        if (Q5 == 50) {
            System.out.println("Correct!");
            Questions++;
        } else
        {
            System.out.println("Incorrect.");
        }
        System.out.println("Question 6: 1 or 2? Pick");
        int Q6 = input.nextInt();
        if (Q6 == 2) {
            System.out.println("Correct!");
            Questions++;
        } else
        {
            System.out.println("Incorrect.");
        }
        System.out.println("Question 7: What is the powerhouse of the cell");
        String Q7 = input.nextLine();
        if (Q7.equals("Mitochondria"))
        {
            System.out.println("Correct!");
            Questions++;
        } else
        {
            System.out.println("Incorrect.");
        }
        System.out.println("Question 8: What is Apple in spanish");
        String Q8 = input.nextLine();
        if (Q8.equals("Manzana")) {
            System.out.println("Correct!");
            Questions++;
        } else
        {
            System.out.println("Incorrect.");
        }
        System.out.println("Question 9: Are you liking the quiz?");
        String Q9 = input.nextLine();
        if (Q9.equals("Yes")) {
            System.out.println("Correct!");
            Questions++;
        } else
        {
            System.out.println("Incorrect.");
        }
        System.out.println("Question 10: Was this fun?");
        String Q10 = input.nextLine();
        if (Q10.equals("Yes")) {
            System.out.println("Correct");
            Questions++;
        } else
        {
            System.out.println("It was FUN");
        }
        System.out.println("You got " + Questions + " correct!");
    }
}