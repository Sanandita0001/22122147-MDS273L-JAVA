import java.util.*;
class lab01{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your name: ");
        String name = sc.next();
        System.out.print("Enter your semester: ");
        int sem = sc.nextInt();
        System.out.print("Enter your registration number: ");
        int reg = sc.nextInt();
        System.out.print("Enter your sgpa: ");
        double sgpa = sc.nextDouble();
        System.out.print("Enter your phone number: ");
        long phone = sc.nextLong();
        System.out.println("The Details are----------------------------------------------------------------------");
        System.out.println("Name: "+name);
        System.out.println("Semester: "+sem);
        System.out.println("Registration number: "+reg);
        //System.out.println("Gender: "+gender);
        System.out.println("SGPA obtained: "+sgpa);
        System.out.println("Contact number: "+phone);
        System.out.print("Enter your gender as m or f: ");
        char gender = sc.next().charAt(0);
        if (gender == 'm'){
            System.out.println("The gender is Male");
        }
        else if (gender == 'f'){
            System.out.println("The gender is Female");
        }
        System.out.println("Enter your state. Enter only the initials if it is a two-lettered word: ");
        String region = sc.next();
        switch(region){
            case("JK"):
            case("Delhi"):
            case("UP"):
            case("Punjab"):
            case("MP"):
                System.out.println("The Student is from the northern states of India and the basic details of the students are: "+name+","+reg+" and "+gender);
                break;
            case("WB"):
            case("Bihar"):
            case("Orissa"):
            case("Mizoram"):
            case("Manipur"):
            case("Sikkim"):
            case("Assam"):
            
                System.out.println("The Student is from the eastern states of India and the basic details of the students are: "+name+","+reg+" and "+gender);
                break;
            case "AP":
            case "Karnataka":
            case "Kerala":
            case "TN":
                System.out.println("The Student is from the southern states of India and the basic details of the students are: "+name+","+reg+" and "+gender);
                break;
            case "Maharashtra":
            case "Gujarat":
            case "Goa":
                System.out.println("The Student is from the western states of India and the basic details of the students are: "+name+","+reg+" and "+gender);
                break;
             }
            
    }
}    
