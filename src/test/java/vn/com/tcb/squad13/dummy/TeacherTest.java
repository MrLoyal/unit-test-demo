package vn.com.tcb.squad13.dummy;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.*;

class TeacherTest {

    Teacher teacher;

    @BeforeEach
    void setup(){
        teacher = new Teacher();
    }

    @Test
    void givenAboveEight_shouldReturnGoodGrade() {
        Student dummyStudent = new Student("", "");
        Mark math = new Mark(dummyStudent, 1L, 8.5f);
        Mark physics = new Mark(dummyStudent, 2L, 9.0f);

        List<Mark> markList = Arrays.asList(math, physics);

        Grade grade = teacher.calculateGrade(markList);
        assertThat(grade).isEqualTo(Grade.Good);
    }
}