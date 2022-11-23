public class Stream{
    public void conectar(){
        System.out.println("Conectado");
    }

    public void iniciarStream(){
        Conexao conexao = new Conexao();
        conexao.conectar();
    }
}