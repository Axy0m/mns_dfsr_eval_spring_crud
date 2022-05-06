package com.edu.mns.eval.evaluation_dfsr_spring;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.http.MediaType;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;

import static org.hamcrest.collection.IsCollectionWithSize.hasSize;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.jsonPath;

@SpringBootTest
class EvaluationDfsrSpringApplicationTests {

    @Test
    void contextLoads() {
    }

    private MockMvc mvc;

    @Test
    void listeCommande_possede1SeuleCommande() throws Exception {
        mvc.perform(MockMvcRequestBuilders.get("/liste-commande").accept(MediaType.APPLICATION_JSON)
        )
                .andExpect(jsonPath("$", hasSize(1)));
    }

}
