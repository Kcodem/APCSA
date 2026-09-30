void main()
{
    //item costs
    double Apple = 0.60;
    double Pineapple = 3.59;
    double Rice = 1.39; //per pound

    //item amounts
    int NumApple = 12;
    int NumPineapple = 2;
    int NumRice = 3;
    int RiceWeight = 2; // 2 kg

    //Cash
    double CashGiven = 35;

    String Name = "Stacey";
    int Items = NumApple + NumPineapple + NumRice;
    double TotalCost = (NumApple * Apple) + (NumPineapple * Pineapple) + (((NumRice * RiceWeight) * 2.20462) * Rice);
    TotalCost = (Math.round(TotalCost *10.0)/10.0);
    double AverageCost = TotalCost / Items;
    AverageCost = (Math.round(AverageCost *10.0)/10.0);
    double ChangeReceived = CashGiven - TotalCost;
    ChangeReceived = (Math.round(ChangeReceived *10.0)/10.0);
    System.out.println("--------------------------");
    System.out.println("Customer: " + Name);
    System.out.println("Number of Items: " + Items);
    System.out.println("Total Cost: " + "$" + TotalCost);
    System.out.println("Average Cost: " + "$" + AverageCost + " per item");
    System.out.println();
    System.out.println("Cash given: " + "$" + CashGiven);
    System.out.println("Change received: " + "$" + ChangeReceived);
    System.out.println("--------------------------");
}