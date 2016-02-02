/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package collectorsworld;

import com.onbarcode.barcode.Code128;
import static com.sun.org.apache.xalan.internal.xsltc.compiler.util.Type.Int;
import java.sql.Connection;
import javax.swing.JOptionPane;
import net.proteanit.sql.DbUtils;
import oracle.jdbc.OraclePreparedStatement;
import oracle.jdbc.OracleResultSet;

/**
 *
 * @author John
 */
public class UserPanel extends javax.swing.JFrame {

    /**
     * Creates new form UserPanel
     */
    Connection conn=null;
    OraclePreparedStatement pst =null;
    OracleResultSet rs = null;
    
    public UserPanel() {
        initComponents();
        this.setTitle("Collectors World - User Panel");
        this.setLocationRelativeTo(null);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel2 = new javax.swing.JPanel();
        updateButton = new javax.swing.JButton();
        locationUpdateTextField = new javax.swing.JTextField();
        categoryUpdateTextField = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        nameUpdateTextField = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jScrollPane3 = new javax.swing.JScrollPane();
        descriptionUpdateTextField = new javax.swing.JTextArea();
        deleteButton = new javax.swing.JButton();
        quantityTextField = new javax.swing.JTextField();
        addToCartButton = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        availableQuantityUpdateTextField = new javax.swing.JTextField();
        priceUpdateTextField = new javax.swing.JTextField();
        barcodeButton = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        vatTextField = new javax.swing.JTextField();
        discountTextField = new javax.swing.JTextField();
        jPanel3 = new javax.swing.JPanel();
        searchTextField = new javax.swing.JTextField();
        insertButton = new javax.swing.JButton();
        searchButton = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        resultTable = new javax.swing.JTable();
        jPanel4 = new javax.swing.JPanel();
        exitButton = new javax.swing.JButton();
        logoutButton = new javax.swing.JButton();
        updateAccountButton = new javax.swing.JButton();
        billsButton = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Information", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Calibri", 0, 18), java.awt.Color.black)); // NOI18N

        updateButton.setText("Update");
        updateButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                updateButtonActionPerformed(evt);
            }
        });

        jLabel5.setText("Name");

        nameUpdateTextField.setEditable(false);

        jLabel6.setText("Description");

        jLabel7.setText("Location");

        jLabel8.setText("Category");

        descriptionUpdateTextField.setColumns(20);
        descriptionUpdateTextField.setRows(5);
        jScrollPane3.setViewportView(descriptionUpdateTextField);
        descriptionUpdateTextField.setLineWrap(true);

        deleteButton.setText("Delete");
        deleteButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                deleteButtonActionPerformed(evt);
            }
        });

        quantityTextField.setText("0");
        quantityTextField.setToolTipText("Quantity");

        addToCartButton.setText("Confirm Sell");
        addToCartButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addToCartButtonActionPerformed(evt);
            }
        });

        jLabel1.setText("Available Quantity");

        jLabel2.setText("Price");

        barcodeButton.setText("Barcode");
        barcodeButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                barcodeButtonActionPerformed(evt);
            }
        });

        jLabel3.setText("Quantity");

        jLabel4.setText("VAT");

        jLabel9.setText("Discount");

        vatTextField.setText("0");

        discountTextField.setText("0");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel5)
                            .addComponent(jLabel7))
                        .addGap(61, 61, 61)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(nameUpdateTextField)
                            .addComponent(locationUpdateTextField)))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel3)
                            .addComponent(jLabel9))
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(updateButton)
                        .addGap(18, 18, 18)
                        .addComponent(deleteButton))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1)
                            .addComponent(jLabel8)
                            .addComponent(jLabel2)
                            .addComponent(jLabel6)
                            .addComponent(barcodeButton)
                            .addComponent(jLabel4))
                        .addGap(13, 13, 13)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane3, javax.swing.GroupLayout.DEFAULT_SIZE, 243, Short.MAX_VALUE)
                            .addComponent(priceUpdateTextField)
                            .addComponent(categoryUpdateTextField)
                            .addComponent(availableQuantityUpdateTextField)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(quantityTextField, javax.swing.GroupLayout.DEFAULT_SIZE, 50, Short.MAX_VALUE)
                                    .addComponent(vatTextField)
                                    .addComponent(discountTextField))
                                .addGap(45, 45, 45)
                                .addComponent(addToCartButton)
                                .addGap(0, 0, Short.MAX_VALUE)))))
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(nameUpdateTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(locationUpdateTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel7))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel8)
                    .addComponent(categoryUpdateTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1)
                    .addComponent(availableQuantityUpdateTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2)
                    .addComponent(priceUpdateTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel6)
                        .addGap(18, 18, 18)
                        .addComponent(barcodeButton))
                    .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(11, 11, 11)
                        .addComponent(quantityTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(updateButton)
                            .addComponent(deleteButton)
                            .addComponent(jLabel3))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel4)
                            .addComponent(vatTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel9)
                            .addComponent(discountTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(addToCartButton))
                        .addGap(43, 43, 43))))
        );

        jPanel3.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Collections", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Calibri", 0, 18), java.awt.Color.black)); // NOI18N

        searchTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                searchTextFieldActionPerformed(evt);
            }
        });
        searchTextField.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                searchTextFieldKeyPressed(evt);
            }
        });

        insertButton.setText("Insert");
        insertButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                insertButtonActionPerformed(evt);
            }
        });

        searchButton.setText("Search");
        searchButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                searchButtonActionPerformed(evt);
            }
        });

        resultTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        resultTable.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                resultTableMousePressed(evt);
            }
        });
        jScrollPane1.setViewportView(resultTable);

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                        .addComponent(searchTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 216, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(searchButton)
                        .addGap(18, 18, 18)
                        .addComponent(insertButton))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 366, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(searchButton)
                    .addComponent(insertButton)
                    .addComponent(searchTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 194, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(117, 117, 117))
        );

        jPanel4.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        exitButton.setText("Exit");
        exitButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                exitButtonActionPerformed(evt);
            }
        });

        logoutButton.setText("Log Out");
        logoutButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                logoutButtonActionPerformed(evt);
            }
        });

        updateAccountButton.setText("Access Information");
        updateAccountButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                updateAccountButtonActionPerformed(evt);
            }
        });

        billsButton.setText("Bills");
        billsButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                billsButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(billsButton)
                .addGap(18, 18, 18)
                .addComponent(logoutButton)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(updateAccountButton)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(exitButton)
                .addContainerGap())
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(logoutButton)
                    .addComponent(exitButton)
                    .addComponent(updateAccountButton)
                    .addComponent(billsButton))
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 16, Short.MAX_VALUE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, 331, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 38, Short.MAX_VALUE)
                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(60, 60, 60))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void exitButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_exitButtonActionPerformed
        // TODO add your handling code here:
        System.exit(0);
    }//GEN-LAST:event_exitButtonActionPerformed

    private void logoutButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_logoutButtonActionPerformed
        // TODO add your handling code here:
        int dialogButton = JOptionPane.YES_NO_OPTION;
        int dialogResult = JOptionPane.showConfirmDialog(this, "Are you sure you want to log out?", "Alert",dialogButton);
        if(dialogResult==0){
            //System.out.println("Yes option");
            Login obj = new Login();
            obj.setVisible(true);
            this.setVisible(false);
        }else{
            //System.out.println("No Option");
        }
    }//GEN-LAST:event_logoutButtonActionPerformed

    private void insertButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_insertButtonActionPerformed
        // TODO add your handling code here:
        InsertItem obj = new InsertItem();
        obj.setVisible(true);
    }//GEN-LAST:event_insertButtonActionPerformed

    private void searchTextFieldKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_searchTextFieldKeyPressed
        // TODO add your handling code here:
        if(evt.getKeyCode()==10){
            searchButton.doClick();
        }else{
            nameUpdateTextField.setText("");
            locationUpdateTextField.setText("");
            categoryUpdateTextField.setText("");
            descriptionUpdateTextField.setText("");
        }
    }//GEN-LAST:event_searchTextFieldKeyPressed

    private void searchButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_searchButtonActionPerformed
        // TODO add your handling code here:
        String str = searchTextField.getText();
        try{
            //JOptionPane.showMessageDialog(null, str);
            conn = MyConnection.ConnectDB();
            String sql = "select * from products where name like ?";
            pst = (OraclePreparedStatement)conn.prepareStatement(sql);
            pst.setString(1, "%" + str + "%");
            rs=(OracleResultSet) pst.executeQuery();
            resultTable.setModel(DbUtils.resultSetToTableModel(rs));
            //searchTextField.setText("");
        }catch(Exception e){
            JOptionPane.showMessageDialog(null, e);
        }
    }//GEN-LAST:event_searchButtonActionPerformed

    private void updateButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_updateButtonActionPerformed
        // TODO add your handling code here:
        String name = nameUpdateTextField.getText();
        String location = locationUpdateTextField.getText();
        String category = categoryUpdateTextField.getText();
        String description = descriptionUpdateTextField.getText();
        String price = priceUpdateTextField.getText();
        String quantity = availableQuantityUpdateTextField.getText();

        if( name.equals("") || location.equals("") || category.equals("")){
            JOptionPane.showMessageDialog(null, "Please insert all fields [description is not mandatory]");
        }else{
            conn = MyConnection.ConnectDB();
            try{                
                String sql = "update products set location=?, category=?, description=?, price=?, quantity=? where name=?";
                pst = (OraclePreparedStatement)conn.prepareStatement(sql);                
                pst.setString(1,location);
                pst.setString(2,category);
                pst.setString(3,description);
                pst.setString(4,price);
                pst.setString(5,quantity);
                pst.setString(6,name);
                pst.executeUpdate();
                sql = "commit";
                pst = (OraclePreparedStatement)conn.prepareStatement(sql);
                pst.executeUpdate();
                JOptionPane.showMessageDialog(null, "Succesfully Updated.");
                searchButton.doClick();
                    
            }catch(Exception e){
                //System.out.println(e);
                JOptionPane.showMessageDialog(null, e);
            }
        }
    }//GEN-LAST:event_updateButtonActionPerformed

    private void resultTableMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_resultTableMousePressed
        // TODO add your handling code here:
        try{
            int row = resultTable.getSelectedRow();
            String str = (resultTable.getModel().getValueAt(row, 0).toString());
            conn = MyConnection.ConnectDB();

            String sql = "select * from products where name=?";
            pst = (OraclePreparedStatement)conn.prepareStatement(sql);
            pst.setString(1,str);
            rs = (OracleResultSet) pst.executeQuery();
            if(rs.next()){
                nameUpdateTextField.setText(rs.getString("name"));
                locationUpdateTextField.setText(rs.getString("location"));
                categoryUpdateTextField.setText(rs.getString("category"));
                descriptionUpdateTextField.setText(rs.getString("description"));
                priceUpdateTextField.setText(rs.getString("price"));
                availableQuantityUpdateTextField.setText(rs.getString("quantity"));
            }
            
        }catch(Exception e){
            JOptionPane.showMessageDialog(null, e);
        }
        
    }//GEN-LAST:event_resultTableMousePressed

    private void deleteButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_deleteButtonActionPerformed
        // TODO add your handling code here:
        int dialogButton = JOptionPane.YES_NO_OPTION;
        int dialogResult = JOptionPane.showConfirmDialog(this, "Are you sure you want to delete this item?", "Alert",dialogButton);
        if(dialogResult==0){
            String name = nameUpdateTextField.getText();
            conn = MyConnection.ConnectDB();
            try{                
                String sql = "delete from products where name=?";
                pst = (OraclePreparedStatement)conn.prepareStatement(sql);                
                pst.setString(1,name);
                pst.executeUpdate();
                sql = "commit";
                pst = (OraclePreparedStatement)conn.prepareStatement(sql);
                pst.executeQuery();
                JOptionPane.showMessageDialog(null, "Succesfully Deleted.");
                searchButton.doClick();

            }catch(Exception e){
                //System.out.println(e);
                JOptionPane.showMessageDialog(null, e);
            }
        }
        
    }//GEN-LAST:event_deleteButtonActionPerformed

    private void updateAccountButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_updateAccountButtonActionPerformed
        // TODO add your handling code here:
        AccountInformation obj = new AccountInformation();
        obj.setVisible(true);
    }//GEN-LAST:event_updateAccountButtonActionPerformed

    private void searchTextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_searchTextFieldActionPerformed
        // TODO add your handling code here:
        searchButton.doClick();
    }//GEN-LAST:event_searchTextFieldActionPerformed

    private void barcodeButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_barcodeButtonActionPerformed
        // TODO add your handling code here:
        try{
            Code128 barcode = new Code128(); 
            barcode.setData(nameUpdateTextField.getText()); 
            barcode.setX(2); 
            barcode.drawBarcode("C://test//"+nameUpdateTextField.getText()+".jpg"); 
            JOptionPane.showMessageDialog(null, "Generated on: C://test//"+nameUpdateTextField.getText()+".jpg");
        }catch(Exception e){
            JOptionPane.showMessageDialog(null, e);
        }
    }//GEN-LAST:event_barcodeButtonActionPerformed

    private void addToCartButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addToCartButtonActionPerformed
        // TODO add your handling code here:
        String name = nameUpdateTextField.getText();
        double price = Double.parseDouble(priceUpdateTextField.getText());
        double vat = Double.parseDouble(vatTextField.getText());
        double discount = Double.parseDouble(discountTextField.getText());
        
        int quantity = Integer.parseInt(quantityTextField.getText());
        int availableQuantity = Integer.parseInt(availableQuantityUpdateTextField.getText());
        int diff=availableQuantity-quantity;
        double subtotal = (quantity*price+quantity*price*vat/100)-(quantity*price+quantity*price*vat/100)*(discount/100);
        if(quantity<=0 || diff<0){
            JOptionPane.showMessageDialog(null, "Quantity out of limit.");
        }else{
            conn = MyConnection.ConnectDB();
            try{
              
                String sql = "insert into cart(product_name,quantity,unit_price,vat,discount,sub_total) values (?,?,?,?,?,?)";
                pst = (OraclePreparedStatement)conn.prepareStatement(sql);
                pst.setString(1,name);
                pst.setString(2,Double.toString(quantity));
                pst.setString(3,Double.toString(price));
                pst.setString(4,Double.toString(vat));
                pst.setString(5,Double.toString(discount));
                pst.setString(6,Double.toString(subtotal));
                
                pst.executeUpdate();
                
                sql = "update products set quantity=? where name=?";
                pst = (OraclePreparedStatement)conn.prepareStatement(sql);
                pst.setString(1, Integer.toString(diff));
                pst.setString(2, name);
                pst.executeUpdate();
                
                sql = "commit";
                pst = (OraclePreparedStatement)conn.prepareStatement(sql);
                pst.executeQuery();                
              
                JOptionPane.showMessageDialog(null, "Successfully Sold.");
            }catch(Exception e){
                //System.out.println(e);
                JOptionPane.showMessageDialog(null, e);
            }
        }
    }//GEN-LAST:event_addToCartButtonActionPerformed

    private void billsButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_billsButtonActionPerformed
        // TODO add your handling code here:
        ShowBills obj = new ShowBills();
        obj.setVisible(true);
    }//GEN-LAST:event_billsButtonActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(UserPanel.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(UserPanel.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(UserPanel.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(UserPanel.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new UserPanel().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton addToCartButton;
    private javax.swing.JTextField availableQuantityUpdateTextField;
    private javax.swing.JButton barcodeButton;
    private javax.swing.JButton billsButton;
    private javax.swing.JTextField categoryUpdateTextField;
    private javax.swing.JButton deleteButton;
    private javax.swing.JTextArea descriptionUpdateTextField;
    private javax.swing.JTextField discountTextField;
    private javax.swing.JButton exitButton;
    private javax.swing.JButton insertButton;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JTextField locationUpdateTextField;
    private javax.swing.JButton logoutButton;
    private javax.swing.JTextField nameUpdateTextField;
    private javax.swing.JTextField priceUpdateTextField;
    private javax.swing.JTextField quantityTextField;
    private javax.swing.JTable resultTable;
    private javax.swing.JButton searchButton;
    private javax.swing.JTextField searchTextField;
    private javax.swing.JButton updateAccountButton;
    private javax.swing.JButton updateButton;
    private javax.swing.JTextField vatTextField;
    // End of variables declaration//GEN-END:variables
}

