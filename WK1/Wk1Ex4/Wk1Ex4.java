class Wk1Ex4 {
    public static void main(String[] args) {

        Student student1 = new Student("Stuart", "Boldon", "Computing", 3, 8250);
        System.out.println(student1.toString());

        System.out.println();

        Staff staff1 = new Staff("Bob", "Sunderland", "Sunderland Uni", 25000);
        System.out.println(staff1.toString());
    }
}

 class Person {
    private String name;
    private String address;

    public Person(String nameParam, String addressParam) {
        this.name = nameParam;
        this.address = addressParam;
    }

    public String getName() {
        return name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String newAddress) {
        address = newAddress;
    }

    public String toString() {
        return("Name: " + name + "\nAddress: " + address);
    }
}


class Student extends Person {
    private String program;
    private int year;
    private double fee;

    public Student(String nameParam, String addressParam, String programParam, int yearParam, double feeParam) {
        super(nameParam, addressParam);
        this.program = programParam;
        this.year = yearParam;
        this.fee = feeParam;
    }

    public String getProgram() {
        return program;
    }

    public void setProgram(String newProgram) {
        this.program = newProgram;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int newYear) {
        this.year = newYear;
    }

    public double getFee() {
        return fee;
    }

    public void setFee(double newFee) {
        this.fee = newFee;
    }

    public String toString() {
        return("Student name: " + super.getName() + "\n" +
                "Student address: " + super.getAddress() + "\n" +
                "Student program: " + program + "\n" +
                "Student year: " + year + "\n" +
                "Student fee: " + fee);
    }
}

class Staff extends Person {
    private String school;
    private double pay;

    public Staff(String nameParam, String addressParam, String schoolParam, double payParam) {
        super(nameParam, addressParam);
        this.school = schoolParam;
        this.pay = payParam;
    }

    public String getSchool(String schoolParam) {
        return schoolParam;
    }

    public void setSchool() {
        this.school = school;
    }

    public double getPay(double payParam) {
        return payParam;
    }

    public void setPay(){
        this.pay = pay;
    }

    public String toString() {
        return("Staff name: " + super.getName() + "\n" +
                "Staff address: " + super.getAddress() + "\n" +
                "Staff school: " + school + "\n" +
                "Student pay: " + pay);
    }
}
