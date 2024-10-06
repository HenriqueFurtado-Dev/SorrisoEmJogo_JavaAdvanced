package br.com.fiap.SorrisoEmJogo.controller;

import br.com.fiap.SorrisoEmJogo.controller.dto.RecompensaDTO;
import br.com.fiap.SorrisoEmJogo.model.Recompensa;
import br.com.fiap.SorrisoEmJogo.service.RecompensaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/recompensas")
public class RecompensaController {

    private final RecompensaService recompensaService;

    @Autowired
    public RecompensaController(RecompensaService recompensaService) {
        this.recompensaService = recompensaService;
    }

    @GetMapping
    public ResponseEntity<List<Recompensa>> getAllRecompensas() {
        return ResponseEntity.ok(recompensaService.getAllRecompensas());
    }

    @GetMapping("/{id}")
    public ResponseEntity<Recompensa> getRecompensaById(@PathVariable Long id) {
        Recompensa recompensa = recompensaService.getRecompensaById(id);
        return recompensa != null ? ResponseEntity.ok(recompensa) : ResponseEntity.notFound().build();
    }

    @PostMapping
    public ResponseEntity<Recompensa> createRecompensa(@RequestBody RecompensaDTO recompensaDTO) {
        Recompensa recompensa = new Recompensa();
        recompensa.setDescricao(recompensaDTO.getDescricao());
        recompensa.setPontosNecessarios(recompensaDTO.getPontosNecessarios());
        return ResponseEntity.ok(recompensaService.createRecompensa(recompensa));
    }

    @PutMapping("/{id}")
    public ResponseEntity<Recompensa> updateRecompensa(@PathVariable Long id, @RequestBody RecompensaDTO recompensaDTO) {
        Recompensa updatedRecompensa = recompensaService.updateRecompensa(id, new Recompensa() {{
            setDescricao(recompensaDTO.getDescricao());
            setPontosNecessarios(recompensaDTO.getPontosNecessarios());
        }});
        return updatedRecompensa != null ? ResponseEntity.ok(updatedRecompensa) : ResponseEntity.notFound().build();
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteRecompensa(@PathVariable Long id) {
        recompensaService.deleteRecompensa(id);
        return ResponseEntity.noContent().build();
    }
}
