import java.util.ArrayList;
public class Main {
    public static void main(String[] args) {
        Livros l1 = new Livros();
        l1.setTitulo("Harry Potter");
        l1.setAnoPublicado(1999);
        l1.setAutor("Jurandiiiiiiiir");
        System.out.printf(l1.getTitulo());
        System.out.println(l1.getAnoPublicado());
        System.out.println(l1.getAutor());

       // l1.titulo = "harry potter";
    }

}
