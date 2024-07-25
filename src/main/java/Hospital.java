import java.util.ArrayList;
import java.util.List;

public class Hospital<T extends Patient> {

    private List<T> patients ;
    public Hospital() {
        this.patients = new ArrayList<>();
    }

   public void addPatient(T patient){
       patients.add(patient);
   }

   public T getPatient(int patientID){
       for(T patient :patients){
           if(patient.getPatientID()==patientID){
               return patient;
           }
       }
       return null;
   }

    @Override
    public String toString() {
        return "Hospital{" +
                "patients=" + patients +
                '}';
    }





}
