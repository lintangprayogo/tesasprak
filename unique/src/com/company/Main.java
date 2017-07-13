package com.company;

public class Main {
public static void clear(int a[]){
    int match = 0;
    for (int i = 0; i < a.length; i++) {
        match = 0;
        for (int j = i + 1; j < a.length; j++) {
            if (a[i] == a[j]) {
                match = 1;
            }
        }

        if (match == 0) {
            System.out.printf("% 3d",a[i]);
        }
    }

}
    public static void tampil(int a[]){

        for (int i = 0; i < a.length; i++) {
                System.out.printf("% 3d",a[i]);

        }

    }

    public static void main(String[] args) {
	int array []=new int [10];

	java.util.Scanner in = new java.util.Scanner(System.in);

        for (int i=0; i<10; i++){
            System.out.print("data ke-"+(i+1)+":");
            array[i]=in.nextInt();


        }

        System.out.println();
        System.out.println("data sebelum :");
        tampil(array);
        System.out.println();
        System.out.println("data tanpa duplicate :");
        clear(array);





    }
}
