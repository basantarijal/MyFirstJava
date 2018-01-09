


import java.util.Scanner;

/**
 *
 * @author BhaiRaja
 */
public class Exercise1 {
    static int length;
    static int breadth;
    static int radius;
    public float artriangle(){
        float area= (float) (0.5*length*breadth);
        return area;
    }
    public float arsquare(){
        float area= length*length;
        return area;
    }
    public float arcircle(){
        float pi=(float) 3.14;
        float area= pi* radius*radius;
        return area;
    }
    public static void main(String[] args) {
        System.out.println("Welcome for the calculation of the geometery");
        System.out.println("Please enter number for the calculation of area respectively");
        System.out.println("Please enter 1 for the area of triangle\n 2 for the area of the square \n 3 for the area of circle\n 4 for the quit ");
        Scanner sc=new Scanner(System.in);
        Exercise1 ex= new Exercise1();
        int x;
        x= sc.nextInt();
        while(x<4&&x>=1)
        {
           
            
            if(x==1){
                System.out.println("Enter the length of the triangle:");
                length= sc.nextInt();
                System.out.println("Enter the breadth of the triangle:");
                breadth=sc.nextInt();
                System.out.println("The area of the triangle is:"+ex.artriangle());
                System.out.println("Please enter 1 for the area of triangle\n 2 for the area of the square \n 3 for the area of circle\n 4 for the quit ");
                
            int y= sc.nextInt();
x=y;
            }
           else if(x==2){
                System.out.println("Enter the length of the square:");
                length=sc.nextInt();
                System.out.println("The area of the square is:"+ex.arsquare());
                 System.out.println("Please enter 1 for the area of triangle\n 2 for the area of the square \n 3 for the area of circle\n 4 for the quit ");
                
            int y= sc.nextInt();
x=y;
                
            }
           else if(x==3)
                   {
               System.out.println("Enter the radius of the circle:");
                radius=sc.nextInt();
                System.out.println("The area of the circle is:"+ex.arcircle());
                 System.out.println("Please enter 1 for the area of triangle\n 2 for the area of the square \n 3 for the area of circle\n 4 for the quit ");
                
            int y= sc.nextInt();
x=y;
           }
           else{
                System.out.println("quit.");
           }
        }
        while(x>4){
            System.out.println("Enter correct number");
            x= sc.nextInt();
            
        }
          
       
        }
    }
           
    
   

