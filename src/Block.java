public class Block {
    Block(){
        System.out.println("default block constructor");
    }
    {
        System.out.println("default block");
    }
    static {
        System.out.println("static block");
    }

    

    public static void main(String[] args) {
        Block block = new Block();
        Block block2 = new Block();
    }
}
