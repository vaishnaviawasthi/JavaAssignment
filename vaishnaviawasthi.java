import java.io.*;
import java.util.*;
import java.util.regex.*;
class vaishnaviawasthi
{
public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
int a;
String t=sc.nextLine();
a=Integer.parseInt(sc.nextLine());
next(t,a);
}
public static void next(String tex,int n)
{
String temp=tex;
Scanner sc=new Scanner(System.in);
int k,l;
String arr[]=new String[100];
ArrayList<Integer> ar=new ArrayList<Integer>();
for(k=0;k<n;k++)
{
arr[k]=sc.nextLine();
}
for(k=0;k<n;k++)
{
for(l=-1;(l=temp.indexOf(arr[k],l+1))!=-1;)
{
ar.add(l);
}
}
Collections.sort(ar);
for(Integer p:ar)
System.out.print(p+"");
}
}