package TicTacToeGame;

import javax.swing.*;
import javax.swing.border.LineBorder;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class GraphicsGame extends JFrame implements ActionListener {
    private JButton[][] jButton;
    private String[][] saveMoves;

    private JButton restart;
    private JButton newGame;
    private JLabel textLabel1 = new JLabel();
    private JLabel textLabel2 = new JLabel();
    private JLabel textLabel3 = new JLabel();
    private JLabel playerText1 = new JLabel();
    private JLabel playerText2 = new JLabel();
    private boolean player = true;
    private int count = 0;
    private int playerCount1 = 0;
    private int playerCount2 = 0;


    public GraphicsGame() {
        super("Tic-Tac-Tie  |  Крестики-нолики");
        this.setSize(580, 460);
        this.setLocationRelativeTo(null);
        this.setResizable(false);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setVisible(true);
        setLayout(null);

        restart = new JButton("Перезапустить");
        newGame = new JButton("Новая игра");

        restart.setBounds(380, 50, 150, 30);
        restart.setFont(new Font("TORCH", Font.BOLD, 15));
        newGame.setBounds(380, 110, 150, 30);
        newGame.setFont(new Font("TORCH", Font.BOLD, 15));
        restart.setFocusPainted(false);
        newGame.setFocusPainted(false);
        add(restart);
        add(newGame);

        playerText1.setBounds(380, 170, 120, 30);
        playerText1.setText("Игрок №1");
        playerText1.setFont(new Font("TORCH", Font.BOLD, 20));
        add(playerText1);

        textLabel1.setBounds(490, 170, 40, 23);
        textLabel1.setBorder(new LineBorder(Color.black));
        textLabel1.setText("0");
        add(textLabel1);

        playerText2.setBounds(380, 230, 120, 30);
        playerText2.setText("Игрок №2");
        playerText2.setFont(new Font("TORCH", Font.BOLD, 20));
        add(playerText2);

        textLabel2.setBounds(490, 230, 40, 23);
        textLabel2.setBorder(new LineBorder(Color.black));
        textLabel2.setText("0");
        add(textLabel2);

        textLabel3.setBounds(380, 300, 160, 23);
        textLabel3.setFont(new Font("TORCH", Font.BOLD, 10));
        // textLabel3.setBorder(new LineBorder(Color.black));
        textLabel3.setText("ДЕЛАЙ ХОД-ИГРОК №1");
        add(textLabel3);


        jButton = new JButton[3][3];
        saveMoves = new String[3][3];

        for (int i = 0; i < 3; i++)
            for (int j = 0; j < 3; j++) {
                jButton[i][j] = new JButton();
                jButton[i][j].setBounds(35 + (i * 100), 50 + (j * 100), 100, 100);
                jButton[i][j].setFont(new Font("TORCH", Font.BOLD, 75));
                jButton[i][j].setContentAreaFilled(false);
                jButton[i][j].setFocusPainted(false);
                jButton[i][j].setBorder(new LineBorder(Color.black));
                add(jButton[i][j]);
                saveMoves[i][j] = "";

            }

        for (int i = 0; i < 3; i++)
            for (int j = 0; j < 3; j++)
                jButton[i][j].addActionListener(this);

        restart.addActionListener(this);

        newGame.addActionListener(this);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == restart) {
            restart();
        } else if (e.getSource() == newGame) {
            newGame();
        } else {
            count++;
            for (int i = 0; i < 3; i++)
                for (int j = 0; j < 3; j++) {
                    if (e.getSource() == jButton[i][j]) {
                        if (saveMoves[i][j].equals("")) {
                            if (player) {
                                saveMoves[i][j] = "X";
                                jButton[i][j].setText("X");
                                player = false;
                            } else {
                                jButton[i][j].setText("O");
                                saveMoves[i][j] = "O";
                                player = true;
                            }

                        }
                    }
                    if (!jButton[i][j].getText().isEmpty()) {
                        if (logicGame(jButton[i][j].getText()) == 1) {
                            textLabel1.setText(Integer.toString(++playerCount1));
                            textLabel3.setText("ВЫИГРАЛ ИГРОК №1");
                        }
                        if (logicGame(jButton[i][j].getText()) == 2) {
                            textLabel2.setText(Integer.toString(++playerCount2));
                            textLabel3.setText("ВЫИГРАЛ ИГРОК №2");
                        }
                        if (logicGame(jButton[i][j].getText()) == 3) {
                            textLabel3.setText("НИЧЬЯ!");
                        }
                    }
                }
        }
    }

    public int stopGame(String player) {
        for (int i = 0; i < 3; i++)
            for (int j = 0; j < 3; j++) {
                jButton[i][j].setEnabled(false);
            }
        if (player.equals("X")) return 1;
        else if (player.equals("O")) return 2;
        return 0;
    }

    public int logicGame(String player) {
        for (int i = 0; i < 3; i++)
            if (jButton[0][i].getText().equals(player) && jButton[1][i].getText().equals(player) && jButton[2][i].getText().equals(player)) {
                return stopGame(player);
            }
        for (int i = 0; i < 3; i++)
            if (jButton[i][0].getText().equals(player) && jButton[i][1].getText().equals(player) && jButton[i][2].getText().equals(player)) {
                return stopGame(player);
            }
        if (jButton[0][0].getText().equals(player) && jButton[1][1].getText().equals(player) && jButton[2][2].getText().equals(player))
            return stopGame(player);

        else if (jButton[0][2].getText().equals(player) && jButton[1][1].getText().equals(player) && jButton[2][0].getText().equals(player))
            return stopGame(player);

        else if (count == 9) return 3;

        return 0;
    }

    public void restart() {
        count = 0;
        if(player) textLabel3.setText("ДЕЛАЙ ХОД-ИГРОК №1");
        else textLabel3.setText("ДЕЛАЙ ХОД-ИГРОК №2");
        for (int i = 0; i < 3; i++)
            for (int j = 0; j < 3; j++) {
                saveMoves[i][j] = "";
                jButton[i][j].setText("");
                jButton[i][j].setEnabled(true);
            }
    }

    public void newGame() {
        textLabel1.setText("0");
        textLabel2.setText("0");
        textLabel3.setText("ДЕЛАЙ ХОД-ИГРОК №1");
        playerCount1 = 0;
        playerCount2 = 0;
        count = 0;
        for (int i = 0; i < 3; i++)
            for (int j = 0; j < 3; j++) {
                saveMoves[i][j] = "";
                jButton[i][j].setText("");
                jButton[i][j].setEnabled(true);
            }
    }

}
