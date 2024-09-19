package telegramTask;

public class Main {
    public static void main(String[] args) {
        Vector v1 = new Vector(1, 4, 7);
        Vector v2 = new Vector(5, -4, 2);
        System.out.println("Вектор 1: " + v1);
        System.out.println("Вектор 2: " + v2);


        System.out.println("Длина вектора 1: " + v1.length());
        System.out.println("Длина вектора 2: " + v2.length());
        System.out.println("Скалярное произведение: " + v1.scalarProduct(v2));
        System.out.println("Векторное произведение: " + v1.vectorProduct(v2));
        System.out.println("Угол: " + v1.angleBetweenVectors(v2));
        System.out.println("Сумма: " + v1.sum(v2));
        System.out.println("Разность: " + v1.difference(v2));
    }
}
