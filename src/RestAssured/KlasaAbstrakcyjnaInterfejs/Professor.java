package KlasaAbstrakcyjnaInterfejs;

public class Professor extends User implements Employee
{
    Professor(String username, String password)
    {
       super(username,password);
    }

    void giveNotes(){
        System.out.println("Nadaję oceny");
    }
    void cancelClass(){
        System.out.println("Odwołuję lekcje.");
    }


    @Override
    void sendMessage(String message){
        System.out.println("Wysyłanie wiadomości dla studentów:");
        System.out.println(message);
    }

    @Override
    public void takeVacation(int days)
    {
        System.out.println("Wniosek o wakacje dla profesora wysłany. Długość urlopu: "+days+" dni.");
    }
    @Override
    public void takeSickLeave()
    {
        System.out.println("Informacja o wzięciu zwolnienia lekarskiego ");
    }

}
