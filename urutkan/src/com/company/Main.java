package com.company;

public class Main {
    public static void show(int a[]){
        for(int i =0; i<a.length; i++){
            System.out.printf("% 4d",a[i]);
        }
    }

    public static void sorting(int a[]){
        for(int j=0; j<a.length-1; j++ ){
            int min=j;
            for(int k=j+1; k<a.length; k++){
                if(a[k]<a[min]){
                    min=k;
                }
            }
            if(min!=j){
                int temp= a[min];
                a[min]=a[j];
                a[j]=temp;
            }
        }
    }
    public static void main(String[] args) {
	java.util.Scanner in = new java.util.Scanner(System.in);
        System.out.print("MASUKAN BANYAK DATA");
        int n=in.nextInt();
        int a[]= new int[n];
        for(int i=0; i<n; i++){
            System.out.print("masukan angka :");
            a[i]=in.nextInt();
        }


        System.out.println("tampilan setelah diurutkan ");
        show(a);
          sorting(a);
        System.out.println();
       System.out.println("tampilan setelah diurutkan  ");
       show(a);
    }



}
