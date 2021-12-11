package at.htl.testdemo;

import io.agroal.api.AgroalDataSource;
import io.quarkus.test.junit.QuarkusTest;
import org.assertj.db.type.Table;
import org.junit.jupiter.api.Test;

import javax.inject.Inject;
import javax.transaction.Transactional;

import static org.assertj.db.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.*;

@QuarkusTest
class PersonRepositoryTest {

    @Inject
    PersonRepository personRepository;

    @Inject
    AgroalDataSource ds;

    @Test
    @Transactional
    void persistPerson() {

        Table table = new Table(ds, "PERSON");

        Person grisu = new Person("Grisu");
        personRepository.persist(grisu);

        assertThat(table)
                .hasNumberOfRows(1)
                .row(0).value("NAME").isEqualTo("Grisu");

    }
}