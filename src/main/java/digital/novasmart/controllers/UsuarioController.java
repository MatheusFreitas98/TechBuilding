package digital.novasmart.controllers;

import digital.novasmart.entities.Usuario;
import digital.novasmart.repositories.UsuarioRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/usuarios")
public class UsuarioController {

    @Autowired
    private UsuarioRepository usuarioRepository;
    

    @GetMapping("/listar")
    @ResponseBody
    public ResponseEntity<List<Usuario>> findAll () {
        List<Usuario> usuarios = usuarioRepository.findAll();
        if (!usuarios.isEmpty()) {
            return ResponseEntity.ok(usuarios);
        }
        return ResponseEntity.notFound().build();
    }

    @PostMapping("/adicionar")
    @ResponseBody
    public Usuario add(@RequestBody Usuario usuario) {
        return usuarioRepository.save(usuario);
    }
}
