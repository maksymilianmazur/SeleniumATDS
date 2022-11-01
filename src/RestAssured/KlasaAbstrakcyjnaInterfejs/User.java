package KlasaAbstrakcyjnaInterfejs;

abstract class User {
    String username;
    String password;
    String name;
    String lastName;

    User(String username, String password)
    {
        this.username = username;
        this.password = password;
    }

    void login(String username, String password)
    {
        if(username.equals(this.username)&& password.equals(this.password))
        {
            System.out.println("Logowanie użytkownika: "+username+"/"+password);
        }
        else
        {
            System.out.println("Nieprawidłowe hasło i/lub nazwa użytkownika.");
        }
    }
    void logout(){
        System.out.println("Wylogowywanie");
    }
    abstract void sendMessage(String message); //metoda abstrakcyjna, każda klasa dziedzicząca po tej klasie ma mieć taką metodę
    {

    }
}
