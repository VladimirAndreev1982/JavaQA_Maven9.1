public class Radio {

    //---Номер радиостанции----------------------------------------------------------
    private int currentStation; // закрытая переменная номер радиостанции

    public int getCurrentStation() { // Текующий номер радиостанции
        return currentStation;
    }

    public void setCurrentStation(int currentStation) { // Вводимый номер станция
        if (currentStation < 0) {  // Если вводимый номер станции меньше 0 то уходим
            System.out.println("Введите номер станции от 0 до 9");
            return;
        }
        if (currentStation > 9) {  // Если вводимый номер станции больше 9 то уходим
            System.out.println("Введите номер станции от 0 до 9");
            return;
        }
        this.currentStation = currentStation;
    }

    public void nextStation() { // Следующий номер радиостанци
        if (currentStation < 9) {
            currentStation = currentStation + 1; // currentStation++
        } else {
            currentStation = 0;
        }
    }

    public void prevStation() { // Предыдующий номер радиостанции
        if (currentStation > 0) {
            currentStation = currentStation - 1; // currentStation--
        } else {
            currentStation = 9;
        }
    }

    //---Уровень звука----------------------------------------------------------
    private int currentVolume; // закрытая переменная уровень звука

    public int getCurrentVolume() { // Текущий уровень звука
        return currentVolume;
    }

    // В задаче нет требования про ручной ввод номера звука !!!
    public void setCurrentVolume(int currentVolume) { // Вводимый уровень звука
        if (currentVolume < 0) {  // Если вводимый уровень звука меньше 0 то уходим
            System.out.println("Введите уровень звука от 0 до 10");
            return;
        }
        if (currentVolume > 10) {  // Если вводимый уровень звука больше 10 то уходим
            System.out.println("Введите уровень звука от 0 до 10");
            return;
        }
        this.currentVolume = currentVolume;
    }

    public void increaseVolume() { // Увеличение уровня звука
        if (currentVolume < 10) {
            currentVolume = currentVolume + 1; // currentVolume++
        } else {
            currentVolume = 10;
        }
    }

    public void decreaseVolume() { // Уменьшение уровня звука
        if (currentVolume > 0) {
            currentVolume = currentVolume - 1; // currentVolume--
        } else {
            currentVolume = 0;
        }
    }
}