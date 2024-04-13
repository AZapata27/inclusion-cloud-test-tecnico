package dev.andreszapata.service;

import dev.andreszapata.dto.InputParams;

public interface RequiredRemainderService {
    int calculateProblem(int x, int y, int n);

    int calculateProblem(InputParams inputParams);
}
