package com.github.curriculeon;

import com.github.curriculeon.Interfaces.Learner;
import com.github.curriculeon.Interfaces.Teacher;

public class Instructor extends Person implements Teacher {
    public Instructor(Long id, String name) {
        super(id, name);
    }

    @Override
    public void teach(Learner learner, double numberOfHours) {
        learner.learn(numberOfHours);

    }

    @Override
    public void lecture(Learner[] learners, double numberOfHours) {
        double splitHours = numberOfHours / learners.length;

        for (Learner learner : learners){
            learner.learn(splitHours);
        }

    }
}
