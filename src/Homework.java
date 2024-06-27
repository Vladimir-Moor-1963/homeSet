import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Homework {

 //1. Вводится 5 чисел. Напишите "Yes", если они не все равны между собой.
  //  1.1 Нужно использовать Set
  //  1.2 Запрещено писать в if условие (1 == 2 и 2 == 3 и 3 == 4), contains использовать нельзя
//
  //  2. Вводится день недели. Напишите тип это дня (выходной или рабочий). Используйте для этого set.
  //      2.1 Если такого дня не существует - напишите "Ошибка".


    public static void main(String[] args) {
        Set<Integer> set = new HashSet<>();
        Scanner scanner = new Scanner(System.in);
        for (int i = 0; i < 5; i++) {
            set.add(scanner.nextInt());

        }
        if (set.size() == 1){
            System.out.println("Yes");
        }
    }
}