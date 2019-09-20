import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
public class ConfigurationScreen extends JFrame implements ActionListener, WindowListener {
    /*
    * OKKKK so this is the configurationScreen
    * title: Game Set-Up
    * textbox where players can enter their character's name
    * checkboxes to select level (easy, hard, medium)
    * Text displaying amount of money (based on level selected)
    * meters to set 4 skill levels
    * Confirm button at bottom to go to a confirmation screen
    *
     */
    private static JFrame configFrame;
    private static String charName;
    private static JTextField userEntry;
    private static JTextArea characters;
    private static JButton confirmButton;

    public static void createGUI() {
        configFrame = new JFrame("Set-Up");
        configFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        Dimension size = new Dimension(500, 400);
        configFrame.setPreferredSize(size);
        configFrame.setLocation(450, 200);

        confirmButton = new JButton("Confirm");

        JPanel pane = makeWelcomePane();

        configFrame.add(pane);
        configFrame.add(makeTextPane("Configure Your Character"));

        configFrame.add(makeTextField());

        configFrame.pack();
        configFrame.setVisible(true);

        confirmButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                JFrame config = new ConfirmationScreen();
                config.setVisible(true);
                configFrame.dispose();
            }
        });
    }

    public static JTextField makeTextField() {
        userEntry = new JTextField(15);
        TextFieldListener tfListen = new TextFieldListener();
        userEntry.addActionListener(tfListen);

        return userEntry;
    }

    private static class TextFieldListener implements ActionListener {
        public void actionPerformed(ActionEvent event)
        {   String charName = userEntry.getText();
        }
    }

    public static JPanel makeWelcomePane() {
        JPanel p = new JPanel();
        p.setBorder(BorderFactory.createTitledBorder("Set-Up"));
        BoxLayout layout = new BoxLayout(p, BoxLayout.X_AXIS);
        p.setLayout(layout);

        return p;
    }

    public static JPanel makeTextPane(String name) {
        JPanel textP = new JPanel();
        addText(name, textP);
        return textP;
    }

    public static JPanel makeButtonPane() {
        JPanel p = new JPanel();
//        p.setBorder(BorderFactory.createTitledBorder("Welcome"));
        BoxLayout layout = new BoxLayout(p, BoxLayout.X_AXIS);
        p.setLayout(layout);



        addButton(confirmButton, p);
        return p;
    }

    private static void addText(String text, Container container) {
//        JTextField textBox = new JTextField(text, 20);
//        textBox.setAlignmentX(CENTER_ALIGNMENT);
//        textBox.setAlignmentY(TOP_ALIGNMENT);

        JLabel newText = new JLabel(text);
        container.add(newText);
    }

    private static void addButton(JButton myButton, Container container) {
        JButton button = myButton;
        button.setAlignmentX(CENTER_ALIGNMENT);
        button.setAlignmentY(BOTTOM_ALIGNMENT);
        container.add(button);

        //if (button.getName() == "Start New Game") {
//            button.addActionListener(new ActionListener() {
//                @Override
//                public void actionPerformed(ActionEvent e) {
//                    JFrame config = new ConfigurationScreen();
//                    config.setVisible(true);
//                }
//            });
        // }
    }

    public static void main(String[] args) {
        javax.swing.SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                createGUI();
            }
        });
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






