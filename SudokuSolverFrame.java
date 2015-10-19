
import java.awt.Color;
import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author Spencer Cousino
 */
public class SudokuSolverFrame extends javax.swing.JFrame {

    /**
     * Creates new form SudokuSolverFrame
     */
    List<JTextField> tfList = new ArrayList<JTextField>();
    private final int PUZZLE_SIZE = 9;
    SudokuBoard board = new SudokuBoard();
    ArrayList<JTextField> givenFields = new ArrayList<JTextField>();
    final int INVALID_PLACEMENT = 1;
    final int INVALID_INPUT_TYPE = 2;
    final int INVALID_GIVEN_NUM = 3;

    public SudokuSolverFrame() {
        initComponents();
        solveButton.setEnabled(false);
        addTextFieldsToList();
        setTextFieldDocuments();
    }
    
    private void addTextFieldsToList() {
        tfList.add(squareField1);
        tfList.add(squareField2);
        tfList.add(squareField3);
        tfList.add(squareField4);
        tfList.add(squareField5);
        tfList.add(squareField6);
        tfList.add(squareField7);
        tfList.add(squareField8);
        tfList.add(squareField9);
        tfList.add(squareField10);
        tfList.add(squareField11);
        tfList.add(squareField12);
        tfList.add(squareField13);
        tfList.add(squareField14);
        tfList.add(squareField15);
        tfList.add(squareField16);
        tfList.add(squareField17);
        tfList.add(squareField18);
        tfList.add(squareField19);
        tfList.add(squareField20);
        tfList.add(squareField21);
        tfList.add(squareField22);
        tfList.add(squareField23);
        tfList.add(squareField24);
        tfList.add(squareField25);
        tfList.add(squareField26);
        tfList.add(squareField27);
        tfList.add(squareField28);
        tfList.add(squareField29);
        tfList.add(squareField30);
        tfList.add(squareField31);
        tfList.add(squareField32);
        tfList.add(squareField33);
        tfList.add(squareField34);
        tfList.add(squareField35);
        tfList.add(squareField36);
        tfList.add(squareField37);
        tfList.add(squareField38);
        tfList.add(squareField39);
        tfList.add(squareField40);
        tfList.add(squareField41);
        tfList.add(squareField42);
        tfList.add(squareField43);
        tfList.add(squareField44);
        tfList.add(squareField45);
        tfList.add(squareField46);
        tfList.add(squareField47);
        tfList.add(squareField48);
        tfList.add(squareField49);
        tfList.add(squareField50);
        tfList.add(squareField51);
        tfList.add(squareField52);
        tfList.add(squareField53);
        tfList.add(squareField54);
        tfList.add(squareField55);
        tfList.add(squareField56);
        tfList.add(squareField57);
        tfList.add(squareField58);
        tfList.add(squareField59);
        tfList.add(squareField60);
        tfList.add(squareField61);
        tfList.add(squareField62);
        tfList.add(squareField63);
        tfList.add(squareField64);
        tfList.add(squareField65);
        tfList.add(squareField66);
        tfList.add(squareField67);
        tfList.add(squareField68);
        tfList.add(squareField69);
        tfList.add(squareField70);
        tfList.add(squareField71);
        tfList.add(squareField72);
        tfList.add(squareField73);
        tfList.add(squareField74);
        tfList.add(squareField75);
        tfList.add(squareField76);
        tfList.add(squareField77);
        tfList.add(squareField78);
        tfList.add(squareField79);
        tfList.add(squareField80);
        tfList.add(squareField81);
    }

    private void setTextFieldDocuments() {
        squareField1.setDocument(new JTextFieldLimit(1));
        squareField2.setDocument(new JTextFieldLimit(1));
        squareField3.setDocument(new JTextFieldLimit(1));
        squareField4.setDocument(new JTextFieldLimit(1));
        squareField5.setDocument(new JTextFieldLimit(1));
        squareField6.setDocument(new JTextFieldLimit(1));
        squareField7.setDocument(new JTextFieldLimit(1));
        squareField8.setDocument(new JTextFieldLimit(1));
        squareField9.setDocument(new JTextFieldLimit(1));
        squareField10.setDocument(new JTextFieldLimit(1));
        squareField11.setDocument(new JTextFieldLimit(1));
        squareField12.setDocument(new JTextFieldLimit(1));
        squareField13.setDocument(new JTextFieldLimit(1));
        squareField14.setDocument(new JTextFieldLimit(1));
        squareField15.setDocument(new JTextFieldLimit(1));
        squareField16.setDocument(new JTextFieldLimit(1));
        squareField17.setDocument(new JTextFieldLimit(1));
        squareField18.setDocument(new JTextFieldLimit(1));
        squareField19.setDocument(new JTextFieldLimit(1));
        squareField20.setDocument(new JTextFieldLimit(1));
        squareField21.setDocument(new JTextFieldLimit(1));
        squareField22.setDocument(new JTextFieldLimit(1));
        squareField23.setDocument(new JTextFieldLimit(1));
        squareField24.setDocument(new JTextFieldLimit(1));
        squareField25.setDocument(new JTextFieldLimit(1));
        squareField26.setDocument(new JTextFieldLimit(1));
        squareField27.setDocument(new JTextFieldLimit(1));
        squareField28.setDocument(new JTextFieldLimit(1));
        squareField29.setDocument(new JTextFieldLimit(1));
        squareField30.setDocument(new JTextFieldLimit(1));
        squareField31.setDocument(new JTextFieldLimit(1));
        squareField32.setDocument(new JTextFieldLimit(1));
        squareField33.setDocument(new JTextFieldLimit(1));
        squareField34.setDocument(new JTextFieldLimit(1));
        squareField35.setDocument(new JTextFieldLimit(1));
        squareField36.setDocument(new JTextFieldLimit(1));
        squareField37.setDocument(new JTextFieldLimit(1));
        squareField38.setDocument(new JTextFieldLimit(1));
        squareField39.setDocument(new JTextFieldLimit(1));
        squareField40.setDocument(new JTextFieldLimit(1));
        squareField41.setDocument(new JTextFieldLimit(1));
        squareField42.setDocument(new JTextFieldLimit(1));
        squareField43.setDocument(new JTextFieldLimit(1));
        squareField44.setDocument(new JTextFieldLimit(1));
        squareField45.setDocument(new JTextFieldLimit(1));
        squareField46.setDocument(new JTextFieldLimit(1));
        squareField47.setDocument(new JTextFieldLimit(1));
        squareField48.setDocument(new JTextFieldLimit(1));
        squareField49.setDocument(new JTextFieldLimit(1));
        squareField50.setDocument(new JTextFieldLimit(1));
        squareField51.setDocument(new JTextFieldLimit(1));
        squareField52.setDocument(new JTextFieldLimit(1));
        squareField53.setDocument(new JTextFieldLimit(1));
        squareField54.setDocument(new JTextFieldLimit(1));
        squareField55.setDocument(new JTextFieldLimit(1));
        squareField56.setDocument(new JTextFieldLimit(1));
        squareField57.setDocument(new JTextFieldLimit(1));
        squareField58.setDocument(new JTextFieldLimit(1));
        squareField59.setDocument(new JTextFieldLimit(1));
        squareField60.setDocument(new JTextFieldLimit(1));
        squareField61.setDocument(new JTextFieldLimit(1));
        squareField62.setDocument(new JTextFieldLimit(1));
        squareField63.setDocument(new JTextFieldLimit(1));
        squareField64.setDocument(new JTextFieldLimit(1));
        squareField65.setDocument(new JTextFieldLimit(1));
        squareField66.setDocument(new JTextFieldLimit(1));
        squareField67.setDocument(new JTextFieldLimit(1));
        squareField68.setDocument(new JTextFieldLimit(1));
        squareField69.setDocument(new JTextFieldLimit(1));
        squareField70.setDocument(new JTextFieldLimit(1));
        squareField71.setDocument(new JTextFieldLimit(1));
        squareField72.setDocument(new JTextFieldLimit(1));
        squareField73.setDocument(new JTextFieldLimit(1));
        squareField74.setDocument(new JTextFieldLimit(1));
        squareField75.setDocument(new JTextFieldLimit(1));
        squareField76.setDocument(new JTextFieldLimit(1));
        squareField77.setDocument(new JTextFieldLimit(1));
        squareField78.setDocument(new JTextFieldLimit(1));
        squareField79.setDocument(new JTextFieldLimit(1));
        squareField80.setDocument(new JTextFieldLimit(1));
        squareField81.setDocument(new JTextFieldLimit(1));
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        boardPanel = new javax.swing.JPanel();
        squareField1 = new javax.swing.JTextField();
        squareField2 = new javax.swing.JTextField();
        squareField3 = new javax.swing.JTextField();
        squareField4 = new javax.swing.JTextField();
        squareField5 = new javax.swing.JTextField();
        squareField6 = new javax.swing.JTextField();
        squareField7 = new javax.swing.JTextField();
        squareField8 = new javax.swing.JTextField();
        squareField9 = new javax.swing.JTextField();
        squareField10 = new javax.swing.JTextField();
        squareField11 = new javax.swing.JTextField();
        squareField12 = new javax.swing.JTextField();
        squareField13 = new javax.swing.JTextField();
        squareField14 = new javax.swing.JTextField();
        squareField15 = new javax.swing.JTextField();
        squareField16 = new javax.swing.JTextField();
        squareField17 = new javax.swing.JTextField();
        squareField18 = new javax.swing.JTextField();
        squareField19 = new javax.swing.JTextField();
        squareField20 = new javax.swing.JTextField();
        squareField21 = new javax.swing.JTextField();
        squareField22 = new javax.swing.JTextField();
        squareField23 = new javax.swing.JTextField();
        squareField24 = new javax.swing.JTextField();
        squareField25 = new javax.swing.JTextField();
        squareField26 = new javax.swing.JTextField();
        squareField27 = new javax.swing.JTextField();
        squareField28 = new javax.swing.JTextField();
        squareField29 = new javax.swing.JTextField();
        squareField30 = new javax.swing.JTextField();
        squareField31 = new javax.swing.JTextField();
        squareField32 = new javax.swing.JTextField();
        squareField33 = new javax.swing.JTextField();
        squareField34 = new javax.swing.JTextField();
        squareField35 = new javax.swing.JTextField();
        squareField36 = new javax.swing.JTextField();
        squareField37 = new javax.swing.JTextField();
        squareField38 = new javax.swing.JTextField();
        squareField39 = new javax.swing.JTextField();
        squareField40 = new javax.swing.JTextField();
        squareField41 = new javax.swing.JTextField();
        squareField42 = new javax.swing.JTextField();
        squareField43 = new javax.swing.JTextField();
        squareField44 = new javax.swing.JTextField();
        squareField45 = new javax.swing.JTextField();
        squareField46 = new javax.swing.JTextField();
        squareField47 = new javax.swing.JTextField();
        squareField48 = new javax.swing.JTextField();
        squareField49 = new javax.swing.JTextField();
        squareField50 = new javax.swing.JTextField();
        squareField51 = new javax.swing.JTextField();
        squareField52 = new javax.swing.JTextField();
        squareField53 = new javax.swing.JTextField();
        squareField54 = new javax.swing.JTextField();
        squareField55 = new javax.swing.JTextField();
        squareField56 = new javax.swing.JTextField();
        squareField57 = new javax.swing.JTextField();
        squareField58 = new javax.swing.JTextField();
        squareField59 = new javax.swing.JTextField();
        squareField60 = new javax.swing.JTextField();
        squareField61 = new javax.swing.JTextField();
        squareField62 = new javax.swing.JTextField();
        squareField63 = new javax.swing.JTextField();
        squareField64 = new javax.swing.JTextField();
        squareField65 = new javax.swing.JTextField();
        squareField66 = new javax.swing.JTextField();
        squareField67 = new javax.swing.JTextField();
        squareField68 = new javax.swing.JTextField();
        squareField69 = new javax.swing.JTextField();
        squareField70 = new javax.swing.JTextField();
        squareField71 = new javax.swing.JTextField();
        squareField72 = new javax.swing.JTextField();
        squareField73 = new javax.swing.JTextField();
        squareField74 = new javax.swing.JTextField();
        squareField75 = new javax.swing.JTextField();
        squareField76 = new javax.swing.JTextField();
        squareField77 = new javax.swing.JTextField();
        squareField78 = new javax.swing.JTextField();
        squareField79 = new javax.swing.JTextField();
        squareField80 = new javax.swing.JTextField();
        squareField81 = new javax.swing.JTextField();
        checkButton = new javax.swing.JButton();
        solveButton = new javax.swing.JButton();
        resetButton = new javax.swing.JButton();
        currentGivensLabel = new javax.swing.JLabel();
        currentGivensDisplayLabel = new javax.swing.JLabel();
        minGivensLabel = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Sudoku Solver v1.2");
        setResizable(false);

        boardPanel.setBackground(new java.awt.Color(0, 153, 51));

        squareField1.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        squareField1.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        squareField1.setBorder(null);
        squareField1.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        squareField1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                squareField1KeyReleased(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                squareField1KeyTyped(evt);
            }
        });

        squareField2.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        squareField2.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        squareField2.setBorder(null);
        squareField2.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        squareField2.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                squareField2KeyTyped(evt);
            }
        });

        squareField3.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        squareField3.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        squareField3.setBorder(null);
        squareField3.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        squareField3.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                squareField3KeyTyped(evt);
            }
        });

        squareField4.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        squareField4.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        squareField4.setBorder(null);
        squareField4.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        squareField4.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                squareField4KeyTyped(evt);
            }
        });

        squareField5.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        squareField5.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        squareField5.setBorder(null);
        squareField5.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        squareField5.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                squareField5KeyTyped(evt);
            }
        });

        squareField6.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        squareField6.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        squareField6.setBorder(null);
        squareField6.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        squareField6.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                squareField6KeyTyped(evt);
            }
        });

        squareField7.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        squareField7.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        squareField7.setBorder(null);
        squareField7.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        squareField7.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                squareField7KeyTyped(evt);
            }
        });

        squareField8.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        squareField8.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        squareField8.setBorder(null);
        squareField8.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        squareField8.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                squareField8KeyTyped(evt);
            }
        });

        squareField9.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        squareField9.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        squareField9.setBorder(null);
        squareField9.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        squareField9.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                squareField9KeyTyped(evt);
            }
        });

        squareField10.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        squareField10.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        squareField10.setBorder(null);
        squareField10.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        squareField10.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                squareField10KeyTyped(evt);
            }
        });

        squareField11.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        squareField11.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        squareField11.setBorder(null);
        squareField11.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        squareField11.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                squareField11KeyTyped(evt);
            }
        });

        squareField12.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        squareField12.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        squareField12.setBorder(null);
        squareField12.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        squareField12.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                squareField12KeyTyped(evt);
            }
        });

        squareField13.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        squareField13.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        squareField13.setBorder(null);
        squareField13.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        squareField13.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                squareField13KeyTyped(evt);
            }
        });

        squareField14.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        squareField14.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        squareField14.setBorder(null);
        squareField14.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        squareField14.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                squareField14KeyTyped(evt);
            }
        });

        squareField15.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        squareField15.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        squareField15.setBorder(null);
        squareField15.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        squareField15.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                squareField15KeyTyped(evt);
            }
        });

        squareField16.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        squareField16.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        squareField16.setBorder(null);
        squareField16.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        squareField16.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                squareField16KeyTyped(evt);
            }
        });

        squareField17.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        squareField17.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        squareField17.setBorder(null);
        squareField17.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        squareField17.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                squareField17KeyTyped(evt);
            }
        });

        squareField18.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        squareField18.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        squareField18.setBorder(null);
        squareField18.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        squareField18.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                squareField18KeyTyped(evt);
            }
        });

        squareField19.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        squareField19.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        squareField19.setBorder(null);
        squareField19.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        squareField19.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                squareField19KeyTyped(evt);
            }
        });

        squareField20.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        squareField20.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        squareField20.setBorder(null);
        squareField20.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        squareField20.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                squareField20KeyTyped(evt);
            }
        });

        squareField21.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        squareField21.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        squareField21.setBorder(null);
        squareField21.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        squareField21.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                squareField21KeyTyped(evt);
            }
        });

        squareField22.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        squareField22.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        squareField22.setBorder(null);
        squareField22.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        squareField22.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                squareField22KeyTyped(evt);
            }
        });

        squareField23.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        squareField23.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        squareField23.setBorder(null);
        squareField23.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        squareField23.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                squareField23KeyTyped(evt);
            }
        });

        squareField24.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        squareField24.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        squareField24.setBorder(null);
        squareField24.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        squareField24.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                squareField24KeyTyped(evt);
            }
        });

        squareField25.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        squareField25.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        squareField25.setBorder(null);
        squareField25.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        squareField25.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                squareField25KeyTyped(evt);
            }
        });

        squareField26.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        squareField26.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        squareField26.setBorder(null);
        squareField26.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        squareField26.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                squareField26KeyTyped(evt);
            }
        });

        squareField27.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        squareField27.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        squareField27.setBorder(null);
        squareField27.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        squareField27.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                squareField27KeyTyped(evt);
            }
        });

        squareField28.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        squareField28.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        squareField28.setBorder(null);
        squareField28.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        squareField28.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                squareField28KeyTyped(evt);
            }
        });

        squareField29.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        squareField29.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        squareField29.setBorder(null);
        squareField29.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        squareField29.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                squareField29KeyTyped(evt);
            }
        });

        squareField30.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        squareField30.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        squareField30.setBorder(null);
        squareField30.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        squareField30.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                squareField30KeyTyped(evt);
            }
        });

        squareField31.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        squareField31.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        squareField31.setBorder(null);
        squareField31.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        squareField31.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                squareField31KeyTyped(evt);
            }
        });

        squareField32.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        squareField32.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        squareField32.setBorder(null);
        squareField32.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        squareField32.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                squareField32KeyTyped(evt);
            }
        });

        squareField33.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        squareField33.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        squareField33.setBorder(null);
        squareField33.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        squareField33.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                squareField33KeyTyped(evt);
            }
        });

        squareField34.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        squareField34.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        squareField34.setBorder(null);
        squareField34.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        squareField34.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                squareField34KeyTyped(evt);
            }
        });

        squareField35.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        squareField35.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        squareField35.setBorder(null);
        squareField35.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        squareField35.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                squareField35KeyTyped(evt);
            }
        });

        squareField36.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        squareField36.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        squareField36.setBorder(null);
        squareField36.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        squareField36.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                squareField36KeyTyped(evt);
            }
        });

        squareField37.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        squareField37.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        squareField37.setBorder(null);
        squareField37.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        squareField37.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                squareField37KeyTyped(evt);
            }
        });

        squareField38.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        squareField38.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        squareField38.setBorder(null);
        squareField38.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        squareField38.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                squareField38KeyTyped(evt);
            }
        });

        squareField39.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        squareField39.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        squareField39.setBorder(null);
        squareField39.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        squareField39.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                squareField39KeyTyped(evt);
            }
        });

        squareField40.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        squareField40.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        squareField40.setBorder(null);
        squareField40.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        squareField40.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                squareField40KeyTyped(evt);
            }
        });

        squareField41.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        squareField41.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        squareField41.setBorder(null);
        squareField41.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        squareField41.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                squareField41KeyTyped(evt);
            }
        });

        squareField42.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        squareField42.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        squareField42.setBorder(null);
        squareField42.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        squareField42.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                squareField42KeyTyped(evt);
            }
        });

        squareField43.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        squareField43.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        squareField43.setBorder(null);
        squareField43.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        squareField43.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                squareField43KeyTyped(evt);
            }
        });

        squareField44.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        squareField44.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        squareField44.setBorder(null);
        squareField44.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        squareField44.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                squareField44KeyTyped(evt);
            }
        });

        squareField45.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        squareField45.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        squareField45.setBorder(null);
        squareField45.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        squareField45.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                squareField45KeyTyped(evt);
            }
        });

        squareField46.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        squareField46.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        squareField46.setBorder(null);
        squareField46.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        squareField46.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                squareField46KeyTyped(evt);
            }
        });

        squareField47.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        squareField47.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        squareField47.setBorder(null);
        squareField47.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        squareField47.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                squareField47KeyTyped(evt);
            }
        });

        squareField48.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        squareField48.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        squareField48.setBorder(null);
        squareField48.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        squareField48.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                squareField48KeyTyped(evt);
            }
        });

        squareField49.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        squareField49.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        squareField49.setBorder(null);
        squareField49.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        squareField49.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                squareField49KeyTyped(evt);
            }
        });

        squareField50.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        squareField50.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        squareField50.setBorder(null);
        squareField50.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        squareField50.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                squareField50KeyTyped(evt);
            }
        });

        squareField51.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        squareField51.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        squareField51.setBorder(null);
        squareField51.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        squareField51.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                squareField51KeyTyped(evt);
            }
        });

        squareField52.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        squareField52.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        squareField52.setBorder(null);
        squareField52.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        squareField52.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                squareField52KeyTyped(evt);
            }
        });

        squareField53.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        squareField53.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        squareField53.setBorder(null);
        squareField53.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        squareField53.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                squareField53KeyTyped(evt);
            }
        });

        squareField54.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        squareField54.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        squareField54.setBorder(null);
        squareField54.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        squareField54.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                squareField54KeyTyped(evt);
            }
        });

        squareField55.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        squareField55.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        squareField55.setBorder(null);
        squareField55.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        squareField55.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                squareField55KeyTyped(evt);
            }
        });

        squareField56.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        squareField56.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        squareField56.setBorder(null);
        squareField56.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        squareField56.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                squareField56KeyTyped(evt);
            }
        });

        squareField57.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        squareField57.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        squareField57.setBorder(null);
        squareField57.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        squareField57.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                squareField57KeyTyped(evt);
            }
        });

        squareField58.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        squareField58.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        squareField58.setBorder(null);
        squareField58.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        squareField58.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                squareField58KeyTyped(evt);
            }
        });

        squareField59.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        squareField59.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        squareField59.setBorder(null);
        squareField59.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        squareField59.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                squareField59KeyTyped(evt);
            }
        });

        squareField60.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        squareField60.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        squareField60.setBorder(null);
        squareField60.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        squareField60.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                squareField60KeyTyped(evt);
            }
        });

        squareField61.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        squareField61.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        squareField61.setBorder(null);
        squareField61.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        squareField61.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                squareField61KeyTyped(evt);
            }
        });

        squareField62.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        squareField62.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        squareField62.setBorder(null);
        squareField62.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        squareField62.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                squareField62KeyTyped(evt);
            }
        });

        squareField63.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        squareField63.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        squareField63.setBorder(null);
        squareField63.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        squareField63.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                squareField63KeyTyped(evt);
            }
        });

        squareField64.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        squareField64.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        squareField64.setBorder(null);
        squareField64.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        squareField64.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                squareField64KeyTyped(evt);
            }
        });

        squareField65.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        squareField65.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        squareField65.setBorder(null);
        squareField65.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        squareField65.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                squareField65KeyTyped(evt);
            }
        });

        squareField66.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        squareField66.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        squareField66.setBorder(null);
        squareField66.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        squareField66.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                squareField66KeyTyped(evt);
            }
        });

        squareField67.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        squareField67.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        squareField67.setBorder(null);
        squareField67.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        squareField67.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                squareField67KeyTyped(evt);
            }
        });

        squareField68.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        squareField68.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        squareField68.setBorder(null);
        squareField68.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        squareField68.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                squareField68KeyTyped(evt);
            }
        });

        squareField69.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        squareField69.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        squareField69.setBorder(null);
        squareField69.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        squareField69.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                squareField69KeyTyped(evt);
            }
        });

        squareField70.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        squareField70.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        squareField70.setBorder(null);
        squareField70.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        squareField70.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                squareField70KeyTyped(evt);
            }
        });

        squareField71.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        squareField71.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        squareField71.setBorder(null);
        squareField71.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        squareField71.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                squareField71KeyTyped(evt);
            }
        });

        squareField72.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        squareField72.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        squareField72.setBorder(null);
        squareField72.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        squareField72.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                squareField72KeyTyped(evt);
            }
        });

        squareField73.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        squareField73.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        squareField73.setBorder(null);
        squareField73.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        squareField73.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                squareField73KeyTyped(evt);
            }
        });

        squareField74.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        squareField74.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        squareField74.setBorder(null);
        squareField74.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        squareField74.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                squareField74KeyTyped(evt);
            }
        });

        squareField75.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        squareField75.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        squareField75.setBorder(null);
        squareField75.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        squareField75.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                squareField75KeyTyped(evt);
            }
        });

        squareField76.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        squareField76.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        squareField76.setBorder(null);
        squareField76.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        squareField76.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                squareField76KeyTyped(evt);
            }
        });

        squareField77.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        squareField77.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        squareField77.setBorder(null);
        squareField77.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        squareField77.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                squareField77KeyTyped(evt);
            }
        });

        squareField78.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        squareField78.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        squareField78.setBorder(null);
        squareField78.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        squareField78.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                squareField78KeyTyped(evt);
            }
        });

        squareField79.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        squareField79.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        squareField79.setBorder(null);
        squareField79.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        squareField79.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                squareField79KeyTyped(evt);
            }
        });

        squareField80.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        squareField80.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        squareField80.setBorder(null);
        squareField80.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        squareField80.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                squareField80KeyTyped(evt);
            }
        });

        squareField81.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        squareField81.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        squareField81.setBorder(null);
        squareField81.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        squareField81.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                squareField81KeyTyped(evt);
            }
        });

        javax.swing.GroupLayout boardPanelLayout = new javax.swing.GroupLayout(boardPanel);
        boardPanel.setLayout(boardPanelLayout);
        boardPanelLayout.setHorizontalGroup(
            boardPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(boardPanelLayout.createSequentialGroup()
                .addGap(13, 13, 13)
                .addGroup(boardPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(boardPanelLayout.createSequentialGroup()
                        .addGroup(boardPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(boardPanelLayout.createSequentialGroup()
                                .addComponent(squareField55, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(2, 2, 2)
                                .addComponent(squareField56, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(2, 2, 2)
                                .addComponent(squareField57, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(boardPanelLayout.createSequentialGroup()
                                .addComponent(squareField64, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(2, 2, 2)
                                .addComponent(squareField65, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(2, 2, 2)
                                .addComponent(squareField66, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(boardPanelLayout.createSequentialGroup()
                                .addComponent(squareField73, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(2, 2, 2)
                                .addComponent(squareField74, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(2, 2, 2)
                                .addComponent(squareField75, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(boardPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(boardPanelLayout.createSequentialGroup()
                                .addComponent(squareField58, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(2, 2, 2)
                                .addComponent(squareField59, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(2, 2, 2)
                                .addComponent(squareField60, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(boardPanelLayout.createSequentialGroup()
                                .addComponent(squareField67, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(2, 2, 2)
                                .addComponent(squareField68, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(2, 2, 2)
                                .addComponent(squareField69, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(boardPanelLayout.createSequentialGroup()
                                .addComponent(squareField76, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(2, 2, 2)
                                .addComponent(squareField77, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(2, 2, 2)
                                .addComponent(squareField78, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(boardPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(boardPanelLayout.createSequentialGroup()
                                .addComponent(squareField61, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(2, 2, 2)
                                .addComponent(squareField62, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(2, 2, 2)
                                .addComponent(squareField63, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(boardPanelLayout.createSequentialGroup()
                                .addComponent(squareField70, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(2, 2, 2)
                                .addComponent(squareField71, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(2, 2, 2)
                                .addComponent(squareField72, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(boardPanelLayout.createSequentialGroup()
                                .addComponent(squareField79, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(2, 2, 2)
                                .addComponent(squareField80, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(2, 2, 2)
                                .addComponent(squareField81, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(boardPanelLayout.createSequentialGroup()
                        .addGroup(boardPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(boardPanelLayout.createSequentialGroup()
                                .addGroup(boardPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(boardPanelLayout.createSequentialGroup()
                                        .addComponent(squareField28, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(2, 2, 2)
                                        .addComponent(squareField29, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(2, 2, 2)
                                        .addComponent(squareField30, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(boardPanelLayout.createSequentialGroup()
                                        .addComponent(squareField46, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(2, 2, 2)
                                        .addComponent(squareField47, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(2, 2, 2)
                                        .addComponent(squareField48, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(boardPanelLayout.createSequentialGroup()
                                        .addComponent(squareField37, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(2, 2, 2)
                                        .addComponent(squareField38, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(2, 2, 2)
                                        .addComponent(squareField39, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(boardPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(boardPanelLayout.createSequentialGroup()
                                        .addComponent(squareField31, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(2, 2, 2)
                                        .addComponent(squareField32, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(2, 2, 2)
                                        .addComponent(squareField33, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(boardPanelLayout.createSequentialGroup()
                                        .addComponent(squareField40, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(2, 2, 2)
                                        .addComponent(squareField41, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(2, 2, 2)
                                        .addComponent(squareField42, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(boardPanelLayout.createSequentialGroup()
                                        .addComponent(squareField49, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(2, 2, 2)
                                        .addComponent(squareField50, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(2, 2, 2)
                                        .addComponent(squareField51, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE))))
                            .addGroup(boardPanelLayout.createSequentialGroup()
                                .addGroup(boardPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(boardPanelLayout.createSequentialGroup()
                                        .addComponent(squareField1, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(2, 2, 2)
                                        .addComponent(squareField2, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(2, 2, 2)
                                        .addComponent(squareField3, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(boardPanelLayout.createSequentialGroup()
                                        .addComponent(squareField10, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(2, 2, 2)
                                        .addComponent(squareField11, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(2, 2, 2)
                                        .addComponent(squareField12, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(boardPanelLayout.createSequentialGroup()
                                        .addComponent(squareField19, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(2, 2, 2)
                                        .addComponent(squareField20, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(2, 2, 2)
                                        .addComponent(squareField21, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(boardPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(boardPanelLayout.createSequentialGroup()
                                        .addComponent(squareField4, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(2, 2, 2)
                                        .addComponent(squareField5, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(2, 2, 2)
                                        .addComponent(squareField6, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(boardPanelLayout.createSequentialGroup()
                                        .addComponent(squareField13, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(2, 2, 2)
                                        .addComponent(squareField14, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(2, 2, 2)
                                        .addComponent(squareField15, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(boardPanelLayout.createSequentialGroup()
                                        .addComponent(squareField22, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(2, 2, 2)
                                        .addComponent(squareField23, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(2, 2, 2)
                                        .addComponent(squareField24, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(boardPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(boardPanelLayout.createSequentialGroup()
                                .addComponent(squareField34, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(2, 2, 2)
                                .addComponent(squareField35, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(2, 2, 2)
                                .addComponent(squareField36, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(boardPanelLayout.createSequentialGroup()
                                .addComponent(squareField43, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(2, 2, 2)
                                .addComponent(squareField44, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(2, 2, 2)
                                .addComponent(squareField45, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(boardPanelLayout.createSequentialGroup()
                                .addComponent(squareField25, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(2, 2, 2)
                                .addComponent(squareField26, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(2, 2, 2)
                                .addComponent(squareField27, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(boardPanelLayout.createSequentialGroup()
                                .addComponent(squareField16, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(2, 2, 2)
                                .addComponent(squareField17, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(2, 2, 2)
                                .addComponent(squareField18, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(boardPanelLayout.createSequentialGroup()
                                .addComponent(squareField7, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(2, 2, 2)
                                .addComponent(squareField8, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(2, 2, 2)
                                .addComponent(squareField9, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(boardPanelLayout.createSequentialGroup()
                                .addComponent(squareField52, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(2, 2, 2)
                                .addComponent(squareField53, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(2, 2, 2)
                                .addComponent(squareField54, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addGap(13, 13, 13))
        );
        boardPanelLayout.setVerticalGroup(
            boardPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, boardPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(boardPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(boardPanelLayout.createSequentialGroup()
                        .addGroup(boardPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(squareField7, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(squareField8, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(squareField9, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(2, 2, 2)
                        .addGroup(boardPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(squareField16, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(squareField17, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(squareField18, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(2, 2, 2)
                        .addGroup(boardPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(squareField25, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(squareField26, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(squareField27, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(boardPanelLayout.createSequentialGroup()
                        .addGroup(boardPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(squareField4, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(squareField5, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(squareField6, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(2, 2, 2)
                        .addGroup(boardPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(squareField13, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(squareField14, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(squareField15, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(2, 2, 2)
                        .addGroup(boardPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(squareField22, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(squareField23, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(squareField24, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(boardPanelLayout.createSequentialGroup()
                        .addGroup(boardPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(squareField1, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(squareField2, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(squareField3, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(2, 2, 2)
                        .addGroup(boardPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(squareField10, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(squareField11, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(squareField12, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(2, 2, 2)
                        .addGroup(boardPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(squareField19, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(squareField20, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(squareField21, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(boardPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(boardPanelLayout.createSequentialGroup()
                        .addGroup(boardPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(squareField28, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(squareField29, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(squareField30, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(2, 2, 2)
                        .addGroup(boardPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(squareField37, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(squareField38, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(squareField39, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(2, 2, 2)
                        .addGroup(boardPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(squareField46, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(squareField47, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(squareField48, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(boardPanelLayout.createSequentialGroup()
                        .addGroup(boardPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(squareField31, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(squareField32, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(squareField33, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(2, 2, 2)
                        .addGroup(boardPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(squareField40, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(squareField41, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(squareField42, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(2, 2, 2)
                        .addGroup(boardPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(squareField49, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(squareField50, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(squareField51, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(boardPanelLayout.createSequentialGroup()
                        .addGroup(boardPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(squareField34, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(squareField35, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(squareField36, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(2, 2, 2)
                        .addGroup(boardPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(squareField43, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(squareField44, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(squareField45, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(2, 2, 2)
                        .addGroup(boardPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(squareField52, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(squareField53, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(squareField54, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(boardPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(boardPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addGroup(boardPanelLayout.createSequentialGroup()
                            .addGroup(boardPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(squareField55, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(squareField56, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(squareField57, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGap(2, 2, 2)
                            .addGroup(boardPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(squareField64, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(squareField65, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(squareField66, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGap(2, 2, 2)
                            .addGroup(boardPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(squareField73, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(squareField74, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(squareField75, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGroup(boardPanelLayout.createSequentialGroup()
                            .addGroup(boardPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(squareField58, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(squareField59, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(squareField60, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGap(2, 2, 2)
                            .addGroup(boardPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(squareField67, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(squareField68, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(squareField69, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGap(2, 2, 2)
                            .addGroup(boardPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(squareField76, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(squareField77, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(squareField78, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(boardPanelLayout.createSequentialGroup()
                        .addGroup(boardPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(squareField61, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(squareField62, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(squareField63, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(2, 2, 2)
                        .addGroup(boardPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(squareField70, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(squareField71, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(squareField72, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(2, 2, 2)
                        .addGroup(boardPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(squareField79, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(squareField80, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(squareField81, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap())
        );

        checkButton.setText("Check");
        checkButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                checkButtonActionPerformed(evt);
            }
        });

        solveButton.setText("Solve");
        solveButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                solveButtonActionPerformed(evt);
            }
        });

        resetButton.setText("Reset Board");
        resetButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                resetButtonActionPerformed(evt);
            }
        });

        currentGivensLabel.setFont(new java.awt.Font("Trench", 1, 24)); // NOI18N
        currentGivensLabel.setText("Current Number of Givens:");
        currentGivensLabel.setRequestFocusEnabled(false);

        currentGivensDisplayLabel.setFont(new java.awt.Font("Trench", 1, 24)); // NOI18N
        currentGivensDisplayLabel.setText("0");
        currentGivensDisplayLabel.setRequestFocusEnabled(false);

        minGivensLabel.setFont(new java.awt.Font("Trench", 1, 18)); // NOI18N
        minGivensLabel.setText("Min. of 17 Givens Required");
        minGivensLabel.setRequestFocusEnabled(false);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(checkButton, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(solveButton, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(resetButton))
                    .addComponent(boardPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(currentGivensLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 276, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(currentGivensDisplayLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addComponent(minGivensLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 276, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(boardPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(currentGivensLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(currentGivensDisplayLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(0, 0, 0)
                .addComponent(minGivensLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 25, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(solveButton, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(resetButton, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(checkButton, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(38, 38, 38))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void resetButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_resetButtonActionPerformed
        // TODO add your handling code here:
        resetSudokuGUI();
        checkButton.setEnabled(true);
        solveButton.setEnabled(false);


    }//GEN-LAST:event_resetButtonActionPerformed

    private void solveButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_solveButtonActionPerformed
        // TODO add your handling code here:
        boolean done = sudokuSolver(0, 0);
        if (done) {
            int results[][] = board.toIntArray();
            displaySolvedBoard(results, board);

        } else {
            //Tell user can't solve
            JOptionPane.showMessageDialog(this, "Puzzle could not be solved",
                    "Sudoku Solver", JOptionPane.PLAIN_MESSAGE);
        }
    }//GEN-LAST:event_solveButtonActionPerformed

    private void checkButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_checkButtonActionPerformed
        // TODO add your handling code here:
        boolean p = checkGivens();

        //If the check givens returns false
        if (p) {
            solveButton.setEnabled(true);
            checkButton.setEnabled(false);
        } else {
            resetSudokuGUI();
        }

    }//GEN-LAST:event_checkButtonActionPerformed

    private void squareField1KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_squareField1KeyTyped


    }//GEN-LAST:event_squareField1KeyTyped

    private void squareField2KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_squareField2KeyTyped
        // TODO add your handling code here:
    }//GEN-LAST:event_squareField2KeyTyped

    private void squareField3KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_squareField3KeyTyped
        // TODO add your handling code here:
    }//GEN-LAST:event_squareField3KeyTyped

    private void squareField4KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_squareField4KeyTyped
        // TODO add your handling code here:
    }//GEN-LAST:event_squareField4KeyTyped

    private void squareField5KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_squareField5KeyTyped
        // TODO add your handling code here:
    }//GEN-LAST:event_squareField5KeyTyped

    private void squareField6KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_squareField6KeyTyped
        // TODO add your handling code here:
    }//GEN-LAST:event_squareField6KeyTyped

    private void squareField7KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_squareField7KeyTyped
        // TODO add your handling code here:
    }//GEN-LAST:event_squareField7KeyTyped

    private void squareField8KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_squareField8KeyTyped
        // TODO add your handling code here:
    }//GEN-LAST:event_squareField8KeyTyped

    private void squareField9KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_squareField9KeyTyped
        // TODO add your handling code here:
    }//GEN-LAST:event_squareField9KeyTyped

    private void squareField10KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_squareField10KeyTyped
        // TODO add your handling code here:
    }//GEN-LAST:event_squareField10KeyTyped

    private void squareField11KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_squareField11KeyTyped
        // TODO add your handling code here:
    }//GEN-LAST:event_squareField11KeyTyped

    private void squareField12KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_squareField12KeyTyped
        // TODO add your handling code here:
    }//GEN-LAST:event_squareField12KeyTyped

    private void squareField13KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_squareField13KeyTyped
        // TODO add your handling code here:
    }//GEN-LAST:event_squareField13KeyTyped

    private void squareField14KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_squareField14KeyTyped
        // TODO add your handling code here:
    }//GEN-LAST:event_squareField14KeyTyped

    private void squareField15KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_squareField15KeyTyped
        // TODO add your handling code here:
    }//GEN-LAST:event_squareField15KeyTyped

    private void squareField16KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_squareField16KeyTyped
        // TODO add your handling code here:
    }//GEN-LAST:event_squareField16KeyTyped

    private void squareField17KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_squareField17KeyTyped
        // TODO add your handling code here:
    }//GEN-LAST:event_squareField17KeyTyped

    private void squareField18KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_squareField18KeyTyped
        // TODO add your handling code here:
    }//GEN-LAST:event_squareField18KeyTyped

    private void squareField19KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_squareField19KeyTyped
        // TODO add your handling code here:
    }//GEN-LAST:event_squareField19KeyTyped

    private void squareField20KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_squareField20KeyTyped
        // TODO add your handling code here:
    }//GEN-LAST:event_squareField20KeyTyped

    private void squareField21KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_squareField21KeyTyped
        // TODO add your handling code here:
    }//GEN-LAST:event_squareField21KeyTyped

    private void squareField22KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_squareField22KeyTyped
        // TODO add your handling code here:
    }//GEN-LAST:event_squareField22KeyTyped

    private void squareField23KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_squareField23KeyTyped
        // TODO add your handling code here:
    }//GEN-LAST:event_squareField23KeyTyped

    private void squareField24KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_squareField24KeyTyped
        // TODO add your handling code here:
    }//GEN-LAST:event_squareField24KeyTyped

    private void squareField25KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_squareField25KeyTyped
        // TODO add your handling code here:
    }//GEN-LAST:event_squareField25KeyTyped

    private void squareField26KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_squareField26KeyTyped
        // TODO add your handling code here:
    }//GEN-LAST:event_squareField26KeyTyped

    private void squareField27KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_squareField27KeyTyped
        // TODO add your handling code here:
    }//GEN-LAST:event_squareField27KeyTyped

    private void squareField28KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_squareField28KeyTyped
        // TODO add your handling code here:
    }//GEN-LAST:event_squareField28KeyTyped

    private void squareField29KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_squareField29KeyTyped
        // TODO add your handling code here:
    }//GEN-LAST:event_squareField29KeyTyped

    private void squareField30KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_squareField30KeyTyped
        // TODO add your handling code here:
    }//GEN-LAST:event_squareField30KeyTyped

    private void squareField31KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_squareField31KeyTyped
        // TODO add your handling code here:
    }//GEN-LAST:event_squareField31KeyTyped

    private void squareField32KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_squareField32KeyTyped
        // TODO add your handling code here:
    }//GEN-LAST:event_squareField32KeyTyped

    private void squareField33KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_squareField33KeyTyped
        // TODO add your handling code here:
    }//GEN-LAST:event_squareField33KeyTyped

    private void squareField34KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_squareField34KeyTyped
        // TODO add your handling code here:
    }//GEN-LAST:event_squareField34KeyTyped

    private void squareField35KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_squareField35KeyTyped
        // TODO add your handling code here:
    }//GEN-LAST:event_squareField35KeyTyped

    private void squareField36KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_squareField36KeyTyped
        // TODO add your handling code here:
    }//GEN-LAST:event_squareField36KeyTyped

    private void squareField37KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_squareField37KeyTyped
        // TODO add your handling code here:
    }//GEN-LAST:event_squareField37KeyTyped

    private void squareField38KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_squareField38KeyTyped
        // TODO add your handling code here:
    }//GEN-LAST:event_squareField38KeyTyped

    private void squareField39KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_squareField39KeyTyped
        // TODO add your handling code here:
    }//GEN-LAST:event_squareField39KeyTyped

    private void squareField40KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_squareField40KeyTyped
        // TODO add your handling code here:
    }//GEN-LAST:event_squareField40KeyTyped

    private void squareField41KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_squareField41KeyTyped
        // TODO add your handling code here:
    }//GEN-LAST:event_squareField41KeyTyped

    private void squareField42KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_squareField42KeyTyped
        // TODO add your handling code here:
    }//GEN-LAST:event_squareField42KeyTyped

    private void squareField43KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_squareField43KeyTyped
        // TODO add your handling code here:
    }//GEN-LAST:event_squareField43KeyTyped

    private void squareField44KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_squareField44KeyTyped
        // TODO add your handling code here:
    }//GEN-LAST:event_squareField44KeyTyped

    private void squareField45KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_squareField45KeyTyped
        // TODO add your handling code here:
    }//GEN-LAST:event_squareField45KeyTyped

    private void squareField46KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_squareField46KeyTyped
        // TODO add your handling code here:
    }//GEN-LAST:event_squareField46KeyTyped

    private void squareField47KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_squareField47KeyTyped
        // TODO add your handling code here:
    }//GEN-LAST:event_squareField47KeyTyped

    private void squareField48KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_squareField48KeyTyped
        // TODO add your handling code here:
    }//GEN-LAST:event_squareField48KeyTyped

    private void squareField49KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_squareField49KeyTyped
        // TODO add your handling code here:
    }//GEN-LAST:event_squareField49KeyTyped

    private void squareField50KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_squareField50KeyTyped
        // TODO add your handling code here:
    }//GEN-LAST:event_squareField50KeyTyped

    private void squareField51KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_squareField51KeyTyped
        // TODO add your handling code here:
    }//GEN-LAST:event_squareField51KeyTyped

    private void squareField52KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_squareField52KeyTyped
        // TODO add your handling code here:
    }//GEN-LAST:event_squareField52KeyTyped

    private void squareField53KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_squareField53KeyTyped
        // TODO add your handling code here:
    }//GEN-LAST:event_squareField53KeyTyped

    private void squareField54KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_squareField54KeyTyped
        // TODO add your handling code here:
    }//GEN-LAST:event_squareField54KeyTyped

    private void squareField55KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_squareField55KeyTyped
        // TODO add your handling code here:
    }//GEN-LAST:event_squareField55KeyTyped

    private void squareField56KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_squareField56KeyTyped
        // TODO add your handling code here:
    }//GEN-LAST:event_squareField56KeyTyped

    private void squareField57KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_squareField57KeyTyped
        // TODO add your handling code here:
    }//GEN-LAST:event_squareField57KeyTyped

    private void squareField58KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_squareField58KeyTyped
        // TODO add your handling code here:
    }//GEN-LAST:event_squareField58KeyTyped

    private void squareField59KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_squareField59KeyTyped
        // TODO add your handling code here:
    }//GEN-LAST:event_squareField59KeyTyped

    private void squareField60KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_squareField60KeyTyped
        // TODO add your handling code here:
    }//GEN-LAST:event_squareField60KeyTyped

    private void squareField61KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_squareField61KeyTyped
        // TODO add your handling code here:
    }//GEN-LAST:event_squareField61KeyTyped

    private void squareField62KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_squareField62KeyTyped
        // TODO add your handling code here:
    }//GEN-LAST:event_squareField62KeyTyped

    private void squareField63KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_squareField63KeyTyped
        // TODO add your handling code here:
    }//GEN-LAST:event_squareField63KeyTyped

    private void squareField64KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_squareField64KeyTyped
        // TODO add your handling code here:
    }//GEN-LAST:event_squareField64KeyTyped

    private void squareField65KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_squareField65KeyTyped
        // TODO add your handling code here:
    }//GEN-LAST:event_squareField65KeyTyped

    private void squareField66KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_squareField66KeyTyped
        // TODO add your handling code here:
    }//GEN-LAST:event_squareField66KeyTyped

    private void squareField67KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_squareField67KeyTyped
        // TODO add your handling code here:
    }//GEN-LAST:event_squareField67KeyTyped

    private void squareField68KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_squareField68KeyTyped
        // TODO add your handling code here:
    }//GEN-LAST:event_squareField68KeyTyped

    private void squareField69KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_squareField69KeyTyped
        // TODO add your handling code here:
    }//GEN-LAST:event_squareField69KeyTyped

    private void squareField70KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_squareField70KeyTyped
        // TODO add your handling code here:
    }//GEN-LAST:event_squareField70KeyTyped

    private void squareField71KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_squareField71KeyTyped
        // TODO add your handling code here:
    }//GEN-LAST:event_squareField71KeyTyped

    private void squareField72KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_squareField72KeyTyped
        // TODO add your handling code here:
    }//GEN-LAST:event_squareField72KeyTyped

    private void squareField73KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_squareField73KeyTyped
        // TODO add your handling code here:
    }//GEN-LAST:event_squareField73KeyTyped

    private void squareField74KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_squareField74KeyTyped
        // TODO add your handling code here:
    }//GEN-LAST:event_squareField74KeyTyped

    private void squareField75KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_squareField75KeyTyped
        // TODO add your handling code here:
    }//GEN-LAST:event_squareField75KeyTyped

    private void squareField76KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_squareField76KeyTyped
        // TODO add your handling code here:
    }//GEN-LAST:event_squareField76KeyTyped

    private void squareField77KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_squareField77KeyTyped
        // TODO add your handling code here:
    }//GEN-LAST:event_squareField77KeyTyped

    private void squareField78KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_squareField78KeyTyped
        // TODO add your handling code here:
    }//GEN-LAST:event_squareField78KeyTyped

    private void squareField79KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_squareField79KeyTyped
        // TODO add your handling code here:
    }//GEN-LAST:event_squareField79KeyTyped

    private void squareField80KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_squareField80KeyTyped
        // TODO add your handling code here:
    }//GEN-LAST:event_squareField80KeyTyped

    private void squareField81KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_squareField81KeyTyped
        // TODO add your handling code here:
    }//GEN-LAST:event_squareField81KeyTyped

    private void squareField1KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_squareField1KeyReleased
        // TODO add your handling code here:
    }//GEN-LAST:event_squareField1KeyReleased

    //Checks the given values inserted into the sudoku board by the user
    private boolean checkGivens() {
        final int MIN_GIVENS = 17;
        ListIterator<JTextField> iterator = tfList.listIterator();
        JTextField field = iterator.next();
        DLinkedList errorList = new DLinkedList();
        displayGivens();
        for (int i = 0; i < PUZZLE_SIZE; i++) {
            for (int j = 0; j < PUZZLE_SIZE; j++) {

                if (field.getText() != null && !field.getText().equalsIgnoreCase("")) {
                    try {
                        int x = Integer.parseInt(field.getText());
                        board.addStartSquare(i, j, Integer.parseInt(field.getText()));
                        givenFields.add(field);
                        //Checks if the starting square is placed in a legal position
                        if (!board.isLegalStart(i, j)) {
                            if (!errorList.contains(this.INVALID_PLACEMENT)) {
                                errorList.add(this.INVALID_PLACEMENT);

                            }

                        }
                    } catch (Exception e) {
                        if (!errorList.contains(this.INVALID_INPUT_TYPE)) {
                            errorList.add(this.INVALID_INPUT_TYPE);
                        }

                    }

                }

                if (iterator.hasNext()) {
                    field = iterator.next();
                }

            }
        }

       
        if (givenFields.size() < MIN_GIVENS) {
            errorList.add(this.INVALID_GIVEN_NUM);
        }
        displayErrors(errorList);

        return givenFields.size() >= MIN_GIVENS;
    }
    
    //Displays any errors caught by the checkGivens method
    private void displayErrors(DLinkedList errorList) {
        String errorMessages = "";
        if (errorList.size() > 1) {
            errorMessages += "You have " + errorList.size() + " errors:\n";
        } else {
            errorMessages += "You have 1 error:\n";
        }

        if (errorList.contains(this.INVALID_GIVEN_NUM)) {
            errorMessages += "You do not have the minimum number"
                    + " of givens entered.\n";
        }

        if (errorList.contains(this.INVALID_INPUT_TYPE)) {
            errorMessages += "One of your givens"
                    + " is not a single integer value.\n";
        }

        if (errorList.contains(this.INVALID_PLACEMENT)) {
            errorMessages += "Your givens"
                    + " were placed in illegal positions.\n";
        }

        if (!errorList.isEmpty()) {
            JOptionPane.showMessageDialog(this, errorMessages, "Invalid Board",
                    JOptionPane.WARNING_MESSAGE);
            errorList.clear();
        }
        

    }

    //Displays the number of givens inserted by the user
    private void displayGivens() {
        ListIterator<JTextField> displayIterator = tfList.listIterator();
        int numOfGivens = 0;
        JTextField field = displayIterator.next();
        while (displayIterator.hasNext()) {
            if (field.getText() != null && !field.getText().equalsIgnoreCase("")) {
                numOfGivens++;
            }
            field = displayIterator.next();
        }
        this.currentGivensDisplayLabel.setText("" + numOfGivens);

    }

    //Resets the GUI to its initial state. Allows the user to play again
    private void resetSudokuGUI() {
        //Clear all text fields
        for (JTextField field : tfList) {
            field.setText(null);
            field.setForeground(Color.BLACK);
        }
        //Clear currentGivensDisplayLabel
        this.currentGivensDisplayLabel.setText("0");

        //Reset instance fields
        givenFields.clear();
        board.resetBoard();

    }

    //Solves the sudoku board using recursion and backtracking
    private boolean sudokuSolver(int row, int column) {
        int size = board.getPuzzleSize();

        if (column == size) {
            column = 0;
            row = row + 1;
        }
        if (row == size) {
            return true;
        } else {
            for (int i = 1; i <= size; i++) {
                board.addDataToSquare(row, column, i);
                boolean p = board.isLegal(row, column);

                if (p) {
                    boolean q = sudokuSolver(row, column + 1);
                    if (q) {
                        return true;
                    }
                }
                //Checks whether the program has backtracked and landed
                //on a starting square. Starting square values are constant
                if (board.getSquareAtPos(row, column).isStartingSquare()) {
                    return false;

                } else {
                    board.removeDataFromSquare(row, column);
                }
            }
            return false;
        }
    }

    //Displays the solved board
    private void displaySolvedBoard(int[][] results, SudokuBoard board) {

        //Create custom blue color
        int red = 0;
        int green = 102;
        int blue = 204;
        Color myBlue = new Color(red, green, blue);

        ListIterator<JTextField> iterator = tfList.listIterator();
        JTextField field = iterator.next();
        for (int i = 0; i < board.getPuzzleSize(); i++) {
            for (int j = 0; j < board.getPuzzleSize(); j++) {
                int data = results[i][j];
                //Changes color of squares filled in by the program
                //Leaves the given squares black
                if (!givenFields.contains(field)) {
                    field.setForeground(myBlue);
                }
                field.setText(Integer.toString(data));

                if (iterator.hasNext()) {
                    field = iterator.next();
                }

            }
        }
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Windows look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Windows".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(SudokuSolverFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(SudokuSolverFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(SudokuSolverFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(SudokuSolverFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new SudokuSolverFrame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel boardPanel;
    private javax.swing.JButton checkButton;
    private javax.swing.JLabel currentGivensDisplayLabel;
    private javax.swing.JLabel currentGivensLabel;
    private javax.swing.JLabel minGivensLabel;
    private javax.swing.JButton resetButton;
    private javax.swing.JButton solveButton;
    private javax.swing.JTextField squareField1;
    private javax.swing.JTextField squareField10;
    private javax.swing.JTextField squareField11;
    private javax.swing.JTextField squareField12;
    private javax.swing.JTextField squareField13;
    private javax.swing.JTextField squareField14;
    private javax.swing.JTextField squareField15;
    private javax.swing.JTextField squareField16;
    private javax.swing.JTextField squareField17;
    private javax.swing.JTextField squareField18;
    private javax.swing.JTextField squareField19;
    private javax.swing.JTextField squareField2;
    private javax.swing.JTextField squareField20;
    private javax.swing.JTextField squareField21;
    private javax.swing.JTextField squareField22;
    private javax.swing.JTextField squareField23;
    private javax.swing.JTextField squareField24;
    private javax.swing.JTextField squareField25;
    private javax.swing.JTextField squareField26;
    private javax.swing.JTextField squareField27;
    private javax.swing.JTextField squareField28;
    private javax.swing.JTextField squareField29;
    private javax.swing.JTextField squareField3;
    private javax.swing.JTextField squareField30;
    private javax.swing.JTextField squareField31;
    private javax.swing.JTextField squareField32;
    private javax.swing.JTextField squareField33;
    private javax.swing.JTextField squareField34;
    private javax.swing.JTextField squareField35;
    private javax.swing.JTextField squareField36;
    private javax.swing.JTextField squareField37;
    private javax.swing.JTextField squareField38;
    private javax.swing.JTextField squareField39;
    private javax.swing.JTextField squareField4;
    private javax.swing.JTextField squareField40;
    private javax.swing.JTextField squareField41;
    private javax.swing.JTextField squareField42;
    private javax.swing.JTextField squareField43;
    private javax.swing.JTextField squareField44;
    private javax.swing.JTextField squareField45;
    private javax.swing.JTextField squareField46;
    private javax.swing.JTextField squareField47;
    private javax.swing.JTextField squareField48;
    private javax.swing.JTextField squareField49;
    private javax.swing.JTextField squareField5;
    private javax.swing.JTextField squareField50;
    private javax.swing.JTextField squareField51;
    private javax.swing.JTextField squareField52;
    private javax.swing.JTextField squareField53;
    private javax.swing.JTextField squareField54;
    private javax.swing.JTextField squareField55;
    private javax.swing.JTextField squareField56;
    private javax.swing.JTextField squareField57;
    private javax.swing.JTextField squareField58;
    private javax.swing.JTextField squareField59;
    private javax.swing.JTextField squareField6;
    private javax.swing.JTextField squareField60;
    private javax.swing.JTextField squareField61;
    private javax.swing.JTextField squareField62;
    private javax.swing.JTextField squareField63;
    private javax.swing.JTextField squareField64;
    private javax.swing.JTextField squareField65;
    private javax.swing.JTextField squareField66;
    private javax.swing.JTextField squareField67;
    private javax.swing.JTextField squareField68;
    private javax.swing.JTextField squareField69;
    private javax.swing.JTextField squareField7;
    private javax.swing.JTextField squareField70;
    private javax.swing.JTextField squareField71;
    private javax.swing.JTextField squareField72;
    private javax.swing.JTextField squareField73;
    private javax.swing.JTextField squareField74;
    private javax.swing.JTextField squareField75;
    private javax.swing.JTextField squareField76;
    private javax.swing.JTextField squareField77;
    private javax.swing.JTextField squareField78;
    private javax.swing.JTextField squareField79;
    private javax.swing.JTextField squareField8;
    private javax.swing.JTextField squareField80;
    private javax.swing.JTextField squareField81;
    private javax.swing.JTextField squareField9;
    // End of variables declaration//GEN-END:variables

}
