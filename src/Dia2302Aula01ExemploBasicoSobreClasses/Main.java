package Dia2302Aula01ExemploBasicoSobreClasses;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        System.out.printf("Bem vindos alunos da INF2AM 2026, vamos criar um teclado simples usando POO\n");
        Teclado teclado = new Teclado("Lenovo", "Preto", 104);

        System.out.println("Marca do teclado: " + teclado.marcaDoTeclado);
        System.out.println("Cor do teclado: " + teclado.cor);
        System.out.println("Quantidade de teclas: " + String.valueOf(teclado.quantidadeDeTeclas));
    }
}