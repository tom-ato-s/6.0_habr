//https://habr.com/ru/post/440436/
//        Практические задачи по Java

//Абстрактные классы и интерфейсы
//
//        6.0. Конвертер температур
//
//        Задача:
//
//        Напишите класс BaseConverter для конвертации из градусов по Цельсию в
//        Кельвин, Фаренгейты, и так далее. У метода должен быть метод convert, который
//        и делает конвертацию.


interface BaseConverter {
    double convert(double celsiy);

}

class Faringeit implements BaseConverter{

    @Override
    public double convert(double celsiy) {
        return  (celsiy*9/5) +32;
    }
}

class Celvin implements BaseConverter{
    @Override
    public double convert(double celsiy) {
        return celsiy + 273.15;
    }
}

class Main{

    public static void main(String[] args) {
        int celsiy = 80;
        Faringeit faringeit = new Faringeit();
        System.out.println(celsiy + " по цельсию - это по Фаренгейту: " + faringeit.convert(celsiy));

        Celvin celvin = new Celvin();
        System.out.println(celsiy + " по цельсию - это по Кельвину: " +   celvin.convert(celsiy));
    }
}
