import java.util.*;

public class MappingLambda {
    public static void main(String[] args) {
        Map<String, String> mahasiswaMap = new HashMap<>(); //map itu udh kayak list jg, cuma satu 'add' ada dua tuple
        mahasiswaMap.put("24060124120033", "Shalom Kurniawan");
        mahasiswaMap.put("24060124120034", "Dimas Pratama");
        mahasiswaMap.put("24060124120035", "Rizky Maulana");
        mahasiswaMap.forEach( (nim, nama) -> System.out.println("nim : "+ nim + ", nama: " + mahasiswaMap.get(nim)));
    }
}
