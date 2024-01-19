import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class usuarios extends JFrame {
    private JTextField txtval1;
    private JTextField txtval2;
    private JButton saludarButton;
    private JButton unionButton;
    private JButton cerrarButton;
    private JPanel usuarios1;
    private JButton limpiarButton;
    private JTextField resultado;
    private JButton sumarButton;
    private JTextField Sum;


    public usuarios(){
          super("Operaciones");
          setContentPane(usuarios1);
        cerrarButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                dispose();
                System.exit(0);
            }
        });
        limpiarButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                txtval1.setText("");
                txtval2.setText("");
            }
        });
        unionButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String text1 = txtval1.getText();
                String text2 = txtval2.getText();

                String resul = text1 + text2;

                resultado.setText(resul);


            }
        });
        sumarButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String text1 = txtval1.getText();
                String text2 = txtval2.getText();
                try{
                    double num1 = Double.parseDouble(text1);
                    double num2 = Double.parseDouble(text2);
                    double resultado = num1 + num2;
                    Sum.setText(String.valueOf(resultado));

                }catch(NumberFormatException exception){
                    JOptionPane.showMessageDialog(null, "Ingrese números válidos", "Error", JOptionPane.ERROR_MESSAGE);
                }
            }
        });
    }

}
