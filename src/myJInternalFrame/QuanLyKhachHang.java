package myJInternalFrame;

import connectionSQL.connectionSQL;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import myClass.ClassKhachHang;

public class QuanLyKhachHang extends javax.swing.JInternalFrame {

    List<ClassKhachHang> listKhachHang = new ArrayList<>();
    Connection cn;
    int index = 0;
    DefaultTableModel model;

    public QuanLyKhachHang() throws SQLException {
        initComponents();
        cn = connectionSQL.ketnoi("QLIPHONE");
        fillToTable();
        setTextMaKH();
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
        lbMaKH = new javax.swing.JLabel();
        txtMaKH = new javax.swing.JTextField();
        cpQLKH = new javax.swing.JScrollPane();
        tbQLKH = new javax.swing.JTable();
        lbTenKH = new javax.swing.JLabel();
        txtTenKH = new javax.swing.JTextField();
        lbSoDT = new javax.swing.JLabel();
        txtSoDT = new javax.swing.JTextField();
        lbDiaChi = new javax.swing.JLabel();
        pnButton = new javax.swing.JPanel();
        btnThemKH = new javax.swing.JButton();
        btnSuaKH = new javax.swing.JButton();
        btnThemMoi = new javax.swing.JButton();
        btnTimkiemKH = new javax.swing.JButton();
        cpDiaChi = new javax.swing.JScrollPane();
        taDiaChi = new javax.swing.JTextArea();
        erroMaKH = new javax.swing.JLabel();
        chkKhachHang = new javax.swing.JCheckBox();

        setClosable(true);
        setIconifiable(true);
        setMaximizable(true);
        setResizable(true);

        kGradientPanel4.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Quản Lý Khách Hàng", javax.swing.border.TitledBorder.LEFT, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Monospaced", 1, 48), new java.awt.Color(255, 255, 255))); // NOI18N
        kGradientPanel4.setkEndColor(new java.awt.Color(229, 189, 240));
        kGradientPanel4.setkGradientFocus(1000);
        kGradientPanel4.setkStartColor(new java.awt.Color(168, 168, 233));

        lbMaKH.setFont(new java.awt.Font("Monospaced", 1, 24)); // NOI18N
        lbMaKH.setForeground(new java.awt.Color(252, 244, 252));
        lbMaKH.setText(" Mã khách hàng:");

        txtMaKH.setEditable(false);
        txtMaKH.setBackground(new java.awt.Color(216, 216, 216));
        txtMaKH.setFont(new java.awt.Font("Monospaced", 0, 24)); // NOI18N

        tbQLKH.setFont(new java.awt.Font("Monospaced", 0, 24)); // NOI18N
        tbQLKH.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Mã khách hàng", "Tên khách hàng", "Số điện thoại", "Địa chỉ"
            }
        ));
        tbQLKH.setFillsViewportHeight(true);
        tbQLKH.setRowHeight(35);
        tbQLKH.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tbQLKHMouseClicked(evt);
            }
        });
        cpQLKH.setViewportView(tbQLKH);

        lbTenKH.setFont(new java.awt.Font("Monospaced", 1, 24)); // NOI18N
        lbTenKH.setForeground(new java.awt.Color(252, 244, 252));
        lbTenKH.setText("Tên khách hàng:");

        txtTenKH.setFont(new java.awt.Font("Monospaced", 0, 24)); // NOI18N

        lbSoDT.setFont(new java.awt.Font("Monospaced", 1, 24)); // NOI18N
        lbSoDT.setForeground(new java.awt.Color(252, 244, 252));
        lbSoDT.setText(" Số điện thoại:");

        txtSoDT.setFont(new java.awt.Font("Monospaced", 0, 24)); // NOI18N

        lbDiaChi.setFont(new java.awt.Font("Monospaced", 1, 24)); // NOI18N
        lbDiaChi.setForeground(new java.awt.Color(252, 244, 252));
        lbDiaChi.setText("       Địa chỉ:");

        pnButton.setOpaque(false);
        pnButton.setLayout(new java.awt.GridBagLayout());

        btnThemKH.setFont(new java.awt.Font("Monospaced", 1, 24)); // NOI18N
        btnThemKH.setForeground(new java.awt.Color(72, 61, 139));
        btnThemKH.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/Add_32x32.png"))); // NOI18N
        btnThemKH.setText("Thêm khách hàng");
        btnThemKH.setMaximumSize(new java.awt.Dimension(257, 41));
        btnThemKH.setMinimumSize(new java.awt.Dimension(257, 41));
        btnThemKH.setPreferredSize(new java.awt.Dimension(293, 41));
        btnThemKH.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnThemKHActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.gridwidth = 4;
        gridBagConstraints.insets = new java.awt.Insets(0, 0, 20, 0);
        pnButton.add(btnThemKH, gridBagConstraints);

        btnSuaKH.setFont(new java.awt.Font("Monospaced", 1, 24)); // NOI18N
        btnSuaKH.setForeground(new java.awt.Color(72, 61, 139));
        btnSuaKH.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/Edit_32x32.png"))); // NOI18N
        btnSuaKH.setText("Sửa thông tin KH");
        btnSuaKH.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSuaKHActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 8;
        gridBagConstraints.insets = new java.awt.Insets(0, 0, 20, 0);
        pnButton.add(btnSuaKH, gridBagConstraints);

        btnThemMoi.setFont(new java.awt.Font("Monospaced", 1, 24)); // NOI18N
        btnThemMoi.setForeground(new java.awt.Color(72, 61, 139));
        btnThemMoi.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/Add_1_Icon_32.png"))); // NOI18N
        btnThemMoi.setText("Thêm mới");
        btnThemMoi.setMaximumSize(new java.awt.Dimension(293, 41));
        btnThemMoi.setPreferredSize(new java.awt.Dimension(293, 41));
        btnThemMoi.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnThemMoiActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.insets = new java.awt.Insets(0, 0, 20, 0);
        pnButton.add(btnThemMoi, gridBagConstraints);

        btnTimkiemKH.setFont(new java.awt.Font("Monospaced", 1, 24)); // NOI18N
        btnTimkiemKH.setForeground(new java.awt.Color(72, 61, 139));
        btnTimkiemKH.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/Search_Icon_32.png"))); // NOI18N
        btnTimkiemKH.setText("Tìm khách hàng");
        btnTimkiemKH.setPreferredSize(new java.awt.Dimension(293, 41));
        btnTimkiemKH.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnTimkiemKHActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 10;
        pnButton.add(btnTimkiemKH, gridBagConstraints);

        taDiaChi.setColumns(20);
        taDiaChi.setFont(new java.awt.Font("Monospaced", 0, 24)); // NOI18N
        taDiaChi.setRows(5);
        cpDiaChi.setViewportView(taDiaChi);

        erroMaKH.setText("dffffddffdfd");

        chkKhachHang.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        chkKhachHang.setForeground(new java.awt.Color(255, 255, 255));
        chkKhachHang.setText("Khách hàng hạn chế");

        javax.swing.GroupLayout kGradientPanel4Layout = new javax.swing.GroupLayout(kGradientPanel4);
        kGradientPanel4.setLayout(kGradientPanel4Layout);
        kGradientPanel4Layout.setHorizontalGroup(
            kGradientPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(kGradientPanel4Layout.createSequentialGroup()
                .addGroup(kGradientPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, kGradientPanel4Layout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(erroMaKH, javax.swing.GroupLayout.PREFERRED_SIZE, 225, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(292, 292, 292))
                    .addGroup(kGradientPanel4Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(kGradientPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(kGradientPanel4Layout.createSequentialGroup()
                                .addGroup(kGradientPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(lbTenKH, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 270, Short.MAX_VALUE)
                                    .addComponent(lbSoDT, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addGap(18, 18, 18))
                            .addGroup(kGradientPanel4Layout.createSequentialGroup()
                                .addGroup(kGradientPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(lbMaKH)
                                    .addComponent(lbDiaChi))
                                .addGap(29, 29, 29)))
                        .addGroup(kGradientPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(kGradientPanel4Layout.createSequentialGroup()
                                .addComponent(chkKhachHang)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addGroup(kGradientPanel4Layout.createSequentialGroup()
                                .addGroup(kGradientPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txtTenKH)
                                    .addComponent(txtMaKH, javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(cpDiaChi, javax.swing.GroupLayout.DEFAULT_SIZE, 419, Short.MAX_VALUE)
                                    .addComponent(txtSoDT, javax.swing.GroupLayout.Alignment.TRAILING))
                                .addGap(137, 137, 137)))))
                .addComponent(pnButton, javax.swing.GroupLayout.PREFERRED_SIZE, 350, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(99, 99, 99))
            .addComponent(cpQLKH)
        );
        kGradientPanel4Layout.setVerticalGroup(
            kGradientPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(kGradientPanel4Layout.createSequentialGroup()
                .addGap(45, 45, 45)
                .addGroup(kGradientPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(kGradientPanel4Layout.createSequentialGroup()
                        .addGroup(kGradientPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lbMaKH, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtMaKH, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(erroMaKH, javax.swing.GroupLayout.PREFERRED_SIZE, 0, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(2, 2, 2)
                        .addGroup(kGradientPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lbTenKH, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtTenKH, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(kGradientPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lbSoDT, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtSoDT, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(kGradientPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(cpDiaChi, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lbDiaChi, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(chkKhachHang)
                        .addGap(0, 10, Short.MAX_VALUE))
                    .addComponent(pnButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(cpQLKH, javax.swing.GroupLayout.PREFERRED_SIZE, 287, javax.swing.GroupLayout.PREFERRED_SIZE)
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

    private void btnThemKHActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnThemKHActionPerformed

        if (this.batLoi()) {
            this.themKH();
            this.clear();
            this.fillToTable();

            int index = listKhachHang.size() - 1;
            txtMaKH.setText(listKhachHang.get(index).getMaKH());
            txtTenKH.setText(listKhachHang.get(index).getTenKH());
            txtSoDT.setText(listKhachHang.get(index).getSdt());
            taDiaChi.setText(listKhachHang.get(index).getDiaChi());

        }

    }//GEN-LAST:event_btnThemKHActionPerformed

    private void btnThemMoiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnThemMoiActionPerformed
        this.clear();
        setTextMaKH();
        this.fillToTable();
    }//GEN-LAST:event_btnThemMoiActionPerformed

    private void tbQLKHMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tbQLKHMouseClicked
        chkKhachHang.setSelected(false);
        chkKhachHang.setVisible(true);
        showDeail();
    }//GEN-LAST:event_tbQLKHMouseClicked

    private void btnSuaKHActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSuaKHActionPerformed

        this.suaKH();
        this.clear();
    }//GEN-LAST:event_btnSuaKHActionPerformed

    private void btnTimkiemKHActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnTimkiemKHActionPerformed
        chkKhachHang.setSelected(false);
        chkKhachHang.setVisible(true);
        this.timKH();
    }//GEN-LAST:event_btnTimkiemKHActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnSuaKH;
    private javax.swing.JButton btnThemKH;
    private javax.swing.JButton btnThemMoi;
    private javax.swing.JButton btnTimkiemKH;
    private javax.swing.JCheckBox chkKhachHang;
    private javax.swing.JScrollPane cpDiaChi;
    private javax.swing.JScrollPane cpQLKH;
    private javax.swing.JLabel erroMaKH;
    private keeptoo.KGradientPanel kGradientPanel4;
    private javax.swing.JLabel lbDiaChi;
    private javax.swing.JLabel lbMaKH;
    private javax.swing.JLabel lbSoDT;
    private javax.swing.JLabel lbTenKH;
    private javax.swing.JPanel pnButton;
    private javax.swing.JTextArea taDiaChi;
    private javax.swing.JTable tbQLKH;
    private javax.swing.JTextField txtMaKH;
    private javax.swing.JTextField txtSoDT;
    private javax.swing.JTextField txtTenKH;
    // End of variables declaration//GEN-END:variables

    private void fillToTable() {
        model = (DefaultTableModel) tbQLKH.getModel();
        model.setRowCount(0);

        try {
            listKhachHang.clear();
            Statement st = connectionSQL.ketnoi("QLIPHONE").createStatement();
            String sql = "SELECT * FROM KHACHHANG";
            ResultSet rs = st.executeQuery(sql);

            while (rs.next()) {
                String maKH = rs.getString(1);
                String tenKH = rs.getString(2);
                String soDT = rs.getString(3);
                String diaChi = rs.getString(4);
                //
                String trangThaiKH = "1";
                trangThaiKH = rs.getString(5);
                System.out.println(trangThaiKH);
                //
                ClassKhachHang kh = new ClassKhachHang(maKH, tenKH, soDT, diaChi);
                if (trangThaiKH.equals("1")) {
                    listKhachHang.add(kh);
                }

            }
        } catch (Exception e) {
            System.out.println(e);
        }

        for (int i = 0; i < listKhachHang.size(); i++) {
            Object[] khachHangObject = new Object[]{
                listKhachHang.get(i).getMaKH(),
                listKhachHang.get(i).getTenKH(),
                listKhachHang.get(i).getSdt(),
                listKhachHang.get(i).getDiaChi()};
            model.addRow(khachHangObject);
        }
    }

    public boolean batLoi() {
        boolean tma = false, tten = false, tsdt = false, tdiachi = false;
        //bắt lỗi mã
        if (txtMaKH.getText().length() == 0) {
            JOptionPane.showMessageDialog(this, "Không để trống mã");
            tma = false;
        } else {
            tma = true;
            for (int i = 0; i < listKhachHang.size(); i++) {
                ClassKhachHang kh = listKhachHang.get(i);
                if (txtMaKH.getText().equalsIgnoreCase(kh.getMaKH())) {
                    JOptionPane.showMessageDialog(this, "Trùng mã nhân viên");
                    tma = false;
                    break;
                }
            }
        }
        //bắt lỗi tên
        if (tma) {
            if (txtTenKH.getText().length() == 0) {
                JOptionPane.showMessageDialog(this, "Không để trống tên");
                tten = false;
            } else {
                tten = true;
            }
        }
        //bắt lỗi sdt
        if (tten) {
            if (txtSoDT.getText().length() == 0) {
                JOptionPane.showMessageDialog(this, "Không để trống số điện thoại");
                tsdt = false;
            } else {
                try {
                    int sdt = Integer.parseInt(txtSoDT.getText());
                    String soSDT = String.valueOf(sdt);
                    if (soSDT.length() == 9 && txtSoDT.getText().length() == 10) {
                        tsdt = true;
                    } else {
                        JOptionPane.showMessageDialog(this, "Số điện thoại không đúng");
                        tsdt = false;
                    }
                } catch (Exception e) {
                    JOptionPane.showMessageDialog(this, "Số điện thoại sai định dạng");
                    tsdt = false;
                }
            }
        }
        //bắt lỗi địa chỉ
        if (tsdt) {
            if (taDiaChi.getText().length() == 0) {
                JOptionPane.showMessageDialog(this, "Không để trống địa chỉ");
                tdiachi = false;
            } else {
                tdiachi = true;
            }
        }
        //trả kết quả
        if (tdiachi) {
            return true;
        } else {
            return false;
        }
    }

    private void showDeail() {
        try {
            model = (DefaultTableModel) tbQLKH.getModel();
            int selextRow = tbQLKH.getSelectedRow();

            ClassKhachHang kh = listKhachHang.get(selextRow);

            txtMaKH.setText((String) model.getValueAt(selextRow, 0));
            txtTenKH.setText((String) model.getValueAt(selextRow, 1));
            txtSoDT.setText((String) model.getValueAt(selextRow, 2));
            taDiaChi.setText((String) model.getValueAt(selextRow, 3));
        } catch (Exception e) {
        }
    }

    private void themKH() {
        try {
            String sql = "INSERT INTO KHACHHANG\n" + "VALUES(?,?,?,?,1)";
            PreparedStatement ps = cn.prepareStatement(sql);
            ps.setString(1, txtMaKH.getText());
            ps.setString(2, txtTenKH.getText());
            ps.setString(3, txtSoDT.getText());
            ps.setString(4, taDiaChi.getText());

            int row = ps.executeUpdate();
            if (row > 0) {
                JOptionPane.showMessageDialog(this, "Thêm khách hàng thành công");
                index = listKhachHang.size() - 1;
                showDeail();
            } else {
                JOptionPane.showMessageDialog(this, "Lỗi thêm");
            }
            ps.close();
            fillToTable();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, "Thêm khách hàng không thành công");
        }

    }

    private void suaKH() {
        try {
            String sql = "update KHACHHANG\n"
                    + "set HOVATEN=?, SDT=?, DIACHI=?,TrangThaiKH = ?\n"
                    + "where MAKH=?";

            PreparedStatement ps = cn.prepareStatement(sql);
            ps.setString(5, txtMaKH.getText());
            ps.setString(1, txtTenKH.getText());
            ps.setString(2, txtSoDT.getText());
            ps.setString(3, taDiaChi.getText());
            if (chkKhachHang.isSelected()) {
                ps.setString(4, chkKhachHang.getText());
            } else {
                ps.setString(4, "");
            }

            int row = ps.executeUpdate();
            if (row > 0) {
                JOptionPane.showMessageDialog(this, "Sửa thông tin khách hàng thành công");
                index = listKhachHang.size() - 1;
                showDeail();
            } else {
                JOptionPane.showMessageDialog(this, "Lỗi Sửa");
            }
            ps.close();
            fillToTable();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, "Sửa thông tin khách hàng không thành công");
        }
    }

    private void clear() {
        chkKhachHang.setSelected(false);
        chkKhachHang.setVisible(false);

        txtMaKH.setText("");
        txtTenKH.setText("");
        txtSoDT.setText("");
        taDiaChi.setText("");
    }

    private void loadTable() {
        DefaultTableModel model = (DefaultTableModel) tbQLKH.getModel();
        model.setRowCount(0);

        for (int i = 0; i < listKhachHang.size(); i++) {
            Object[] khachHangObject = new Object[]{
                listKhachHang.get(i).getMaKH(),
                listKhachHang.get(i).getTenKH(),
                listKhachHang.get(i).getSdt(),
                listKhachHang.get(i).getDiaChi()};
            model.addRow(khachHangObject);

        }
    }

    private void timKH() {
        DefaultTableModel model = (DefaultTableModel) tbQLKH.getModel();
        String option[] = {"Tìm theo mã KH", "Tìm theo tên KH", "Tìm theo SĐT KH", "Hủy"};
        ImageIcon iconFind = new ImageIcon("src//icons//Search_Icon_32.png");

        int result = JOptionPane.showOptionDialog(this, "Mời bạn chọn cách thức tìm kiếm!", "Tìm kiếm Khách hàng", JOptionPane.YES_NO_OPTION, JOptionPane.INFORMATION_MESSAGE, iconFind, option, null);

        if (result == 0) {
            String makh = (String) JOptionPane.showInputDialog(this, "Mời bạn nhập mã Khách hàng!", "Tìm kiếm bằng mã khách hàng", JOptionPane.INFORMATION_MESSAGE, iconFind, null, null);
            boolean resultInput = false;
            for (int i = 0; i < listKhachHang.size(); i++) {
                if (makh.equals(listKhachHang.get(i).getMaKH())) {
                    JOptionPane.showMessageDialog(this, "Tìm thấy khách hàng!", "Tìm kiếm", JOptionPane.INFORMATION_MESSAGE, iconFind);
                    resultInput = true;
                    txtMaKH.setText(listKhachHang.get(i).getMaKH());
                    txtTenKH.setText(listKhachHang.get(i).getTenKH());
                    txtSoDT.setText(listKhachHang.get(i).getSdt());
                    taDiaChi.setText(listKhachHang.get(i).getDiaChi());
                    model.setRowCount(0);

                    Object objectKH[] = new Object[]{
                        listKhachHang.get(i).getMaKH(),
                        listKhachHang.get(i).getTenKH(),
                        listKhachHang.get(i).getSdt(),
                        listKhachHang.get(i).getDiaChi(),};
                    model.addRow(objectKH);
                }
            }
            if (resultInput == false) {
                JOptionPane.showMessageDialog(this, "Không tìm thấy!", "Tìm kiếm", JOptionPane.INFORMATION_MESSAGE, iconFind);
            }
        } else if (result == 1) {
            String tenKH = (String) JOptionPane.showInputDialog(this, "Mời bạn nhập tên khách hàng!", "Tìm kiếm bằng tên khách", JOptionPane.INFORMATION_MESSAGE, iconFind, null, null);
            boolean resultInput = false;
            for (int i = 0; i < listKhachHang.size(); i++) {
                if (tenKH.equals(listKhachHang.get(i).getTenKH())) {
                    JOptionPane.showMessageDialog(this, "Tìm thấy khách hàng", "Tìm kiếm", JOptionPane.INFORMATION_MESSAGE, iconFind);
                    resultInput = true;
                    txtMaKH.setText(listKhachHang.get(i).getMaKH());
                    txtTenKH.setText(listKhachHang.get(i).getTenKH());
                    txtSoDT.setText(listKhachHang.get(i).getSdt());
                    taDiaChi.setText(listKhachHang.get(i).getDiaChi());
                    model.setRowCount(0);

                    Object objectKH[] = new Object[]{
                        listKhachHang.get(i).getMaKH(),
                        listKhachHang.get(i).getTenKH(),
                        listKhachHang.get(i).getSdt(),
                        listKhachHang.get(i).getDiaChi()};
                    model.addRow(objectKH);
                }
            }
            if (resultInput == false) {
                JOptionPane.showMessageDialog(this, "Không tìm thấy!", "Tìm kiếm", JOptionPane.INFORMATION_MESSAGE, iconFind);
            }
        } else if (result == 2) {
            String soDT = (String) JOptionPane.showInputDialog(this, "Mời bạn nhập số điện thoại của khách hàng!", "Tìm kiếm bằng số điện thoại khách hàng", JOptionPane.INFORMATION_MESSAGE, iconFind, null, null);
            boolean resultInput = false;
            for (int i = 0; i < listKhachHang.size(); i++) {
                if (soDT.equals(listKhachHang.get(i).getSdt())) {
                    JOptionPane.showMessageDialog(this, "Tìm thấy khách hàng!", "Tìm kiếm", JOptionPane.INFORMATION_MESSAGE, iconFind);
                    resultInput = true;
                    txtMaKH.setText(listKhachHang.get(i).getMaKH());
                    txtTenKH.setText(listKhachHang.get(i).getTenKH());
                    txtSoDT.setText(listKhachHang.get(i).getSdt());
                    taDiaChi.setText(listKhachHang.get(i).getDiaChi());
                    model.setRowCount(0);

                    Object objectKH[] = new Object[]{
                        listKhachHang.get(i).getMaKH(),
                        listKhachHang.get(i).getTenKH(),
                        listKhachHang.get(i).getSdt(),
                        listKhachHang.get(i).getDiaChi()};
                    model.addRow(objectKH);
                }
            }
            if (resultInput == false) {
                JOptionPane.showMessageDialog(this, "Không tìm thấy!", "Tìm kiếm", JOptionPane.INFORMATION_MESSAGE, iconFind);
            }
        }
    }
    //    private void xoaKH() {
//        try {
//             int selectRow = tbQLNV.getSelectedRow();
//            listNhanVien.remove(selectRow);
//             this.loadTable();
//        } catch (Exception e) {
//        }

//            if (listKhachHang.size() <= 0) {
//                JOptionPane.showMessageDialog(this, "Không còn dữ liệu để xóa");
//                return;
//            }
//            int hoi = JOptionPane.showConfirmDialog(this, "Bạn có muốn xóa không ?", "Xóa Nhân Viên", JOptionPane.YES_NO_OPTION);
//            if (hoi != JOptionPane.YES_OPTION) {
//                return;
//            }
//            //xóa trong list
//            
//            listKhachHang.remove(index);
//            JOptionPane.showMessageDialog(this,"Xóa thành côngg");
//            showDeail();
    //XÓA trong csdl
//            String sql = "delete from KHACHHANG\n"
//                    + "where maKH=?";
//            PreparedStatement ps = cn.prepareStatement(sql);
//            ps.setString(1, txtMaKH.getText());
//            int row = ps.executeUpdate();
//            if (row > 0) {
//                JOptionPane.showMessageDialog(this, "Xóa thành công");
//                //sử lý sau khi xóa
//                if (listKhachHang.size() == 0) {
//                    clear();
//                }else{
//                  if(index == listKhachHang.size()){
//                    index--;
//                  }
//                  showDeail();
//                  ps.close();
//                }
//            }else{
//               JOptionPane.showMessageDialog(this, "Bạn không xóa được khách hàng nào");
//            }
//        } catch (Exception e) {
//               JOptionPane.showMessageDialog(this, "Lỗi xóa ");
//        }
//    }
    private void setTextMaKH() {
        String sql = "SELECT * FROM KHACHHANG";
        int SLKH = 0;
        try {
            Statement stm = cn.createStatement();
            ResultSet rs = stm.executeQuery(sql);
            while (rs.next()) {
                SLKH++;
            }
        } catch (Exception e) {
        }
        int lastKH = SLKH + 1;
        String first = "KH";
        String first1 = "KH0";

        if (lastKH < 10) {
            txtMaKH.setText(first1 + lastKH);
        } else {
            txtMaKH.setText(first + lastKH);
        }

//        try {
//            String sql = "select manv from nhanvien";
//
//            PreparedStatement pst = cn.prepareStatement(sql);
//            
//            ResultSet rs = pst.executeQuery();
//            
//            while(){
//                
//            }
//        } catch (Exception e) {
//        }
    }
}
