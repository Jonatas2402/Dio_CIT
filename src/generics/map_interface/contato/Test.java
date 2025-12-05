package generics.map_interface.contato;

public class Test {
    public static void main(String[] args) {
        AgendaContatos agenda = new AgendaContatos();

        agenda.adicionarContato("Jonatas", 99631808);
        agenda.adicionarContato("ana", 99845247);
        agenda.adicionarContato("José", 87456321);
        agenda.adicionarContato("Alex", 85296471);
        agenda.adicionarContato("Andre", 96387524);

        agenda.exibirContatos();

        agenda.pesquisarPorNome("Jonatas");

        agenda.removerContato("Jonatas");

        agenda.exibirContatos();

    }
}
