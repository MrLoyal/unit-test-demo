package vn.com.tcb.squad13.dummy;

public class Mark {
    private final Student student;

    private final long subjectId;

    private final float marks;

    public Mark(Student student, long subjectId, float marks) {
        this.student = student;
        this.subjectId = subjectId;
        this.marks = marks;
    }

    public Student getStudent() {
        return student;
    }

    public long getSubjectId() {
        return subjectId;
    }

    public float getMarks() {
        return marks;
    }
}
