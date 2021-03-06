package sk.upjs.ics.traveltracker;


public class UpravitForm extends javax.swing.JFrame {

    VyletDao vyletDao = VyletDaoFactory.INSTANCE.getVyletDao();
    
    public UpravitForm() {
        initComponents();
    }

   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        KrajinaLabel = new javax.swing.JLabel();
        MestoLabel = new javax.swing.JLabel();
        PamiatkaLabel = new javax.swing.JLabel();
        DatumLabel = new javax.swing.JLabel();
        KrajinaTextField = new javax.swing.JTextField();
        MestoTextField = new javax.swing.JTextField();
        PamiatkaTextField = new javax.swing.JTextField();
        NavstiveneLabel = new javax.swing.JLabel();
        NavstiveneTextField = new javax.swing.JTextField();
        HodnotenieLabel = new javax.swing.JLabel();
        HodnotenieTextField = new javax.swing.JTextField();
        PodrobnostiLabel = new javax.swing.JLabel();
        PodrobnostiTextField = new javax.swing.JTextField();
        PoznamkyLabel = new javax.swing.JLabel();
        PoznamkyTextField = new javax.swing.JTextField();
        UpravitKrajinaButton = new javax.swing.JButton();
        UpravitMestoButton = new javax.swing.JButton();
        UpravitPamiatkaButton = new javax.swing.JButton();
        UpravitDatumButton = new javax.swing.JButton();
        UpravitNavstiveneButton = new javax.swing.JButton();
        UpravitHodnotenieButton = new javax.swing.JButton();
        UpravitPodrobnostiButton = new javax.swing.JButton();
        UpravitPoznamkyButton = new javax.swing.JButton();
        jXDatePicker1 = new org.jdesktop.swingx.JXDatePicker();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        KrajinaLabel.setText("Krajina");

        MestoLabel.setText("Mesto");

        PamiatkaLabel.setText("Pamiatka");

        DatumLabel.setText("Datum");

        NavstiveneLabel.setText("Navstivene");

        HodnotenieLabel.setText("Hodnotenie");

        PodrobnostiLabel.setText("Podrobnosti");

        PoznamkyLabel.setText("Poznamky");

        UpravitKrajinaButton.setText("Upraviť");

        UpravitMestoButton.setText("Upraviť");

        UpravitPamiatkaButton.setText("Upraviť");

        UpravitDatumButton.setText("Upraviť");

        UpravitNavstiveneButton.setText("Upraviť");

        UpravitHodnotenieButton.setText("Upraviť");

        UpravitPodrobnostiButton.setText("Upraviť");

        UpravitPoznamkyButton.setText("Upraviť");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(KrajinaLabel)
                            .addComponent(MestoLabel))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(KrajinaTextField)
                            .addComponent(MestoTextField, javax.swing.GroupLayout.DEFAULT_SIZE, 98, Short.MAX_VALUE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(PamiatkaLabel)
                            .addComponent(DatumLabel))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(PamiatkaTextField, javax.swing.GroupLayout.DEFAULT_SIZE, 96, Short.MAX_VALUE)
                            .addComponent(jXDatePicker1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(UpravitKrajinaButton)
                        .addGap(48, 48, 48)
                        .addComponent(NavstiveneLabel)
                        .addGap(18, 18, 18)
                        .addComponent(NavstiveneTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(UpravitNavstiveneButton))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(UpravitMestoButton)
                                .addGap(47, 47, 47)
                                .addComponent(HodnotenieLabel))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(UpravitPamiatkaButton)
                                    .addComponent(UpravitDatumButton))
                                .addGap(45, 45, 45)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(PoznamkyLabel)
                                    .addComponent(PodrobnostiLabel))))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(PoznamkyTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(UpravitPoznamkyButton))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(PodrobnostiTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(UpravitPodrobnostiButton))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(HodnotenieTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(UpravitHodnotenieButton)))))
                .addContainerGap(93, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(KrajinaLabel)
                    .addComponent(KrajinaTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(NavstiveneTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(NavstiveneLabel)
                    .addComponent(UpravitKrajinaButton)
                    .addComponent(UpravitNavstiveneButton))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(MestoLabel)
                    .addComponent(MestoTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(HodnotenieTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(HodnotenieLabel)
                    .addComponent(UpravitMestoButton)
                    .addComponent(UpravitHodnotenieButton))
                .addGap(6, 6, 6)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(PamiatkaLabel)
                    .addComponent(PamiatkaTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(PodrobnostiLabel)
                    .addComponent(PodrobnostiTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(UpravitPamiatkaButton)
                    .addComponent(UpravitPodrobnostiButton))
                .addGap(9, 9, 9)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(PoznamkyLabel, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(DatumLabel)
                        .addComponent(PoznamkyTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(UpravitDatumButton)
                        .addComponent(UpravitPoznamkyButton)
                        .addComponent(jXDatePicker1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(61, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

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
            java.util.logging.Logger.getLogger(UpravitForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(UpravitForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(UpravitForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(UpravitForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new UpravitForm().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel DatumLabel;
    private javax.swing.JLabel HodnotenieLabel;
    private javax.swing.JTextField HodnotenieTextField;
    private javax.swing.JLabel KrajinaLabel;
    private javax.swing.JTextField KrajinaTextField;
    private javax.swing.JLabel MestoLabel;
    private javax.swing.JTextField MestoTextField;
    private javax.swing.JLabel NavstiveneLabel;
    private javax.swing.JTextField NavstiveneTextField;
    private javax.swing.JLabel PamiatkaLabel;
    private javax.swing.JTextField PamiatkaTextField;
    private javax.swing.JLabel PodrobnostiLabel;
    private javax.swing.JTextField PodrobnostiTextField;
    private javax.swing.JLabel PoznamkyLabel;
    private javax.swing.JTextField PoznamkyTextField;
    private javax.swing.JButton UpravitDatumButton;
    private javax.swing.JButton UpravitHodnotenieButton;
    private javax.swing.JButton UpravitKrajinaButton;
    private javax.swing.JButton UpravitMestoButton;
    private javax.swing.JButton UpravitNavstiveneButton;
    private javax.swing.JButton UpravitPamiatkaButton;
    private javax.swing.JButton UpravitPodrobnostiButton;
    private javax.swing.JButton UpravitPoznamkyButton;
    private org.jdesktop.swingx.JXDatePicker jXDatePicker1;
    // End of variables declaration//GEN-END:variables
}
