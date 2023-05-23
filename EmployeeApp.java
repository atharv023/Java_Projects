package MiniProject1;
import java.util.ArrayList;
import java.util.Scanner;
public class EmployeeApp {
    static Scanner sc = new Scanner(System.in);

    ArrayList<Employee> employeeList = new ArrayList<Employee>();

    EmployeeApp() {
        employeeList.add(new Employee(101, "Atharv", "Pune", "Manager", 7218945407L));
        employeeList.add(new Employee(102, "Max", "London", "Developer", 9876543211L));
        employeeList.add(new Employee(103, "Deaks", "Paris", "HR", 9876543212L));
    }

    public void viewAllEmployeeInfo() {
        System.out.println("======================================================================");

        if (employeeList.size() == 0) {
            System.out.println("No records found!");
        }

        for (Employee employee : employeeList) {
            System.out.println("Employee ID: " + employee.getEmployeeId());
            System.out.println("Employee Name: " + employee.getEmployeeName());
            System.out.println("Employee Address: " + employee.getEmployeeAddress());
            System.out.println("Employee Designation: " + employee.getEmployeeDesignation());
            System.out.println("Employee Contact: " + employee.getEmployeeContact());
            System.out.println("-----------------------");
        }

        System.out.println("======================================================================");
    }

    public void addEmployeeInfo() {
        System.out.println("Enter employee ID: ");
        int employeeId = sc.nextInt();
        System.out.println("Enter employee Name: ");
        String employeeName = sc.next();
        System.out.println("Enter employee Address: ");
        String employeeAddress = sc.next();
        System.out.println("Enter employee Designation: ");
        String employeeDesignation = sc.next();
        System.out.println("Enter employee Contact: ");
        long employeeContact = sc.nextLong();

        Employee employee = new Employee(employeeId, employeeName, employeeAddress, employeeDesignation,
                employeeContact);

        employeeList.add(employee);
    }

    public void viewEmployeeInfoById() {
        System.out.println("Enter employee ID: ");
        int employeeId = sc.nextInt();
        int flag = 0;

        System.out.println("======================================================================");

        for (Employee employee : employeeList) {
            if (employeeId == employee.getEmployeeId()) {
                flag = 1;
                System.out.println("Employee ID: " + employee.getEmployeeId());
                System.out.println("Employee Name: " + employee.getEmployeeName());
                System.out.println("Employee Address: " + employee.getEmployeeAddress());
                System.out.println("Employee Designation: " + employee.getEmployeeDesignation());
                System.out.println("Employee Contact: " + employee.getEmployeeContact());
                System.out.println("-----------------------");
            }
        }

        if (flag == 0) {
            System.out.println("Employee ID does not exist!");
        }

        System.out.println("======================================================================");
    }

    public void updateEmployeeById() {
        System.out.println("Enter employee ID: ");
        int employeeId = sc.nextInt();
        int flag = 0;
        int index = 0;
        Employee employee = null;

        for (Employee emp : employeeList) {
            if (employeeId == emp.getEmployeeId()) {
                flag = 1;
                index = employeeList.indexOf(emp);
                employee = emp;
                break;
            }
        }

        if (flag == 1) {
            System.out.println("Enter employee Name: ");
            String employeeName = sc.next();
            System.out.println("Enter employee Address: ");
            String employeeAddress = sc.next();
            System.out.println("Enter employee Designation: ");
            String employeeDesignation = sc.next();
            System.out.println("Enter employee Contact: ");
            long employeeContact = sc.nextLong();

            employee.setEmployeeName(employeeName);
            employee.setEmployeeAddress(employeeAddress);
            employee.setEmployeeDesignation(employeeDesignation);
            employee.setEmployeeContact(employeeContact);

            employeeList.set(index, employee);

            System.out.println("======================================================================");
            System.out.println("Employee details updated!");
        } else {
            System.out.println("Employee ID does not exist!");
        }

        System.out.println("======================================================================");
    }

    public void deleteAllEmployeeInfo() {
        System.out.println("======================================================================");

        if (employeeList.size() > 0) {
            employeeList.clear();
            System.out.println("All records deleted successfully!");
        } else {
            System.out.println("No records available!");
        }

        System.out.println("======================================================================");
    }

    public void deleteEmployeeById() {
        System.out.println("Enter employee ID: ");
        int employeeId = sc.nextInt();
        int index = 0;
        int flag = 0;
        Employee employee = null;

        for (Employee emp : employeeList) {
            if (employeeId == emp.getEmployeeId()) {
                flag = 1;
                index = employeeList.indexOf(emp);
                employee = emp;
                break;
                
            }
        }

        System.out.println("======================================================================");

        if (flag == 0) {
            System.out.println("Employee ID does not exist!");
        } else {
            employeeList.remove(employee);
            System.out.println("Employee record deleted successfully!");
        }
        System.out.println("======================================================================");
    }

    public static void main(String[] args) {
        System.out.println("======================================================================");
        System.out.println("============= Employee Management System =============================");
        System.out.println("======================================================================");
        String choice;

        EmployeeApp app = new EmployeeApp();

        do {
            System.out.println("1) View all Employee Information");
            System.out.println("2) Insert employee information");
            System.out.println("3) View employee information by ID");
            System.out.println("4) Update employee information by ID");
            System.out.println("5) Delete all employee information");
            System.out.println("6) Delete employee information by ID");

            System.out.println("======================================================================");
            System.out.println("Enter your choice:");
            int option = sc.nextInt();

            switch (option) {
                case 1:
                    app.viewAllEmployeeInfo();
                    break;
                case 2:
                    app.addEmployeeInfo();
                    break;
                case 3:
                    app.viewEmployeeInfoById();
                    break;
                case 4:
                    app.updateEmployeeById();
                    break;
                case 5:
                    app.deleteAllEmployeeInfo();
                    break;
                case 6:
                    app.deleteEmployeeById();
                    break;
                default:
                    System.out.println("Wrong choice!");
            }

            System.out.println("Do you want to continue? (Y-Yes / N-No)");
            choice = sc.next();
        } while (choice.equalsIgnoreCase("Y"));

        System.out.println("======================================================================");
        System.out.println("Goodbye!");
        System.out.println("======================================================================");
    }
}