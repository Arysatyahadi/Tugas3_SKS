package Tugas3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class menghitungipsdansks { public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    String pm,bd,ml,pa,sim,sd;

    double na=0,ni=0,nu=0,ne=0,no=0,nn=0;
    double ka,ki,ku,ke,ko,kn;
    double ip;
    double a=4, b=3, c=2, d=1,e=0;
    double nilai_1,nilai_2,nilai_3,nilai_4,nilai_5,nilai_6;
    double totalips,totalSKS;

    System.out.println("         menghitung peroleh SKS         ");
    System.out.println("");
    System.out.println("Gunakan (A, B+, B, C+, C, D, E) untuk mengetahui peroleh SKS, Input Huruf Abjad" +
            " ketika memasukan nilai!");
    System.out.println("-------------------------------------------------------");

    System.out.print("Masukkan nilai Pemogramandasar: ");
    pm = br.readLine();
    if (pm.equalsIgnoreCase("A")){
        na = 4;
    } else if (pm.equalsIgnoreCase("B+")){
        na = 3.5;
    } else if (pm.equalsIgnoreCase("B")){
        na = 3;
    } else if (pm.equalsIgnoreCase("C+")){
        na = 2.5;
    } else if (pm.equalsIgnoreCase("C")){
        na = 2;
    } else if (pm.equalsIgnoreCase("D")){
        na = 1;
    } else if (pm.equalsIgnoreCase("E")){
        na = 0;
    } else {
        System.out.println("Nilai tidak ditemukan! silahkan ulangi!");
        System.exit(404);
    }
    System.out.print("Masukkan SKS MataKuliah: ");
    ka = Double.parseDouble(br.readLine());
    nilai_1 = na*ka;
    System.out.println("");

    System.out.print("Masukkan nilai Basis Data: ");
    bd = br.readLine();
    if (bd.equalsIgnoreCase("A")){
        ni = 4;
    } else if (bd.equalsIgnoreCase("B+")){
        ni = 3.5;
    } else if (bd.equalsIgnoreCase("B")){
        ni = 3;
    } else if (bd.equalsIgnoreCase("C+")){
        ni = 2.5;
    } else if (bd.equalsIgnoreCase("C")){
        ni = 2;
    } else if (bd.equalsIgnoreCase("D")){
        ni = 1;
    } else if (bd.equalsIgnoreCase("E")){
        ni = 0;
    } else {
        System.out.println("Nilai tidak ditemukan! silahkan ulangi!");
        System.exit(404);
    }
    System.out.print("Masukkan SKS MataKuliah: ");
    ki = Double.parseDouble(br.readLine());
    nilai_2 = ni*ki;
    System.out.println("");

    System.out.print("Masukkan nilai MatematikaLanjut: ");
    ml = br.readLine();
    if (ml.equalsIgnoreCase("A")){
        nu = 4;
    } else if (ml.equalsIgnoreCase("B+")){
        nu = 3.5;
    } else if (ml.equalsIgnoreCase("B")){
        nu = 3;
    } else if (ml.equalsIgnoreCase("C+")){
        nu = 2.5;
    } else if (ml.equalsIgnoreCase("C")){
        nu = 2;
    } else if (ml.equalsIgnoreCase("D")){
        nu = 1;
    } else if (ml.equalsIgnoreCase("E")){
        nu = 0;
    } else {
        System.out.println("Nilai tidak ditemukan! silahkan ulangi!");
        System.exit(404);
    }
    System.out.print("Masukkan SKS MataKuliah: ");
    ku = Double.parseDouble(br.readLine());
    nilai_3 = nu*ku;
    System.out.println("");

    System.out.print("Masukkan nilai PendidikanAgama: ");
    pa = br.readLine();
    if (pa.equalsIgnoreCase("A")){
        ne = 4;
    } else if (pa.equalsIgnoreCase("B+")){
        ne = 3.5;
    } else if (pa.equalsIgnoreCase("B")){
        ne = 3;
    } else if (pa.equalsIgnoreCase("C+")){
        ne = 2.5;
    } else if (pa.equalsIgnoreCase("C")){
        ne = 2;
    } else if (pa.equalsIgnoreCase("D")){
        ne = 1;
    } else if (pa.equalsIgnoreCase("E")){
        ne = 0;
    } else {
        System.out.println("Nilai tidak ditemukan! silahkan ulangi!");
        System.exit(404);
    }
    System.out.print("Masukkan SKS MataKuliah: ");
    ke = Double.parseDouble(br.readLine());
    nilai_4 = ne*ke;
    System.out.println("");

    System.out.print("Masukkan nilai SistemInformasiManajemen: ");
    sim = br.readLine();
    if (sim.equalsIgnoreCase("A")){
        no = 4;
    } else if (sim.equalsIgnoreCase("B+")){
        no = 3.5;
    } else if (sim.equalsIgnoreCase("B")){
        no = 3;
    } else if (sim.equalsIgnoreCase("C+")){
        no = 2.5;
    } else if (sim.equalsIgnoreCase("C")){
        no = 2;
    } else if (sim.equalsIgnoreCase("D")){
        no = 1;
    } else if (sim.equalsIgnoreCase("E")){
        no = 0;
    } else {
        System.out.println("Nilai tidak ditemukan! silahkan ulangi!");
        System.exit(404);
    }
    System.out.print("Masukkan SKS MataKuliah: ");
    ko = Double.parseDouble(br.readLine());
    nilai_5 = no*ko;
    System.out.println("");

    System.out.print("Masukkan nilai StrukturData: ");
    sd = br.readLine();
    if (sd.equalsIgnoreCase("A")){
        nn = 4;
    } else if (sd.equalsIgnoreCase("B+")){
        nn = 3.5;
    } else if (sd.equalsIgnoreCase("B")){
        nn = 3;
    } else if (sd.equalsIgnoreCase("C+")){
        nn = 2.5;
    } else if (sd.equalsIgnoreCase("C")){
        nn = 2;
    } else if (sd.equalsIgnoreCase("D")){
        nn = 1;
    } else if (sd.equalsIgnoreCase("E")){
        nn = 0;
    } else {
        System.out.println("Nilai tidak dapat, silahkan ulangi!");
        System.exit(404);
    }
    System.out.print("Masukkan SKSMatkul: ");
    kn = Double.parseDouble(br.readLine());
    nilai_6 = nn*kn;
    System.out.println("");

    totalips = nilai_1+nilai_2+nilai_3+nilai_4+nilai_5+nilai_6;
    totalSKS = ka+ki+ku+ke+ko+kn;
    ip = totalips/totalSKS;
    System.out.println("IPS anda adalah: " + ip);

    if (ip>=3.50){
        System.out.println("SKS yang kamu miliki adalah: 24");
    } else if (ip>=3.00 && ip<3.49){
        System.out.println("SKS yang kamu milki adalah: 22");
    } else if (ip>=2.00 && ip<2.99){
        System.out.println("SKS yang kamu miliki adalah: 20");
    } else if (ip<2.00){
        System.out.println("SKS yang kamu miliki adalah: 18");
        }
    }
}

