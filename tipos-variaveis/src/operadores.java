public class operadores {
    public static void main(String[] args){
        int a = 5;
        int b = 5;
        int c = a + b;
        // System.out.println(c);
        c = a - b;
        // System.err.println(c);
        c = a * b;
        // System.err.println(c);
        c = a / b;
        // System.err.println(c);
        c = a % b;
        // System.err.println(c);
        c = a > b ? 1 : 0;
        // System.out.println(c);

        boolean condicao1 = true;
        boolean condicao2 = false;

        if (condicao1 && condicao2){
            System.out.println("As duas são verdadeiras");
        }else{
            System.out.println("As duas são falsas");
        }

        if(condicao1 || condicao2){
            System.out.println("uma das condições é verdadeira!");
        }

    }
}
