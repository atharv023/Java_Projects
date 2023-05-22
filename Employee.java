package MiniProject1;

public class Employee {
    private int employeeId;
    private String employeeName;
    private String employeeAddress;
    private String employeeDesignation;
    private long employeeContact;

    public Employee() {
        super();
    }

    public Employee(int employeeId, String employeeName, String employeeAddress, String employeeDesignation,
            long employeeContact) {
        super();
        this.employeeId = employeeId;
        this.employeeName = employeeName;
        this.employeeAddress = employeeAddress;
        this.employeeDesignation = employeeDesignation;
        this.employeeContact = employeeContact;
    }

    public int getEmployeeId() {
        return employeeId;
    }

    public void setEmployeeId(int employeeId) {
        this.employeeId = employeeId;
    }

    public String getEmployeeName() {
        return employeeName;
    }

    public void setEmployeeName(String employeeName) {
        this.employeeName = employeeName;
    }

    public String getEmployeeAddress() {
        return employeeAddress;
    }

    public void setEmployeeAddress(String employeeAddress) {
        this.employeeAddress = employeeAddress;
    }

    public String getEmployeeDesignation() {
        return employeeDesignation;
    }

    public void setEmployeeDesignation(String employeeDesignation) {
        this.employeeDesignation = employeeDesignation;
    }

    public long getEmployeeContact() {
        return employeeContact;
    }

    public void setEmployeeContact(long employeeContact) {
        this.employeeContact = employeeContact;
    }

    @Override
    public String toString() {
        return "Employee [employeeId=" + employeeId + ", employeeName=" + employeeName + ", employeeAddress="
                + employeeAddress + ", employeeDesignation=" + employeeDesignation + ", employeeContact="
                + employeeContact + "]";
    }
}