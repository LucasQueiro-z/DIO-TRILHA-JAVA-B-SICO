public class Metodos {
    public static void main(String[] args){
        Metodos metodos = new Metodos();

        double resultados = metodos.somar(10, 20);
        System.out.println(resultados);
    }

    public double somar(int numero1, int numero2){
        return numero1+numero2;
    }

}
