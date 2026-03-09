package Aula02Dia0203PrimeirosPassosComJava.PrimeirosExercicios.Exercicio4;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Informe um numero inteiro: ");
        int numeroInformado = scanner.nextInt();

        int totalDePares = 0;

        for (int i = 1; i <= numeroInformado; i++){
            if (i % 2 == 0){
                totalDePares++;
            }
        }

        System.out.println("O total de numeros pares entre 1 e o numero informado é: " + totalDePares);
    }
}
