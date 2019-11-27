package br.usjt.tempo.tempoprev.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import br.usjt.tempo.tempoprev.model.Usuario;



public interface UsuarioRepository extends JpaRepository<Usuario, Long> {

    public Usuario findOneByLoginAndSenha (String login, String senha);

}
