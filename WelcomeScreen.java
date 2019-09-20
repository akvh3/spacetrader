
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class WelcomeScreen extends JFrame implements ActionListener, WindowListener {
    /*
     * display a welcome screen
     * needs option to start New Game
     * blank window with the text
     * include start button
     *
     * Features: startButton that when clicked will take you
     * to the configurationScreen where you can edit your player
     * it also has text that welcomes the user
     */

    private static JFrame mainFrame;
    private static JButton startButton;

    public static void createGUI() {
        mainFrame = new JFrame("Welcome Screen");
        mainFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        Dimension size = new Dimension(500, 400);
        mainFrame.setPreferredSize(size);
        mainFrame.setLocation(450, 200);

        startButton = new JButton("Start New Game");

        JPanel pane = makeWelcomePane();

        mainFrame.add(pane);

        mainFrame.pack();
        mainFrame.setVisible(true);

        startButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                //ConfigurationScreen();
                mainFrame.dispose();
                JFrame config = new ConfigurationScreen("Set-Up");
                config.setVisible(true);
            }
        });
    }

    public static JPanel makeWelcomePane() {
        JPanel p = new JPanel();
        p.setBorder(BorderFactory.createTitledBorder("Welcome"));
        BoxLayout layout = new BoxLayout(p, BoxLayout.X_AXIS);
        p.setLayout(layout);

        //addText("Welcome to Space Trader!", p);
//
        p.add(makeButtonPane());
        p.add(makeTextPane("Welcome to Space Trader!"));

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

        //addButton("Levels", p);
        addButton(startButton, p);
        //addButton("Trade", p);

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
