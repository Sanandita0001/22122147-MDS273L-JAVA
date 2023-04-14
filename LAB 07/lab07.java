import java.util.*;
import java.io.File;
public class lab07{
    public static void main(String[] args) {
        int count = 0;
        int i = 0;
        float[] col1 = new float[150];
        float[] col2 = new float[150];
        float[] col3 = new float[150];
        float[] col4 = new float[150];
        try{
            File file = new File("C://Users//ADMIN//Downloads//Iris.csv");
            Scanner read = new Scanner(file);
            while(read.hasNextLine()){
                String line = read.nextLine();
                if (count==0){
                    String[] header = line.split(",");
                }
                else{
                    String[] arr = line.split(",");
                    
                    
                    col1[i] = Float.parseFloat(arr[0]);
                    col2[i] = Float.parseFloat(arr[1]);
                    col3[i] = Float.parseFloat(arr[2]);
                    col4[i] = Float.parseFloat(arr[3]);
                    i++;
                }
                count++;

            }
        }
        
        catch(Exception ex){
            System.out.println(ex.getMessage());
        }
    float meanCol1 = meanfunc(col1);
    float meanCol2 = meanfunc(col2);
    float meanCol3 = meanfunc(col3);
    float meanCol4 = meanfunc(col4);
    System.out.println("******MEAN******");
    System.out.println("|Mean of Sepal length is: | " + meanCol1);
    System.out.println("|Mean of Sepal Width is:  | " + meanCol2);
    System.out.println("|Mean of Petal length is: | " + meanCol3);
    System.out.println("|Mean of Petal Width is:  | " + meanCol4);


    // Call the median function for col1
    float medianCol1 = medianfunc(col1);
    float medianCol2 = medianfunc(col2);
    float medianCol3 = medianfunc(col3);
    float medianCol4 = medianfunc(col4);
    System.out.println("******MEDIAN******");
    System.out.println("|Median of Sepal length is: | " + medianCol1);
    System.out.println("|Median of Sepal Width is:  | " + medianCol2);
    System.out.println("|Median of Petal length is: | " + medianCol3);
    System.out.println("|Median of Petal Width is:  | " + medianCol4);

    // Call the mode function for col1
    float modeCol1 = modefunc(col1);
    float modeCol2 = modefunc(col2);
    float modeCol3 = modefunc(col3);
    float modeCol4 = modefunc(col4);
    System.out.println("******MODE******");
    System.out.println("|Mode of Sepal length is: | " + modeCol1);
    System.out.println("|Mode of Sepal Width is:  | " + modeCol2);
    System.out.println("|Mode of Petal length is: | " + modeCol3);
    System.out.println("|Mode of Petal Width is:  | " + modeCol4);

    float maxCol1 = maxi_mum(col1);
    float maxCol2 = maxi_mum(col2);
    float maxCol3 = maxi_mum(col3);
    float maxCol4 = maxi_mum(col4);
    System.out.println("*****MAXIMUM VAUE******");
    System.out.println("|Maximum value of Sepal length is: | " + maxCol1);
    System.out.println("|Maximum value of Sepal Width is:  | " + maxCol2);
    System.out.println("|Maximum value of Petal length is: | " + maxCol3);
    System.out.println("|Maximum value of Petal Width is:  | " + maxCol4);

    float minCol1 = mini_mum(col1);
    float minCol2 = mini_mum(col2);
    float minCol3 = mini_mum(col3);
    float minCol4 = mini_mum(col4);
    System.out.println("*****MINIMUM VAUE******");
    System.out.println("|Minimum value of Sepal length is: | " + minCol1);
    System.out.println("|Minimum value of Sepal Width is:  | " + minCol2);
    System.out.println("|Minimum value of Petal length is: | " + minCol3);
    System.out.println("|Minimum value of Petal Width is:  | " + minCol4);

    

    }
    static float meanfunc(float arr1[]){
        float sum=0;
        for(int i=0;i<arr1.length-1;i++){
            sum+=arr1[i];
        }
        float result=sum/arr1.length;
        return result;
    }
    static float medianfunc(float[] arr1){
        Arrays.sort(arr1);
        int len = arr1.length;
        if (len%2==0){
            return(arr1[len/2 -1] + arr1[len/2]) / 2;
        }
        else{
            return(arr1[len / 2]);
        }
    }
    static float modefunc(float[] arr1){
        int maxcount = 0;
        int current_count = 1;
        float mode=0;
        float current_num = arr1[0];
        for(int i = 0; i<arr1.length;i++){
            if (arr1[i] == current_num){
                current_count++;
            }
            else{
                if (current_count>maxcount){
                    maxcount = current_count;
                    mode = current_num;
                }
                current_count = 1; //if a new number is encountered in the array, we need to start counting its frequency again, thus w are setting it to 1
                current_num = arr1[i];
            }
        }
        if (current_count>maxcount){
            maxcount = current_count;
            mode = current_num;
        }
        return mode;
    }
    static float maxi_mum(float arr1[]){
        float max=0;
        for(int i=0;i<arr1.length;i++){
            if(arr1[i]>max){
                max=arr1[i];
            }
        }
        return max;
    }
    static float mini_mum(float arr1[]){
        float min=arr1[0];
        for(int i=0;i<arr1.length;i++){
            if(arr1[i]<min){
                min=arr1[i];

            }
        }
        return min;
    }
    public static void displayOutput() {
        try {
            File file = new File("C:/ADMIN/Downloads/Summary.txt");
            Scanner sc = new Scanner(file);

            while (sc.hasNext()) {
                System.out.println(sc.nextLine());
            }
        } catch (Exception ex) {
            System.out.println(ex.getMessage());
        }



    }
}