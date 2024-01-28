package JavaCalultor;

import java.util.Scanner;

public class JavaCalculator {

	
	    public static void main(String[] args) {
	        Scanner sc = new Scanner(System.in);
	        int n = 0;
	        try {
	            do {
	                System.out.println(
	                        " 1.ArmStrongNumber\n 2.FactorialNumber\n 3.StrongNumber\n 4.NeonNumber\n 5.NivenNumber\n 6.SpyNumber\n 7.HappyNumber\n 8.PerfectNumber\n 9.PrimeNumber\n 10.SaturdayNumber\n 11.PalindromeNumber\n 12.FibonacciNumber\n 13.Exit");
	                System.out.println("Select Any Operation");
	                int choose = sc.nextInt();
	                switch (choose) {
	                    case 1: {
	                        do {
	                            System.out.println("1.CheckArmStrongNumber\n2.ArmStrongNumberGivenRange");
	                            int choice = sc.nextInt();
	                            switch (choice) {
	                                case 1: {
	                                    System.out.println("Enter the number");
	                                    int n1 = sc.nextInt();
	                                    if (n1 == isArmStrong(n1))
	                                        System.out.println(n1 + " is an ArmStrong number");
	                                    else {
	                                        System.out.println("It's not an ArmStrong number");
	                                    }
	                                }
	                                    break;
	                                case 2: {
	                                    System.out.println("Enter the range");
	                                    int n1 = sc.nextInt();
	                                    int n2 = sc.nextInt();
	                                    for (int i = n1; i <= n2; i++) {
	                                        if (i == isArmStrong(i))
	                                            System.out.print(i + "  ");
	                                    }
	                                    System.out.println();
	                                }
	                            }
	                        } while (n != 0);
	                    }
	                        break;
	                    case 2: {
	                        do {
	                            System.out.println("1.FactoralNumber\n2.FactorialNumberGivenRange");
	                            int choice1 = sc.nextInt();
	                            switch (choice1) {
	                                case 1: {
	                                    System.out.println("Enter the number");
	                                    int n1 = sc.nextInt();
	                                    System.out.println(n1 + " ! = " + factorial(n1));
	                                }
	                                    break;
	                                case 2: {
	                                    System.out.println("Enter the range");
	                                    int n1 = sc.nextInt();
	                                    int n2 = sc.nextInt();
	                                    for (int i = n1; i <= n2; i++) {
	                                        System.out.println(i + " ! = " + factorial(i));
	                                    }
	                                    System.out.println();
	                                }
	                            }
	                        } while (n != 0);
	                    }
	                        break;
	                    case 3: {
	                        do {
	                            System.out.println("1.CheckStrongNumber\n2.StrongNumberGivenRange");
	                            int choice = sc.nextInt();
	                            switch (choice) {
	                                case 1: {
	                                    System.out.println("Enter the number");
	                                    int n1 = sc.nextInt();
	                                    if (n1 == isStrong(n1))
	                                        System.out.println(n1 + " is a Strong number");
	                                    else {
	                                        System.out.println("It's not a Strong number");
	                                    }
	                                }
	                                    break;
	                                case 2: {
	                                    System.out.println("Enter the range");
	                                    int n1 = sc.nextInt();
	                                    int n2 = sc.nextInt();
	                                    for (int i = n1; i <= n2; i++) {
	                                        if (i == isStrong(i))
	                                            System.out.print(i + "  ");
	                                    }
	                                    System.out.println();
	                                }
	                            }
	                        } while (n != 0);
	                    }
	                        break;
	                    case 4: {
	                        do {
	                            System.out.println("1.CheckNeonNumber\n2.NeonNumberGivenRange");
	                            int choice = sc.nextInt();
	                            switch (choice) {
	                                case 1: {
	                                    System.out.println("Enter the number");
	                                    int n1 = sc.nextInt();
	                                    if (isNeon(n1)) {
	                                        System.out.println(n1 + " is a Neon number");
	                                    } else {
	                                        System.out.println("It's not a Neon number");
	                                    }
	                                }
	                                    break;
	                                case 2: {
	                                    System.out.println("Enter the range");
	                                    int n1 = sc.nextInt();
	                                    int n2 = sc.nextInt();
	                                    for (int i = n1; i <= n2; i++) {
	                                        if (isNeon(i))
	                                            System.out.print(i + "  ");
	                                    }
	                                    System.out.println();
	                                }
	                            }
	                        } while (n != 0);
	                    }
	                        break;
	                    case 5: {
	                        do {
	                            System.out.println("1.CheckNivenNumber\n2.NivenNumberGivenRange");
	                            int choice = sc.nextInt();
	                            switch (choice) {
	                                case 1: {
	                                    System.out.println("Enter the number");
	                                    int n1 = sc.nextInt();
	                                    if (isNiven(n1)) {
	                                        System.out.println(n1 + " is a Niven number");
	                                    } else {
	                                        System.out.println("It's not a Niven number");
	                                    }
	                                }
	                                    break;
	                                case 2: {
	                                    System.out.println("Enter the range");
	                                    int n1 = sc.nextInt();
	                                    int n2 = sc.nextInt();
	                                    for (int i = n1; i <= n2; i++) {
	                                        if (isNiven(i))
	                                            System.out.print(i + "  ");
	                                    }
	                                    System.out.println();
	                                }
	                            }
	                        } while (n != 0);
	                    }
	                        break;
	                    case 6: {
	                        do {
	                            System.out.println("1.CheckSpyNumber\n2.SpyNumberGivenRange");
	                            int choice = sc.nextInt();
	                            switch (choice) {
	                                case 1: {
	                                    System.out.println("Enter the number");
	                                    int n1 = sc.nextInt();
	                                    if (isSpy(n1)) {
	                                        System.out.println(n1 + " is a Spy number");
	                                    } else {
	                                        System.out.println("It's not a Spy number");
	                                    }
	                                }
	                                    break;
	                                case 2: {
	                                    System.out.println("Enter the range");
	                                    int n1 = sc.nextInt();
	                                    int n2 = sc.nextInt();
	                                    for (int i = n1; i <= n2; i++) {
	                                        if (isSpy(i))
	                                            System.out.print(i + "  ");
	                                    }
	                                    System.out.println();
	                                }
	                            }
	                        } while (n != 0);
	                    }
	                        break;
	                    case 7: {
	                        do {
	                            System.out.println("1.CheckHappyNumber\n2.HappyNumberGivenRange");
	                            int choice = sc.nextInt();
	                            switch (choice) {
	                                case 1: {
	                                    System.out.println("Enter the number");
	                                    int n1 = sc.nextInt();
	                                    if (ishappy(n1)) {
	                                        System.out.println(n1 + " is a Happy number");
	                                    } else {
	                                        System.out.println("It's not a Happy number");
	                                    }
	                                }
	                                    break;
	                                case 2: {
	                                    System.out.println("Enter the range");
	                                    int n1 = sc.nextInt();
	                                    int n2 = sc.nextInt();
	                                    for (int i = n1; i <= n2; i++) {
	                                        if (ishappy(i))
	                                            System.out.print(i + "  ");
	                                    }
	                                    System.out.println();
	                                }
	                            }
	                        } while (n != 0);
	                    }
	                        break;
	                    case 8: {
	                        do {
	                            System.out.println("1.CheckPerfectNumber\n2.PerfectNumberGivenRange");
	                            int choice = sc.nextInt();
	                            switch (choice) {
	                                case 1: {
	                                    System.out.println("Enter the number");
	                                    int n1 = sc.nextInt();
	                                    if (isperfect(n1)) {
	                                        System.out.println(n1 + " is a Perfect number");
	                                    } else {
	                                        System.out.println("It's not a Perfect number");
	                                    }
	                                }
	                                    break;
	                                case 2: {
	                                    System.out.println("Enter the range");
	                                    int n1 = sc.nextInt();
	                                    int n2 = sc.nextInt();
	                                    for (int i = n1; i <= n2; i++) {
	                                        if (isperfect(i))
	                                            System.out.print(i + "  ");
	                                    }
	                                    System.out.println();
	                                }
	                            }
	                        } while (n != 0);
	                    }
	                        break;
	                    case 9: {
	                        do {
	                            System.out.println(
	                                    "1.CheckPrimeNumber\n2.PrimeNumberGivenRange\n3.AlternativePrimeNumberGivenRange");
	                            int choice = sc.nextInt();
	                            switch (choice) {
	                                case 1: {
	                                    System.out.println("Enter the number");
	                                    int n1 = sc.nextInt();
	                                    if (isPrime(n1)) {
	                                        System.out.println(n1 + " is a Prime number");
	                                    } else {
	                                        System.out.println("It's not a Prime number");
	                                    }
	                                }
	                                    break;
	                                case 2: {
	                                    System.out.println("Enter the range");
	                                    int n1 = sc.nextInt();
	                                    int n2 = sc.nextInt();
	                                    for (int i = n1; i <= n2; i++) {
	                                        if (isPrime(i))
	                                            System.out.print(i + "  ");
	                                    }
	                                    System.out.println();
	                                }
	                                    break;
	                                case 3: {
	                                    System.out.println("Enter the range");
	                                    int n1 = sc.nextInt();
	                                    int n2 = sc.nextInt();
	                                    int count =0;
	                                    for (int i = n1; i <= n2; i++) {
	                                        if(isPrime(i)){
	                                            count++;
	                                            if(count % 2 !=0){
	                                                System.out.print(i + "  ");
	                                            }
	                                        }
	                                    }
	                                    System.out.println();
	                                }
	                            }
	                        } while (n != 0);
	                    }
	                        break;
	                    case 10: {
	                        do {
	                            System.out.println("1.CheckSaturdayNumber\n2.SaturdayNumberGivenRange");
	                            int choice = sc.nextInt();
	                            switch (choice) {
	                                case 1: {
	                                    System.out.println("Enter the number");
	                                    int n1 = sc.nextInt();
	                                    if (isSaturday(n1)) {
	                                        System.out.println(n1 + " is a Saturday number");
	                                    } else {
	                                        System.out.println("It's not a Saturday number");
	                                    }
	                                }
	                                    break;
	                                case 2: {
	                                    System.out.println("Enter the range");
	                                    int n1 = sc.nextInt();
	                                    int n2 = sc.nextInt();
	                                    for (int i = n1; i <= n2; i++) {
	                                        if (isSaturday(i))
	                                            System.out.print(i + "  ");
	                                    }
	                                    System.out.println();
	                                }
	                            }
	                        } while (n != 0);
	                    }
	                        break;
	                    case 11: {
	                        do {
	                            System.out.println("1.CheckPalindromeNumber\n2.PalindromeNumberGivenRange");
	                            int choice = sc.nextInt();
	                            switch (choice) {
	                                case 1: {
	                                    System.out.println("Enter the number");
	                                    int n1 = sc.nextInt();
	                                    if (n1 == isPalindrome(n1)) {
	                                        System.out.println(n1 + " is a Palindrome number");
	                                    } else {
	                                        System.out.println("It's not a Palindrome number");
	                                    }
	                                }
	                                    break;
	                                case 2: {
	                                    System.out.println("Enter the range");
	                                    int n1 = sc.nextInt();
	                                    int n2 = sc.nextInt();
	                                    for (int i = n1; i <= n2; i++) {
	                                        if (i == isPalindrome(i))
	                                            System.out.print(i + "  ");
	                                    }
	                                    System.out.println();
	                                }
	                                case 3: {
	                                    System.out.println("Enter the range");
	                                    int n1 = sc.nextInt();
	                                    int n2 = sc.nextInt();
	                                    for (int i = n1; i <= n2; i++) {
	                                        if (!(i % 2 == 0))
	                                            if (i == isPalindrome(i))
	                                                System.out.print(i + "  ");
	                                    }
	                                    System.out.println();
	                                }
	                            }
	                        } while (n != 0);
	                    }
	                        break;
	                    case 12:{
	                        System.out.println("Enter the range");
	                                    int n1 = sc.nextInt();
	                                            fibonacciSeries(n1);
	                    }
	                    break;
	                    case 13:
	                        return;
	                    default: {
	                        System.out.println("Please enter valid Options");
	                        return;
	                    }

	                }
	            } while (n != 1);
	        } catch (Exception e) {
	            System.out.println("Please Enter Valid number");
	            System.out.println(e.getMessage());
	        }
	    }

	    static int isArmStrong(int n) {
	        int sum = 0;
	        int count = 0;
	        int num = n;
	        while (n > 0) {
	            count++;
	            n = n / 10;
	        }
	        n = num;
	        while (n > 0) {
	            int rem = n % 10;
	            sum = sum + (int) Math.pow(rem, count);
	            n = n / 10;
	        }
	        return sum;
	    }

	    static int factorial(int n) {
	        int fact = 1;
	        for (int i = n; i >= 1; i--) {
	            fact = fact * i;
	        }
	        return fact;
	    }

	    static int isStrong(int n) {
	        int sum = 0;
	        while (n > 0) {
	            int r = n % 10;
	            sum = sum + factorial(r);
	            n = n / 10;
	        }
	        return sum;
	    }

	    static boolean isNeon(int n) {
	        int num = n;
	        int sq = n * n;
	        int sum = 0;
	        while (sq > 0) {
	            int rem = sq % 10;
	            sum += rem;
	            sq = sq / 10;
	        }
	        return num == sum;
	    }

	    static boolean isNiven(int n) {
	        int num = n;
	        int sum = 0;
	        while (n > 0) {
	            int r = n % 10;
	            sum = sum + r;
	            n = n / 10;
	        }
	        return num % sum == 0;
	    }

	    static boolean isSpy(int n) {
	        int num = n;
	        int sum = 0;
	        int prod = 1;
	        while (n > 0) {
	            int r = n % 10;
	            sum = sum + r;
	            n = n / 10;
	        }
	        n = num;
	        while (n > 0) {
	            int s = n % 10;
	            prod = prod * s;
	            n = n / 10;
	        }
	        if (sum == prod) {
	            // System.out.println(sum +" == "+prod+" is a Spy number");
	            return true;
	        } else {
	            // System.out.println(sum +" != "+prod+" is not a Spy number");
	            return false;
	        }
	    }

	    static boolean ishappy(int n) {
	        int sum = 0;
	        while (n > 9) {
	            while (n > 0) {
	                int rem = n % 10;
	                sum = sum + (rem * rem);
	                n = n / 10;
	            }
	            n = sum;
	            sum = 0;
	        }
	        // System.out.println(n);
	        return n == 1;
	    }

	    static boolean isperfect(int n) {
	        int sum = 0;
	        for (int i = 1; i <= n / 2; i++) {
	            if (n % i == 0) {
	                sum = sum + i;
	            }
	        }
	        // System.out.println(sum);
	        return n == sum;
	    }

	    static boolean isPrime(int num) {
	        // boolean flag = true;
	        if (num <= 1) {
	            return false;
	        }
	        for (int i = 2; i <= num / 2; i++) {
	            if (num % i == 0) {
	                return false;
	                // break;
	            }
	        }
	        return true;
	    }

	    static boolean isSaturday(int n) {
	        int num = n;
	        int sum = 0;
	        int rev = 0;
	        while (n > 0) {
	            int rem = n % 10;
	            sum = sum + rem;
	            n = n / 10;
	        }
	        n = num;
	        int sum1 = sum;
	        while (sum > 0) {
	            int rem = sum % 10;
	            rev = rev * 10 + rem;
	            sum = sum / 10;
	        }
	        sum = sum1;
	        int res = sum * rev;
	        if (n == res) {
	            return true;
	        } else {
	            return false;
	        }
	    }

	    static int isPalindrome(int n) {
	        int rev = 0;
	        while (n > 0) {
	            int rem = n % 10;
	            rev = rev * 10 + rem;
	            n = n / 10;
	        }
	        return rev;
	    }

	    static void fibonacciSeries(int n) {
	        int n1 = 0, n2 = 1,n3;
	        System.out.print(n1 +" , "+ n2);
	        for(int i = 2 ; i< n; i++){
	        n3 = n1 + n2;
	        System.out.print(" , "+n3);
	        n1 = n2;
	        n2 = n3;
	        }
	        System.out.println();
	    }
	}

