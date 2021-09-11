import java.util.Scanner;

public class Test {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите длину массива");
        int n = scanner.nextInt();
        int[] massive = new int[n];
        for (int i = 0; i < n; i++){
            System.out.println("Введите значение элемента " + i);
            massive[i] = scanner.nextInt();
        }
        int x = 6;
        int y = 2;
        int z = 12;
        for (int a : massive){
            if(a == x || a == y || a == z){
                System.out.println("Данное значение имеется в константах: " + a);
            }
        }
    }
}
