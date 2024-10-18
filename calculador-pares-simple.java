import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class NumerosParesGUI extends JFrame {
    private JTextField limiteField;
    private JLabel resultadoLabel;
    
    public NumerosParesGUI() {
        // Configurar la ventana
        setTitle("Números Pares");
        setSize(400, 200);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new FlowLayout());
        
        // Crear componentes
        JLabel instruccionLabel = new JLabel("Ingrese el límite:");
        limiteField = new JTextField(10);
        JButton mostrarButton = new JButton("Mostrar Pares");
        resultadoLabel = new JLabel("Resultado aparecerá aquí");
        
        // Agregar componentes
        add(instruccionLabel);
        add(limiteField);
        add(mostrarButton);
        add(resultadoLabel);
        
        // Agregar acción al botón
        mostrarButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                mostrarPares();
            }
        });
    }
    
    private void mostrarPares() {
        try {
            int limite = Integer.parseInt(limiteField.getText());
            
            if (limite < 2) {
                resultadoLabel.setText("Por favor, ingrese un número válido mayor o igual a 2.");
                return;
            }
            
            StringBuilder numerosPares = new StringBuilder();
            for (int numero = 2; numero <= limite; numero += 2) {
                numerosPares.append(numero).append(" ");
            }
            
            resultadoLabel.setText("Números pares: " + numerosPares.toString().trim());
            
        } catch (NumberFormatException ex) {
            resultadoLabel.setText("Por favor, ingrese un número válido.");
        }
    }
    
    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                new NumerosParesGUI().setVisible(true);
            }
        });
    }
}import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class NumerosParesGUI extends JFrame {
    private JTextField limiteField;
    private JLabel resultadoLabel;
    
    public NumerosParesGUI() {
        // Configurar la ventana
        setTitle("Números Pares");
        setSize(400, 200);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new FlowLayout());
        
        // Crear componentes
        JLabel instruccionLabel = new JLabel("Ingrese el límite:");
        limiteField = new JTextField(10);
        JButton mostrarButton = new JButton("Mostrar Pares");
        resultadoLabel = new JLabel("Resultado aparecerá aquí");
        
        // Agregar componentes
        add(instruccionLabel);
        add(limiteField);
        add(mostrarButton);
        add(resultadoLabel);
        
        // Agregar acción al botón
        mostrarButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                mostrarPares();
            }
        });
    }
    
    private void mostrarPares() {
        try {
            int limite = Integer.parseInt(limiteField.getText());
            
            if (limite < 2) {
                resultadoLabel.setText("Por favor, ingrese un número válido mayor o igual a 2.");
                return;
            }
            
            StringBuilder numerosPares = new StringBuilder();
            for (int numero = 2; numero <= limite; numero += 2) {
                numerosPares.append(numero).append(" ");
            }
            
            resultadoLabel.setText("Números pares: " + numerosPares.toString().trim());
            
        } catch (NumberFormatException ex) {
            resultadoLabel.setText("Por favor, ingrese un número válido.");
        }
    }
    
    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                new NumerosParesGUI().setVisible(true);
            }
        });
    }
}
