import scala.io.StdIn.readInt

object Tutorial2{
    def main(args: Array[String]) = 
    {
        //Question 1,2 & 3
        var k,i,j = 2;
        var m,n = 5;
        var f = 12.0f;
        var g = 4.0f;
        var c = 'X';

        println(k + 12*m);
        println(m/j);
        println(n%j);
        println(m/j*j);
        println(f + 10*5 + g);
        //println(++i*n); In scala this prefix and postfix incrementing features are not available

        
        /*
        println(++i*n); In scala this prefix and postfix incrementing features are not available
        a) println( - -b * a + c *d - -);
        b) println(a++);
        c) println (–2 * ( g – k ) +c);
        d) println (c=c++);
        e) println (c=++c*a++)
        */

    }

    //Question 4.a

    val Normal_Hour_Rate  = 250.0;
    val OT_Hour_Rate = 85.0;
    
    def Revenue(No_Of_Normal_Hours:Double, No_Of_OT_Hours:Double): Double ={

        No_Of_Normal_Hours*Normal_Hour_Rate + No_Of_OT_Hours*OT_Hour_Rate;
    }

    def TaxPay(No_Of_Normal_Hours:Double, No_Of_OT_Hours:Double): Double = {

        Revenue(No_Of_Normal_Hours, No_Of_OT_Hours)*0.12;
    }

    def TakeHomeSalary(No_Of_Normal_Hours:Double, No_Of_OT_Hours:Double):Double = {

        Revenue(No_Of_Normal_Hours, No_Of_OT_Hours) - TaxPay(No_Of_Normal_Hours, No_Of_OT_Hours);
    }

    println("\n");
    println("Take Home Salary: Rs."+TakeHomeSalary(40,30));
    println("\n");


    
    //Question 4.b

    //Here we find how attenders change according to ticket price
    def Attendees(Ticket_Price: Double) : Double = {

        /*  If 20 ==> 100
            If 15 ==> 120
            If 10  ==>140

            Ticket price is vary from 5 rupees and according to that
            no of attendance vary from 20
        */
        120 + (15 - Ticket_Price)/5*20;
      
    }

    //Full profit without reduce cost
    def Income(Ticket_Price: Double) : Double = Attendees(Ticket_Price)*Ticket_Price;


    //Total cost
    def Cost(Ticket_Price: Double) : Double = {
        500 + Attendees(Ticket_Price)*3;
    }

    def Profit(Ticket_Price:Double):Double = {
        Income(Ticket_Price) - Cost(Ticket_Price);
    }

    printf("Enter ticket price: ");
    var Ticket_Price = readInt();
    printf("Profit : Rs." + Profit(Ticket_Price))
    println("\n");

    
}