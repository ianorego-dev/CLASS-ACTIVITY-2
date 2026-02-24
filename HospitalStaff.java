public abstract class HospitalStaff extends Person {
    private String staffID;

    public HospitalStaff(String name, int age, String gender, String staffID) {
        super(name, age, gender);   // super used
        this.staffID = staffID;     // this used
    }

    public String getStaffID() { return staffID; }

    public abstract void performDuties();
}
