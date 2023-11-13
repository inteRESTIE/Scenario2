
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import javax.swing.JOptionPane;
import java.awt.print.PrinterException;
import java.awt.print.PrinterJob; 
import java.awt.print.Printable;
import java.awt.print.*;


/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Desktop
 */
public class AddOrder extends javax.swing.JFrame {
    private String orderDetails;
    /**
     * Creates new form AddOrder
     */
    public AddOrder() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        orderproduct = new javax.swing.JComboBox<>();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        orderquantity = new javax.swing.JTextField();
        jButton3 = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        ordername = new javax.swing.JTextField();
        jScrollPane2 = new javax.swing.JScrollPane();
        orderprint = new javax.swing.JTextArea();
        jButton2 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();

        jTextArea1.setColumns(20);
        jTextArea1.setRows(5);
        jScrollPane1.setViewportView(jTextArea1);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Impact", 0, 36)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("ORDER");

        orderproduct.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                orderproductActionPerformed(evt);
            }
        });

        jLabel2.setText("Product:");

        jLabel3.setText("Quantity:");

        orderquantity.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                orderquantityActionPerformed(evt);
            }
        });

        jButton3.setText("ADD");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        jLabel4.setText("Customer's Name:");

        orderprint.setEditable(false);
        orderprint.setColumns(20);
        orderprint.setRows(5);
        jScrollPane2.setViewportView(orderprint);

        jButton2.setText("exit");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jButton4.setText("Print");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });

        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/logo.png"))); // NOI18N

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jButton2)
                .addGap(17, 17, 17))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(54, 54, 54)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel3)
                            .addComponent(jLabel4)
                            .addComponent(jLabel2)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(37, 37, 37)
                        .addComponent(jLabel5)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jButton4))
                    .addComponent(jButton3, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jScrollPane2)
                    .addComponent(orderquantity)
                    .addComponent(ordername)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(orderproduct, javax.swing.GroupLayout.PREFERRED_SIZE, 297, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addGap(57, 57, 57))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(orderproduct, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(orderquantity, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3))
                .addGap(17, 17, 17)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(ordername, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4))
                .addGap(15, 15, 15)
                .addComponent(jButton3)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, 106, Short.MAX_VALUE)
                    .addComponent(jScrollPane2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jButton4)
                .addGap(17, 17, 17)
                .addComponent(jButton2)
                .addGap(15, 15, 15))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    void AddOrderCombo(){
        PreparedStatement ps;
        ResultSet rs;
        String sql = "SELECT * FROM `product`";
        try{
            ps = dbConnect.getConnection().prepareStatement(sql);
            rs = ps.executeQuery();
            
            while(rs.next()){
                orderproduct.addItem(rs.getString("Product_Name"));
            }
        }catch(Exception ex){
            JOptionPane.showMessageDialog(null,ex);
        } 
    
    }
    
    private void orderproductActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_orderproductActionPerformed
        // TODO add your handling code here:
        
    }//GEN-LAST:event_orderproductActionPerformed

    private void orderquantityActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_orderquantityActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_orderquantityActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        // TODO add your handling code here:
        PreparedStatement ps;
        ResultSet rs;
        String selectedItem = orderproduct.getSelectedItem().toString();

        try{
        if (selectedItem == null|| orderquantity.getText().isEmpty() || ordername.getText().isEmpty()) {
                JOptionPane.showMessageDialog(null, "Please fill in the required fields.");
            
            }
        String getProductQuantityQuery = "SELECT `Quantity`,`Price`,`Sales` FROM `product` WHERE `Product_Name`=?";
 
        ps = dbConnect.getConnection().prepareStatement(getProductQuantityQuery);
        ps.setString(1, selectedItem);
        rs = ps.executeQuery();
        
        if (rs.next()) {
            int currentQuantity = rs.getInt("Quantity");
            int price = rs.getInt("Price");
            int sales = rs.getInt("Sales");
            
            int orderedQuantity = Integer.parseInt(orderquantity.getText());
            
            // Check if there's enough quantity available for the order
            if (orderedQuantity > currentQuantity) {
            JOptionPane.showMessageDialog(null, "Not enough quantity available for the order.");
            return;
            }
            
        int newQuantity = currentQuantity - orderedQuantity;
        int subTotal = price*orderedQuantity;
        int newSales = sales+subTotal;

        
        
        String updateQuantityQuery = "UPDATE `product` SET `Quantity`=?,`Sales`=? WHERE `Product_Name`=?";
        ps = dbConnect.getConnection().prepareStatement(updateQuantityQuery);
        ps.setInt(1, newQuantity);
        ps.setInt(2, newSales);
        ps.setString(3, selectedItem);
        ps.executeUpdate(); 
        
            
        
        String insertQuery = "INSERT INTO `order`(`customer`, `product_order`, `quantity_order`,`subtotal`) VALUES (?,?,?,?)";
        ps = dbConnect.getConnection().prepareStatement(insertQuery);

        
        ps.setString(1, ordername.getText());
        ps.setString(2, selectedItem);
        ps.setString(3, orderquantity.getText());
        ps.setInt(4, subTotal);
        
        String subt = String.valueOf(subTotal);
        
        int rows = ps.executeUpdate();
        if (rows > 0) {
            JOptionPane.showMessageDialog(null, "order added successfully.");
   
                String customer = ordername.getText();
                orderquantity.setText(null);
                ordername.setText(null);
                
                orderprint.setText("Customer:   " + customer
                        +          "\nProduct:       "+ selectedItem
                        +          "\nPrice:           "+ price
                        +          "\nQuantity:      "+ orderedQuantity
                        +          "\n                                                                    Total: "+subt);
                
            } else {
            JOptionPane.showMessageDialog(null, "Failed to add order.");
            }
        }
        }catch(Exception e){
            JOptionPane.showMessageDialog(null, "Error: " + e.getMessage());
        }    
    }//GEN-LAST:event_jButton3ActionPerformed

    private void printOrder(String orderDetails) {
    PrinterJob printerJob = PrinterJob.getPrinterJob();
    printerJob.setJobName("Order Details");

    printerJob.setPrintable(new java.awt.print.Printable() {
        public int print(java.awt.Graphics graphics, java.awt.print.PageFormat pageFormat, int pageIndex)
                throws java.awt.print.PrinterException {
            if (pageIndex > 0) {
                return Printable.NO_SUCH_PAGE;
            }

            java.awt.Graphics2D g2d = (java.awt.Graphics2D) graphics;
            g2d.translate(pageFormat.getImageableX(), pageFormat.getImageableY());

            
            g2d.setFont(new java.awt.Font("Arial", java.awt.Font.PLAIN, 12));
            String[] lines = orderDetails.split("\\n");
            int y = 20; 
            for (String line : lines) {
                g2d.drawString(line, 20, y);
                y += 20; 
            }

            return Printable.PAGE_EXISTS;
        }
    });

    if (printerJob.printDialog()) {
        try {
            printerJob.print();
        } catch (PrinterException ex) {
            ex.printStackTrace();
        }
    }
}
    
    
    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        // TODO add your handling code here:
        orderDetails = orderprint.getText();
        if (orderDetails.isEmpty()) {
            JOptionPane.showMessageDialog(null, "No order details to print.");
        } else {
            printPreview();
        }
    }//GEN-LAST:event_jButton4ActionPerformed
    private void printPreview() {
        PrinterJob printerJob = PrinterJob.getPrinterJob();
        printerJob.setJobName("Order Details");

        // Create a Book object to store the pages
        Book book = new Book();

        // Get the default page format
        PageFormat pageFormat = printerJob.defaultPage();
        
        // Set the paper size for the preview (300x400 in this example)
        Paper paper = new Paper();
        paper.setSize(300, 400);
        pageFormat.setPaper(paper);

        // Add the PrintableOrder object to the book
        book.append(new PrintableOrder(orderDetails), pageFormat);

        // Set the Pageable object for the PrinterJob
        printerJob.setPageable(book);

        // Show print dialog to configure print settings
        if (printerJob.printDialog()) {
            try {
                // Print the document
                printerJob.print();
            } catch (PrinterException ex) {
                ex.printStackTrace();
            }
        }
    }
    private class PrintableOrder implements Printable {

        private String orderDetails;

        public PrintableOrder(String orderDetails) {
            this.orderDetails = orderDetails;
        }

        @Override
        public int print(Graphics graphics, PageFormat pageFormat, int pageIndex) throws PrinterException {
            if (pageIndex > 0) {
                // No more pages
                return Printable.NO_SUCH_PAGE;
            }

            // Cast Graphics to Graphics2D
            Graphics2D g2d = (Graphics2D) graphics;

            // Translate the origin to the starting point of the printable area
            g2d.translate(pageFormat.getImageableX(), pageFormat.getImageableY());

            // Set font and other styles
            g2d.setFont(new java.awt.Font("Arial", java.awt.Font.PLAIN, 12));
            String[] lines = orderDetails.split("\\n");
            int y = 20;

            // Draw the lines of the order details
            for (String line : lines) {
                g2d.drawString(line, 20, y);
                y += 20;
            }

            // Page exists, so return PAGE_EXISTS
            return Printable.PAGE_EXISTS;
        }
    }    
    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
        dispose();
        
    }//GEN-LAST:event_jButton2ActionPerformed

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
            java.util.logging.Logger.getLogger(AddOrder.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(AddOrder.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(AddOrder.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(AddOrder.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new AddOrder().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTextArea jTextArea1;
    private javax.swing.JTextField ordername;
    private javax.swing.JTextArea orderprint;
    private javax.swing.JComboBox<String> orderproduct;
    private javax.swing.JTextField orderquantity;
    // End of variables declaration//GEN-END:variables
}
