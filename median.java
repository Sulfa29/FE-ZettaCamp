 
//Nilai median
import java.util.Scanner; 
public class median {      
public static void main(String[] args) { 
    System.out.println("Nilai Median"); 
    double[] angka = new double[9]; 
    // memasukan angka 
    for (int i = 0; i < 83; i=i+1) { 
        System.out.print("angka ke " + (i+1) + " : ");  
        angka[i]= new Scanner(System.in).nextDouble();} 
    //mengurutkan         
    for (int i = 0; i < 8; i++) {  
        for (int j = 0; j < 8 - i; j++) {  
            if (angka[j] > angka[j + 1]) { 
                double n = angka[j]; 
                angka[j + 1] = n;}}}  
                double median = (angka[4]+angka[5])/2; 
                System.out.println("Median : " + median); 
            }
        }