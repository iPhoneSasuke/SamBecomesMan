package guru.qa;

public class SamBecomesMan {
    public static void main(String[] args) {

        boolean boolFalse = false;
        boolean boolTrue = true;
        byte aByte = 7; //8bit
        short aShort = 10; //16 bit
        int a = 100;
        int d = 18;
        long aLong = 123000; //64 bit
        int samAge = samAge();
        int samMoney = samMoney();
        int sellerWisdom = sellerWisdom();
        int sellerLuck = sellerLuck();
        int samFury = samFury();


        String nameString = "Sam";

        System.out.println("Welcome to our supermarket. To show you available goods, please identify yourself.");
        System.out.println("Enter your name and age.");

        if (nameString != null && nameString.equals("Sam")) {
            System.out.println("\n" + "Name: " + nameString);
            System.out.println("Age:" + samAge);
        }
        if (samAge >= d) {
            System.out.println("Weapon access: granted");
            System.out.println("Before we'll give it to you, let us check your knowledges.");
            System.out.println("\n" + "aByte=7, aShort=10. How much will be aByte+aShort?");
            System.out.println(aByte + aShort);
            System.out.println("\n" + "O'kay. What about aBit-aShort?");
            System.out.println(aByte - aShort);
            System.out.println("\n" + "Can you multiply 'em?");
            System.out.println(aByte * aShort);
            System.out.println("\n" + "aLong=123000. How much if you'll separate it by aShort?");
            System.out.println(aLong / aShort);
            System.out.println("\n" + "What is ++aShort?");
            System.out.println("aShort++ is " + (++aShort));
            System.out.println("\n" + "What is int --a?");
            System.out.println("int --a is " + (--a));
            System.out.println("\n" + "How much money do you have?");
            System.out.println((samMoney) + "$");
            if (samMoney<50) {
                System.out.println("Than you cannot buy anything.");
            }
            else if (samMoney>=50 && samMoney<100) {
                System.out.println("Than you can buy " + "the AK-47.");
            } else if (samMoney>=100 && samMoney<150) {
                System.out.println("Than you can buy the AK-47 or the Steyr AUG.");
            } else if (samMoney>=150) {
                System.out.println("Than you can buy the AK-47 & the Steyr AUG.");
            }
            if (samMoney>50) {
                System.out.println("\n" + "I'll take AK-47.");
                System.out.println("Thank you for buying & be careful.");
                if (sellerWisdom<30) {
                    System.out.println("\n" + "And one more question!");
                }if (sellerWisdom()+sellerLuck()<=samFury) {
                    System.out.println("\n" + "BOOM!");
                    System.out.println("I've been waiting for that for a long time!");
                }else if (sellerWisdom()+sellerLuck()>=samFury) {
                    System.out.println("What else?");
                }}
        }
        //Свитч
        int num = 124; // осознанно выбрал число вне диапазона, чтобы высветилось значение по умолчанию
        switch(num){

            case 1:
                System.out.println("число равно 1");
                break;
            case 5:
                System.out.println("число равно 5");
                break;
            case 7:
                System.out.println("число равно 9");
                break;
            default:
                System.out.println("число не равно 1, 8, 9");
        }
    }
    static int samAge() {
        int u = 18;
        int v = 2;
        return (u + v);
    }
    static int samMoney() {
        int u = 60;
        int v = 20;
        return (u + v);
    }
    static int sellerWisdom() {
        int u = 10;
        int v = 10;
        return (u + v);
    }
    static int sellerLuck() {
        int u = 10;
        int v = 10;
        return (u + v);
    }
    static int samFury() {
        int u = 50;
        int v = 40;
        return (u + v);
    }
}
