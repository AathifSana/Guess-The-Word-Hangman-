
import javax.swing.JFrame;      //importing necessary packages
import java.io.*;               //importing necessary packages
import java.util.Scanner;       //importing necessary packages
import java.util.ArrayList;     //importing necessary packages
import java.util.Random;        //importing necessary packages

public class GuessTheWord extends JFrame {
    
    String[] arrayforboth = readWords();
    String hiddenWord = arrayforboth[0];
    int indexforhint = Integer.parseInt(arrayforboth[1]);
    String hint = readHints();
    int countLoss = 0, countWin = 0;
    ArrayList<Character> AlreadyEntered = new ArrayList<Character>();

    /*
    arrayforboth - is a string array which contains the hidden word randomly generated from a text file,
    and the index of the hidden word, so it can be used to generate the appropriate hint for it from the other text file.
    countWin - is the variable to hold the number of correct guesses
    countLoss - is the variable to hold the number of wrong guesses
    hiddenWord - is the variable holds the hidden word randomly generated 
    indexforhint - is the index for the hidden word
    hint - is the variable to hold the hint generated from the Hint.txt file.
    AlreadyEntered - is the arrayList to save all the characters entered
    **/
    public GuessTheWord() {
        initComponents();
        setLocationRelativeTo(null);
        setResizable(false);
        txthint.setText(hint);
        DisplayLabels(hiddenWord.length());
    }

    /*
    initComponents - is the method where all the design parts of the JFrame holds
    I have set the JFrame appear to the middle of the screen. JFrame is not Resizable
    Im displaying the hint i've got before into the txthint textfield
    Calling the DisplayLabels method to show the number of sufficient labels according to the length of the hidden word.   
    **/
    public String[] readWords() {

        File wordsFile = new File("src/Words.txt");

        try {

            Scanner sc = new Scanner(wordsFile);

            ArrayList<String> listWords = new ArrayList<String>();

            while (sc.hasNextLine()) {
                listWords.add(sc.nextLine());
            }

            Random rad = new Random();
            int index = rad.nextInt(listWords.size());

            String[] arrayForBoth = {listWords.get(index), Integer.toString(index)};

            return arrayForBoth;

        } catch (FileNotFoundException e) {
            System.exit(0);
        }
        return null;
    }

    /*
    readWord method has a return type of a String[] array which contains the hiddenword and the index of it.
    wordsFile contains the text file which holds many words for the program
    Scanner object sc, scans the wordsFile and adds all the words to a string ArrayList named listWords.
    rad is an object from Random method which randomly generate a number between 0(inclusive) to size of listWords(exclusive)
    the randomly generated number is stored in the integer variable index
    listWords.get(index)- generates the word accoding to the randomly generated index
    Integer.toString(index) - converts the index to String as it goes as a variable in the String array
    Method returns the String array
    **/
    public String readHints() {

        File hintsFile = new File("src/Hints.txt");

        try {

            Scanner sc1 = new Scanner(hintsFile);

            ArrayList<String> listHints = new ArrayList<String>();

            while (sc1.hasNextLine()) {
                listHints.add(sc1.nextLine());
            }

            return listHints.get(indexforhint);

        } catch (FileNotFoundException e) {
            System.exit(0);
        }
        return null;
    }

    /*
    readHints method has a return type of String which contains then appropriate hint for the hiddne word
    hintsFile contains the text file which holds all the hints for the words
    Scanner object sc1, scans the hintsFile and add all the hints to an ArrayList named listHints
    listHints.get(indexforhint) - gets the apporopriate hint for the word, identified by the index of the previous array
    This is because both hints and the words are placed the text file in the same order
    **/
    public void DisplayLabels(int numberofLabels) {

        switch (numberofLabels) {
            case 3:
                letter1.setVisible(true);
                letter2.setVisible(true);
                letter3.setVisible(true);
                break;
            case 4:
                letter1.setVisible(true);
                letter2.setVisible(true);
                letter3.setVisible(true);
                letter4.setVisible(true);
                break;
            case 5:
                letter1.setVisible(true);
                letter2.setVisible(true);
                letter3.setVisible(true);
                letter4.setVisible(true);
                letter5.setVisible(true);
                break;
            case 6:
                letter1.setVisible(true);
                letter2.setVisible(true);
                letter3.setVisible(true);
                letter4.setVisible(true);
                letter5.setVisible(true);
                letter6.setVisible(true);
                break;
            case 7:
                letter1.setVisible(true);
                letter2.setVisible(true);
                letter3.setVisible(true);
                letter4.setVisible(true);
                letter5.setVisible(true);
                letter6.setVisible(true);
                letter7.setVisible(true);
                break;
            case 8:
                letter1.setVisible(true);
                letter2.setVisible(true);
                letter3.setVisible(true);
                letter4.setVisible(true);
                letter5.setVisible(true);
                letter6.setVisible(true);
                letter7.setVisible(true);
                letter8.setVisible(true);
                break;
            case 9:
                letter1.setVisible(true);
                letter2.setVisible(true);
                letter3.setVisible(true);
                letter4.setVisible(true);
                letter5.setVisible(true);
                letter6.setVisible(true);
                letter7.setVisible(true);
                letter8.setVisible(true);
                letter9.setVisible(true);
                break;
            case 10:
                letter1.setVisible(true);
                letter2.setVisible(true);
                letter3.setVisible(true);
                letter4.setVisible(true);
                letter5.setVisible(true);
                letter6.setVisible(true);
                letter7.setVisible(true);
                letter8.setVisible(true);
                letter9.setVisible(true);
                letter10.setVisible(true);
                break;
        }
    }

    /*
    DisplayLabel method displays the sufficient amount of labels for the word
    All the labels are hidden at the beginning, The number of labels appear according the length of the word
    Length of the hidden word is the arguement given to this method, which its accepted as the parameter,
    called numberofLabels.
    according the length of the word, sufficient amount of labels are displayed
    **/
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        panelGuess = new javax.swing.JPanel();
        btnguess = new javax.swing.JButton();
        btnexit = new javax.swing.JButton();
        jSeparator2 = new javax.swing.JSeparator();
        txthint = new javax.swing.JTextField();
        lblhint = new javax.swing.JLabel();
        btnhelp = new javax.swing.JButton();
        txtguess = new javax.swing.JTextField();
        lblwrongguess = new javax.swing.JLabel();
        txtwrongguess = new javax.swing.JTextField();
        lblwelcome = new javax.swing.JLabel();
        lblimage = new javax.swing.JLabel();
        panelcharacters = new javax.swing.JPanel();
        letter1 = new javax.swing.JLabel();
        letter2 = new javax.swing.JLabel();
        letter3 = new javax.swing.JLabel();
        letter4 = new javax.swing.JLabel();
        letter5 = new javax.swing.JLabel();
        letter6 = new javax.swing.JLabel();
        letter7 = new javax.swing.JLabel();
        letter8 = new javax.swing.JLabel();
        letter9 = new javax.swing.JLabel();
        letter10 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Guess The Word");
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        panelGuess.setBackground(new java.awt.Color(102, 255, 255));

        btnguess.setFont(new java.awt.Font("Tempus Sans ITC", 1, 14)); // NOI18N
        btnguess.setText("Guess");
        btnguess.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));
        btnguess.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnguessActionPerformed(evt);
            }
        });

        btnexit.setFont(new java.awt.Font("Tempus Sans ITC", 1, 14)); // NOI18N
        btnexit.setText("Exit");
        btnexit.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));
        btnexit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnexitActionPerformed(evt);
            }
        });

        jSeparator2.setOrientation(javax.swing.SwingConstants.VERTICAL);

        txthint.setEditable(false);
        txthint.setFont(new java.awt.Font("Tempus Sans ITC", 1, 14)); // NOI18N

        lblhint.setFont(new java.awt.Font("Tempus Sans ITC", 1, 18)); // NOI18N
        lblhint.setText("Hint !");

        btnhelp.setFont(new java.awt.Font("Tempus Sans ITC", 1, 14)); // NOI18N
        btnhelp.setText("Help");
        btnhelp.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));
        btnhelp.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnhelpActionPerformed(evt);
            }
        });

        txtguess.setFont(new java.awt.Font("Tempus Sans ITC", 1, 14)); // NOI18N

        lblwrongguess.setFont(new java.awt.Font("Tempus Sans ITC", 1, 18)); // NOI18N
        lblwrongguess.setText("Wrong Guesses");

        txtwrongguess.setEditable(false);
        txtwrongguess.setFont(new java.awt.Font("Tempus Sans ITC", 1, 14)); // NOI18N
        txtwrongguess.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtwrongguessActionPerformed(evt);
            }
        });

        lblwelcome.setFont(new java.awt.Font("Tempus Sans ITC", 1, 30)); // NOI18N
        lblwelcome.setForeground(new java.awt.Color(0, 0, 255));
        lblwelcome.setText("Guess The Word!!!");

        lblimage.setBackground(new java.awt.Color(255, 255, 255));

        panelcharacters.setBackground(new java.awt.Color(102, 255, 255));
        panelcharacters.setLayout(new java.awt.GridLayout(1, 0));

        letter1.setFont(new java.awt.Font("Tempus Sans ITC", 1, 18)); // NOI18N
        letter1.setForeground(new java.awt.Color(0, 0, 255));
        letter1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        letter1.setText("X");
        panelcharacters.add(letter1);
        letter1.setVisible(false);

        letter2.setFont(new java.awt.Font("Tempus Sans ITC", 1, 18)); // NOI18N
        letter2.setForeground(new java.awt.Color(0, 0, 255));
        letter2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        letter2.setText("X");
        panelcharacters.add(letter2);
        letter2.setVisible(false);

        letter3.setFont(new java.awt.Font("Tempus Sans ITC", 1, 18)); // NOI18N
        letter3.setForeground(new java.awt.Color(0, 0, 255));
        letter3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        letter3.setText("X");
        panelcharacters.add(letter3);
        letter3.setVisible(false);

        letter4.setFont(new java.awt.Font("Tempus Sans ITC", 1, 18)); // NOI18N
        letter4.setForeground(new java.awt.Color(0, 0, 255));
        letter4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        letter4.setText("X");
        panelcharacters.add(letter4);
        letter4.setVisible(false);

        letter5.setFont(new java.awt.Font("Tempus Sans ITC", 1, 18)); // NOI18N
        letter5.setForeground(new java.awt.Color(0, 0, 255));
        letter5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        letter5.setText("X");
        panelcharacters.add(letter5);
        letter5.setVisible(false);

        letter6.setFont(new java.awt.Font("Tempus Sans ITC", 1, 18)); // NOI18N
        letter6.setForeground(new java.awt.Color(0, 0, 255));
        letter6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        letter6.setText("X");
        panelcharacters.add(letter6);
        letter6.setVisible(false);

        letter7.setFont(new java.awt.Font("Tempus Sans ITC", 1, 18)); // NOI18N
        letter7.setForeground(new java.awt.Color(0, 0, 255));
        letter7.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        letter7.setText("X");
        panelcharacters.add(letter7);
        letter7.setVisible(false);

        letter8.setFont(new java.awt.Font("Tempus Sans ITC", 1, 18)); // NOI18N
        letter8.setForeground(new java.awt.Color(0, 0, 255));
        letter8.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        letter8.setText("X");
        panelcharacters.add(letter8);
        letter8.setVisible(false);

        letter9.setFont(new java.awt.Font("Tempus Sans ITC", 1, 18)); // NOI18N
        letter9.setForeground(new java.awt.Color(0, 0, 255));
        letter9.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        letter9.setText("X");
        panelcharacters.add(letter9);
        letter9.setVisible(false);

        letter10.setFont(new java.awt.Font("Tempus Sans ITC", 1, 18)); // NOI18N
        letter10.setForeground(new java.awt.Color(0, 0, 255));
        letter10.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        letter10.setText("X");
        panelcharacters.add(letter10);
        letter10.setVisible(false);

        javax.swing.GroupLayout panelGuessLayout = new javax.swing.GroupLayout(panelGuess);
        panelGuess.setLayout(panelGuessLayout);
        panelGuessLayout.setHorizontalGroup(
            panelGuessLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelGuessLayout.createSequentialGroup()
                .addGroup(panelGuessLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelGuessLayout.createSequentialGroup()
                        .addGap(46, 46, 46)
                        .addComponent(lblwelcome))
                    .addGroup(panelGuessLayout.createSequentialGroup()
                        .addGap(37, 37, 37)
                        .addGroup(panelGuessLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(txtguess)
                            .addComponent(txthint)
                            .addComponent(panelcharacters, javax.swing.GroupLayout.DEFAULT_SIZE, 289, Short.MAX_VALUE)
                            .addGroup(panelGuessLayout.createSequentialGroup()
                                .addComponent(btnguess, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(btnhelp, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(btnexit, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(panelGuessLayout.createSequentialGroup()
                        .addGap(146, 146, 146)
                        .addComponent(lblhint, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(29, 29, 29)
                .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(panelGuessLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelGuessLayout.createSequentialGroup()
                        .addComponent(lblwrongguess, javax.swing.GroupLayout.PREFERRED_SIZE, 155, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 48, Short.MAX_VALUE)
                        .addComponent(txtwrongguess, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(lblimage, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(36, 36, 36))
        );
        panelGuessLayout.setVerticalGroup(
            panelGuessLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jSeparator2, javax.swing.GroupLayout.Alignment.TRAILING)
            .addGroup(panelGuessLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panelGuessLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelGuessLayout.createSequentialGroup()
                        .addGap(5, 5, 5)
                        .addComponent(lblwelcome)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(panelcharacters, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtguess, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(lblhint)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txthint, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(20, 20, 20)
                        .addGroup(panelGuessLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btnexit, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnhelp, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnguess, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(panelGuessLayout.createSequentialGroup()
                        .addComponent(lblimage, javax.swing.GroupLayout.PREFERRED_SIZE, 249, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(panelGuessLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtwrongguess, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblwrongguess, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addContainerGap(18, Short.MAX_VALUE))))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panelGuess, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panelGuess, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnguessActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnguessActionPerformed

        try {
            char guessLetter = Character.toLowerCase(txtguess.getText().charAt(0));
            boolean isEntered = false;

            /*
        guessLetter - is the letter entered by the user
        isEntered - is the a boolean variable to check whether the letter is already entered
             */
            for (char enteredChar : AlreadyEntered) {
                if (enteredChar == guessLetter) {
                    new Alreadyentered().setVisible(true);
                    isEntered = true;
                    txtguess.setText(null);
                    txtguess.requestFocus();
                }
            }

            /*
        for loops checks checks the arrayList AlreadyEntered and assign each character to the char variable enteredChar
        If enteredChar is equal to the guessLetter another JFrame will appear to display the user has already entered
        the character.
        The boolean isEntered turns to true.
        txtguess will be empty and the cursor will be in the text box again
             */
            if (isEntered == false) {

                /*
        After the previous loop execution, if the enteredChar is not equal to the guessLetter, the boolean will remain false.
        So if the guessLetter is not entered before, the program will enter this if condition
                 */
                AlreadyEntered.add(guessLetter);
                // the guessLetter will be added to the AlreadyEntered array list

                char[] letterArray = new char[hiddenWord.length()];
                for (int i = 0; i < letterArray.length; i++) {
                    letterArray[i] = hiddenWord.charAt(i);
                }

                /*
                char letterArray stores all the letters of the hiddenWord generated
                for loop will assign each letter to the char array
                 */
                ArrayList<Integer> letterPosition = findLetter(letterArray, guessLetter);

                /*
                Integer arraylist letterPosition is to store the number of occurance of the guessLetter
                and the position of the letter in the hidden word
                findLetter is the method to search the letter in the array
                letterArray and the guessLetter are the arguments given to it.
                findLetter will return an ArrayList to the LetterPosition which will contain size as the number of occurance,
                and the integer values as the position of the guessLetter
                If the letterPosition arrayList is empty, it means the guessLetter is not in the hiddenWord
                 */
                if (letterPosition.size() >= 1) {
                    for (int labelnumber : letterPosition) {
                        displayLetter(labelnumber, guessLetter);
                    }
                    countWin += letterPosition.size();

                    if (countWin == hiddenWord.length()) {
                        new YouWin().setVisible(true);
                        dispose();
                    }
                }

                /*
                if the letterPosition array has some value in it, which means the guessLetter is in the hiddenWord
                The Integer variable labelnumber will assign each integer value in the arrayList
                displayLetter is the method to change the appropriate label with the guessLetter
                arguements to the method will be the guessLetter and the labelnumber which contains the position of the
                letter in the hiddenWord.
                After displaying the guessletter replacing the appropriate 'X',
                countWin will increase by the lettterPosition arrayList size, which is the number of occurence
                of the guessLetter in the hiddenWord
                When the countWin equals to the length of the hiddenWord, which means all the letter are being guessed,
                A new JFrame will appear to display the user have won the game.
                 */
                if (letterPosition.isEmpty()) {
                    countLoss++;
                    txtwrongguess.setText(Integer.toString(countLoss));
                    displayImage(countLoss);

                    if (countLoss == 7) {
                        String CorrectWord = "The correct word was " + hiddenWord;
                        YouLoose form1 = new YouLoose();
                        form1.setVisible(true);
                        form1.setLabelText(CorrectWord);
                        dispose();
                    }
                }
                /*
                If the letterPosition is empty , which means the guessLetter is not in the hiddenWord
                countloss will be increased by 1, the countLoss will be displayed in the appropriate textfield
                displayImage method will be called to display the appropriate hangman Image
                arguement is the countLoss.
                If the countLoss is 7, which means the complete hangman is appeared.
                A new JFrame object named form1 will appear to inform that the user has lost the game
                CorrectWord is a String which shows the user the correct hiddenWord
                CorrectWord will be given as the arguement to the setLabelText in form1.
                 */

                txtguess.setText(null);
                txtguess.requestFocus();

                /*
                After guessing a letter, the text field will be empty and the cursor will be back in the text field.
                 */
            }
        } catch (Exception ex) { // handle exception when no letter is given to guess
            
                txtguess.setText(null);
                txtguess.requestFocus();
                /*
                After guessing a letter, the text field will be empty and the cursor will be back in the text field.
                 */
        }
    }//GEN-LAST:event_btnguessActionPerformed

    public ArrayList<Integer> findLetter(char[] charArray, char value) {

        ArrayList<Integer> list = new ArrayList<Integer>();

        for (int j = 0; j < charArray.length; j++) {
            if (charArray[j] == value) {
                list.add(j);
            }
        }
        return list;
    }

    /*
    findLetter is the method to find the guessLetter in the hiddenWord, return type will be an Integer ArrayList
    charArray and char value will be the parameters
    for loop will check each and every letter in the hiddenWord, if its equal to the value, which represents the guessLetter
    if any letter is equal to the guessLetter, the index(position) of the letter in the charArray will be stored,
    as a value in the ArrayList named 'list'.
    After the loop is executed, the ArrayList will be returned, which will be captured as an ArrayList called,
    'LetterPosition'.
     */
    public void displayLetter(int x, char letter) {

        switch (x) {
            case 0:
                letter1.setText(Character.toString(letter));
                break;
            case 1:
                letter2.setText(Character.toString(letter));
                break;
            case 2:
                letter3.setText(Character.toString(letter));
                break;
            case 3:
                letter4.setText(Character.toString(letter));
                break;
            case 4:
                letter5.setText(Character.toString(letter));
                break;
            case 5:
                letter6.setText(Character.toString(letter));
                break;
            case 6:
                letter7.setText(Character.toString(letter));
                break;
            case 7:
                letter8.setText(Character.toString(letter));
                break;
            case 8:
                letter9.setText(Character.toString(letter));
                break;
            case 9:
                letter10.setText(Character.toString(letter));
                break;
        }
    }

    /*
    displayLetter is the method to display guessLetter in the correct Label.
    Integer x and  char letter will be the parameters which will represent the position of the guessLetter and the
    guessLetter respectively.
    According to the value x, which holds the position of the guessLetter in the hiddenWord, the appropriate
    label will change to guessLetter replacing the 'X'.
     */
    public void displayImage(int y) {

        switch (y) {
            case 1:
                lblimage.setIcon(new javax.swing.ImageIcon(getClass().getResource("Hangman1.png")));
                break;
            case 2:
                lblimage.setIcon(new javax.swing.ImageIcon(getClass().getResource("Hangman2.png")));
                break;
            case 3:
                lblimage.setIcon(new javax.swing.ImageIcon(getClass().getResource("Hangman3.png")));
                break;
            case 4:
                lblimage.setIcon(new javax.swing.ImageIcon(getClass().getResource("Hangman4.png")));
                break;
            case 5:
                lblimage.setIcon(new javax.swing.ImageIcon(getClass().getResource("Hangman5.png")));
                break;
            case 6:
                lblimage.setIcon(new javax.swing.ImageIcon(getClass().getResource("Hangman6.png")));
                break;
            case 7:
                lblimage.setIcon(new javax.swing.ImageIcon(getClass().getResource("Hangman7.png")));
                break;
        }
    }

    /*
    displayImage is the method to display the correct hangman image when the user guess an incorrect value
    the parameter will be integer y, which represents the lossCount
    According to y, the appropriate hangman Image will display in the JLabel.
     */

    private void btnexitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnexitActionPerformed
        System.exit(0); // closing the game when the exit button is clicked
    }//GEN-LAST:event_btnexitActionPerformed

    private void txtwrongguessActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtwrongguessActionPerformed

    }//GEN-LAST:event_txtwrongguessActionPerformed

    private void btnhelpActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnhelpActionPerformed
        new Help().setVisible(true); // Displaying a new JFrame to show instructions to the user
    }//GEN-LAST:event_btnhelpActionPerformed

    public static void main(String args[]) {

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {    
               
                new GuessTheWord().setVisible(true);
                
           }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnexit;
    private javax.swing.JButton btnguess;
    private javax.swing.JButton btnhelp;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JLabel lblhint;
    private javax.swing.JLabel lblimage;
    private javax.swing.JLabel lblwelcome;
    private javax.swing.JLabel lblwrongguess;
    private javax.swing.JLabel letter1;
    private javax.swing.JLabel letter10;
    private javax.swing.JLabel letter2;
    private javax.swing.JLabel letter3;
    private javax.swing.JLabel letter4;
    private javax.swing.JLabel letter5;
    private javax.swing.JLabel letter6;
    private javax.swing.JLabel letter7;
    private javax.swing.JLabel letter8;
    private javax.swing.JLabel letter9;
    private javax.swing.JPanel panelGuess;
    private javax.swing.JPanel panelcharacters;
    private javax.swing.JTextField txtguess;
    private javax.swing.JTextField txthint;
    private javax.swing.JTextField txtwrongguess;
    // End of variables declaration//GEN-END:variables
}
