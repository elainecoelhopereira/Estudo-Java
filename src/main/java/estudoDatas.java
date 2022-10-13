package main.java;

import java.time.LocalDate;

public class estudoDatas {
    public static void main(String[] args) {
        // data -mês - ano
        // LocalDate armazena qq data (dia, mês, ano)
        LocalDate hoje = LocalDate.now(); // pega data atual
        System.out.println(hoje);

        LocalDate natal = LocalDate.of(2022, 12, 25);
        System.out.println(natal);

        System.out.println(hoje.isAfter(natal)); // verifica se a data é depois da especificada
        System.out.println(hoje.isBefore(natal)); // verifica se a data é antes da especificada
        int ano = hoje.getYear(); // o ano da data
        int mes = hoje.getMonthValue(); // numero do mes
        int dia = hoje.getDayOfMonth(); // numero do dia do mes

        int diasParaNatal = natal.getDayOfYear() - hoje.getDayOfYear(); // subtrair o dia do natal pelo dia de hoje

        System.out.println(ano);
        System.out.println(mes);
        System.out.println(dia);

        System.out.println("Faltam " + diasParaNatal + " dias p/ natal!!!!");
        System.out.println(hoje.getDayOfYear() - natal.getDayOfYear()); //-73

    }
}
