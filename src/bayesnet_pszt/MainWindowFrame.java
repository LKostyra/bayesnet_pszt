package bayesnet_pszt;

import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;

public class MainWindowFrame extends JFrame {
    private final JMenu debugMenu;
    private final JMenuItem debugOpenDiagramTest;
    // private DiagramTestWindowFrame diagramTestWindowFrame;

    /**
     * Launch the application.
     */
    public static void main(String[] args) {
        EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {
                try {
                    MainWindowFrame frame = new MainWindowFrame();
                    frame.setVisible(true);
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        });
    }

    /**
     * Create the frame.
     */
    public MainWindowFrame() {
        setTitle("BayesPSZT - Main Window");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setBounds(100, 100, 507, 343);

        //TODO: create DiagramTestWindowFrame object here

        JMenuBar menuBar = new JMenuBar();

        debugMenu = new JMenu("DEBUG");
        debugOpenDiagramTest = new JMenuItem("Open DiagramTest");
        debugOpenDiagramTest.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                // TODO: make DiagramTestWindowFrame visible here
            }
        });
        debugMenu.add(debugOpenDiagramTest);
        menuBar.add(debugMenu);

        setJMenuBar(menuBar);
    }
}