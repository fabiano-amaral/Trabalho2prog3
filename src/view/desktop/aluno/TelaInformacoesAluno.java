/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view.desktop.aluno;

import java.awt.event.WindowEvent;
import java.util.List;
import java.util.stream.Collectors;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import model.pojo.Aluno;
import model.pojo.Atividade;
import model.pojo.Turma;
import view.desktop.TelaPrincipal;

/**
 *
 * @author Elias Júnior
 */
public class TelaInformacoesAluno extends javax.swing.JFrame {

    private TelaPrincipal telaPrincipal;

    /**
     * Creates new form TelaInformacoesAluno
     */
    public TelaInformacoesAluno(TelaPrincipal telaPrincipal) {
        initComponents();
        this.telaPrincipal = telaPrincipal;
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        PainelInformacoesAluno = new javax.swing.JPanel();
        MatriculaLabel = new javax.swing.JLabel();
        MatriculaValue = new javax.swing.JTextField();
        VisualizarButton = new javax.swing.JButton();
        InformacoesPanel = new javax.swing.JPanel();
        InfoNomeLabel = new javax.swing.JLabel();
        InfoNomeValue = new javax.swing.JLabel();
        InfoCpfLabel = new javax.swing.JLabel();
        InfoCpfValue = new javax.swing.JLabel();
        InfoTurmasLabel = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        InfoTurmasValue = new javax.swing.JTable();
        InfoIdLabel = new javax.swing.JLabel();
        InfoIdValue = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosing(java.awt.event.WindowEvent evt) {
                formWindowClosing(evt);
            }
        });

        PainelInformacoesAluno.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Informações de aluno", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 0, 18))); // NOI18N

        MatriculaLabel.setText("Matrícula:");

        VisualizarButton.setText("Visualizar");
        VisualizarButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                VisualizarButtonActionPerformed(evt);
            }
        });

        InformacoesPanel.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Informações", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 1, 11))); // NOI18N

        InfoNomeLabel.setText("Nome:");

        InfoCpfLabel.setText("CPF:");

        InfoTurmasLabel.setText("Turmas:");

        InfoTurmasValue.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "Ano", "Período", "Horário"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Long.class, java.lang.Long.class, java.lang.Long.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(InfoTurmasValue);

        InfoIdLabel.setText("ID:");

        javax.swing.GroupLayout InformacoesPanelLayout = new javax.swing.GroupLayout(InformacoesPanel);
        InformacoesPanel.setLayout(InformacoesPanelLayout);
        InformacoesPanelLayout.setHorizontalGroup(
            InformacoesPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(InformacoesPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(InformacoesPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(InformacoesPanelLayout.createSequentialGroup()
                        .addComponent(InfoCpfLabel)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(InfoCpfValue))
                    .addGroup(InformacoesPanelLayout.createSequentialGroup()
                        .addComponent(InfoTurmasLabel)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 375, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(InformacoesPanelLayout.createSequentialGroup()
                        .addComponent(InfoNomeLabel)
                        .addGap(13, 13, 13)
                        .addComponent(InfoNomeValue))
                    .addGroup(InformacoesPanelLayout.createSequentialGroup()
                        .addComponent(InfoIdLabel)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(InfoIdValue)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        InformacoesPanelLayout.setVerticalGroup(
            InformacoesPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(InformacoesPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(InformacoesPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(InfoIdLabel)
                    .addComponent(InfoIdValue))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(InformacoesPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(InfoNomeLabel)
                    .addComponent(InfoNomeValue))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(InformacoesPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(InfoCpfLabel)
                    .addComponent(InfoCpfValue))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(InformacoesPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(InfoTurmasLabel)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 275, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout PainelInformacoesAlunoLayout = new javax.swing.GroupLayout(PainelInformacoesAluno);
        PainelInformacoesAluno.setLayout(PainelInformacoesAlunoLayout);
        PainelInformacoesAlunoLayout.setHorizontalGroup(
            PainelInformacoesAlunoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PainelInformacoesAlunoLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(PainelInformacoesAlunoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(InformacoesPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(PainelInformacoesAlunoLayout.createSequentialGroup()
                        .addComponent(MatriculaLabel)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(MatriculaValue)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(VisualizarButton)))
                .addContainerGap())
        );
        PainelInformacoesAlunoLayout.setVerticalGroup(
            PainelInformacoesAlunoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PainelInformacoesAlunoLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(PainelInformacoesAlunoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(MatriculaLabel)
                    .addComponent(MatriculaValue, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(VisualizarButton))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(InformacoesPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(PainelInformacoesAluno, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(PainelInformacoesAluno, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void formWindowClosing(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowClosing
        if (this.telaPrincipal != null) {
            this.telaPrincipal.setInitData();
            this.telaPrincipal.setVisible(true);
        }
    }//GEN-LAST:event_formWindowClosing

    private void VisualizarButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_VisualizarButtonActionPerformed
        try {
            long matricula = Long.parseLong(this.MatriculaValue.getText());
            List<Aluno> alunos = TelaPrincipal.alunoDao.findAlunoEntities().stream().filter((a) -> a.getMatricula() == matricula).collect(Collectors.toList());
            if (alunos.size() == 0) {
                JOptionPane.showMessageDialog(this, "Nenhum aluno foi encontrado com essa matrícula.");
            } else {
                this.carregarPainelAluno(alunos.get(0));
            }
        } catch (NumberFormatException ex) {
            JOptionPane.showMessageDialog(this, "Erro no formato da matrícula.");
        }
    }//GEN-LAST:event_VisualizarButtonActionPerformed

    private void closeFrame() {
        this.dispatchEvent(new WindowEvent(this, WindowEvent.WINDOW_CLOSING));
        this.dispose();
        this.dispatchEvent(new WindowEvent(this, WindowEvent.WINDOW_CLOSED));
    }

    private void limparInforacoes() {
        this.InfoCpfValue.setText("");
        this.InfoNomeValue.setText("");
        DefaultTableModel dtm = (DefaultTableModel) this.InfoTurmasValue.getModel();
        dtm.setRowCount(0);
    }

    private void carregarPainelAluno(Aluno aluno) {
        this.InfoNomeValue.setText(aluno.getNome());
        this.InfoIdValue.setText(String.valueOf(aluno.getId()));
        this.InfoCpfValue.setText(String.valueOf(aluno.getCpf()));
        DefaultTableModel dtm = (DefaultTableModel) this.InfoTurmasValue.getModel();
        aluno.getTurmas().forEach((Turma t) -> {
            List<Atividade> atividades = t.getAtividades();
            dtm.addRow(new Object[]{t.getId(), t.getAno(), t.getPeriodo(), t.getHorario()});
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel InfoCpfLabel;
    private javax.swing.JLabel InfoCpfValue;
    private javax.swing.JLabel InfoIdLabel;
    private javax.swing.JLabel InfoIdValue;
    private javax.swing.JLabel InfoNomeLabel;
    private javax.swing.JLabel InfoNomeValue;
    private javax.swing.JLabel InfoTurmasLabel;
    private javax.swing.JTable InfoTurmasValue;
    private javax.swing.JPanel InformacoesPanel;
    private javax.swing.JLabel MatriculaLabel;
    private javax.swing.JTextField MatriculaValue;
    private javax.swing.JPanel PainelInformacoesAluno;
    private javax.swing.JButton VisualizarButton;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables
}