import javax.swing.*;



public class UncheckedException {
    public static void main(String[] args) {

        boolean continueLooping = true;

        do {
            try {
                String a = JOptionPane.showInputDialog("Numerador: ");
                String b = JOptionPane.showInputDialog("Denominador: ");

                int resultado = dividir(Integer.parseInt(a), Integer.parseInt(b));
                System.out.println("Resultado: " + resultado);
                continueLooping = false;
            } catch (NumberFormatException e) {
                JOptionPane.showMessageDialog(null, "Entrada invalida, informe um número");
            } catch (ArithmeticException e) {
                JOptionPane.showMessageDialog(null, "Impossivel dividir numero por 0.");
            } finally {
                System.out.println("Vc chegou no finally");
            }
            System.out.println("O codigo fechou");
        } while (continueLooping);
    }

    private static int dividir(int a, int b) {
        return a/b;
    }
}