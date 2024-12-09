/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package project.java.pertama;

/**
 *
 * @author PCDEWA
 */

// import java io
import java.io.*;
import ratarata.RataRataIPK;

public class RataRataIPKTester {
    public static void main(String[] args){
       
        try{
             //panggil bufferedReader
            BufferedReader br = new BufferedReader(new InputStreamReader (System.in));
        
            //panggil kelas dan buat object
            RataRataIPK rt = new RataRataIPK();
            
            System.out.println("~~~~~~~ Dibuat oleh @ibnubachdar ~~~~~~~");
            
            System.out.print("Masukan Nilai Matematika Diskrit : ");
            Double n_matdis = Double.valueOf(br.readLine());

            System.out.print("Masukan Nilai Data Mining : ");
            Double n_dataMining = Double.valueOf(br.readLine());

            System.out.print("Masukan Nilai Keamanan Data dan Informasi : ");
            Double n_kdi = Double.valueOf(br.readLine());

            System.out.print("Masukan Nilai Komputasi Paralel dan Terdistribusi : ");
            Double n_kpt = Double.valueOf(br.readLine());

            System.out.print("Masukan Nilai Kecerdasan Buatan : ");
            Double n_kb = Double.valueOf(br.readLine());

            System.out.print("Masukan Nilai Kompleksitas Algoritma : ");
            Double n_ka = Double.valueOf(br.readLine());

            System.out.print("Masukan Nilai Pemrograman Web : ");
            Double n_pw = Double.valueOf(br.readLine());

            System.out.print("Masukan Nilai Praktikum Pemrograman Web : ");
            Double n_ppw = Double.valueOf(br.readLine());
            
            rt.setMatdis(n_matdis);
            rt.setDataMining(n_dataMining);
            rt.setKeamananDataInfo(n_kdi);
            rt.setKomputasiParalel(n_kpt);
            rt.setKompleksitasAlgo(n_ka);
            rt.setKecerdasanBuatan(n_kb);
            rt.setPemWeb(n_pw);
            rt.setPrakPemWeb(n_ppw);
            
            System.out.println("============================");
            System.out.println("Nilai Matematika Diskrit kamu "+ rt.getMatdis());
            System.out.println("Nilai Data Mining kamu "+ rt.getDataMining());
            System.out.println("Nilai Keamanan Data dan Informasi kamu "+ rt.getKeamananDataInfo());
            System.out.println("Nilai Komputasi Paralel dan Terdistribusi kamu "+ rt.getKomputasiParalel());
            System.out.println("Nilai Kecerdasan Buatan kamu " + rt.getKecerdasanBuatan());
            System.out.println("Nilai Kompleksitas Algoritma kamu " + rt.getKompleksitasAlgo());
            System.out.println("Nilai Pemrograman Web kamu " + rt.getPemWeb());
            System.out.println("Nilai Praktikum Pemrograman Web kamu " + rt.getPrakPemWeb());
            System.out.println("============================");
            rt.keterangan();
            System.out.println("~~~~~~~ Terima Kasih 💖 ~~~~~~~");
            
          
        }catch(Exception e){
            System.out.println("Terjadi Kesalahan, Harap Cek kembali :"+ e.getMessage());      
        }
    }
}
