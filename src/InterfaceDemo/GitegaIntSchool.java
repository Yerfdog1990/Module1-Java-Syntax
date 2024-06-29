package InterfaceDemo;

public class GitegaIntSchool implements TeachingCareer{
    private String nameofSchool;
    private String location;
    private int tenure;
    private int salary;
    private String role;

    public String getNameofSchool() {
        return nameofSchool;
    }

    public void setNameofSchool(String nameofSchool) {
        this.nameofSchool = nameofSchool;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public int getTenure() {
        return tenure;
    }

    public void setTenure(int tenure) {
        this.tenure = tenure;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public String getRole() {
        return role;
    }

    public void setRole(String role) {
        this.role = role;
    }

    @Override
    public void aboutSchool() {
        System.out.println(String.format("Name of the school: %s.", getNameofSchool()));
        System.out.println(String.format("Location: %s.", getLocation()));
        System.out.println(String.format("Tenure: %d months.", getTenure()));
        System.out.println(String.format("Salary: ksh.%d.", getSalary()));
        System.out.println(String.format("Role: %s", getRole()));

    }
}
