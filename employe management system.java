
package employee;
import java.util.*;

class Employee {
    int id;
    String name;
    double salary;
    String department;

    Employee(int id, String name, double salary, String department) {
        this.id = id;
        this.name = name;
        this.salary = salary;
        this.department = department;
    }

    public String toString() {
        return "ID: " + id + ", Name: " + name + ", Salary: " + salary + ", Department: " + department;
    }
}

public class A {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Employee> list = new ArrayList<>();
        int choice;

        do {
            System.out.println("\n=== Employee Management System ===");
            System.out.println("1. Add Employee");
            System.out.println("2. View All Employees");
            System.out.println("3. Search Employee");
            System.out.println("4. Update Employee");
            System.out.println("5. Delete Employee");
            System.out.println("6. Exit");
            System.out.print("Enter your choice: ");
            choice = sc.nextInt();

            switch (choice) {
                case 1:
                    System.out.println("Enter ID: ");
                    int id = sc.nextInt();
                    sc.nextLine();
                    System.out.print("Enter Name: ");
                    String name = sc.nextLine();
                    System.out.print("nter Salary: ");
                    double salary = sc.nextDouble();
                    sc.nextLine();
                    System.out.print("Enter Department: ");
                    String dept = sc.nextLine();
                    list.add(new Employee(id, name, salary, dept));
                    System.out.println("✅ Employee Added!");
                    break;

                case 2:
                    if (list.isEmpty())
                        System.out.println("No Employees Found!");
                    else {
                        System.out.println("\n--- Employee List ---");
                        for (Employee e : list)
                            System.out.println(e);
                    }
                    break;

                case 3:
                    System.out.print("Enter Employee ID to Search: ");
                    int sid = sc.nextInt();
                    boolean found = false;
                    for (Employee e : list) {
                        if (e.id == sid) {
                            System.out.println("Employee Found: " + e);
                            found = true;
                            break;
                        }
                    }
                    if (!found)
                        System.out.println("❌ Employee Not Found!");
                    break;

                case 4:
                    System.out.print("Enter Employee ID to Update: ");
                    int uid = sc.nextInt();
                    sc.nextLine();
                    boolean updated = false;
                    for (Employee e : list) {
                        if (e.id == uid) {
                            System.out.print("Enter New Name: ");
                            e.name = sc.nextLine();
                            System.out.print("Enter New Salary: ");
                            e.salary = sc.nextDouble();
                            sc.nextLine();
                            System.out.print("Enter New Department: ");
                            e.department = sc.nextLine();
                            System.out.println("✅ Employee Updated!");
                            updated = true;
                            break;
                        }
                    }
                    if (!updated)
                        System.out.println("❌ Employee Not Found!");
                    break;

                case 5:
                    System.out.print("Enter Employee ID to Delete: ");
                    int did = sc.nextInt();
                    Employee toRemove = null;
                    for (Employee e : list) {
                        if (e.id == did) {
                            toRemove = e;
                            break;
                        }
                    }
                    if (toRemove != null) {
                        list.remove(toRemove);
                        System.out.println("🗑️ Employee Deleted!");
                    } else {
                        System.out.println("❌ Employee Not Found!");
                    }
                    break;

                case 6:
                    System.out.println("Exiting... Thank You!");
                    break;

                default:
                    System.out.println("Invalid Choice! Try Again.");
            }
        } while (choice != 6);

        sc.close();
    }
}

