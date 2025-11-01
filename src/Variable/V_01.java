package Variable;

public class V_01 {
    int a = 10;
    int d = 50;
    int b = 20;

    { //IIB //Non static block
       int b = 20;
        int d = 50;
        int a = 10;

    }

    { //IIB //Non static block
        int c = 30;
        int d = 50;
        int a = 10;
        int b = 20;
    }

    public static void main(String[] args) {
        int d = 40;
        int a = 10;
        int b = 20;

    }
}
