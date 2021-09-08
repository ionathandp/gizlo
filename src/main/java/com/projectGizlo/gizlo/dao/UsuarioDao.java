package com.projectGizlo.gizlo.dao;

import com.projectGizlo.gizlo.modelos.Usuario;

import java.util.List;

public interface UsuarioDao {

    List<Usuario> getUsuarios();

    void eliminar(Long id);


    void registrar(Usuario user);

    Usuario obtenerUsuarioPorCredenciales(Usuario usuario);
}
