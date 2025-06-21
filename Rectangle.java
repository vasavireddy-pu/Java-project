class Rectangle {
        //Instance variables
        int lenght;
        int breadth;

        //Method to calculate area
        int area(){
            return lenght * breadth;
        }
        //Method to calaulate perimeter
        int perimeter(){
            return 2 * (lenght+ breadth);
        }
        public static void main(String [] agrs)
        {
            // create object and assign values
            Rectangle r = new Rectangle();
            r.lenght=12;
            r.breadth=6;

            //Display area and perimeter
            System.out.println("Area: " + r.area());
            System.out.println("Perimeter: " + r.perimeter());
        }
}

