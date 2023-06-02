public class Main {
    public static void main(String[] args) {
        Calculadora c1 = new Calculadora();
        Soma s1 = new Soma();
        
        s1.soma(-5, 5);
        c1.subtracao(5, -5);
        s1.multiplicacao(3, 8);
        c1.divisao(7, 2);  
        s1.potencia(2, 3); 
    }
}