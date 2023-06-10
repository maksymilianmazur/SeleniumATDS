package JavaStart.School;
class BootcampOnline extends OnlineCourse {
    private String teacher;
    private int consultationHours;

    public BootcampOnline(int videoLengthMin, int timeToFinish, String id, String title, String description, double price,String teacher, int consultationHours) {
        super(videoLengthMin, timeToFinish, id, title, description, price);
        this.teacher = teacher;
        this.consultationHours = consultationHours;
    }


    @Override
    void additionalInfo(){
        System.out.println("\n Additional Info \nteacher: " + teacher + "\n consultationHours: "+ consultationHours);
    }


    public String getTeacher() {
        return teacher;
    }

    public void setTeacher(String teacher) {
        this.teacher = teacher;
    }

    public int getConsultationHours() {
        return consultationHours;
    }

    public void setConsultationHours(int consultationHours) {
        this.consultationHours = consultationHours;
    }
}