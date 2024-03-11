public class Main {
    public static void main(String[] args) {
        //1. Выведите ваше имя в консоль
        System.out.println("Eng version: Ilia");
        System.out.println("Rus version: Илья");
        System.out.println();
        //2. Выведите любимое стихотворение в консоль
        System.out.println(
                "У синего моря без невода, но с девами ползал\n" +
                        "Пил жидкое горе, хоть знал — от него нет пользы\n" +
                        "Я хороший, просто хотел угореть по злу\n" +
                        "С теми, кого люблю, и вот теперь ползу к финишу");


        // 4 Вывести значение 2 + 2 * 2
        int two = 2 + 2 * 2;
        System.out.println("Значение: 2+2*2, будет = " + two);
        // 5 Вывести значение 2 + 2 * 2
        int two1 = (2 + 2) * 2;
        System.out.println("Значение: (2+2)*2, будет = " + two1);
        //6 Вывести значение деления 100 на пи
        double pi = 3.14159;// приблизительное значение
        double result = 100 / pi;
        System.out.printf("6) " + "%.2f%n", result);//округлил ответ
        //7. Вывестизначение 12345 в третьей степени
        int degree = 12345;
        int step = 3;
        double deg = Math.pow(degree, step);
        //Здесь использую преобразование(приведения типов) в Long,так как, в int ответ не правельный
        long resultDegree = (long) degree * degree * degree;
        System.out.println("7)" + deg);
        System.out.println("7) " + resultDegree);
        //Вывести квадратный корень от двух в 10 степени
        double cor = Math.pow(2, 10);
        double resultCor = Math.sqrt(cor);
        System.out.println("8) " + (int) resultCor);
        // Вывести корень из двух, возведенный в 10 степень
        double cor1 = Math.sqrt(2);
        double resultCor1 = Math.pow(cor1, 20);
        System.out.println("9) " + (int) resultCor1);
        //10. Что будет, если в джаве поделить на ноль? Проверить
        try {
            System.out.println("10) " + "Деление на 0 будет:" + 1 / 0);
        } catch (Exception e) {
            System.out.println("10) " + e);
        }

        System.out.println("10) " + "Деление на 0 будет:" + 1.1 / 0);
        //11. Попробуйте сложить две строки в Java. Выведите результат.
        System.out.println("11) " + "Hello" + "World");
        System.out.println("11) " + "Hello" + "," + "World");
        //12. Попробуйте вычесть, разделить две строки.
        // Выдает ошибку:Оператор '*' не может быть применен к 'java.lang.String', 'java.lang.String'
        //System.out.println("11) " * "Hello" / "World");
//        String s1 = "Hello";
//        String s2 = "World";
//        System.out.println(s2 * s1);
        //13. Попробуйте сложить строку с числом пи. Что получилось?
        String str = "String++";
        System.out.println("13) " + str + pi);
        System.out.println("-----------------");
        //14. Полезное упражнение: напишите программу, которая считает корень линейного уравнения ax+b=0
        double a = 2;
        double b = 6;
        double x = -b / a;
        System.out.println(x);
//15 Полезное упражнение. Использовал данные из 14.
        //1 вариант
        double c = 2;
        double d = 4;
        double resX = -d / c;
        System.out.println(resX);
        x = x * resX;
        System.out.println(x);
        //2 вариант поинтересней
        double x1, x2;// здесь храним корни каждого уровнения
        if (a == 0 && c == 0) {
            System.out.println("Уравнение не имеет  решения.");
        } else if (a == 0) {
            x1 = -d / c;
            System.out.println("Уравнение имеет один корень: x = " + x1);
        } else if (c == 0) {
            x2 = -b / a;
            System.out.println("Уравнение имеет один корень: x = " + x2);
        } else {
            x1 = -b / a;
            x2 = -d / c;
            System.out.println("15) " + "Корни уравнения (" + a + "x + " + b + ") * (" + c + "x + " + d + ") = 0:");
            System.out.println("x1 = " + x1);
            System.out.println("x2 = " + x2);
            System.out.println("x = " + x1 * x2);
        }

        //16) Полезное упражнение: напишите программу, которая считает дискриминант квадратного уравнения
        // ax2 + bx + c = 0
        // это фурьула которую использовал b2 − 4ac

        double d1 = b * b - 4 * a * c;//Math.pow(b, 2)
        System.out.println(d1);

    }
}