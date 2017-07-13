package com.company;
class Peserta{
    int nomor,nilai;
    String nama;

    public Peserta(int nomor, int nilai, String nama) {
        this.nomor = nomor;
        this.nilai = nilai;
        this.nama = nama;
    }
}
public class Main {


    public static void urutkan(Peserta a[]){
        for(int j=0; j<a.length-1; j++ ){
            int max=j;
            for(int k=j+1; k<a.length; k++){
                if(a[k].nilai>a[max].nilai){
                    max=k;
                }
            }
            if(max!=j){
                Peserta temp= a[max];
                a[max]=a[j];
                a[j]=temp;
            }
        }
    }
    public static void main(String[] args) {
    java.util.Scanner in = new java.util.Scanner(System.in);
        System.out.print("masukan jumlah peserta :");
        int n = in.nextInt();
        Peserta a[] = new Peserta[n];

        for(int i=0; i<n; i++){
            System.out.print("masukan nama  :");
            String nama= in.next();
            System.out.print("masukan nilai :");
            int   nilai= in.nextInt();
            System.out.print("masukan nomor :");
            int nomor=in.nextInt();
            System.out.println();

            Peserta baru = new Peserta(nomor,nilai,nama);
            a[i]=baru;

        }

        urutkan(a);


        int awal=0,penujuk=a[awal].nilai;

        System.out.println("juara pertama ");
        System.out.println("==============");
        while(awal < n ){
           if(a[awal].nilai==penujuk){
               System.out.println("nama:"+a[awal].nama);
               System.out.println("nomor:"+a[awal].nomor);
               System.out.println();
               awal++;
           }
           else{
               break;
           }


        }
        if(awal < n) {
            penujuk =a[awal].nilai;
            System.out.println("==============");
            System.out.println("juara kedua");
            System.out.println("==============");

            while (awal < n) {
                if (a[awal].nilai == penujuk) {
                    System.out.println("nama:" + a[awal].nama);
                    System.out.println("nomor:" + a[awal].nomor);
                    System.out.println();
                    awal++;
                } else {
                    break;
                }


            }
        }


        if(awal < n) {
            penujuk =a[awal].nilai;
            System.out.println("==============");
            System.out.println("juara ketiga");
            System.out.println("==============");

            while (awal < n) {
                if (a[awal].nilai == penujuk) {
                    System.out.println("nama:" + a[awal].nama);
                    System.out.println("nomor:" + a[awal].nomor);
                    System.out.println();
                    awal++;
                } else {
                    break;
                }


            }
            System.out.println("==============");
        }


        }




    }

