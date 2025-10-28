import java.util.Scanner;

public class Main
{
  public static void main(String[] args)
  {
    // Make sure to test your methods here

    printNTimes("hello", 5);
    scanner Scan = new Scanner(System.in);
    printNums();



    uprightNumberTriangle(N);
    


  }

  public static void printNTimes(String word, int N)
  {
    // code solution here

    for(int i = 0; i < word.length(); i++)
    {
      String current_letter = word.substring(i,i+1); 
      for ( int j = 0; j < N; j++)
{ 
  System.out.println(current_letter);
}

    }
  }



  public static void printNums()
  {
    // code solution here

    for(int number = 10; number >0; number--)
    {
      for (int printedNumber = 0; printedNumber < number; printedNumber++ )
    {
      System.out.print(number + " ");

    }
    System.out.println();
    }
  }

  public static void uprightNumberTriangle(int N)
  {
    // code solution here
    System.out.println("enter a number  ");
    number = Scan.nextInt();

    for( int row=1; row < N; row ++)
    {
      for(int number= 1; number <= row; number++)
      {
      System.out.println(number +" ");
      } 

      System.out.println( );

      
      
    }
      

  }

  public static void starTree()
  {
    // code solution here
  }

  public static void multTable()
  {
    // code solution here
  }
}
