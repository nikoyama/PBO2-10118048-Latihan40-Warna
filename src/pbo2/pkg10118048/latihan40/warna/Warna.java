/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package pbo2.pkg10118048.latihan40.warna;

import java.util.Scanner;

/**
 *
 * @author NIX
 * NAMA : Niko Yama
 * KELAS : PBO2
 * NIM : 10118048
 * Deskripsi program : menebak kepribadian berdasarkan pilihan warna
 */
public class Warna {
    
    private String warnaMu, nama;
    
    private void inputPilihan() {
        Scanner scanner = new Scanner(System.in);
        System.out.print(ANSI_RED +"YUK");
        System.out.print(ANSI_GREEN +" CEK");
        System.out.print(ANSI_YELLOW +" KEPRIBADIANMU");
        System.out.print(ANSI_CYAN +" DARI");
        System.out.print(ANSI_PURPLE +" WARNA");
        System.out.println(ANSI_BLUE +" FAVORITMU");
        System.out.println(ANSI_WHITE +"\n" +ANSI_RED_BACKGROUND+ "\tMerah\t\t");
        System.out.println(ANSI_GREEN_BACKGROUND +"\tHIJAU\t\t");
        System.out.println(ANSI_YELLOW_BACKGROUND +"\tKUNING\t\t");
        System.out.println(ANSI_BLUE_BACKGROUND +"\tBIRU\t\t");
        System.out.println(ANSI_PURPLE_BACKGROUND +"\tUNGU\t\t");
        System.out.print(ANSI_RESET +"\n"+"PILIH WARNA FAVORITMU : ");
        warnaMu = scanner.next().toUpperCase();
        System.out.print("NAMA KAMU : ");
        nama = scanner.next().toUpperCase();
    }
    
    private void warnaPilihan() {
        switch (warnaMu) {
            case "BIRU" :{
            System.out.println("Warna Favoritmu adalah " +ANSI_BLUE+warnaMu); 
                System.out.println("1. Menyenangkan,\n"
                        + "2. Bijaksana,\n"
                        + "3. Pembawaan diri tenang saat menghadapi masalah,\n"
                        + "4. Dinamis,\n"
                        + "5. Senang berbagi,\n"
                        + "6. Bersahabat,\n"
                        + "7. Tidak terlalu suka menjadi sorotan banyak orang,\n"
                        + "8. Menyembunyikan perasaan karakternya yang cenderung"
                        + "mencari jalan damai.");
                break;
            }
            case "MERAH" :{
                System.out.println("Warna Favoritmu adalah " +ANSI_RED+warnaMu); 
                System.out.println("1. Periang,\n"
                        + "2. Pemberani,\n"
                        + "3. Berani mengambil risiko dalam setiap langkah,\n"
                        + "4. Menyukai tantangan,\n"
                        + "5. Kurang sabar,\n"
                        + "6. Dapat menahan marah namun jika sudah tahap puncak"
                        + "toleransi, kemarahannya akan sulit dikontrol,\n"
                        + "7. Memiliki energi kehangatan dan cinta.");
                break;
            }
            case "KUNING" :{
                System.out.println("Warna Favoritmu adalah " +ANSI_YELLOW+warnaMu); 
                System.out.println("1. Optimis,\n"
                        + "2. Suka bergaul,\n"
                        + "3. Periang,\n"
                        + "4. Senang menolong,\n"
                        + "5. Lincah dan aktif,\n"
                        + "6. Tidak suka meremehkan kekurangan orang lain,\n"
                        + "7. Loyal,\n"
                        + "8. Hangat,\n"
                        + "9. Meskipun karakternya optimis dan idealis, "
                        + "seringkali goyah dan tidak stabil,\n"
                        + "10. Cenderung penakut.");
                break;
            }
            case "UNGU" :{
                System.out.println("Warna Favoritmu adalah " +ANSI_PURPLE+warnaMu); 
                System.out.println("1. Optimis,\n"
                        + "2. Tidak pernah ragu,\n"
                        + "3. Menurutnya pasangan yang ideal adalah "
                        + "yang memiliki mental kuat,\n"
                        + "4. Memiliki ambisi yang besar,\n"
                        + "5. Memiliki empati yang besar,\n"
                        + "6. Memiliki sisi misterius sebab seringkali"
                        + "menutupi perasaannya,\n"
                        + "7. Terkadang bersikap keras kepala dan angkuh.");
                break;
            }
            case "HIJAU" :{
                System.out.println("Warna Favoritmu adalah " +ANSI_GREEN+warnaMu); 
                System.out.println("1. Romantis,\n"
                        + "2. Menyukai hal yang berbau alami dan keindahan,\n"
                        + "3. Teguh pada prinsip,\n"
                        + "4. Menginginkan kesempurnaa,\n"
                        + "5. Mudah cemburu,\n"
                        + "6. Mudah merasa iri,\n"
                        + "7. Menjunjung tinggi suatu nilai toleransi"
                        + "dan kepercayaan.");
                break;
            }
            default:
                System.out.println("Oops.. Belum Teridentifikasi");
        }
    }
    
    public void tampilHasil() {
        inputPilihan();
        System.out.println("\n===HASIL TEST KEPRIBADIAN " +nama+ "===");
        warnaPilihan();
    }
    
    public static final String ANSI_RESET = "\u001B[0m";
    public static final String ANSI_RED = "\u001B[31m";
    public static final String ANSI_GREEN = "\u001B[32m";
    public static final String ANSI_YELLOW = "\u001B[33m";
    public static final String ANSI_BLUE = "\u001B[34m";
    public static final String ANSI_PURPLE = "\u001B[35m";
    public static final String ANSI_CYAN = "\u001B[36m";
    public static final String ANSI_WHITE = "\u001B[37m";
    public static final String ANSI_BLACK = "\u001B[30m";
    public static final String ANSI_RED_BACKGROUND = "\u001B[41m";
    public static final String ANSI_GREEN_BACKGROUND = "\u001B[42m";
    public static final String ANSI_YELLOW_BACKGROUND = "\u001B[43m";
    public static final String ANSI_BLUE_BACKGROUND = "\u001B[44m";
    public static final String ANSI_PURPLE_BACKGROUND = "\u001B[45m";
    public static final String ANSI_WHITE_BACKGROUND = "\u001B[47m";
}

