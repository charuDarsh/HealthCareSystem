public class Inpatient extends Patient {
    private String admissionDate;
    private String roomNumber;

    public Inpatient(String admissionDate, String roomNumber, int patientID, String name){
        super(patientID,name);
        this.roomNumber = roomNumber;
        this.admissionDate = admissionDate;

    }

    public String getAdmissionDate() {
        return admissionDate;
    }




    public void setAdmissionDate(String admissionDate) {
        this.admissionDate = admissionDate;
    }

    public String getRoomNumber() {
        return roomNumber;
    }

    public void setRoomNumber(String roomNumber) {
        this.roomNumber = roomNumber;
    }

    @Override
    public String toString() {
        return "Inpatient{" +
                "admissionDate='" + admissionDate + '\'' +
                ", roomNumber='" + roomNumber + '\'' +
                '}';
    }

}
