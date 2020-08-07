/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package myJInternalFrame;

/**
 *
 * @author ducmc
 */
public class QuanLyUser extends javax.swing.JInternalFrame {

    /**
     * Creates new form QuanLyUser
     */
    public QuanLyUser() {
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
        java.awt.GridBagConstraints gridBagConstraints;

        kGradientPanel4 = new keeptoo.KGradientPanel();
        lblTaiKhoan = new javax.swing.JLabel();
        txtTaiKhoan = new javax.swing.JTextField();
        lbMatKhau = new javax.swing.JLabel();
        txtMatKhau = new javax.swing.JTextField();
        lbQuen = new javax.swing.JLabel();
        cpQLUser = new javax.swing.JScrollPane();
        tbQLUser = new javax.swing.JTable();
        pnButton = new javax.swing.JPanel();
        btnSuaUser = new javax.swing.JButton();
        btnTimkiemUser = new javax.swing.JButton();
        btnXoaUser = new javax.swing.JButton();
        cbbQuen = new javax.swing.JComboBox<>();

        kGradientPanel4.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Quản lý User", javax.swing.border.TitledBorder.LEFT, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Monospaced", 1, 48), new java.awt.Color(255, 255, 255))); // NOI18N
        kGradientPanel4.setkEndColor(new java.awt.Color(229, 189, 240));
        kGradientPanel4.setkGradientFocus(1000);
        kGradientPanel4.setkStartColor(new java.awt.Color(168, 168, 233));

        lblTaiKhoan.setFont(new java.awt.Font("Monospaced", 1, 24)); // NOI18N
        lblTaiKhoan.setForeground(new java.awt.Color(252, 244, 252));
        lblTaiKhoan.setText("Tài Khoản : ");

        txtTaiKhoan.setFont(new java.awt.Font("Monospaced", 0, 24)); // NOI18N
        txtTaiKhoan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtTaiKhoanActionPerformed(evt);
            }
        });

        lbMatKhau.setFont(new java.awt.Font("Monospaced", 1, 24)); // NOI18N
        lbMatKhau.setForeground(new java.awt.Color(252, 244, 252));
        lbMatKhau.setText("Mật Khẩu :");

        txtMatKhau.setFont(new java.awt.Font("Monospaced", 0, 24)); // NOI18N

        lbQuen.setFont(new java.awt.Font("Monospaced", 1, 24)); // NOI18N
        lbQuen.setForeground(new java.awt.Color(252, 244, 252));
        lbQuen.setText("Quền :");

        tbQLUser.setFont(new java.awt.Font("Monospaced", 0, 24)); // NOI18N
        tbQLUser.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Tài Khoản", "Mật Khẩu", "Quền "
            }
        ));
        tbQLUser.setFillsViewportHeight(true);
        tbQLUser.setRowHeight(35);
        tbQLUser.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tbQLUserMouseClicked(evt);
            }
        });
        cpQLUser.setViewportView(tbQLUser);

        pnButton.setOpaque(false);
        pnButton.setLayout(new java.awt.GridBagLayout());

        btnSuaUser.setFont(new java.awt.Font("Monospaced", 1, 24)); // NOI18N
        btnSuaUser.setForeground(new java.awt.Color(72, 61, 139));
        btnSuaUser.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/Edit_32x32.png"))); // NOI18N
        btnSuaUser.setText("Sửa Thông tin User");
        btnSuaUser.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSuaUserActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 2;
        gridBagConstraints.insets = new java.awt.Insets(0, 0, 20, 0);
        pnButton.add(btnSuaUser, gridBagConstraints);

        btnTimkiemUser.setFont(new java.awt.Font("Monospaced", 1, 24)); // NOI18N
        btnTimkiemUser.setForeground(new java.awt.Color(72, 61, 139));
        btnTimkiemUser.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/Search_Icon_32.png"))); // NOI18N
        btnTimkiemUser.setText("Tìm Kiếm");
        btnTimkiemUser.setMaximumSize(new java.awt.Dimension(321, 41));
        btnTimkiemUser.setMinimumSize(new java.awt.Dimension(321, 41));
        btnTimkiemUser.setPreferredSize(new java.awt.Dimension(321, 41));
        btnTimkiemUser.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnTimkiemUserActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 3;
        pnButton.add(btnTimkiemUser, gridBagConstraints);

        btnXoaUser.setFont(new java.awt.Font("Monospaced", 1, 24)); // NOI18N
        btnXoaUser.setForeground(new java.awt.Color(72, 61, 139));
        btnXoaUser.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/Delete_32x32.png"))); // NOI18N
        btnXoaUser.setText("Xóa User");
        btnXoaUser.setMaximumSize(new java.awt.Dimension(293, 41));
        btnXoaUser.setPreferredSize(new java.awt.Dimension(321, 41));
        btnXoaUser.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnXoaUserActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.insets = new java.awt.Insets(0, 0, 20, 0);
        pnButton.add(btnXoaUser, gridBagConstraints);

        cbbQuen.setFont(new java.awt.Font("Monospaced", 0, 24)); // NOI18N
        cbbQuen.setToolTipText("");

        javax.swing.GroupLayout kGradientPanel4Layout = new javax.swing.GroupLayout(kGradientPanel4);
        kGradientPanel4.setLayout(kGradientPanel4Layout);
        kGradientPanel4Layout.setHorizontalGroup(
            kGradientPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(kGradientPanel4Layout.createSequentialGroup()
                .addGap(162, 162, 162)
                .addGroup(kGradientPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lbQuen, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblTaiKhoan, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, kGradientPanel4Layout.createSequentialGroup()
                        .addComponent(lbMatKhau)
                        .addGap(13, 13, 13)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(kGradientPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(txtMatKhau, javax.swing.GroupLayout.DEFAULT_SIZE, 380, Short.MAX_VALUE)
                    .addComponent(txtTaiKhoan, javax.swing.GroupLayout.DEFAULT_SIZE, 380, Short.MAX_VALUE)
                    .addComponent(cbbQuen, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(67, 67, 67)
                .addComponent(pnButton, javax.swing.GroupLayout.DEFAULT_SIZE, 502, Short.MAX_VALUE)
                .addGap(174, 174, 174))
            .addComponent(cpQLUser, javax.swing.GroupLayout.Alignment.TRAILING)
        );
        kGradientPanel4Layout.setVerticalGroup(
            kGradientPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(kGradientPanel4Layout.createSequentialGroup()
                .addGroup(kGradientPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(kGradientPanel4Layout.createSequentialGroup()
                        .addGap(35, 35, 35)
                        .addGroup(kGradientPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblTaiKhoan, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtTaiKhoan, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(kGradientPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtMatKhau, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lbMatKhau, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(20, 20, 20)
                        .addGroup(kGradientPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lbQuen, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(cbbQuen, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(kGradientPanel4Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(pnButton, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, Short.MAX_VALUE)
                .addComponent(cpQLUser, javax.swing.GroupLayout.PREFERRED_SIZE, 342, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(kGradientPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(kGradientPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtTaiKhoanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtTaiKhoanActionPerformed

    }//GEN-LAST:event_txtTaiKhoanActionPerformed

    private void tbQLUserMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tbQLUserMouseClicked
        
    }//GEN-LAST:event_tbQLUserMouseClicked

    private void btnSuaUserActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSuaUserActionPerformed
        // TODO add your handling code here:
      
    }//GEN-LAST:event_btnSuaUserActionPerformed

    private void btnTimkiemUserActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnTimkiemUserActionPerformed
    
    }//GEN-LAST:event_btnTimkiemUserActionPerformed

    private void btnXoaUserActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnXoaUserActionPerformed
      
    }//GEN-LAST:event_btnXoaUserActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnSuaUser;
    private javax.swing.JButton btnTimkiemUser;
    private javax.swing.JButton btnXoaUser;
    private javax.swing.JComboBox<String> cbbQuen;
    private javax.swing.JScrollPane cpQLUser;
    private keeptoo.KGradientPanel kGradientPanel4;
    private javax.swing.JLabel lbMatKhau;
    private javax.swing.JLabel lbQuen;
    private javax.swing.JLabel lblTaiKhoan;
    private javax.swing.JPanel pnButton;
    private javax.swing.JTable tbQLUser;
    private javax.swing.JTextField txtMatKhau;
    private javax.swing.JTextField txtTaiKhoan;
    // End of variables declaration//GEN-END:variables
}
