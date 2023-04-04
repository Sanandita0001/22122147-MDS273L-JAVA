import java.io.*;
import java.util.*;
import java.io.FileReader;
import java.io.BufferedReader;
class lab06{
    public static void vowel(){
        String fileName = "C:/Users/ADMIN/Downloads/text.txt";
        int a_count = 0, e_count = 0, i_count = 0, o_count = 0, u_count = 0;
        try {
            FileReader fileReader = new FileReader(fileName);
            BufferedReader bufferedReader = new BufferedReader(fileReader);
            int character;
            while ((character = bufferedReader.read()) != -1) {
                char c = (char) character;
                if (c == 'a' || c == 'A') {
                    a_count++;
                } else if (c == 'e' || c == 'E') {
                    e_count++;
                } else if (c == 'i' || c == 'I') {
                    i_count++;
                } else if (c == 'o' || c == 'O') {
                    o_count++;
                } else if (c == 'u' || c == 'U') {
                    u_count++;
                }
            }
            bufferedReader.close();
        } catch(Exception ex){
                System.out.println(ex.getMessage());
                 }
        System.out.println("---VOWELS---");
        System.out.println("A: " + a_count);
        System.out.println("E: " + e_count);
        System.out.println("I: " + i_count);
        System.out.println("O: " + o_count);
        System.out.println("U: " + u_count);
    }
    public static void digit(){
        try {
            // Open the file for reading
            String fileName = "C:/Users/ADMIN/Downloads/text.txt";
            FileReader fileReader = new FileReader(fileName);
            BufferedReader reader = new BufferedReader(fileReader);
            int c;

            // Initialize an array to store the count of each digit
            int[] count = new int[10];

            // Read the file character by character
            while ((c = reader.read()) != -1) {
                // Check if the character is a digit
                if (Character.isDigit(c)) {
                    // Increment the count of the corresponding digit
                    count[c - '0']++;
                }
            }

            // Print the count of each digit
            System.out.println("The number of digits are: ");
            for (int i = 0; i < 10; i++) {
                System.out.println(i + ": " + count[i]);
            }

            // Close the reader
            reader.close();

        } catch(Exception ex){
            System.out.println(ex.getMessage());
             }
    }
    public static void count(){
        try {
            // Open the file for reading
            FileReader fileReader = new FileReader("C:/Users/ADMIN/Downloads/text.txt");
            BufferedReader bufferedReader = new BufferedReader(fileReader);
            
            // Initialize an array to store the count of each word
            int[] count = new int[5];
            String[] words = new String[5];

            // Read the file line by line
            String line;
            while ((line = bufferedReader.readLine()) != null) {
                // Split the line into words
                String[] wordsInLine = line.split("\\s+");
                
                // Count the occurrence of each word
                for (String word : wordsInLine) {
                    // Ignore words that are shorter than 3 characters
                    if (word.length() < 3) {
                        continue;
                    }
                    // Check if the word is one of the top five most repeated words
                    for (int i = 0; i < 5; i++) {
                        if (words[i] == null || words[i].equals(word)) {
                            count[i]++;
                            words[i] = word;
                            break;
                        }
                    }
                }
            }

            // Print the top five most repeated words
            System.out.println("The most repeated words are: ");
            for (int i = 0; i < 5; i++) {
                if (words[i] != null) {
                    System.out.println(words[i] + ": " + count[i]);
                }
            }

            // Close the reader
            bufferedReader.close();
            fileReader.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    public static void least(){
        try {
            BufferedReader br = new BufferedReader(new FileReader("C:/Users/ADMIN/Downloads/text.txt"));
            String line;
            String[] words = new String[1000];
            int[] counts = new int[1000];
            int wordCount = 0;
            while ((line = br.readLine()) != null) {
                String[] lineWords = line.split("\\s+");
                for (String word : lineWords) {
                    words[wordCount] = word;
                    wordCount++;
                }
            }
            for (int i = 0; i < wordCount; i++) {
                counts[i] = 0;
                for (int j = 0; j < wordCount; j++) {
                    if (words[i].equals(words[j])) {
                        counts[i]++;
                    }
                }
            }
            System.out.println("The least repeayed words are: ");
            for (int i = 0; i < 5; i++) {
                int minCount = Integer.MAX_VALUE;
                int minIndex = -1;
                for (int j = 0; j < wordCount; j++) {
                    if (counts[j] < minCount) {
                        minCount = counts[j];
                        minIndex = j;
                    }
                }
                if (minIndex != -1) {
                    System.out.println(words[minIndex] + ": " + counts[minIndex]);
                    counts[minIndex] = Integer.MAX_VALUE;
                }
            }
            br.close();
        } catch (IOException e) {
            System.err.println("Error reading file: " + e.getMessage());
        }
    }
    public static void repchar(){
        try {
            BufferedReader br = new BufferedReader(new FileReader("C:/Users/ADMIN/Downloads/text.txt"));
            int[] counts = new int[256];
            int charCount = 0;
            int c;
            while ((c = br.read()) != -1) {
                charCount++;
                counts[c]++;
            }
            System.out.println("---TOP REPEATED CHARACTERS---");
            for (int i = 0; i < 5; i++) {
                int maxCount = 0;
                int maxIndex = -1;
                for (int j = 0; j < 256; j++) {
                    if (counts[j] > maxCount) {
                        maxCount = counts[j];
                        maxIndex = j;
                    }
                }
                if (maxIndex != -1) {
                    System.out.println((char) maxIndex + ": " + maxCount);
                    counts[maxIndex] = 0;
                }
            }
            br.close();
        } catch (IOException e) {
            System.err.println("Error reading file: " + e.getMessage());
        }
    }
    public static void leastchar(){
        try {
            BufferedReader br = new BufferedReader(new FileReader("C:/Users/ADMIN/Downloads/text.txt"));
            int[] counts = new int[256];
            int charCount = 0;
            int c;
            while ((c = br.read()) != -1) {
                charCount++;
                counts[c]++;
            }
            System.out.println("The last repeated characters are: ");
            for (int i = 0; i < 5; i++) {
                int minCount = charCount;
                int minIndex = -1;
                for (int j = 0; j < 256; j++) {
                    if (counts[j] > 0 && counts[j] < minCount) {
                        minCount = counts[j];
                        minIndex = j;
                    }
                }
                if (minIndex != -1) {
                    System.out.println((char) minIndex + ": " + minCount);
                    counts[minIndex] = charCount + 1;
                }
            }
            br.close();
        } catch (IOException e) {
            System.err.println("Error reading file: " + e.getMessage());
        }
    }
    public static void read_html(){
        File file = new File("C:/Users/ADMIN/Downloads/htmlFile.txt");
        try {
            FileInputStream inputStream = new FileInputStream(file);

            // Initialize character counts
            int openBrackets = 0;
            int closeBrackets = 0;
            int forwardSlash = 0;

            // Read the file character by character
            int c;
            while ((c = inputStream.read()) != -1) {
                char ch = (char) c;
                if (ch == '<') {
                    openBrackets++;
                } else if (ch == '>') {
                    closeBrackets++;
                } else if (ch == '/') {
                    forwardSlash++;
                }
            }

            // Close the file input stream
            inputStream.close();

            // Display the character counts
            System.out.println("Character counts:");
            System.out.println("< : " + openBrackets);
            System.out.println("> : " + closeBrackets);
            System.out.println("/ : " + forwardSlash);

        } catch (IOException e) {
            // Handle the exception
            System.out.println("An error occurred while reading the file: " + e.getMessage());
        }
    }
    public static void main(String[] args) {
        lab06 lb=new lab06();
        lb.vowel();
        lb.digit();
        lb.count();
        lb.least();
        lb.repchar();
        lb.leastchar();
        lb.read_html();

    }

}
