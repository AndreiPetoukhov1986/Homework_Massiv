public class Main {
    public static void main(String[] args) {
        task1();
        task2();
        task3();
        task4();
    }

    public static void task1() {
        System.out.println("Задача 1");
        int[] whole = new int[3];
        whole[0] = 1;
        whole[1] = 2;
        whole[2] = 3;
        double[] fractional = {1.57, 7.654, 9.986};
        byte[] number = {11, 22, 33};
    }

    public static void task2() {
        System.out.println("Задача 2");
        int[] whole = new int[3];
        whole[0] = 1;
        whole[1] = 2;
        whole[2] = 3;
        for (int a = 0; a < whole.length; a++) {
            if (a == whole.length - 1) {
                System.out.print(whole[a]);
                break;
            }
            System.out.print(whole[a] + ", ");
        }
        System.out.println();

        double[] fractional = {1.57, 7.654, 9.986};
        for (int i = 0; i < fractional.length; i++) {
            if (i == fractional.length - 1) {
                System.out.print(fractional[i]);
                break;
            }
            System.out.print(fractional[i] + ", ");
        }
        System.out.println();

        byte[] number = {11, 22, 33};
        for (int i = 0; i < number.length; i++) {
            if (i == number.length - 1) {
                System.out.print(number[i]);
                break;
            }
            System.out.print(number[i] + ", ");
        }
        System.out.println();
    }

    public static void task3() {
        System.out.println("Задача 3");
        int[] whole = new int[3];
        whole[0] = 1;
        whole[1] = 2;
        whole[2] = 3;
        for (int w = whole.length - 1; whole.length > w; w--) {
            if (w == 0) {
                System.out.print(whole[w]);
                break;
            }
            System.out.print(whole[w] + ", ");
        }
        System.out.println();

        double[] fractional = {1.57, 7.654, 9.986};
        for (int f = fractional.length - 1; f < fractional.length; f--) {
            if (f == 0) {
                System.out.print(fractional[f]);
                break;
            }
            System.out.print(fractional[f] + ", ");
        }
        System.out.println();


        byte[] number = {11, 22, 33};
        for (int b = number.length - 1; b < number.length; b--) {
            if (b == 0) {
                System.out.print(number[b]);
                break;
            }
            System.out.print(number[b] + ", ");
        }
        System.out.println();
    }

    public static void task4() {
        System.out.println("Задача 4");
        int[] whole = new int[3];
        whole[0] = 1;
        whole[1] = 2;
        whole[2] = 3;
        for (int w = 0; w < whole.length; w++) {
            while (whole[w]%2!=0){
                whole[w]++;
            }
            if (w == whole.length - 1) {
                System.out.print(whole[w]);
                break;
            }
            System.out.print(whole[w] + ", ");
        }
        System.out.println();

        }
    }