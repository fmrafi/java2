package home.task;

import java.util.Scanner;

public class HomeTask {

        public static void main(String[] args) {
        String a="I am reading now. I am working on my room.I am improving myself day by day.";
        String b="am";
        int c=0;
        int n;
        //Scanner on=new Scanner(System.in);
        //on. n=new nextInt();
        for(int i=1;i<b.length();i++)
        {
            c=a.indexOf(b,c);
            System.out.println(c);
            c=a.indexOf(b,c+1);
            System.out.println(c);
            c=a.indexOf(b,c+2);
            System.out.println(c);
            c=a.indexOf(b,c+50);
            System.out.println("not found");


        }
       // for(int i=1;i<n;i++)
        {

        }
    }
}
