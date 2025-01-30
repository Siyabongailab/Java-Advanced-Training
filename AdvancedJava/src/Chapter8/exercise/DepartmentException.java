package Chapter8.exercise;

// DepartmentException.java
public class DepartmentException extends Exception {
    public DepartmentException(String department, int departmentId, int maxEmployees) {
        super("Invalid department details: Department = " + department + ", ID = " + departmentId + ", Max Employees = " + maxEmployees);
    }
}

// Department.java
class Department {
    private String department;
    private int departmentId;
    private int maxEmployees;

    public Department(String department, int departmentId, int maxEmployees) throws DepartmentException {

        setDepartment(department);
        setDepartmentId(departmentId);
        setMaxEmployees(maxEmployees);

        System.out.println("Department created successfully: " + this);
    }

    public void setDepartment(String department) throws DepartmentException {

        if (!department.matches("[A-Za-z]{2}")) { //department doesn't consist of two letters
            throw new DepartmentException(department, departmentId, maxEmployees);
        }
        this.department = department;
    }

    public void setDepartmentId(int departmentId) throws DepartmentException {

        if (departmentId < 100 || departmentId > 499) {
            throw new DepartmentException(department, departmentId, maxEmployees);
        }
        this.departmentId = departmentId;
    }

    public void setMaxEmployees(int maxEmployees) throws DepartmentException{

        if (maxEmployees < 4 || maxEmployees > 10) {
            throw new DepartmentException(department, departmentId, maxEmployees);
        }
        this.maxEmployees = maxEmployees;
    }

    @Override
    public String toString() {
        return "Department{department='" + department + '\'' + ", departmentId=" + departmentId + ", maxEmployees=" + maxEmployees + '}';
    }
}



