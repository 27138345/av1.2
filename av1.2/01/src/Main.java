public class Main {
    public static void main(String[] args) {
        Evento evento1 = new Evento();
        evento1.setNome("Evento 01");
        evento1.setData("05/02");
        evento1.setClientes("Isabelle Lopes Schellmann",01, 01, "01@email.com");
        evento1.setClientes("Aluno 02",02, 02, "02@email.com");
        evento1.setClientes("Aluno 03",03, 03, "03@email.com");
        evento1.setClientes("Aluno 04",04, 04, "04@email.com");
        evento1.setClientes("Aluno 05",05, 05, "05@email.com");

        Evento evento2 = new Evento();
        evento2.setNome("Evento 02");
        evento2.setData("06/02");
        evento2.setClientes("Isabelle Lopes Schellmann",01, 01, "01@email.com");
        evento2.setClientes("Aluno 02",02, 02, "02@email.com");
        evento2.setClientes("Aluno 03",03, 03, "03@email.com");
        evento2.setClientes("Aluno 04",04, 04, "04@email.com");
        evento2.setClientes("Aluno 05",05, 05, "05@email.com");

        Evento evento3 = new Evento();
        evento3.setNome("Evento 03");
        evento3.setData("07/02");
        evento3.setClientes("Isabelle Lopes Schellmann",01, 01, "01@email.com");
        evento3.setClientes("Aluno 02",02, 02, "02@email.com");
        evento3.setClientes("Aluno 03",03, 03, "03@email.com");
        evento3.setClientes("Aluno 04",04, 04, "04@email.com");
        evento3.setClientes("Aluno 05",05, 05, "05@email.com");

        System.out.println(evento1);
        System.out.println(evento2);
        System.out.println(evento3);

    }
}
