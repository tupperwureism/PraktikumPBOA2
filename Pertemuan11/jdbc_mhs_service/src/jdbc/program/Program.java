package jdbc.program;

import java.util.*;
import jdbc.model.Mahasiswa;
import jdbc.service.MysqlMahasiswaService;

/**
 * File : Program.java
 * Deskripsi : Program utama untuk simulasi CRUD mahasiswa
 */
public class Program {
    static MysqlMahasiswaService service = new MysqlMahasiswaService();

    public static void main(String[] args) {
        List<Mahasiswa> listMhs = new ArrayList<>();
        System.out.println("");

        // 1. INSERT
        System.out.println("=== INSERT ==-");
        Mahasiswa mhsAdd = new Mahasiswa(5, "Haryo");
        service.add(mhsAdd);
        System.out.println("berhasil insert: " + mhsAdd);
        displayAll();

        // 2. UPDATE
        System.out.println("=== UPDATE ===");
        Mahasiswa mhsUpdate = service.getById(5);
        System.out.println("Akan diupdate data lama: " + mhsUpdate);
        mhsUpdate.setNama("Dinaya");
        System.out.println("dengan data baru: " + mhsUpdate);
        service.update(mhsUpdate);
        displayAll();

        // 3. DELETE
        System.out.println("=== DELETE ===");
        System.out.println("akan di delete: " + service.getById(5));
        service.delete(5);
        displayAll();
    }

    public static void displayAll() {
        System.out.println("=== displayAll ===");
        List<Mahasiswa> listMhs = service.getAll();
        for (Mahasiswa m : listMhs) {
            System.out.println(m);
        }
        System.out.println("");
    }
}