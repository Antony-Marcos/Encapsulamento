public class Livros {
    private String titulo;
    private String autor;
    private int anoPublicado;
    private double preco;

    public void setTitulo(String titulo){
        this.titulo = titulo;
    }

    public void setAutor(String autor){
        this.autor = autor;
    }

    public void setAnoPublicado(int anoPublicado){
        this.anoPublicado = anoPublicado;
    }

    public String getTitulo(){
        return this.titulo;
    }

    public String getAutor(){
        return this.autor;
    }

    public int getAnoPublicado(){
        return this.anoPublicado;
    }
//    Livros(String titulo , String autor , int anoPublicado , double preco  ){
//        this.titulo = titulo ;
//        this.autor = autor ;
//        this.anoPublicado = anoPublicado ;
//        this.preco = preco ;
//
//    }







//    void mostrarDetalhes(){
//        System.out.println("Titulo:" + titulo);
//        System.out.println("Autor:" + autor);
//        System.out.println("Ano de publicação: " + anoPublicado);
//        System.out.println("Preço: " + preco);
//
//    }
//    void alterarPreço(double novoPreço){
//        preco=novoPreço;
//    }
}
