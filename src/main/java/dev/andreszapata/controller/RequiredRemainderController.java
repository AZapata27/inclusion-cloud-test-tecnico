package dev.andreszapata.controller;

import dev.andreszapata.dto.InputParams;
import dev.andreszapata.service.RequiredRemainderService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/v1/reqremainder")
@RequiredArgsConstructor
public class RequiredRemainderController {

    private final RequiredRemainderService requiredRemainderService;

    @GetMapping
    public int calculateProblemGet(@RequestParam("x") int x,
                                   @RequestParam("y") int y,
                                   @RequestParam("n") int n) {


        return requiredRemainderService.calculateProblem(x,y,n);

    }

    @PostMapping
    public int calculateProblemPost(@RequestBody InputParams inputParams) {


        return requiredRemainderService.calculateProblem(inputParams);
    }
}
