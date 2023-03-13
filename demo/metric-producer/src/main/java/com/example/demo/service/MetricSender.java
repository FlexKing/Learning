package com.example.demo.service;

import com.example.demo.dto.MetricDto;
import com.fasterxml.jackson.core.JsonProcessingException;

public interface MetricSender {
    void sendMessage() throws JsonProcessingException;
}
