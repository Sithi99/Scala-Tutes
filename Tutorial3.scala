
object Tutorial3{
    def main(args: Array[String]) =
        {

        }

    //Question 1
    def areaOfDisk(r: Double):Double = {
        math.Pi*r*r;
    }
    println("Area of Disk: ");
    printf("%.2f",areaOfDisk(5));
    println("\n");

    //Question 2
    def fahrenheit(c:Double):Double = {
        c*1.80 + 32.0
    }
    println("Temperature in Fahrenheit: ");
    println(fahrenheit(30));
    println("\n");

    //Question 3
    def volumeOfSphere(r:Double):Double = {
        4/3*math.Pi*r*r*r;
    }
    println("Volume of Sphere: ");
    printf("%.2f",volumeOfSphere(5));
    println("\n");

    //Question 4
    def bookPrice(x:Int):Double = {
        x*24.95;
    }

    def discount(amount:Double):Double = {
        amount*0.4;
    }

    def shippingCost(x:Int):Double = {
        if(x<=50) 3 else 3+ (x-50)*0.75;
    }

    def totalPrice(x:Int):Double = {
        bookPrice(x) - discount(bookPrice(x)) + shippingCost(x);
    }
    println("Total Price: ");
    printf("%.2f",totalPrice(60));
    println("\n");

    //Question 5
    def pace(x:Double):Double = x*8;
    def tempo(x:Double):Double = x*7;
    println("Total running time: ");
    println(pace(2) + tempo(3) + pace(2) );

}