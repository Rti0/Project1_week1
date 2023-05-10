//import static jdk.internal.org.jline.utils.Colors.s;

//
//public class Main {
//    public static void main(String[] args) {
        //Question 1
//            System.out.println("Hello World");
//        }
        //Question 2
//            String a="reem ";
//            String b = " ibrahim";
//            {
//                System.out.println(a+b);
//        }
//  }
//    }
//        //Question 3
public class Main {
    public static void main(String[] args) {
        int a = 1;
        int b = 2;
        int c = 3;
        int result = max(a,b,c);
        System.out.println(result);
    }

    public static int max(int a, int b, int c) {
            if (a >= b && a >= c)
                return a;
            else if (b >= a && b >= c)
                return b;
            else
                return c;
        }
//        Question 4
        public static double SumAndAverage(int a, int b, int c){
        int sum = a + b + c;
        double avg = sum / 3.0;
        return avg;
        }}
        //Question 5
//import java.util.Scanner;
//public class Main {
//    public static void main(String[] args) {
//        Scanner input = new Scanner(System.in);
//        System.out.println("input a");
//        double a = input.nextDouble();
//        System.out.println("input b");
//        double b = input.nextDouble();
//        System.out.print("Enter the operation (+, -, *, /): ");
//        char c = input.next().charAt(0);
//        char operation = input.next().charAt(0);
//        double res = calculate(a, b, operation);
//        System.out.println(res);
//    }
//        public static double calculate(double a, double b, char c) {
//            double res = 0;
//            switch (c) {
//                case '+':
//                    res = a + b;
//                    break;
//                case '-':
//                    res = a - b;
//                    break;
//                case '*':
//                    res = a * b;
//                    break;
//                case '/':
//                    if (b == 0) {
//                        System.out.println("Cannot divide by zero");
//                        System.exit(0);
//                    }
//                    res = a / b;
//                    break;
//                default:
//                    System.out.println("Invalid operation");
//                    System.exit(0);
//            }
//            return res;
//        }}

        //challenge1
//        public class Main {
//        static String[] names = {"Reem","mona","mona","Ali","Hind","Ali"};
//    public static void main(String[] args) {
//        printUniqueNumbers(names);   }
//    public static void printUniqueNumbers(String[] arr) {
//            for (int i = 0; i < arr.length; i++) {
//
//                boolean f = true;
//
//                for (int j = 0; j < arr.length; j++) {
//
//                    if (i != j && arr[i] == arr[j]) {
//                        f = false;
//                        break;
//                    }
//                }
//                if (f) {
//                    System.out.print(arr[i] + " ");
//                }
//            }
//        }
//    }
        //challenge2
//        public class Main {
//    public static int countVowels(String s) {
//        int count = 0;
//        for (int i = 0; i < s.length(); i++) {
//            switch (s.toLowerCase().charAt(i)) {
//                case 'a':
//                case 'e':
//                case 'i':
//                case 'o':
//                case 'u':
//                    count++;
//                    break;
//            }       }
//        return count;    }
//    public static void main(String[] args) {
//        String str = "Welcome to Tuwaiq Academy ";
//        int vowels = countVowels(str);
//        System.out.println(vowels);    } }

//challenge 3
//      public class Main {
//          public static void main(String[] args) {
//          String[] w = input.split(" ");
//
//          for (String r : w) {
//
//              System.out.println(r);
//
//          } }
//
//        static String input = "Hello World!";
//}


