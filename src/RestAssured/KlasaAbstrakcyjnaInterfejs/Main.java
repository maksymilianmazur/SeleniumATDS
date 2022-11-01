package KlasaAbstrakcyjnaInterfejs;

public class Main {
    public static void main (String[] args)
    {
        Student student = new Student ("Maxime","Mazursky");
        student.login("Maxime","Mazursky");
        Professor user = new Professor("Profesor","1111");
        Professor professor = new Professor("profesor","test123");
        Professor professor2 = new Professor("profesor2","test123");

        Employee[] employees = {professor,professor2}; //tablica obiektów
       // professor.quitJob();
        Employee.fireEmployees(employees);
    }
}
