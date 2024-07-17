package br.com.natalia.challenge.ForumHub.domain.topico.validacoes;

import br.com.natalia.challenge.ForumHub.domain.topico.TopicoRepository;
import org.springframework.beans.factory.annotation.Autowired;

public class ValidaId {
    @Autowired
    TopicoRepository repository;
    public void validar(Long id) {
        if (id == null || id <= 0) {
            throw new ValidacaoException("ID do tópico inválido. Forneça um ID válido.");
        }
        var topico=repository.findById(id).orElseThrow(() -> new ValidacaoException("Tópico não encontrado com o ID: " + id));
    }
}
