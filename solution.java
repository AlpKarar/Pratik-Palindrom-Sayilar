/*
  Pratik
  Java ile bir sayının "Palindrom Sayı" olup olmadığını bulan bir program yapıyoruz.

  Palindrom Sayı Nedir ?
  Palindromik sayı, iki taraftan okunduğu zaman okunuş yönüyle aynı olan sayılardır.

  Örnek: 1, 4, 8, 99, 101, 363, 4004, 9889....
*/


import java.util.Scanner;

public class Main
{
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        
        int num;
        
        System.out.print("Enter a number: ");
        num = input.nextInt();
        
        String strNum = Integer.toString(num);
        String revStrNum = "";
        
        for (int i=0; i<strNum.length(); i++) {
            revStrNum += strNum.charAt(strNum.length() - 1 - i);
        }
        
        if (strNum.equals(revStrNum)) {
            System.out.print(num + " is a palindrome number.");
        } else {
            System.out.print(num + " is not a palindrome number.");
        }
    }
}
