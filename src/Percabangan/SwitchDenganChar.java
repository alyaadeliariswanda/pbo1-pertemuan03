package Percabangan;

public class SwitchDenganChar {
    public static void main(String[] args) {
        char nilai = 'D';
        switch (nilai) {
            case 'A';
                System.out.println("Mhs    :\"Terima kasig pak\"");
                System.out.println("Dosen  :\"Selamat ya!!\"");
                break;
            case 'B';
                System.out.println("Mhs    :\"Kenapa ulun kada dapat A pak?\"");
                System.out.println("Dosen  :\"yfugjnjo\"");
                break;
            case 'C';
                System.out.println("Mhs    :\"ulun turun tarus pa ai,tugas ngumpul\"");
                System.out.println("Dosen  :\"Tapi bisalah menjawab ujian?\"");
                System.out.println("Mhs    :\"heheheheeh\"");
                break;
            default:
                System.out.println("Mhs    :\"ulun turun tarus pa ai,tugas ngumpul\"");
                System.out.println("Dosen  :\"Bujur juakah\"");
                System.out.println("Dosen  :\"memeriksa berkas\"");
                System.out.println("Dosen  :\"menceleng\"");
                System.out.println("Mhs    :\"kabur...\"");
                break;
        }
    }
}
