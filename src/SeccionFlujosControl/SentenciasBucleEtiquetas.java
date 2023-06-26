package SeccionFlujosControl;

public class SentenciasBucleEtiquetas {
    public static void main(String[] args) {

        bucle1:
        for (int i = 1; i <= 7; i++) {
            int j = 1;
            while (j <= 8) {
                if (i == 6 || i == 7) {
                    System.out.println("Dia " + i + ": descanso de fin de semana!");
                    continue bucle1;
                }
                System.out.println("Dia " + i + ", trabajando a las " + j + "hrs. ");
                j++;
            }
        }
        System.out.println("\n================================================");
        // 0 1 3 4 de las i, se salta el 2

    }
}