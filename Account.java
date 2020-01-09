//*******************************************************
// Account.java
//
// A bank account class with methods to deposit to, withdraw from,
// change the name on, charge a fee to, and print a summary of the account.
//*******************************************************

public class Account
{
  private double balance;
  private String name;
  private int acctNum;

  //----------------------------------------------
  //Constructor -- initializes balance, owner, and account number
  //----------------------------------------------
  public Account(double initBal, String owner, int number)
  {
    balance = initBal;
    name = owner;
    acctNum = number;
  }

  //----------------------------------------------
  // Checks to see if balance is sufficient for withdrawal.
  // If so, decrements balance by amount; if not, prints message.
  //----------------------------------------------
  public void withdraw(double amount)
  {
    if (balance >= amount)
       balance -= amount;
    else
       System.out.println("Insufficient funds");
  }

  //----------------------------------------------
  // Adds deposit amount to balance.
  //----------------------------------------------
  public void deposit(double amount)
  {
    balance += amount;
  }

  //----------------------------------------------
  // Returns balance.
  //----------------------------------------------
  public double getBalance()
  {
    return balance;
  }


  //----------------------------------------------
  // Returns a string containing the name, account number, and balance.
  //----------------------------------------------
  public String toString()
  {
    return "name: " + name + "\naccount number: " + acctNum + "\nbalance: " + balance;
  }

  //----------------------------------------------
  // Deducts $10 service fee
  //----------------------------------------------
  public void chargeFee()
  {
    balance -= 10;
  }

  //----------------------------------------------
  // Changes the name on the account 
  //----------------------------------------------
  public void changeName(String newName)
                          
  {
    name = newName;
  }

}