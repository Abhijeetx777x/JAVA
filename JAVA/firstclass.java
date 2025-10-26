// class firstclass{
//     public static void main (String args []){
//         System.out.println("HelloWorld");
//         System.out.print("HelloWorld\n");
//         System.out.print("HelloWorld");
//     }
// };
// Q1

import java.util.*;
class publicclass {
    public static void printArray(int array[]){
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i]+" ");
        }
        System.out.println();
    }
    public static void main(String args[]) {
//import java.util.*;
//class publiclass{
//    public static void printMyName (String name) {
//        System.out.println(name);
//        return;
//    }
//    public static void main (String[] args) {

        // System.out.println("*");
        // System.out.println("**");
        // System.out.println("***");
        // System.out.println("****");
        // System.out.println("*****");


//        int a = 10;
//        int b = 20;
//        int sum =  a + b;
//        int diff = b - a;
//        System.out.println(diff);


//        Scanner sc = new Scanner(System.in);
//        String name = sc.next();
//        String name = sc.nextLine();
//        System.out.println(name);


//        int a = sc.nextInt();
//        int b = sc.nextInt();
//        int sum = a + b;
//       System.out.println(sum);


//        Scanner sc = new Scanner(System.in);
//        System.out.println("Enter A and B :");
//        int a = sc.nextInt();
//        int b = sc.nextInt();
//        int op = sc.nextInt();
//        System.out.println(a);
//        System.out.println(b);


//        if (age>=18 && age<=59) {
//            System.out.println("Adult");
//        } else if (age>=60) {
//            System.out.println("Senior Citizen");
//        } else if (age<=17) {
//            System.out.println("Teenager");
//        }
//        if (number%2==0){
//            System.out.println("Number is even");
//        } else {
//            System.out.println("Number is odd");
////        }
//        if (a==b){
//            System.out.println("Equal");
//        } else if (a>b) {
//            System.out.println("A is greater than B");
//        } else if (a<b) {
//            System.out.println("B is greater than A");
//        } else {
//            System.out.println("Either A or B is NOT defined or Both are NOt defined Properly");
//        }
//        if (button==1){
//            System.out.println("Hello");
//        } else if (button==2) {
//            System.out.println("Namaste");
//        } else if (button==3) {
//            System.out.println("Bonjour");
//        } else {
//            System.out.println("Greeting is NOT DEFINED");
//        }
//        switch (button){
//            case 1 : System.out.println("Hello");
//            break;
//            case 2 : System.out.println("Namaste");
//            break;
//            case 3 : System.out.println("Bonjour");
//            break;
//            default: System.out.println("Greeting NOT DEFINED");
//        }
//        System.out.println("Define Operator");
//        switch (op){
//            case 1 : System.out.println(a+b);
//            break;
//            case 2 : System.out.println(a-b);
//            break;
//            case 3 : System.out.println(a*b);
//            break;
//            case 4 : if (b==0){
//                System.out.println("Invalid Division");
//            } else {
//                System.out.println(a/b);
//            }
//            break;
//            case 5 : if (b==0){
//                System.out.println("Invalid Division");
//            } else {
//                System.out.println(a%b);
//            }
//            break;
//            default: System.out.println("OPERATOR NOT DEFINED");
//        }
//        for(int counter = 0; counter < 3; counter=counter+1){
//            System.out.println("HELLO");
//        }
//        for(int counter = 0; counter < 11; counter++) {
//            System.out.println(counter+"");
//        }
//        for(int i=0;i<11;i++){
//            System.out.println(i);
//        }

//        int i=0;
//        while(i<11){
//            System.out.println(i);
//            i++;
//        }

//        int i=0;
//        do {
//            System.out.println(i);
//            i++;
//        } while (i<11);

//        Scanner sc = new Scanner(System.in);
//        int n = sc.nextInt();
//        int sum=0;
//        for (int i = 0 ; i <=n; i++){
//            sum=sum+i;
//        }
//        System.out.println(sum);

//        Scanner sc = new Scanner(System.in);
//        int n = sc.nextInt();
//        for (int i = 0 ; i < 11; i++){
//            System.out.println(n*i);
//        }

        //PATTERNS

        // BLOCK======

//        int n=4;
//        int m=5;
//        for (int i=1;i<=n;i++){
//            for (int j = 1; j <= m; j++) {
//                System.out.print("*");
//            }
//            System.out.println();
//        }

        //HOLLOW BLOCK========

//        int n=4;
//        int m =5;
//        for (int i = 1; i <= n; i++) {
//            for (int j = 1; j <= m; j++) {
//                if (i==1 || j==1 || i==n || j==m){
//                    System.out.print("*");
//                }else{
//                    System.out.print(" ");
//                }
//            }
//            System.out.println();
//        }

        //STAIRCASE

//        int n=4;
//        for (int i = 1; i <= n; i++) {
//            for (int j = 1; j <= i; j++) {
//                System.out.print("*");
//            }
//            System.out.println();
//        }

        //INVERTED STAIRCASE

//        int n=4;
//        for (int i = n; i >= 1; i--) {
//            for (int j = 1; j <= i; j++) {
//                System.out.print("*");
//            }
//            System.out.println();
//        }

        //UP-SIDE DOWN STAIRCASE

//        int n = 4;
//        for (int i = 1; i <= n ; i++) {
//            for (int j = 1; j <= n-i ; j++) {
//                System.out.print(" ");
//            }
//            for (int j = 1; j <= i ; j++) {
//                System.out.print("*");
//            }
//            System.out.println();
//        }

        //NO. STAIRCASE

//        int n=5;
//        for (int i = 1; i <= n; i++) {
//            for (int j = 1; j <= i; j++) {
//                System.out.print(j+" ");
//            }
//            System.out.println();
//        }

        //INVERTED STAIRCASE

//        int n=5;
//        for (int i = n; i >= 1 ; i--) {   //   OR  , for(int i = 1; i <= n; i++){
//            for (int j = 1; j <= i; j++) {//   OR  ,    for(int j=1 ; j <=n-i+1 ; j++)}
//                System.out.print(j+" ");
//            }
//            System.out.println();
//        }

        //NUMBER TRIANGLE

//        int n = 5;
//        int number = 1;
//
//        for(int i=1;i <= n;i++){  // rows define lar rha hai
//            for (int j = 1; j <= i; j++) { // to count how much number is going to print
//                System.out.print(number+" ");
//                number++;
//            }
//            System.out.println();
//        }

        //0-1 TRIANGLE

//        int n= 5;
//
//        for (int i = 1; i <= n ; i++) {
//            for (int j = 1; j <= i ; j++) {
//                int sum= i+j;
//                if(sum % 2 == 0){
//                    System.out.print("1 ");
//                }else{
//                    System.out.print("0 ");
//                }
//            }
//            System.out.println();
//        }

        //BUTTERFLY PATTERN

//        int n=5;//UPPER HALF
//
//        for (int i=1;i <= n;i++){
//            for (int j = 1; j <= i ; j++) {
//                System.out.print("*");
//            }
//            int spaces = 2*(n-i);
//            for (int j = 1; j <=spaces ; j++) {
//                System.out.print(" ");
//            }
//            for (int j = 1; j <=i ; j++) {
//                System.out.print("*");
//            }
//            System.out.println();
//        }
//        //LOWER HALF
//        for (int i = n; i >= 1 ; i--){
//            for (int j = 1; j <= i ; j++) {
//                System.out.print("*");
//            }
//            int spaces = 2*(n-i);
//            for (int j = 1; j <=spaces ; j++) {
//                System.out.print(" ");
//            }
//            for (int j = 1; j <=i ; j++) {
//                System.out.print("*");
//            }
//            System.out.println();
//        }

        //SOLID RHOMBUS

//        int n=5;
//        //spaces
//        for (int i = 1; i <= n; i++) {
//            for (int j = 1; j <= n-i ; j++) {
//                System.out.print(" ");
//            }
//            //stars
//            for (int j = 1; j < 5; j++) {
//                System.out.print("*");
//            }
//            System.out.println();
//        }

//        NUMBER TRIANGLE

//        int n = 5;
//        for(int i=1;i<=n;i++){
//            for (int j = 1; j <= n-i; j++) {
//                System.out.print(" ");
//            }
//            for (int j = 1; j <=i ; j++) {
//                System.out.print(i+" i");
//            }
//            System.out.println();
//        }
        //PALANDROMIC TRIANGLE

//        int n=5;
//        for (int i = 1; i <= n ; i++) {
//            for (int j = 1; j <= n-i ; j++) {
//                System.out.print(" ");
//            }
//            for (int j = i; j >=1 ; j--) {
//                System.out.print(j);
//            }
//            for (int j = 2; j <=i ; j++) {
//                System.out.print(j);
//            }
//            System.out.println();
//        }

        //CRYSTAL

//       int n=4;
//       for (int i = 1; i <= n; i++) {
//           for (int j = 1; j <= n-i ; j++) {
//               System.out.print(" ");
//           }
//           for (int j = 1; j <= 2*i-1; j++) {
//               System.out.print("*"+" ");
//           }
//           System.out.println();
//       }
//       for (int i = n; i >= 1; i--) {
//           for (int j = 1; j <= n-i ; j++) {
//               System.out.print(" ");
//           }
//           for (int j = 1; j <= 2*i-1; j++) {
//               System.out.print("*"+" ");
//           }
//           System.out.println();
//       }
//    }
//    public static void main(String args[]){
//        Scanner sc = new Scanner(System.in);
//        String name =sc.next();
//
//        printMyName(name);
//    }
// }
//    }


//        int n=5;
//        int m=5;
//        for (int i = 0; i < n; i++) {
//            for (int j = 0; j < m; j++) {
//                System.out.print(j + " ");
//            }
//            System.out.println();
//        }

//      int[]marks= new int[3];
//      marks[0]=97;
//      marks[1]=56;
//      marks[2]=44;
//        System.out.println(marks[0]);
//        System.out.println(marks[1]);
//        System.out.println(marks[2]);
//        for (int i = 0; i < 3; i++) {
//            System.out.println(marks[i]);
//        }

//  LINEAR SEARCH

//        Scanner sc=new Scanner(System.in);
//        System.out.println("Enter Size of your Array :");

//  INPUT
//
//        int size= sc.nextInt();
//        int num[]=new int [size];
//        System.out.println("Enter Your Array :");
//
//        for (int i = 0; i < size; i++) {
//            num[i]=sc.nextInt();
//        }
//
//        System.out.println("Enter your value of X :");
//        int x= sc.nextInt();

//  OUTPUT
//
//        System.out.println("Your Array / Result:");
//        for (int i = 0; i < num.length; i++) {        //Length is same as size command used in code.
//            if (num[i] == x){
//                System.out.println("X found at index : \n"+ i);
//            }
//        }


//        Scanner sc=new Scanner(System.in);
//
//        System.out.println("Enter your rows :");
//        int rows= sc.nextInt();
//
//        System.out.println("Enter your coloums :");
//        int cols = sc.nextInt();
//
//        int[][] numbers=new int[rows][cols];
//
//        //INPUT
//        System.out.println("Enter Your Array values :");
//
//        for (int i = 0; i < rows ; i++) {
//            for (int j = 0; j < cols; j++) {
//                numbers[i][j] = sc.nextInt();
//            }
//        }

        //OUTPUT
//        System.out.println("Your Array is :");
//
//        for (int i = 0; i < rows; i++) {
//            for (int j = 0; j < cols; j++) {
//                System.out.print(numbers[i][j]+" ");
//            }
//            System.out.println();
//        }

//        Scanner sc=new Scanner(System.in);
//
//        System.out.println("Enter your rows :");
//        int rows= sc.nextInt();
//
//        System.out.println("Enter your coloums :");
//        int cols = sc.nextInt();
//
//        int[][] numbers=new int[rows][cols];
//
//        //INPUT
//        System.out.println("Enter Your Array values :");
//
//        for (int i = 0; i < rows ; i++) {
//            for (int j = 0; j < cols; j++) {
//                numbers[i][j] = sc.nextInt();
//            }
//        }
//        System.out.println("Enter your X value :");
//        int x = sc.nextInt();
//
//        for (int i = 0; i < rows; i++) {
//            for (int j = 0; j < cols; j++) {
//                if ( numbers[i][j] == x ){
//                    System.out.println( "X found at index : \n (" + i + "," + j + ")");
//                }
//            }
//        }

        //STRINGS

//        Scanner sc=new Scanner(System.in);
//        System.out.println("Enter Your Name : ");
//        String name = sc.nextLine();
//        System.out.println("NAME IS : "+ name);

        //Concatenation

//        String firstname = "Abhijeet";
//        String lastname = "Pandey";
//        String Fullname = firstname + " " +lastname;
//        System.out.println(Fullname);

        //charAt
//        for (int i = 0; i < Fullname.length(); i++) {
//            System.out.println(Fullname.charAt(i));
//        }

        //Compare
//        String name1="Tony";
//        String name2="Stark";

        //1 s1 > s2 : +ve value
        //2 s1 == s2 : 0
        //3 s1 < s2 : -ve value

//        if ( name1.compareTo(name2) == 0 ){
//            System.out.println("Strings are equal");
//        }else{
//            System.out.println("Strings are not equal");
//        }

        //SUB STRING
//        String sentence ="My name is Abhijeet";
//        String name = sentence.substring(11,sentence.length());
//        System.out.println(name+"...");

        //StringBuilder

//        StringBuilder sb = new StringBuilder("T00ny");
//        System.out.println(sb);

        //character at index 0
//        System.out.println(sb.charAt(0));

        //set character at index0
//        sb.setCharAt(0,'p');
//        System.out.println(sb);

        // insert character at index 0
//        sb.insert(0,'S');
//        System.out.println(sb);
//
//        sb.insert(4,'n');
//        System.out.println(sb);

        //delete an extra alphabets
//        sb.delete(3,5);
//        System.out.println(sb);

        //append
//        sb.append("o");
//        System.out.println(sb);

        //length
//        System.out.println(sb.length());

        //Inverse String

//        StringBuilder sb = new StringBuilder("Hello");
//        for (int i = 0; i < sb.length()/2 ; i++) {
//            int front = i;
//            int back = sb.length() - 1 - i;
//
//            char frontChar = sb.charAt(front);
//            char backChar = sb.charAt(back);
//
//            sb.setCharAt(front , backChar);
//            sb.setCharAt(back , frontChar);
//        }
//        System.out.println(sb);

        //BIT MANIPULATION

        //GET

//        int n = 5;
//        int pos = 2;
//        int bitMask = 1<<pos;
//
//        if((bitMask & n) == 0){
//            System.out.println("Bit was Zero");
//        }else {
//            System.out.println("Bit was One");
//        }

        //SET

//        int n = 5;
//        int pos = 1;
//        int bitMask = 1<<pos;
//
//        int newNumber = bitMask | n;
//        System.out.println(newNumber);

        //CLEAR

//        int n = 5;
//        int pos = 2;
//        int bitMask = 1<<pos;
//        int notBitMask = ~(bitMask);
//        int newNumber = notBitMask & n;
//
//        System.out.println(newNumber);

        //UPDATE
//        Scanner sc = new Scanner(System.in);
//        System.out.println("Enter Your Operation :");
//        int operation = sc.nextInt();
//        int n = 5;
//        int pos = 1;
//        int bitMask = 1<<pos;
//
//        if(operation==1){
//            int newNumber = bitMask | n;
//            System.out.println(newNumber);
//        }else{
//            int newBitMask = ~(bitMask);
//            int newNumber = newBitMask & n;
//            System.out.println(newNumber);
//        }

//        SORTING
        //Bubble Sorting

        int array [] = {7,8,3,1,2};

//        for (int i = 0; i < array.length - 1; i++) { // N-1
//            for (int j = 0; j < array.length - i - 1; j++) { // i in the code represent all the sorted elements so, the elements removed are equal to i so they are already at the right place in the array.
//                //which no.is larger than other
//                if(array[j] > array[j+1]){
//                    //Swap
//                    int temp = array[j];
//                    array[j]=array[j+1];
//                    array[j+1]=temp;
//                }
//            }
//        }

        //Selection Sorting

       for (int i = 0; i < array.length - 1; i++) {// N-1
           int smallest = i;
           for (int j = i+1; j < array.length; j++) {
               if(array[smallest] > array[j]){
                   smallest = j;
               }
           }
           int temp = array[smallest];
           array[smallest] = array[i];
           array[i] = temp;
       }


//      Insertion Sorting

        printArray(array);
    }
}
