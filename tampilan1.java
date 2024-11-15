
package projekakhirp;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.HashMap;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class tampilan1 extends javax.swing.JFrame {
    
    Connection conn  ;
    private  DefaultTableModel modelw;
    private  DefaultTableModel modelp;
//    private  DefaultTableModel modelt;
//    HashMap<String, Integer> karyawanMap = new HashMap<>(); 
//    HashMap<String, Integer> proyekMap = new HashMap<>();
    
    
    public tampilan1() {
        
        initComponents();
        conn = Koneksi.getConnection();
        
        modelw = new DefaultTableModel();
        modelp = new DefaultTableModel();
//        modelt = new DefaultTableModel();
        
        tabel_tradisional.setModel(modelw);
//        tabel_tradisional.setEnabled(false);
        modelw.addColumn("ID");
        modelw.addColumn("nama_budaya");
        modelw.addColumn("asal_daerah");
        modelw.addColumn("deskripsi");
        modelw.addColumn("tahun/abad ke");
        
        tabel_kuliner.setModel(modelp);
//        tabel_proyek.setEnabled(false);
        modelp.addColumn("ID");
        modelp.addColumn("nama_budaya");
        modelp.addColumn("asal_darah");
        modelp.addColumn("deskripsi");
        modelp.addColumn("tahun/abad ke");
        
//        tabel_transaksi.setModel(modelt);
//        tabel_proyek.setEnabled(false);
//        modelt.addColumn("ID_transaksi");
//        modelt.addColumn("ID_karyawan");
//        modelt.addColumn("ID_proyek");
//        modelt.addColumn("Peran");
//        
        loadDataK();
        loadDataP();
//        loadDataT(); 
//        
//        loadComboBoxKaryawan();
//        loadComboBoxProyek();
//        loadDatatransaksi();
    }
    
    private void loadDataK() {
        modelw.setRowCount(0);
        
        try {
            String sql = "SELECT * FROM budaya";
            PreparedStatement ps = conn.prepareStatement(sql);
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                modelw.addRow(new Object[]{
                    rs.getInt("ID"),
                    rs.getString("nama"),
                    rs.getString("asal_daerah"),
                    rs.getString("deskripsi"),
                    rs.getInt("tahun")
                });
            }
        } catch (SQLException e) {
            System.out.println("Error Save Data" + e.getMessage());
        }
    }
    private void loadDataP() {
        modelp.setRowCount(0);
        
        try {
            String sql = "SELECT * FROM budaya_kuliner";
            PreparedStatement ps = conn.prepareStatement(sql);
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                modelp.addRow(new Object[]{
                    rs.getInt("ID"),
                    rs.getString("nama"),
                    rs.getString("asal_daerah"),
                    rs.getString("deskripsi"),
                    rs.getInt("tahun")
                });
            }
        } catch (SQLException e) {
            System.out.println("Error Save Data" + e.getMessage());
        }
    }
    private void refreshT() {
        tf_nama.setText("");
    tf_asaldaerah.setText("");
    tf_id.setText("");
    tf_deskripsi.setText("");
    tf_tahun.setText("");
    }
    
    private void refreshK() {
        Tf_nama.setText("");
    Tf_asaldaerah.setText("");
    Tf_id.setText("");
    Tf_deskripsi.setText("");
    Tf_tahun.setText("");
    }
//    private void loadDataT() {
//        modelt.setRowCount(0);
//        
//        try {
//            String sql = "SELECT * FROM transaksi";
//            PreparedStatement ps = conn.prepareStatement(sql);
//            ResultSet rs = ps.executeQuery();
//            while (rs.next()) {
//                modelt.addRow(new Object[]{
//                    rs.getString("id_transaksi"),
//                    rs.getInt("id_karyawan"),
//                    rs.getString("id_proyek"),
//                    rs.getString("peran")
//                });
//            }
//        } catch (SQLException e) {
//            System.out.println("Error Save Data" + e.getMessage());
//        }
//    }
    
//    private void loadDatatransaksi() {
//         String proyek= "SELECT  id,nama_proyek FROM proyek"; 
//         String karyawan = "SELECT id,nama FROM karyawan"; 
//
//    try (PreparedStatement psProyek = conn.prepareStatement(proyek);
//         ResultSet rsProyek = psProyek.executeQuery()) {
//
//        while (rsProyek.next()) {
//            String namaProyek = rsProyek.getString("nama_proyek"); 
//            id_proyek.addItem(namaProyek);
//            int idProyek = rsProyek.getInt("id");
//            proyekMap.put(namaProyek,idProyek);
//        }
//    } catch (SQLException e) {
//        System.out.println("Error Save Data" + e.getMessage());
//        }
//
//    try (PreparedStatement psKaryawan = conn.prepareStatement(karyawan);
//         ResultSet rsKaryawan = psKaryawan.executeQuery()) {
//
//        while (rsKaryawan.next()) {
//            String namaKaryawan = rsKaryawan.getString("nama"); // Ganti nama kolom sesuai tabel
//            id_karyawan.addItem(namaKaryawan);
//            int idKaryawan = rsKaryawan.getInt("id");
//            karyawanMap.put(namaKaryawan, idKaryawan);
//        }
//    } catch (SQLException e) {
//        System.out.println("Error Save Data" + e.getMessage());
//    }   
//
//    }
    
    

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {
        java.awt.GridBagConstraints gridBagConstraints;

        jPanel5 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jButton4 = new javax.swing.JButton();
        jButton14 = new javax.swing.JButton();
        jTextField1 = new javax.swing.JTextField();
        jPanel1 = new javax.swing.JPanel();
        jTabbedPane1 = new javax.swing.JTabbedPane();
        jPanel2 = new javax.swing.JPanel();
        jPanel6 = new javax.swing.JPanel();
        jPanel8 = new javax.swing.JPanel();
        jPanel9 = new javax.swing.JPanel();
        jPanel10 = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        tf_nama = new javax.swing.JTextField();
        tf_asaldaerah = new javax.swing.JTextField();
        tf_deskripsi = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        tf_tahun = new javax.swing.JTextField();
        jScrollPane3 = new javax.swing.JScrollPane();
        tabel_tradisional = new javax.swing.JTable();
        jLabel8 = new javax.swing.JLabel();
        kembali1 = new javax.swing.JButton();
        reset1 = new javax.swing.JButton();
        hapus1 = new javax.swing.JButton();
        update1 = new javax.swing.JButton();
        tambah1 = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        jLabel14 = new javax.swing.JLabel();
        tf_id = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        jPanel11 = new javax.swing.JPanel();
        jPanel12 = new javax.swing.JPanel();
        jPanel13 = new javax.swing.JPanel();
        jLabel12 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        Tf_nama = new javax.swing.JTextField();
        Tf_asaldaerah = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        Tf_deskripsi = new javax.swing.JTextField();
        jLabel13 = new javax.swing.JLabel();
        Tf_tahun = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        tabel_kuliner = new javax.swing.JTable();
        kembali2 = new javax.swing.JButton();
        jPanel18 = new javax.swing.JPanel();
        update2 = new javax.swing.JButton();
        tambah2 = new javax.swing.JButton();
        hapus2 = new javax.swing.JButton();
        reset2 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jLabel15 = new javax.swing.JLabel();
        Tf_id = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        jPanel7 = new javax.swing.JPanel();
        jLabel9 = new javax.swing.JLabel();

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );

        jLabel1.setText("jLabel1");

        jButton4.setText("jButton4");

        jButton14.setText("jButton14");

        jTextField1.setText("jTextField1");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(0, 0, 0));

        jTabbedPane1.setToolTipText("");
        jTabbedPane1.setOpaque(true);

        jPanel6.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel8.setLayout(new java.awt.GridLayout(1, 2));

        jPanel10.setLayout(new java.awt.GridBagLayout());

        jLabel5.setFont(new java.awt.Font("Arial Black", 0, 12)); // NOI18N
        jLabel5.setText("Nama");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 2;
        gridBagConstraints.gridheight = 2;
        gridBagConstraints.ipadx = 75;
        gridBagConstraints.ipady = 7;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(11, 15, 0, 0);
        jPanel10.add(jLabel5, gridBagConstraints);

        jLabel6.setFont(new java.awt.Font("Arial Black", 0, 12)); // NOI18N
        jLabel6.setText("Asal Daerah");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 4;
        gridBagConstraints.gridheight = 2;
        gridBagConstraints.ipadx = 11;
        gridBagConstraints.ipady = 7;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(11, 15, 0, 0);
        jPanel10.add(jLabel6, gridBagConstraints);

        jLabel7.setFont(new java.awt.Font("Arial Black", 0, 12)); // NOI18N
        jLabel7.setText("Deskripsi");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 6;
        gridBagConstraints.gridheight = 2;
        gridBagConstraints.ipadx = 29;
        gridBagConstraints.ipady = 7;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(11, 15, 0, 0);
        jPanel10.add(jLabel7, gridBagConstraints);
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 2;
        gridBagConstraints.gridy = 2;
        gridBagConstraints.ipadx = 191;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(9, 6, 0, 8);
        jPanel10.add(tf_nama, gridBagConstraints);
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 2;
        gridBagConstraints.gridy = 4;
        gridBagConstraints.ipadx = 191;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(9, 6, 0, 8);
        jPanel10.add(tf_asaldaerah, gridBagConstraints);
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 2;
        gridBagConstraints.gridy = 6;
        gridBagConstraints.ipadx = 191;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(9, 6, 0, 8);
        jPanel10.add(tf_deskripsi, gridBagConstraints);

        jLabel2.setFont(new java.awt.Font("Arial Black", 1, 12)); // NOI18N
        jLabel2.setText("Tahun/abad ke ");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 8;
        gridBagConstraints.gridwidth = 2;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(14, 15, 0, 0);
        jPanel10.add(jLabel2, gridBagConstraints);

        tf_tahun.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tf_tahunActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 2;
        gridBagConstraints.gridy = 8;
        gridBagConstraints.gridheight = 2;
        gridBagConstraints.ipadx = 191;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(9, 6, 17, 8);
        jPanel10.add(tf_tahun, gridBagConstraints);

        javax.swing.GroupLayout jPanel9Layout = new javax.swing.GroupLayout(jPanel9);
        jPanel9.setLayout(jPanel9Layout);
        jPanel9Layout.setHorizontalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel10, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 330, Short.MAX_VALUE)
        );
        jPanel9Layout.setVerticalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel9Layout.createSequentialGroup()
                .addComponent(jPanel10, javax.swing.GroupLayout.DEFAULT_SIZE, 201, Short.MAX_VALUE)
                .addContainerGap())
        );

        jPanel8.add(jPanel9);

        jPanel6.add(jPanel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 30, 330, 199));

        tabel_tradisional.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "ID", "nama_budaya", "asal_daerah", "deskripsi", "tahun/abad ke"
            }
        ));
        tabel_tradisional.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tabel_tradisionalMouseClicked(evt);
            }
        });
        jScrollPane3.setViewportView(tabel_tradisional);

        jPanel6.add(jScrollPane3, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 320, 680, 220));
        jPanel6.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(399, 267, 155, -1));

        kembali1.setFont(new java.awt.Font("Arial Black", 0, 12)); // NOI18N
        kembali1.setText("Keluar");
        kembali1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                kembali1ActionPerformed(evt);
            }
        });
        jPanel6.add(kembali1, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 250, 110, 40));

        reset1.setFont(new java.awt.Font("Arial Black", 0, 12)); // NOI18N
        reset1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/projekakhirp/resetttt.png"))); // NOI18N
        reset1.setText("Reset");
        reset1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                reset1ActionPerformed(evt);
            }
        });
        jPanel6.add(reset1, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 140, 90, 24));

        hapus1.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 12)); // NOI18N
        hapus1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/projekakhirp/hapusss.png"))); // NOI18N
        hapus1.setText("Delete");
        hapus1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                hapus1ActionPerformed(evt);
            }
        });
        jPanel6.add(hapus1, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 70, -1, -1));

        update1.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 12)); // NOI18N
        update1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/projekakhirp/editttt.png"))); // NOI18N
        update1.setText("Update");
        update1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                update1ActionPerformed(evt);
            }
        });
        jPanel6.add(update1, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 140, -1, -1));

        tambah1.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 12)); // NOI18N
        tambah1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/projekakhirp/saveeee.png"))); // NOI18N
        tambah1.setText("Tambah");
        tambah1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tambah1ActionPerformed(evt);
            }
        });
        jPanel6.add(tambah1, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 70, -1, -1));

        jButton1.setText("Sejarah Budaya Tradisonal");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel6.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 670, 230, 30));

        jLabel14.setIcon(new javax.swing.ImageIcon(getClass().getResource("/projekakhirp/bg.jpeg"))); // NOI18N
        jPanel6.add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 740, 750));
        jPanel6.add(tf_id, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 10, 197, -1));

        jLabel4.setFont(new java.awt.Font("Arial Black", 0, 12)); // NOI18N
        jLabel4.setText("ID");
        jPanel6.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 10, 89, 25));

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel6, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        jTabbedPane1.addTab("BUDAYA TRADISIONAL", jPanel2);

        jPanel11.setBackground(new java.awt.Color(51, 204, 0));
        jPanel11.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel12.setBackground(new java.awt.Color(198, 231, 255));

        jPanel13.setLayout(new java.awt.GridBagLayout());

        jLabel12.setFont(new java.awt.Font("Arial Black", 0, 12)); // NOI18N
        jLabel12.setText("Asal Daerah");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 4;
        gridBagConstraints.gridwidth = 2;
        gridBagConstraints.gridheight = 2;
        gridBagConstraints.ipadx = 2;
        gridBagConstraints.ipady = 11;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(3, 40, 0, 0);
        jPanel13.add(jLabel12, gridBagConstraints);

        jLabel11.setFont(new java.awt.Font("Arial Black", 0, 12)); // NOI18N
        jLabel11.setText("Nama Budaya");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 2;
        gridBagConstraints.gridwidth = 4;
        gridBagConstraints.gridheight = 2;
        gridBagConstraints.ipady = 9;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(3, 40, 0, 0);
        jPanel13.add(jLabel11, gridBagConstraints);

        Tf_nama.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Tf_namaActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 5;
        gridBagConstraints.gridy = 2;
        gridBagConstraints.ipadx = 170;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(3, 6, 0, 74);
        jPanel13.add(Tf_nama, gridBagConstraints);
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 5;
        gridBagConstraints.gridy = 4;
        gridBagConstraints.ipadx = 170;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(3, 6, 0, 74);
        jPanel13.add(Tf_asaldaerah, gridBagConstraints);

        jLabel3.setFont(new java.awt.Font("Arial Black", 1, 12)); // NOI18N
        jLabel3.setText("Deskripsi");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 6;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(6, 40, 0, 0);
        jPanel13.add(jLabel3, gridBagConstraints);
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 5;
        gridBagConstraints.gridy = 6;
        gridBagConstraints.gridheight = 2;
        gridBagConstraints.ipadx = 170;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(1, 6, 0, 74);
        jPanel13.add(Tf_deskripsi, gridBagConstraints);

        jLabel13.setFont(new java.awt.Font("Arial Black", 1, 12)); // NOI18N
        jLabel13.setText("Tahun/abad ke ");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 8;
        gridBagConstraints.gridwidth = 5;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(14, 40, 0, 0);
        jPanel13.add(jLabel13, gridBagConstraints);

        Tf_tahun.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Tf_tahunActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 5;
        gridBagConstraints.gridy = 8;
        gridBagConstraints.gridheight = 2;
        gridBagConstraints.ipadx = 170;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(9, 6, 19, 74);
        jPanel13.add(Tf_tahun, gridBagConstraints);

        javax.swing.GroupLayout jPanel12Layout = new javax.swing.GroupLayout(jPanel12);
        jPanel12.setLayout(jPanel12Layout);
        jPanel12Layout.setHorizontalGroup(
            jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel13, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel12Layout.setVerticalGroup(
            jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel13, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        jPanel11.add(jPanel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(43, 36, 410, 190));

        tabel_kuliner.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "ID", "nama_budaya", "asal_daerah", "deskripsi", "tahun/abad ke"
            }
        ));
        tabel_kuliner.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tabel_kulinerMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tabel_kuliner);

        jPanel11.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 420, 658, 190));

        kembali2.setFont(new java.awt.Font("Arial Black", 0, 12)); // NOI18N
        kembali2.setText("Keluar");
        kembali2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                kembali2ActionPerformed(evt);
            }
        });
        jPanel11.add(kembali2, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 140, -1, -1));

        jPanel18.setLayout(new java.awt.GridBagLayout());

        update2.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 12)); // NOI18N
        update2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/projekakhirp/editttt.png"))); // NOI18N
        update2.setText("Update");
        update2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                update2ActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.insets = new java.awt.Insets(0, 6, 0, 6);
        jPanel18.add(update2, gridBagConstraints);

        tambah2.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 12)); // NOI18N
        tambah2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/projekakhirp/saveeee.png"))); // NOI18N
        tambah2.setText("Tambah");
        tambah2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tambah2ActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.insets = new java.awt.Insets(0, 8, 0, 8);
        jPanel18.add(tambah2, gridBagConstraints);

        hapus2.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 12)); // NOI18N
        hapus2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/projekakhirp/hapusss.png"))); // NOI18N
        hapus2.setText("Delete");
        hapus2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                hapus2ActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.insets = new java.awt.Insets(0, 6, 0, 6);
        jPanel18.add(hapus2, gridBagConstraints);

        reset2.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 12)); // NOI18N
        reset2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/projekakhirp/resetttt.png"))); // NOI18N
        reset2.setText("Reset");
        reset2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                reset2ActionPerformed(evt);
            }
        });
        jPanel18.add(reset2, new java.awt.GridBagConstraints());

        jPanel11.add(jPanel18, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 240, 410, 27));

        jButton2.setText("Sejarah Budaya Kuliner");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        jPanel11.add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 690, -1, -1));

        jLabel15.setIcon(new javax.swing.ImageIcon(getClass().getResource("/projekakhirp/makanan-khas-indonesia-dengan-filosofi-unik.jpg"))); // NOI18N
        jPanel11.add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 750, 750));
        jPanel11.add(Tf_id, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 20, 176, -1));

        jLabel10.setFont(new java.awt.Font("Arial Black", 0, 12)); // NOI18N
        jLabel10.setText("ID");
        jPanel11.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 60, 89, 27));

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel11, javax.swing.GroupLayout.PREFERRED_SIZE, 747, Short.MAX_VALUE)
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel11, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        jTabbedPane1.addTab("BUDAYA KULINER", jPanel4);

        jPanel7.setLayout(new java.awt.GridBagLayout());

        jLabel9.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel9.setText("PENGELOLAAN INFORMASI BUDAYA TRADISONAL DAN KULINER INDONESIA");
        jPanel7.add(jLabel9, new java.awt.GridBagConstraints());

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jTabbedPane1)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jPanel7, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jTabbedPane1))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void tambah2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tambah2ActionPerformed
    if (Tf_nama.getText().isEmpty() || 
        Tf_asaldaerah.getText().isEmpty() ||
            Tf_deskripsi.getText().isEmpty() ||
            Tf_tahun.getText().isEmpty()) {
        
        JOptionPane.showMessageDialog(this, 
            "Harap isi dulu!", 
            "Peringatan", 
            JOptionPane.WARNING_MESSAGE);
        return;
    }
        try {
        // Cek apakah Tf_durasi berisi angka
        int thn = Integer.parseInt(Tf_tahun.getText());
        
        
        String sql = "INSERT INTO budaya_kuliner (nama, asal_daerah, deskripsi, tahun) VALUES (?,?,?,?)";
        PreparedStatement ps = conn.prepareStatement(sql);
//        ps.setInt(1, id);
        ps.setString(1, Tf_nama.getText());
        ps.setString(2, Tf_asaldaerah.getText()); // Menggunakan setInt untuk kolom durasi_pengerjaan
        ps.setString(3, Tf_deskripsi.getText());
        ps.setInt(4, thn);
        ps.executeUpdate();
        
        JOptionPane.showMessageDialog(this, "Data berhasil ditambahkan!");
        loadDataP();
        refreshK();
//        loadComboBoxProyek();
        } catch (NumberFormatException e) {
            // Menampilkan pesan jika tahun tidak valid
            JOptionPane.showMessageDialog(this, "Tahun harus berupa angka.", "Input Error", JOptionPane.ERROR_MESSAGE);

        }
        
        catch (SQLException e) {
            System.out.println("Error Save Data: " + e.getMessage());
        }
    }//GEN-LAST:event_tambah2ActionPerformed

    private void kembali1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_kembali1ActionPerformed
       int keluar = JOptionPane.showConfirmDialog(null,"beneran mau keluar?","Keluar",JOptionPane.YES_NO_OPTION);
        if (keluar == JOptionPane.YES_OPTION) {
            System.exit(0);
        }
    }//GEN-LAST:event_kembali1ActionPerformed

    private void reset1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_reset1ActionPerformed
    refreshT();
    }//GEN-LAST:event_reset1ActionPerformed

    private void update2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_update2ActionPerformed
        if (Tf_id.getText().isEmpty()) {
        
        JOptionPane.showMessageDialog(this, 
            "Harap isi id dulu!", 
            "Peringatan", 
            JOptionPane.WARNING_MESSAGE);
        return;
        }
        if (tabel_kuliner.getRowCount() == 0) {
        JOptionPane.showMessageDialog(this, "THERE IS NO DATA", "DISCLAIMER !!!", JOptionPane.WARNING_MESSAGE);
            }else{
            try {
          String sql = "UPDATE budaya_kuliner SET nama = ?, asal_daerah = ?, deskripsi = ?, tahun = ? WHERE id = ?";
          PreparedStatement ps = conn.prepareStatement(sql);
          ps.setString(1, Tf_nama.getText());
          ps.setString(2, Tf_asaldaerah.getText());
          ps.setString(3, Tf_deskripsi.getText());
          String tahun = Tf_tahun.getText().isEmpty() ? "Tahun tidak diketahui" : Tf_tahun.getText();
        ps.setString(4, tahun);
          ps.setInt(5,Integer.parseInt(Tf_id.getText()));
          ps.executeUpdate();
          JOptionPane.showMessageDialog(this, "Data berhasil diupdate!");
          loadDataP();
          refreshK();
      }  catch (SQLException e) {
          System.out.println("Error Save Data" + e.getMessage());
      }
            
            
//                try {  
//                    String sql = "SELECT nama, asal_daerah, deskripsi FROM budaya_kuliner WHERE id = ?";
//                    PreparedStatement ps = conn.prepareStatement(sql);
//                    ps.setInt(1, Integer.parseInt(Tf_id.getText()));
//                    ResultSet rs = ps.executeQuery();
//
//                    if (!rs.next()) {
//                        JOptionPane.showMessageDialog(this, "THERE IS NO DATA", "DISCLAIMER !!!", JOptionPane.WARNING_MESSAGE);
//                        return;
//                    }
//                    String proname = Tf_nama.getText().isEmpty() ? rs.getString("nama_proyek") : Tf_nama.getText();
//                    String duration = Tf_asaldaerah.getText().isEmpty() ? rs.getString("durasi_pengerjaan") : Tf_asaldaerah.getText();
//                    String upsql = "UPDATE proyek SET nama_proyek = ?, durasi_pengerjaan = ? WHERE id = ?";
//                    PreparedStatement upps = conn.prepareStatement(upsql);
//                    upps.setString(1, proname);
//                    upps.setString(2, duration);
//                    upps.setInt(3, Integer.parseInt(Tf_id.getText()));
//                    upps.executeUpdate();
//
//                    JOptionPane.showMessageDialog(this, "P SUKSES");
//                    loadDataP();
//            } catch (SQLException e) {
//                System.out.println("Error updating data: " + e.getMessage());
//            }
                }

    }//GEN-LAST:event_update2ActionPerformed

    private void hapus2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_hapus2ActionPerformed
      if (Tf_id.getText().isEmpty()) {
        
        JOptionPane.showMessageDialog(this, 
            "Harap isi dulu!", 
            "Peringatan", 
            JOptionPane.WARNING_MESSAGE);
        return;
    }else
        try  {
            String sql = "DELETE FROM budaya_kuliner WHERE id = ?";
            PreparedStatement ps = conn.prepareStatement(sql);
            ps.setInt(1, Integer.parseInt(Tf_id.getText()));
            ps.executeUpdate();
            JOptionPane.showMessageDialog(this, "Data berhasil dihapus!");
            loadDataP();
            refreshK();
        } catch (SQLException e) {
            System.out.println("Error Save Data" + e.getMessage());
        }
    }//GEN-LAST:event_hapus2ActionPerformed

    private void kembali2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_kembali2ActionPerformed
      int keluar = JOptionPane.showConfirmDialog(null,"beneran mau keluar?","Keluar",JOptionPane.YES_NO_OPTION);
        if (keluar == JOptionPane.YES_OPTION) {
            System.exit(0);
        }
    }//GEN-LAST:event_kembali2ActionPerformed

    private void reset2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_reset2ActionPerformed
    refreshK();
    }//GEN-LAST:event_reset2ActionPerformed

    private void Tf_namaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Tf_namaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_Tf_namaActionPerformed

    private void tabel_tradisionalMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tabel_tradisionalMouseClicked
    int i = tabel_tradisional.getSelectedRow();
        if(i==-1){
            return;
        
        }
        Integer tahunnn = (Integer) tabel_tradisional.getValueAt(i, 0);
tf_id.setText(String.valueOf(tahunnn));
//        String id = (String) tabel_tradisional.getValueAt(i,0);
//        tf_id.setText(id);
        
        String nama = (String) tabel_tradisional.getValueAt(i,1);
        tf_nama.setText(nama);
        
        String asal_daerahh = (String) tabel_tradisional.getValueAt(i,2);
        tf_asaldaerah.setText(asal_daerahh);
        
        String deskripsii = (String) tabel_tradisional.getValueAt(i,3);
        tf_deskripsi.setText(deskripsii);
        
        Integer tahunn = (Integer) tabel_tradisional.getValueAt(i, 4);
tf_tahun.setText(String.valueOf(tahunn));
//        String tahunn = (String)tabel_tradisional.getValueAt(i,4);
//        tf_tahun.setText(tahunn);
        // TODO add your handling code here:
    }//GEN-LAST:event_tabel_tradisionalMouseClicked

    private void Tf_tahunActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Tf_tahunActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_Tf_tahunActionPerformed

    private void tf_tahunActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tf_tahunActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tf_tahunActionPerformed

    private void hapus1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_hapus1ActionPerformed
        if (tf_id.getText().isEmpty()) {

            JOptionPane.showMessageDialog(this,
                "Harap isi id dulu!",
                "Peringatan",
                JOptionPane.WARNING_MESSAGE);
            return;
        }else
        try  {

            String sql = "DELETE FROM budaya WHERE id = ?";
            PreparedStatement ps = conn.prepareStatement(sql);
            ps.setInt(1, Integer.parseInt(tf_id.getText()));
            ps.executeUpdate();
            JOptionPane.showMessageDialog(this, "Data berhasil dihapus!");
            loadDataK();
            refreshT();
            //            IdProj();
        } catch (SQLException e) {
            System.out.println("Error Save Data" + e.getMessage());
        }
    }//GEN-LAST:event_hapus1ActionPerformed

    private void update1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_update1ActionPerformed
        if (tf_id.getText().isEmpty()) {

            JOptionPane.showMessageDialog(this,
                "Harap isi id dulu!",
                "Peringatan",
                JOptionPane.WARNING_MESSAGE);
            return;
        }
        if (tf_tahun.getText().isEmpty()) {

            JOptionPane.showMessageDialog(this,
                "Harap isi tahun/abad dulu!",
                "Peringatan",
                JOptionPane.WARNING_MESSAGE);
            return;
        }
        if (tabel_tradisional.getRowCount() == 0) {
            JOptionPane.showMessageDialog(this, "THERE IS NO DATA", "DISCLAIMER !!!", JOptionPane.WARNING_MESSAGE);
        }else

//        String id = tf_id.getText();
//        String nama = tf_nama.getText(); 
//        String asal_daerah = tf_asaldaerah.getText();
//        String deskripsi = tf_deskripsi.getText();
//        String tahun = tf_tahun.getText();
//        String status =(String) cmbstatus.getSelectedItem();
        
//        try {
//        Statement statement = (Statement) Koneksi.getConnection().createStatement();
//        statement.executeUpdate("UPDATE budaya SET nama='"+nama+"',asal_daerah='"+asal_daerah+"',deskripsi='"+deskripsi+"',tahun='"+tahun+"' WHERE ID='"+id+"'");
//        JOptionPane.showMessageDialog(null, "Data Berhasil Diedit");
//        loadDataK();
//        }
        
        try {
            String sql = "UPDATE budaya SET nama = ?, asal_daerah = ?, deskripsi = ?, tahun = ? WHERE id = ?";
            PreparedStatement ps = conn.prepareStatement(sql);
            ps.setString(1, tf_nama.getText());
            ps.setString(2, tf_asaldaerah.getText());
            ps.setString(3, tf_deskripsi.getText());
            //          String duration = tf_tahun.getText().isEmpty() ? rs.getString("durasi_pengerjaan") : tf_tahun.getText();
            String tahun = tf_tahun.getText().isEmpty() ? "Tahun tidak diketahui" : tf_tahun.getText();
            ps.setString(4, tahun);
            ps.setInt(5,Integer.parseInt(tf_id.getText()));
            ps.executeUpdate();
            JOptionPane.showMessageDialog(this, "Data berhasil diupdate!");
            loadDataK();
            refreshT();
        }
        catch (NumberFormatException e) {
            // Menampilkan pesan jika tahun tidak valid
            JOptionPane.showMessageDialog(this, "Tahun harus berupa angka.", "Input Error", JOptionPane.ERROR_MESSAGE);

        } catch (SQLException e) {
            System.out.println("Error Save Data" + e.getMessage());
        }
    }//GEN-LAST:event_update1ActionPerformed

    private void tambah1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tambah1ActionPerformed
        if (tf_nama.getText().isEmpty() ||
            tf_asaldaerah.getText().isEmpty() ||
            tf_deskripsi.getText().isEmpty() ||
            tf_tahun.getText().isEmpty()) {

            JOptionPane.showMessageDialog(this,
                "Harap isi dulu!",
                "Peringatan",
                JOptionPane.WARNING_MESSAGE);
            return;
        }else
        try{
            int thn = Integer.parseInt(tf_tahun.getText());

            String sql = "INSERT INTO budaya (nama, asal_daerah, deskripsi, tahun) VALUES (?, ?, ?, ?)";  //BINDABLE STATMEN
            PreparedStatement ps = conn.prepareStatement(sql);
            //         ps.setInt(1, id);
            ps.setString(1, tf_nama.getText());
            ps.setString(2, tf_asaldaerah.getText());
            ps.setString(3, tf_deskripsi.getText());
            ps.setInt(4, thn);
            ps.executeUpdate();
            JOptionPane.showMessageDialog(this, "Data berhasil ditambahkan!");
            loadDataK();
            refreshT();
            //         loadComboBoxKaryawan();
        }catch (NumberFormatException e) {
            // Menampilkan pesan jika tahun tidak valid
            JOptionPane.showMessageDialog(this, "Tahun harus berupa angka.", "Input Error", JOptionPane.ERROR_MESSAGE);

        }
        catch (SQLException e) {
            System.out.println("Error Save Data" + e.getMessage());
        }
    }//GEN-LAST:event_tambah1ActionPerformed

    private void tabel_kulinerMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tabel_kulinerMouseClicked
        int i = tabel_kuliner.getSelectedRow();
        if(i==-1){
            return;
        
        }
        Integer tahunnn = (Integer) tabel_kuliner.getValueAt(i, 0);
Tf_id.setText(String.valueOf(tahunnn));
//        String id = (String) tabel_tradisional.getValueAt(i,0);
//        tf_id.setText(id);
        
        String nama = (String) tabel_kuliner.getValueAt(i,1);
        Tf_nama.setText(nama);
        
        String asal_daerahh = (String) tabel_kuliner.getValueAt(i,2);
        Tf_asaldaerah.setText(asal_daerahh);
        
        String deskripsii = (String) tabel_kuliner.getValueAt(i,3);
        Tf_deskripsi.setText(deskripsii);
        
        Integer tahunn = (Integer) tabel_kuliner.getValueAt(i, 4);
Tf_tahun.setText(String.valueOf(tahunn));
        // TODO add your handling code here:
    }//GEN-LAST:event_tabel_kulinerMouseClicked

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
    new SejarahTradisional().show();
        this.dispose();
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
new SejarahKuliner().show();
        this.dispose();        // TODO add your handling code here:
    }//GEN-LAST:event_jButton2ActionPerformed
//    
//    private void loadComboBoxKaryawan() {
//        id_karyawan.removeAllItems();
//        try {
//            String sql = "SELECT id, nama, jabatan, departemen FROM karyawan";
//            PreparedStatement ps = conn.prepareStatement(sql);
//            ResultSet rs = ps.executeQuery();
//            while (rs.next()) {
//                String tampilan = String.format("%s", 
//                    rs.getInt("id")
////                    rs.getString("nama")
////                    rs.getString("jabatan"),
////                    rs.getString("departemen")
//                );
//                id_karyawan.addItem(tampilan);
//            }
//        } catch (SQLException e) {
//            System.out.println("Kesalahan Memuat Data Karyawan: " + e.getMessage());
//        }
//    }
//    
//    private void loadComboBoxProyek() {
//    id_proyek.removeAllItems();
//    try {
//        String sql = "SELECT id, nama_proyek, durasi_pengerjaan FROM proyek";
//        PreparedStatement ps = conn.prepareStatement(sql);
//        ResultSet rs = ps.executeQuery();
//        while (rs.next()) {
//            String tampilan = String.format("%s", 
//                rs.getInt("id")
////                rs.getString("nama_proyek")
////                rs.getString("durasi_pengerjaan")
//            );
//            id_proyek.addItem(tampilan);
//        }
//    } catch (SQLException e) {
//        System.out.println("Kesalahan Memuat Data Proyek: " + e.getMessage());
//    }

   private int getSelectedId(String textComboBox) {
    if (textComboBox == null) return -1;
    try {
        String idPart = textComboBox.substring(textComboBox.indexOf("ID: ") + 4);
        return Integer.parseInt(idPart.substring(0, idPart.indexOf(" -")));
    } catch (Exception e) {
        System.out.println("Error parsing ID: " + e.getMessage());
        return -1;
    }
}
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
            java.util.logging.Logger.getLogger(tampilan1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(tampilan1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(tampilan1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(tampilan1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new tampilan1().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField Tf_asaldaerah;
    private javax.swing.JTextField Tf_deskripsi;
    private javax.swing.JTextField Tf_id;
    private javax.swing.JTextField Tf_nama;
    private javax.swing.JTextField Tf_tahun;
    private javax.swing.JButton hapus1;
    private javax.swing.JButton hapus2;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton14;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton4;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel10;
    private javax.swing.JPanel jPanel11;
    private javax.swing.JPanel jPanel12;
    private javax.swing.JPanel jPanel13;
    private javax.swing.JPanel jPanel18;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JPanel jPanel8;
    private javax.swing.JPanel jPanel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JButton kembali1;
    private javax.swing.JButton kembali2;
    private javax.swing.JButton reset1;
    private javax.swing.JButton reset2;
    private javax.swing.JTable tabel_kuliner;
    private javax.swing.JTable tabel_tradisional;
    private javax.swing.JButton tambah1;
    private javax.swing.JButton tambah2;
    private javax.swing.JTextField tf_asaldaerah;
    private javax.swing.JTextField tf_deskripsi;
    private javax.swing.JTextField tf_id;
    private javax.swing.JTextField tf_nama;
    private javax.swing.JTextField tf_tahun;
    private javax.swing.JButton update1;
    private javax.swing.JButton update2;
    // End of variables declaration//GEN-END:variables
}
