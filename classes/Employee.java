import java.util.Scanner;

public class Employee {
    private int emp_no;
    public String emp_name;
    private int emp_salary;

    Employee(int emp_no1, String emp_name1, int emp_salary1) {
        emp_no = emp_no1;
        emp_name = emp_name1;
        emp_salary = emp_salary1;
    }

    // getter
    public int getNumber() {
        return emp_no;
    }

    public String getName() {
        return emp_name;
    }

    public int getSalary() {
        return emp_salary;
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the emp_name: ");
        String emp_name = scan.nextLine();
        System.out.println("Enter the emp_number: ");
        int emp_no = scan.nextInt();
        System.out.println("Enter the emp_salary: ");
        int emp_salary = scan.nextInt();

        Employee emp = new Employee(emp_no, emp_name, emp_salary);
        System.out.println("Employee_no: " + emp.emp_no);
        System.out.println("Employee_name:" + emp.emp_name);
        System.out.println("Employee_salary:" + emp.emp_salary);

        scan.close();
    }
}
