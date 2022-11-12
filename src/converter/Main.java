package converter;

public class Main {
    public static void main(String[] args) {

        ConverterTemperature tempConv = new ConverterTemperature();
        tempConv.setTempCels(20.1); //задаем произвольное значение температуры по Цельсию
        tempConv.getTempCels();
        tempConv.convertKel();
        tempConv.convertFahren();
        System.out.println("Заданная температура по шкале Цельсия: " + tempConv.getTempCels() +
                "\nТемпература по шкале Кельвина: " + tempConv.convertKel() + "\n" +
                "Температура по Фаренгейту: " + tempConv.convertFahren());
    }
}


class ConverterTemperature {
    double tempCels;               //Точка замерзания воды по шкале Цельсия равна нулю (° C)
    final double tempKel = 273.15; //Точка замерзания воды (ноль по шкале Цельсия) определяется как эквивалент 273,15 K по шкале Кельвина (K)
    final double tempFahren = 32;  //Точка замерзания воды (ноль по шкале Цельсия) составляет 32 градусов по Фаренгейту (° F)

    public void setTempCels(double tempCels) {
        this.tempCels = tempCels;
    }

    public double getTempCels() {
        return tempCels;
    }

    double convertKel() {
        double convKel = tempCels + tempKel;
        return  convKel;
    }

    double convertFahren() {
        double convFahren = tempCels * 1.8 + tempFahren; //Разница температур в 1° F эквивалентна разнице температур в 0,556° C, т.е. k = 1,8
        return convFahren;
    }
}
