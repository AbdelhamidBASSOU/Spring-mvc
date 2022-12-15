package com.mvc.demo.ressources;

import com.mvc.demo.entity.AppelOffre;
import com.mvc.demo.entity.Status;
import com.mvc.demo.service.AppelOffreService;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import static org.assertj.core.api.Assertions.assertThat;

@SpringBootTest
class AppelOffreRestTest {
@Autowired
AppelOffreService aoService;
@Test
    void save() throws Exception {
    AppelOffre ao = new AppelOffre("ref1", "ref1", Status.close, 13);
    AppelOffre result = aoService.save(ao);
    Assertions.assertSame(ao,result);
    }
}