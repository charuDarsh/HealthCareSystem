import java.util.ArrayList;
import java.util.List;

public class MedRunner {
    public static void main(String[] args) {

        Hospital hospital= new Hospital();

       // create patient
        MedicalRecord record1 = new MedicalRecord("2024/07/22","Anual checkup");
        List<MedicalRecord> medicalHistory = new ArrayList<>();
        medicalHistory.add(record1);
Patient patient = new Patient(1,"Ram",medicalHistory);
 MedicalRecord medicalrecord = new MedicalRecord("2023-07-23", "Annual check-up");
 patient.addMedicalRecord(medicalrecord);
        System.out.println(patient);
hospital.addPatient(patient);
System.out.println(hospital);




Inpatient inpatient = new Inpatient("2023-07-23","101",1,"Ram");
        System.out.println(inpatient);


Outpatient outpatient = new Outpatient("2024-08-22","dr Jam", 4,"Joe");

// medical recods

patient.updateMedicalRecord(0,new MedicalRecord("2023-07-24", "Normal check-up"));

    System.out.println("Updated patient: " + patient);




hospital.addPatient(inpatient);
hospital.addPatient(patient);
hospital.addPatient(outpatient);
      System.out.println(hospital);// hospital information
     System.out.println(hospital.getPatient(1));
    }
}
