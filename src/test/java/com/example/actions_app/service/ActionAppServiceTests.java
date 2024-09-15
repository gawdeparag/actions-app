package com.example.actions_app.service;

import com.example.actions_app.entity.ActionAppEntity;
import com.example.actions_app.repository.ActionAppRepository;
import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.springframework.boot.test.context.SpringBootTest;

import java.time.LocalDate;
import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.when;

@SpringBootTest
public class ActionAppServiceTests {
    @InjectMocks
    ActionAppService actionAppService;

    @Mock
    private ActionAppRepository actionAppRepository;

    @Test
    void testGetData() {
        List<ActionAppEntity> mockData = Arrays.asList(new ActionAppEntity(1L, "John Smith", LocalDate.of(2024, 9, 15), "john@example.com", LocalDate.of(1998, 9, 21)));
        when(actionAppRepository.findAll()).thenReturn(mockData);

        List<ActionAppEntity> data = actionAppService.getData();
        assertEquals(1, data.size());
    }
}
