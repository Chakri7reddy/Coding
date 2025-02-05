import java.util.*;


public class cc2 {
    public static void main(String[] args) {
    //    //Type 1
    //     Scanner sc=new Scanner(System.in);
    //     System.out.println("Enter no students id to generate:");
    //     int n=sc.nextInt();// No of students
    //     ArrayList<String> stu=new ArrayList<>();
    //     for(int i=1;i<=n;i++){
           
               
    //              String x="stu"+i;
    //              stu.add(x);
            
    //             System.out.println("enter the course for student   "+x);
    //              String y=sc.next();
    //              stu.add(y);
    //               String z=y+i;
    //              stu.add(z);

            
    //     }
    //   System.out.println(stu);
    //   for (int i = 0;i<stu.size() ; i++) {
    //     System.out.println(stu.get(i)+" = " +stu.get(i+2) +"(For Course  "+stu.get(i+1)+ "  opted....");
    //    i= i+2;
    //   }


    //Type 2   menu driven program..............`

    @SuppressWarnings("resource")
    Scanner input = new Scanner(System.in);
    int choice=input.nextInt();

    do {
        System.out.println("Menu:");
        System.out.println("1. Enter Student Details");
        System.out.println("2. Exit");
        System.out.print("Enter your choice: ");
        choice = input.nextInt();

        switch (choice) {
            case 1:
                enterStudentDetails();
                break;
            case 2:
                System.out.println("Exiting the program. Goodbye!");
                break;
            default:
                System.out.println("Invalid choice. Please enter a valid option.");
        }
    } while (choice != 2);
}

public static void enterStudentDetails() {
    @SuppressWarnings("resource")
    Scanner scanner = new Scanner(System.in);

    String studentCourse;

    System.out.println("Enter Your Name");
     String studentName = scanner.next();
System.out.println(studentName);
    System.out.println("Enter Course");
    studentCourse = scanner.next();

    generateSystemID(studentCourse);
}

public static void generateSystemID(String course) {
    int count = 1;
    if (course.equals("Java")) {
        System.out.println("SystemID for Java: " + course + count);
        count++;
    } else if (course.equals("Python")) {
        System.out.println("SystemID For Python: " + course + count);
        count++;
    } else {
        System.out.println("SystemID For PHP: " + course + count);
        count++;
    }
    }
    
}
