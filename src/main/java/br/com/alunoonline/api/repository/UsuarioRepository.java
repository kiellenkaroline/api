package br.com.alunoonline.api.repository;

import br.com.alunoonline.api.model.Usuario;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.security.core.userdetails.UserDetails;

public interface UsuarioRepository
        extends JpaRepository<Usuario, Long> {
    UserDetails findByLogin(String login);
}
