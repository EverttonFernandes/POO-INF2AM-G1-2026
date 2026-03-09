package Aula02Dia0203PrimeirosPassosComJava.PrimeirosExercicios.Exercicio3;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        /*
         * 3) Crie um programa em Java que solicite ao usuário três notas, utilizando o tipo de dado float.
         * Em seguida, calcule a média aritmética dessas três notas e exiba o resultado na tela com apenas uma casa decimal.
         * */
        Scanner scanner = new Scanner(System.in);
        System.out.println("Informe a primeira nota: ");
        float primeiraNota = scanner.nextFloat();

        System.out.println("Informe a segunda nota: ");
        float segundaNota = scanner.nextFloat();

        System.out.println("Informe a terceira nota: ");
        float terceiraNota = scanner.nextFloat();

        float media = (primeiraNota + segundaNota + terceiraNota) / 3;

        System.out.println("A média aritmética das três notas é: %.1f\n" + media);

    }
}
