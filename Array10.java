/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package array.pkg1.pkg0;

/**
 *
 * @author HP
 */
public class Array10 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.println("=============Array1============");
        String[] buah={"anggur", "apel", "mangga", "pisang", "juwet",};
        for (int i = 0; i < buah.length; i++){
             
            System.out.println("buah " + ": " + buah[i]);
            //System.out.println("jumlah buah sebanyak:"+buah.length);
            }
        System.out.println("jumlah buah sebanyak:"+buah.length);
        
        
        System.out.println("==================array dasar==================");
        String[] fruit={"anggur", "apel", "mangga", "pisang", "juwet",};
        System.out.println("buah pertama : "+fruit[0]);
        System.out.println("buah kedua : "+fruit[1]);
        System.out.println("buah ketiga : "+fruit[2]);
        System.out.println("buah keempat : "+fruit[3]);
        System.out.println("buah kelima : "+fruit[4]);
        
        
        
        
        System.out.println("================== array 2D ==================");
        String[][]keluarga={{"Ayah","wariman"}, {"Ibu", "rukanah"}, {"anak pertama", "warina"}, {"anak kedua", "munir"}};
        for (int x=0;x<keluarga.length;x++){
         System.out.println("Nama : "+ keluarga[x][1]);
         System.out.println("Status : "+ keluarga[x][0]); 
        }
        
        }
        }
        
    
  
