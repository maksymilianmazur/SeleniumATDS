package KlasaAbstrakcyjnaInterfejs;

interface Employee {

    int maxVacation = 26;//ta wartość będzie taka sama dla każdego obiektu klasy implementujacej ten interfejs (public final static)
    void takeVacation(int days); //ta metoda jest abstrakcyjna, bez pisania słowa abstract
    void takeSickLeave();

    //metoda która ma implementację w interfejsie, musi mieć słówko default
    default void quitJob() {
        System.out.println("Nara!");
    }

    static void fireEmployees(Employee[] employees) // wykona się na każdym elemencie tablicy
    {
        for (Employee employee:employees)
        {
            employee.quitJob();
        }
    }

}
