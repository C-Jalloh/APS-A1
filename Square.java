public class Square {
        private int sideLength;
        private final int area;
        // the data type for the initialLength parameter should be int not String
        public Square(int initialLength){
            //no data type for the sideLength variable
            sideLength = initialLength;
            // the statement below is not terminated with a semicolon
            area = sideLength * sideLength;
        }
        // no return type for this method
        public void getArea()
        {
            System.out.println(this.area);
        }
        public void grow()
        {
            // sideLen variable does not exist
            //sideLength = 2 * sideLen;
            sideLength = 2 * sideLength;
            System.out.println(this.sideLength);
        }

        // there is no main class
        public static void main(String[] args) {
            Square s = new Square(4);
            s.getArea();
            s.grow();
        }
    }
