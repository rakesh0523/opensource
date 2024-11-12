import java.io.*;
import java.util.*;

class Main
  {
    public static void main(string[] args)
    {
       Scanner sc = new Scanner(System.in);

    int n = sc.nextInt();

    if(n==0)
    {
      System.out.println("khichdi");
    }
    else if(n%2==0)
    {
      System.out.println("biryani");
    }
    else
    {
      System.out.println("mandi");
    }
    }
  }
