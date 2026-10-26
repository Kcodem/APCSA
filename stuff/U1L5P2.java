void main() {
    Scanner scan = new Scanner(System.in);

    System.out.print("Please enter an amount: ");
    double input = scan.nextDouble();
    double money = Math.round(input * 100);
    int quarters = 0;
    int dimes = 0;
    int nickels = 0;
    int pennies = 0;

    while (money > 0) {
        if (money - 25 >= 0) {
            quarters++;
            money = money - 25;
        } else if (money - 10 >= 0) {
            dimes++;
            money = money - 10;
        } else if (money - 5 >= 0) {
            nickels++;
            money = money - 5;
        } else if (money - 1 >= 0) {
            pennies++;
            money = money - 1;
        } else {
            break;
        }
    }

    int total = quarters + dimes + nickels + pennies;
    System.out.println("The minimum amount of coins is: " + total);
    System.out.println(quarters + " Quarters");
    System.out.println(dimes + " Dimes");
    System.out.println(nickels + " Nickels");
    System.out.println(pennies + " Pennies");

    scan.close();
}