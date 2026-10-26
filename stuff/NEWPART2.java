package stuff;

public class NEWPART2 {
     // Problem 1: Exam Average

    public double average(double t1, double t2, double t3, double t4) {
        double average = (t1 + t2 + t3 +t4)/4;
        return average;
    }

    public int roundAverage(double average) {
        int roundAverage = (int) (average + 0.5);
        return roundAverage;
    }

    public boolean isPassing(int roundedAverage) {
        boolean isPassing = roundedAverage >= 65;
        return isPassing;
    }

    /*
    Problem 2: Stock Price
    */

    public double totalStock(int shares, double price) {
        double totalStock = (shares * price);
        return totalStock;
    }


    public int roundValueChange(double totalStock) {
        if (totalStock < 0){
            int roundValueChange = (int) (totalStock - 0.5);
            return roundValueChange;
        }
        else {
            int roundValueChange = (int) (totalStock + 0.5);
            return roundValueChange;
        }
    }

    /*
    Problem 3: Digit Incrementer
    */

    public double adjustDigits(double userDouble) {
        int wholeUser = (int) (userDouble * 100);
        int whole1 = (((int) (wholeUser / 10000)) + 1) % 10;
        int whole2 = (((int) ((wholeUser % 10000)/1000))+1) % 10;
        int whole3 = (((int) ((wholeUser % 1000)/100))+1) % 10;
        int whole4 = (((int) ((wholeUser % 100)/10))+1) % 10;
        int whole5 = (((int) (wholeUser % 10))+1) % 10;
        if (wholeUser >= 10000){
            String newWholeUser = ("whole1 + whole2 + whole3 + whole4 + whole5");
            double adjustDigits = Double.parseDouble(newWholeUser); System.out.println(adjustDigits);
            return adjustDigits;
        } else if (wholeUser >= 1000){
            String newWholeUser = ("whole2 + whole3 + whole4 + whole5");
            double adjustDigits = Double.parseDouble(newWholeUser); System.out.println(adjustDigits);
            return adjustDigits;
        } else {
            String newWholeUser = ("whole3 + whole4 + whole5");
            double adjustDigits = Double.parseDouble(newWholeUser); System.out.println(adjustDigits);
            return adjustDigits;
        }
    }

    public static void main(String[] args) {
        NEWPART2 s = new NEWPART2();
        System.out.println(s.adjustDigits(120.90));
        //231.01
    }
}
