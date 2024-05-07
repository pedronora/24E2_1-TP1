package br.edu.infnet.tp1.controller;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/calc")
public class CalcController {
    @GetMapping("/somar")
    public double somarGET(@RequestParam double num1, @RequestParam double num2) {
        return num1 + num2;
    }

    @PostMapping("/somar")
    public double somarPOST(@RequestParam double num1, @RequestParam double num2) {
        return num1 + num2;
    }

    @GetMapping("/subtrair")
    public double subtrairGET(@RequestParam double num1, @RequestParam double num2) {
        return num1 - num2;
    }

    @PostMapping("/subtrair")
    public double subtrairPOST(@RequestParam double num1, @RequestParam double num2) {
        return num1 - num2;
    }

    @GetMapping("/multiplicar")
    public double multiplicarGET(@RequestParam double num1, @RequestParam double num2) {
        return num1 * num2;
    }

    @PostMapping("/multiplicar")
    public double multiplicarPOST(@RequestParam double num1, @RequestParam double num2) {
        return num1 * num2;
    }

    @GetMapping("/dividir")
    public double dividirGET(@RequestParam double num1, @RequestParam double num2) {
        if (num2 == 0) {
            throw new IllegalArgumentException("Impossível dividir por zero");
        }
        return num1 / num2;
    }

    @PostMapping("/dividir")
    public double dividirPOST(@RequestParam double num1, @RequestParam double num2) {
        if (num2 == 0) {
            throw new IllegalArgumentException("Impossível dividir por zero");
        }
        return num1 / num2;
    }

    @GetMapping("/potencia")
    public double potenciaGET(@RequestParam double base, @RequestParam double expoente) {
        return Math.pow(base, expoente);
    }

    @PostMapping("/potencia")
    public double potenciaPOST(@RequestParam double base, @RequestParam double expoente) {
        return Math.pow(base, expoente);
    }
}
