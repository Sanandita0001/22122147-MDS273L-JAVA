import java.util.*;
//creating the mean function
public class lab03 {
    public static float calcMean(int[] arr) {
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];
        }
        float mean = (float) sum / arr.length; //calculating mean
        return mean;
    }
    //creating the median function
    public static float calcMedian(int[] arr) {
        int count = arr.length;
        Arrays.sort(arr);// sorting the array in ascending order
        if (count % 2 == 0) { //if the length of the array is an even number
            int index1 = arr.length / 2 - 1;
            int index2 = arr.length / 2;
            return (arr[index1] + arr[index2]) / 2.0f;
        } else { //if the length of the array is an odd number
            int index = (arr[count / 2] + (arr[count / 2] - 1)) / 2;
            return (float) arr[index];//returning the median
        }
    }
    // creating the mode function
    public static int calcMode(int[] arr) {
        int maxValue = 0, maxCount = 0;
        for (int k = 0; k < arr.length; ++k) {
            int count = 0; // initializing count variable to zero
            for (int l = 0; l < arr.length; ++l) {
                if (arr[k] == arr[l])// checking if any value cgecked by the outer loop matches the present value of the inner loop
                    ++count;// incrementing coutn if there is a match
            }
            if (count > maxCount) { //chceking if the final value of count after iterating through the entire loop is greater than maxcount or not
                maxCount = count; //setting count value to maxcount, fo storing the maximum number of times a particular value appeared
                maxValue = arr[k];// finding the mode value from the frequency
            }
        }
        return maxValue;
    }

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter size of your array: ");
        int arr_size = sc.nextInt();//to store the desired size of the array
        int arr[] = new int[arr_size]; // creating an array of the size entered by the user
        System.out.print("Enter the elements in the array: ");
        for (int a = 0; a < arr_size; a++) { //storing each element entered into the array
            arr[a] = sc.nextInt();
        }
        System.out.println("1. Mean ");
        System.out.println("2. Median ");
        System.out.println("3. Mode");
        System.out.print("Enter your choice: ");
        int choice = sc.nextInt();//asking for user choice
        if (choice == 1) {
            float mean = calcMean(arr);//callign mean function
            System.out.println("Mean: " + mean);
        }else if(choice == 2) {
        float median = calcMedian(arr);//calling median function
        System.out.println("Median: " + median);
        }else if(choice == 3){
            int mode = calcMode(arr);//calling mode function
            System.out.println("Mode: " + mode);
        }else{
            System.out.println("Invalid choice");
        }
    }
}
