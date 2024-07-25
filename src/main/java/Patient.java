import java.util.List;

public class Patient {
    private int patientID;
    private String name;
    private List<MedicalRecord> medicalHistory;

    public Patient(int patientID, String name, List<MedicalRecord> medicalHistory) {
        this.patientID = patientID;
        this.name = name;
        this.medicalHistory = medicalHistory;
    }

    public Patient(int patientID, String name) {
        this.patientID = patientID;
        this.name = name;

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<MedicalRecord> getMedicalHistory() {
        return medicalHistory;
    }

    public void setMedicalHistory(List<MedicalRecord> medicalHistory) {
        this.medicalHistory = medicalHistory;
    }


    public int getPatientID() {
        return patientID;
    }

    public void setPatientID(int patientID) {
        this.patientID = patientID;
    }

    @Override
    public String toString() {
        return "Patient{" +
                "medicalHistory=" + medicalHistory +
                ", patientID=" + patientID +
                ", name='" + name + '\'' +
                '}';
    }


    public void addMedicalRecord(MedicalRecord record) {
        this.medicalHistory.add(record);
    }

    public void updateMedicalRecord(int index, MedicalRecord newRecord) {
        if (index >= 0) {
            this.medicalHistory.set(index, newRecord);
        } else {
            throw new IndexOutOfBoundsException("Invalid index for medical history");
        }
    }

    public void getMedicalRecord(int index) {
        if (index >= 0) {
            this.medicalHistory.get(index);
        } else {
            throw new IndexOutOfBoundsException("Invalid index for medical history");
        }
    }


}




