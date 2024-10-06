package br.com.fiap.SorrisoEmJogo.service;

import br.com.fiap.SorrisoEmJogo.model.Recompensa;
import br.com.fiap.SorrisoEmJogo.repository.RecompensaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class RecompensaService {

    private final RecompensaRepository recompensaRepository;

    @Autowired
    public RecompensaService(RecompensaRepository recompensaRepository) {
        this.recompensaRepository = recompensaRepository;
    }

    public List<Recompensa> getAllRecompensas() {
        return recompensaRepository.findAll();
    }

    public Recompensa getRecompensaById(Long id) {
        return recompensaRepository.findById(id).orElse(null);
    }

    public Recompensa createRecompensa(Recompensa recompensa) {
        return recompensaRepository.save(recompensa);
    }

    public Recompensa updateRecompensa(Long id, Recompensa recompensa) {
        if (recompensaRepository.existsById(id)) {
            recompensa.setRecompensaId(id);
            return recompensaRepository.save(recompensa);
        }
        return null;
    }

    public void deleteRecompensa(Long id) {
        recompensaRepository.deleteById(id);
    }
}
