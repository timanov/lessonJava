public class Journal {

    String name;

    String getName(){
        return name;
    }

    Journal(String name){
        this.name = name;
    }

    public void print(){
        System.out.println(name);
    }
}
