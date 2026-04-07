package modulo01.aula04;

public class OperadoresAritmeticos {
    /* Curso de Java 13: Operadores (Aritiméticos, Lógicos e Relacionais) */
    public static void main(String[] args) {
        int resultado = 3;
        System.out.println(resultado);
        --resultado;
        System.out.println(resultado);
        resultado *= 2;
        System.out.println(resultado);
        resultado /= 2;
        System.out.println(resultado);
        resultado += 8;
        System.out.println(resultado);
        resultado %= 7;
        System.out.println(resultado);
        String primeiroNome = "Esta é";
        String segundoNome = " uma String concatenada.";
        String terceiroNome = primeiroNome + segundoNome;
        System.out.println(terceiroNome);
        ++resultado;
        System.out.println(resultado);
        ++resultado;
        System.out.println(resultado);
        System.out.println(resultado++);
        ++resultado;
        System.out.println(resultado);
        --resultado;
        System.out.println(resultado);
        System.out.println(resultado--);
        --resultado;
        System.out.println(resultado);
    }
}

