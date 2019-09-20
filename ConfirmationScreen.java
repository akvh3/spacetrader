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
    private static int fighterSkill;
    private static int merchantSkill ;
    private static int engineerSkill;
    private static int pilotSkill;


    public ConfirmationScreen(String title, String character,
                              String level, int skillPoints, int fSkill,
                              int mSkill, int eSkill, int pSkill) {
        confirmFrame = new JFrame(title);
        confirmFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        charName = character;
        level = this.level;
        skillPoints = this.skillPoints;
        fighterSkill = fSkill;
        merchantSkill = mSkill;
        engineerSkill = eSkill;
        pilotSkill = pSkill;

        if (level == "Easy") {
            credits = 8;
        } else if (level == "Medium") {
            credits = 12;
        } else {
            credits = 16;
            level = "Hard";
        }
        createGUI();
    }

    public static void createGUI() {
        Dimension size = new Dimension(500, 400);
        confirmFrame.setPreferredSize(size);
        confirmFrame.setLocation(450, 200);

        JPanel pane = makeConfirmPane();

        confirmFrame.add(pane);
        confirmFrame.pack();
        confirmFrame.setVisible(true);

    }

    public static JPanel makeConfirmPane() {
        JPanel p = new JPanel();
        p.setBorder(BorderFactory.createTitledBorder("Confirmation"));
        BoxLayout layout = new BoxLayout(p, BoxLayout.X_AXIS);
        p.setLayout(layout);
        p.add(makeTextPane("Confirmation Page"));

        return p;
    }


    public static JPanel makeTextPane(String name) {
        // display difficulty selected

        // display skill selections

        // display starting credits
        JPanel textP = new JPanel();
        addText(name, textP);
        addText("Character Name: " + charName, textP);

        addText("Difficulty: " + level, textP);
        addText("Skills: ", textP);
        addText("     Fighter: " + fighterSkill, textP);
        addText("     Merchant: " + merchantSkill, textP);
        addText("     Engineering: " + engineerSkill, textP);
        addText("     Pilot: " + pilotSkill, textP);
        addText("Starting credits: " + credits, textP);
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
