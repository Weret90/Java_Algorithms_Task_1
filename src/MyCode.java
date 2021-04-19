public class MyCode {

    public static void main(String[] args) {

        int a = 15;  //переменная примитивного типа
        String fruit = new String("яблоко");  //переменная ссылочного типа
        Animal cat = new Animal("кот", "Пушок", 5);  //переменная класса Animal

        int[] nums = {1, 2, 4, 55, 33, 15, 16, 17}; //для сравнения вышеперечисленных переменных с другими переменными методом перебора создаем массивы
        int[] nums2 = {1, 2, 4, 55, 33, 16, 17};  //в одном массиве искомая переменная есть, в другом нет

        String[] fruits = {"банан", "яблоко", "ананас", "арбуз", "апельсин", "манго"};
        String[] fruits2 = {"банан", "ананас", "арбуз", "апельсин", "манго"};

        Animal[] animals = {new Animal("собака", "Шарик", 4),
                new Animal("кот", "Боб", 2),
                new Animal("попугай", "Кузя", 3),
                new Animal("кот", "Пушок", 5)};
        Animal[] animals2 = {new Animal("собака", "Шарик", 4),
                new Animal("кот", "Боб", 2),
                new Animal("попугай", "Кузя", 3),
        };

        long start = System.nanoTime();

        search(a, nums); //здесь число есть
        search(a, nums2); //здесь числа нету

        search(fruit, fruits);
        search(fruit, fruits2);

        search(cat, animals);
        search(cat, animals2);

        long finish = System.nanoTime();
        long elapsed = finish - start;
        System.out.println("Прошло времени, нс: " + elapsed);
    }

    //создаем оверлоадед методы для сравнения переменных
    public static void search(int a, int[] nums) {
        for (int num : nums) {
            if (a == num) {
                System.out.printf("Число %d присутствует в приведенном массиве чисел\n", a);
                return;
            }
        }
        System.out.printf("Число %d отсутствует в приведенном массиве чисел\n", a);
    }


    public static void search(String a, String[] words) {
        for (String word : words) {
            if (a.equals(word)) {
                System.out.printf("Слово %s присутствует в приведенном массиве слов\n", a);
                return;
            }
        }
        System.out.printf("Число %s отсутствует в приведенном массиве слов\n", a);
    }

    public static void search(Animal a, Animal[] animals) {
        for (Animal animal : animals) {
            if (a.getSpecies().equals(animal.getSpecies()) && a.getName().equals(animal.getName()) && a.getAge() == animal.getAge()) {
                System.out.printf("%s %s присутствует в приведенном массиве\n", a.getSpecies(), a.getName());
                return;
            }
        }
        System.out.printf("%s %s отсутствует в приведенном массиве\n", a.getSpecies(), a.getName());
    }
}
