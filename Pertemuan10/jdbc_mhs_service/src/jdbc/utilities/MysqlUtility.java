package jdbc.utilities;

import java.sql.*;

public class MysqlUtility {
    
    private static Connection koneksi;
    
    public static Connection getConnection() {
        if (koneksi == null) {
            try {
                // Wajib pakai .cj. karena kamu pakai mysql-connector-j-9.3.0
                Class.forName("com.mysql.cj.jdbc.Driver"); 
                
                // Sesuaikan host, port, dan nama database yang kamu buat
                String url = "jdbc:mysql://localhost:3306/jdbc_mhs"; 
                
                // Username dan password dari akun MySQL yang baru saja kita buat
                String user = "student"; 
                String password = "rahasia"; 
                
                koneksi = DriverManager.getConnection(url, user, password); 
                
                if (koneksi != null) {
                    System.out.println("Koneksi berhasil"); 
                }
            } catch (ClassNotFoundException cne) {
                System.out.println("Gagal load driver : " + cne.getMessage()); 
            } catch (SQLException sqle) {
                System.out.println("Gagal Koneksi : " + sqle.getMessage()); 
            }
        }
        return koneksi;
    }
}