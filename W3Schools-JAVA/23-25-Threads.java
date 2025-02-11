Java Threads 

  ** Threads allows a program to operate more efficiently by doing things at the same time. 

  ** Threads can be used to perform complicated tasks in the background without interrupting the main program. 

Creating a Thread 

   ** There are two ways to create a thread. 
   
   ** It can be created by extending the Thread class and overriding its run() method:

  Extend Syntax 

    public class Main extends Thread {
      public void run() {
        System.out.println("This code is running in a thread");
      }
    }

  ** Another way to create a thread to implement the Runnable interface:

  Implement Syntax 

    public class Main implements Runnable {
      public void run() {
        System.out.println("This code is running in a thread");
      }
    }

