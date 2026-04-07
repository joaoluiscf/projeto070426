public class ex2 {

    public static double calcularMedia(int a, int b) {
        if (a < 0 || b < 0) {
            throw new IllegalArgumentException("Os valores não podem ser negativos.");
        }

        return (a + b) / 2.0;
    }

    public static void main(String[] args) {
        try {
            double media = calcularMedia(8, 6);
            System.out.println("Média: " + media);

            double media2 = calcularMedia(-3, 5);
            System.out.println("Média: " + media2);

        } catch (IllegalArgumentException e) {
            System.out.println("Erro: " + e.getMessage());
        }
    }
}