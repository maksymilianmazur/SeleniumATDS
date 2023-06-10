package JavaStart.School;

class OnlineCourse extends Course {
    private int videoLengthMin;
    private int timeToFinish;

    public OnlineCourse(int videoLengthMin, int timeToFinish,String id, String title, String description, double price) {
        super(id,title,description,price);
        this.videoLengthMin = videoLengthMin;
        this.timeToFinish = timeToFinish;
    }
    @Override
    void additionalInfo(){
        System.out.println("\n Additional Info \n videoLengthMin: " + videoLengthMin + "\n timeToFinish: "+ timeToFinish);
    }



    public int getVideoLengthMin() {
        return videoLengthMin;
    }

    public void setVideoLengthMin(int videoLengthMin) {
        this.videoLengthMin = videoLengthMin;
    }

    public int getTimeToFinish() {
        return timeToFinish;
    }

    public void setTimeToFinish(int timeToFinish) {
        this.timeToFinish = timeToFinish;
    }
}