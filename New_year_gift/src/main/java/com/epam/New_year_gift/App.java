package com.epam.New_year_gift;



import java.util.*;
public class App
{
   
   public static void main( String[] args )
   {
        Scanner s=new Scanner(System.in);
       System.out.println("Enter how many sweets to add in gift= ");
   int h1=s.nextInt();
   int sw[]=new int[h1];
   for(int i=0;i<h1;i++)
       sw[i]=s.nextInt();
       System.out.println("Enter how many Chocolates to add in gift= ");
   int h2=s.nextInt();
   int ch[]=new int[h2];
   for(int i=0;i<h2;i++)
       ch[i]=s.nextInt();
       System.out.println("Enter how many Candies to add in gift= ");
   int h3=s.nextInt();
   int ca[]=new int[h3];
   for(int i=0;i<h3;i++)
       ca[i]=s.nextInt();
       Sweets s1=new Sweets();
       Sweets s2=new Sweets();
       Sweets s3=new Sweets();
       Chocolates c1=new Chocolates();
       Candies cd1=new Candies();
       int ar1[]=s1.noofsweet(sw);
       int ar2[]=c1.noofchoco(ch);
       int ar3[]=cd1.noofcan(ca);
       if(h1>h2 && h1>h3){
       System.out.print("first hierarchy in gift are sweets=");
       for(int i=0;i<ar1.length;i++){
           System.out.print(ar1[i]+" ");
       }
       
       System.out.println();
        if(h2>h3){
       System.out.print("second hierarchy in gift are Chocolates= ");
       for(int i=0;i<ar2.length;i++){
           System.out.print(ar2[i]+" ");
       }
       System.out.println();
       
       System.out.print("third hierarchy in gift are Candies= ");
       for(int i=0;i<ar3.length;i++){
           System.out.print(ar3[i]+" ");
       }
       
       System.out.println();}
        if(h3>h2){
       System.out.print("second hierarchy in gift are Candies= ");
       for(int i=0;i<ar3.length;i++){
           System.out.print(ar3[i]+" ");
       }
       System.out.println();
       
       System.out.print("third hierarchy in gift are chocolates= ");
       for(int i=0;i<ar2.length;i++){
           System.out.print(ar2[i]+" ");
       }   
       }}
       if(h2>h1 && h2>h3){
       System.out.print("first hierarchy in gift are chocolates=");
       for(int i=0;i<ar2.length;i++){
           System.out.print(ar2[i]+" ");
       }
       
       System.out.println();
        if(h1>h3){
       System.out.print("second hierarchy in gift are sweets= ");
       for(int i=0;i<ar1.length;i++){
           System.out.print(ar1[i]+" ");
       }
       System.out.println();
       
       System.out.print("third hierarchy in gift are Candies= ");
       for(int i=0;i<ar3.length;i++){
           System.out.print(ar3[i]+" ");
       }
       
       System.out.println();}
        if(h3>h1){
       System.out.print("second hierarchy in gift are Candies= ");
       for(int i=0;i<ar3.length;i++){
           System.out.print(ar3[i]+" ");
       }
       System.out.println();
       
       System.out.print("third hierarchy in gift are sweets= ");
       for(int i=0;i<ar1.length;i++){
           System.out.print(ar1[i]+" ");
       }   
       
       System.out.println();}}
       if(h3>h2 && h3>h1){
       System.out.print("first hierarchy in gift are Candies=");
       for(int i=0;i<ar3.length;i++){
           System.out.print(ar3[i]+" ");
       }
       
       System.out.println();
        if(h2>h1){
       System.out.print("second hierarchy in gift are Chocolates= ");
       for(int i=0;i<ar2.length;i++){
           System.out.print(ar2[i]+" ");
       }
       System.out.println();
       
       System.out.print("third hierarchy in gift are sweets= ");
       for(int i=0;i<ar1.length;i++){
           System.out.print(ar1[i]+" ");
       }
       
       System.out.println();}
        if(h1>h2){
       System.out.print("second hierarchy in gift are sweets= ");
       for(int i=0;i<ar1.length;i++){
           System.out.print(ar1[i]+" ");
       }
       System.out.println();
       
       System.out.print("third hierarchy in gift are Chocolates= ");
       for(int i=0;i<ar2.length;i++){
           System.out.print(ar2[i]+" ");
       }   
       }}
       System.out.println("Total Weight in gift= "+(ar1.length+ar2.length+ar3.length));
       int ar4[]=c1.sortchoco(ar2);
       System.out.print("Chocolates in sorted order=");
       for(int i=0;i<ar4.length;i++){
           System.out.print(ar4[i]+" ");
       }System.out.println();
       System.out.print("No of candies in gift="+ar3.length+"\n"+"Candies are= ");
       for(int i=0;i<ar3.length;i++){
           System.out.print(ar3[i]+" ");}
           
   }
}
class Sweets extends App{
   
	public int[] noofsweet(int sw[]) {
		
		return sw;
	
	
}}
class Chocolates extends App{
   
	public int[] noofchoco(int ch[]) {
		
		return ch;
	}
	public int[] sortchoco(int c[]){
	    
   
       int n1 = c.length; 
       for (int i = 0; i < n1-1; i++) 
           for (int j = 0; j < n1-i-1; j++) 
               if (c[j] > c[j+1]) 
               { 
                   // swap arr[j+1] and arr[i] 
                   int temp = c[j]; 
                   c[j] = c[j+1]; 
                   c[j+1] = temp; 
               } 
   return c;
	}
}
class Candies extends App{
   
	public int[] noofcan(int ca[]) {
		
		return ca;
	}
}
