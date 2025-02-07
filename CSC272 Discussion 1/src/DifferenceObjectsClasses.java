// Marine Corps themed Java program demonstrating classes and objects

// A class defines the blueprint for creating Marine objects
class Marine {
    // Fields (Attributes) - These define characteristics of a Marine
    String name;
    String rank;
    String MOS; // Military Occupational Specialty
    int yearsOfService;

    // Constructor - Defines how a Marine object is created
    Marine(String name, String rank, String MOS, int yearsOfService) {
        this.name = name;
        this.rank = rank;
        this.MOS = MOS;
        this.yearsOfService = yearsOfService;
    }

    // Method - Defines behavior of a Marine
    void reportForDuty() {
        System.out.println(rank + " " + name + " (" + MOS + ") reporting for duty! OORAH!");
    }
}

// Main class demonstrating the difference between a class and objects
public class DifferenceObjectsClasses {
    public static void main(String[] args) {
        // Objects are specific instances of a class
        Marine marine1 = new Marine("Johnson", "Sergeant", "0311 Infantry", 8);
        Marine marine2 = new Marine("Smith", "Corporal", "1371 Combat Engineer", 4);
        Marine marine3 = new Marine("Rebar", "Staff Sergeant", "6531 Aviation Ordnance" + " I.Y.A.O.Y.A.S", 20);

        // Calling methods on objects
        marine1.reportForDuty();
        marine2.reportForDuty();
        marine3.reportForDuty();
    }
}
