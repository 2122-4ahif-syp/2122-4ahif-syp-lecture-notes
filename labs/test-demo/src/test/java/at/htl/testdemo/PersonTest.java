package at.htl.testdemo;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;


class PersonTest {

    @Test
    void createPerson() {

        Person hansi = new Person("Hansi");

        assertThat(hansi.getName()).isEqualTo("Hansi");
        assertThat(hansi.getId()).isGreaterThan(0L);
        //assertThat(hansi.getId()).isEqualTo(1L);

    }
}