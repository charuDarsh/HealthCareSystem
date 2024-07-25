public class Outpatient extends Patient{

    private String appointmentDate;
    private String doctorName;


    public Outpatient(String appointmentDate, String doctorName, int patientID, String name){
        super(patientID,name);
        this.doctorName = doctorName;
        this.appointmentDate = appointmentDate;

    }


    public String getAppointmentDate() {
        return appointmentDate;
    }

    public void setAppointmentDate(String appointmentDate) {
        this.appointmentDate = appointmentDate;
    }

    public String getDoctorName() {
        return doctorName;
    }

    public void setDoctorName(String doctorName) {
        this.doctorName = doctorName;
    }

    @Override
    public String toString() {
        return "Outpatient{" +
                "appointmentDate='" + appointmentDate + '\'' +
                ", doctorName='" + doctorName + '\'' +
                '}';
    }
}
