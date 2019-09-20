<<<<<<< HEAD
import com.sun.xml.internal.messaging.saaj.soap.JpegDataContentHandler;

=======
>>>>>>> 800db1997c79181fa1eb925ceb31ed0737f7462c
import javax.swing.*;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;
import java.awt.*;
import java.awt.event.*;
import java.util.Dictionary;

public class ConfigurationScreen extends JFrame implements ActionListener, WindowListener, ChangeListener {
    /*
<<<<<<< HEAD
    * OKKKK so this is the configurationScreen
=======
    * configurationScreen
>>>>>>> 800db1997c79181fa1eb925ceb31ed0737f7462c
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
<<<<<<< HEAD
=======
    private static JRadioButton easyButton;
    private static JRadioButton medButton;
    private static JRadioButton hardButton;
    private static JLabel skillLabel;
>>>>>>> 800db1997c79181fa1eb925ceb31ed0737f7462c
    private static ButtonGroup group;
    private static JPanel configPanel = new JPanel();
    private static int credits;
    private static int skillPoints = 0;
    private static int fighterSkill = 0;
    private static int merchantSkill = 0;
    private static int engineerSkill = 0;
    private static int pilotSkill = 0;
    private static JSlider pilot;
    private static JSlider merchant;
    private static JSlider engineer;
    private static JSlider fighter;
<<<<<<< HEAD
=======
    private static String difficulty;
>>>>>>> 800db1997c79181fa1eb925ceb31ed0737f7462c


    public ConfigurationScreen(String title) {
        configFrame = new JFrame(title);
        configFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        createGUI();
    }

    public static void createGUI() {
//        configFrame = new JFrame("Set-Up");
//        configFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        Dimension size = new Dimension(500, 400);
        configFrame.setPreferredSize(size);
        configFrame.setLocation(450, 200);

        confirmButton = new JButton("Confirm");
<<<<<<< HEAD
=======
        easyButton = new JRadioButton("Easy");
        easyButton.setActionCommand("8");
        medButton = new JRadioButton("Medium");
        medButton.setActionCommand("12");
        hardButton = new JRadioButton("Hard");
        hardButton.setActionCommand("16");

        class ActionListen implements ActionListener {
            public void actionPerformed(ActionEvent event) {
                String updated = group.getSelection().getActionCommand();
                update(updated);
            }
        }

        easyButton.addActionListener(new ActionListen());
        medButton.addActionListener(new ActionListen());
        hardButton.addActionListener(new ActionListen());
>>>>>>> 800db1997c79181fa1eb925ceb31ed0737f7462c

        JPanel pane = makeWelcomePane();
        configFrame.add(pane);
        configFrame.add(makeTextPane("Configure Your Character"));
        configPanel.setLayout(new GridLayout(15, 15, 5, 0));
        configFrame.add(addLabel("Enter your name below:"));
        configFrame.add(makeTextField());
        configFrame.add(addLabel("Choose your difficulty:"));
        configFrame.add(addRadioButton());
<<<<<<< HEAD
        configFrame.add(addLabel("Allocate your skill points: " + skillPoints + " points total"));
=======
        skillLabel = new JLabel("Allocate your skill points: " + getSkillPoints() + " points total");
        configPanel.add(skillLabel);
        configFrame.add(configPanel);
//        configFrame.add(addLabel("Allocate your skill points: " + getSkillPoints() + " points total"));
>>>>>>> 800db1997c79181fa1eb925ceb31ed0737f7462c
        configFrame.add(addSliders());
        configFrame.add(addGoodButton("Confirm"));
        configFrame.pack();
        configFrame.setVisible(true);

        confirmButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
<<<<<<< HEAD
                JFrame config = new ConfirmationScreen();
                config.setVisible(true);
                configFrame.dispose();
            }
        });
=======
                configFrame.dispose();
                JFrame config = new ConfirmationScreen("Confirmation Screen", charName, difficulty, skillPoints, credits);
            }
        });
//        easyButton.addActionListener(new ActionListener() {
//            @Override
//            public void actionPerformed(ActionEvent e) {
//                setSkillPoints(8);
//                update();
//            }
//        });

    }
    private static void update(String newText) {
        skillLabel.setText("Allocate your skill points: " + newText + " points total");
>>>>>>> 800db1997c79181fa1eb925ceb31ed0737f7462c
    }

    public static JPanel addLabel(String label) {
        JLabel words = new JLabel(label);
        configPanel.add(words);
        return configPanel;
    }

    public static JPanel addSliders() {

        JLabel lPilot = new JLabel("Pilot:");
        pilot = new JSlider(0, 15 - fighterSkill - merchantSkill - engineerSkill);
        pilot.setValue(0);
        pilotSkill = pilot.getValue();
        JLabel lFighter = new JLabel("Fighter:");
        fighter = new JSlider(0, 15 - pilotSkill - merchantSkill - engineerSkill);
        fighter.setValue(0);
        fighterSkill = fighter.getValue();
        JLabel lMerchant = new JLabel("Merchant:");
        merchant = new JSlider(0, 15 - pilotSkill - fighterSkill - engineerSkill);
        merchant.setValue(0);
        merchantSkill = merchant.getValue();
        JLabel lEngineer = new JLabel("Engineer:");
        engineer = new JSlider(0, 15 - pilotSkill - fighterSkill - merchantSkill);
        engineer.setValue(0);
        engineerSkill = engineer.getValue();

        pilot.setMajorTickSpacing(1);
        pilot.setPaintTicks(true);
        fighter.setMajorTickSpacing(1);
        fighter.setPaintTicks(true);
        merchant.setMajorTickSpacing(1);
        merchant.setPaintTicks(true);
        engineer.setMajorTickSpacing(1);
        engineer.setPaintTicks(true);
        configPanel.add(lPilot);
        configPanel.add(pilot);
        configPanel.add(lFighter);
        configPanel.add(fighter);
        configPanel.add(lMerchant);
        configPanel.add(merchant);
        configPanel.add(lEngineer);
        configPanel.add(engineer);

        return configPanel;
    }

    public void stateChanged(ChangeEvent e) {
        JSlider source = (JSlider)e.getSource();
        if (!source.getValueIsAdjusting()) {
            System.out.println("Hi");
            if ((JSlider) source == pilot) {
                pilotSkill = source.getValue();
                pilot.setMaximum(15 - fighterSkill - merchantSkill - engineerSkill);
            } else if ((JSlider) source == fighter) {
                fighterSkill = source.getValue();
                fighter.setMaximum(15 - pilotSkill - merchantSkill - engineerSkill);
            } else if ((JSlider) source == merchant) {
                merchantSkill = source.getValue();
                merchant.setMaximum(15 - fighterSkill - pilotSkill - engineerSkill);
            } else if ((JSlider) source == engineer) {
                engineerSkill = source.getValue();
                engineer.setMaximum(15 - fighterSkill - merchantSkill - pilotSkill);
            }
        }
    }

    public static JPanel addRadioButton() {
<<<<<<< HEAD
        JRadioButton easyButton = new JRadioButton("Easy");
        JRadioButton medButton = new JRadioButton("Medium");
        JRadioButton hardButton = new JRadioButton("Hard");

=======
>>>>>>> 800db1997c79181fa1eb925ceb31ed0737f7462c
        group = new ButtonGroup();
        group.add(easyButton);
        group.add(medButton);
        group.add(hardButton);

        JPanel radioPanel = new JPanel(new GridLayout(1, 0));
        radioPanel.add(easyButton);
        radioPanel.add(medButton);
        radioPanel.add(hardButton);

        configPanel.add(radioPanel);
        return configPanel;
    }

    public static JPanel makeTextField() {
        userEntry = new JTextField(15);
        TextFieldListener tfListen = new TextFieldListener();
        userEntry.addActionListener(tfListen);
        configPanel.add(userEntry);
        return configPanel;
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
<<<<<<< HEAD

=======
>>>>>>> 800db1997c79181fa1eb925ceb31ed0737f7462c
        return p;
    }

    public static JPanel addGoodButton(String label) {
        JButton button = new JButton(label);
<<<<<<< HEAD
        configPanel.add(button);
=======
        configPanel.add(confirmButton);
>>>>>>> 800db1997c79181fa1eb925ceb31ed0737f7462c
        return configPanel;
    }

    public static JPanel makeTextPane(String name) {
        JPanel textP = new JPanel();
        addText(name, textP);
        return textP;
    }

    public static JPanel makeButtonPane() {
        JPanel p = new JPanel();
<<<<<<< HEAD
//        p.setBorder(BorderFactory.createTitledBorder("Welcome"));
        BoxLayout layout = new BoxLayout(p, BoxLayout.X_AXIS);
        p.setLayout(layout);



=======
        BoxLayout layout = new BoxLayout(p, BoxLayout.X_AXIS);
        p.setLayout(layout);
>>>>>>> 800db1997c79181fa1eb925ceb31ed0737f7462c
        addButton(confirmButton, p);
        return p;
    }

    private static void addText(String text, Container container) {
<<<<<<< HEAD
//        JTextField textBox = new JTextField(text, 20);
//        textBox.setAlignmentX(CENTER_ALIGNMENT);
//        textBox.setAlignmentY(TOP_ALIGNMENT);

=======
>>>>>>> 800db1997c79181fa1eb925ceb31ed0737f7462c
        JLabel newText = new JLabel(text);
        container.add(newText);
    }

    private static void addButton(JButton myButton, Container container) {
        JButton button = myButton;
        button.setAlignmentX(CENTER_ALIGNMENT);
        button.setAlignmentY(BOTTOM_ALIGNMENT);
        container.add(button);
<<<<<<< HEAD

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

//    public static void main(String[] args) {
//        javax.swing.SwingUtilities.invokeLater(new Runnable() {
//            public void run() {
//                createGUI();
//            }
//        });
//    }
=======
    }
    public static void setSkillPoints(int points) {
        skillPoints = points;
    }
    public static int getSkillPoints() {
        return skillPoints;
    }
>>>>>>> 800db1997c79181fa1eb925ceb31ed0737f7462c

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






