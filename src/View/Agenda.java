/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package View;

import Controller.AgendaController;
import javax.swing.JComboBox;
import javax.swing.JTable;
import javax.swing.JTextArea;
import javax.swing.JTextField;

/**
 *
 * @author user
 */
public class Agenda extends javax.swing.JFrame {
    private final AgendaController controller;
    /**
     * Creates new form Agenda
     */
    public Agenda() {
        initComponents();
        controller = new AgendaController(this);
       iniciar();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lblValor = new javax.swing.JLabel();
        txfData = new javax.swing.JTextField();
        lblHora = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTxaObservacao = new javax.swing.JTextArea();
        txfHora = new javax.swing.JTextField();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTableResultado = new javax.swing.JTable();
        lblData = new javax.swing.JLabel();
        txfValor = new javax.swing.JTextField();
        lblCliente = new javax.swing.JLabel();
        lblServico = new javax.swing.JLabel();
        selectServico = new javax.swing.JComboBox<>();
        lblId1 = new javax.swing.JLabel();
        txfId = new javax.swing.JTextField();
        selectCliente = new javax.swing.JComboBox<>();
        jButton1 = new javax.swing.JButton();
        lblAgenda = new javax.swing.JLabel();
        painelAgenda = new javax.swing.JLabel();
        backgroundAgenda = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lblValor.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        lblValor.setForeground(new java.awt.Color(255, 255, 255));
        lblValor.setText("Valor R$");
        getContentPane().add(lblValor, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 290, -1, -1));
        getContentPane().add(txfData, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 320, 320, 35));

        lblHora.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        lblHora.setForeground(new java.awt.Color(255, 255, 255));
        lblHora.setText("Hora");
        getContentPane().add(lblHora, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 360, -1, -1));

        jTxaObservacao.setColumns(20);
        jTxaObservacao.setRows(5);
        jScrollPane1.setViewportView(jTxaObservacao);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 160, 560, 190));
        getContentPane().add(txfHora, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 360, 320, 35));

        jTableResultado.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null}
            },
            new String [] {
                "ID", "CLIENTE", "SERVIÇO", "VALOR", "DATA", "HORA", "OBSERVAÇÃO"
            }
        ));
        jScrollPane2.setViewportView(jTableResultado);

        getContentPane().add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 410, 930, 250));

        lblData.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        lblData.setForeground(new java.awt.Color(255, 255, 255));
        lblData.setText("Data");
        getContentPane().add(lblData, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 330, -1, -1));
        getContentPane().add(txfValor, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 280, 320, 35));

        lblCliente.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        lblCliente.setForeground(new java.awt.Color(255, 255, 255));
        lblCliente.setText("Cliente");
        getContentPane().add(lblCliente, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 210, -1, -1));

        lblServico.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        lblServico.setForeground(new java.awt.Color(255, 255, 255));
        lblServico.setText("Serviço");
        getContentPane().add(lblServico, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 250, -1, -1));

        selectServico.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                selectServicoItemStateChanged(evt);
            }
        });
        getContentPane().add(selectServico, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 240, 320, 35));

        lblId1.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        lblId1.setForeground(new java.awt.Color(255, 255, 255));
        lblId1.setText("Id");
        getContentPane().add(lblId1, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 170, -1, -1));

        txfId.setText("0");
        txfId.setEnabled(false);
        getContentPane().add(txfId, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 160, 320, 35));

        getContentPane().add(selectCliente, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 200, 320, 35));

        jButton1.setBackground(new java.awt.Color(204, 255, 153));
        jButton1.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jButton1.setForeground(new java.awt.Color(0, 153, 51));
        jButton1.setText("AGENDAR");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 350, 560, 45));

        lblAgenda.setFont(new java.awt.Font("Segoe UI", 0, 36)); // NOI18N
        lblAgenda.setForeground(new java.awt.Color(255, 255, 255));
        lblAgenda.setText("Agenda");
        getContentPane().add(lblAgenda, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 90, -1, -1));

        painelAgenda.setIcon(new javax.swing.ImageIcon(getClass().getResource("/View/Images/Agenda-PainelFundo.png"))); // NOI18N
        getContentPane().add(painelAgenda, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, -120, -1, -1));

        backgroundAgenda.setIcon(new javax.swing.ImageIcon(getClass().getResource("/View/Images/AgendaFundo.png"))); // NOI18N
        getContentPane().add(backgroundAgenda, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, -120, -1, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void selectServicoItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_selectServicoItemStateChanged
        this.controller.atualizaValor();
    }//GEN-LAST:event_selectServicoItemStateChanged

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
      this.controller.agendar();
    }//GEN-LAST:event_jButton1ActionPerformed

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
            java.util.logging.Logger.getLogger(Agenda.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Agenda.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Agenda.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Agenda.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Agenda().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel backgroundAgenda;
    private javax.swing.JButton jButton1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable jTableResultado;
    private javax.swing.JTextArea jTxaObservacao;
    private javax.swing.JLabel lblAgenda;
    private javax.swing.JLabel lblCliente;
    private javax.swing.JLabel lblData;
    private javax.swing.JLabel lblHora;
    private javax.swing.JLabel lblId1;
    private javax.swing.JLabel lblServico;
    private javax.swing.JLabel lblValor;
    private javax.swing.JLabel painelAgenda;
    private javax.swing.JComboBox<String> selectCliente;
    private javax.swing.JComboBox<String> selectServico;
    private javax.swing.JTextField txfData;
    private javax.swing.JTextField txfHora;
    private javax.swing.JTextField txfId;
    private javax.swing.JTextField txfValor;
    // End of variables declaration//GEN-END:variables

    public JTable getjTableResultado() {
        return jTableResultado;
    }

    public void setjTableResultado(JTable jTableResultado) {
        this.jTableResultado = jTableResultado;
    }

    public JComboBox<String> getSelectCliente() {
        return selectCliente;
    }

    public void setSelectCliente(JComboBox<String> selectCliente) {
        this.selectCliente = selectCliente;
    }

    public JComboBox<String> getSelectServico() {
        return selectServico;
    }

    public void setSelectServico(JComboBox<String> selectServico) {
        this.selectServico = selectServico;
    }

    public JTextField getTxfValor() {
        return txfValor;
    }

    public void setTxfValor(JTextField txfValor) {
        this.txfValor = txfValor;
    }

    public JTextArea getjTxaObservacao() {
        return jTxaObservacao;
    }

    public void setjTxaObservacao(JTextArea jTxaObservacao) {
        this.jTxaObservacao = jTxaObservacao;
    }

    public JTextField getTxfData() {
        return txfData;
    }

    public void setTxfData(JTextField txfData) {
        this.txfData = txfData;
    }

    public JTextField getTxfHora() {
        return txfHora;
    }

    public void setTxfHora(JTextField txfHora) {
        this.txfHora = txfHora;
    }

    public JTextField getTxfId() {
        return txfId;
    }

    public void setTxfId(JTextField txfId) {
        this.txfId = txfId;
    }
    

    private void iniciar() {
         this.controller.atualizaTabela();
         this.controller.atualizaCliente();
         this.controller.atualizaServico();
         this.controller.atualizaValor();
    }
   

}
