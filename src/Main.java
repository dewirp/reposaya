//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
import java.util.Scanner;

class Biodata{
    String name;
    String hobby;
    int age;

    Biodata (String name, String hobby,int age){
        this.name=name;
        this.hobby=hobby;
        this.age=age;
    }
    void Annyeong(){
        System.out.println("Halo saya "+name);
    }
}
public class Main {
//    public static void calc(int angkasatu, int angkadua, String operator){
//        if (operator.equals("+")) {
//            System.out.println(angkasatu+angkadua);
//        } else if (operator.equals("-")) {
//            System.out.println(angkasatu-angkadua);
//        }
//        else if (operator.equals("x")) {
//            System.out.println(angkasatu*angkadua);
//        }
//        else if (operator.equals("/")) {
//            System.out.println(angkasatu/angkadua);
//        }
//        else {
//            System.out.println("belum input");
//        }
//
//    }

    public static void main(String[] args) {
        Biodata mydata=new Biodata(name:"wonho",hobby:"badminton",age:25);
        mydata.Annyeong();
        System.out.println(mydata.hobby);
        System.out.println(mydata.age);
//        *variable di dalam class namanya property*
//        String nama="Kim Won Ho";
//        System.out.println(nama);
//        System.out.println("Nama Saya "+nama);
//        int a=10;
//        int b=5;
//        int kurang=a-b;
//        int bagi=a/b;
//        int kali=a*b;
//
//        System.out.println(a+b);
//        System.out.println(a%b);
//        System.out.println(kurang);
//        System.out.println(kali);
//        System.out.println(bagi);
//        System.out.println(true || true);
//        System.out.println(true || false);
//        System.out.println(false || true);
//        System.out.println(false || false);
//        System.out.println(true && true);
//        System.out.println(true && false);
//        System.out.println(false && true);
//        System.out.println(false && false);
//        boolean baca = true;
//        boolean tulis = false;
//
//        boolean rule= baca || tulis;
//        System.out.println(rule);

//        System.out.println(!true);
//        System.out.println(!false);
//        System.out.println(true && !(true || false));

//        < > == >= <=
//        System.out.println(a>=b);

//        int saldo = 2000;
//        int uang = 1000;
//
//        if (uang>saldo){
//            System.out.println("Berhasil tarik uang");
//        }
//        else if(uang>=1000 && uang <= saldo){
//            System.out.println("Berhasil tarik uang tapi pajak gede");
//        }
//        else{
//            System.out.println("Saldo kurang");
//        }

//        int cek = 1;
//        while (cek <= 10){
//            System.out.println("looping !!");
//            cek=cek+1;
//        }
//        for (int i=1;i<=10;i++){
//            System.out.println("looping !!" + i);
//        }

//        Scanner scanner= new Scanner(System.in);
//        System.out.println("Input namamu: ");
//        String nama=scanner.nextLine();
//
//        System.out.println("Annyeong " +nama+"!");
//        if(nama.equals("Naeun")){
//            System.out.println("Apa kabar!");
//        }
//        else
//        {
//            System.out.println("Salam kenal!");
//        }
//        scanner.close();

//        boolean ceklagi = true;
//        Scanner scanner = new Scanner(System.in);
//        while (ceklagi) {
//
//            System.out.println("Input angka 1: ");
//            int angkasatu = Integer.parseInt(scanner.nextLine());
//            System.out.println("Input angka 2: ");
//            int angkadua = Integer.parseInt(scanner.nextLine());
//
//            System.out.println("Input operator: ");
//            String operator = scanner.nextLine();
//
//            calc(angkasatu,angkadua,operator);
//
//            System.out.println("Apakah mau lanjut? ");
//            String lanjut = scanner.nextLine();
//            if (lanjut.equals("Y")) {
//                ceklagi =true;
//            } else {
//                ceklagi = false;
//                System.out.println("Terimakasih !!");
//            }
//        }
//        scanner.close();
    }
}



