package step5.enums;

import step5.RandomNumberGenerator;

import java.util.function.Predicate;
import java.util.stream.Stream;

public enum MOVE {
    GO((num) -> num >= 4),
    STOP((num) -> num < 4);

    private final Predicate<Integer> condition;

    MOVE(Predicate<Integer> condition) {
        this.condition = condition;
    }

    public static MOVE fromInt(int number) {
        return Stream.of(values())
                .filter(t -> t.condition.test(number))
                .findFirst().orElse(MOVE.GO);
    }
}