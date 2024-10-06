package cseb23s3Rollno61;
public class BoxDemo1 {
     public static void main(String[] args) {
        Box mybox = new Box();
        mybox.width = 10;
    	mybox.height = 20;
    	mybox.length = 60;
        double vol = mybox.volume();
    	System.out.println("Volume is :"+vol);
     }
   }
