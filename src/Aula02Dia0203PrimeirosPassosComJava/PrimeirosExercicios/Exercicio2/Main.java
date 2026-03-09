package Aula02Dia0203PrimeirosPassosComJava.PrimeirosExercicios.Exercicio2;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Faça um programa que receba um numero inteiro e acumule o somario de 1 até o numero informado
        // exemplo: se o numer informado for 3, o programa deve calcular 1 + 2 + 3 e imprimir o resultado (6)
        // dica comecem no indice 1 do for e terminem até chegar no numero informado
        // precisarão usar o operador += para acumular na soma

        Scanner scanner = new Scanner(System.in);
        System.out.println("Informe um numero inteiro: ");
        int numeroInformado = scanner.nextInt();

        int somaTotal = 0;

        for (int i = 1; i <= numeroInformado; i++){
            somaTotal += i;
        }
        System.out.println("A soma total de 1 até o numero informado é: " + somaTotal);
    }
}
