package KlasaAbstrakcyjnaInterfejs;

public class Student extends User {
    Student(String username, String password)
    {
       super (username,password);
    }

    @Override //przesłanianie
    void sendMessage(String message){
        System.out.println("Wysyłanie wiadomości dla profesorów:");
        System.out.println(message);
    }

    void checkNotes()
    {
        System.out.println("Sprawdzam oceny");
    }

    void skipClass()
    {
        System.out.println("Idę na wagary.");
    }
}
