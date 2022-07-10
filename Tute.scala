import scala.io.StdIn.readInt

object Tute{
    def main(args: Array[String]) = 
    {
        //Question 1,2 & 3
        /*var k,i,j = 2;
        var m,n = 5;
        var f = 12.0f;
        var g = 4.0f;
        var c = 'X';

        println(k + 12*m);
        println(m/j);
        println(n%j);
        println(m/j*j);
        println(f + 10*5 + g);*/
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
    
    def Income(No_Of_Normal_Hours:Double, No_Of_OT_Hours:Double): Double ={

        No_Of_Normal_Hours*Normal_Hour_Rate + No_Of_OT_Hours*OT_Hour_Rate;
    }

    def TaxPay(No_Of_Normal_Hours:Double, No_Of_OT_Hours:Double): Double = {

        Income(No_Of_Normal_Hours, No_Of_OT_Hours)*0.12;
    }

    def TakeHomeSalary(No_Of_Normal_Hours:Double, No_Of_OT_Hours:Double):Double = {

        Income(No_Of_Normal_Hours, No_Of_OT_Hours) - TaxPay(No_Of_Normal_Hours, No_Of_OT_Hours);
    }

    println("Take Home Salary: Rs."+TakeHomeSalary(40,30));


    
    //Question 4.b

    //
    def Profit(Ticket_Price: Double, Attendance: Double) : Double = Ticket_Price*Attendance;

    //Here we find how attenders change according to ticket price
    def Change_Of_Attendance(Ticket_Price: Double) : Double = {

        /*  If 20 ==> 100
            If 15 ==> 120
            If 10  ==>140

            Ticket price is vary from 5 rupees and according to that
            no of attendance vary from 20
        */

        if(Ticket_Price > 15) //Attendance must decreased, therefore the increasing average ticket price multiply by (-20)                     
            ((Ticket_Price - 15) / 5) * (-20);
        else if(15 > Ticket_Price) //Attendance must increased, therefore the decreasing average ticket price multiply by (+20)   
            ((15 - Ticket_Price) / 5) * 20;
        else
            0; // THis is base condition (Ticket price is 15 rupees)
    }

    def Net_Profit(Ticket_Price: Double, Attendance: Double) : Double = {
        Profit(Ticket_Price, Attendance + Change_Of_Attendance(Ticket_Price)) - (500 + 3*(Attendance + Change_Of_Attendance(Ticket_Price)));
    }

    printf("Enter ticket price:");
    var Ticket_Price = readInt();
    printf("Profit : Rs." + Net_Profit(Ticket_Price, 120))

    
}