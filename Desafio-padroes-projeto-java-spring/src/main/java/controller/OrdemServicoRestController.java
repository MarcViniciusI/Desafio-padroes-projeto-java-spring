package controller;

import model.OrdemServico;
import service.OrdemServicoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("ordens-servico")
public class OrdemServicoRestController {

    @Autowired
    private OrdemServicoService ordemServicoService;

    @GetMapping
    public ResponseEntity<Iterable<OrdemServico>> buscarTodos() {
        return ResponseEntity.ok(ordemServicoService.buscarTodos());
    }

    @GetMapping("/{id}")
    public ResponseEntity<OrdemServico> buscarPorId(@PathVariable Long id) {
        return ResponseEntity.ok(ordemServicoService.buscarPorId(id));
    }

    @PostMapping
    public ResponseEntity<OrdemServico> inserir(@RequestBody OrdemServico ordemServico) {
        ordemServicoService.inserir(ordemServico);
        return ResponseEntity.ok(ordemServico);
    }

    @PutMapping("/{id}")
    public ResponseEntity<OrdemServico> atualizar(@PathVariable Long id, @RequestBody OrdemServico ordemServico) {
        ordemServicoService.atualizar(id, ordemServico);
        return ResponseEntity.ok(ordemServico);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deletar(@PathVariable Long id) {
        ordemServicoService.deletar(id);
        return ResponseEntity.ok().build();
    }
}
