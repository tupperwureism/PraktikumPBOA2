package jdbc.service;

import java.sql.*;
import java.util.*;
import jdbc.model.Mahasiswa;
import jdbc.utilities.MysqlUtility;

/**
 * File : MysqlMahasiswaService.java
 * Deskripsi : Penyedia layanan pengelolaan basis data mahasiswa 
 */
public class MysqlMahasiswaService {
    Connection koneksi = null;

    public MysqlMahasiswaService() {
        koneksi = MysqlUtility.getConnection();
    }

    public Mahasiswa makeMhsObject() {
        return new Mahasiswa();
    }

    public void add(Mahasiswa mhs) {
        String query = "INSERT INTO mahasiswa (id, nama) VALUES (" + mhs.getId() + ",'" + mhs.getNama() + "')";
        try {
            Statement s = koneksi.createStatement();
            s.executeUpdate(query);
            System.out.println("Berhasil insert");
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public void update(Mahasiswa mhs) {
        String query = "UPDATE mahasiswa SET nama = '" + mhs.getNama() + "' WHERE id = " + mhs.getId();
        try {
            Statement s = koneksi.createStatement();
            s.executeUpdate(query);
            System.out.println("Berhasil update");
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public void delete(int id) {
        String query = "DELETE FROM mahasiswa WHERE id = " + id;
        try {
            Statement s = koneksi.createStatement();
            s.executeUpdate(query);
            System.out.println("Berhasil delete");
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public Mahasiswa getById(int id) {
        Mahasiswa mhs = new Mahasiswa();
        String query = "SELECT * FROM mahasiswa WHERE id = " + id;
        try {
            Statement s = koneksi.createStatement();
            ResultSet rs = s.executeQuery(query);
            if (rs.next()) {
                mhs.setId(rs.getInt("id"));
                mhs.setNama(rs.getString("nama"));
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return mhs;
    }

    public List<Mahasiswa> getAll() {
        List<Mahasiswa> listMhs = new ArrayList<>();
        String query = "SELECT * FROM mahasiswa";
        try {
            Statement s = koneksi.createStatement();
            ResultSet rs = s.executeQuery(query);
            while (rs.next()) {
                listMhs.add(new Mahasiswa(rs.getInt("id"), rs.getString("nama")));
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return listMhs;
    }
    
    public void indexReset(){
        String queryTruncate = "TRUNCATE TABLE mahasiswa";
        Connection con = MysqlUtility.getConnection();
        try {
            Statement st = con.createStatement();
            st.executeUpdate(queryTruncate);
            System.out.println("Tabel berhasil dikosongkan dan indeks di-reset.");
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
    
    public boolean isEmpty() {
        String queryCount = "SELECT COUNT(*) AS jumlah FROM mahasiswa";
        Connection con = MysqlUtility.getConnection();
        try {
            Statement st = con.createStatement();
            ResultSet rs = st.executeQuery(queryCount);
            if (rs.next()) {
                return rs.getInt("jumlah") == 0;
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return true; // Mengembalikan true jika terjadi error atau data kosong
    }
    
    public void closeConnection() {
        try {
            Connection con = MysqlUtility.getConnection();
            if (con != null && !con.isClosed()) {
                con.close();
                System.out.println("Koneksi ke basis data sukses ditutup.");
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}