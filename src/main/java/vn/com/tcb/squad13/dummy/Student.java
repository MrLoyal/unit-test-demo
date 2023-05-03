package vn.com.tcb.squad13.dummy;

public class Student {
    private final String code;
    private final String name;

    public Student(String code, String name) {
        this.code = code;
        this.name = name;
    }

    public String getCode() {
        return code;
    }

    public String getName() {
        return name;
    }
}
