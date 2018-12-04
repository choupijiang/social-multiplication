package tech.choupijiang.socialmultiplication.domain;

import lombok.*;


@RequiredArgsConstructor
@Getter
@ToString
@EqualsAndHashCode
@Data
public final class Multiplication {

    private  final int factorA;
    private  final int factorB;

    Multiplication() {
        this(0, 0);
    }
}