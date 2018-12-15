package tech.choupijiang.socialmultiplication.service;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import tech.choupijiang.socialmultiplication.domain.Multiplication;
import tech.choupijiang.socialmultiplication.domain.MultiplicationResultAttempt;

@Service
class MultiplicationServiceImpl implements MultiplicationService {

    private RandomGeneratorService randomGeneratorService;

    @Autowired
    public MultiplicationServiceImpl(RandomGeneratorService randomGeneratorService) {
        this.randomGeneratorService = randomGeneratorService;
    }

    @Override
    public Multiplication createRandomMultiplication() {
        int factorA = randomGeneratorService.generateRandomFactor();
        int factorB = randomGeneratorService.generateRandomFactor();
        return new Multiplication(factorA, factorB);
    }

//    @Override
//    public boolean checkAttempt(MultiplicationResultAttempt resultAttempt) {
//        return resultAttempt;
//    }


}
