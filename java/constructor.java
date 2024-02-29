    class rectangle
    {
        private double length;
        private double breadth;
        public rectangle()
        {
            length=1;
            breadth=1;

        }
        public rectangle( double length,double breadth)
        {
            this.length=length;
           this. breadth=breadth;
        }
        public rectangle(double s) 
        {
            length=breadth=s;

        }
        public double area()
        {
            return length*breadth;
        }
    }
    public class constructor {
    public static void main(String[] args) 
    {
        rectangle r1=new rectangle();
        rectangle r2=new rectangle(4,6);
        rectangle r3=new rectangle(3);
        System.out.println(r1.area());
        System.out.println(r3.area());   System.out.println(r2.area());


        
    }
    
}
