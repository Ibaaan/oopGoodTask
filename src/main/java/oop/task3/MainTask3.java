package oop.task3;

import java.util.List;

/**
 * <b>Задача 3:</b><br>
 * То же самое, что и задача 2, но добраться нужно с пересадками<br>
 * Можно определить транспортные средства списком:<br>
 * {@code List.of(new Car(person), new Bus("43", person),
 *        new Bus("50", person));}
 * <ul>
 *   <li>Код не должен превышать 12 строк</li>
 *   <li>Запрещено реализовывать конструкторы и методы, кроме moveTo(...)</li>
 *   <li>Запрещено добавлять новые методы в класс Main</li>
 *   <li>Разрешено создавать новые классы и интерфейсы</li>
 * </ul>
 *
 * @author vpyzhyanov
 * @since 21.10.2020
 */
public class MainTask3 {

    /**
     * Переехать из текущего места в заданную точку
     * на любом, заранее определённом транспорте
     * @see Person
     * @see Position
     */
    // TODO реализовать метод moveTo(...)
    public void moveTo(Person person, Position destination, List<Transport> transport){
        for(int i =0; i < transport.size(); i++){
            person.walk(transport.get(i).getPosition());
            Position nextPosition;
            try{
                nextPosition = transport.get(i+1).getPosition();
            }
            catch(IndexOutOfBoundsException e){
                nextPosition = destination;
            }
            transport.get(i).driveTo(nextPosition);
        }
        person.walk(destination);
    }
}
