package br.com.springboot.maven_project_crud.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import br.com.springboot.maven_project_crud.model.Usuario;

@Repository 
public interface UsuarioRepository extends JpaRepository<Usuario, Long>{
	

}
