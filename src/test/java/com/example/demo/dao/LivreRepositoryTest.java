package com.example.demo.dao;

import com.example.demo.domain.Livre;
import org.junit.Before;
import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.mockito.*;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.*;

@RunWith(SpringRunner.class)
@SpringBootTest
class LivreRepositoryTest {

    @InjectMocks
    private Livre livre;

    @Mock
    private LivreRepository livreRepository;

    @Before
    public void init(){
        MockitoAnnotations.initMocks(this);
    }

    @Test
    void findByNomTest() {
        livre = new Livre(666l, "Livre test", "Unit", "Ceci est une description", false);

        when(livreRepository.findByNom(livre.getNom())).thenReturn(livre);

        Livre livreFound = livreRepository.findByNom("Livre test");
        verify(livreRepository).findByNom("Livre test");
        assertNotNull(livreFound);
        assertEquals("Unit", livreFound.getAuteur());
    }
}
