/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view.desktop.falta;

import java.util.List;
import java.util.stream.Collectors;
import javax.swing.JOptionPane;
import model.pojo.Aluno;
import model.pojo.Falta;
import model.pojo.Turma;
import view.desktop.TelaPrincipal;

/**
 *
 * @author Elias Júnior
 */
public class TelaLancarFalta extends javax.swing.JFrame {

    private TelaPrincipal telaPrincipal;

    /**
     * Creates new form TelaLancarFalta
     */
    public TelaLancarFalta(TelaPrincipal telaPrincipal) {
        initComponents();
        this.telaPrincipal = telaPrincipal;
        this.carregarListaTurmas();
        this.carregarListaAlunos();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        PainelLancarFalta = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        ListaTurmas = new javax.swing.JComboBox();
        jLabel2 = new javax.swing.JLabel();
        ListaAlunos = new javax.swing.JComboBox();
        jLabel3 = new javax.swing.JLabel();
        FatlasValue = new javax.swing.JTextField();
        LarcarButton = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosing(java.awt.event.WindowEvent evt) {
                formWindowClosing(evt);
            }
        });

        PainelLancarFalta.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Lançar falta", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 0, 18))); // NOI18N
        PainelLancarFalta.setAutoscrolls(true);

        jLabel1.setText("Turma:");

        /*
        ListaTurmas.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        */

        jLabel2.setText("Aluno:");

        /*
        ListaAlunos.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        */

        jLabel3.setText("Faltas:");

        FatlasValue.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                FatlasValueActionPerformed(evt);
            }
        });

        LarcarButton.setText("Lançar");
        LarcarButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                LarcarButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout PainelLancarFaltaLayout = new javax.swing.GroupLayout(PainelLancarFalta);
        PainelLancarFalta.setLayout(PainelLancarFaltaLayout);
        PainelLancarFaltaLayout.setHorizontalGroup(
            PainelLancarFaltaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PainelLancarFaltaLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(PainelLancarFaltaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(PainelLancarFaltaLayout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(ListaTurmas, 0, 304, Short.MAX_VALUE))
                    .addGroup(PainelLancarFaltaLayout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(ListaAlunos, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(PainelLancarFaltaLayout.createSequentialGroup()
                        .addComponent(jLabel3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(FatlasValue))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, PainelLancarFaltaLayout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(LarcarButton)))
                .addContainerGap())
        );
        PainelLancarFaltaLayout.setVerticalGroup(
            PainelLancarFaltaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PainelLancarFaltaLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(PainelLancarFaltaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(ListaTurmas, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(PainelLancarFaltaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(ListaAlunos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(PainelLancarFaltaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(FatlasValue, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(LarcarButton)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(PainelLancarFalta, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(PainelLancarFalta, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
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

    private void FatlasValueActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_FatlasValueActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_FatlasValueActionPerformed

    private void LarcarButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_LarcarButtonActionPerformed
        try {
            long faltas = Long.parseLong(this.FatlasValue.getText());
            Aluno aluno = this.getSelectedAluno();
            Turma turma = this.getSelectedTurma();
            if (aluno == null) {
                JOptionPane.showMessageDialog(this, "Você deve selecionar um aluno.");
            } else if (turma == null) {
                JOptionPane.showMessageDialog(this, "Você deve selecionar uma turma.");
            } else if (!turma.getAlunos().contains(aluno)) {
                JOptionPane.showMessageDialog(this, "Esse aluno não está matriculado na turma selecionada.");
            } else if (TelaPrincipal.faltaDao.findFaltaEntities().stream().filter(f -> f.getTurma().equals(turma)).collect(Collectors.toList()).size() > 0) {
                JOptionPane.showMessageDialog(this, "Já foi lançado falta para esse aluno.");
            } else {
                Falta falta = new Falta(faltas, aluno, turma);
                TelaPrincipal.faltaDao.create(falta);
                JOptionPane.showMessageDialog(this, "Falta lançada com sucesso.");
            }
        } catch (NumberFormatException ex) {
            JOptionPane.showMessageDialog(this, "Formato inválido para o número.");
        }
    }//GEN-LAST:event_LarcarButtonActionPerformed

    private Turma getSelectedTurma() {
        String idStr = (String) this.ListaTurmas.getSelectedItem();
        if (idStr == null) {
            return null;
        } else {
            long id = Long.parseLong(idStr.split(":")[0]);
            Turma turma = TelaPrincipal.turmaDao.findTurma(id);
            return turma;
        }
    }

    private Aluno getSelectedAluno() {
        String idStr = (String) this.ListaAlunos.getSelectedItem();
        if (idStr == null) {
            return null;
        } else {
            long id = Long.parseLong(idStr.split(":")[0]);
            Aluno aluno = TelaPrincipal.alunoDao.findAluno(id);
            return aluno;
        }
    }

    private void carregarListaTurmas() {
        List<Turma> turmas = TelaPrincipal.turmaDao.findTurmaEntities();
        this.ListaTurmas.removeAllItems();
        turmas.forEach(t -> {
            String nome = t.getId() + ": " + t.getProfessor().getNome() + " - " + t.getDisciplina().getNome();
            this.ListaTurmas.addItem(nome);
        });
    }

    private void carregarListaAlunos() {
        List<Aluno> alunos = TelaPrincipal.alunoDao.findAlunoEntities();
        this.ListaAlunos.removeAllItems();
        alunos.forEach(a -> {
            String nome = a.getId() + ": " + a.getNome();
            this.ListaAlunos.addItem(nome);
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField FatlasValue;
    private javax.swing.JButton LarcarButton;
    private javax.swing.JComboBox ListaAlunos;
    private javax.swing.JComboBox ListaTurmas;
    private javax.swing.JPanel PainelLancarFalta;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    // End of variables declaration//GEN-END:variables
}