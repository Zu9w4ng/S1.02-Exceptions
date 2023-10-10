package n2ex1;

public class App {
    public static void main(String[] args) throws Exception {
       
        byte num = Input.readByte("Introdueix un byte");
        double num2 = Input.readDouble("introdueix un double");
        System.out.println(num2);
        float num3 = Input.readFloat("introdueix un float");
        System.out.println(num3);

        char caracter = Input.readChar("introdueix un char");
        System.out.println(caracter);
        String str = Input.readString("introdueix un string");
        boolean sn = Input.readYesNo("digues Y o N");
        System.out.println(sn); 
    }
}

