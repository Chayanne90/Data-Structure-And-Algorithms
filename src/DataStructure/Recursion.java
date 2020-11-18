package DataStructure;

public class Recursion {

    public static void reduceByOne(int n) {

        if (n >=0) {
            //System.out.println(n);
            reduceByOne(n-1);
        }
        System.out.println(n);
    }

    public static int linearSearch(int [] arr, int i, int x ) {

        if (i > arr.length -1) {
            return -1;
        } else if (arr[i] == x) {
            return i;
        } else {
            //System.out.println("index at: "+i);
            return linearSearch(arr, i+1,x);
        }
    }

    /* Recursion-1 > factorial
    *  Given n of 1 or more, return the factorial of n,
    * which is n * (n-1) * (n-2) ... 1.
    * Compute the result recursively */

    public static int factorial(int n) {

        if ( n == 1) {
           return 1;
        } else {
           return n * factorial(n-1);
        }
    }


    public static int bunnyEars(int bunnies) {

        if (bunnies == 0) {

            return 0;
        } else {

            return 2 + bunnyEars(bunnies-1);
        }

    }

    public static int fibonacci(int n) {

        if ((n == 0) || (n == 1)) {
            return n;
        } else  {
            return fibonacci(n-1) + fibonacci(n-2);
        }

    }

    public static int bunnyEars2(int bunnies) {

        if (bunnies == 0) {
            return 0;
        } else {

            if (bunnies % 2 == 0){
                return 3 + bunnyEars2(bunnies-1);
            } else {
                return 2 + bunnyEars2(bunnies-1);
            }
        }
    }

    public static int triangle(int rows) {




        if ((rows == 0) || (rows == 1)) {
            return rows;
        } else {

            return rows+triangle(rows-1);
        }

    }
    public static int sumDigits(int n) {

        if (n == 0) {

            return n;
        } else {

            return n % 10 + sumDigits(n / 10);
        }
    }

    public static int count7(int n) {


        if(n == 0)

            return 0;

        if(n % 10 == 7)

            return 1 + count7(n / 10);

        return count7(n / 10);

    }


    public static int count8(int n) {

        if (n == 0) {

            return n;
        }

        if (n % 10 == 8) {

            /*
            String num = Integer.toString(n);
            if (num.length() >=2 ) {
                if (((num.charAt(0)=='8') && (num.charAt(1)=='8')) || ((num.charAt(num.length()-2)=='8') && (num.charAt(num.length()-1)=='8'))) {
                    return 2 + count8(n /10);
                }
            }*/

            if((n / 10) % 10 == 8) {

                return 2 + count8(n/10);
            }

            return 1 + count8(n /10);
        }
        return count8(n/10);
    }

    public static void main(String[] args) {
        int [] arr = {1,4,5,8,7,2};
        int x = 8;

        System.out.println(count8(8088));
    }





}
