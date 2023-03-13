package com.example.demo.service;

import com.fasterxml.jackson.core.JsonProcessingException;

public interface MetricScheduler {
  void schedule() throws JsonProcessingException;
}
