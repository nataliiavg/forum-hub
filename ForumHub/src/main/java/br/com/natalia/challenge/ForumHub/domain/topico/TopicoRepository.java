package br.com.natalia.challenge.ForumHub.domain.topico;

public interface TopicoRepository extends JpaRepository<Topico, Long> {
    boolean existsByTituloAndMensagem(String titulo, String mensagem);
}
