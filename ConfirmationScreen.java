import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class ConfirmationScreen extends JFrame implements ActionListener, WindowListener {
    private JFrame confirmFrame;
    private JPanel confirmPanel;
    private String characterName;
    private String level;
    private int credits;
    private int totalPoints;
    private int fighterSkill;
    private int merchantSkill ;
    private int engineerSkill;
    private int pilotSkill;
    private JPanel textP;


    public ConfirmationScreen(String title, String character, int skillPoints, int fSkill,
                              int mSkill, int eSkill, int pSkill) {
        confirmFrame = new JFrame(title);
        confirmFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        characterName = character;
        this.totalPoints = skillPoints;
        fighterSkill = fSkill;
        merchantSkill = mSkill;
        engineerSkill = eSkill;
        pilotSkill = pSkill;

        if (skillPoints == 16) {
            credits = 1000;
            level = "Easy";
        } else if (skillPoints == 12) {
            credits = 500;
            level = "Medium";
        } else if (skillPoints == 8){
            credits = 100;
            level = "Hard";
        }
        createGUI();
    }

    public void createGUI() {
        Dimension size = new Dimension(500, 400);
        confirmFrame.setPreferredSize(size);
        confirmFrame.setLocation(450, 200);
        JPanel pane = makeConfirmPane();
        confirmFrame.add(pane);
        confirmPanel = new JPanel();
        confirmPanel.setLayout(new GridLayout(15, 15, 5, 0));

        confirmFrame.add(makeTextPane("Confirmation Page"));
        confirmFrame.add(addLabel("Character Name: " + characterName));

        confirmFrame.add(addLabel("Difficulty: " + level));
        confirmFrame.add(addLabel("Skills: "));
        confirmFrame.add(addLabel("     Fighter: " + fighterSkill));
        confirmFrame.add(addLabel("     Merchant: " + merchantSkill));
        confirmFrame.add(addLabel("     Engineering: " + engineerSkill));
        confirmFrame.add(addLabel("     Pilot: " + pilotSkill));
        confirmFrame.add(addLabel("Starting credits: " + credits));
        confirmFrame.pack();
        confirmFrame.setVisible(true);

    }
    public JPanel addLabel(String label) {
        JLabel words = new JLabel(label);
        confirmPanel.add(words);
        return confirmPanel;
    }

    public JPanel makeConfirmPane() {
        JPanel p = new JPanel();
        p.setBorder(BorderFactory.createTitledBorder("Confirmation"));
        BoxLayout layout = new BoxLayout(p, BoxLayout.X_AXIS);
        p.setLayout(layout);

        return p;
    }

    public JPanel makeTextPane(String name) {
        textP = new JPanel();
        addText(name, textP);

        return textP;
    }

    private void addText(String text, Container container) {
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