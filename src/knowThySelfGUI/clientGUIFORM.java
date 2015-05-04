
package knowThySelfGUI;

//This class extends JFrame Swing library  which is used for forms
public class clientGUIFORM extends javax.swing.JFrame {

    /**
     * Creates new form clientGUIFORM
     */
    public clientGUIFORM() {
        initComponents();
        //Disable the maximise button on the Application window
        this.setResizable(false);
        //Disables the TextArea on the Application Main so the user cant resize it.
        txtResult.setEditable(false);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        btnAdd = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        txtResult = new javax.swing.JTextArea();
        txtName = new javax.swing.JTextField();
        txtMonthOfBirth = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        txtFaveDrink = new javax.swing.JTextField();
        txtFaveFood = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jSeparator3 = new javax.swing.JSeparator();
        jSeparator4 = new javax.swing.JSeparator();
        cmbColors = new javax.swing.JComboBox();
        cmbDaysOfMonth = new javax.swing.JComboBox();
        appLabel = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Know ThySelf");
        setBackground(new java.awt.Color(51, 102, 255));

        btnAdd.setForeground(new java.awt.Color(51, 0, 153));
        btnAdd.setText("Analyse Thyself!");
        btnAdd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAddActionPerformed(evt);
            }
        });

        txtResult.setBackground(new java.awt.Color(230, 230, 230));
        txtResult.setColumns(20);
        txtResult.setForeground(new java.awt.Color(51, 0, 102));
        txtResult.setRows(5);
        jScrollPane1.setViewportView(txtResult);

        txtName.setBackground(new java.awt.Color(204, 204, 255));
        txtName.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNameActionPerformed(evt);
            }
        });

        txtMonthOfBirth.setBackground(new java.awt.Color(204, 204, 255));
        txtMonthOfBirth.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtMonthOfBirthActionPerformed(evt);
            }
        });

        jLabel1.setText("Name:");

        jLabel2.setText("Month of Birth:");

        jLabel3.setText("Day Of Birth:");

        jLabel4.setText("Favorite Food:");

        txtFaveDrink.setBackground(new java.awt.Color(204, 204, 255));

        txtFaveFood.setBackground(new java.awt.Color(204, 204, 255));

        jLabel5.setText("Favorite Drink:");

        jLabel6.setText("Favorite Color:");

        cmbColors.setBackground(new java.awt.Color(204, 204, 255));
        cmbColors.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Red", "Orange", "Yellow", "Green", "Blue", "Indigo", "Violet", "Pink", "Purple", "Black", "White", "Brown", "Grey" }));

        cmbDaysOfMonth.setBackground(new java.awt.Color(204, 204, 255));
        cmbDaysOfMonth.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "1st", "2nd", "3rd", "4th", "5th", "6th", "7th", "8th", "9th", "10th", "11th", "12th", "13th", "14th", "15th", "16th", "17th", "18th", "19th", "20th", "21st", "22nd", "23rd", "24th", "25th", "26th", "27th", "28th", "29th", "30th", "31st" }));

        appLabel.setFont(new java.awt.Font("Vani", 3, 18)); // NOI18N
        appLabel.setForeground(new java.awt.Color(102, 0, 102));
        appLabel.setText("KNOW THYSELF APP.  CONSCIOUSLY SERVING YOU!");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel5)
                            .addComponent(jLabel6))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(txtFaveDrink)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(1, 1, 1)
                                .addComponent(cmbColors, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(jSeparator3, javax.swing.GroupLayout.PREFERRED_SIZE, 213, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jSeparator4, javax.swing.GroupLayout.PREFERRED_SIZE, 213, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(jLabel2)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(txtMonthOfBirth, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(jLabel3)
                        .addGap(18, 18, 18)
                        .addComponent(cmbDaysOfMonth, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(38, 38, 38)
                        .addComponent(btnAdd, javax.swing.GroupLayout.PREFERRED_SIZE, 148, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(16, 16, 16))
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel1)
                            .addComponent(jLabel4))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtFaveFood, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtName, javax.swing.GroupLayout.PREFERRED_SIZE, 438, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(appLabel))
                .addContainerGap(16, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(appLabel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtName, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1))
                .addGap(8, 8, 8)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtFaveFood, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel4))
                        .addGap(19, 19, 19)
                        .addComponent(jSeparator3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(cmbDaysOfMonth, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2)
                            .addComponent(txtMonthOfBirth, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jSeparator4, javax.swing.GroupLayout.PREFERRED_SIZE, 2, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtFaveDrink, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel5))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(cmbColors, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel6))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnAdd, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 291, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(22, 22, 22))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents


    private void btnAddActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAddActionPerformed
        // TODO add your handling code here:
        
        //This variable is assigned to get retrive Text from the txtName inputBox
        //Then passes it unto the server
        String userName = welcomeUser(txtName.getText());

        //This gets text from cmbDaysOfMonth combo box and converts it to String
        String DaysOfMonth = (String) cmbDaysOfMonth.getSelectedItem();
        //Then passes the value unto the server as a parameter of getDayofBirth();
        String DayOfBirth = getDayOfBirth(DaysOfMonth);

        //gets Color from the combo box of color on the GUI
        String faveColorList = (String) cmbColors.getSelectedItem();
         //Sends the information to the server.
        String getColor = getFaveColor(faveColorList);
        
        String getFoodText = getFaveFood(txtFaveFood.getText());

        String getDrinkText = getFaveDrink(txtFaveDrink.getText());
        String MonthOfBirth = getMonthOfBirth(txtMonthOfBirth.getText());
        String zodiac = "";

        //If the txtName input box is empty, it doesn't run the function
        //it also highlights the input box as red so user can mage amendments
        if (txtName.getText().equals("")) {
            txtName.setBackground(new java.awt.Color(255, 204, 204));//sets background of inputbox to pink
            txtResult.setText("");//resets the inputbox to blank
        } else if (txtMonthOfBirth.getText().equals("")) {
            //If valid DOB not entered, text input color is changed and data is not sent.
            txtMonthOfBirth.setBackground(new java.awt.Color(255, 204, 204));
            txtResult.setText("");//sets input box blank
        } else {
            txtName.setBackground(new java.awt.Color(204, 204, 255));//Changes the background color of input box
            txtMonthOfBirth.setBackground(new java.awt.Color(204, 204, 255));
            
            // FOR MONTH JANUARY
            //If input after conversion to lower case contains the text jan
            if (MonthOfBirth.toLowerCase().contains("jan")) {
                //If input contains any of the following numbers
                if (DayOfBirth.toLowerCase().contains("20")
                        || DayOfBirth.toLowerCase().contains("21")
                        || DayOfBirth.toLowerCase().contains("22")
                        || DayOfBirth.toLowerCase().contains("23")
                        || DayOfBirth.toLowerCase().contains("24")
                        || DayOfBirth.toLowerCase().contains("25")
                        || DayOfBirth.toLowerCase().contains("26")
                        || DayOfBirth.toLowerCase().contains("27")
                        || DayOfBirth.toLowerCase().contains("28")
                        || DayOfBirth.toLowerCase().contains("29")
                        || DayOfBirth.toLowerCase().contains("30")
                        || DayOfBirth.toLowerCase().contains("31")) {
                    //assign the value of zodiac variable
                    zodiac = "aquarius";
                } else {
                    //assign the value of zodiac variable
                    zodiac = "capricorn";
                }
            } // FOR MONTH FEBRUARY
            //If input after conversion to lower case contains the text 
            else if (MonthOfBirth.toLowerCase().contains("feb")) {
                if (DayOfBirth.toLowerCase().contains("18")
                        || DayOfBirth.toLowerCase().contains("19")
                        || DayOfBirth.toLowerCase().contains("20")
                        || DayOfBirth.toLowerCase().contains("21")
                        || DayOfBirth.toLowerCase().contains("22")
                        || DayOfBirth.toLowerCase().contains("23")
                        || DayOfBirth.toLowerCase().contains("24")
                        || DayOfBirth.toLowerCase().contains("25")
                        || DayOfBirth.toLowerCase().contains("26")
                        || DayOfBirth.toLowerCase().contains("27")
                        || DayOfBirth.toLowerCase().contains("28")
                        || DayOfBirth.toLowerCase().contains("29")
                        || DayOfBirth.toLowerCase().contains("30")
                        || DayOfBirth.toLowerCase().contains("31")) {
                    //assign the value of zodiac variable
                    zodiac = "pisces";
                } else {
                    //assign the value of zodiac variable
                    zodiac = "aquarius";
                }
            } // FOR MONTH MARCH
            else if (MonthOfBirth.toLowerCase().contains("mar")) {
                //If input contains any of the following numbers
                if (DayOfBirth.toLowerCase().contains("20")
                        || DayOfBirth.toLowerCase().contains("21")
                        || DayOfBirth.toLowerCase().contains("22")
                        || DayOfBirth.toLowerCase().contains("23")
                        || DayOfBirth.toLowerCase().contains("24")
                        || DayOfBirth.toLowerCase().contains("25")
                        || DayOfBirth.toLowerCase().contains("26")
                        || DayOfBirth.toLowerCase().contains("27")
                        || DayOfBirth.toLowerCase().contains("28")
                        || DayOfBirth.toLowerCase().contains("29")
                        || DayOfBirth.toLowerCase().contains("30")
                        || DayOfBirth.toLowerCase().contains("31")) {
                    //assign the value of zodiac variable
                    zodiac = "aries";
                } else {
                    
                //assign the value of zodiac variable
                    zodiac = "pisces";
                }
            } // FOR MONTH APRIL
            else if (MonthOfBirth.toLowerCase().contains("apr")) {
                //If input contains any of the following numbers
                if (DayOfBirth.toLowerCase().contains("20")
                        || DayOfBirth.toLowerCase().contains("21")
                        || DayOfBirth.toLowerCase().contains("22")
                        || DayOfBirth.toLowerCase().contains("23")
                        || DayOfBirth.toLowerCase().contains("24")
                        || DayOfBirth.toLowerCase().contains("25")
                        || DayOfBirth.toLowerCase().contains("26")
                        || DayOfBirth.toLowerCase().contains("27")
                        || DayOfBirth.toLowerCase().contains("28")
                        || DayOfBirth.toLowerCase().contains("29")
                        || DayOfBirth.toLowerCase().contains("30")
                        || DayOfBirth.toLowerCase().contains("31")) {
                    //assign the value of zodiac variable
                    zodiac = "taurus";
                } else {
                    //assign the value of zodiac variable
                    zodiac = "aries";
                }
            } // FOR MONTH MAY
            else if (MonthOfBirth.toLowerCase().contains("may")) {
                //If input contains any of the following numbers
                if (DayOfBirth.toLowerCase().contains("20")
                        || DayOfBirth.toLowerCase().contains("21")
                        || DayOfBirth.toLowerCase().contains("22")
                        || DayOfBirth.toLowerCase().contains("23")
                        || DayOfBirth.toLowerCase().contains("24")
                        || DayOfBirth.toLowerCase().contains("25")
                        || DayOfBirth.toLowerCase().contains("26")
                        || DayOfBirth.toLowerCase().contains("27")
                        || DayOfBirth.toLowerCase().contains("28")
                        || DayOfBirth.toLowerCase().contains("29")
                        || DayOfBirth.toLowerCase().contains("30")
                        || DayOfBirth.toLowerCase().contains("31")) {
                    //assign the value of zodiac variable
                    zodiac = "gemini";
                } else {
                    //assign the value of zodiac variable
                    zodiac = "taurus";
                }
            } // FOR MONTH JUNE
            else if (MonthOfBirth.toLowerCase().contains("jun")) {
                if (DayOfBirth.toLowerCase().contains("21")
                        || DayOfBirth.toLowerCase().contains("22")
                        || DayOfBirth.toLowerCase().contains("23")
                        || DayOfBirth.toLowerCase().contains("24")
                        || DayOfBirth.toLowerCase().contains("25")
                        || DayOfBirth.toLowerCase().contains("26")
                        || DayOfBirth.toLowerCase().contains("27")
                        || DayOfBirth.toLowerCase().contains("28")
                        || DayOfBirth.toLowerCase().contains("29")
                        || DayOfBirth.toLowerCase().contains("30")
                        || DayOfBirth.toLowerCase().contains("31")) {
                    //assign the value of zodiac variable
                    zodiac = "cancer";
                } else {
                    //assign the value of zodiac variable
                    zodiac = "gemini";
                }
            } // FOR MONTH JULY
            else if (MonthOfBirth.toLowerCase().contains("jul")) {
                //If input contains any of the following numbers
                if (DayOfBirth.toLowerCase().contains("22")
                        || DayOfBirth.toLowerCase().contains("23")
                        || DayOfBirth.toLowerCase().contains("24")
                        || DayOfBirth.toLowerCase().contains("25")
                        || DayOfBirth.toLowerCase().contains("26")
                        || DayOfBirth.toLowerCase().contains("27")
                        || DayOfBirth.toLowerCase().contains("28")
                        || DayOfBirth.toLowerCase().contains("29")
                        || DayOfBirth.toLowerCase().contains("30")
                        || DayOfBirth.toLowerCase().contains("31")) {
                    //assign the value of zodiac variable
                    zodiac = "leo";
                } else {
                    //assign the value of zodiac variable
                    zodiac = "cancer";
                }
            } // FOR MONTH AUGUST
            else if (MonthOfBirth.toLowerCase().contains("aug")) {
                if (DayOfBirth.toLowerCase().contains("23")
                        || DayOfBirth.toLowerCase().contains("24")
                        || DayOfBirth.toLowerCase().contains("25")
                        || DayOfBirth.toLowerCase().contains("26")
                        || DayOfBirth.toLowerCase().contains("27")
                        || DayOfBirth.toLowerCase().contains("28")
                        || DayOfBirth.toLowerCase().contains("29")
                        || DayOfBirth.toLowerCase().contains("30")
                        || DayOfBirth.toLowerCase().contains("31")) {
                    //assign the value of zodiac variable
                    zodiac = "virgo";
                } else {
                    //assign the value of zodiac variable
                    zodiac = "leo";
                }
            } // FOR MONTH SEPTEMBER
            else if (MonthOfBirth.toLowerCase().contains("sep")) {
                if (DayOfBirth.toLowerCase().contains("22")
                        || DayOfBirth.toLowerCase().contains("23")
                        || DayOfBirth.toLowerCase().contains("24")
                        || DayOfBirth.toLowerCase().contains("25")
                        || DayOfBirth.toLowerCase().contains("26")
                        || DayOfBirth.toLowerCase().contains("27")
                        || DayOfBirth.toLowerCase().contains("28")
                        || DayOfBirth.toLowerCase().contains("29")
                        || DayOfBirth.toLowerCase().contains("30")
                        || DayOfBirth.toLowerCase().contains("31")) {
                    //assign the value of zodiac variable
                    zodiac = "libra";
                } else {
                    //assign the value of zodiac variable
                    zodiac = "virgo";
                }
            } // FOR MONTH OCTOBER
            else if (MonthOfBirth.toLowerCase().contains("oct")) {
                if (DayOfBirth.toLowerCase().contains("23")
                        || DayOfBirth.toLowerCase().contains("24")
                        || DayOfBirth.toLowerCase().contains("25")
                        || DayOfBirth.toLowerCase().contains("26")
                        || DayOfBirth.toLowerCase().contains("27")
                        || DayOfBirth.toLowerCase().contains("28")
                        || DayOfBirth.toLowerCase().contains("29")
                        || DayOfBirth.toLowerCase().contains("30")
                        || DayOfBirth.toLowerCase().contains("31")) {
                    //assign the value of zodiac variable
                    zodiac = "scorpio";
                } else {
                    //assign the value of zodiac variable
                    zodiac = "libra";
                }
            } // FOR MONTH NOVEMBER
            else if (MonthOfBirth.toLowerCase().contains("nov")) {
                if (DayOfBirth.toLowerCase().contains("22")
                        || DayOfBirth.toLowerCase().contains("23")
                        || DayOfBirth.toLowerCase().contains("24")
                        || DayOfBirth.toLowerCase().contains("25")
                        || DayOfBirth.toLowerCase().contains("26")
                        || DayOfBirth.toLowerCase().contains("27")
                        || DayOfBirth.toLowerCase().contains("28")
                        || DayOfBirth.toLowerCase().contains("29")
                        || DayOfBirth.toLowerCase().contains("30")
                        || DayOfBirth.toLowerCase().contains("31")) {
                    //assign the value of zodiac variable
                    zodiac = "sagittarius";
                } else {
                    //assign the value of zodiac variable
                    zodiac = "scorpio";
                }
            } // FOR MONTH DECEMBER
            else if (MonthOfBirth.toLowerCase().contains("dec")) {
                if (DayOfBirth.toLowerCase().contains("22")
                        || DayOfBirth.toLowerCase().contains("23")
                        || DayOfBirth.toLowerCase().contains("24")
                        || DayOfBirth.toLowerCase().contains("25")
                        || DayOfBirth.toLowerCase().contains("26")
                        || DayOfBirth.toLowerCase().contains("27")
                        || DayOfBirth.toLowerCase().contains("28")
                        || DayOfBirth.toLowerCase().contains("29")
                        || DayOfBirth.toLowerCase().contains("30")
                        || DayOfBirth.toLowerCase().contains("31")) {
                    //assign the value of zodiac variable
                    zodiac = "capricon";
                } else {
                    //assign the value of zodiac variable
                    zodiac = "sagittarius";
                }

            } else {
                //If valid DOB not entered, text input color is changed and data is not sent.
                txtMonthOfBirth.setBackground(new java.awt.Color(255, 204, 204));
                System.out
                        .println("Please Check your month of Birth and try again!");
            }
            txtMonthOfBirth.setBackground(new java.awt.Color(204, 204, 255));
            txtResult.setText(userName + "\n" + DayOfBirth
                    + MonthOfBirth + "!\n\n" + getColor + getFoodText + getDrinkText + findZodiac(zodiac));
        }
    }//GEN-LAST:event_btnAddActionPerformed


    private void txtNameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNameActionPerformed

    }//GEN-LAST:event_txtNameActionPerformed

    private void txtMonthOfBirthActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtMonthOfBirthActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtMonthOfBirthActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel appLabel;
    private javax.swing.JButton btnAdd;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JComboBox cmbColors;
    private javax.swing.JComboBox cmbDaysOfMonth;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JSeparator jSeparator4;
    private javax.swing.JTextField txtFaveDrink;
    private javax.swing.JTextField txtFaveFood;
    private javax.swing.JTextField txtMonthOfBirth;
    private javax.swing.JTextField txtName;
    private javax.swing.JTextArea txtResult;
    // End of variables declaration//GEN-END:variables



    //These remaining methods below are used to pass exchange SOAP messages between the Client and the Server.
    //These are propertis of the Server AppWepPort
    
    
    //This function happens to be one of the most important method of the program
    //As it is used to passed on the users zodiac sign to the Server, which then returns the description
    //of the personality to the Client via a TextArea on the GUI
    private static String findZodiac(java.lang.String typeZodiacc) {
        knowThySelfGUI.KnowThySelfWebService_Service service = new knowThySelfGUI.KnowThySelfWebService_Service();
        knowThySelfGUI.KnowThySelfWebService port = service.getAppWebPort();
        return port.findZodiac(typeZodiacc);
    }

    //This function is not needed, as the Server doesn't need to return User's date of birth
    //However is imported if theres a need for it.
    private static String getDateOfBirth(java.lang.String dd, java.lang.String mm, int yyyy) {
        knowThySelfGUI.KnowThySelfWebService_Service service = new knowThySelfGUI.KnowThySelfWebService_Service();
        knowThySelfGUI.KnowThySelfWebService port = service.getAppWebPort();
        return port.getDateOfBirth(dd, mm, yyyy);
    }

    private static String getDayOfBirth(java.lang.String dd) {
        knowThySelfGUI.KnowThySelfWebService_Service service = new knowThySelfGUI.KnowThySelfWebService_Service();
        knowThySelfGUI.KnowThySelfWebService port = service.getAppWebPort();
        return port.getDayOfBirth(dd);
    }

    private static String getFaveColor(java.lang.String color) {
        knowThySelfGUI.KnowThySelfWebService_Service service = new knowThySelfGUI.KnowThySelfWebService_Service();
        knowThySelfGUI.KnowThySelfWebService port = service.getAppWebPort();
        return port.getFaveColor(color);
    }

    private static String getFaveDrink(java.lang.String drink) {
        knowThySelfGUI.KnowThySelfWebService_Service service = new knowThySelfGUI.KnowThySelfWebService_Service();
        knowThySelfGUI.KnowThySelfWebService port = service.getAppWebPort();
        return port.getFaveDrink(drink);
    }

    private static String getFaveFood(java.lang.String food) {
        knowThySelfGUI.KnowThySelfWebService_Service service = new knowThySelfGUI.KnowThySelfWebService_Service();
        knowThySelfGUI.KnowThySelfWebService port = service.getAppWebPort();
        return port.getFaveFood(food);
    }

    private static String getMonthOfBirth(java.lang.String monthdob) {
        knowThySelfGUI.KnowThySelfWebService_Service service = new knowThySelfGUI.KnowThySelfWebService_Service();
        knowThySelfGUI.KnowThySelfWebService port = service.getAppWebPort();
        return port.getMonthOfBirth(monthdob);
    }

    private static String welcomeUser(java.lang.String user) {
        knowThySelfGUI.KnowThySelfWebService_Service service = new knowThySelfGUI.KnowThySelfWebService_Service();
        knowThySelfGUI.KnowThySelfWebService port = service.getAppWebPort();
        return port.welcomeUser(user);
    }

}
