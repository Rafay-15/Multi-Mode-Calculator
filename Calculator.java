package com.company;

//Importing Java libraries
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.awt.Color;

//Main class
public class Calculator extends JFrame implements ActionListener {
    //Intitializing Buttons
    JFrame frame;
    JTextField textField1, textField2, resultFeild;
    JRadioButton byteButton, shortButton, intButton, longButton, floatButton, doubleButton;
    JRadioButton decimalButton, binaryButton, octalButton, hexaButton;
    JRadioButton arthematicButton, trigonometricButton, hyperbolicButton, logButton;
    JRadioButton addButton, subtractButton, divideButton, multiplyButton, degreeButton, exponentialButton, radianButton, percentButton, modButton;
    JRadioButton sinButton, cosButton, tanButton, cscButton, secButton, cotButton, invsinButton, invcosButton, invtanButton;
    JRadioButton sinhButton, coshButton, tanhButton, invsinhButton, invcoshButton, invtanhButton;
    JRadioButton logButtonFunc, Log10ButtonFunc;

    //Settinf textFelidFont
    Font font = new Font("Times New Roman", Font.BOLD, 35);
    Font exceptionFont = new Font("Times New Roman", Font.BOLD, 20);

    //Creating GUI
    Calculator() {
        //Adding Jframe instance
        frame = new JFrame("Calculator");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(450, 600);
        frame.getContentPane().setBackground(Color.lightGray);
        frame.setLayout(null);


        //Adding Text feilds
        textField1 = new JTextField("");
        textField1.setBounds(50, 25, 350, 40);
        textField1.setFont(font);
        frame.add(textField1);

        textField2 = new JTextField("0");
        textField2.setBounds(50, 75, 350, 40);
        textField2.setFont(font);
        frame.add(textField2);

        resultFeild = new JTextField("");
        resultFeild.setBounds(50, 500, 350, 40);
        resultFeild.setFont(font);
        frame.add(resultFeild);
        resultFeild.setEditable(false);

        //add The Radio buttons for data type
        byteButton = new JRadioButton("Byte");
        byteButton.setBounds(175, 120, 65, 15);
        byteButton.addActionListener(this);
        byteButton.setVisible(false);
        shortButton = new JRadioButton("Short");
        shortButton.setBounds(175, 140, 65, 15);
        shortButton.addActionListener(this);
        shortButton.setVisible(false);
        intButton = new JRadioButton("Int");
        intButton.setBounds(175, 160, 65, 15);
        intButton.addActionListener(this);
        intButton.setVisible(false);
        longButton = new JRadioButton("Long");
        longButton.setBounds(175, 180, 65, 15);
        longButton.addActionListener(this);
        longButton.setVisible(false);
        floatButton = new JRadioButton("Float");
        floatButton.setBounds(175, 200, 65, 15);
        floatButton.addActionListener(this);
        floatButton.setVisible(false);
        doubleButton = new JRadioButton("Double");
        doubleButton.setBounds(175, 220, 65, 15);
        doubleButton.addActionListener(this);
        doubleButton.setVisible(false);
        //Grouping the buttons
        ButtonGroup buttonGroupType = new ButtonGroup();
        buttonGroupType.add(byteButton);
        buttonGroupType.add(intButton);
        buttonGroupType.add(shortButton);
        buttonGroupType.add(longButton);
        buttonGroupType.add(floatButton);
        buttonGroupType.add(doubleButton);
        //Displaying the DataType buttons
        frame.add(byteButton);
        byteButton.setFocusable(false);
        frame.add(shortButton);
        shortButton.setFocusable(false);
        frame.add(intButton);
        intButton.setFocusable(false);
        frame.add(longButton);
        longButton.setFocusable(false);
        frame.add(floatButton);
        floatButton.setFocusable(false);
        frame.add(doubleButton);
        doubleButton.setFocusable(false);


        //Add radio buttons for Multi-Modes
        decimalButton = new JRadioButton("Decimal", true);
        decimalButton.setBounds(50, 120, 105, 20);
        decimalButton.addActionListener(this);
        binaryButton = new JRadioButton("Binary");
        binaryButton.setBounds(50, 145, 105, 20);
        binaryButton.addActionListener(this);
        octalButton = new JRadioButton("Octal");
        octalButton.setBounds(50, 170, 105, 20);
        octalButton.addActionListener(this);
        hexaButton = new JRadioButton("Hexa Decimal");
        hexaButton.setBounds(50, 195, 105, 20);
        hexaButton.addActionListener(this);
        //Grouping Buttons
        ButtonGroup buttonGroupMode = new ButtonGroup();
        buttonGroupMode.add(decimalButton);
        buttonGroupMode.add(binaryButton);
        buttonGroupMode.add(octalButton);
        buttonGroupMode.add(hexaButton);
        //Displaying the Mode selection Buttons
        frame.add(decimalButton);
        frame.add(binaryButton);
        frame.add(octalButton);
        frame.add(hexaButton);

        arthematicButton = new JRadioButton("Arthematic");
        arthematicButton.setBounds(255, 120, 95, 20);
        arthematicButton.addActionListener(this);
        arthematicButton.setVisible(false);

        trigonometricButton = new JRadioButton("Trigonometric");
        trigonometricButton.setBounds(255, 145, 95, 20);
        trigonometricButton.addActionListener(this);
        trigonometricButton.setVisible(false);

        hyperbolicButton = new JRadioButton("Hyperbolic");
        hyperbolicButton.setBounds(255, 170, 95, 20);
        hyperbolicButton.addActionListener(this);
        hyperbolicButton.setVisible(false);

        logButton = new JRadioButton("Log");
        logButton.setBounds(255, 195, 95, 20);
        logButton.addActionListener(this);
        logButton.setVisible(false);

        ButtonGroup operationButtons = new ButtonGroup();
        operationButtons.add(arthematicButton);
        operationButtons.add(trigonometricButton);
        operationButtons.add(hyperbolicButton);
        operationButtons.add(logButton);

        frame.add(arthematicButton);
        frame.add(trigonometricButton);
        frame.add(hyperbolicButton);
        frame.add(logButton);

        //Arthematic FUNCTIONS
        addButton = new JRadioButton("Add");
        addButton.setBounds(30, 250, 105, 20);
        addButton.addActionListener(this);
        addButton.setVisible(false);
        subtractButton = new JRadioButton("Subtract");
        subtractButton.setBounds(30, 275, 105, 20);
        subtractButton.addActionListener(this);
        subtractButton.setVisible(false);
        multiplyButton = new JRadioButton("Multipy");
        multiplyButton.setBounds(30, 300, 105, 20);
        multiplyButton.addActionListener(this);
        multiplyButton.setVisible(false);
        divideButton = new JRadioButton("Divide");
        divideButton.setBounds(30, 325, 105, 20);
        divideButton.addActionListener(this);
        divideButton.setVisible(false);
        degreeButton = new JRadioButton("to degree");
        degreeButton.setBounds(30, 350, 105, 20);
        degreeButton.addActionListener(this);
        degreeButton.setVisible(false);
        radianButton = new JRadioButton("to Radian");
        radianButton.setBounds(30, 375, 105, 20);
        radianButton.addActionListener(this);
        radianButton.setVisible(false);
        exponentialButton = new JRadioButton("Power");
        exponentialButton.setBounds(30, 400, 105, 20);
        exponentialButton.addActionListener(this);
        exponentialButton.setVisible(false);
        percentButton = new JRadioButton("Percent");
        percentButton.setBounds(30, 425, 105, 20);
        percentButton.addActionListener(this);
        percentButton.setVisible(false);
        modButton = new JRadioButton("Mod");
        modButton.setBounds(30, 450, 105, 20);
        modButton.addActionListener(this);
        modButton.setVisible(false);
        //Grouping Buttons
        ButtonGroup methodButton = new ButtonGroup();
        methodButton.add(addButton);
        methodButton.add(subtractButton);
        methodButton.add(multiplyButton);
        methodButton.add(divideButton);
        methodButton.add(degreeButton);
        methodButton.add(radianButton);
        methodButton.add(exponentialButton);
        methodButton.add(modButton);
        methodButton.add(percentButton);
        //Displaying the Operation selection Buttons
        frame.add(addButton);
        frame.add(subtractButton);
        frame.add(multiplyButton);
        frame.add(divideButton);
        frame.add(degreeButton);
        frame.add(exponentialButton);
        frame.add(modButton);
        frame.add(radianButton);
        frame.add(percentButton);


        //TRIGONOMETRIC functions
        sinButton = new JRadioButton("Sin");
        sinButton.setBounds(140, 250, 105, 20);
        sinButton.addActionListener(this);
        sinButton.setVisible(false);
        cosButton = new JRadioButton("Cos");
        cosButton.setBounds(140, 275, 105, 20);
        cosButton.addActionListener(this);
        cosButton.setVisible(false);
        tanButton = new JRadioButton("Tan");
        tanButton.setBounds(140, 300, 105, 20);
        tanButton.addActionListener(this);
        tanButton.setVisible(false);
        cscButton = new JRadioButton("Csc");
        cscButton.setBounds(140, 400, 105, 20);
        cscButton.addActionListener(this);
        cscButton.setVisible(false);
        secButton = new JRadioButton("Sec");
        secButton.setBounds(140, 425, 105, 20);
        secButton.addActionListener(this);
        secButton.setVisible(false);
        cotButton = new JRadioButton("Cot");
        cotButton.setBounds(140, 450, 105, 20);
        cotButton.addActionListener(this);
        cotButton.setVisible(false);
        invsinButton = new JRadioButton("Sin Inverse");
        invsinButton.setBounds(140, 325, 105, 20);
        invsinButton.addActionListener(this);
        invsinButton.setVisible(false);
        invcosButton = new JRadioButton("Cos Inverse");
        invcosButton.setBounds(140, 350, 105, 20);
        invcosButton.addActionListener(this);
        invcosButton.setVisible(false);
        invtanButton = new JRadioButton("Tan Inverse");
        invtanButton.setBounds(140, 375, 105, 20);
        invtanButton.addActionListener(this);
        invtanButton.setVisible(false);
        //Grouping
        ButtonGroup buttongrptrig = new ButtonGroup();
        buttongrptrig.add(sinButton);
        buttongrptrig.add(cosButton);
        buttongrptrig.add(tanButton);
        buttongrptrig.add(invsinButton);
        buttongrptrig.add(invcosButton);
        buttongrptrig.add(invtanButton);
        buttongrptrig.add(secButton);
        buttongrptrig.add(cscButton);
        buttongrptrig.add(cotButton);

        frame.add(sinButton);
        frame.add(invtanButton);
        frame.add(cosButton);
        frame.add(tanButton);
        frame.add(invsinButton);
        frame.add(invcosButton);
        frame.add(secButton);
        frame.add(cscButton);
        frame.add(cotButton);

        //HYPERBOLIC FUNCTIONS
        sinhButton = new JRadioButton("Sinh");
        sinhButton.setBounds(250, 250, 105, 20);
        sinhButton.addActionListener(this);
        sinhButton.setVisible(false);
        coshButton = new JRadioButton("Cosh");
        coshButton.setBounds(250, 275, 105, 20);
        coshButton.addActionListener(this);
        coshButton.setVisible(false);
        tanhButton = new JRadioButton("Tanh");
        tanhButton.setBounds(250, 300, 105, 20);
        tanhButton.addActionListener(this);
        tanhButton.setVisible(false);
        invsinhButton = new JRadioButton("Sinh Inverse");
        invsinhButton.setBounds(250, 325, 105, 20);
        invsinhButton.addActionListener(this);
        invsinhButton.setVisible(false);
        invcoshButton = new JRadioButton("Cosh Inverse");
        invcoshButton.setBounds(250, 350, 105, 20);
        invcoshButton.addActionListener(this);
        invcoshButton.setVisible(false);
        invtanhButton = new JRadioButton("Tanh Inverse");
        invtanhButton.setBounds(250, 375, 105, 20);
        invtanhButton.addActionListener(this);
        invtanhButton.setVisible(false);
        //Grouping
        ButtonGroup buttongrph = new ButtonGroup();
        buttongrph.add(sinhButton);
        buttongrph.add(coshButton);
        buttongrph.add(tanhButton);
        buttongrph.add(invsinhButton);
        buttongrph.add(invcoshButton);
        buttongrph.add(invtanhButton);

        frame.add(sinhButton);
        frame.add(invtanhButton);
        frame.add(coshButton);
        frame.add(tanhButton);
        frame.add(invsinhButton);
        frame.add(invcoshButton);

        // Log FUNCTIONS Buttons
        logButtonFunc = new JRadioButton("log");
        logButtonFunc.setBounds(360, 250, 60, 20);
        logButtonFunc.addActionListener(this);
        logButtonFunc.setVisible(false);
        frame.add(logButtonFunc);

        Log10ButtonFunc = new JRadioButton("Log10");
        Log10ButtonFunc.setBounds(360, 275, 60, 20);
        Log10ButtonFunc.addActionListener(this);
        Log10ButtonFunc.setVisible(false);
        frame.add(Log10ButtonFunc);
        ButtonGroup logButtonGrp = new ButtonGroup();
        logButtonGrp.add(logButtonFunc);
        logButtonGrp.add(Log10ButtonFunc);

        frame.setVisible(true);
        frame.repaint();

        frame.setVisible(true);
    }
    //Listening for user actions
    @Override
    public void actionPerformed(ActionEvent e) {
        // Exception handling
        try {
            //Resetting Font After exception
            resultFeild.setFont(font);

            // If DECIMAL TYPE is selected
            if (decimalButton.isSelected()) {

                //DISPLAYING the possible data types
                frame.repaint();

                byteButton.setVisible(true);
                shortButton.setVisible(true);
                intButton.setVisible(true);
                longButton.setVisible(true);
                floatButton.setVisible(true);
                doubleButton.setVisible(true);


                if (byteButton.isSelected()) {
                    byte num1 = Byte.parseByte(textField1.getText());
                    byte num2 = Byte.parseByte(textField2.getText());
                    byte resultbyte = 0;

                    System.out.println("Byte button pressed");
                    arthematicButton.setVisible(true);
                    trigonometricButton.setVisible(true);
                    hyperbolicButton.setVisible(true);
                    logButton.setVisible(true);

                    if (arthematicButton.isSelected()) {
                        System.out.println("Arthematic+Byte");

                        addButton.setVisible(true);
                        logButtonFunc.setVisible(false);
                        logButtonFunc.setVisible(false);
                        subtractButton.setVisible(true);
                        multiplyButton.setVisible(true);
                        divideButton.setVisible(true);
                        radianButton.setVisible(true);
                        exponentialButton.setVisible(true);
                        percentButton.setVisible(true);
                        degreeButton.setVisible(true);
                        modButton.setVisible(true);
                        textField2.setVisible(true);
                        //Hiding other types
                        sinButton.setVisible(false);
                        cosButton.setVisible(false);
                        tanButton.setVisible(false);
                        cscButton.setVisible(false);
                        secButton.setVisible(false);
                        cotButton.setVisible(false);
                        invsinButton.setVisible(false);
                        invcosButton.setVisible(false);
                        invtanButton.setVisible(false);
                        sinhButton.setVisible(false);
                        coshButton.setVisible(false);
                        tanhButton.setVisible(false);
                        invsinhButton.setVisible(false);
                        invcoshButton.setVisible(false);
                        invtanhButton.setVisible(false);
                        logButtonFunc.setVisible(false);

                        frame.repaint();

                        if (addButton.isSelected()) {resultbyte = (byte) (num1 + num2);}
                        //
                        else if (subtractButton.isSelected()) {resultbyte = (byte) (num1 - num2);}
                        //
                        else if (multiplyButton.isSelected()) {resultbyte = (byte) (num1 * num2);}
                        //
                        else if (divideButton.isSelected()) {resultbyte = (byte) (num1 / num2);}
                        //
                        else if (exponentialButton.isSelected()) {resultbyte = (byte) (Math.pow(num1, num2));}
                        //
                        else if (radianButton.isSelected()) {
                            textField2.setVisible(false);
                            resultbyte = (byte) (num1 * Math.PI / 180);}
                        //
                        else if (degreeButton.isSelected()) {
                            textField2.setVisible(false);
                            resultbyte = (byte) (num1 * 180 / Math.PI);}
                        //
                        else if (percentButton.isSelected()) {resultbyte = (byte) (num1 * 100 / num2);}
                        //
                        else if (modButton.isSelected()) {resultbyte = (byte) (num1 % num2);}

                    }
                    //
                    else if (trigonometricButton.isSelected()) {
                        System.out.println("Trigonometric");
                        logButtonFunc.setVisible(false);
                        logButtonFunc.setVisible(false);
                        sinButton.setVisible(true);
                        cosButton.setVisible(true);
                        tanButton.setVisible(true);
                        cscButton.setVisible(true);
                        secButton.setVisible(true);
                        cotButton.setVisible(true);
                        invsinButton.setVisible(true);
                        invcosButton.setVisible(true);
                        invtanButton.setVisible(true);
                        frame.repaint();
                        //Hiding other types
                        addButton.setVisible(false);
                        subtractButton.setVisible(false);
                        multiplyButton.setVisible(false);
                        divideButton.setVisible(false);
                        radianButton.setVisible(false);
                        exponentialButton.setVisible(false);
                        percentButton.setVisible(false);
                        degreeButton.setVisible(false);
                        modButton.setVisible(false);
                        textField2.setVisible(false);
                        sinhButton.setVisible(false);
                        coshButton.setVisible(false);
                        tanhButton.setVisible(false);
                        invsinhButton.setVisible(false);
                        invcoshButton.setVisible(false);
                        invtanhButton.setVisible(false);
                        logButtonFunc.setVisible(false);
                        frame.repaint();

                        double numrad = (num1 * Math.PI / 180);

                        if (sinButton.isSelected()) {resultbyte = (byte) (Math.sin(numrad));}
                        //
                        else if (cosButton.isSelected()) {resultbyte = (byte) (Math.cos(numrad));}
                        //
                        else if (tanButton.isSelected()) {resultbyte = (byte) (Math.tan(numrad));}
                        //
                        else if (invsinButton.isSelected()) {resultbyte = (byte) (Math.asin(numrad));}
                        //
                        else if (invcosButton.isSelected()) {resultbyte = (byte) (Math.acos(numrad));}
                        //
                        else if (invtanButton.isSelected()) {resultbyte = (byte) (Math.atan(numrad));}
                        //
                        else if (cscButton.isSelected()) {resultbyte = (byte) (1 / Math.sin(numrad));}
                        //
                        else if (secButton.isSelected()) {resultbyte = (byte) (1 / Math.cos(numrad));}
                        //
                        else if (cotButton.isSelected()) {resultbyte = (byte) (1 / Math.tan(numrad));}

                    }
                    //
                    else if (hyperbolicButton.isSelected()) {
                        //Displaying Buttons
                        sinhButton.setVisible(true);
                        logButtonFunc.setVisible(false);
                        logButtonFunc.setVisible(false);
                        coshButton.setVisible(true);
                        tanhButton.setVisible(true);
                        invsinhButton.setVisible(true);
                        invcoshButton.setVisible(true);
                        invtanhButton.setVisible(true);
                        //Hiding unnecessary Buttons and Fields
                        addButton.setVisible(false);
                        logButtonFunc.setVisible(false);
                        subtractButton.setVisible(false);
                        multiplyButton.setVisible(false);
                        divideButton.setVisible(false);
                        radianButton.setVisible(false);
                        exponentialButton.setVisible(false);
                        percentButton.setVisible(false);
                        degreeButton.setVisible(false);
                        modButton.setVisible(false);
                        textField2.setVisible(false);
                        sinButton.setVisible(false);
                        cosButton.setVisible(false);
                        tanButton.setVisible(false);
                        cscButton.setVisible(false);
                        secButton.setVisible(false);
                        cotButton.setVisible(false);
                        invsinButton.setVisible(false);
                        invcosButton.setVisible(false);
                        invtanButton.setVisible(false);
                        logButtonFunc.setVisible(false);
                        frame.repaint();


                        if (sinhButton.isSelected()) {
                            resultbyte = (byte) (Math.sinh(num1));
                        }
                        if (coshButton.isSelected()) {
                            resultbyte = (byte) (Math.cosh(num1));
                        }
                        if (tanhButton.isSelected()) {
                            resultbyte = (byte) (Math.tanh(num1));
                        }
                        if (invsinhButton.isSelected()) {
                            resultbyte = (byte) (Math.log(num1 + Math.sqrt(1 + num1 * num1)));
                        }
                        if (invcoshButton.isSelected()) {
                            resultbyte = (byte) (Math.log(num1 + Math.sqrt(num1 + 1) * Math.sqrt(num1 - 1)));
                        }
                        if (invtanhButton.isSelected()) {
                            resultbyte = (byte) ((Math.log(1 + num1) - Math.log(1 - num1)) / 2);
                        }

                    }
                    //
                    else if (logButton.isSelected()) {
                        addButton.setVisible(false);
                        subtractButton.setVisible(false);
                        multiplyButton.setVisible(false);
                        divideButton.setVisible(false);
                        radianButton.setVisible(false);
                        exponentialButton.setVisible(false);
                        percentButton.setVisible(false);
                        degreeButton.setVisible(false);
                        modButton.setVisible(false);
                        textField2.setVisible(false);
                        sinButton.setVisible(false);
                        cosButton.setVisible(false);
                        tanButton.setVisible(false);
                        cscButton.setVisible(false);
                        secButton.setVisible(false);
                        cotButton.setVisible(false);
                        invsinButton.setVisible(false);
                        invcosButton.setVisible(false);
                        invtanButton.setVisible(false);
                        sinhButton.setVisible(false);
                        coshButton.setVisible(false);
                        tanhButton.setVisible(false);
                        invsinhButton.setVisible(false);
                        invcoshButton.setVisible(false);
                        invtanhButton.setVisible(false);
                        //displaying button
                        logButtonFunc.setVisible(true);
                        Log10ButtonFunc.setVisible(true);
                        frame.repaint();

                        if (logButtonFunc.isSelected()){resultbyte = (byte) Math.log(num1);}
                        if(Log10ButtonFunc.isSelected()){resultbyte = (byte) Math.log10(num1);}


                    }
                    //Displaying results
                    resultFeild.setText(Byte.toString(resultbyte));

                }
                //short Button Pressed
                else if (shortButton.isSelected()) {
                    short resultshort = 0;
                    short num1 = Short.parseShort(textField1.getText());
                    short num2 = Short.parseShort(textField2.getText());
                    System.out.println("Short button pressed");

                    arthematicButton.setVisible(true);
                    trigonometricButton.setVisible(true);
                    hyperbolicButton.setVisible(true);
                    logButton.setVisible(true);

                    if (arthematicButton.isSelected()) {
                        System.out.println("Arthematic+Short");

                        addButton.setVisible(true);
                        logButtonFunc.setVisible(false);
                        subtractButton.setVisible(true);
                        multiplyButton.setVisible(true);
                        divideButton.setVisible(true);
                        radianButton.setVisible(true);
                        exponentialButton.setVisible(true);
                        percentButton.setVisible(true);
                        degreeButton.setVisible(true);
                        modButton.setVisible(true);
                        textField2.setVisible(true);
                        //Hiding
                        sinButton.setVisible(false);
                        cosButton.setVisible(false);
                        tanButton.setVisible(false);
                        invsinButton.setVisible(false);
                        invcosButton.setVisible(false);
                        invtanButton.setVisible(false);
                        sinhButton.setVisible(false);
                        coshButton.setVisible(false);
                        tanhButton.setVisible(false);
                        invsinhButton.setVisible(false);
                        invcoshButton.setVisible(false);
                        invtanhButton.setVisible(false);
                        logButtonFunc.setVisible(false);

                        frame.repaint();

                        if (addButton.isSelected()) {
                            resultshort = (short) (num1 + num2);
                        }
                        //
                        else if (subtractButton.isSelected()) {
                            resultshort = (short) (num1 - num2);
                        }
                        //
                        else if (multiplyButton.isSelected()) {
                            resultshort = (short) (num1 * num2);
                        }
                        //
                        else if (divideButton.isSelected()) {
                            resultshort = (short) (num1 / num2);
                        }
                        //
                        else if (exponentialButton.isSelected()) {
                            resultshort = (short) (Math.pow(num1, num2));
                        }
                        //
                        else if (radianButton.isSelected()) {
                            textField2.setVisible(false);
                            resultshort = (short) (num1 * Math.PI / 180);
                        }
                        //
                        else if (degreeButton.isSelected()) {
                            textField2.setVisible(false);
                            resultshort = (short) (num1 * 180 / Math.PI);
                        }
                        //
                        else if (percentButton.isSelected()) {
                            resultshort = (short) (num1 * 100 / num2);
                        }
                        //
                        else if (modButton.isSelected()) {
                            resultshort = (short) (num1 % num2);
                        }

                        resultFeild.setText(Short.toString(resultshort));

                    }
                    //
                    else if (trigonometricButton.isSelected()) {
                        System.out.println("Trigonometric");
                        logButtonFunc.setVisible(false);
                        textField2.setVisible(false);
                        sinButton.setVisible(true);
                        cosButton.setVisible(true);
                        tanButton.setVisible(true);
                        invsinButton.setVisible(true);
                        invcosButton.setVisible(true);
                        invtanButton.setVisible(true);
                        frame.repaint();
                        //Hiding other types
                        addButton.setVisible(false);
                        subtractButton.setVisible(false);
                        multiplyButton.setVisible(false);
                        divideButton.setVisible(false);
                        radianButton.setVisible(false);
                        exponentialButton.setVisible(false);
                        percentButton.setVisible(false);
                        degreeButton.setVisible(false);
                        modButton.setVisible(false);
                        sinhButton.setVisible(false);
                        coshButton.setVisible(false);
                        tanhButton.setVisible(false);
                        invsinhButton.setVisible(false);
                        invcoshButton.setVisible(false);
                        invtanhButton.setVisible(false);
                        logButtonFunc.setVisible(false);

                        textField2.setVisible(false);
                        frame.repaint();

                        double numrad = (num1 * Math.PI / 180);

                        if (sinButton.isSelected()) {
                            resultshort = (short) (Math.sin(numrad));
                        }
                        //
                        else if (cosButton.isSelected()) {resultshort = (short) (Math.cos(numrad));}
                        //
                        else if (tanButton.isSelected()) {resultshort = (short) (Math.tan(numrad));}
                        //
                        else if (invsinButton.isSelected()) {resultshort = (short) (Math.asin(numrad));} else if (invcosButton.isSelected()) {resultshort = (short) (Math.acos(numrad));} else if (invtanButton.isSelected()) {resultshort = (short) (Math.atan(numrad));} else if (cscButton.isSelected()) {resultshort = (short) (1 / Math.sin(numrad));} else if (secButton.isSelected()) {resultshort = (short) (1 / Math.cos(numrad));} else if (cotButton.isSelected()) {resultshort = (short) (1 / Math.tan(numrad));}
                    }
                    //
                    else if (hyperbolicButton.isSelected()) {
                        //Displaying Buttons
                        sinhButton.setVisible(true);
                        coshButton.setVisible(true);
                        tanhButton.setVisible(true);
                        invsinhButton.setVisible(true);
                        invcoshButton.setVisible(true);
                        invtanhButton.setVisible(true);
                        //Hiding unnecessary Buttons and Fields
                        addButton.setVisible(false);
                        logButtonFunc.setVisible(false);
                        subtractButton.setVisible(false);
                        multiplyButton.setVisible(false);
                        divideButton.setVisible(false);
                        radianButton.setVisible(false);
                        exponentialButton.setVisible(false);
                        percentButton.setVisible(false);
                        degreeButton.setVisible(false);
                        modButton.setVisible(false);
                        textField2.setVisible(false);
                        sinButton.setVisible(false);
                        cosButton.setVisible(false);
                        tanButton.setVisible(false);
                        cscButton.setVisible(false);
                        secButton.setVisible(false);
                        cotButton.setVisible(false);
                        invsinButton.setVisible(false);
                        invcosButton.setVisible(false);
                        invtanButton.setVisible(false);
                        logButtonFunc.setVisible(false);
                        frame.repaint();



                        if (sinhButton.isSelected()) {
                            resultshort = (short) (Math.sinh(num1));
                        }
                        if (coshButton.isSelected()) {
                            resultshort = (short) (Math.cosh(num1));
                        }
                        if (tanhButton.isSelected()) {
                            resultshort = (short) (Math.tanh(num1));
                        }
                        if (invsinhButton.isSelected()) {
                            resultshort = (short) (Math.log(num1 + Math.sqrt(1 + num1 * num1)));
                        }
                        if (invcoshButton.isSelected()) {
                            resultshort = (short) Math.log(num1 + Math.sqrt(num1 + 1) * Math.sqrt(num1 - 1));
                        }
                        if (invtanhButton.isSelected()) {
                            resultshort = (short) ((Math.log(1 + num1) - Math.log(1 - num1)) / 2);
                        }

                    }
                    //
                    else if (logButton.isSelected()) {
                        addButton.setVisible(false);
                        subtractButton.setVisible(false);
                        multiplyButton.setVisible(false);
                        divideButton.setVisible(false);
                        radianButton.setVisible(false);
                        exponentialButton.setVisible(false);
                        percentButton.setVisible(false);
                        degreeButton.setVisible(false);
                        modButton.setVisible(false);
                        textField2.setVisible(false);
                        sinButton.setVisible(false);
                        cosButton.setVisible(false);
                        tanButton.setVisible(false);
                        cscButton.setVisible(false);
                        secButton.setVisible(false);
                        cotButton.setVisible(false);
                        invsinButton.setVisible(false);
                        invcosButton.setVisible(false);
                        invtanButton.setVisible(false);
                        sinhButton.setVisible(false);
                        coshButton.setVisible(false);
                        tanhButton.setVisible(false);
                        invsinhButton.setVisible(false);
                        invcoshButton.setVisible(false);
                        invtanhButton.setVisible(false);
                        //displaying button
                        logButtonFunc.setVisible(true);
                        Log10ButtonFunc.setVisible(true);
                        frame.repaint();

                        if (logButtonFunc.isSelected()){resultshort = (short) Math.log(num1);}
                        if(Log10ButtonFunc.isSelected()){resultshort = (short) Math.log10(num1);}


                    }

                    resultFeild.setText(Short.toString(resultshort));
                    frame.repaint();

                }
                //
                else if (intButton.isSelected()) {
                    int resultInt = 0;
                    int num1 = Integer.parseInt(textField1.getText());
                    int num2 = Integer.parseInt(textField2.getText());
                    System.out.println("INT button pressed");//checking
                    arthematicButton.setVisible(true);
                    trigonometricButton.setVisible(true);
                    hyperbolicButton.setVisible(true);
                    logButton.setVisible(true);

                    if (arthematicButton.isSelected()) {
                        System.out.println("Arthematic+Iint");//checking
                        logButtonFunc.setVisible(false);
                        addButton.setVisible(true);
                        subtractButton.setVisible(true);
                        multiplyButton.setVisible(true);
                        divideButton.setVisible(true);
                        radianButton.setVisible(true);
                        exponentialButton.setVisible(true);
                        percentButton.setVisible(true);
                        degreeButton.setVisible(true);
                        modButton.setVisible(true);
                        //Hiding Buttons
                        sinButton.setVisible(false);
                        cosButton.setVisible(false);
                        tanButton.setVisible(false);
                        invsinButton.setVisible(false);
                        invcosButton.setVisible(false);
                        invtanButton.setVisible(false);
                        textField2.setVisible(true);
                        logButtonFunc.setVisible(false);
                        frame.repaint();

                        if (addButton.isSelected()) {
                            resultInt =  (num1 + num2);
                        }
                        //
                        else if (subtractButton.isSelected()) {
                            resultInt =  (num1 - num2);
                        } else if (multiplyButton.isSelected()) {
                            resultInt =  (num1 * num2);
                        } else if (divideButton.isSelected()) {
                            resultInt =  (num1 / num2);
                        } else if (exponentialButton.isSelected()) {
                            resultInt = (int) (Math.pow(num1, num2));
                        } else if (radianButton.isSelected()) {
                            textField2.setVisible(false);
                            resultInt = (int) (num1 * Math.PI / 180);
                        } else if (degreeButton.isSelected()) {
                            textField2.setVisible(false);
                            resultInt = (int) (num1 * 180 / Math.PI);
                        } else if (percentButton.isSelected()) {
                            resultInt =  (num1 * 100 / num2);
                        } else if (modButton.isSelected()) {
                            resultInt =  (num1 % num2);
                        }
                    }
                    //
                    else if (trigonometricButton.isSelected()) {
                        System.out.println("Trigonometric");
                        textField2.setVisible(false);
                        logButtonFunc.setVisible(false);
                        sinButton.setVisible(true);
                        cosButton.setVisible(true);
                        tanButton.setVisible(true);
                        invsinButton.setVisible(true);
                        invcosButton.setVisible(true);
                        invtanButton.setVisible(true);
                        frame.repaint();
                        //Hiding other types
                        addButton.setVisible(false);
                        subtractButton.setVisible(false);
                        multiplyButton.setVisible(false);
                        divideButton.setVisible(false);
                        radianButton.setVisible(false);
                        exponentialButton.setVisible(false);
                        percentButton.setVisible(false);
                        degreeButton.setVisible(false);
                        modButton.setVisible(false);
                        sinhButton.setVisible(false);
                        coshButton.setVisible(false);
                        tanhButton.setVisible(false);
                        invsinhButton.setVisible(false);
                        invcoshButton.setVisible(false);
                        invtanhButton.setVisible(false);
                        logButtonFunc.setVisible(false);

                        textField2.setVisible(false);
                        frame.repaint();


                        double numrad = (num1 * Math.PI / 180);

                        if (sinButton.isSelected()) {
                            resultInt = (int) (Math.sin(numrad));
                        }
                        if (cosButton.isSelected()) {
                            resultInt = (int) (Math.cos(numrad));
                        }
                        if (tanButton.isSelected()) {
                            resultInt = (int) (Math.tan(numrad));
                        }
                        if (invsinButton.isSelected()) {
                            resultInt = (int) (Math.asin(numrad));
                        }
                        if (invcosButton.isSelected()) {
                            resultInt = (int) (Math.acos(numrad));
                        }
                        if (invtanButton.isSelected()) {
                            resultInt = (int) (Math.atan(numrad));
                        }
                        if (cscButton.isSelected()) {
                            resultInt = (int) (1 / Math.sin(numrad));
                        }
                        if (secButton.isSelected()) {
                            resultInt = (int) (1 / Math.cos(numrad));
                        }
                        if (cotButton.isSelected()) {
                            resultInt = (int) (1 / Math.tan(numrad));
                        }
                    }
                    //
                    else if (hyperbolicButton.isSelected()) {
                        //Displaying Buttons
                        logButtonFunc.setVisible(false);
                        sinhButton.setVisible(true);
                        coshButton.setVisible(true);
                        tanhButton.setVisible(true);
                        invsinhButton.setVisible(true);
                        invcoshButton.setVisible(true);
                        invtanhButton.setVisible(true);
                        //Hiding unnecessary Buttons and Fields
                        addButton.setVisible(false);
                        subtractButton.setVisible(false);
                        multiplyButton.setVisible(false);
                        divideButton.setVisible(false);
                        radianButton.setVisible(false);
                        exponentialButton.setVisible(false);
                        percentButton.setVisible(false);
                        degreeButton.setVisible(false);
                        modButton.setVisible(false);
                        textField2.setVisible(false);
                        sinButton.setVisible(false);
                        cosButton.setVisible(false);
                        tanButton.setVisible(false);
                        cscButton.setVisible(false);
                        secButton.setVisible(false);
                        cotButton.setVisible(false);
                        invsinButton.setVisible(false);
                        invcosButton.setVisible(false);
                        invtanButton.setVisible(false);
                        logButtonFunc.setVisible(false);
                        frame.repaint();


                        if (sinhButton.isSelected()) {
                            resultInt = (int) (Math.sinh(num1));
                        }
                        if (coshButton.isSelected()) {
                            resultInt = (int) (Math.cosh(num1));
                        }
                        if (tanhButton.isSelected()) {
                            resultInt = (int) (Math.tanh(num1));
                        }
                        if (invsinhButton.isSelected()) {
                            resultInt = (int) (Math.log(num1 + Math.sqrt(1 + num1 * num1)));
                        }
                        if (invcoshButton.isSelected()) {
                            resultInt = (int) (Math.log(num1 + Math.sqrt(num1+ 1) * Math.sqrt(num1 - 1)));
                        }
                        if (invtanhButton.isSelected()) {
                            resultInt = (int) ((Math.log(1 + num1) - Math.log(1 - num1)) / 2);
                        }

                    }
                    //
                    else if (logButton.isSelected()) {
                        addButton.setVisible(false);
                        subtractButton.setVisible(false);
                        multiplyButton.setVisible(false);
                        divideButton.setVisible(false);
                        radianButton.setVisible(false);
                        exponentialButton.setVisible(false);
                        percentButton.setVisible(false);
                        degreeButton.setVisible(false);
                        modButton.setVisible(false);
                        textField2.setVisible(false);
                        sinButton.setVisible(false);
                        cosButton.setVisible(false);
                        tanButton.setVisible(false);
                        cscButton.setVisible(false);
                        secButton.setVisible(false);
                        cotButton.setVisible(false);
                        invsinButton.setVisible(false);
                        invcosButton.setVisible(false);
                        invtanButton.setVisible(false);
                        sinhButton.setVisible(false);
                        coshButton.setVisible(false);
                        tanhButton.setVisible(false);
                        invsinhButton.setVisible(false);
                        invcoshButton.setVisible(false);
                        invtanhButton.setVisible(false);
                        //displaying button
                        logButtonFunc.setVisible(true);
                        Log10ButtonFunc.setVisible(true);
                        frame.repaint();

                        if (logButtonFunc.isSelected()){resultInt = (int) Math.log(num1);}
                        if(Log10ButtonFunc.isSelected()){resultInt = (int) Math.log10(num1);}


                    }

                    resultFeild.setText(Integer.toString(resultInt));

                }
                //
                else if (longButton.isSelected()) {
                    System.out.println("long"); //checking
                    long resultlong = 0;
                    long num1 = Long.parseLong(textField1.getText());
                    long num2 = Long.parseLong(textField2.getText());
                    arthematicButton.setVisible(true);
                    trigonometricButton.setVisible(true);
                    hyperbolicButton.setVisible(true);
                    logButton.setVisible(true);
                    //hiding buttons
                    sinButton.setVisible(false);
                    cosButton.setVisible(false);
                    tanButton.setVisible(false);
                    invsinButton.setVisible(false);
                    invcosButton.setVisible(false);
                    invtanButton.setVisible(false);
                    frame.repaint();

                    if (arthematicButton.isSelected()) {
                        logButtonFunc.setVisible(false);
                        addButton.setVisible(true);
                        subtractButton.setVisible(true);
                        multiplyButton.setVisible(true);
                        divideButton.setVisible(true);
                        radianButton.setVisible(true);
                        exponentialButton.setVisible(true);
                        percentButton.setVisible(true);
                        degreeButton.setVisible(true);
                        modButton.setVisible(true);
                        textField2.setVisible(true);
                        //Hiding
                        sinButton.setVisible(false);
                        cosButton.setVisible(false);
                        tanButton.setVisible(false);
                        invsinButton.setVisible(false);
                        invcosButton.setVisible(false);
                        invtanButton.setVisible(false);
                        sinhButton.setVisible(false);
                        coshButton.setVisible(false);
                        tanhButton.setVisible(false);
                        invsinhButton.setVisible(false);
                        invcoshButton.setVisible(false);
                        invtanhButton.setVisible(false);
                        logButtonFunc.setVisible(false);

                        frame.repaint();

                        System.out.println("long +arthematic");//checking

                        if (addButton.isSelected()) {
                            resultlong = (num1 + num2);
                        } else if (subtractButton.isSelected()) {
                            resultlong =  (num1 - num2);
                        } else if (multiplyButton.isSelected()) {
                            resultlong =  (num1 * num2);
                        } else if (divideButton.isSelected()) {
                            resultlong =  (num1 / num2);
                        } else if (exponentialButton.isSelected()) {
                            resultlong = (long) (Math.pow(num1, num2));
                        } else if (radianButton.isSelected()) {
                            textField2.setVisible(false);
                            resultlong = (long) (num1 * Math.PI / 180);
                        } else if (degreeButton.isSelected()) {
                            textField2.setVisible(false);
                            resultlong = (long) (num1 * 180 / Math.PI);
                        } else if (percentButton.isSelected()) {
                            resultlong =  (num1 * 100 / num2);
                        } else if (modButton.isSelected()) {
                            resultlong = (num1 % num2);
                        }
                    }
                    //
                    else if (trigonometricButton.isSelected()) {
                        System.out.println("Trigonometric");
                        textField2.setVisible(false);
                        logButtonFunc.setVisible(false);
                        sinButton.setVisible(true);
                        cosButton.setVisible(true);
                        tanButton.setVisible(true);
                        invsinButton.setVisible(true);
                        invcosButton.setVisible(true);
                        invtanButton.setVisible(true);
                        frame.repaint();
                        //Hiding other types
                        addButton.setVisible(false);
                        subtractButton.setVisible(false);
                        multiplyButton.setVisible(false);
                        divideButton.setVisible(false);
                        radianButton.setVisible(false);
                        exponentialButton.setVisible(false);
                        percentButton.setVisible(false);
                        degreeButton.setVisible(false);
                        modButton.setVisible(false);
                        sinhButton.setVisible(false);
                        coshButton.setVisible(false);
                        tanhButton.setVisible(false);
                        invsinhButton.setVisible(false);
                        invcoshButton.setVisible(false);
                        invtanhButton.setVisible(false);
                        logButtonFunc.setVisible(false);

                        textField2.setVisible(false);
                        frame.repaint();

                        double numrad = (num1 * Math.PI / 180);
                        if (sinButton.isSelected()) {
                            resultlong = (long) (Math.sin(numrad));
                        }
                        if (cosButton.isSelected()) {
                            resultlong = (long) (Math.cos(numrad));
                        }
                        if (tanButton.isSelected()) {
                            resultlong = (long) (Math.tan(numrad));
                        }
                        if (invsinButton.isSelected()) {
                            resultlong = (long) (Math.asin(numrad));
                        }
                        if (invcosButton.isSelected()) {
                            resultlong = (long) (Math.acos(numrad));
                        }
                        if (invtanButton.isSelected()) {
                            resultlong = (long) (Math.atan(numrad));
                        }
                    }
                    //
                    else if (hyperbolicButton.isSelected()) {
                        //Displaying Buttons
                        logButtonFunc.setVisible(false);
                        sinhButton.setVisible(true);
                        coshButton.setVisible(true);
                        tanhButton.setVisible(true);
                        invsinhButton.setVisible(true);
                        invcoshButton.setVisible(true);
                        invtanhButton.setVisible(true);
                        //Hiding unnecessary Buttons and Fields
                        addButton.setVisible(false);
                        subtractButton.setVisible(false);
                        multiplyButton.setVisible(false);
                        divideButton.setVisible(false);
                        radianButton.setVisible(false);
                        exponentialButton.setVisible(false);
                        percentButton.setVisible(false);
                        degreeButton.setVisible(false);
                        modButton.setVisible(false);
                        textField2.setVisible(false);
                        sinButton.setVisible(false);
                        cosButton.setVisible(false);
                        tanButton.setVisible(false);
                        cscButton.setVisible(false);
                        secButton.setVisible(false);
                        cotButton.setVisible(false);
                        invsinButton.setVisible(false);
                        invcosButton.setVisible(false);
                        invtanButton.setVisible(false);
                        logButtonFunc.setVisible(false);
                        frame.repaint();


                        if (sinhButton.isSelected()) {
                            resultlong = (long) (Math.sinh(num1));
                        }
                        if (coshButton.isSelected()) {
                            resultlong = (long) (Math.cosh(num1));
                        }
                        if (tanhButton.isSelected()) {
                            resultlong = (long) (Math.tanh(num1));
                        }
                        if (invsinhButton.isSelected()) {
                            resultlong = (long) (Math.log(num1 + Math.sqrt(1 + num1 * num1)));
                        }
                        if (invcoshButton.isSelected()) {
                            resultlong = (long) (Math.log(num1 + Math.sqrt(num1 + 1) * Math.sqrt(num1 - 1)));
                        }
                        if (invtanhButton.isSelected()) {
                            resultlong = (long) ((Math.log(1 + num1) - Math.log(1 - num1)) / 2);
                        }

                    }
                    //
                    else if (logButton.isSelected()) {
                        addButton.setVisible(false);
                        subtractButton.setVisible(false);
                        multiplyButton.setVisible(false);
                        divideButton.setVisible(false);
                        radianButton.setVisible(false);
                        exponentialButton.setVisible(false);
                        percentButton.setVisible(false);
                        degreeButton.setVisible(false);
                        modButton.setVisible(false);
                        textField2.setVisible(false);
                        sinButton.setVisible(false);
                        cosButton.setVisible(false);
                        tanButton.setVisible(false);
                        cscButton.setVisible(false);
                        secButton.setVisible(false);
                        cotButton.setVisible(false);
                        invsinButton.setVisible(false);
                        invcosButton.setVisible(false);
                        invtanButton.setVisible(false);
                        sinhButton.setVisible(false);
                        coshButton.setVisible(false);
                        tanhButton.setVisible(false);
                        invsinhButton.setVisible(false);
                        invcoshButton.setVisible(false);
                        invtanhButton.setVisible(false);
                        //displaying button
                        logButtonFunc.setVisible(true);
                        Log10ButtonFunc.setVisible(true);
                        frame.repaint();

                        if (logButtonFunc.isSelected()){resultlong = (long) Math.log(num1);}
                        if(Log10ButtonFunc.isSelected()){resultlong = (long) Math.log10(num1);}


                    }

                    resultFeild.setText(Long.toString(resultlong));
                    frame.repaint();

                }
                //
                else if (doubleButton.isSelected()) {
                    System.out.println("Double");
                    double resultdouble = 0;
                    double num1 = Double.parseDouble(textField1.getText());
                    double num2 = Double.parseDouble(textField2.getText());

                    arthematicButton.setVisible(true);
                    trigonometricButton.setVisible(true);
                    hyperbolicButton.setVisible(true);
                    logButton.setVisible(true);
                    //hiding butons
                    sinButton.setVisible(false);
                    cosButton.setVisible(false);
                    tanButton.setVisible(false);
                    invsinButton.setVisible(false);
                    invcosButton.setVisible(false);
                    invtanButton.setVisible(false);
                    frame.repaint();

                    if (arthematicButton.isSelected()) {

                        addButton.setVisible(true);
                        subtractButton.setVisible(true);
                        multiplyButton.setVisible(true);
                        divideButton.setVisible(true);
                        radianButton.setVisible(true);
                        exponentialButton.setVisible(true);
                        percentButton.setVisible(true);
                        degreeButton.setVisible(true);
                        modButton.setVisible(true);
                        //Hiding Buttons
                        logButtonFunc.setVisible(false);
                        sinButton.setVisible(false);
                        cosButton.setVisible(false);
                        tanButton.setVisible(false);
                        invsinButton.setVisible(false);
                        invcosButton.setVisible(false);
                        invtanButton.setVisible(false);
                        textField2.setVisible(true);
                        logButtonFunc.setVisible(false);
                        frame.repaint();

                        System.out.println("DOUBLE +arthematic");
                        if (addButton.isSelected()) {
                            resultdouble = (num1 + num2);
                        } else if (subtractButton.isSelected()) {
                            resultdouble = (num1 - num2);
                        } else if (multiplyButton.isSelected()) {
                            resultdouble = (num1 * num2);
                        } else if (divideButton.isSelected()) {
                            resultdouble = (num1 / num2);
                        } else if (exponentialButton.isSelected()) {
                            resultdouble = (Math.pow(num1, num2));
                        } else if (radianButton.isSelected()) {
                            textField2.setVisible(false);
                            resultdouble = (num1 * Math.PI / 180);
                        } else if (degreeButton.isSelected()) {
                            textField2.setVisible(false);
                            resultdouble = (num1 * 180 / Math.PI);
                        } else if (percentButton.isSelected()) {
                            resultdouble = (num1 * 100 / num2);
                        } else if (modButton.isSelected()) {
                            resultdouble = (num1 % num2);
                        }

                    }
                    //
                    else if (trigonometricButton.isSelected()) {
                        System.out.println("Trigonometric");
                        textField2.setVisible(false);
                        logButtonFunc.setVisible(false);
                        sinButton.setVisible(true);
                        cosButton.setVisible(true);
                        tanButton.setVisible(true);
                        invsinButton.setVisible(true);
                        invcosButton.setVisible(true);
                        invtanButton.setVisible(true);
                        frame.repaint();
                        //Hiding other types
                        addButton.setVisible(false);
                        subtractButton.setVisible(false);
                        multiplyButton.setVisible(false);
                        divideButton.setVisible(false);
                        radianButton.setVisible(false);
                        exponentialButton.setVisible(false);
                        percentButton.setVisible(false);
                        degreeButton.setVisible(false);
                        modButton.setVisible(false);
                        sinhButton.setVisible(false);
                        coshButton.setVisible(false);
                        tanhButton.setVisible(false);
                        invsinhButton.setVisible(false);
                        invcoshButton.setVisible(false);
                        invtanhButton.setVisible(false);
                        logButtonFunc.setVisible(false);

                        textField2.setVisible(false);
                        frame.repaint();

                        double numrad = (num1 * Math.PI / 180);

                        if (sinButton.isSelected()) {
                            resultdouble = (Math.sin(numrad));
                        }
                        if (cosButton.isSelected()) {
                            resultdouble = (Math.cos(numrad));
                        }
                        if (tanButton.isSelected()) {
                            resultdouble = (Math.tan(numrad));
                        }
                        if (cscButton.isSelected()) {
                            resultdouble = (1 / Math.sin(numrad));
                        }
                        if (secButton.isSelected()) {
                            resultdouble = (1 / Math.cos(numrad));
                        }
                        if (cotButton.isSelected()) {
                            resultdouble = (1 / Math.tan(numrad));
                        }
                        if (invsinButton.isSelected()) {
                            resultdouble = (Math.asin(numrad));
                        }
                        if (invcosButton.isSelected()) {
                            resultdouble = (Math.acos(numrad));
                        }
                        if (invtanButton.isSelected()) {
                            resultdouble = (Math.atan(numrad));
                        }
                    }
                    //
                    else if (hyperbolicButton.isSelected()) {
                        //Displaying Buttons
                        logButtonFunc.setVisible(false);
                        sinhButton.setVisible(true);
                        coshButton.setVisible(true);
                        tanhButton.setVisible(true);
                        invsinhButton.setVisible(true);
                        invcoshButton.setVisible(true);
                        invtanhButton.setVisible(true);
                        //Hiding unnecessary Buttons and Fields
                        addButton.setVisible(false);
                        subtractButton.setVisible(false);
                        multiplyButton.setVisible(false);
                        divideButton.setVisible(false);
                        radianButton.setVisible(false);
                        exponentialButton.setVisible(false);
                        percentButton.setVisible(false);
                        degreeButton.setVisible(false);
                        modButton.setVisible(false);
                        textField2.setVisible(false);
                        sinButton.setVisible(false);
                        cosButton.setVisible(false);
                        tanButton.setVisible(false);
                        cscButton.setVisible(false);
                        secButton.setVisible(false);
                        cotButton.setVisible(false);
                        invsinButton.setVisible(false);
                        invcosButton.setVisible(false);
                        invtanButton.setVisible(false);
                        logButtonFunc.setVisible(false);
                        frame.repaint();

                        double numrad = (num1 * Math.PI / 180);

                        if (sinhButton.isSelected()) {
                            resultdouble = (Math.sinh(numrad));
                        }
                        if (coshButton.isSelected()) {
                            resultdouble = (Math.cosh(numrad));
                        }
                        if (tanhButton.isSelected()) {
                            resultdouble = (Math.tanh(numrad));
                        }
                        if (invsinhButton.isSelected()) {
                            resultdouble = (Math.log(numrad + Math.sqrt(1 + numrad * numrad)));
                        }
                        if (invcoshButton.isSelected()) {
                            resultdouble = (Math.log(numrad + Math.sqrt(numrad + 1) * Math.sqrt(numrad - 1)));
                        }
                        if (invtanhButton.isSelected()) {
                            resultdouble = ((Math.log(1 + numrad) - Math.log(1 - numrad)) / 2);
                        }

                    }
                    //
                    else if (logButton.isSelected()) {
                        addButton.setVisible(false);
                        subtractButton.setVisible(false);
                        multiplyButton.setVisible(false);
                        divideButton.setVisible(false);
                        radianButton.setVisible(false);
                        exponentialButton.setVisible(false);
                        percentButton.setVisible(false);
                        degreeButton.setVisible(false);
                        modButton.setVisible(false);
                        textField2.setVisible(false);
                        sinButton.setVisible(false);
                        cosButton.setVisible(false);
                        tanButton.setVisible(false);
                        cscButton.setVisible(false);
                        secButton.setVisible(false);
                        cotButton.setVisible(false);
                        invsinButton.setVisible(false);
                        invcosButton.setVisible(false);
                        invtanButton.setVisible(false);
                        sinhButton.setVisible(false);
                        coshButton.setVisible(false);
                        tanhButton.setVisible(false);
                        invsinhButton.setVisible(false);
                        invcoshButton.setVisible(false);
                        invtanhButton.setVisible(false);
                        //displaying button
                        logButtonFunc.setVisible(true);
                        Log10ButtonFunc.setVisible(true);
                        frame.repaint();

                        if (logButtonFunc.isSelected()){resultdouble =  Math.log(num1);}
                        if(Log10ButtonFunc.isSelected()){resultdouble =  Math.log10(num1);}


                    }

                    resultFeild.setText(Double.toString(resultdouble));
                    frame.repaint();
                }
                //
                else if (floatButton.isSelected()) {

                    System.out.println("float");
                    float resultfloat = 0;
                    float num1 = Float.parseFloat(textField1.getText());
                    float num2 = Float.parseFloat(textField2.getText());

                    arthematicButton.setVisible(true);
                    trigonometricButton.setVisible(true);
                    hyperbolicButton.setVisible(true);
                    logButton.setVisible(true);
                    //hiding butons
                    sinButton.setVisible(false);
                    cosButton.setVisible(false);
                    tanButton.setVisible(false);
                    invsinButton.setVisible(false);
                    invcosButton.setVisible(false);
                    invtanButton.setVisible(false);
                    frame.repaint();

                    if (arthematicButton.isSelected()) {

                        addButton.setVisible(true);
                        logButtonFunc.setVisible(false);
                        subtractButton.setVisible(true);
                        multiplyButton.setVisible(true);
                        divideButton.setVisible(true);
                        radianButton.setVisible(true);
                        exponentialButton.setVisible(true);
                        percentButton.setVisible(true);
                        degreeButton.setVisible(true);
                        modButton.setVisible(true);
                        //Hiding Buttons
                        sinButton.setVisible(false);
                        cosButton.setVisible(false);
                        tanButton.setVisible(false);
                        invsinButton.setVisible(false);
                        invcosButton.setVisible(false);
                        invtanButton.setVisible(false);
                        textField2.setVisible(true);
                        logButtonFunc.setVisible(false);
                        frame.repaint();

                        System.out.println("float +arthematic");
                        if (addButton.isSelected()) {
                            resultfloat = (num1 + num2);
                        } else if (subtractButton.isSelected()) {
                            resultfloat = (num1 - num2);
                        } else if (multiplyButton.isSelected()) {
                            resultfloat =  (num1 * num2);
                        } else if (divideButton.isSelected()) {
                            resultfloat =  (num1 / num2);
                        } else if (exponentialButton.isSelected()) {
                            resultfloat = (float) (Math.pow(num1, num2));
                        } else if (radianButton.isSelected()) {
                            textField2.setVisible(false);
                            resultfloat = (float) (num1 * Math.PI / 180);
                        } else if (degreeButton.isSelected()) {
                            textField2.setVisible(false);
                            resultfloat = (float) (num1 * 180 / Math.PI);
                        } else if (percentButton.isSelected()) {
                            resultfloat =  (num1 * 100 / num2);
                        } else if (modButton.isSelected()) {
                            resultfloat =  (num1 % num2);
                        }

                    }
                    //
                    else if (trigonometricButton.isSelected()) {
                        System.out.println("Trigonometric");
                        textField2.setVisible(false);
                        logButtonFunc.setVisible(false);
                        sinButton.setVisible(true);
                        cosButton.setVisible(true);
                        tanButton.setVisible(true);
                        invsinButton.setVisible(true);
                        invcosButton.setVisible(true);
                        invtanButton.setVisible(true);
                        frame.repaint();
                        //Hiding other types
                        addButton.setVisible(false);
                        subtractButton.setVisible(false);
                        multiplyButton.setVisible(false);
                        divideButton.setVisible(false);
                        radianButton.setVisible(false);
                        exponentialButton.setVisible(false);
                        percentButton.setVisible(false);
                        degreeButton.setVisible(false);
                        modButton.setVisible(false);
                        sinhButton.setVisible(false);
                        coshButton.setVisible(false);
                        tanhButton.setVisible(false);
                        invsinhButton.setVisible(false);
                        invcoshButton.setVisible(false);
                        invtanhButton.setVisible(false);
                        logButtonFunc.setVisible(false);

                        textField2.setVisible(false);
                        frame.repaint();

                        double numrad = (num1 * Math.PI / 180);

                        if (sinButton.isSelected()) {
                            resultfloat = (float) (Math.sin(numrad));
                        }
                        if (cosButton.isSelected()) {
                            resultfloat = (float) (Math.cos(numrad));
                        }
                        if (tanButton.isSelected()) {
                            resultfloat = (float) (Math.tan(numrad));
                        }
                        if (cscButton.isSelected()) {
                            resultfloat = (float) (1 / Math.sin(numrad));
                        }
                        if (secButton.isSelected()) {
                            resultfloat = (float) (1 / Math.cos(numrad));
                        }
                        if (cotButton.isSelected()) {
                            resultfloat = (float) (1 / Math.tan(numrad));
                        }
                        if (invsinButton.isSelected()) {
                            resultfloat = (float) (Math.asin(numrad));
                        }
                        if (invcosButton.isSelected()) {
                            resultfloat = (float) (Math.acos(numrad));
                        }
                        if (invtanButton.isSelected()) {
                            resultfloat = (float) (Math.atan(numrad));
                        }
                    }
                    //
                    else if (hyperbolicButton.isSelected()) {
                        //Displaying Buttons
                        logButtonFunc.setVisible(false);
                        sinhButton.setVisible(true);
                        coshButton.setVisible(true);
                        tanhButton.setVisible(true);
                        invsinhButton.setVisible(true);
                        invcoshButton.setVisible(true);
                        invtanhButton.setVisible(true);
                        //Hiding unnecessary Buttons and Fields
                        addButton.setVisible(false);
                        subtractButton.setVisible(false);
                        multiplyButton.setVisible(false);
                        divideButton.setVisible(false);
                        radianButton.setVisible(false);
                        exponentialButton.setVisible(false);
                        percentButton.setVisible(false);
                        degreeButton.setVisible(false);
                        modButton.setVisible(false);
                        textField2.setVisible(false);
                        sinButton.setVisible(false);
                        cosButton.setVisible(false);
                        tanButton.setVisible(false);
                        cscButton.setVisible(false);
                        secButton.setVisible(false);
                        cotButton.setVisible(false);
                        invsinButton.setVisible(false);
                        invcosButton.setVisible(false);
                        invtanButton.setVisible(false);
                        logButtonFunc.setVisible(false);
                        frame.repaint();


                        if (sinhButton.isSelected()) {
                            resultfloat = (float) (Math.sinh(num1));
                        }
                        if (coshButton.isSelected()) {
                            resultfloat = (float) (Math.cosh(num1));
                        }
                        if (tanhButton.isSelected()) {
                            resultfloat = (float) (Math.tanh(num1));
                        }
                        if (invsinhButton.isSelected()) {
                            resultfloat = (float) (Math.log(num1 + Math.sqrt(1 + num1 * num1)));
                        }
                        if (invcoshButton.isSelected()) {
                            resultfloat = (float) (Math.log(num1 + Math.sqrt(num1 + 1) * Math.sqrt(num1 - 1)));
                        }
                        if (invtanhButton.isSelected()) {
                            resultfloat = (float) ((Math.log(1 + num1) - Math.log(1 - num1)) / 2);
                        }

                    }
                    //
                    else if (logButton.isSelected()) {
                        addButton.setVisible(false);
                        subtractButton.setVisible(false);
                        multiplyButton.setVisible(false);
                        divideButton.setVisible(false);
                        radianButton.setVisible(false);
                        exponentialButton.setVisible(false);
                        percentButton.setVisible(false);
                        degreeButton.setVisible(false);
                        modButton.setVisible(false);
                        textField2.setVisible(false);
                        sinButton.setVisible(false);
                        cosButton.setVisible(false);
                        tanButton.setVisible(false);
                        cscButton.setVisible(false);
                        secButton.setVisible(false);
                        cotButton.setVisible(false);
                        invsinButton.setVisible(false);
                        invcosButton.setVisible(false);
                        invtanButton.setVisible(false);
                        sinhButton.setVisible(false);
                        coshButton.setVisible(false);
                        tanhButton.setVisible(false);
                        invsinhButton.setVisible(false);
                        invcoshButton.setVisible(false);
                        invtanhButton.setVisible(false);
                        //displaying button
                        logButtonFunc.setVisible(true);
                        Log10ButtonFunc.setVisible(true);
                        frame.repaint();

                        if (logButtonFunc.isSelected()){resultfloat = (float) Math.log(num1);}
                        if(Log10ButtonFunc.isSelected()){resultfloat = (float) Math.log10(num1);}


                    }

                    resultFeild.setText(Float.toString(resultfloat));
                    frame.repaint();

                }

            }

            //If BINARY TYPE Is selected
            else if (binaryButton.isSelected()) {


                frame.repaint();

                //DISPLAYING valid data types
                byteButton.setVisible(true);
                shortButton.setVisible(true);
                intButton.setVisible(true);
                longButton.setVisible(true);
                doubleButton.setVisible(false);
                floatButton.setVisible(false);
                frame.repaint();


                //Mode type selection
                if (byteButton.isSelected()) {

                    byte resultbyte = 0;
                    byte num1 = Byte.parseByte(textField1.getText(), 2);
                    byte num2 = Byte.parseByte(textField1.getText(), 2);

                    System.out.println("Byte button pressed");
                    arthematicButton.setVisible(true);
                    trigonometricButton.setVisible(true);
                    hyperbolicButton.setVisible(true);
                    logButton.setVisible(true);

                    if (arthematicButton.isSelected()) {
                        System.out.println("Arthematic+Byte");

                        addButton.setVisible(true);
                        subtractButton.setVisible(true);
                        multiplyButton.setVisible(true);
                        divideButton.setVisible(true);
                        radianButton.setVisible(true);
                        exponentialButton.setVisible(true);
                        percentButton.setVisible(true);
                        degreeButton.setVisible(true);
                        modButton.setVisible(true);
                        textField2.setVisible(true);
                        //Hiding other types
                        sinButton.setVisible(false);
                        cosButton.setVisible(false);
                        tanButton.setVisible(false);
                        cscButton.setVisible(false);
                        secButton.setVisible(false);
                        cotButton.setVisible(false);
                        invsinButton.setVisible(false);
                        invcosButton.setVisible(false);
                        invtanButton.setVisible(false);
                        sinhButton.setVisible(false);
                        coshButton.setVisible(false);
                        tanhButton.setVisible(false);
                        invsinhButton.setVisible(false);
                        invcoshButton.setVisible(false);
                        invtanhButton.setVisible(false);
                        logButtonFunc.setVisible(false);

                        frame.repaint();

                        if (addButton.isSelected()) {resultbyte = (byte) (num1 + num2);}
                        //
                        else if (subtractButton.isSelected()) {resultbyte = (byte) (num1 - num2);}
                        //
                        else if (multiplyButton.isSelected()) {resultbyte = (byte) (num1 * num2);}
                        //
                        else if (divideButton.isSelected()) {resultbyte = (byte) (num1 / num2);}
                        //
                        else if (exponentialButton.isSelected()) {resultbyte = (byte) (Math.pow(num1, num2));}
                        //
                        else if (radianButton.isSelected()) {resultbyte = (byte) (num1 * Math.PI / 180);}
                        //
                        else if (degreeButton.isSelected()) {resultbyte = (byte) (num1 * 180 / Math.PI);}
                        //
                        else if (percentButton.isSelected()) {resultbyte = (byte) (num1 * 100 / num2);}
                        //
                        else if (modButton.isSelected()) {resultbyte = (byte) (num1 % num2);}

                    }
                    //
                    else if (trigonometricButton.isSelected()) {
                        System.out.println("Trigonometric");
                        sinButton.setVisible(true);
                        cosButton.setVisible(true);
                        tanButton.setVisible(true);
                        cscButton.setVisible(true);
                        secButton.setVisible(true);
                        cotButton.setVisible(true);
                        invsinButton.setVisible(true);
                        invcosButton.setVisible(true);
                        invtanButton.setVisible(true);
                        frame.repaint();
                        //Hiding other types
                        addButton.setVisible(false);
                        subtractButton.setVisible(false);
                        multiplyButton.setVisible(false);
                        divideButton.setVisible(false);
                        radianButton.setVisible(false);
                        exponentialButton.setVisible(false);
                        percentButton.setVisible(false);
                        degreeButton.setVisible(false);
                        modButton.setVisible(false);
                        textField2.setVisible(false);
                        sinhButton.setVisible(false);
                        coshButton.setVisible(false);
                        tanhButton.setVisible(false);
                        invsinhButton.setVisible(false);
                        invcoshButton.setVisible(false);
                        invtanhButton.setVisible(false);
                        logButtonFunc.setVisible(false);
                        frame.repaint();

                        double numrad = (num1 * Math.PI / 180);

                        if (sinButton.isSelected()) {resultbyte = (byte) (Math.sin(numrad));}
                        //
                        else if (cosButton.isSelected()) {resultbyte = (byte) (Math.cos(numrad));}
                        //
                        else if (tanButton.isSelected()) {resultbyte = (byte) (Math.tan(numrad));}
                        //
                        else if (invsinButton.isSelected()) {resultbyte = (byte) (Math.asin(numrad));}
                        //
                        else if (invcosButton.isSelected()) {resultbyte = (byte) (Math.acos(numrad));}
                        //
                        else if (invtanButton.isSelected()) {resultbyte = (byte) (Math.atan(numrad));}
                        //
                        else if (cscButton.isSelected()) {resultbyte = (byte) (1 / Math.sin(numrad));}
                        //
                        else if (secButton.isSelected()) {resultbyte = (byte) (1 / Math.cos(numrad));}
                        //
                        else if (cotButton.isSelected()) {resultbyte = (byte) (1 / Math.tan(numrad));}

                    }
                    //
                    else if (hyperbolicButton.isSelected()) {
                        //Displaying Buttons
                        sinhButton.setVisible(true);
                        coshButton.setVisible(true);
                        tanhButton.setVisible(true);
                        invsinhButton.setVisible(true);
                        invcoshButton.setVisible(true);
                        invtanhButton.setVisible(true);
                        //Hiding unnecessary Buttons and Fields
                        addButton.setVisible(false);
                        subtractButton.setVisible(false);
                        multiplyButton.setVisible(false);
                        divideButton.setVisible(false);
                        radianButton.setVisible(false);
                        exponentialButton.setVisible(false);
                        percentButton.setVisible(false);
                        degreeButton.setVisible(false);
                        modButton.setVisible(false);
                        textField2.setVisible(false);
                        sinButton.setVisible(false);
                        cosButton.setVisible(false);
                        tanButton.setVisible(false);
                        cscButton.setVisible(false);
                        secButton.setVisible(false);
                        cotButton.setVisible(false);
                        invsinButton.setVisible(false);
                        invcosButton.setVisible(false);
                        invtanButton.setVisible(false);
                        logButtonFunc.setVisible(false);
                        frame.repaint();

                        if (sinhButton.isSelected()) {
                            resultbyte = (byte) (Math.sinh(num1));
                        }
                        if (coshButton.isSelected()) {
                            resultbyte = (byte) (Math.cosh(num1));
                        }
                        if (tanhButton.isSelected()) {
                            resultbyte = (byte) (Math.tanh(num1));
                        }
                        if (invsinhButton.isSelected()) {
                            resultbyte = (byte) (Math.log(num1 + Math.sqrt(1 + num1 * num1)));
                        }
                        if (invcoshButton.isSelected()) {
                            resultbyte = (byte) (Math.log(num1 + Math.sqrt(num1 + 1) * Math.sqrt(num1 - 1)));
                        }
                        if (invtanhButton.isSelected()) {
                            resultbyte = (byte) ((Math.log(1 + num1) - Math.log(1 - num1)) / 2);
                        }

                    }
                    //
                    else if (logButton.isSelected()) {
                        addButton.setVisible(false);
                        subtractButton.setVisible(false);
                        multiplyButton.setVisible(false);
                        divideButton.setVisible(false);
                        radianButton.setVisible(false);
                        exponentialButton.setVisible(false);
                        percentButton.setVisible(false);
                        degreeButton.setVisible(false);
                        modButton.setVisible(false);
                        textField2.setVisible(false);
                        sinButton.setVisible(false);
                        cosButton.setVisible(false);
                        tanButton.setVisible(false);
                        cscButton.setVisible(false);
                        secButton.setVisible(false);
                        cotButton.setVisible(false);
                        invsinButton.setVisible(false);
                        invcosButton.setVisible(false);
                        invtanButton.setVisible(false);
                        sinhButton.setVisible(false);
                        coshButton.setVisible(false);
                        tanhButton.setVisible(false);
                        invsinhButton.setVisible(false);
                        invcoshButton.setVisible(false);
                        invtanhButton.setVisible(false);
                        //displaying button
                        logButtonFunc.setVisible(true);
                        Log10ButtonFunc.setVisible(true);
                        frame.repaint();

                        if (logButtonFunc.isSelected()){resultbyte = (byte) Math.log(num1);}
                        if(Log10ButtonFunc.isSelected()){resultbyte = (byte) Math.log10(num1);}


                    }

                    //Displaying results
                    long resultbinary = resultbyte;

                    resultFeild.setText(Long.toBinaryString(resultbinary));
                }
                //
                else if (shortButton.isSelected()) {
                    short resultshort = 0;
                    System.out.println("Byte button pressed");
                    short num1 = Short.parseShort(textField1.getText(), 2);
                    short num2 = Short.parseShort(textField1.getText(), 2);

                    arthematicButton.setVisible(true);
                    trigonometricButton.setVisible(true);
                    hyperbolicButton.setVisible(true);
                    logButton.setVisible(true);

                    if (arthematicButton.isSelected()) {
                        System.out.println("Arthematic+Short");

                        addButton.setVisible(true);
                        subtractButton.setVisible(true);
                        multiplyButton.setVisible(true);
                        divideButton.setVisible(true);
                        radianButton.setVisible(true);
                        exponentialButton.setVisible(true);
                        percentButton.setVisible(true);
                        degreeButton.setVisible(true);
                        modButton.setVisible(true);
                        textField2.setVisible(true);
                        //Hiding
                        sinButton.setVisible(false);
                        cosButton.setVisible(false);
                        tanButton.setVisible(false);
                        invsinButton.setVisible(false);
                        invcosButton.setVisible(false);
                        invtanButton.setVisible(false);
                        sinhButton.setVisible(false);
                        coshButton.setVisible(false);
                        tanhButton.setVisible(false);
                        invsinhButton.setVisible(false);
                        invcoshButton.setVisible(false);
                        invtanhButton.setVisible(false);
                        logButtonFunc.setVisible(false);

                        frame.repaint();

                        if (addButton.isSelected()) {resultshort = (short) (num1 + num2);}
                        //
                        else if (subtractButton.isSelected()) {resultshort = (short) (num1 - num2);}
                        //
                        else if (multiplyButton.isSelected()) {resultshort = (short) (num1 * num2);}
                        //
                        else if (divideButton.isSelected()) {resultshort = (short) (num1 / num2);}
                        //
                        else if (exponentialButton.isSelected()) {resultshort = (short) (Math.pow(num1, num2));}
                        //
                        else if (radianButton.isSelected()) {resultshort = (short) (num1 * Math.PI / 180);}
                        //
                        else if (degreeButton.isSelected()) {resultshort = (short) (num1 * 180 / Math.PI);}
                        //
                        else if (percentButton.isSelected()) {resultshort = (short) (num1 * 100 / num2);}
                        //
                        else if (modButton.isSelected()) {resultshort = (short) (num1 % num2);}

                        resultFeild.setText(Short.toString(resultshort));

                    }
                    //
                    else if (trigonometricButton.isSelected()) {
                        System.out.println("Trigonometric");
                        textField2.setVisible(false);
                        sinButton.setVisible(true);
                        cosButton.setVisible(true);
                        tanButton.setVisible(true);
                        invsinButton.setVisible(true);
                        invcosButton.setVisible(true);
                        invtanButton.setVisible(true);
                        frame.repaint();
                        //Hiding other types
                        addButton.setVisible(false);
                        subtractButton.setVisible(false);
                        multiplyButton.setVisible(false);
                        divideButton.setVisible(false);
                        radianButton.setVisible(false);
                        exponentialButton.setVisible(false);
                        percentButton.setVisible(false);
                        degreeButton.setVisible(false);
                        modButton.setVisible(false);
                        sinhButton.setVisible(false);
                        coshButton.setVisible(false);
                        tanhButton.setVisible(false);
                        invsinhButton.setVisible(false);
                        invcoshButton.setVisible(false);
                        invtanhButton.setVisible(false);
                        logButtonFunc.setVisible(false);

                        textField2.setVisible(false);
                        frame.repaint();

                        double numrad = (num1 * Math.PI / 180);

                        if (sinButton.isSelected()) {
                            resultshort = (short) (Math.sin(numrad));
                        } else if (cosButton.isSelected()) {
                            resultshort = (short) (Math.cos(numrad));
                        } else if (tanButton.isSelected()) {
                            resultshort = (short) (Math.tan(numrad));
                        } else if (invsinButton.isSelected()) {
                            resultshort = (short) (Math.asin(numrad));
                        } else if (invcosButton.isSelected()) {
                            resultshort = (short) (Math.acos(numrad));
                        } else if (invtanButton.isSelected()) {
                            resultshort = (short) (Math.atan(numrad));
                        } else if (cscButton.isSelected()) {
                            resultshort = (short) (1 / Math.sin(numrad));
                        } else if (secButton.isSelected()) {
                            resultshort = (short) (1 / Math.cos(numrad));
                        } else if (cotButton.isSelected()) {
                            resultshort = (short) (1 / Math.tan(numrad));
                        }
                    }
                    //
                    else if (hyperbolicButton.isSelected()) {
                        //Displaying Buttons
                        sinhButton.setVisible(true);
                        coshButton.setVisible(true);
                        tanhButton.setVisible(true);
                        invsinhButton.setVisible(true);
                        invcoshButton.setVisible(true);
                        invtanhButton.setVisible(true);
                        //Hiding unnecessary Buttons and Fields
                        addButton.setVisible(false);
                        subtractButton.setVisible(false);
                        multiplyButton.setVisible(false);
                        divideButton.setVisible(false);
                        radianButton.setVisible(false);
                        exponentialButton.setVisible(false);
                        percentButton.setVisible(false);
                        degreeButton.setVisible(false);
                        modButton.setVisible(false);
                        textField2.setVisible(false);
                        sinButton.setVisible(false);
                        cosButton.setVisible(false);
                        tanButton.setVisible(false);
                        cscButton.setVisible(false);
                        secButton.setVisible(false);
                        cotButton.setVisible(false);
                        invsinButton.setVisible(false);
                        invcosButton.setVisible(false);
                        invtanButton.setVisible(false);
                        logButtonFunc.setVisible(false);
                        frame.repaint();


                        if (sinhButton.isSelected()) {
                            resultshort = (short) (Math.sinh(num1));
                        }
                        if (coshButton.isSelected()) {
                            resultshort = (short) (Math.cosh(num1));
                        }
                        if (tanhButton.isSelected()) {
                            resultshort = (short) (Math.tanh(num1));
                        }
                        if (invsinhButton.isSelected()) {
                            resultshort = (short) (Math.log(num1 + Math.sqrt(1 + num1 * num1)));
                        }
                        if (invcoshButton.isSelected()) {
                            resultshort = (short) Math.log(num1 + Math.sqrt(num1 + 1) * Math.sqrt(num1 - 1));
                        }
                        if (invtanhButton.isSelected()) {
                            resultshort = (short) ((Math.log(1 + num1) - Math.log(1 - num1)) / 2);
                        }

                    }
                    //
                    else if (logButton.isSelected()) {
                        addButton.setVisible(false);
                        subtractButton.setVisible(false);
                        multiplyButton.setVisible(false);
                        divideButton.setVisible(false);
                        radianButton.setVisible(false);
                        exponentialButton.setVisible(false);
                        percentButton.setVisible(false);
                        degreeButton.setVisible(false);
                        modButton.setVisible(false);
                        textField2.setVisible(false);
                        sinButton.setVisible(false);
                        cosButton.setVisible(false);
                        tanButton.setVisible(false);
                        cscButton.setVisible(false);
                        secButton.setVisible(false);
                        cotButton.setVisible(false);
                        invsinButton.setVisible(false);
                        invcosButton.setVisible(false);
                        invtanButton.setVisible(false);
                        sinhButton.setVisible(false);
                        coshButton.setVisible(false);
                        tanhButton.setVisible(false);
                        invsinhButton.setVisible(false);
                        invcoshButton.setVisible(false);
                        invtanhButton.setVisible(false);
                        //displaying button
                        logButtonFunc.setVisible(true);
                        Log10ButtonFunc.setVisible(true);
                        frame.repaint();

                        if (logButtonFunc.isSelected()){resultshort = (short) Math.log(num1);}
                        if(Log10ButtonFunc.isSelected()){resultshort = (short) Math.log10(num1);}


                    }
                    //Displaying results
                    long resultbinary = resultshort;

                    resultFeild.setText(Long.toBinaryString(resultbinary));
                    frame.repaint();

                }
                //
                else if (intButton.isSelected()) {
                    int resultInt = 0;
                    int num1 = Integer.parseInt(textField1.getText(), 2);
                    int num2 = Integer.parseInt(textField1.getText(), 2);

                    System.out.println("INT button pressed");//checking
                    arthematicButton.setVisible(true);
                    trigonometricButton.setVisible(true);
                    hyperbolicButton.setVisible(true);
                    logButton.setVisible(true);

                    if (arthematicButton.isSelected()) {
                        System.out.println("Arthematic+Iint");//checking

                        addButton.setVisible(true);
                        subtractButton.setVisible(true);
                        multiplyButton.setVisible(true);
                        divideButton.setVisible(true);
                        radianButton.setVisible(true);
                        exponentialButton.setVisible(true);
                        percentButton.setVisible(true);
                        degreeButton.setVisible(true);
                        modButton.setVisible(true);
                        //Hiding Buttons
                        sinButton.setVisible(false);
                        cosButton.setVisible(false);
                        tanButton.setVisible(false);
                        invsinButton.setVisible(false);
                        invcosButton.setVisible(false);
                        invtanButton.setVisible(false);
                        textField2.setVisible(true);
                        logButtonFunc.setVisible(false);
                        frame.repaint();

                        if (addButton.isSelected()) {resultInt = (num1 + num2);}
                        //
                        else if (subtractButton.isSelected()) {resultInt = (num1 - num2);}
                        //
                        else if (multiplyButton.isSelected()) {resultInt = (num1 * num2);}
                        //
                        else if (divideButton.isSelected()) {resultInt = (num1 / num2);}
                        //
                        else if (exponentialButton.isSelected()) {resultInt = (int) (Math.pow(num1, num2));}
                        //
                        else if (radianButton.isSelected()) {resultInt = (int) (num1 * Math.PI / 180);}
                        //
                        else if (degreeButton.isSelected()) {resultInt = (int) (num1 * 180 / Math.PI);}
                        //
                        else if (percentButton.isSelected()) {resultInt = (num1 * 100 / num2);}
                        //
                        else if (modButton.isSelected()) {resultInt = (num1 % num2);}
                    }
                    //
                    else if (trigonometricButton.isSelected()) {
                        System.out.println("Trigonometric");
                        textField2.setVisible(false);
                        sinButton.setVisible(true);
                        cosButton.setVisible(true);
                        tanButton.setVisible(true);
                        invsinButton.setVisible(true);
                        invcosButton.setVisible(true);
                        invtanButton.setVisible(true);
                        frame.repaint();
                        //Hiding other types
                        addButton.setVisible(false);
                        subtractButton.setVisible(false);
                        multiplyButton.setVisible(false);
                        divideButton.setVisible(false);
                        radianButton.setVisible(false);
                        exponentialButton.setVisible(false);
                        percentButton.setVisible(false);
                        degreeButton.setVisible(false);
                        modButton.setVisible(false);
                        sinhButton.setVisible(false);
                        coshButton.setVisible(false);
                        tanhButton.setVisible(false);
                        invsinhButton.setVisible(false);
                        invcoshButton.setVisible(false);
                        invtanhButton.setVisible(false);
                        logButtonFunc.setVisible(false);

                        textField2.setVisible(false);
                        frame.repaint();


                        double numrad = (num1 * Math.PI / 180);

                        if (sinButton.isSelected()) {
                            resultInt = (int) (Math.sin(numrad));
                        }
                        if (cosButton.isSelected()) {
                            resultInt = (int) (Math.cos(numrad));
                        }
                        if (tanButton.isSelected()) {
                            resultInt = (int) (Math.tan(numrad));
                        }
                        if (invsinButton.isSelected()) {
                            resultInt = (int) (Math.asin(numrad));
                        }
                        if (invcosButton.isSelected()) {
                            resultInt = (int) (Math.acos(numrad));
                        }
                        if (invtanButton.isSelected()) {
                            resultInt = (int) (Math.atan(numrad));
                        }
                        if (cscButton.isSelected()) {
                            resultInt = (int) (1 / Math.sin(numrad));
                        }
                        if (secButton.isSelected()) {
                            resultInt = (int) (1 / Math.cos(numrad));
                        }
                        if (cotButton.isSelected()) {
                            resultInt = (int) (1 / Math.tan(numrad));
                        }
                    }
                    //
                    else if (hyperbolicButton.isSelected()) {
                        //Displaying Buttons
                        sinhButton.setVisible(true);
                        coshButton.setVisible(true);
                        tanhButton.setVisible(true);
                        invsinhButton.setVisible(true);
                        invcoshButton.setVisible(true);
                        invtanhButton.setVisible(true);
                        //Hiding unnecessary Buttons and Fields
                        addButton.setVisible(false);
                        subtractButton.setVisible(false);
                        multiplyButton.setVisible(false);
                        divideButton.setVisible(false);
                        radianButton.setVisible(false);
                        exponentialButton.setVisible(false);
                        percentButton.setVisible(false);
                        degreeButton.setVisible(false);
                        modButton.setVisible(false);
                        textField2.setVisible(false);
                        sinButton.setVisible(false);
                        cosButton.setVisible(false);
                        tanButton.setVisible(false);
                        cscButton.setVisible(false);
                        secButton.setVisible(false);
                        cotButton.setVisible(false);
                        invsinButton.setVisible(false);
                        invcosButton.setVisible(false);
                        invtanButton.setVisible(false);
                        logButtonFunc.setVisible(false);
                        frame.repaint();


                        if (sinhButton.isSelected()) {
                            resultInt = (int) (Math.sinh(num1));
                        }
                        if (coshButton.isSelected()) {
                            resultInt = (int) (Math.cosh(num1));
                        }
                        if (tanhButton.isSelected()) {
                            resultInt = (int) (Math.tanh(num1));
                        }
                        if (invsinhButton.isSelected()) {
                            resultInt = (int) (Math.log(num1 + Math.sqrt(1 + num1 * num1)));
                        }
                        if (invcoshButton.isSelected()) {
                            resultInt = (int) (Math.log(num1+ Math.sqrt(num1 + 1) * Math.sqrt(num1 - 1)));
                        }
                        if (invtanhButton.isSelected()) {
                            resultInt = (int) ((Math.log(1 + num1) - Math.log(1 - num1)) / 2);
                        }

                    }
                    //
                    else if (logButton.isSelected()) {
                        addButton.setVisible(false);
                        subtractButton.setVisible(false);
                        multiplyButton.setVisible(false);
                        divideButton.setVisible(false);
                        radianButton.setVisible(false);
                        exponentialButton.setVisible(false);
                        percentButton.setVisible(false);
                        degreeButton.setVisible(false);
                        modButton.setVisible(false);
                        textField2.setVisible(false);
                        sinButton.setVisible(false);
                        cosButton.setVisible(false);
                        tanButton.setVisible(false);
                        cscButton.setVisible(false);
                        secButton.setVisible(false);
                        cotButton.setVisible(false);
                        invsinButton.setVisible(false);
                        invcosButton.setVisible(false);
                        invtanButton.setVisible(false);
                        sinhButton.setVisible(false);
                        coshButton.setVisible(false);
                        tanhButton.setVisible(false);
                        invsinhButton.setVisible(false);
                        invcoshButton.setVisible(false);
                        invtanhButton.setVisible(false);
                        //displaying button
                        logButtonFunc.setVisible(true);
                        Log10ButtonFunc.setVisible(true);
                        frame.repaint();

                        if (logButtonFunc.isSelected()){resultInt = (int) Math.log(num1);}
                        if(Log10ButtonFunc.isSelected()){resultInt = (int) Math.log10(num1);}


                    }

                    long resultBinary = resultInt;

                    resultFeild.setText(Long.toBinaryString(resultBinary));

                }
                //
                else if (longButton.isSelected()) {
                    System.out.println("long"); //checking
                    long resultlong = 0;
                    long num1 = Long.parseLong(textField1.getText(), 2);
                    long num2 = Long.parseLong(textField1.getText(), 2);
                    arthematicButton.setVisible(true);
                    trigonometricButton.setVisible(true);
                    hyperbolicButton.setVisible(true);
                    logButton.setVisible(true);
                    //hiding buttons
                    sinButton.setVisible(false);
                    cosButton.setVisible(false);
                    tanButton.setVisible(false);
                    invsinButton.setVisible(false);
                    invcosButton.setVisible(false);
                    invtanButton.setVisible(false);
                    frame.repaint();

                    if (arthematicButton.isSelected()) {

                        addButton.setVisible(true);
                        subtractButton.setVisible(true);
                        multiplyButton.setVisible(true);
                        divideButton.setVisible(true);
                        radianButton.setVisible(true);
                        exponentialButton.setVisible(true);
                        percentButton.setVisible(true);
                        degreeButton.setVisible(true);
                        modButton.setVisible(true);
                        textField2.setVisible(true);
                        //Hiding
                        sinButton.setVisible(false);
                        cosButton.setVisible(false);
                        tanButton.setVisible(false);
                        invsinButton.setVisible(false);
                        invcosButton.setVisible(false);
                        invtanButton.setVisible(false);
                        sinhButton.setVisible(false);
                        coshButton.setVisible(false);
                        tanhButton.setVisible(false);
                        invsinhButton.setVisible(false);
                        invcoshButton.setVisible(false);
                        invtanhButton.setVisible(false);
                        logButtonFunc.setVisible(false);

                        frame.repaint();

                        System.out.println("long +arthematic");//checking

                        if (addButton.isSelected()) {resultlong = (num1 + num2);}
                        //
                        else if (subtractButton.isSelected()) {resultlong =  (num1 - num2);}
                        //
                        else if (multiplyButton.isSelected()) {resultlong =  (num1 * num2);}
                        //
                        else if (divideButton.isSelected()) {resultlong =  (num1 / num2);}
                        //
                        else if (exponentialButton.isSelected()) {resultlong = (long) (Math.pow(num1, num2));}
                        //
                        else if (radianButton.isSelected()) {resultlong = (long) (num1 * Math.PI / 180);}
                        //
                        else if (degreeButton.isSelected()) {resultlong = (long) (num1 * 180 / Math.PI);}
                        //
                        else if (percentButton.isSelected()) {resultlong =  (num1 * 100 / num2);}
                        //
                        else if (modButton.isSelected()) {resultlong = (num1 % num2);}}
                    //
                    else if (trigonometricButton.isSelected()) {
                        System.out.println("Trigonometric");
                        textField2.setVisible(false);
                        sinButton.setVisible(true);
                        cosButton.setVisible(true);
                        tanButton.setVisible(true);
                        invsinButton.setVisible(true);
                        invcosButton.setVisible(true);
                        invtanButton.setVisible(true);
                        frame.repaint();
                        //Hiding other types
                        addButton.setVisible(false);
                        subtractButton.setVisible(false);
                        multiplyButton.setVisible(false);
                        divideButton.setVisible(false);
                        radianButton.setVisible(false);
                        exponentialButton.setVisible(false);
                        percentButton.setVisible(false);
                        degreeButton.setVisible(false);
                        modButton.setVisible(false);
                        sinhButton.setVisible(false);
                        coshButton.setVisible(false);
                        tanhButton.setVisible(false);
                        invsinhButton.setVisible(false);
                        invcoshButton.setVisible(false);
                        invtanhButton.setVisible(false);
                        logButtonFunc.setVisible(false);

                        textField2.setVisible(false);
                        frame.repaint();

                        double numrad = (num1 * Math.PI / 180);
                        if (sinButton.isSelected()) {
                            resultlong = (long) (Math.sin(numrad));
                        }
                        if (cosButton.isSelected()) {
                            resultlong = (long) (Math.cos(numrad));
                        }
                        if (tanButton.isSelected()) {
                            resultlong = (long) (Math.tan(numrad));
                        }
                        if (invsinButton.isSelected()) {
                            resultlong = (long) (Math.asin(numrad));
                        }
                        if (invcosButton.isSelected()) {
                            resultlong = (long) (Math.acos(numrad));
                        }
                        if (invtanButton.isSelected()) {
                            resultlong = (long) (Math.atan(numrad));
                        }
                    }
                    //
                    else if (hyperbolicButton.isSelected()) {
                        //Displaying Buttons
                        sinhButton.setVisible(true);
                        coshButton.setVisible(true);
                        tanhButton.setVisible(true);
                        invsinhButton.setVisible(true);
                        invcoshButton.setVisible(true);
                        invtanhButton.setVisible(true);
                        //Hiding unnecessary Buttons and Fields
                        addButton.setVisible(false);
                        subtractButton.setVisible(false);
                        multiplyButton.setVisible(false);
                        divideButton.setVisible(false);
                        radianButton.setVisible(false);
                        exponentialButton.setVisible(false);
                        percentButton.setVisible(false);
                        degreeButton.setVisible(false);
                        modButton.setVisible(false);
                        textField2.setVisible(false);
                        sinButton.setVisible(false);
                        cosButton.setVisible(false);
                        tanButton.setVisible(false);
                        cscButton.setVisible(false);
                        secButton.setVisible(false);
                        cotButton.setVisible(false);
                        invsinButton.setVisible(false);
                        invcosButton.setVisible(false);
                        invtanButton.setVisible(false);
                        logButtonFunc.setVisible(false);
                        frame.repaint();


                        if (sinhButton.isSelected()) {
                            resultlong = (long) (Math.sinh(num1));
                        }
                        if (coshButton.isSelected()) {
                            resultlong = (long) (Math.cosh(num1));
                        }
                        if (tanhButton.isSelected()) {
                            resultlong = (long) (Math.tanh(num1));
                        }
                        if (invsinhButton.isSelected()) {
                            resultlong = (long) (Math.log(num1 + Math.sqrt(1 + num1 * num1)));
                        }
                        if (invcoshButton.isSelected()) {
                            resultlong = (long) (Math.log(num1 + Math.sqrt(num1 + 1) * Math.sqrt(num1 - 1)));
                        }
                        if (invtanhButton.isSelected()) {
                            resultlong = (long) ((Math.log(1 + num1) - Math.log(1 - num1)) / 2);
                        }

                    }
                    //
                    else if (logButton.isSelected()) {
                        addButton.setVisible(false);
                        subtractButton.setVisible(false);
                        multiplyButton.setVisible(false);
                        divideButton.setVisible(false);
                        radianButton.setVisible(false);
                        exponentialButton.setVisible(false);
                        percentButton.setVisible(false);
                        degreeButton.setVisible(false);
                        modButton.setVisible(false);
                        textField2.setVisible(false);
                        sinButton.setVisible(false);
                        cosButton.setVisible(false);
                        tanButton.setVisible(false);
                        cscButton.setVisible(false);
                        secButton.setVisible(false);
                        cotButton.setVisible(false);
                        invsinButton.setVisible(false);
                        invcosButton.setVisible(false);
                        invtanButton.setVisible(false);
                        sinhButton.setVisible(false);
                        coshButton.setVisible(false);
                        tanhButton.setVisible(false);
                        invsinhButton.setVisible(false);
                        invcoshButton.setVisible(false);
                        invtanhButton.setVisible(false);
                        //displaying button
                        logButtonFunc.setVisible(true);
                        Log10ButtonFunc.setVisible(true);
                        frame.repaint();

                        if (logButtonFunc.isSelected()){resultlong = (long) Math.log(num1);}
                        if(Log10ButtonFunc.isSelected()){resultlong = (long) Math.log10(num1);}


                    }

                    resultFeild.setText(Long.toBinaryString(resultlong));
                    frame.repaint();

                }

            }

            //If OCTAL TYPE Is selected
            else if (octalButton.isSelected()) {

                //DISPLAYING the possible data types
                byteButton.setVisible(true);
                shortButton.setVisible(true);
                intButton.setVisible(true);
                longButton.setVisible(false);
                doubleButton.setVisible(false);
                floatButton.setVisible(false);
                frame.repaint();

                //Mode type selection
                if (byteButton.isSelected()) {

                    byte resultbyte = 0;

                    byte num1 = Byte.parseByte(textField1.getText(), 8);
                    byte num2 = Byte.parseByte(textField2.getText(), 8);

                    System.out.println("Byte button pressed");
                    arthematicButton.setVisible(true);
                    trigonometricButton.setVisible(true);
                    hyperbolicButton.setVisible(true);
                    logButton.setVisible(true);

                    if (arthematicButton.isSelected()) {
                        System.out.println("Arthematic+Byte");

                        addButton.setVisible(true);
                        subtractButton.setVisible(true);
                        multiplyButton.setVisible(true);
                        divideButton.setVisible(true);
                        radianButton.setVisible(true);
                        exponentialButton.setVisible(true);
                        percentButton.setVisible(true);
                        degreeButton.setVisible(true);
                        modButton.setVisible(true);
                        textField2.setVisible(true);
                        //Hiding other types
                        Log10ButtonFunc.setVisible(false);
                        sinButton.setVisible(false);
                        cosButton.setVisible(false);
                        tanButton.setVisible(false);
                        cscButton.setVisible(false);
                        secButton.setVisible(false);
                        cotButton.setVisible(false);
                        invsinButton.setVisible(false);
                        invcosButton.setVisible(false);
                        invtanButton.setVisible(false);
                        sinhButton.setVisible(false);
                        coshButton.setVisible(false);
                        tanhButton.setVisible(false);
                        invsinhButton.setVisible(false);
                        invcoshButton.setVisible(false);
                        invtanhButton.setVisible(false);
                        logButtonFunc.setVisible(false);

                        frame.repaint();

                        if (addButton.isSelected()) {resultbyte = (byte) (num1 + num2);}
                        //
                        else if (subtractButton.isSelected()) {resultbyte = (byte) (num1 - num2);}
                        //
                        else if (multiplyButton.isSelected()) {resultbyte = (byte) (num1 * num2);}
                        //
                        else if (divideButton.isSelected()) {resultbyte = (byte) (num1 / num2);}
                        //
                        else if (exponentialButton.isSelected()) {resultbyte = (byte) (Math.pow(num1, num2));}
                        //
                        else if (radianButton.isSelected()) {
                            textField2.setVisible(false);
                            resultbyte = (byte) (num1 * Math.PI / 180);}
                        //
                        else if (degreeButton.isSelected()) {
                            textField2.setVisible(false);
                            resultbyte = (byte) (num1 * 180 / Math.PI);}
                        //
                        else if (percentButton.isSelected()) {resultbyte = (byte) (num1 * 100 / num2);}
                        //
                        else if (modButton.isSelected()) {resultbyte = (byte) (num1 % num2);}

                    }
                    //
                    else if (trigonometricButton.isSelected()) {
                        System.out.println("Trigonometric");
                        sinButton.setVisible(true);
                        cosButton.setVisible(true);
                        tanButton.setVisible(true);
                        cscButton.setVisible(true);
                        secButton.setVisible(true);
                        cotButton.setVisible(true);
                        invsinButton.setVisible(true);
                        invcosButton.setVisible(true);
                        invtanButton.setVisible(true);
                        frame.repaint();
                        //Hiding other types
                        addButton.setVisible(false);
                        subtractButton.setVisible(false);
                        multiplyButton.setVisible(false);
                        divideButton.setVisible(false);
                        radianButton.setVisible(false);
                        exponentialButton.setVisible(false);
                        percentButton.setVisible(false);
                        degreeButton.setVisible(false);
                        modButton.setVisible(false);
                        textField2.setVisible(false);
                        sinhButton.setVisible(false);
                        coshButton.setVisible(false);
                        tanhButton.setVisible(false);
                        invsinhButton.setVisible(false);
                        invcoshButton.setVisible(false);
                        invtanhButton.setVisible(false);
                        logButtonFunc.setVisible(false);
                        Log10ButtonFunc.setVisible(false);
                        frame.repaint();

                        double numrad = (num1 * Math.PI / 180);

                        if (sinButton.isSelected()) {
                            resultbyte = (byte) (Math.sin(numrad));
                        }
                        if (cosButton.isSelected()) {
                            resultbyte = (byte) (Math.cos(numrad));
                        }
                        if (tanButton.isSelected()) {
                            resultbyte = (byte) (Math.tan(numrad));
                        }
                        if (invsinButton.isSelected()) {
                            resultbyte = (byte) (Math.asin(numrad));
                        }
                        if (invcosButton.isSelected()) {
                            resultbyte = (byte) (Math.acos(numrad));
                        }
                        if (invtanButton.isSelected()) {
                            resultbyte = (byte) (Math.atan(numrad));
                        }
                        if (cscButton.isSelected()) {
                            resultbyte = (byte) (1 / Math.sin(numrad));
                        }
                        if (secButton.isSelected()) {
                            resultbyte = (byte) (1 / Math.cos(numrad));
                        }
                        if (cotButton.isSelected()) {
                            resultbyte = (byte) (1 / Math.tan(numrad));
                        }
                    }
                    //
                    else if (hyperbolicButton.isSelected()) {
                        //Displaying Buttons
                        sinhButton.setVisible(true);
                        coshButton.setVisible(true);
                        tanhButton.setVisible(true);
                        invsinhButton.setVisible(true);
                        invcoshButton.setVisible(true);
                        invtanhButton.setVisible(true);
                        //Hiding unnecessary Buttons and Fields
                        addButton.setVisible(false);
                        Log10ButtonFunc.setVisible(false);
                        subtractButton.setVisible(false);
                        multiplyButton.setVisible(false);
                        divideButton.setVisible(false);
                        radianButton.setVisible(false);
                        exponentialButton.setVisible(false);
                        percentButton.setVisible(false);
                        degreeButton.setVisible(false);
                        modButton.setVisible(false);
                        textField2.setVisible(false);
                        sinButton.setVisible(false);
                        cosButton.setVisible(false);
                        tanButton.setVisible(false);
                        cscButton.setVisible(false);
                        secButton.setVisible(false);
                        cotButton.setVisible(false);
                        invsinButton.setVisible(false);
                        invcosButton.setVisible(false);
                        invtanButton.setVisible(false);
                        logButtonFunc.setVisible(false);
                        frame.repaint();


                        if (sinhButton.isSelected()) {
                            resultbyte = (byte) (Math.sinh(num1));
                        }
                        if (coshButton.isSelected()) {
                            resultbyte = (byte) (Math.cosh(num1));
                        }
                        if (tanhButton.isSelected()) {
                            resultbyte = (byte) (Math.tanh(num1));
                        }
                        if (invsinhButton.isSelected()) {
                            resultbyte = (byte) (Math.log(num1 + Math.sqrt(1 + num1 * num1)));
                        }
                        if (invcoshButton.isSelected()) {
                            resultbyte = (byte) (Math.log(num1+ Math.sqrt(num1 + 1) * Math.sqrt(num1 - 1)));
                        }
                        if (invtanhButton.isSelected()) {
                            resultbyte = (byte) ((Math.log(1 + num1) - Math.log(1 - num1)) / 2);
                        }

                    }
                    //
                    else if (logButton.isSelected()) {
                        addButton.setVisible(false);
                        subtractButton.setVisible(false);
                        multiplyButton.setVisible(false);
                        divideButton.setVisible(false);
                        radianButton.setVisible(false);
                        exponentialButton.setVisible(false);
                        percentButton.setVisible(false);
                        degreeButton.setVisible(false);
                        modButton.setVisible(false);
                        textField2.setVisible(false);
                        sinButton.setVisible(false);
                        cosButton.setVisible(false);
                        tanButton.setVisible(false);
                        cscButton.setVisible(false);
                        secButton.setVisible(false);
                        cotButton.setVisible(false);
                        invsinButton.setVisible(false);
                        invcosButton.setVisible(false);
                        invtanButton.setVisible(false);
                        sinhButton.setVisible(false);
                        coshButton.setVisible(false);
                        tanhButton.setVisible(false);
                        invsinhButton.setVisible(false);
                        invcoshButton.setVisible(false);
                        invtanhButton.setVisible(false);
                        //displaying button
                        logButtonFunc.setVisible(true);
                        Log10ButtonFunc.setVisible(true);
                        frame.repaint();

                        if (logButtonFunc.isSelected()){resultbyte = (byte) Math.log(num1);}
                        if(Log10ButtonFunc.isSelected()){resultbyte = (byte) Math.log10(num1);}


                    }
                    //Displaying results

                    long resultoctal = resultbyte;
                    resultFeild.setText(Long.toOctalString(resultoctal));

                    frame.repaint();

                }
                //
                else if (shortButton.isSelected()) {
                    short resultshort = 0;

                    short num1 = Short.parseShort(textField1.getText(), 8);
                    short num2 = Short.parseShort(textField2.getText(), 8);
                    System.out.println("Byte button pressed");

                    arthematicButton.setVisible(true);
                    trigonometricButton.setVisible(true);
                    hyperbolicButton.setVisible(true);
                    logButton.setVisible(true);

                    if (arthematicButton.isSelected()) {
                        System.out.println("Arthematic+Short");

                        addButton.setVisible(true);
                        subtractButton.setVisible(true);
                        multiplyButton.setVisible(true);
                        divideButton.setVisible(true);
                        radianButton.setVisible(true);
                        exponentialButton.setVisible(true);
                        percentButton.setVisible(true);
                        degreeButton.setVisible(true);
                        modButton.setVisible(true);
                        textField2.setVisible(true);
                        //Hiding
                        sinButton.setVisible(false);
                        cosButton.setVisible(false);
                        tanButton.setVisible(false);
                        invsinButton.setVisible(false);
                        invcosButton.setVisible(false);
                        invtanButton.setVisible(false);
                        sinhButton.setVisible(false);
                        coshButton.setVisible(false);
                        tanhButton.setVisible(false);
                        invsinhButton.setVisible(false);
                        invcoshButton.setVisible(false);
                        invtanhButton.setVisible(false);
                        logButtonFunc.setVisible(false);

                        frame.repaint();

                        if (addButton.isSelected()) {
                            resultshort = (short) (num1 + num2);
                        } else if (subtractButton.isSelected()) {
                            resultshort = (short) (num1 - num2);
                        } else if (multiplyButton.isSelected()) {
                            resultshort = (short) (num1 * num2);
                        } else if (divideButton.isSelected()) {
                            resultshort = (short) (num1 / num2);
                        } else if (exponentialButton.isSelected()) {
                            resultshort = (short) (Math.pow(num1, num2));
                        } else if (radianButton.isSelected()) {
                            textField2.setVisible(false);
                            resultshort = (short) (num1 * Math.PI / 180);
                        } else if (degreeButton.isSelected()) {
                            textField2.setVisible(false);
                            resultshort = (short) (num1 * 180 / Math.PI);
                        } else if (percentButton.isSelected()) {
                            resultshort = (short) (num1 * 100 / num2);
                        } else if (modButton.isSelected()) {
                            resultshort = (short) (num1 % num2);
                        }


                    }
                    //
                    else if (trigonometricButton.isSelected()) {
                        System.out.println("Trigonometric");
                        textField2.setVisible(false);
                        sinButton.setVisible(true);
                        cosButton.setVisible(true);
                        tanButton.setVisible(true);
                        invsinButton.setVisible(true);
                        invcosButton.setVisible(true);
                        invtanButton.setVisible(true);
                        frame.repaint();
                        //Hiding other types
                        addButton.setVisible(false);
                        subtractButton.setVisible(false);
                        multiplyButton.setVisible(false);
                        divideButton.setVisible(false);
                        radianButton.setVisible(false);
                        exponentialButton.setVisible(false);
                        percentButton.setVisible(false);
                        degreeButton.setVisible(false);
                        modButton.setVisible(false);
                        sinhButton.setVisible(false);
                        coshButton.setVisible(false);
                        tanhButton.setVisible(false);
                        invsinhButton.setVisible(false);
                        invcoshButton.setVisible(false);
                        invtanhButton.setVisible(false);
                        logButtonFunc.setVisible(false);

                        textField2.setVisible(false);
                        frame.repaint();

                        double numrad = (num1 * Math.PI / 180);

                        if (sinButton.isSelected()) {
                            resultshort = (short) (Math.sin(numrad));
                        }
                        if (cosButton.isSelected()) {
                            resultshort = (short) (Math.cos(numrad));
                        }
                        if (tanButton.isSelected()) {
                            resultshort = (short) (Math.tan(numrad));
                        }
                        if (invsinButton.isSelected()) {
                            resultshort = (short) (Math.asin(numrad));
                        }
                        if (invcosButton.isSelected()) {
                            resultshort = (short) (Math.acos(numrad));
                        }
                        if (invtanButton.isSelected()) {
                            resultshort = (short) (Math.atan(numrad));
                        }
                        if (cscButton.isSelected()) {
                            resultshort = (short) (1 / Math.sin(numrad));
                        }
                        if (secButton.isSelected()) {
                            resultshort = (short) (1 / Math.cos(numrad));
                        }
                        if (cotButton.isSelected()) {
                            resultshort = (short) (1 / Math.tan(numrad));
                        }
                    }
                    //
                    else if (hyperbolicButton.isSelected()) {
                        //Displaying Buttons
                        sinhButton.setVisible(true);
                        coshButton.setVisible(true);
                        tanhButton.setVisible(true);
                        invsinhButton.setVisible(true);
                        invcoshButton.setVisible(true);
                        invtanhButton.setVisible(true);
                        //Hiding unnecessary Buttons and Fields
                        addButton.setVisible(false);
                        subtractButton.setVisible(false);
                        multiplyButton.setVisible(false);
                        divideButton.setVisible(false);
                        radianButton.setVisible(false);
                        exponentialButton.setVisible(false);
                        percentButton.setVisible(false);
                        degreeButton.setVisible(false);
                        modButton.setVisible(false);
                        textField2.setVisible(false);
                        sinButton.setVisible(false);
                        cosButton.setVisible(false);
                        tanButton.setVisible(false);
                        cscButton.setVisible(false);
                        secButton.setVisible(false);
                        cotButton.setVisible(false);
                        invsinButton.setVisible(false);
                        invcosButton.setVisible(false);
                        invtanButton.setVisible(false);
                        logButtonFunc.setVisible(false);
                        frame.repaint();


                        if (sinhButton.isSelected()) {
                            resultshort = (short) (Math.sinh(num1));
                        }
                        if (coshButton.isSelected()) {
                            resultshort = (short) (Math.cosh(num1));
                        }
                        if (tanhButton.isSelected()) {
                            resultshort = (short) (Math.tanh(num1));
                        }
                        if (invsinhButton.isSelected()) {
                            resultshort = (short) (Math.log(num1 + Math.sqrt(1 + num1 * num1)));
                        }
                        if (invcoshButton.isSelected()) {
                            resultshort = (short) Math.log(num1 + Math.sqrt(num1 + 1) * Math.sqrt(num1 - 1));
                        }
                        if (invtanhButton.isSelected()) {
                            resultshort = (short) ((Math.log(1 + num1) - Math.log(1 - num1)) / 2);
                        }

                    }
                    //
                    else if (logButton.isSelected()) {
                        addButton.setVisible(false);
                        subtractButton.setVisible(false);
                        multiplyButton.setVisible(false);
                        divideButton.setVisible(false);
                        radianButton.setVisible(false);
                        exponentialButton.setVisible(false);
                        percentButton.setVisible(false);
                        degreeButton.setVisible(false);
                        modButton.setVisible(false);
                        textField2.setVisible(false);
                        sinButton.setVisible(false);
                        cosButton.setVisible(false);
                        tanButton.setVisible(false);
                        cscButton.setVisible(false);
                        secButton.setVisible(false);
                        cotButton.setVisible(false);
                        invsinButton.setVisible(false);
                        invcosButton.setVisible(false);
                        invtanButton.setVisible(false);
                        sinhButton.setVisible(false);
                        coshButton.setVisible(false);
                        tanhButton.setVisible(false);
                        invsinhButton.setVisible(false);
                        invcoshButton.setVisible(false);
                        invtanhButton.setVisible(false);
                        //displaying button
                        logButtonFunc.setVisible(true);
                        frame.repaint();

                        resultshort = (short) Math.log(num1);
                    }

                    int resultoctal = resultshort;
                    resultFeild.setText(Integer.toOctalString(resultoctal));


                }
                //
                else if (intButton.isSelected()) {
                    int resultInt = 0;
                    int num1 = Integer.parseInt(textField1.getText(), 8);
                    int num2 = Integer.parseInt(textField2.getText(), 8);

                    System.out.println("INT button pressed");//checking
                    arthematicButton.setVisible(true);
                    trigonometricButton.setVisible(true);
                    hyperbolicButton.setVisible(true);
                    logButton.setVisible(true);

                    if (arthematicButton.isSelected()) {
                        System.out.println("Arthematic+Iint");//checking

                        addButton.setVisible(true);
                        subtractButton.setVisible(true);
                        multiplyButton.setVisible(true);
                        divideButton.setVisible(true);
                        radianButton.setVisible(true);
                        exponentialButton.setVisible(true);
                        percentButton.setVisible(true);
                        degreeButton.setVisible(true);
                        modButton.setVisible(true);
                        //Hiding Buttons
                        sinButton.setVisible(false);
                        cosButton.setVisible(false);
                        tanButton.setVisible(false);
                        invsinButton.setVisible(false);
                        invcosButton.setVisible(false);
                        invtanButton.setVisible(false);
                        textField2.setVisible(true);
                        logButtonFunc.setVisible(false);
                        frame.repaint();

                        if (addButton.isSelected()) {resultInt = (num1 + num2);}
                        //
                        else if (subtractButton.isSelected()) {resultInt = (num1 - num2);}
                        //
                        else if (multiplyButton.isSelected()) {resultInt = (num1 * num2);}
                        //
                        else if (divideButton.isSelected()) {resultInt =  (num1 / num2);}
                        //
                        else if (exponentialButton.isSelected()) {resultInt = (int) (Math.pow(num1, num2));}
                        //
                        else if (radianButton.isSelected()) {
                            textField2.setVisible(false);
                            resultInt = (int) (num1 * Math.PI / 180);}
                        //
                        else if (degreeButton.isSelected()) {
                            textField2.setVisible(false);
                            resultInt = (int) (num1 * 180 / Math.PI);}
                        //
                        else if (percentButton.isSelected()) {resultInt = (num1 * 100 / num2);}
                        //
                        else if (modButton.isSelected()) {resultInt = (num1 % num2);}
                    }
                    //
                    else if (trigonometricButton.isSelected()) {
                        System.out.println("Trigonometric");
                        textField2.setVisible(false);
                        sinButton.setVisible(true);
                        cosButton.setVisible(true);
                        tanButton.setVisible(true);
                        invsinButton.setVisible(true);
                        invcosButton.setVisible(true);
                        invtanButton.setVisible(true);
                        frame.repaint();
                        //Hiding other types
                        addButton.setVisible(false);
                        subtractButton.setVisible(false);
                        multiplyButton.setVisible(false);
                        divideButton.setVisible(false);
                        radianButton.setVisible(false);
                        exponentialButton.setVisible(false);
                        percentButton.setVisible(false);
                        degreeButton.setVisible(false);
                        modButton.setVisible(false);
                        sinhButton.setVisible(false);
                        coshButton.setVisible(false);
                        tanhButton.setVisible(false);
                        invsinhButton.setVisible(false);
                        invcoshButton.setVisible(false);
                        invtanhButton.setVisible(false);
                        logButtonFunc.setVisible(false);

                        textField2.setVisible(false);
                        frame.repaint();


                        double numrad = (num1 * Math.PI / 180);

                        if (sinButton.isSelected()) {
                            resultInt = (int) (Math.sin(numrad));
                        }
                        if (cosButton.isSelected()) {
                            resultInt = (int) (Math.cos(numrad));
                        }
                        if (tanButton.isSelected()) {
                            resultInt = (int) (Math.tan(numrad));
                        }
                        if (invsinButton.isSelected()) {
                            resultInt = (int) (Math.asin(numrad));
                        }
                        if (invcosButton.isSelected()) {
                            resultInt = (int) (Math.acos(numrad));
                        }
                        if (invtanButton.isSelected()) {
                            resultInt = (int) (Math.atan(numrad));
                        }
                        if (cscButton.isSelected()) {
                            resultInt = (int) (1 / Math.sin(numrad));
                        }
                        if (secButton.isSelected()) {
                            resultInt = (int) (1 / Math.cos(numrad));
                        }
                        if (cotButton.isSelected()) {
                            resultInt = (int) (1 / Math.tan(numrad));
                        }
                    }
                    //
                    else if (hyperbolicButton.isSelected()) {
                        //Displaying Buttons
                        sinhButton.setVisible(true);
                        coshButton.setVisible(true);
                        tanhButton.setVisible(true);
                        invsinhButton.setVisible(true);
                        invcoshButton.setVisible(true);
                        invtanhButton.setVisible(true);
                        //Hiding unnecessary Buttons and Fields
                        addButton.setVisible(false);
                        subtractButton.setVisible(false);
                        multiplyButton.setVisible(false);
                        divideButton.setVisible(false);
                        radianButton.setVisible(false);
                        exponentialButton.setVisible(false);
                        percentButton.setVisible(false);
                        degreeButton.setVisible(false);
                        modButton.setVisible(false);
                        textField2.setVisible(false);
                        sinButton.setVisible(false);
                        cosButton.setVisible(false);
                        tanButton.setVisible(false);
                        cscButton.setVisible(false);
                        secButton.setVisible(false);
                        cotButton.setVisible(false);
                        invsinButton.setVisible(false);
                        invcosButton.setVisible(false);
                        invtanButton.setVisible(false);
                        logButtonFunc.setVisible(false);
                        frame.repaint();


                        if (sinhButton.isSelected()) {
                            resultInt = (int) (Math.sinh(num1));
                        }
                        if (coshButton.isSelected()) {
                            resultInt = (int) (Math.cosh(num1));
                        }
                        if (tanhButton.isSelected()) {
                            resultInt = (int) (Math.tanh(num1));
                        }
                        if (invsinhButton.isSelected()) {
                            resultInt = (int) (Math.log(num1 + Math.sqrt(1 + num1 * num1)));
                        }
                        if (invcoshButton.isSelected()) {
                            resultInt = (int) (Math.log(num1 + Math.sqrt(num1 + 1) * Math.sqrt(num1 - 1)));
                        }
                        if (invtanhButton.isSelected()) {
                            resultInt = (int) ((Math.log(1 + num1) - Math.log(1 - num1)) / 2);
                        }
                    }
                    //
                    else if (logButton.isSelected()) {
                        addButton.setVisible(false);
                        subtractButton.setVisible(false);
                        multiplyButton.setVisible(false);
                        divideButton.setVisible(false);
                        radianButton.setVisible(false);
                        exponentialButton.setVisible(false);
                        percentButton.setVisible(false);
                        degreeButton.setVisible(false);
                        modButton.setVisible(false);
                        textField2.setVisible(false);
                        sinButton.setVisible(false);
                        cosButton.setVisible(false);
                        tanButton.setVisible(false);
                        cscButton.setVisible(false);
                        secButton.setVisible(false);
                        cotButton.setVisible(false);
                        invsinButton.setVisible(false);
                        invcosButton.setVisible(false);
                        invtanButton.setVisible(false);
                        sinhButton.setVisible(false);
                        coshButton.setVisible(false);
                        tanhButton.setVisible(false);
                        invsinhButton.setVisible(false);
                        invcoshButton.setVisible(false);
                        invtanhButton.setVisible(false);
                        //displaying button
                        logButtonFunc.setVisible(true);
                        frame.repaint();

                        resultInt = (int) Math.log(num1);
                    }

                    resultFeild.setText(Integer.toOctalString(resultInt));

                }
                //
                else if (longButton.isSelected()) {
                    System.out.println("long"); //checking
                    long resultlong = 0;
                    long num1 = Long.parseLong(textField1.getText(), 8);
                    long num2 = Long.parseLong(textField2.getText(), 8);

                    arthematicButton.setVisible(true);
                    trigonometricButton.setVisible(true);
                    hyperbolicButton.setVisible(true);
                    logButton.setVisible(true);
                    //hiding buttons
                    sinButton.setVisible(false);
                    cosButton.setVisible(false);
                    tanButton.setVisible(false);
                    invsinButton.setVisible(false);
                    invcosButton.setVisible(false);
                    invtanButton.setVisible(false);
                    frame.repaint();

                    if (arthematicButton.isSelected()) {

                        addButton.setVisible(true);
                        subtractButton.setVisible(true);
                        multiplyButton.setVisible(true);
                        divideButton.setVisible(true);
                        radianButton.setVisible(true);
                        exponentialButton.setVisible(true);
                        percentButton.setVisible(true);
                        degreeButton.setVisible(true);
                        modButton.setVisible(true);
                        textField2.setVisible(true);
                        //Hiding
                        sinButton.setVisible(false);
                        cosButton.setVisible(false);
                        tanButton.setVisible(false);
                        invsinButton.setVisible(false);
                        invcosButton.setVisible(false);
                        invtanButton.setVisible(false);
                        sinhButton.setVisible(false);
                        coshButton.setVisible(false);
                        tanhButton.setVisible(false);
                        invsinhButton.setVisible(false);
                        invcoshButton.setVisible(false);
                        invtanhButton.setVisible(false);
                        logButtonFunc.setVisible(false);

                        frame.repaint();

                        System.out.println("long +arthematic");//checking

                        if (addButton.isSelected()) {resultlong = (num1 + num2);}

                        else if (subtractButton.isSelected()) {resultlong =  (num1 - num2);}
                        //
                        else if (multiplyButton.isSelected()) {resultlong =  (num1 * num2);}
                        //
                        else if (divideButton.isSelected()) {resultlong =  (num1 / num2);}
                        //
                        else if (exponentialButton.isSelected()) {resultlong = (long) (Math.pow(num1, num2));}
                        //
                        else if (radianButton.isSelected()) {
                            textField2.setVisible(false);
                            resultlong = (long) (num1 * Math.PI / 180);}
                        //
                        else if (degreeButton.isSelected()) {
                            textField2.setVisible(false);
                            resultlong = (long) (num1 * 180 / Math.PI);}
                        //
                        else if (percentButton.isSelected()) {resultlong =  (num1 * 100 / num2);}
                        //
                        else if (modButton.isSelected()) {
                            resultlong =  (num1 % num2);
                        }
                    }
                    //
                    else if (trigonometricButton.isSelected()) {
                        System.out.println("Trigonometric");
                        textField2.setVisible(false);
                        sinButton.setVisible(true);
                        cosButton.setVisible(true);
                        tanButton.setVisible(true);
                        invsinButton.setVisible(true);
                        invcosButton.setVisible(true);
                        invtanButton.setVisible(true);
                        frame.repaint();
                        //Hiding other types
                        addButton.setVisible(false);
                        subtractButton.setVisible(false);
                        multiplyButton.setVisible(false);
                        divideButton.setVisible(false);
                        radianButton.setVisible(false);
                        exponentialButton.setVisible(false);
                        percentButton.setVisible(false);
                        degreeButton.setVisible(false);
                        modButton.setVisible(false);
                        sinhButton.setVisible(false);
                        coshButton.setVisible(false);
                        tanhButton.setVisible(false);
                        invsinhButton.setVisible(false);
                        invcoshButton.setVisible(false);
                        invtanhButton.setVisible(false);
                        logButtonFunc.setVisible(false);

                        textField2.setVisible(false);
                        frame.repaint();

                        double numrad = (num1 * Math.PI / 180);
                        if (sinButton.isSelected()) {
                            resultlong = (long) (Math.sin(numrad));
                        }
                        if (cosButton.isSelected()) {
                            resultlong = (long) (Math.cos(numrad));
                        }
                        if (tanButton.isSelected()) {
                            resultlong = (long) (Math.tan(numrad));
                        }
                        if (invsinButton.isSelected()) {
                            resultlong = (long) (Math.asin(numrad));
                        }
                        if (invcosButton.isSelected()) {
                            resultlong = (long) (Math.acos(numrad));
                        }
                        if (invtanButton.isSelected()) {
                            resultlong = (long) (Math.atan(numrad));
                        }
                    }
                    //
                    else if (hyperbolicButton.isSelected()) {
                        //Displaying Buttons
                        sinhButton.setVisible(true);
                        coshButton.setVisible(true);
                        tanhButton.setVisible(true);
                        invsinhButton.setVisible(true);
                        invcoshButton.setVisible(true);
                        invtanhButton.setVisible(true);
                        //Hiding unnecessary Buttons and Fields
                        addButton.setVisible(false);
                        subtractButton.setVisible(false);
                        multiplyButton.setVisible(false);
                        divideButton.setVisible(false);
                        radianButton.setVisible(false);
                        exponentialButton.setVisible(false);
                        percentButton.setVisible(false);
                        degreeButton.setVisible(false);
                        modButton.setVisible(false);
                        textField2.setVisible(false);
                        sinButton.setVisible(false);
                        cosButton.setVisible(false);
                        tanButton.setVisible(false);
                        cscButton.setVisible(false);
                        secButton.setVisible(false);
                        cotButton.setVisible(false);
                        invsinButton.setVisible(false);
                        invcosButton.setVisible(false);
                        invtanButton.setVisible(false);
                        logButtonFunc.setVisible(false);
                        frame.repaint();


                        if (sinhButton.isSelected()) {
                            resultlong = (long) (Math.sinh(num1));
                        }
                        if (coshButton.isSelected()) {
                            resultlong = (long) (Math.cosh(num1));
                        }
                        if (tanhButton.isSelected()) {
                            resultlong = (long) (Math.tanh(num1));
                        }
                        if (invsinhButton.isSelected()) {
                            resultlong = (long) (Math.log(num1 + Math.sqrt(1 + num1 * num1)));
                        }
                        if (invcoshButton.isSelected()) {
                            resultlong = (long) (Math.log(num1 + Math.sqrt(num1 + 1) * Math.sqrt(num1 - 1)));
                        }
                        if (invtanhButton.isSelected()) {
                            resultlong = (long) ((Math.log(1 + num1) - Math.log(1 - num1)) / 2);
                        }

                    }
                    //
                    else if (logButton.isSelected()) {
                        addButton.setVisible(false);
                        subtractButton.setVisible(false);
                        multiplyButton.setVisible(false);
                        divideButton.setVisible(false);
                        radianButton.setVisible(false);
                        exponentialButton.setVisible(false);
                        percentButton.setVisible(false);
                        degreeButton.setVisible(false);
                        modButton.setVisible(false);
                        textField2.setVisible(false);
                        sinButton.setVisible(false);
                        cosButton.setVisible(false);
                        tanButton.setVisible(false);
                        cscButton.setVisible(false);
                        secButton.setVisible(false);
                        cotButton.setVisible(false);
                        invsinButton.setVisible(false);
                        invcosButton.setVisible(false);
                        invtanButton.setVisible(false);
                        sinhButton.setVisible(false);
                        coshButton.setVisible(false);
                        tanhButton.setVisible(false);
                        invsinhButton.setVisible(false);
                        invcoshButton.setVisible(false);
                        invtanhButton.setVisible(false);
                        //displaying button
                        logButtonFunc.setVisible(true);
                        frame.repaint();

                        resultlong = (long) Math.log(num1);
                    }

                    resultFeild.setText(Long.toOctalString(resultlong));
                    frame.repaint();

                }


            }

            //If HEXA DECIMAL Type is selected
            else if (hexaButton.isSelected()) {


                //DISPLAYING the possible data types
                byteButton.setVisible(true);
                shortButton.setVisible(true);
                intButton.setVisible(true);
                longButton.setVisible(false);
                doubleButton.setVisible(false);
                floatButton.setVisible(false);
                frame.repaint();

                if (byteButton.isSelected()) {

                    byte resultbyte = 0;
                    byte num1 = Byte.parseByte(textField1.getText(), 16);
                    byte num2 = Byte.parseByte(textField2.getText(), 16);

                    System.out.println("Byte button pressed");
                    arthematicButton.setVisible(true);
                    trigonometricButton.setVisible(true);
                    hyperbolicButton.setVisible(true);
                    logButton.setVisible(true);

                    if (arthematicButton.isSelected()) {
                        System.out.println("Arthematic+Byte");

                        addButton.setVisible(true);
                        subtractButton.setVisible(true);
                        multiplyButton.setVisible(true);
                        divideButton.setVisible(true);
                        radianButton.setVisible(true);
                        exponentialButton.setVisible(true);
                        percentButton.setVisible(true);
                        degreeButton.setVisible(true);
                        modButton.setVisible(true);
                        textField2.setVisible(true);
                        //Hiding other types
                        sinButton.setVisible(false);
                        cosButton.setVisible(false);
                        tanButton.setVisible(false);
                        cscButton.setVisible(false);
                        secButton.setVisible(false);
                        cotButton.setVisible(false);
                        invsinButton.setVisible(false);
                        invcosButton.setVisible(false);
                        invtanButton.setVisible(false);
                        sinhButton.setVisible(false);
                        coshButton.setVisible(false);
                        tanhButton.setVisible(false);
                        invsinhButton.setVisible(false);
                        invcoshButton.setVisible(false);
                        invtanhButton.setVisible(false);
                        logButtonFunc.setVisible(false);

                        frame.repaint();

                        if (addButton.isSelected()) {
                            resultbyte = (byte) (num1 + num2);
                        } else if (subtractButton.isSelected()) {
                            resultbyte = (byte) (num1 - num2);
                        } else if (multiplyButton.isSelected()) {
                            resultbyte = (byte) (num1 * num2);
                        } else if (divideButton.isSelected()) {
                            resultbyte = (byte) (num1 / num2);
                        } else if (exponentialButton.isSelected()) {
                            resultbyte = (byte) (Math.pow(num1, num2));
                        } else if (radianButton.isSelected()) {
                            textField2.setVisible(false);
                            resultbyte = (byte) (num1 * Math.PI / 180);
                        } else if (degreeButton.isSelected()) {
                            textField2.setVisible(false);
                            resultbyte = (byte) (num1 * 180 / Math.PI);
                        } else if (percentButton.isSelected()) {
                            resultbyte = (byte) (num1 * 100 / num2);
                        } else if (modButton.isSelected()) {
                            resultbyte = (byte) (num1 % num2);
                        }

                    }
                    //
                    else if (trigonometricButton.isSelected()) {
                        System.out.println("Trigonometric");
                        sinButton.setVisible(true);
                        cosButton.setVisible(true);
                        tanButton.setVisible(true);
                        cscButton.setVisible(true);
                        secButton.setVisible(true);
                        cotButton.setVisible(true);
                        invsinButton.setVisible(true);
                        invcosButton.setVisible(true);
                        invtanButton.setVisible(true);
                        frame.repaint();
                        //Hiding other types
                        addButton.setVisible(false);
                        subtractButton.setVisible(false);
                        multiplyButton.setVisible(false);
                        divideButton.setVisible(false);
                        radianButton.setVisible(false);
                        exponentialButton.setVisible(false);
                        percentButton.setVisible(false);
                        degreeButton.setVisible(false);
                        modButton.setVisible(false);
                        textField2.setVisible(false);
                        sinhButton.setVisible(false);
                        coshButton.setVisible(false);
                        tanhButton.setVisible(false);
                        invsinhButton.setVisible(false);
                        invcoshButton.setVisible(false);
                        invtanhButton.setVisible(false);
                        logButtonFunc.setVisible(false);
                        frame.repaint();

                        double numrad = (num1 * Math.PI / 180);

                        if (sinButton.isSelected()) {
                            resultbyte = (byte) (Math.sin(numrad));
                        }
                        if (cosButton.isSelected()) {
                            resultbyte = (byte) (Math.cos(numrad));
                        }
                        if (tanButton.isSelected()) {
                            resultbyte = (byte) (Math.tan(numrad));
                        }
                        if (invsinButton.isSelected()) {
                            resultbyte = (byte) (Math.asin(numrad));
                        }
                        if (invcosButton.isSelected()) {
                            resultbyte = (byte) (Math.acos(numrad));
                        }
                        if (invtanButton.isSelected()) {
                            resultbyte = (byte) (Math.atan(numrad));
                        }
                        if (cscButton.isSelected()) {
                            resultbyte = (byte) (1 / Math.sin(numrad));
                        }
                        if (secButton.isSelected()) {
                            resultbyte = (byte) (1 / Math.cos(numrad));
                        }
                        if (cotButton.isSelected()) {
                            resultbyte = (byte) (1 / Math.tan(numrad));
                        }
                    }
                    //
                    else if (hyperbolicButton.isSelected()) {
                        //Displaying Buttons
                        sinhButton.setVisible(true);
                        coshButton.setVisible(true);
                        tanhButton.setVisible(true);
                        invsinhButton.setVisible(true);
                        invcoshButton.setVisible(true);
                        invtanhButton.setVisible(true);
                        //Hiding unnecessary Buttons and Fields
                        addButton.setVisible(false);
                        subtractButton.setVisible(false);
                        multiplyButton.setVisible(false);
                        divideButton.setVisible(false);
                        radianButton.setVisible(false);
                        exponentialButton.setVisible(false);
                        percentButton.setVisible(false);
                        degreeButton.setVisible(false);
                        modButton.setVisible(false);
                        textField2.setVisible(false);
                        sinButton.setVisible(false);
                        cosButton.setVisible(false);
                        tanButton.setVisible(false);
                        cscButton.setVisible(false);
                        secButton.setVisible(false);
                        cotButton.setVisible(false);
                        invsinButton.setVisible(false);
                        invcosButton.setVisible(false);
                        invtanButton.setVisible(false);
                        logButtonFunc.setVisible(false);
                        frame.repaint();

                        if (sinhButton.isSelected()) {
                            resultbyte = (byte) (Math.sinh(num1));
                        }
                        if (coshButton.isSelected()) {
                            resultbyte = (byte) (Math.cosh(num1));
                        }
                        if (tanhButton.isSelected()) {
                            resultbyte = (byte) (Math.tanh(num1));
                        }
                        if (invsinhButton.isSelected()) {
                            resultbyte = (byte) (Math.log(num1 + Math.sqrt(1 + num1 * num1)));
                        }
                        if (invcoshButton.isSelected()) {
                            resultbyte = (byte) (Math.log(num1 + Math.sqrt(num1 + 1) * Math.sqrt(num1 - 1)));
                        }
                        if (invtanhButton.isSelected()) {
                            resultbyte = (byte) ((Math.log(1 + num1) - Math.log(1 - num1)) / 2);
                        }

                    }
                    //
                    else if (logButton.isSelected()) {
                        addButton.setVisible(false);
                        subtractButton.setVisible(false);
                        multiplyButton.setVisible(false);
                        divideButton.setVisible(false);
                        radianButton.setVisible(false);
                        exponentialButton.setVisible(false);
                        percentButton.setVisible(false);
                        degreeButton.setVisible(false);
                        modButton.setVisible(false);
                        textField2.setVisible(false);
                        sinButton.setVisible(false);
                        cosButton.setVisible(false);
                        tanButton.setVisible(false);
                        cscButton.setVisible(false);
                        secButton.setVisible(false);
                        cotButton.setVisible(false);
                        invsinButton.setVisible(false);
                        invcosButton.setVisible(false);
                        invtanButton.setVisible(false);
                        sinhButton.setVisible(false);
                        coshButton.setVisible(false);
                        tanhButton.setVisible(false);
                        invsinhButton.setVisible(false);
                        invcoshButton.setVisible(false);
                        invtanhButton.setVisible(false);
                        //displaying button
                        logButtonFunc.setVisible(true);
                        frame.repaint();

                        resultbyte = (byte) Math.log(num1);
                    }
                    //Displaying results
                    int resulthex = resultbyte;
                    resultFeild.setText(Integer.toHexString(resulthex));

                }
                //
                else if (shortButton.isSelected()) {
                    short resultshort = 0;
                    short num1 = Short.parseShort(textField1.getText(), 16);
                    short num2 = Short.parseShort(textField2.getText(), 16);
                    System.out.println("Byte button pressed");

                    arthematicButton.setVisible(true);
                    trigonometricButton.setVisible(true);
                    hyperbolicButton.setVisible(true);
                    logButton.setVisible(true);

                    if (arthematicButton.isSelected()) {
                        System.out.println("Arthematic+Short");

                        addButton.setVisible(true);
                        subtractButton.setVisible(true);
                        multiplyButton.setVisible(true);
                        divideButton.setVisible(true);
                        radianButton.setVisible(true);
                        exponentialButton.setVisible(true);
                        percentButton.setVisible(true);
                        degreeButton.setVisible(true);
                        modButton.setVisible(true);
                        textField2.setVisible(true);
                        //Hiding
                        sinButton.setVisible(false);
                        cosButton.setVisible(false);
                        tanButton.setVisible(false);
                        invsinButton.setVisible(false);
                        invcosButton.setVisible(false);
                        invtanButton.setVisible(false);
                        sinhButton.setVisible(false);
                        coshButton.setVisible(false);
                        tanhButton.setVisible(false);
                        invsinhButton.setVisible(false);
                        invcoshButton.setVisible(false);
                        invtanhButton.setVisible(false);
                        logButtonFunc.setVisible(false);

                        frame.repaint();

                        if (addButton.isSelected()) {
                            resultshort = (short) (num1 + num2);
                        } else if (subtractButton.isSelected()) {
                            resultshort = (short) (num1 - num2);
                        } else if (multiplyButton.isSelected()) {
                            resultshort = (short) (num1 * num2);
                        } else if (divideButton.isSelected()) {
                            resultshort = (short) (num1 / num2);
                        } else if (exponentialButton.isSelected()) {
                            resultshort = (short) (Math.pow(num1, num2));
                        } else if (radianButton.isSelected()) {
                            textField2.setVisible(false);
                            resultshort = (short) (num1 * Math.PI / 180);
                        } else if (degreeButton.isSelected()) {
                            textField2.setVisible(false);
                            resultshort = (short) (num1 * 180 / Math.PI);
                        } else if (percentButton.isSelected()) {
                            resultshort = (short) (num1 * 100 / num2);
                        } else if (modButton.isSelected()) {
                            resultshort = (short) (num1 % num2);
                        }

                        resultFeild.setText(Short.toString(resultshort));

                    }
                    //
                    else if (trigonometricButton.isSelected()) {
                        System.out.println("Trigonometric");
                        textField2.setVisible(false);
                        sinButton.setVisible(true);
                        cosButton.setVisible(true);
                        tanButton.setVisible(true);
                        invsinButton.setVisible(true);
                        invcosButton.setVisible(true);
                        invtanButton.setVisible(true);
                        frame.repaint();
                        //Hiding other types
                        addButton.setVisible(false);
                        subtractButton.setVisible(false);
                        multiplyButton.setVisible(false);
                        divideButton.setVisible(false);
                        radianButton.setVisible(false);
                        exponentialButton.setVisible(false);
                        percentButton.setVisible(false);
                        degreeButton.setVisible(false);
                        modButton.setVisible(false);
                        sinhButton.setVisible(false);
                        coshButton.setVisible(false);
                        tanhButton.setVisible(false);
                        invsinhButton.setVisible(false);
                        invcoshButton.setVisible(false);
                        invtanhButton.setVisible(false);
                        logButtonFunc.setVisible(false);

                        textField2.setVisible(false);
                        frame.repaint();

                        double numrad = (num1 * Math.PI / 180);

                        if (sinButton.isSelected()) {
                            resultshort = (short) (Math.sin(numrad));
                        }
                        if (cosButton.isSelected()) {
                            resultshort = (short) (Math.cos(numrad));
                        }
                        if (tanButton.isSelected()) {
                            resultshort = (short) (Math.tan(numrad));
                        }
                        if (invsinButton.isSelected()) {
                            resultshort = (short) (Math.asin(numrad));
                        }
                        if (invcosButton.isSelected()) {
                            resultshort = (short) (Math.acos(numrad));
                        }
                        if (invtanButton.isSelected()) {
                            resultshort = (short) (Math.atan(numrad));
                        }
                        if (cscButton.isSelected()) {
                            resultshort = (short) (1 / Math.sin(numrad));
                        }
                        if (secButton.isSelected()) {
                            resultshort = (short) (1 / Math.cos(numrad));
                        }
                        if (cotButton.isSelected()) {
                            resultshort = (short) (1 / Math.tan(numrad));
                        }
                    }
                    //
                    else if (hyperbolicButton.isSelected()) {
                        //Displaying Buttons
                        sinhButton.setVisible(true);
                        coshButton.setVisible(true);
                        tanhButton.setVisible(true);
                        invsinhButton.setVisible(true);
                        invcoshButton.setVisible(true);
                        invtanhButton.setVisible(true);
                        //Hiding unnecessary Buttons and Fields
                        addButton.setVisible(false);
                        subtractButton.setVisible(false);
                        multiplyButton.setVisible(false);
                        divideButton.setVisible(false);
                        radianButton.setVisible(false);
                        exponentialButton.setVisible(false);
                        percentButton.setVisible(false);
                        degreeButton.setVisible(false);
                        modButton.setVisible(false);
                        textField2.setVisible(false);
                        sinButton.setVisible(false);
                        cosButton.setVisible(false);
                        tanButton.setVisible(false);
                        cscButton.setVisible(false);
                        secButton.setVisible(false);
                        cotButton.setVisible(false);
                        invsinButton.setVisible(false);
                        invcosButton.setVisible(false);
                        invtanButton.setVisible(false);
                        logButtonFunc.setVisible(false);
                        frame.repaint();


                        if (sinhButton.isSelected()) {
                            resultshort = (short) (Math.sinh(num1));
                        }
                        if (coshButton.isSelected()) {
                            resultshort = (short) (Math.cosh(num1));
                        }
                        if (tanhButton.isSelected()) {
                            resultshort = (short) (Math.tanh(num1));
                        }
                        if (invsinhButton.isSelected()) {
                            resultshort = (short) (Math.log(num1+ Math.sqrt(1 + num1 * num1)));
                        }
                        if (invcoshButton.isSelected()) {
                            resultshort = (short) Math.log(num1 + Math.sqrt(num1 + 1) * Math.sqrt(num1 - 1));
                        }
                        if (invtanhButton.isSelected()) {
                            resultshort = (short) ((Math.log(1 + num1) - Math.log(1 - num1)) / 2);
                        }

                    }
                    //
                    else if (logButton.isSelected()) {
                        addButton.setVisible(false);
                        subtractButton.setVisible(false);
                        multiplyButton.setVisible(false);
                        divideButton.setVisible(false);
                        radianButton.setVisible(false);
                        exponentialButton.setVisible(false);
                        percentButton.setVisible(false);
                        degreeButton.setVisible(false);
                        modButton.setVisible(false);
                        textField2.setVisible(false);
                        sinButton.setVisible(false);
                        cosButton.setVisible(false);
                        tanButton.setVisible(false);
                        cscButton.setVisible(false);
                        secButton.setVisible(false);
                        cotButton.setVisible(false);
                        invsinButton.setVisible(false);
                        invcosButton.setVisible(false);
                        invtanButton.setVisible(false);
                        sinhButton.setVisible(false);
                        coshButton.setVisible(false);
                        tanhButton.setVisible(false);
                        invsinhButton.setVisible(false);
                        invcoshButton.setVisible(false);
                        invtanhButton.setVisible(false);
                        //displaying button
                        logButtonFunc.setVisible(true);
                        frame.repaint();

                        resultshort = (short) Math.log(num1);
                    }

                    int resulthex = resultshort;
                    resultFeild.setText(Integer.toHexString(resulthex));
                    frame.repaint();

                }
                //
                else if (intButton.isSelected()) {
                    int resultInt = 0;
                    int num1 = Integer.parseInt(textField1.getText(), 16);
                    int num2 = Integer.parseInt(textField1.getText(), 16);

                    System.out.println("INT button pressed");//checking
                    arthematicButton.setVisible(true);
                    trigonometricButton.setVisible(true);
                    hyperbolicButton.setVisible(true);
                    logButton.setVisible(true);

                    if (arthematicButton.isSelected()) {
                        System.out.println("Arthematic+Iint");//checking

                        addButton.setVisible(true);
                        subtractButton.setVisible(true);
                        multiplyButton.setVisible(true);
                        divideButton.setVisible(true);
                        radianButton.setVisible(true);
                        exponentialButton.setVisible(true);
                        percentButton.setVisible(true);
                        degreeButton.setVisible(true);
                        modButton.setVisible(true);
                        //Hiding Buttons
                        sinButton.setVisible(false);
                        cosButton.setVisible(false);
                        tanButton.setVisible(false);
                        invsinButton.setVisible(false);
                        invcosButton.setVisible(false);
                        invtanButton.setVisible(false);
                        textField2.setVisible(true);
                        logButtonFunc.setVisible(false);
                        frame.repaint();

                        if (addButton.isSelected()) {resultInt =  (num1 + num2);}
                        //
                        else if (subtractButton.isSelected()) {resultInt = (num1 - num2);}
                        //
                        else if (multiplyButton.isSelected()) {resultInt =(num1 * num2);}
                        //
                        else if (divideButton.isSelected()) {resultInt =  (num1 / num2);}
                        //
                        else if (exponentialButton.isSelected()) {resultInt = (int) (Math.pow(num1, num2));}
                        //
                        else if (radianButton.isSelected()) {
                            textField2.setVisible(false);
                            resultInt = (int) (num1 * Math.PI / 180);}
                        //
                        else if (degreeButton.isSelected()) {
                            textField2.setVisible(false);
                            resultInt = (int) (num1 * 180 / Math.PI);}
                        //
                        else if (percentButton.isSelected()) {resultInt = (num1 * 100 / num2);}
                        //
                        else if (modButton.isSelected()) {resultInt = (num1 % num2);}
                    }
                    //
                    else if (trigonometricButton.isSelected()) {
                        System.out.println("Trigonometric");
                        textField2.setVisible(false);
                        sinButton.setVisible(true);
                        cosButton.setVisible(true);
                        tanButton.setVisible(true);
                        invsinButton.setVisible(true);
                        invcosButton.setVisible(true);
                        invtanButton.setVisible(true);
                        frame.repaint();
                        //Hiding other types
                        addButton.setVisible(false);
                        subtractButton.setVisible(false);
                        multiplyButton.setVisible(false);
                        divideButton.setVisible(false);
                        radianButton.setVisible(false);
                        exponentialButton.setVisible(false);
                        percentButton.setVisible(false);
                        degreeButton.setVisible(false);
                        modButton.setVisible(false);
                        sinhButton.setVisible(false);
                        coshButton.setVisible(false);
                        tanhButton.setVisible(false);
                        invsinhButton.setVisible(false);
                        invcoshButton.setVisible(false);
                        invtanhButton.setVisible(false);
                        logButtonFunc.setVisible(false);

                        textField2.setVisible(false);
                        frame.repaint();


                        double numrad = (num1 * Math.PI / 180);

                        if (sinButton.isSelected()) {
                            resultInt = (int) (Math.sin(numrad));
                        }
                        if (cosButton.isSelected()) {
                            resultInt = (int) (Math.cos(numrad));
                        }
                        if (tanButton.isSelected()) {
                            resultInt = (int) (Math.tan(numrad));
                        }
                        if (invsinButton.isSelected()) {
                            resultInt = (int) (Math.asin(numrad));
                        }
                        if (invcosButton.isSelected()) {
                            resultInt = (int) (Math.acos(numrad));
                        }
                        if (invtanButton.isSelected()) {
                            resultInt = (int) (Math.atan(numrad));
                        }
                        if (cscButton.isSelected()) {
                            resultInt = (int) (1 / Math.sin(numrad));
                        }
                        if (secButton.isSelected()) {
                            resultInt = (int) (1 / Math.cos(numrad));
                        }
                        if (cotButton.isSelected()) {
                            resultInt = (int) (1 / Math.tan(numrad));
                        }
                    }
                    //
                    else if (hyperbolicButton.isSelected()) {
                        //Displaying Buttons
                        sinhButton.setVisible(true);
                        coshButton.setVisible(true);
                        tanhButton.setVisible(true);
                        invsinhButton.setVisible(true);
                        invcoshButton.setVisible(true);
                        invtanhButton.setVisible(true);
                        //Hiding unnecessary Buttons and Fields
                        addButton.setVisible(false);
                        subtractButton.setVisible(false);
                        multiplyButton.setVisible(false);
                        divideButton.setVisible(false);
                        radianButton.setVisible(false);
                        exponentialButton.setVisible(false);
                        percentButton.setVisible(false);
                        degreeButton.setVisible(false);
                        modButton.setVisible(false);
                        textField2.setVisible(false);
                        sinButton.setVisible(false);
                        cosButton.setVisible(false);
                        tanButton.setVisible(false);
                        cscButton.setVisible(false);
                        secButton.setVisible(false);
                        cotButton.setVisible(false);
                        invsinButton.setVisible(false);
                        invcosButton.setVisible(false);
                        invtanButton.setVisible(false);
                        logButtonFunc.setVisible(false);
                        frame.repaint();


                        if (sinhButton.isSelected()) {
                            resultInt = (int) (Math.sinh(num1));
                        }
                        if (coshButton.isSelected()) {
                            resultInt = (int) (Math.cosh(num1));
                        }
                        if (tanhButton.isSelected()) {
                            resultInt = (int) (Math.tanh(num1));
                        }
                        if (invsinhButton.isSelected()) {
                            resultInt = (int) (Math.log(num1 + Math.sqrt(1 + num1* num1)));
                        }
                        if (invcoshButton.isSelected()) {
                            resultInt = (int) (Math.log(num1 + Math.sqrt(num1 + 1) * Math.sqrt(num1 - 1)));
                        }
                        if (invtanhButton.isSelected()) {
                            resultInt = (int) ((Math.log(1 + num1) - Math.log(1 - num1)) / 2);
                        }

                    }
                    //
                    else if (logButton.isSelected()) {
                        addButton.setVisible(false);
                        subtractButton.setVisible(false);
                        multiplyButton.setVisible(false);
                        divideButton.setVisible(false);
                        radianButton.setVisible(false);
                        exponentialButton.setVisible(false);
                        percentButton.setVisible(false);
                        degreeButton.setVisible(false);
                        modButton.setVisible(false);
                        textField2.setVisible(false);
                        sinButton.setVisible(false);
                        cosButton.setVisible(false);
                        tanButton.setVisible(false);
                        cscButton.setVisible(false);
                        secButton.setVisible(false);
                        cotButton.setVisible(false);
                        invsinButton.setVisible(false);
                        invcosButton.setVisible(false);
                        invtanButton.setVisible(false);
                        sinhButton.setVisible(false);
                        coshButton.setVisible(false);
                        tanhButton.setVisible(false);
                        invsinhButton.setVisible(false);
                        invcoshButton.setVisible(false);
                        invtanhButton.setVisible(false);
                        //displaying button
                        logButtonFunc.setVisible(true);
                        frame.repaint();

                        resultInt = (int) Math.log(num1);
                    }

                    resultFeild.setText(Integer.toHexString(resultInt));

                }
                //
                else if (longButton.isSelected()) {
                    System.out.println("long"); //checking
                    long resultlong = 0;
                    long num1 = Long.parseLong(textField1.getText(), 16);
                    long num2 = Long.parseLong(textField1.getText(), 16);

                    arthematicButton.setVisible(true);
                    trigonometricButton.setVisible(true);
                    hyperbolicButton.setVisible(true);
                    logButton.setVisible(true);
                    //hiding buttons
                    sinButton.setVisible(false);
                    cosButton.setVisible(false);
                    tanButton.setVisible(false);
                    invsinButton.setVisible(false);
                    invcosButton.setVisible(false);
                    invtanButton.setVisible(false);
                    frame.repaint();

                    if (arthematicButton.isSelected()) {

                        addButton.setVisible(true);
                        subtractButton.setVisible(true);
                        multiplyButton.setVisible(true);
                        divideButton.setVisible(true);
                        radianButton.setVisible(true);
                        exponentialButton.setVisible(true);
                        percentButton.setVisible(true);
                        degreeButton.setVisible(true);
                        modButton.setVisible(true);
                        textField2.setVisible(true);
                        //Hiding
                        sinButton.setVisible(false);
                        cosButton.setVisible(false);
                        tanButton.setVisible(false);
                        invsinButton.setVisible(false);
                        invcosButton.setVisible(false);
                        invtanButton.setVisible(false);
                        sinhButton.setVisible(false);
                        coshButton.setVisible(false);
                        tanhButton.setVisible(false);
                        invsinhButton.setVisible(false);
                        invcoshButton.setVisible(false);
                        invtanhButton.setVisible(false);
                        logButtonFunc.setVisible(false);

                        frame.repaint();

                        System.out.println("long +arthematic");//checking

                        if (addButton.isSelected()) {resultlong = (num1 + num2);}

                        else if (subtractButton.isSelected()) {resultlong =  (num1 - num2);}
                        //
                        else if (multiplyButton.isSelected()) {resultlong =  (num1 * num2);}
                        //
                        else if (divideButton.isSelected()) {resultlong =  (num1 / num2);}
                        //
                        else if (exponentialButton.isSelected()) {resultlong = (long) (Math.pow(num1, num2));}
                        //
                        else if (radianButton.isSelected()) {
                            textField2.setVisible(false);
                            resultlong = (long) (num1 * Math.PI / 180);}
                        //
                        else if (degreeButton.isSelected()) {
                            textField2.setVisible(false);
                            resultlong = (long) (num1 * 180 / Math.PI);}
                        //
                        else if (percentButton.isSelected()) {resultlong =  (num1 * 100 / num2);}
                        //
                        else if (modButton.isSelected()) {
                            resultlong =  (num1 % num2);
                        }
                    }
                    //
                    else if (trigonometricButton.isSelected()) {
                        System.out.println("Trigonometric");
                        textField2.setVisible(false);
                        sinButton.setVisible(true);
                        cosButton.setVisible(true);
                        tanButton.setVisible(true);
                        invsinButton.setVisible(true);
                        invcosButton.setVisible(true);
                        invtanButton.setVisible(true);
                        frame.repaint();
                        //Hiding other types
                        addButton.setVisible(false);
                        subtractButton.setVisible(false);
                        multiplyButton.setVisible(false);
                        divideButton.setVisible(false);
                        radianButton.setVisible(false);
                        exponentialButton.setVisible(false);
                        percentButton.setVisible(false);
                        degreeButton.setVisible(false);
                        modButton.setVisible(false);
                        sinhButton.setVisible(false);
                        coshButton.setVisible(false);
                        tanhButton.setVisible(false);
                        invsinhButton.setVisible(false);
                        invcoshButton.setVisible(false);
                        invtanhButton.setVisible(false);
                        logButtonFunc.setVisible(false);

                        textField2.setVisible(false);
                        frame.repaint();

                        double numrad = (num1 * Math.PI / 180);
                        if (sinButton.isSelected()) {
                            resultlong = (long) (Math.sin(numrad));
                        }
                        if (cosButton.isSelected()) {
                            resultlong = (long) (Math.cos(numrad));
                        }
                        if (tanButton.isSelected()) {
                            resultlong = (long) (Math.tan(numrad));
                        }
                        if (invsinButton.isSelected()) {
                            resultlong = (long) (Math.asin(numrad));
                        }
                        if (invcosButton.isSelected()) {
                            resultlong = (long) (Math.acos(numrad));
                        }
                        if (invtanButton.isSelected()) {
                            resultlong = (long) (Math.atan(numrad));
                        }
                    }
                    //
                    else if (hyperbolicButton.isSelected()) {
                        //Displaying Buttons
                        sinhButton.setVisible(true);
                        coshButton.setVisible(true);
                        tanhButton.setVisible(true);
                        invsinhButton.setVisible(true);
                        invcoshButton.setVisible(true);
                        invtanhButton.setVisible(true);
                        //Hiding unnecessary Buttons and Fields
                        addButton.setVisible(false);
                        subtractButton.setVisible(false);
                        multiplyButton.setVisible(false);
                        divideButton.setVisible(false);
                        radianButton.setVisible(false);
                        exponentialButton.setVisible(false);
                        percentButton.setVisible(false);
                        degreeButton.setVisible(false);
                        modButton.setVisible(false);
                        textField2.setVisible(false);
                        sinButton.setVisible(false);
                        cosButton.setVisible(false);
                        tanButton.setVisible(false);
                        cscButton.setVisible(false);
                        secButton.setVisible(false);
                        cotButton.setVisible(false);
                        invsinButton.setVisible(false);
                        invcosButton.setVisible(false);
                        invtanButton.setVisible(false);
                        logButtonFunc.setVisible(false);
                        frame.repaint();

                        if (sinhButton.isSelected()) {
                            resultlong = (long) (Math.sinh(num1));
                        }
                        if (coshButton.isSelected()) {
                            resultlong = (long) (Math.cosh(num1));
                        }
                        if (tanhButton.isSelected()) {
                            resultlong = (long) (Math.tanh(num1));
                        }
                        if (invsinhButton.isSelected()) {
                            resultlong = (long) (Math.log(num1 + Math.sqrt(1 + num1 * num1)));
                        }
                        if (invcoshButton.isSelected()) {
                            resultlong = (long) (Math.log(num1 + Math.sqrt(num1 + 1) * Math.sqrt(num1 - 1)));
                        }
                        if (invtanhButton.isSelected()) {
                            resultlong = (long) ((Math.log(1 + num1) - Math.log(1 - num1)) / 2);
                        }

                    }
                    //
                    else if (logButton.isSelected()) {
                        addButton.setVisible(false);
                        subtractButton.setVisible(false);
                        multiplyButton.setVisible(false);
                        divideButton.setVisible(false);
                        radianButton.setVisible(false);
                        exponentialButton.setVisible(false);
                        percentButton.setVisible(false);
                        degreeButton.setVisible(false);
                        modButton.setVisible(false);
                        textField2.setVisible(false);
                        sinButton.setVisible(false);
                        cosButton.setVisible(false);
                        tanButton.setVisible(false);
                        cscButton.setVisible(false);
                        secButton.setVisible(false);
                        cotButton.setVisible(false);
                        invsinButton.setVisible(false);
                        invcosButton.setVisible(false);
                        invtanButton.setVisible(false);
                        sinhButton.setVisible(false);
                        coshButton.setVisible(false);
                        tanhButton.setVisible(false);
                        invsinhButton.setVisible(false);
                        invcoshButton.setVisible(false);
                        invtanhButton.setVisible(false);
                        //displaying button
                        logButtonFunc.setVisible(true);
                        frame.repaint();

                        resultlong = (long) Math.log(num1);
                    }

                    resultFeild.setText(Long.toHexString(resultlong));
                    frame.repaint();

                }

            }

        }
        // Actions If exceptions found
        catch (NumberFormatException e1){
            System.out.println("Input Is INCORRECT FOR SELECTED DATA TYPE");
            resultFeild.setFont(exceptionFont);
            resultFeild.setText("Invalid Input for Selected Data Mode");
        }
        catch (ArithmeticException e2){
            resultFeild.setFont(exceptionFont);
            resultFeild.setText("Cannot Divide By ZERO");}

    }

    public static void main(String[] args) {

        Calculator calculator = new Calculator();
    }
}