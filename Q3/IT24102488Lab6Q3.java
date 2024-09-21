
import java.util.Scanner;
    public class IT24102488Lab6Q3{
        public static void main(String[] args) {
            Scanner input = new Scanner(System.in);
            System.out.print("enter number  1 :");
            int num = input.nextInt();
            int count=0;
            int sumOfSquare=0;

            while(num!=-99){
                if (num>=0){

                    System.out.print("enter number  " + (count+2)+" :");

                    int square= num*num;
                    sumOfSquare = (sumOfSquare + square);

                    num = input.nextInt();
                    count = count + 1;
                   }
                else  {System.out.println("please enter apositive inteager or -99 to turminate");
                    System.out.print("enter number " +(count+1)+" ");
                    num = input.nextInt();
                   
                    ;


                }


            }
            {System.out.print("THE ROOT MEAN SQUARE IS : ");

            double rsm =Math.sqrt(sumOfSquare/count);
            System.out.println(rsm);











        }
    }}

