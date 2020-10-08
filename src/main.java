import java.util.*;
import java.util.Random;
import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        Stack beklemeSalonu = new Stack();
        Stack kazananlar = new Stack();
        int kacKisiKazanıcak = 0;
        int silmeSayisi = 0;

        int x = 0;
        while (x == 0) {
            System.out.println("Katılımcı ismi giriniz");
            Scanner name = new Scanner(System.in);
            String isim = name.nextLine();

            System.out.println(isim + " kac defa yazılsın");
            Scanner input = new Scanner(System.in);
            int kacdefa = input.nextInt();

            if (kacdefa>silmeSayisi) silmeSayisi = kacdefa;

            for (int i = 0; i < kacdefa; i++) {
                beklemeSalonu.push(isim);
            }
            System.out.println("İsim eklemeye devam edecek misin");
            System.out.print("Evet ise 1 e bas ");
            System.out.println("Hayır ise 2 ye bas");
            Scanner isDone = new Scanner(System.in);
            int bittimi = isDone.nextInt();
            if (bittimi == 1) {
                x = 0;
            } else if (bittimi == 2) {
                x = 1;
            } else System.out.println("Yanlış sayı girdiniz programı kapatıp açınız !!!");
        }

        System.out.println("Kac kişi kazanıcak");
        Scanner input = new Scanner(System.in);
        kacKisiKazanıcak = input.nextInt();


        for (int j = 0; j < kacKisiKazanıcak; j++) {
            Random r = new Random();
            int talihliKisiIndex = r.nextInt(beklemeSalonu.size());
            System.out.println("talihli index: " + talihliKisiIndex);
            if (talihliKisiIndex == 0) {
                talihliKisiIndex = 1;
            }
            System.out.println("total kişi sayısı " + beklemeSalonu.size());
            System.out.println("totaldeki kişiler: " + beklemeSalonu);
            Object kazanan = beklemeSalonu.elementAt(talihliKisiIndex);
            System.out.println("kazanan talihli arkadaş " + beklemeSalonu.elementAt(talihliKisiIndex));
            kazananlar.push(kazanan);
            for (int k = 0; k < silmeSayisi; k++) {
                beklemeSalonu.remove(kazanan);
            }
            System.out.println("Kazananlar " + kazananlar);
        }
    }
} 