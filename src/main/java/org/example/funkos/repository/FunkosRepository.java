package org.example.funkos.repository;

import org.example.funkos.model.Funko;

import java.math.BigDecimal;
import java.util.List;
import java.util.Map;
import java.util.Optional;

public interface FunkosRepository {
    List<Funko> buscar(Optional<String> categoria, Optional<String> nombre,
                       Optional<BigDecimal> precioMax);
    Optional<Funko>   findById(Long id);
    boolean           existsByNombre(String nombre);
    Funko             save(Funko funko);
    void              update(Funko funko);
    boolean           deleteById(Long id);
    Map<String, Long> contarPorCategoria();
}
