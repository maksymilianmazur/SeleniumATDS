package KlasaAbstrakcyjnaInterfejs;

public class OfficeWorker extends User implements Employee {

    OfficeWorker(String username, String password)
    {
        super(username,password);
    }
    @Override //przesłanianie
    void sendMessage(String message)
    {
        System.out.println("Wysyłanie wiadomości do studentów:");
        System.out.println(message);
    }

    @Override
    public void takeVacation(int days)
    {
        System.out.println("Wniosek o wakacje dla pracownika biurowego wysłany. Długość urlopu: "+days+" dni.");
    }
    @Override
    public void takeSickLeave()
    {
        System.out.println("Informacja o wzięciu zwolnienia lekarskiego ");
    }


}
