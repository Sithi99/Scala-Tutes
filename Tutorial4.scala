import scala.io.StdIn.readInt

object Tutorial4{
    def main(args: Array[String]) =
        {

        }
    
    //Question 1

    def interest(amount:Double):Double = amount match{
    case x if x<20000 => x*0.02
    case x if x<200000 => x*0.04
    case x if x<2000000 => x*0.035
    case x if x>=2000000 => x*0.065
    }         

    printf("\nQuestion 1\n");
    printf("Actual amount of interest that the money earns in a year: %.2f",interest(3000000));

    //Question 2

    printf("\n\nQuestion 2\n");
    println("Input a integer: ");
    var num = readInt();
     def PatternMatching(num:Int):String = num match{
        case x if x<=0 =>  "Negative/Zero"
        case x if x%2 == 0 => "Even Number"
        case _ => "Odd Number"
     }

    printf("%s",PatternMatching(num));


    //Question 3

    def toUpper(str:String):String = {
        str.toUpperCase()
    }

    def toLower(str:String):String = {
        str.toLowerCase()
    }

    //High-Order function
    def formatNames(name:String)(changeList: Int*)(func:String => String):String = {

        //Especially if there is nothing to change
        if(changeList.isEmpty) func(name)

        //Especially if there is something to change
        var tmp = "";   //Declare empty string
        var i = 0;
        while(i<name.length())
        {
            //Character that needs to change
            if(changeList.contains(i)) tmp = tmp + func(name.charAt(i).toString)
            //Characters that don't need to change
            else tmp = tmp + name.charAt(i).toString
            i = i + 1
        }
        tmp //End of function return tmp
    }

    println("\n\nQuestion 3")
    println(formatNames("Benny")()(toUpper(_)));
    println(formatNames("Niroshan")(changeList = 0,1)(toUpper(_)));
    println(formatNames("Saman")()(toLower(_)));
    println(formatNames("Kumara")(changeList = 5)(toUpper(_)));

}