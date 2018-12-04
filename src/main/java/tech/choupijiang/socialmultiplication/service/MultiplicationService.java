package tech.choupijiang.socialmultiplication.service;


import tech.choupijiang.socialmultiplication.domain.Multiplication;
import tech.choupijiang.socialmultiplication.domain.MultiplicationResultAttempt;

public interface MultiplicationService {

    /**
     * Creates a Multiplication object with two randomly-generated factors
     * between 11 and 99.
     *
     * @return a Multiplication object with random factors
     */
    Multiplication createRandomMultiplication();

    boolean checkAttempt(final MultiplicationResultAttempt resultAttempt);

}