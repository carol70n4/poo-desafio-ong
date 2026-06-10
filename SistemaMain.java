public class SistemaMain {

    public static void main(String[] args) {

        Voluntario voluntario = new Voluntario();

        voluntario.setNome("Maria Carolina");
        voluntario.setCpf("12345678900");
        voluntario.setDiasAtuacao(120);
        voluntario.setSetor("Aulas");

        Doador doador = new Doador();

        doador.setNome("Carlos Henrique");
        doador.setCpf("98765432100");
        doador.setDiasAtuacao(200);
        doador.setValorDoadoMensal(150.0);

        ProjetoSocial projeto = new ProjetoSocial();

        projeto.setNomeDoProjeto("Educacao Solidaria");
        projeto.setMetaImpacto(300);
        projeto.setLider(voluntario);

        voluntario.exibirResumo();

        doador.exibirResumo();

        projeto.iniciarProjeto();
    }
}