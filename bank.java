import java.util.*;
interface Accounts{

public void deposit();
public void withdraw();
public double interest();
public double balances();
}

class SavingsAccount implements Accounts{
double amountD;
double withdrawal;
//double withdrawal;

SavingsAccount(){
Scanner sc = new Scanner(System.in);
System.out.println("enter amount for savings account ");
amountD = sc.nextDouble();
System.out.println("enter amount you want to withdraw ");
withdrawal = sc.nextDouble();
}

public void deposit(){
System.out.println("the amount in the savings account is: "+amountD);
}
public void withdraw(){
System.out.println("the withdrwal amount in the savings account is: "+withdrawal);
}
public double interest(){
System.out.println("the interest is ");
return (amountD - withdrawal)*0.02;
}
public double balances(){
System.out.println("the balance is ");
return (amountD - withdrawal) + (amountD - withdrawal)*0.02;
}
}

class CurrentAccount implements Accounts{
double amountD;
double withdrawal;

CurrentAccount(){
Scanner sc = new Scanner(System.in);
System.out.println("enter amount for the current account ");
amountD = sc.nextDouble();
System.out.println("enter amount you want to withdraw ");
withdrawal = sc.nextDouble();
}

public void deposit(){
System.out.println("the amount in the savings account is: "+amountD);
}
public void withdraw(){
System.out.println("the withdrwal amount in the savings account is: "+withdrawal);
}
public double interest(){
System.out.println("the interest is ");
return withdrawal*0.05;
}
public double balances(){
System.out.println("the balance is ");
return (amountD - withdrawal) - (withdrawal*0.05);
}
}

public class bank{
public static void main(String[] args){

SavingsAccount sa = new SavingsAccount();
sa.deposit();
sa.withdraw();
System.out.println(sa.interest());
System.out.println(sa.balances());


CurrentAccount ca = new CurrentAccount();
ca.deposit();
ca.withdraw();
System.out.println(ca.interest());
System.out.println(ca.balances());


SavingsAccount sa1 = new SavingsAccount();
sa1.deposit();
sa1.withdraw();
System.out.println(sa1.interest());
System.out.println(sa1.balances());


CurrentAccount ca1 = new CurrentAccount();
ca1.deposit();
ca1.withdraw();
System.out.println(ca1.interest());
System.out.println(ca1.balances());

/*sa.deposit();
sa.withdraw();
System.out.println(sa.interest());
System.out.println(sa.balances());

ca.deposit();
ca.withdraw();
System.out.println(ca.interest());
System.out.println(ca.balances());*/


}
}