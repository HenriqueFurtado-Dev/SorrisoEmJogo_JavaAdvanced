package br.com.fiap.SorrisoEmJogo.service;

import br.com.fiap.SorrisoEmJogo.controller.dto.UsuarioDTO;
import br.com.fiap.SorrisoEmJogo.model.Usuario;
import br.com.fiap.SorrisoEmJogo.repository.UsuarioRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Date;
import java.util.List;
import java.util.Optional;

@Service
public class UsuarioService {

    private final UsuarioRepository usuarioRepository;

    @Autowired
    public UsuarioService(UsuarioRepository usuarioRepository) {
        this.usuarioRepository = usuarioRepository;
    }

    public List<Usuario> getAllUsuarios() {
        return usuarioRepository.findAll();
    }

    public Usuario saveUsuario(UsuarioDTO usuarioDTO) {
        Usuario usuario = new Usuario();
        usuario.setNome(usuarioDTO.getNome());
        usuario.setEmail(usuarioDTO.getEmail());
        usuario.setSenha(usuarioDTO.getSenha()); // Considere hashing para a senha
        usuario.setDataCadastro(new Date());
        usuario.setPontosRecompensa(usuarioDTO.getPontosRecompensa() != null ? usuarioDTO.getPontosRecompensa() : 0.0f);

        return usuarioRepository.save(usuario);
    }

    public Optional<Usuario> getUsuarioById(Long id) {
        return usuarioRepository.findById(id);
    }

    public Usuario updateUsuario(Long id, UsuarioDTO usuarioDTO) {
        Usuario existingUsuario = usuarioRepository.findById(id)
                .orElseThrow(() -> new RuntimeException("Usuário não encontrado"));

        existingUsuario.setNome(usuarioDTO.getNome());
        existingUsuario.setEmail(usuarioDTO.getEmail());
        existingUsuario.setSenha(usuarioDTO.getSenha()); // Considere hashing para a senha

        if (usuarioDTO.getPontosRecompensa() != null) {
            existingUsuario.setPontosRecompensa(usuarioDTO.getPontosRecompensa());
        }

        return usuarioRepository.save(existingUsuario);
    }

    public void deleteUsuario(Long id) {
        usuarioRepository.deleteById(id);
    }
}
