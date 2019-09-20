import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class ConfirmationScreen extends JFrame implements ActionListener, WindowListener {
    private static JFrame confirmFrame;
    private static JPanel confirmPanel;
    private static String charName;
    private static String level;
    private static int credits;
    private static int skillPoints;

    public ConfirmationScreen(String title, String character, String level, int skillPoints, int credits) {
        confirmFrame = new JFrame(title);
        charName = character;
        level = this.level;
        skillPoints = this.skillPoints;
        credits = this.credits;


        confirmFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);


        createGUI();
    }

    public static void createGUI() {
        Dimension size = new Dimension(500, 400);
        confirmFrame.setPreferredSize(size);
        confirmFrame.setLocation(450, 200);

        confirmPanel = new JPanel();
        confirmPanel.setBorder(BorderFactory.createTitledBorder("Confirm Settings"));
        BoxLayout layout = new BoxLayout(confirmPanel, BoxLayout.X_AXIS);
        confirmPanel.setLayout(layout);

        confirmPanel.add(makeTextPane("Confirm Settings"));

        confirmFrame.add(confirmPanel);
        confirmFrame.pack();
        confirmFrame.setVisible(true);

    }

    public static JPanel makeTextPane(String name) {
        JPanel textP = new JPanel();
        addText(name, textP);
        return textP;
    }

    private static void addText(String text, Container container) {
        JLabel newText = new JLabel(text);
        container.add(newText);
    }

    @Override
    public void actionPerformed(ActionEvent e) {

    }

    @Override
    public void windowOpened(WindowEvent e) {

    }

    @Override
    public void windowClosing(WindowEvent e) {

    }

    @Override
    public void windowClosed(WindowEvent e) {

    }

    @Override
    public void windowIconified(WindowEvent e) {

    }

    @Override
    public void windowDeiconified(WindowEvent e) {

    }

    @Override
    public void windowActivated(WindowEvent e) {

    }

    @Override
    public void windowDeactivated(WindowEvent e) {

    }
}
