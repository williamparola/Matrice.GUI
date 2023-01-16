import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JTextField;

/**
 *
 * @author gabriel.ricaldone
 */
public class Matrice extends JFrame {

    JTextField[][] A = new JTextField[6][6];
    JButton S = new JButton("Azzera");
    JButton G = new JButton("Genera");
    GestBottone S1 = new GestBottone();

    Matrice() {
        initComponents();
    }

    private void initComponents() {
        this.setLayout(null);
        for (int i = 0; i < 6; i++) {
            for (int j = 0; j < 6; j++) {
                A[i][j] = new JTextField("0");
                this.add(A[i][j]);
                A[i][j].setBounds(10 + (45 * j), 10 + (45 * i), 40, 30);
            }
        }
        S.setBounds(300, 100, 100, 30);
        S.addActionListener(S1);
        G.setBounds(410, 100, 100, 30);
        G.addActionListener(S1);
        this.add(S);
        this.add(G);
        this.setLocation(200, 100);
        this.setSize(500, 400);
    }

    public static void main(String args[]) {

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Matrice().setVisible(true);
            }
        });
    }

    class GestBottone implements ActionListener {

        public void actionPerformed(ActionEvent E) {
            int j = 0, i, n = 0;

            if (E.getSource() == S) {
                for (i = 0; i < 6; i++) {
                    for (j = 0; j < 6; j++) {
                        A[i][j].setText("0");
                    }

                }
            }
            if (E.getSource() == G) {
                for (i = 0; i < 6; i++) {
                    for (j = 0; j < 6; j++) {
                        n = (int) Math.floor(Math.random() * 99) + 1;
                        A[i][j].setText(String.valueOf(n));
                    }
                }
            }

        }
    }
}