public class HospitalMain {
    public static void main(String[] args) {
        Patient patient1 = new Patient("John Doe", 30, "Male", "P101", "Malaria");
        Doctor doctor1 = new Doctor("Dr. Smith", 45, "Male", "D201", "Cardiology");
        Nurse nurse1 = new Nurse("Nurse Anne", 35, "Female", "N301", "Maternity");

        // Demonstrate overriding + inheritance
        patient1.displayInfo();
        doctor1.displayInfo();
        nurse1.displayInfo();

        doctor1.performDuties();
        nurse1.performDuties();

        // Interface method call
        Appointment appointment1 = new Appointment("A001", "20 June 2026", patient1, doctor1);
        doctor1.scheduleAppointment(appointment1);
        appointment1.displayDetails();

        // Billing + Payable interface
        Billing bill1 = new Billing("B001", patient1, 500.00);
        bill1.generateBill();
        patient1.makePayment(500.00);
        bill1.markAsPaid();
        bill1.generateBill();
    }
}
