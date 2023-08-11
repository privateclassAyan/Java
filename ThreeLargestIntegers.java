/*import java.util.Scanner;
import java.util.Arrays;

public class ThreeLargestIntegers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        //System.out.print("Enter the number of elements in the array: ");
        int n = scanner.nextInt();

        int[] arr = new int[n];
        //System.out.println("Enter the elements of the array:");

        for (int i = 0; i < n; i++) {
            arr[i] = scanner.nextInt();
        }

        int[] result = findThreeLargest(arr);

        //System.out.println("Sorted array of three largest integers:");
        for (int num : result) {
            System.out.print(num + " ");
        }
    }

    public static int[] findThreeLargest(int[] arr) {
        int n = arr.length;
        if (n < 3) {
            //System.out.println("Array should have at least three elements.");
            return new int[0];
        }

        int largest1 = Integer.MIN_VALUE;
        int largest2 = Integer.MIN_VALUE;
        int largest3 = Integer.MIN_VALUE;

        for (int num : arr) {
            if (num > largest1) {
                largest3 = largest2;
                largest2 = largest1;
                largest1 = num;
            } else if (num > largest2) {
                largest3 = largest2;
                largest2 = num;
            } else if (num > largest3) {
                largest3 = num;
            }
        }

        int[] result = { largest1, largest2, largest3 };
        Arrays.sort(result);
        return result;
    }
}*/
/*
 *
import java.util.Scanner;
import java.util.Arrays;
class ThreeLargestIntegers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        
        int n = scanner.nextInt();

        int[] arr = new int[n];
        

        for (int i = 0; i < n; i++) {
            arr[i] = scanner.nextInt();
        }

        int[] result = findThreeLargest(arr);

       
        for (int num : result) {
            System.out.print(num + " ");
        }
    }

    public static int[] findThreeLargest(int[] arr) {
        int n = arr.length;
        if (n < 3) {
            
            return new int[0];
        }

        int largest1 = Integer.MIN_VALUE;
        int largest2 = Integer.MIN_VALUE;
        int largest3 = Integer.MIN_VALUE;

        for (int num : arr) {
            if (num > largest1) {
                largest3 = largest2;
                largest2 = largest1;
                largest1 = num;
            } else if (num > largest2) {
                largest3 = largest2;
                largest2 = num;
            } else if (num > largest3) {
                largest3 = num;
            }
        }

        int[] result = { largest1, largest2, largest3 };
        Arrays.sort(result);
        return result;
    }
}

 */
import java.util.Scanner;

public class ThreeLargestIntegers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();

        int[] arr = new int[n];

        for (int i = 0; i < n; i++) {
            arr[i] = scanner.nextInt();
        }

        int[] result = findThreeLargest(arr);

        for (int num : result) {
            System.out.print(num + " ");
        }
    }

    public static int[] findThreeLargest(int[] arr) {
        int n = arr.length;
        if (n < 3) {
            return new int[0];
        }

        int largest1 = arr[0];
        int largest2 = Integer.MIN_VALUE;
        int largest3 = Integer.MIN_VALUE;

        for (int i = 1; i < n; i++) {
            int num = arr[i];
            if (num > largest1) {
                largest3 = largest2;
                largest2 = largest1;
                largest1 = num;
            } else if (num > largest2) {
                largest3 = largest2;
                largest2 = num;
            } else if (num > largest3) {
                largest3 = num;
            }
        }

        int[] result = { largest1, largest2, largest3 };
        return result;
    }
}
