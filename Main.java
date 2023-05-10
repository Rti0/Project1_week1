import java.util.Scanner;
public class Main {

    //Question 1
    public static void print() {
        System.out.println("Hello world");
    }
    //Question 2
     public static String combine(String a, String b) {
 return a +b;
}
    //Question 3
 public static int max(int a, int b, int c) {
 if (a >= b && a >= c)
return a;
 else if (b >= a && b >= c)
     return b;
     else
     return c;
}
    //Question 4
 public static String SumAndAverage(int a, int b, int c) {
int sum=a + b + c;
     double avg=sum/3.0;
     return "sum="+sum+"\t"+"average="+avg;
 }
    //Question 5
public static String calculator(double a, double b) {
     System.out.print("Enter the operation (+, -, *, /): ");
Scanner p = new Scanner(System.in);
 char c = p.next().charAt(0);
 double res=0;
         switch (c) {
 case '+':
res= a + b;
 break;
 case '-':
     res= a - b;
     break;
 case '*':
     res= a * b;
     break;
case '/':
 if (b == 0) {
 System.out.println("Cannot divide by zero");
 System.exit(0);
}
    res= a / b;
 break;
 default:
System.out.println("Invalid operation");
 System.exit(0);
 }
return "number1="+a+"\t\t"+"number2="+b+"\t\t"+"result="+res;
 }
 //challenge1
  public static void printUniqueNumbers(int[] arr) {

for(int i = 0; i < arr.length; i++) {

 boolean f = true;

 for(int j = 0; j < arr.length; j++) {

if(i != j && arr[i] == arr[j]) {
f = false;
break; } }
 if(f) {
 System.out.print(arr[i] + " ");
 } } }
    //challenge2
 public static int countVowels(String s) {
int count = 0;
 for (int i = 0; i < s.length(); i++) {
 switch (s.toLowerCase().charAt(i)) {
 case 'a':
 case 'e':
 case 'i':
 case 'o':
 case 'u':
 count++;
 break;
 } }
 return count; }
    //challenge3
    public static void splitAndPrint(String s) {

        String[] w = s.split(" ");

        for (String r : w) {

            System.out.println(r);

        } }


    public static void main(String[] args) {
//called method 1
        print();
        System.out.println("*******************************************");
        //called method 2
        System.out.println(combine("combinedString :"+"welcome in ","java"));
        System.out.println("*******************************************");
        //called method 3
        System.out.println("The greatest number is: " + max(4,8,2));
        System.out.println("*******************************************");
        //called method 4
        System.out.println(SumAndAverage(4,5,2));
        System.out.println("*******************************************");
        Scanner p = new Scanner(System.in);
System.out.print("Enter the first number: ");
 double a = p.nextDouble();
 System.out.print("Enter the second number: ");
 double b = p.nextDouble();
        System.out.println(calculator(a,b));
        System.out.println("*******************************************");
        //called method 5
        int [] arr = {5, 9, 1, 7, 5, 9, 3, 6, 6, 7, 8};
        System.out.print("Unique Numbers is : ");
        printUniqueNumbers(arr);
        System.out.println();
        System.out.println("*******************************************");
        System.out.println("Total vowels:"+ countVowels("welcome everybody in saudi arabia"));
        System.out.println("*******************************************");
        System.out.println("split And Print string : ");
        splitAndPrint("welcome everybody in saudi arabia");
        }
    }
