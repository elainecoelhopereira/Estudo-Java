package main.java;

import java.awt.*;
import java.util.Scanner;

public class calculadoraIMC {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.println("Qual o seu nome?");
        String nome = entrada.nextLine();

        System.out.println("Qual a sua idade?");
        int idade = entrada.nextInt();

        System.out.println("Qual a sua altura (m)?"); //responder com virgula
        double altura = entrada.nextDouble();

        System.out.println("Qual seu peso?");
        double peso = entrada.nextDouble();

        //Calcule o IMC = PESO / ALTURA ^ 2
        double imc = peso / (altura * altura); // peso /Math.pow(altura, 2)

        System.out.println("Olá, meu nome é " + nome + " e tenho " + idade + " anos!");
        System.out.println("Este é o seu IMC = " + imc); //pq no final ele pula uma linha
        System.out.printf("Este é o seu IMC = %.2f\n", imc); //%.2f p colocar apenas 2 casas decimais
        System.out.printf("Olá, meu nome é %s e tenho %d anos!\n", nome, idade);

        //https://www.calculoimc.com.br/tabela-de-imc/
        if (imc < 17) {
            System.out.println("Muito abaixo do peso");
        } else if (imc > 17 && imc <= 18.49) {
            System.out.println("Abaixo do peso");
        } else if (imc >= 18.5 && imc <= 24.99) {
            System.out.println("Peso Normal");
        } else if (imc >= 25 && imc <= 29.99) {
            System.out.println("Acima do peso");
        } else if (imc >= 30 && imc <= 34.99) {
            System.out.println("Obesidade I");
        } else if (imc >= 35 && imc <= 39.99) {
            System.out.println("Obesidade II (Severa)");
        } else {
            System.out.println("Obesidade III(Mórbida");
        }

        //Switch-case
        System.out.println("Selecione uma dieta (1 a 3)");
        System.out.println("1 - Agua");
        System.out.println("2 - Fruta");
        System.out.println("3 - Batata");
        int dieta = entrada.nextInt();

        switch (dieta) {
            case 1:
                System.out.println("Você escolheu a dieta da água!");
                break;
            case 2:
                System.out.println("Você escolheu a dieta da fruta!");
                break;
            case 3:
                System.out.println("Você escolheu a dieta da batata!");
                break;
            default:  //"else""
                System.out.println("Esta dieta não existe!");
        }

        System.out.println("Você tem quantos elementos preferidos!");
        int totalAlimentos = entrada.nextInt();

        for(int i = 0; i< totalAlimentos; i++){  //i-variavel de controle
            System.out.println(i);
        }

        int i = 0;
        while (i < totalAlimentos){
            System.out.println(i);
            i++;
        }

    }
}