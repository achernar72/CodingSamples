/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package leetpblms.easy;

import java.util.Scanner;

/**
 *
 * @author SankarasettyAvinash(
 */
public class hammingDistance {
    
    
   public static int Solution(int x,int y){
    int count=0;
    String a=Integer.toBinaryString(x);
    String b= Integer.toBinaryString(y);
   // System.out.println(a.length());
    //System.out.println(b.length());
    
    while(a.length()!=b.length()){
    if(a.length()>b.length()){
        b="0"+b;
    }
    else if (b.length()>a.length()){
    a="0"+a;
    }
    else break;
    
    
    }
    System.out.println(a);
    System.out.println(b);
    char c[] = a.toCharArray();
    char d[]= b.toCharArray();
    
    for(int i=0;i<c.length;i++){
    
    if(c[i]==d[i]){
    continue;
    }
    else{
    count++;
    }
    
    }
    
    return count;
    }
    public static void main(String[] args){
     Scanner scan = new Scanner(System.in); 
     int x= scan.nextInt();
     int y= scan.nextInt();
     
int result =     Solution(x,y);
     System.out.println(result);
     
    }
    
}
