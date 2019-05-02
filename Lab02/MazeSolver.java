//Joel Garcia Valencia
//Lab02
//2pm

import java.io.File;
import java.io.IOException;
import java.util.Scanner;
import java.util.ArrayList;

public class MazeSolver
{
   private static char[][] maze;
   private static int startx, starty;
   private static int endx, endy;
   public static ArrayList<String> mazeRunner;
   
   public static void MazeSolver(String filename)
   {

   int numCols = 0;
   int numrows = 0;
   mazeRunner = new ArrayList<String>();
   
   try
    {
      Scanner file = new Scanner(new File(filename));
      while(file.hasNext())
      {
      String nextLine = file.nextLine();
      mazeRunner.add(nextLine);
      
      if(nextLine.length() > numCols)       
      numCols = nextLine.length();       
      }
    }
    
    catch(Exception e)
    {
    System.out.println(filename + " has an issue ");
    }
    
   numrows = mazeRunner.size();
   maze = new char[numrows][numCols];
   for(int i = 0; i < numrows; i++)
      {
      
      String row = mazeRunner.get(i);
      for(int j = 0; j < numCols; j++)
        {
         if(row.length() > j)
         {       
          maze[i][j]= row.charAt(j);     
         }
          else
          maze[i][j] = 'X';
          
          if(maze[i][j] == 'S')
          {
            startx = i;
            starty = j;
          }
          if(maze[i][j] == 'G')
          {
            endx = i;
            endy = j;
           }
         }
      }
      System.out.println("Maze is ready");
   }
   



   public static void printMaze()
   {
   for(char[] row: maze)
    {
     for(char j: row)
      System.out.print(j);
      System.out.println();
    }
   System.out.println();
   }
   
   
   public static void main(String []args)
   {
   MazeSolver("maze3.txt");
   printMaze();
   if(solveMaze(startx, starty))
    {
   printMaze();
    }
   else
   System.out.println("No solution found");  
   }
   
      
   public static boolean solveMaze(int i, int j)
   {
   if(i < 0 || j < 0 || i >= maze.length || j >= maze[0].length)
   return false;
   
   if(maze[i][j] == 'G')
   return true;
     
   if(maze[i][j] != 'O' &&  maze[i][j] != 'S')
   return false;
   
   //making sure it is good
   maze[i][j] = '#';
   
    
    //going North
    if(solveMaze(i, j-1))
    {
      maze[i][j] = '*';
      return true;
    }
    // going South
    if(solveMaze(i, j+1))
    {
      maze[i][j] = '*';
      return true;
    }
    
       //going east
   if(solveMaze(i+1, j))
   {
     maze[i][j] = '*';
     return true;
   }
   
   //going west
   if(solveMaze(i-1,j))
   {
   maze[i][j] = '*';
   return true;
   }
   
 
   return false;
   
   }
  }

