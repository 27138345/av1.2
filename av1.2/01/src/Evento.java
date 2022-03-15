import java.util.ArrayList;

public class Evento {
    private String nome;
    private String data;
    private ArrayList<Cliente> clientes;

    public Evento(){
        clientes = new ArrayList<>();
    }
    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public String getData() {
        return data;
    }
    public void setData(String data) {
        this.data = data;
    }

    public void setClientes(String nome, int cpf, int telefone, String email){
        Cliente cliente1 = new Cliente();
        cliente1.setNome("Isabelle Lopes Schellmann");
        cliente1.setCpf(01);
        cliente1.setTelefone(01);
        cliente1.setEmail("01@email.com");

        Cliente cliente2 = new Cliente();
        cliente2.setNome("Aluno 02");
        cliente2.setCpf(02);
        cliente2.setTelefone(02);
        cliente2.setEmail("02@email.com");

        Cliente cliente3 = new Cliente();
        cliente3.setNome("Aluno 03");
        cliente3.setCpf(03);
        cliente3.setTelefone(03);
        cliente3.setEmail("03@email.com");

        Cliente cliente4 = new Cliente();
        cliente4.setNome("ALuno 04");
        cliente4.setCpf(04);
        cliente4.setTelefone(04);
        cliente4.setEmail("04@email.com");

        Cliente cliente5 = new Cliente();
        cliente5.setNome("Aluno 05");
        cliente5.setCpf(05);
        cliente5.setTelefone(05);
        cliente5.setEmail("05@email.com");

        clientes.add(cliente1);
        clientes.add(cliente2);
        clientes.add(cliente3);
        clientes.add(cliente4);
        clientes.add(cliente5);
    }

    @Override
    public String toString() {
        return "\n\nEvento: " +
                "\nNome: " + nome +
                "\nData: " + data +
                "\n\nClientes: " + clientes;
    }
}
