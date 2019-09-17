import java.util.Scanner;

public class Main {

    public static void main(String arg[]){

        System.out.println("Please enter the SKU number");
        Scanner keyb= new Scanner(System.in);
        String enteredSKU= keyb.nextLine();
        //Bookdata bookdata1= new Bookdata();
        Bookdata bookdata1=new Bookdata("","","","",0.00);
       // Bookdata bookdata=new Bookdata();
        String sku= bookdata1.populateDat(enteredSKU);

        System.out.printf("author is "+sku);

    }




    }



