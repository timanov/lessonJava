public class WaterPipe implements Stateable, Printable, Printable1{
    public void printState(int n){
        if(n==OPEN)
            System.out.println("Water is opened");
        else if(n==CLOSED)
            System.out.println("Water is closed");
        else
            System.out.println("State is invalid");
    }

    @Override
    public void print() {
        System.out.println("Hello world");
    }
}
