package Aula02Dia0203PrimeirosPassosComJava.Exemplo1UsandoScannerECondicionais;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Permite ter um teclado virtual para ler dados do usuário
        Scanner meuTecladoVirtual = new Scanner(System.in);

        System.out.println("Digite seu nome: ");
        String nomeDoUsuario = meuTecladoVirtual.nextLine();
        System.out.println("O nome informado foi " + nomeDoUsuario);

        System.out.println("Digite sua idade: ");
        int idadeDoUsuario = meuTecladoVirtual.nextInt();
        System.out.println("A idade informada foi " + idadeDoUsuario);

        System.out.println("Olá " + nomeDoUsuario + ", você tem " + idadeDoUsuario + " anos de idade.");

        if (idadeDoUsuario >= 18) {
            System.out.println("Olá você é maior de idade!");
        } else {
            System.out.println("Olá você é menor de idade!");
        }

    }
}
