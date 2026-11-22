package br.org.edu.ifrn.lojacarrovendasapi.controllers;

import br.org.edu.ifrn.lojacarrovendasapi.models.Venda;
import br.org.edu.ifrn.lojacarrovendasapi.repositories.VendaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/vendas")
@CrossOrigin(origins = "*")
public class VendasController {

    @Autowired
    private VendaRepository vendaRepository;

    @PostMapping("/realizar")
    public ResponseEntity<Venda> realizarVenda(@RequestBody Venda venda) {

        Venda vendaSalva = vendaRepository.save(venda);
        return ResponseEntity.ok(vendaSalva);
    }
}