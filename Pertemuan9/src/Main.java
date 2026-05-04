/*
Nama : Shalom Kurniawan
NIM ; 24060124120033
Kelas : A
Tanggal : 4 Mei 2026
*/

public class Main {
    public static void main(String[] args) throws Exception {
        Teman T1 = new Teman();
        T1.addNama("Megawathy");
        T1.addNama("Jaka Widada");
        T1.addNama("Pribiwi");
        T1.showTeman();
        System.out.println("Banyak teman bernama Pribiwi: " + T1.countNama("Pribiwi"));
        T1.delNama("Jaka Widada");
        T1.showTeman();
        T1.gantiNama("Pribiwi", "Bobo");
        T1.showTeman();
        T1.setNama(1, "Pribiwi");
        T1.showTeman();

        System.out.println("--------------------------------------------------------------------------");

        Anabul A1 = new Kucing("Wowok",20);
        Anabul A2 = new Kucing("Wiwik", 15);
        Anabul A3 = new Anjing("Asukamuya");
        Anabul A4 = new Burung("Papilo");
        Piaraan P = new Piaraan();
        P.enqueueAnabul(A1);
        P.enqueueAnabul(A2);
        P.enqueueAnabul(A3);
        P.enqueueAnabul(A4);
        P.isMember(A4);
        System.out.println("anabul pertama: " + P.getAnabul().getNama());
        System.out.println("Jumlah kucing: " + P.countKucing());
        System.out.println("Bobot kucing: " + P.bobotKucing());
        P.showAnabul();
        P.showJenisAnabul();
        P.dequeueAnabul();
        System.out.println("Jumlah kucing: " + P.countKucing());
        System.out.println("Jumlah bobot kucing: " + P.bobotKucing());
        P.showAnabul();
        P.showJenisAnabul();


    }
}
