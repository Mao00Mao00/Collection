import java.util.*;
public class Test {
    //1 задание
    public static <Integer,String> HashMap<String,Integer> flip(HashMap<Integer,String> map){
        HashMap<String, Integer> flipMap = new HashMap<>();
        for (Map.Entry<Integer, String> result : map.entrySet()) {
            flipMap.put(result.getValue(), result.getKey());
            System.out.println(flipMap);

        }
        return flipMap;
    }

    //2 задание
    public static void comparison(){
        ArrayList<Integer> arrayList = new ArrayList<>(); // ArrayList
        LinkedList<Integer> linkedList = new LinkedList<>(); // Связанный список
        for (int i = 0; i < 1000000; i++){//Заполнение случайными числами от 0 до 100
            arrayList.add(i,(int)(Math.random()*100));
            linkedList.add((int)(Math.random()*100));
        }

        long startArrayList = System.currentTimeMillis(); //Начинаем отсчет времени
        for (int i = 0; i < 1000; i++ ){
            arrayList.get((int)(Math.random()*1000000));
        }
        long finishArrayList = System.currentTimeMillis();//Конец отсчета времени для ArrayList
        long resultTimeArrayList = finishArrayList - startArrayList; //Находим время работы программы
        System.out.println("Время работы ArrayList: " + resultTimeArrayList); //Вывод. За какое кол-во времени выполнился код

        long startLinkedList = System.currentTimeMillis();//Начало отсчета времени для LinkedList
        for (int i = 0; i < 1000; i++ ){
            linkedList.get((int)(Math.random()*1000000));
        }
        long finishLinkedList = System.currentTimeMillis();//Конец отсчета времени для LinkedList
        long resultTimeLinkedList = finishLinkedList - startLinkedList;//Время работы программы
        System.out.println("Время работы LinkedList: " + resultTimeLinkedList);//Вывод
    }
    /*Результаты:
    Время работы ArrayList = 0-1 мс
    Время работы LinkedList = 436-498 мс
    Такая разница связана с особенностями списков. ArrayList это список на основе массива, поэтому поиск по индексу осущствляется очень быстро.
    В то время как LinkedList - связанный список, в котором элементы хрянят в себе не только записываемые данные, но и еще ссылку на предыдущий и следующий элементы.
    Поэтому поиск элемента занимает куда больше времени, чем в ArrayList
    */

    //Задание 3. Я просто все данные перезапишу в LinkedHashSet. Он уже сам отсечет одинаковые значения
    public static void noTwin(ArrayList<String> twins){
        LinkedHashSet<String> loner = new LinkedHashSet<>(); //создаю LinkedHashSet, в который перезапишу данные с ArrayList
        int size = twins.size(); //размер полученного массива сп
        for(int i = 0; i < size; i++){
            loner.add(twins.get(i));//Запись данных из ArrayList в LinkedHashSet
        }
        System.out.println(loner);
    }

    public static void main(String[] args) {
        /*HashMap<Integer, String> сhampionship = new HashMap<>(); //тест к 1 заданию
        System.out.println("Тест к первому заданию");
        сhampionship.put(1, "Сат");
        сhampionship.put(2, "Фил");
        сhampionship.put(3, "Рок");
        сhampionship.put(4, "Кей");
        сhampionship.put(5, "Мех");
        Test.flip(сhampionship);
*/
        comparison();
/*
        System.out.println("Тест к третьему заданию");
        ArrayList<String> friend = new ArrayList<>(); //тест к 3 заданию
        friend.add("Катя");
        friend.add("Антон");
        friend.add("Полина");
        friend.add("Рома");
        friend.add("Катя");
        noTwin(friend);*/
    }

}
