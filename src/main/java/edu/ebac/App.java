package edu.ebac;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class App {
    public static void main(String[] args) {
        PessoaFisica joao = new PessoaFisica("123456","987654");
        joao.setNome("JOÃO PAULO");
        joao.setEmail("JOAO@GMAIL.COM");

        PessoaJuridica joaoPj = new PessoaJuridica("45613789-89/878", "Joao Bolos");
        joaoPj.setNome("JOAO PAULO");
    }
}