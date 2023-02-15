import java.util.*;

public class lab03 {
    public static float calcMean(int[] arr) {
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];
        }
        float mean = (float) sum / arr.length;
        return mean;
    }

    public static float calcMedian(int[] arr) {
        int count = arr.length;
        Arrays.sort(arr);
        if (count % 2 == 0) {
            int index1 = arr.length / 2 - 1;
            int index2 = arr.length / 2;
            return (arr[index1] + arr[index2]) / 2.0f;
        } else {
            int index = (arr[count / 2] + (arr[count / 2] - 1)) / 2;
            return (float) arr[index];
        }
    }

    public static int calcMode(int[] arr) {
        int maxValue = 0, maxCount = 0;
        for (int k = 0; k < arr.length; ++k) {
            int count = 0;
            for (int l = 0; l < arr.length; ++l) {
                if (arr[k] == arr[l])
                    ++count;
            }
            if (count > maxCount) {
                maxCount = count;
                maxValue = arr[k];
            }
        }
        return maxValue;
    }

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter size of your array: ");
        int arr_size = sc.nextInt();
        int arr[] = new int[arr_size];
        System.out.print("Enter the elements in the array: ");
        for (int a = 0; a < arr_size; a++) {
            arr[a] = sc.nextInt();
        }
        float mean = calcMean(arr);
        System.out.println("Mean: " + mean);
        float median = calcMedian(arr);
        System.out.println("Median: " + median);
        int mode = calcMode(arr);
        System.out.println("Mode: " + mode);

    }
}
