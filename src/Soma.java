public class Soma {
    public int soma(int a, int b) {
        int resultado = a + b;
        System.out.println("A soma de " + a + " e " + b + " é: " + resultado);
        return resultado;
    }

    public int multiplicacao(int a, int b) {
        int resultado = a * b;
        System.out.println("A multiplicação de " + a + " e " + b + " é: " + resultado);
        return resultado;
    }

    public double potencia(double base, double expoente) {
        double resultado = Math.pow(base, expoente);
        System.out.println("A potência de " + base + " elevado a " + expoente + " é: " + resultado);
        return resultado;
    }
}

