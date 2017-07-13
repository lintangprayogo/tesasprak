package com.company;

public class Main {

    public static void main(String[] args) {
	java.util.Scanner in = new java.util.Scanner(System.in);
        System.out.println("==================================================");
        System.out.println("gunakan spasi antar kata agar hasil tepat !!!! ");
        System.out.println("==================================================");
        System.out.print("MASUKAN KATA :");
        String kata= in.nextLine();
        int akhir=kata.length()-1;
        int awal=0;

        while(awal<akhir){
            if(kata.charAt(awal)!=kata.charAt(akhir)){
                break;
            }else{
                awal++;
                akhir--;
            }
        }
        if(awal==akhir){
            System.out.println("kata palindrom");
        }else{
            System.out.println("kata tidak palindrom");
        }
    }
}
