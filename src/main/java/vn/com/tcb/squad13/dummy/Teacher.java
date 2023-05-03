package vn.com.tcb.squad13.dummy;

import java.util.List;

public class Teacher {

    public Grade calculateGrade(List<Mark> markList){
        float aggregate = 0;
        for (Mark mark : markList){
            aggregate += mark.getMarks();
        }

        float percent = calculateAverageMark(aggregate, markList.size());
        if (percent >= 8){
            return Grade.Good;
        } else if (percent >= 5){
            return Grade.Average;
        } else {
            return Grade.Poor;
        }
    }

    private float calculateAverageMark(float aggregate, int numberOfSubjects){
        return aggregate / numberOfSubjects;
    }
}
