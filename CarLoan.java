/* a program that will calculate the monthly car payment a user should expect to make after taking out a car loan. The program will include the following:

Car loan amount
Interest rate of the loan
Length of the loan (in years)
Down payment*/
public class CarLoan {
    int carLoan = 1000;
    int loanLength = 3;
    int interestRate = 5;
    int downPayment = 2000;
  
    //constructor
    public CarLoan(int amount, int length, int rate, int downpay){
          carLoan = amount;
          loanLength = length;
          interestRate = rate;
          downPayment = downpay;
    }
     
    //calculateMonthly CAR payment
    public void calculateMonthly(){
           
    if(loanLength < 0 || interestRate <= 0){
      System.out.println("Error! You must take out a valid car loan.");
    }else if(downPayment >= carLoan){
      System.out.println("The car can be paid in full.");
    }else{
      int remainingBalance = carLoan - downPayment;
      int months = loanLength * 12;
      int monthlyBalance = remainingBalance/months;
      int interest = (monthlyBalance * interestRate)/100;
      int monthlyPayment = monthlyBalance + interest;
      System.out.println(monthlyPayment);
    }
    }
      public static void main(String[] args) {
          CarLoan cl = new CarLoan(10000, 3, 5, 2000);
          cl.calculateMonthly();
      }
  }