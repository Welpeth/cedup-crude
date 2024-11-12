package Telas;

// Passo 1; Importar os módulos e blibliotecas
import DataAccess.ModuloDbConnect;
import java.awt.Color;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import javax.swing.JOptionPane;

public class TelaLogin extends javax.swing.JFrame {

    // Passo 2 - Definir as variaveis auxiliares para a conexão
    Connection conexao = null; // retorna o status da conexão
    PreparedStatement pst = null; // Coloca o comando SQL na conexão do banco
    ResultSet rs = null; // Retornar o resultado do comando executado no banco
    
    
    public TelaLogin() {
        initComponents();
        
        // Passo 3 - Estabelecer/executar a conexão com o banco
        conexao = ModuloDbConnect.connector();
        // Testando o resultado  da conexao
        if (conexao != null) {
            System.out.println("String da conexao Ok: " + conexao);
            lblStatusDB.setText("Conectado OK!");
            lblStatusDB.setForeground(Color.blue);
        }else {
            lblStatusDB.setText("NÃO Conectado.");
            lblStatusDB.setForeground(Color.red);
            }
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btnSairLogin = new javax.swing.JButton();
        lblStatusDB = new javax.swing.JLabel();
        btnLogin = new javax.swing.JButton();
        lblUsuario = new javax.swing.JLabel();
        lblSenha = new javax.swing.JLabel();
        txtUserTela = new javax.swing.JTextField();
        lblNomeSis = new javax.swing.JLabel();
        txtSenhaTela = new javax.swing.JPasswordField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Sistema de LOGIN");
        setResizable(false);

        btnSairLogin.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btnSairLogin.setText("Sair");
        btnSairLogin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSairLoginActionPerformed(evt);
            }
        });

        lblStatusDB.setText("Conexao do banco");

        btnLogin.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btnLogin.setText("Login");
        btnLogin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLoginActionPerformed(evt);
            }
        });

        lblUsuario.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        lblUsuario.setText("Usuário:");

        lblSenha.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        lblSenha.setText("Senha:");

        lblNomeSis.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        lblNomeSis.setText("Bem Vindo ao Sistema Experimental !!!");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(lblUsuario)
                            .addComponent(lblStatusDB, javax.swing.GroupLayout.PREFERRED_SIZE, 155, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(116, 116, 116)
                        .addComponent(lblSenha)))
                .addGap(36, 36, 36)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(txtUserTela, javax.swing.GroupLayout.DEFAULT_SIZE, 176, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(29, 29, 29)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(btnLogin)
                            .addComponent(btnSairLogin)))
                    .addComponent(txtSenhaTela))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 115, Short.MAX_VALUE)
                .addComponent(lblNomeSis)
                .addGap(72, 72, 72))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addComponent(lblNomeSis)
                .addGap(46, 46, 46)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblUsuario)
                    .addComponent(txtUserTela, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(27, 27, 27)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblSenha)
                    .addComponent(txtSenhaTela, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(54, 54, 54)
                .addComponent(btnLogin)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnSairLogin)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 77, Short.MAX_VALUE)
                .addComponent(lblStatusDB, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        setSize(new java.awt.Dimension(533, 399));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnSairLoginActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSairLoginActionPerformed
        // TODO add your handling code here:
        System.exit(0);
    }//GEN-LAST:event_btnSairLoginActionPerformed

    private void btnLoginActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLoginActionPerformed
        // TODO add your handling code here:
        
        // Definindo uma variavel string para receber o comando SQL de 
        // consulta ao banco de dados.
        String sql = "select * from tbusuario where nmLogin = ? and  nmSenha = ?";

        // Definir a estrutura Try/Catch para acesso ao banco, substituindo as
        // "?" pelas informações dos campos da Tela.
        try {
            // Associar o comando SQL na conexao ao Banco
            pst = conexao.prepareStatement(sql);
            // Passando a informação do campo usuario da Tela para o 1o. parametro
            // do comando SQL acima.
            pst.setString(1,txtUserTela.getText());
            pst.setString(2,txtSenhaTela.getText());
            // Executar/rodar a consulta/comando no banco de dados
            rs = pst.executeQuery();
            // Verificar se o usuário e senha foram encontrados no banco!
            if  (rs.next()) {
                // Encontrou o usário e Senha!!!
                // Carregando a instancia/Objeto TelaPrincipal em uma variável
                // de/para acesso.
                TelaPrincipal tlPrincipal = new TelaPrincipal();
                // Tornando a TelaPrincipal visível
                tlPrincipal.setVisible(true);
                // Fechando a TelaLogin
                this.dispose(); // Fecha a TelaLogin                
            }else {
                JOptionPane.showMessageDialog(null, "Usuário / Senha INVÁLIDOS !!!");
                txtUserTela.setText("");
                txtSenhaTela.setText("");
            }           
        }catch (Exception varERRO) {
            JOptionPane.showMessageDialog(null, "Erro no acesso ao Banco DbLogin: " + varERRO.toString());
        }
    }//GEN-LAST:event_btnLoginActionPerformed

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
            java.util.logging.Logger.getLogger(TelaLogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TelaLogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TelaLogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TelaLogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TelaLogin().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnLogin;
    private javax.swing.JButton btnSairLogin;
    private javax.swing.JLabel lblNomeSis;
    private javax.swing.JLabel lblSenha;
    private javax.swing.JLabel lblStatusDB;
    private javax.swing.JLabel lblUsuario;
    private javax.swing.JPasswordField txtSenhaTela;
    private javax.swing.JTextField txtUserTela;
    // End of variables declaration//GEN-END:variables
}