package oop.task2;

/**
 * Модель поведения транспорта
 */
public interface Transport extends Positioned {

    /**
     * Доехать до ближайшей возможной точки назначения
     */
    Position driveTo(Position destination);
}
