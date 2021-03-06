package com.example.formula1tfc.controllers;

import com.example.formula1tfc.controller.ClasificacionController;
import com.example.formula1tfc.models.ClasificacionEscuderia;
import com.example.formula1tfc.repository.ClasificacionEscuderiaRepository;
import com.example.formula1tfc.repository.ClasificacionRepository;
import com.example.formula1tfc.service.uploads.ClasificacionService;
import org.junit.jupiter.api.*;
import org.mockito.InjectMocks;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.test.context.ContextConfiguration;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertAll;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.when;

@SpringBootTest
@ContextConfiguration(classes = {ClasificacionController.class})
@TestMethodOrder(MethodOrderer.OrderAnnotation.class)
@TestInstance(TestInstance.Lifecycle.PER_CLASS)
public class ClasificacionEscuderiaControllerTest {


    @MockBean
    private ClasificacionService service;
    @MockBean
    private ClasificacionEscuderiaRepository repository;
    @MockBean
    private ClasificacionRepository repository2;
    @InjectMocks
    private ClasificacionController controller;

    @Autowired
    public ClasificacionEscuderiaControllerTest(ClasificacionService service, ClasificacionEscuderiaRepository repository) {

        this.repository = repository;
    }



    @Test
    @Order(1)
    void getAllTestMock() {
        ClasificacionEscuderia clasificacionEscuderia = new ClasificacionEscuderia("1","escuderia","puntos");
        List<ClasificacionEscuderia> listaClasificacion = new ArrayList<>();
        listaClasificacion.add(clasificacionEscuderia);
        when(repository.findAll()).thenReturn(listaClasificacion);
        ResponseEntity<List<ClasificacionEscuderia>> response = controller.getAllClasificacionEscuderiasTest();
        List<ClasificacionEscuderia> res = response.getBody();
        System.out.println(repository.findAll());
        System.out.println(controller.getAllClasificacionEscuderiasTest());
        assertAll(
                () -> assertEquals(HttpStatus.OK.value(), response.getStatusCode().value()),
                () -> assertEquals(res.size(), listaClasificacion.size())
        );
    }
}
