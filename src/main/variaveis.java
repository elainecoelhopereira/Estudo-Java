public class variaveis {
    // Execução do nosso programa JAVA
    public static void main(String[] args) {
        System.out.println("Hello, World!"); //equivale ao console.log

        // variaveis no JAVA
        // fortemente tipada e estaticamente tipada
        int idade = 20; // int = número inteiro. colocar o tipo primeiro int e depois o nome da variavel
        double salario = 4500.99; //doubkle = dupla precisão de números, casas decimais
        float nota = 7.5f; // sufixo para float
        long populacaoTerra = 7_900_000_000l; //l de long pq tem quantidade de numeros acima da media
        boolean tarefaConcluida = false; //(true ou false)
        int i = 1, j = 0, k= 1000; //multiplas variaveis
        String nomeCompleto = "Elaine Coelho"; //sempre aspas duplas

        int teste = 10;
        teste = 9; //reatribuição de variaveis / alterar o valor

        final int teste2 = 200; //impossivel mudar o valor. No java o const é final
        //teste2 = 1000;

        //Operadores
        int a = 10;
        int b =5;

        int soma = a+b; //15
        int subtracao = a-b; //5
        int multiplicacao= a*b; //50
        int ivisao = a/b; //2

        System.out.println("O resultado da soma é " + soma); //"O resultado a soma é 15"
        // A DIVISÃO ENTRE DOIS NUM INTEIRO O RESULTADO SERÁ SEMPRE INTEIRO
        int sete = 7;
        int dois = 2;
        double dois2 = 2.0;
        double resultado = sete / dois; //3.0
        System.out.println(resultado);
        double resultado2 = sete/dois2; //3.5
        System.out.println(resultado2);

        //Math
        double x = Math.sqrt(144); //12  Square Root = raiz quadrada
        double y = Math.pow(5,2); //25
        System.out.println(Math.PI);
        //Casting
        int pi2 = (int) Math.PI;
        System.out.println(pi2);

        double resultado3 = sete / (double) dois; // 7 / 2 = 3.5 //o double permite nume não inteiro

        //Operadores 2
        int valor = 5;
        valor++; //incremento +1
        valor--; //decremento -1
        valor += 10; // valor = valor + 10;

        //Operadores relacionais
        boolean teste1 = 5>1; //true
        boolean teste3 = 5<1; //false
        boolean teste4 = 5==5; //true
        boolean teste5 = 5!=1; //true diferente
        boolean teste6 = 6>=6; //true
        boolean teste7 = 5<=9; //true

        //Operadores lógicos
        boolean teste8 = true && false; //false uma condição falsa resultado falso
        boolean teste9= true || false; //true ou basta 1 seja true ele fica true
        boolean teste10= (5>10) && (10<5); //false
        boolean teste11= (10 >= 0)  || (1<5); // true e true
        boolean teste12 = (5>1); //true
        boolean teste13 = !teste12; //false. O ! inverte o resultado lógico
    }
}
