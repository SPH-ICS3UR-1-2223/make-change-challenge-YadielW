import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		//Your challenge is to read in a price
		System.out.println("Hello!\nWhat is the price?");
    	double price = in.nextDouble();
    	 System.out.println("Price: $" + price);
		//Read in the amount paid
    	 System.out.println("What will you be paying?");
     	double paid = in.nextDouble();
     	 System.out.println("Money paid: $" + paid);
		//Print out the amount of change
     	 if ( paid < price ) {
     		 System.out.println("That's not enough, get out of my store!");
     		 
     	 } else {
     	double change = paid - price;
     	//if output is 1 or 2 
     	int lastDigit = (int)((change*100)%10);
     	if (lastDigit==1 || lastDigit==2 || lastDigit==6  || lastDigit==7) {
     		change = change-(lastDigit/100.0);
     	} else if (lastDigit==3 || lastDigit==4 || lastDigit==8 || lastDigit == 9) {
     		change = change + ((5-lastDigit)/100.0);
     	}
     	 System.out.println("Amount of change: $" + change);
     	//Break the change into all denominations: 
     	//$100,$50,$20,$10,$5,$2,$1,$0.25,$0.10,$0.05
     	if (change >=100) {
     		int hundredBills = (int)( change / 100);
     		change = change-(hundredBills*100);
     		System.out.println("100 Bills: " + hundredBills);
     	 } if (change>=50) {
     		 int fiftyBills = (int)(change / 50);
     		change = change-(fiftyBills*50);
     		System.out.println("50 Bills: " + fiftyBills);
     	 } if (change>=20) {
     		int twentyBills = (int)(change / 20);
     		change = change-(twentyBills*20);
     		System.out.println("20 Bills: " + twentyBills);
     	 } if (change>=10) {
     		int tenBills = (int)(change / 10);
          	change = change-(tenBills*10);
          	System.out.println("10 Bills: " + tenBills);
     	 } if (change>=5) {
     		int fiveBills = (int)(change / 5);
          	change = change-(fiveBills*5);
          	System.out.println("5 Bills: " + fiveBills);
     	 } if (change>=2) {
     		int toonies = (int)(change / 2);
          	change = change-(toonies*2);
          	System.out.println("Toonies: " + toonies);
     	} if (change>=1) {
     		int loonies = (int)(change / 1);
     		change = change-(loonies*1);
     		System.out.println("Quarters: " + loonies);
     	 } if (change>=0.25) {
     		int quarters = (int)(change / 0.25);
     		change = change-(quarters*0.25);
     		System.out.println("Quarters: " + quarters);
     	 } if (change>=0.10) {
      		int dimes = (int)(change / 0.10);
      		change = change-(dimes*0.10);
      		System.out.println("Dimes: " + dimes);
      	 } if (change>=0.05) {
      		int nikels = (int)(change / 0.05);
      		change = change-(nikels*0.05);
      		System.out.println("Nikels: " + nikels);
      	 }
	
		//As a bonus, make your project round to the nearest $0.05 like actual stores.
		
	}

}
}
