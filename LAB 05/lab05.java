import java.io.File;
import java.io.FileWriter;
import java.io.*;
import java.util.*;
class Student{
    //declaring all global variables
    String regno;
    String name;
    String email;
    String phone;
    String st_class;
    String dept;
    //creating a constructor for student details
    Student(String regno, String name, String email, String phone, String st_class, String dept){
        this.regno = regno;
        this.name = name;
        this.email = email;
        this.phone = phone;
        this.st_class = st_class;
        this.dept = dept;
    }
    public void print(){// for displaying the information about a student
        System.out.println("Registration number: "+this.regno);
        System.out.println("Name: "+this.name);
        System.out.println("Email: "+this.email);
        System.out.println("Phone: "+this.phone);
        System.out.println("Class"+this.st_class);
        System.out.println("Department: "+this.dept);
    }
    public String getName(){
        return this.name;
    }
    public String getregno(){
        return this.regno;
    }
}

public class lab05{
    public static void main(String[] args) {//main method
        Scanner sc = new Scanner(System.in);
        Student[] students = new Student[100];//creating an array of 100 students under the student class
        int stud_count = 0;
        while(true){
            System.out.println("1. Add a student");
            System.out.println("2. Search for a student");
            System.out.println("3. Display all the students.");
            System.out.println("4. Exit");
            int choice = sc.nextInt();//taking the choice of the student
            switch (choice){
                case 1: 
                // add a student
                    System.out.print("Enter the student's registration number: ");
                    String regno = sc.next();
                    System.out.print("Enter the student's name: ");
                    String name = sc.next();
                    System.out.print("Enter the student's email: ");
                    String email = sc.next();
                    System.out.print("Enter the student's phone: ");
                    String phone = sc.next();
                    System.out.print("Enter the student's class: ");
                    String st_class = sc.next();
                    System.out.print("Enter the student's department: ");
                    String dept = sc.next();
                    Student newStudent = new Student(regno, name, email, phone, st_class, dept);
                    students[stud_count] = newStudent;
                    stud_count++;
                    System.out.println("Student added successfully!");
                    break;
                case 2: 
                //searching for a student using their name or roll number
                    System.out.println("2. Search for a student:");
                    System.out.println("1. By Name");
                    System.out.println("2. By Register number");
                    int search_ch = sc.nextInt();
                    sc.nextLine();
                    switch(search_ch){
                        case 1:
                            System.out.print("Enter the name you want to search for: ");
                            String search_name = sc.nextLine();
                            //sc.nextLine(); //to consume new line charcter
                            for(int i = 0; i<stud_count;i++){
                                if(students[i].getName().equals(search_name)){
                                    students[i].print();
                                    break;//to prevent the programmer from executing the consecutive cases
                                }
                            }
                            break;//to terminate it from falling through to the next cases
                        case 2:
                            System.out.print("Enter the Registration number you want to search: ");
                            String search_regno = sc.nextLine();
                            for(int i =0; i<stud_count;i++){
                                if(students[i].getregno().equals(search_regno)){
                                    students[i].print();
                                    break;
                                }
                            }break;
                        default:
                            System.out.println("INVALID CHOICE!!");
                            break;
                        }
                        break;
                case 3: //dispaly all students
                for (int i = 0;i<stud_count;i++){
                    students[i].print();
                }
                break;
                case 4:
                    System.out.println("Exiting the program!!!");
                    System.exit(0);
                    break;
                default:
                    System.out.println("INVALID CHOICE!!");
                    break;
            }
        }
    }
}