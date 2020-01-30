import java.util.Scanner;
import java.text.DecimalFormat;

class Vacation{
private static DecimalFormat df2 = new DecimalFormat("#.##");
public static void main(String ...args){
Scanner input = new Scanner(System.in);
System.out.print("Welcome to Vacation Planner!\nWhat is your name? ");
String name = input.nextLine();
System.out.print("Nice to meet you "+name+", where are you travelling to? ");
String place = input.nextLine();
System.out.println("Great! "+place+" sounds like a great trip\n***********");
System.out.print("\nHow many days are you going to spend travelling? ");
int days = input.nextInt();
System.out.print("How much money, in USD, are you planning to spend on your trip? ");
int money = input.nextInt();
System.out.print("What is the three letter currency symbol for your travel destination? ");
String curr = input.next();
System.out.print("How many "+curr+" in 1 USD? ");
double curr_usd = input.nextDouble();
int hrs, min;
hrs = days*24;
min = hrs*60;
System.out.println("\nIf you are travelling for "+days+" days that is the same as "+hrs+" hours or "+min+" minutes");
double dailyusd;
dailyusd= (double)money/(double)days;
System.out.println("If you are going to spend $"+money+" USD that means per day you can spend up to $"+df2.format(dailyusd)+" USD");
double dailymxc;
dailymxc= (((double)money)*curr_usd)/(double)days;
System.out.println("Your total budget in "+curr+" is "+money*curr_usd+" MXC, which per day is "+df2.format(dailymxc)+" MXC\n***********");
System.out.print("What is the time difference, in hours, between your home and your destination? ");
int timehrs= input.nextInt();
System.out.println("That means that when it is midnight at home it will be "+timehrs+":00 in your travel destination and when it is noon at home it will be "+(int)(12+timehrs)+":00\n***********");
System.out.print("What is the square area of your destination country in km2? ");
int km2 = input.nextInt();
double miles = (double)km2*0.386102;
System.out.print("In miles2 that is "+miles+"\n***********");
}
}