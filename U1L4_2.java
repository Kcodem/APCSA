void main() {
    System.out.println("Please enter a 3 digit integer");
    Scanner input = new Scanner(System.in);
    int integer = input.nextInt();
    int hundred = (integer / 100);
    int ten = ((integer % 100)/10);
    int one = (integer % 10);
    System.out.println("The reverse of " + integer + " is " + one + ten + hundred);

}