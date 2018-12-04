package tech.choupijiang.socialmultiplication.domain;


import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.RequiredArgsConstructor;
import lombok.ToString;

@RequiredArgsConstructor
@Getter
@ToString
@EqualsAndHashCode
public final class User {

    private final String alias;

    // Empty constructor for JSON (de)serialization
     User() {
        alias = null;
    }
}