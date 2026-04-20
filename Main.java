import java.util.*;

class Student {
    int id;
    String name;
    int marks;

    Student(int id, String name, int marks) {
        this.id = id;
        this.name = name;
        this.marks = marks;
    }
}

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Student> list = new ArrayList<>();

        while (true) {
            System.out.println("\n1.Add 2.View 3.Search 4.Exit");
            int choice = sc.nextInt();

            if (choice == 1) {
                System.out.print("Enter ID: ");
                int id = sc.nextInt();
                sc.nextLine();
                System.out.print("Enter Name: ");
                String name = sc.nextLine();
                System.out.print("Enter Marks: ");
                int marks = sc.nextInt();

                list.add(new Student(id, name, marks));
            } 
            else if (choice == 2) {
                for (Student s : list) {
                    System.out.println(s.id + " " + s.name + " " + s.marks);
                }
            } 
            else if (choice == 3) {
                System.out.print("Enter ID to search: ");
                int id = sc.nextInt();

                for (Student s : list) {
                    if (s.id == id) {
                        System.out.println("Found: " + s.name);
                    }
                }
            } 
            else {
                break;
            }
        }
    }
}
