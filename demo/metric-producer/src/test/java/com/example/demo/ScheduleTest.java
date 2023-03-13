package com.example.demo;

import com.example.demo.service.MetricScheduler;
import com.fasterxml.jackson.core.JsonProcessingException;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit.jupiter.SpringExtension;


@SpringBootTest
@ExtendWith(SpringExtension.class)
public class ScheduleTest {
    @Autowired
    private MetricScheduler metricScheduler;
    @Test
    public void testSchedule() {
        try {
            metricScheduler.schedule();
            System.out.println("Message sent successfully");
        } catch (JsonProcessingException e) {
            throw new RuntimeException(e);
        }
    }
}
