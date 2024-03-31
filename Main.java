public class Main {
  public static void main(String[] args) {
    // Step 1: Display item list and price
    System.out.println("Prices:");
    System.out.println("Bubblegum: " + "$" + 2);
    System.out.println("Toffee: " + "$" + 0.2);
    System.out.println("Ice cream: " + "$" + 5);
    System.out.println("Milk chocolate: " + "$" + 4);
    System.out.println("Doughnut: " + "$" + 2.5);
    System.out.println("Pancake: " + "$" + 3.2);
    System.out.println();


    // A month has passed
    // Step 2: Calculate the total earnings
    int bubblegumEarned = 202;
    int toffeeEarned = 118;
    int iceCreamEarned = 2250;
    int milkChocEarned = 1680;
    int doughnutEarned = 1075;
    int pancakeEarned = 80;
    double sumEarned = bubblegumEarned + toffeeEarned + iceCreamEarned + milkChocEarned + doughnutEarned + pancakeEarned;

    // Display earning
    System.out.println("Earned amount:");
    System.out.println("Bubblegum: " + "$" + bubblegumEarned);
    System.out.println("Toffee: " + "$" + toffeeEarned);
    System.out.println("Ice cream: " + "$" + iceCreamEarned);
    System.out.println("Milk chocolate: " + "$" + milkChocEarned);
    System.out.println("Doughnut: " + "$" + doughnutEarned);
    System.out.println("Pancake: " + "$" + pancakeEarned);
    System.out.println();
    System.out.println("Income: " + "$" + sumEarned);
  }
}
