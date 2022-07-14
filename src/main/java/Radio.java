public class Radio {
    //---Номер радиостанции поля----------------------------------------------------------
    private int quantityStation = 10; // количество радиостанций по умолчанию = 10
    private int maxNumberStation = quantityStation - 1; // максимальный номер радиостанции по умолчанию = 9
    private int minNumberStation = 0; // минимальный номер радиостанции = 0
    private int currentStation = minNumberStation; // номер текущей радиостанции

    //---Уровень звука поля----------------------------------------------------------
    private int minVolume = 0; // минимальный уровень звука = 0
    private int maxVolume = 100; // максимальный уровень звука = 100
    private int currentVolume = minVolume; // текущий уровень звука

    //---Конструктор с вводом параметра кол-ва радиостанций-------------------
    public Radio (int quantityStation) {
        this.quantityStation = quantityStation;
        this.maxNumberStation = quantityStation - 1;
    }
    //---Конструктор без ввода параметра кол-ва радиостанций-------------------
    public Radio () {
        this.quantityStation = quantityStation;
        this.maxNumberStation = quantityStation - 1;
    }

    //---Номер радиостанции методы get----------------------------------------------------------
    public int getCurrentStation() { // Получаемый номер радиостанции
        return currentStation;
    }
    public int getQuantityStation() { // Получаемое кол-во радиостанций
        return quantityStation;
    }
    public int getMinNumberStation() { // Получаемый минимальный номер радиостанций
        return minNumberStation;
    }
    public int getMaxNumberStation() { // Получаемый максимальный номер радиостанций
        return maxNumberStation;
    }

    //---Номер радиостанции методы set----------------------------------------------------------
    public void setCurrentStation(int currentStation) { // Вводимый номер станция
        if (currentStation < minNumberStation) {  // Если вводимый номер станции меньше 0 то уходим
            System.out.println("Введите номер станции от " + minNumberStation + " до " + maxNumberStation);
            return;
        }
        if (currentStation > maxNumberStation) {  // Если вводимый номер станции больше 9 то уходим
            System.out.println("Введите номер станции от " + minNumberStation + " до " + maxNumberStation);
            return;
        }
        this.currentStation = currentStation;
    }
    public void setQuantityStation(int quantityStation) { // Вводимое кол-во станций
        if (quantityStation < 0) {  // Если вводимое кол-во станций меньше 0 то уходим
            System.out.println("Введите кол-во станций больше 0");
            return;
        }
        this.quantityStation = quantityStation;
    }
    public void nextStation() { // Следующий номер радиостанци
        if (currentStation < maxNumberStation) {
            currentStation = currentStation + 1; // currentStation++
        } else {
            currentStation = minNumberStation;
        }
    }
    public void prevStation() { // Предыдующий номер радиостанции
        if (currentStation > minNumberStation) {
            currentStation = currentStation - 1; // currentStation--
        } else {
            currentStation = maxNumberStation;
        }
    }

    //---Уровень звука методы get----------------------------------------------------------
    public int getCurrentVolume() { // Получаемый уровень звука
        return currentVolume;
    }
    //---Уровень звука методы set----------------------------------------------------------
    // В задаче нет требования про ручной ввод номера звука !!!
    public void setCurrentVolume(int currentVolume) { // Вводимый уровень звука
        if (currentVolume < minVolume) {  // Если вводимый уровень звука меньше 0 то уходим
            System.out.println("Введите уровень звука от " + minVolume + " до " + maxVolume);
            return;
        }
        if (currentVolume > maxVolume) {  // Если вводимый уровень звука больше 10 то уходим
            System.out.println("Введите уровень звука от " + minVolume + " до " + maxVolume);
            return;
        }
        this.currentVolume = currentVolume;
    }
    public void increaseVolume() { // Увеличение уровня звука
        if (currentVolume < maxVolume) {
            currentVolume = currentVolume + 1; // currentVolume++
        } else {
            currentVolume = maxVolume;
        }
    }
    public void decreaseVolume() { // Уменьшение уровня звука
        if (currentVolume > minVolume) {
            currentVolume = currentVolume - 1; // currentVolume--
        } else {
            currentVolume = minVolume;
        }
    }
}