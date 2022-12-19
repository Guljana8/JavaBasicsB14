package Replit;

public class bracketParsing {
    public static boolean parsing(String str)  //объявление функции, которая проверяет правильность последовательности
    {
        int check_bracket = 0;  //задаём переменную-счётчик для проверки
        for (int i = 0; i < str.length(); i++) {  //от 0 до длины строки не включительно
            if (check_bracket < 0) {  //если счётчик меньше нуля
                return false;  //вернуть false, последовательность не правильная
            }

            String one_symbol = str.substring(i, i + 1);  //получаем символ
            if (one_symbol.equals("(")) {  //проверяем является ли он открывающей скобкой
                check_bracket++;  //если да, то наращиваем счётчик
            }
            else  {  //иначе
                check_bracket--;  //уменьшаем счётчик на единицу
            }
        }

        if (check_bracket == 0) {  //если счётчик проверки равен нулю,
            return true;  //то значит, что все скобки проставлены верно
        }
        else {  //иначе
            return false;  //последовательность не верна
        }
    }

    public static void main(String[] args)
    {  //основной метод программы
        String var = "()()()";  //задаём скобочную последовательность
        System.out.println(parsing(var));  //выводим результат метода с передачей значения
    }
}
