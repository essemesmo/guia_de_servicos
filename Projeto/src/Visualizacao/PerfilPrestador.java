package Visualizacao;

import Controlador.AtualizarPrestador;

/**
 *
 * @author PMF
 */
public class PerfilPrestador extends javax.swing.JFrame {

    /**
     * Creates new form PerfilPrestador
     */
    public PerfilPrestador() 
    {
        perfil = new AtualizarPrestador();
        initComponents();
        
        usernameLabel.setText(perfil.prestador.getUsername());
        saldoLabel.setText(String.valueOf(perfil.prestador.getSaldo()));
        RankLabel.setText(String.valueOf(perfil.prestador.getClassificacao()));
        nomeField.setText(perfil.prestador.getNome());
        cnpjField.setText(perfil.prestador.getCnpj());
        emailField.setText(perfil.prestador.getEmail());
        telefoneField.setText(perfil.prestador.getTelefone());
        enderecoField.setText(perfil.prestador.getEndereco()); 
        regiaoField.setText(perfil.prestador.getRegiao()); 
        especificacaoField.setText(perfil.prestador.getEspecificacao());
        custoField.setText(String.valueOf(perfil.prestador.getCusto()));
        descricaoArea.setText(perfil.prestador.getDescricao());
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        sairButton = new javax.swing.JButton();
        usernameLabel = new javax.swing.JLabel();
        RsLabel = new javax.swing.JLabel();
        saldoLabel = new javax.swing.JLabel();
        nomeLabel = new javax.swing.JLabel();
        nomeField = new javax.swing.JTextField();
        cnpjLabel = new javax.swing.JLabel();
        cnpjField = new javax.swing.JTextField();
        emailLabel = new javax.swing.JLabel();
        emailField = new javax.swing.JTextField();
        telefoneLabel = new javax.swing.JLabel();
        telefoneField = new javax.swing.JTextField();
        enderecoLabel = new javax.swing.JLabel();
        enderecoField = new javax.swing.JTextField();
        regiaoLabel = new javax.swing.JLabel();
        regiaoField = new javax.swing.JTextField();
        especificacao = new javax.swing.JLabel();
        especificacaoField = new javax.swing.JTextField();
        custoLabel = new javax.swing.JLabel();
        custoField = new javax.swing.JTextField();
        descricaoLabel = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        descricaoArea = new javax.swing.JTextArea();
        clasLabel = new javax.swing.JLabel();
        RankLabel = new javax.swing.JLabel();
        okButton = new javax.swing.JButton();

        jLabel1.setText("jLabel1");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        sairButton.setText("Sair");
        sairButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sairButtonActionPerformed(evt);
            }
        });

        usernameLabel.setText("username");

        RsLabel.setText("R$");

        saldoLabel.setText("000.000,00");

        nomeLabel.setText("Nome");

        nomeField.setText("nome");

        cnpjLabel.setText("CNPJ");

        cnpjField.setText("cnpj");

        emailLabel.setText("Email");

        emailField.setText("email");

        telefoneLabel.setText("Telefone");

        telefoneField.setText("telefone");

        enderecoLabel.setText("Endereço");

        enderecoField.setText("endereco");

        regiaoLabel.setText("Região");

        regiaoField.setText("regiao");

        especificacao.setText("Especificação");

        especificacaoField.setText("especificacao");

        custoLabel.setText("Custo");

        custoField.setText("custo");

        descricaoLabel.setText("Descrição");

        descricaoArea.setColumns(20);
        descricaoArea.setRows(5);
        descricaoArea.setText("descrição");
        jScrollPane1.setViewportView(descricaoArea);

        clasLabel.setText("Classificação");

        RankLabel.setText("10");

        okButton.setText("Ok");
        okButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                okButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(usernameLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(87, 87, 87)
                        .addComponent(RsLabel)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(saldoLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(especificacao)
                            .addComponent(regiaoLabel)
                            .addComponent(enderecoLabel)
                            .addComponent(telefoneLabel)
                            .addComponent(emailLabel)
                            .addComponent(nomeLabel)
                            .addComponent(cnpjLabel)
                            .addComponent(custoLabel))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(cnpjField)
                            .addComponent(nomeField)
                            .addComponent(emailField)
                            .addComponent(telefoneField)
                            .addComponent(enderecoField)
                            .addComponent(regiaoField)
                            .addComponent(especificacaoField)
                            .addComponent(custoField, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(clasLabel)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(RankLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 235, Short.MAX_VALUE)
                        .addComponent(sairButton))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(descricaoLabel)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(128, 128, 128)
                        .addComponent(okButton, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap())))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(sairButton)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(usernameLabel)
                        .addComponent(RsLabel)
                        .addComponent(saldoLabel)
                        .addComponent(clasLabel)
                        .addComponent(RankLabel)))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(nomeField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(nomeLabel)
                            .addComponent(descricaoLabel))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(cnpjField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(cnpjLabel))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(emailLabel)
                            .addComponent(emailField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(telefoneLabel)
                            .addComponent(telefoneField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(enderecoLabel)
                            .addComponent(enderecoField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(regiaoLabel)
                            .addComponent(regiaoField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(jScrollPane1))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(especificacao)
                            .addComponent(especificacaoField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(custoLabel)
                            .addComponent(custoField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addContainerGap(22, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(24, 24, 24)
                        .addComponent(okButton)
                        .addGap(0, 0, Short.MAX_VALUE))))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void sairButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sairButtonActionPerformed
        this.dispose();
        new LoginMenu().setVisible(true);
    }//GEN-LAST:event_sairButtonActionPerformed

    private void okButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_okButtonActionPerformed
        perfil.prestador.setNome(nomeField.getText());
        perfil.prestador.setCnpj(cnpjField.getText());
        perfil.prestador.setEmail(emailField.getText());   
        perfil.prestador.setTelefone(telefoneField.getText());
        perfil.prestador.setEndereco(enderecoField.getText());
        perfil.prestador.setRegiao(regiaoField.getText());  
        perfil.prestador.setEspecificacao(especificacaoField.getText());
        perfil.prestador.setCusto(Double.valueOf(custoField.getText()));
        perfil.prestador.setDescricao(descricaoArea.getText());
        perfil.atualizarDocumento();
        this.dispose();
        new OpcoesMenu().setVisible(true);
    }//GEN-LAST:event_okButtonActionPerformed

    private final AtualizarPrestador perfil;

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel RankLabel;
    private javax.swing.JLabel RsLabel;
    private javax.swing.JLabel clasLabel;
    private javax.swing.JTextField cnpjField;
    private javax.swing.JLabel cnpjLabel;
    private javax.swing.JTextField custoField;
    private javax.swing.JLabel custoLabel;
    private javax.swing.JTextArea descricaoArea;
    private javax.swing.JLabel descricaoLabel;
    private javax.swing.JTextField emailField;
    private javax.swing.JLabel emailLabel;
    private javax.swing.JTextField enderecoField;
    private javax.swing.JLabel enderecoLabel;
    private javax.swing.JLabel especificacao;
    private javax.swing.JTextField especificacaoField;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField nomeField;
    private javax.swing.JLabel nomeLabel;
    private javax.swing.JButton okButton;
    private javax.swing.JTextField regiaoField;
    private javax.swing.JLabel regiaoLabel;
    private javax.swing.JButton sairButton;
    private javax.swing.JLabel saldoLabel;
    private javax.swing.JTextField telefoneField;
    private javax.swing.JLabel telefoneLabel;
    private javax.swing.JLabel usernameLabel;
    // End of variables declaration//GEN-END:variables
}
