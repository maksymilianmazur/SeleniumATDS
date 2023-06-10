package library.app;

public class LibraryApp {
    private static final String APPNAME = "Biblioteka v0.9";
    public static void main(String[] args) {
        System.out.println(APPNAME);
        LibraryControl libControl = new LibraryControl();
        libControl.controlLoop();
    }
}