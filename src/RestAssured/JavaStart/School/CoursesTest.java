package JavaStart.School;

class CoursesTest {
    public static void main(String[] args) {
        OnlineCourse online = new OnlineCourse(600,1200,"JAVA-ONLINE-123","Kurs JavaStart Online","Najlepszy kurs programowania w Javie",299);
        //online.printBasicInfo();
      //  online.additionalInfo();

        BootcampOnline Bootcamp = new BootcampOnline(500,1000,"Kowalski","Bootcamp online","Kurs programowania w Python",199,"Mazurski",2);
        Bootcamp.printBasicInfo();
        Bootcamp.additionalInfo();
        //Bootcamp.additionalInfo();
        //Bootcamp.printBasicInfo();



    }
}