public class DemoArray{ //membuat class dengan nama DemoArray dengan modifier

    public static void main(String[] args){ //membuat method main berfungsi sebagai method yang pertama kali dijalankan
        System.out.println("\nContoh 1\n");
        String nama[] = new String[5]; //deklarasi variabel nama dan diberikan panjang array 5
        nama[0] = "Andi Novianto"; //inisialisasi variabel nama pada elemen 0 dengan nilai "Andi Novianto"
        nama[1] = "Zidna Aisya"; //inisialisasi variabel nama pada elemen 1 dengan nilai "Zidna Aisya"
        System.out.println(nama[0]);
        System.out.println(nama[1]);
        System.out.println(nama[2]);

        System.out.println("\n\nContoh 2\n");
        int nilai[] = {75, 80, 90, 100}; //deklarasi variabel nilai dan diberi panjang array 4 yang langsung dideklarasikan
        System.out.println("Cetak Nilai elemen 0 : "+nilai[0]);
        System.out.println("Cetak Nilai elemen 1 : "+nilai[1]);
        System.out.println("Cetak Nilai elemen 2 : "+nilai[2]);
        System.out.println("Cetak Nilai elemen 3 : "+nilai[3]);
        int jumlah = nilai[1] + nilai[2] + nilai[3];
        System.out.println("Jumlah Nilai elemen (1+2+3) : "+jumlah);
    }
}