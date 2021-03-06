package LearningHowToSwing;

import java.awt.Container;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.GraphicsEnvironment;
import javax.swing.GroupLayout;
import javax.swing.JComponent;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.JScrollPane;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;

// TODO: Auto-generated Javadoc
/**
 * The Class ListEx.
 */
public class ListEx extends JFrame {

    /** The label. */
    private JLabel label;
    
    /** The spane. */
    private JScrollPane spane;

    /**
     * Instantiates a new list ex.
     */
    public ListEx() {

        initUI();
    }

    /**
     * Inits the UI.
     */
    private void initUI() {

        GraphicsEnvironment ge
                = GraphicsEnvironment.getLocalGraphicsEnvironment();

        String[] fonts = ge.getAvailableFontFamilyNames();

        JList list = new JList(fonts);
        list.addListSelectionListener(new ListSelectionListener() {
            @Override
            public void valueChanged(ListSelectionEvent e) {
                if (!e.getValueIsAdjusting()) {
                    String name = (String) list.getSelectedValue();
                    Font font = new Font(name, Font.PLAIN, 12);
                    label.setFont(font);
                }
            }
        });

        spane = new JScrollPane();
        spane.getViewport().add(list);

        label = new JLabel("Aguirre, der Zorn Gottes");
        label.setFont(new Font("Serif", Font.PLAIN, 12));

        createLayout(spane, label);
        
        setTitle("JList");
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
    }

    /**
     * Creates the layout.
     *
     * @param arg the arg
     */
    private void createLayout(JComponent... arg) {

        Container pane = getContentPane();
        GroupLayout gl = new GroupLayout(pane);
        pane.setLayout(gl);

        gl.setAutoCreateContainerGaps(true);
        gl.setAutoCreateGaps(true);

        gl.setHorizontalGroup(gl.createParallelGroup()
                .addComponent(arg[0])
                .addComponent(arg[1])
                
        );

        gl.setVerticalGroup(gl.createSequentialGroup()
                .addComponent(arg[0])
                .addComponent(arg[1])
        );

        pack();
    }

    /**
     * The main method.
     *
     * @param args the arguments
     */
    public static void main(String[] args) {

        EventQueue.invokeLater(() -> {
            ListEx ex = new ListEx();
            ex.setVisible(true);
        });
    }
}