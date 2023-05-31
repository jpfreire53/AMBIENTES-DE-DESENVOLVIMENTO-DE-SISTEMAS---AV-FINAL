public class Calculadora {
        public int soma(int a, int b) {
            int resultado = a + b;
            System.out.println("A soma de " + a + " e " + b + " é: " + resultado);
            return resultado;
        }

        public int subtracao(int a, int b) {
            int resultado = a - b;
            System.out.println("A subtração de " + a + " e " + b + " é: " + resultado);
            return resultado;
        }

        public int multiplicacao(int a, int b) {
            int resultado = a * b;
            System.out.println("A multiplicação de " + a + " e " + b + " é: " + resultado);
            return resultado;
        }

        public double divisao(double a, double b) {
            if (b != 0) {
                double resultado = a / b;
                System.out.println("A divisão de " + a + " por " + b + " é: " + resultado);
                return resultado;
            } else {
                throw new ArithmeticException("Divisão por zero não é permitida.");
            }
        }
}
