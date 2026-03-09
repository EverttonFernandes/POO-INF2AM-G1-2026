package Aula02Dia0203PrimeirosPassosComJava.PrimeirosExercicios.Exercicio1;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // 01) Usando a bibloteca Scanner, informem 3 numeros e diga qual deles e o maior?

        Scanner scanner = new Scanner(System.in);
        System.out.println("Informe o primeiro numero: ");
        int primeiroNumero = scanner.nextInt();

        System.out.println("Informe o segundo numero: ");
        int segundoNumero = scanner.nextInt();

        System.out.println("Informe o terceiro numero: ");
        int terceiroNumero = scanner.nextInt();

        if(primeiroNumero > segundoNumero && primeiroNumero > terceiroNumero){
            System.out.println("O maior numero informado foi o primeiro numero: " + primeiroNumero);
        }

        if(segundoNumero > primeiroNumero && segundoNumero > terceiroNumero){
            System.out.println("O maior numero informado foi o segundo numero: " + segundoNumero);
        }

        if(terceiroNumero > primeiroNumero && terceiroNumero > segundoNumero){
            System.out.println("O maior numero informado foi o terceiro numero: " + terceiroNumero);
        }

    }
}
