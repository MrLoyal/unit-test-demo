package vn.com.tcb.squad13;


import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class AppTest {

    App app;

    @BeforeEach
    public void setup(){
        System.out.println("Running setup");
        app = new App();
    }

    @Test
    public void testApp() {
        System.out.println("Running test");
        app.doIt();
        assertThat(1==1).isTrue();
    }
}
