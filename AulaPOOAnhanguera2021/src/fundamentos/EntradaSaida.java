package fundamentos;

import javax.swing.JOptionPane;

public class EntradaSaida {
    public static void main(String[] args) {
        int n1, n2, resultado;
        n1 = Integer.parseInt(JOptionPane.showInputDialog(null, "Digite um número"));
        n2 = Integer.parseInt(JOptionPane.showInputDialog(null, "Digite um número"));
        //System.out.println(n1);
        JOptionPane.showMessageDialog(null, "Resultado: "+(n1 + n2), 
                "Título", JOptionPane.INFORMATION_MESSAGE);
    }
}
