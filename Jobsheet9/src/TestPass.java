/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 * Created by 21343035_Rayhan_Ahadi_Nifri
 */

/**
 *
 * @author rehan909090
 */

public class TestPass {
     public static void main(String[] args) {
         int[] ages = {10, 11, 12};
         for (int i = 0; i < ages.length; i++){
             System.out.println(ages[i]);
         }
         test(ages);
         
         for (int i = 0; i < ages.length; i++){
             System.out.println(ages[i]);
         }
     }
     
     public static void test(int []arr){
         for (int i = 0; i < arr.length; i++){
             arr[i] = i + 50;
         }
     }
}