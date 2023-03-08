package test.java.singleton;

import main.java.singleton.Singleton;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static   org.assertj.core.api.Assertions.assertThat;

public class SingletonTest {

    @Test
    @DisplayName("Sigleton")
    void singletonIdentityandEqualityTest(){
        //first singleton
        Singleton singleton = Singleton.getSingleton();
        //second singleton
        Singleton singleton1 = Singleton.getSingleton();
        //test
        assertThat(singleton).isEqualTo(singleton1);
        assertThat(singleton).isSameAs(singleton1);
    }
}
