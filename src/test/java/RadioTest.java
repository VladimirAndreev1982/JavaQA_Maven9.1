import org.junit.jupiter.api.Assertions;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

public class RadioTest {
// Тестируем коды номера радиостанции
    @Test // Проверка 1 валидного номера текущей радиостанции
    public void CurrentStationValid1() {
        Radio radio = new Radio();
        radio.setCurrentStation(9);
        int expected = 9;
        int actual = radio.getCurrentStation();
        assertEquals(expected, actual);
    }

    @Test // Проверка 2 валидного номера текущей радиостанции
    public void CurrentStationValid2() {
        Radio radio = new Radio();
        radio.setCurrentStation(5);
        int expected = 5;
        int actual = radio.getCurrentStation();
        assertEquals(expected, actual);
    }

    @Test // Проверка 1 НЕвалидного номера текущей радиостанции
    public void CurrentStationNoValid1() {
        Radio radio = new Radio();
        radio.setCurrentStation(10);
        int expected = 0;
        int actual = radio.getCurrentStation();
        assertEquals(expected, actual);
    }

    @Test // Проверка 2 НЕвалидного номера текущей радиостанции
    public void CurrentStationNoValid2() {
        Radio radio = new Radio();
        radio.setCurrentStation(-1);
        int expected = 0;
        int actual = radio.getCurrentStation();
        assertEquals(expected, actual);
    }

    @Test // Проверка 1 номера следующей радиостанции
    public void NextStation1() {
        Radio radio = new Radio();
        radio.setCurrentStation(9);
        radio.nextStation();
        int expected = 0;
        int actual = radio.getCurrentStation();
        assertEquals(expected, actual);
    }

    @Test // Проверка 2 номера следующей радиостанции
    public void NextStation2() {
        Radio radio = new Radio();
        radio.setCurrentStation(8);
        radio.nextStation();
        int expected = 9;
        int actual = radio.getCurrentStation();
        assertEquals(expected, actual);
    }

    @Test // Проверка 1 номера предыдущей радиостанции
    public void PrevStation1() {
        Radio radio = new Radio();
        radio.setCurrentStation(0);
        radio.prevStation();
        int expected = 9;
        int actual = radio.getCurrentStation();
        assertEquals(expected, actual);
    }

    @Test // Проверка 2 номера предыдущей радиостанции
    public void PrevStation2() {
        Radio radio = new Radio();
        radio.setCurrentStation(5);
        radio.prevStation();
        int expected = 4;
        int actual = radio.getCurrentStation();
        assertEquals(expected, actual);
    }

// Тестируем коды уровня звука

    @Test // Проверка 1 увеличения уровня звука
    public void IncreaseVolume1() {
        Radio radio = new Radio();
        radio.setCurrentVolume(0);
        radio.increaseVolume();
        int expected = 1;
        int actual = radio.getCurrentVolume();
        assertEquals(expected, actual);
    }

    @Test // Проверка 2 увеличения уровня звука
    public void IncreaseVolume2() {
        Radio radio = new Radio();
        radio.setCurrentVolume(99);
        radio.increaseVolume();
        int expected = 100;
        int actual = radio.getCurrentVolume();
        assertEquals(expected, actual);
    }

    @Test // Проверка 3 увеличения уровня звука
    public void IncreaseVolume3() {
        Radio radio = new Radio();
        radio.setCurrentVolume(100);
        radio.increaseVolume();
        int expected = 100;
        int actual = radio.getCurrentVolume();
        assertEquals(expected, actual);
    }

    @Test // Проверка 4 увеличения НЕ валидного уровня звука
    public void IncreaseVolumeNoValid1() {
        Radio radio = new Radio();
        radio.setCurrentVolume(-1);
        radio.increaseVolume();
        int expected = 1;
        int actual = radio.getCurrentVolume();
        assertEquals(expected, actual);
    }

    @Test // Проверка 5 увеличения НЕ валидного уровня звука
    public void IncreaseVolumeNoValid2() {
        Radio radio = new Radio();
        radio.setCurrentVolume(200);
        radio.increaseVolume();
        int expected = 1; // При НЕ валидном наборе осталяет уровень звука какой был до этого
        int actual = radio.getCurrentVolume();
        assertEquals(expected, actual);
    }

    @Test // Проверка 1 уменьшения валидного уровня звука
    public void decreaseVolume1() {
        Radio radio = new Radio();
        radio.setCurrentVolume(100);
        radio.decreaseVolume();
        int expected = 99;
        int actual = radio.getCurrentVolume();
        assertEquals(expected, actual);
    }

    @Test // Проверка 2 уменьшения валидного уровня звука
    public void decreaseVolume2() {
        Radio radio = new Radio();
        radio.setCurrentVolume(1);
        radio.decreaseVolume();
        int expected = 0;
        int actual = radio.getCurrentVolume();
        assertEquals(expected, actual);
    }

    @Test // Проверка 3 уменьшения валидного уровня звука
    public void decreaseVolume3() {
        Radio radio = new Radio();
        radio.setCurrentVolume(0);
        radio.decreaseVolume();
        int expected = 0;
        int actual = radio.getCurrentVolume();
        assertEquals(expected, actual);
    }

    @Test // Проверка 1 уменьшения НЕвалидного уровня звука
    public void decreaseVolume4() {
        Radio radio = new Radio();
        radio.setCurrentVolume(200);
        radio.decreaseVolume();
        int expected = 0;
        int actual = radio.getCurrentVolume();
        assertEquals(expected, actual);
    }

    @Test
    public void quantityStation1() { // Проверка ввода валидного кол-ва станций
        Radio radio = new Radio();
        radio.setQuantityStation(101);
        assertEquals(101, radio.getQuantityStation());
    }

    @Test
    public void quantityStation2() { // Проверка ввода НЕвалидного кол-ва станций
        Radio radio = new Radio();
        radio.setQuantityStation(-10);
        assertEquals(10, radio.getQuantityStation());
    }
    @Test
    public void construktor() { // Проверка работы конструктора Radio
        Radio radio = new Radio(20);
        Assertions.assertEquals(20, radio.getQuantityStation());
        Assertions.assertEquals(0, radio.getMinNumberStation());
        Assertions.assertEquals(19, radio.getMaxNumberStation());
    }

}
