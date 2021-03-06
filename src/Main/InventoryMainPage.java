package Main;

import FND.DB.DB;
import FND.Global;
import FND.Log.Console;
import java.awt.Color;
import java.net.InetAddress;
import java.net.UnknownHostException;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;
import okhttp3.MediaType;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.RequestBody;
import okhttp3.Response;

/**
 *
 * @author M.Faisal1521
 */
public class InventoryMainPage extends javax.swing.JFrame implements Runnable {

    /**
     * @return the ConsoleText
     */
    public static javax.swing.JTextArea getConsoleText() {
        return ConsoleText;
    }

    /**
     * @param aConsoleText the ConsoleText to set
     */
    public static void setConsoleText(javax.swing.JTextArea aConsoleText) {
        ConsoleText = aConsoleText;
    }

    public boolean isAppStop = true;
    public static boolean isLogStop = true;

    /**
     * Creates new form FilePrinting
     */
    public InventoryMainPage() {
        initComponents();
        //Start Logging

        //Standard
        SystemInfo.append(getSystemInfo());
        Console.init();

    } //initComponents

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        MainPanel = new javax.swing.JPanel();
        ChildPanel = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jScrollPane3 = new javax.swing.JScrollPane();
        SystemInfo = new javax.swing.JTextArea();
        jLabel3 = new javax.swing.JLabel();
        jpanel1 = new javax.swing.JScrollPane();
        ConsoleText = new javax.swing.JTextArea();
        jLabel1 = new javax.swing.JLabel();
        jSeparator2 = new javax.swing.JSeparator();
        StartButton = new javax.swing.JButton();
        Logging = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Shopify  (Sapphire Retail Limited)");
        setLocation(new java.awt.Point(50, 5));
        addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseDragged(java.awt.event.MouseEvent evt) {
                formMouseDragged(evt);
            }
        });
        addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                formMousePressed(evt);
            }
        });

        MainPanel.setName("Sapphire File Printing"); // NOI18N

        ChildPanel.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setText("System Info :");
        ChildPanel.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 0, -1, -1));

        jScrollPane3.setEnabled(false);

        SystemInfo.setBackground(new java.awt.Color(204, 204, 204));
        SystemInfo.setColumns(20);
        SystemInfo.setLineWrap(true);
        SystemInfo.setRows(5);
        jScrollPane3.setViewportView(SystemInfo);

        ChildPanel.add(jScrollPane3, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 20, 370, 40));

        jLabel3.setText("Console:");
        ChildPanel.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 50, -1, -1));

        ConsoleText.setBackground(new java.awt.Color(0, 0, 0));
        ConsoleText.setColumns(20);
        ConsoleText.setForeground(java.awt.SystemColor.controlHighlight);
        ConsoleText.setRows(5);
        jpanel1.setViewportView(ConsoleText);

        ChildPanel.add(jpanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 70, 1010, 460));

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        jLabel1.setText("JMS - Sapphire");
        ChildPanel.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 10, -1, -1));

        javax.swing.GroupLayout MainPanelLayout = new javax.swing.GroupLayout(MainPanel);
        MainPanel.setLayout(MainPanelLayout);
        MainPanelLayout.setHorizontalGroup(
            MainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(MainPanelLayout.createSequentialGroup()
                .addComponent(ChildPanel, javax.swing.GroupLayout.PREFERRED_SIZE, 1041, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(8, 8, 8)
                .addComponent(jSeparator2)
                .addContainerGap())
        );
        MainPanelLayout.setVerticalGroup(
            MainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(MainPanelLayout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(511, Short.MAX_VALUE))
            .addComponent(ChildPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        StartButton.setBackground(new java.awt.Color(102, 255, 102));
        StartButton.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        StartButton.setText("Start");
        StartButton.setContentAreaFilled(false);
        StartButton.setFocusPainted(false);
        StartButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                StartButtonMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                StartButtonMouseEntered(evt);
            }
        });

        Logging.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        Logging.setToolTipText("");
        Logging.setContentAreaFilled(false);
        Logging.setFocusPainted(false);
        Logging.setFocusable(false);
        Logging.setLabel("Show Log");
        Logging.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                LoggingMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(Logging, javax.swing.GroupLayout.DEFAULT_SIZE, 153, Short.MAX_VALUE)
                    .addComponent(StartButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(MainPanel, javax.swing.GroupLayout.PREFERRED_SIZE, 1031, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(99, 99, 99)
                .addComponent(StartButton, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(Logging, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(MainPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void formMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_formMousePressed

    }//GEN-LAST:event_formMousePressed

    private void formMouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_formMouseDragged

    }//GEN-LAST:event_formMouseDragged

    private void StartButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_StartButtonMouseClicked
        // TODO add your handling code here:

        if (isAppStop) {
            isAppStop = false;
            StartButton.setText("Stop");
            StartButton.setBackground(Color.red);
            StartButton.setForeground(Color.red);
        } else {
            isAppStop = true;
            StartButton.setText("Start");
            StartButton.setBackground(Color.green);
            StartButton.setForeground(Color.BLACK);
            return;
        }

        Thread customThread;

        customThread = new Thread(this);
        customThread.setName("SMS");
        customThread.start();

    }//GEN-LAST:event_StartButtonMouseClicked

    private void LoggingMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_LoggingMouseClicked
        // TODO add your handling code here:
        if (isLogStop) {
            isLogStop = false;
            this.Logging.setText("Hide Log");
            Logging.setBackground(Color.red);
            Logging.setForeground(Color.red);
        } else {
            isLogStop = true;
            Logging.setText("Show Log");
            Logging.setBackground(Color.green);
            Logging.setForeground(Color.BLACK);
            this.getConsoleText().setText(null);
        }


    }//GEN-LAST:event_LoggingMouseClicked

    private void StartButtonMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_StartButtonMouseEntered
        // TODO add your handling code here:
    }//GEN-LAST:event_StartButtonMouseEntered

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
            java.util.logging.Logger.getLogger(InventoryMainPage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(InventoryMainPage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(InventoryMainPage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(InventoryMainPage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new InventoryMainPage().setVisible(true);
            }
        });

    }

    public String getSystemInfo() {
        String G_SystemUserName = null;
        //CustomCode for Details
        try {
            InetAddress ip = InetAddress.getLocalHost();
            if (ip.getHostAddress() != null) {
                G_SystemUserName = System.getProperty("user.name") + " / " + System.getProperty("os.name") + " / " + ip.getHostAddress();
            }
        } catch (UnknownHostException ex) {

            Logger.getLogger(InventoryMainPage.class.getName()).log(Level.SEVERE, null, ex);
            Console.write("Error at getSystemInfo / " + ex.getMessage());
        }

        return G_SystemUserName;
    }


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel ChildPanel;
    private static javax.swing.JTextArea ConsoleText;
    private javax.swing.JButton Logging;
    private javax.swing.JPanel MainPanel;
    private javax.swing.JButton StartButton;
    private javax.swing.JTextArea SystemInfo;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JScrollPane jpanel1;
    // End of variables declaration//GEN-END:variables

    @Override
    public void run() {
        ///Thread Handling
        try {

            Console.write("Thread Start :  " + Thread.currentThread().getName());

            if (Thread.currentThread().getName().equals("SMS")) {
                //
                this.SMS();
            }

        } catch (Exception e) {
            Console.write("Error / " + e.getMessage());
        }

    }

    private int getRowCount(ResultSet resultSet) {
        if (resultSet == null) {
            return 0;
        }

        try {
            resultSet.last();
            return resultSet.getRow();
        } catch (SQLException exp) {
            exp.printStackTrace();
        } finally {
            try {
                resultSet.beforeFirst();
            } catch (SQLException exp) {
                exp.printStackTrace();
            }
        }

        return 0;
    }

    // End Fetchcity
    private void SMS() throws InterruptedException {

        Statement stmt = null;

        DB dbConnection = new DB();

        while (!this.isAppStop) {
            Thread.sleep(10000);
            //Report
            try {
                stmt = dbConnection.getCandelaConnection().createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE, ResultSet.CONCUR_READ_ONLY);
                ResultSet rs = stmt.executeQuery("select phone_Mobile , textMessage,sale_id , shop_id  from SRL_SEND_SALE_SMS_V where shop_id =" + Global.ShopID);

                ///getRowCount
                for (int i = 1; i <= getRowCount(rs); i++) {
                    rs.absolute(i); //MOVE TO ROW
                    
                    Console.show(rs.getString("phone_Mobile"));
                    Console.show(rs.getString("textMessage"));
                    
                    String l_response = new String();
                    try {

                        //////////////////
                        OkHttpClient client = new OkHttpClient().newBuilder()
                                .build();
                        Request request = new Request.Builder()
                                .url(Global.SMS_API_URL + "Username=" + Global.SMS_API_Number + "&Password=" + Global.SMS_API_Password + "&From=SAPPHIRE&To=" + rs.getString("phone_Mobile") + "&Message=" + rs.getString("textMessage"))
                                .method("GET", null)
                                .build();         
                        Response response = client.newCall(request).execute();
                        l_response = response.body().string();
                        
                        Console.show("SMS Response : "+l_response);
                        
                        PreparedStatement INSERT_LINE = dbConnection.getCandelaConnection().prepareStatement("insert into tblwalkincustomer (shop_id,sale_id,mobile_number,status) values (" + rs.getString("shop_id") + "," + rs.getString("sale_id") + ",'" + rs.getString("phone_Mobile") + "','" + l_response + "'); ");
                        INSERT_LINE.executeUpdate();
                        
                        Console.show("Insert Done.");
                    } catch (Exception ex) {
                        l_response = ex.getMessage();
                        Console.show("Error Response : "+l_response);
                    }
                }
            } catch (NullPointerException | SQLException e) {
                Console.show("Data Query Errors " + e.getMessage());
            }
        }
    } //SMS
}
