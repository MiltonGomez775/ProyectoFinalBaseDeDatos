package co.edu.uniquindio.proyecto.service;

import co.edu.uniquindio.proyecto.dto.BancoDePreguntasDTO;

import java.util.List;

public interface BancoDePreguntasService {
    BancoDePreguntasDTO crearBanco(BancoDePreguntasDTO bancoDTO);

    List<BancoDePreguntasDTO> listarBancos();

    BancoDePreguntasDTO obtenerBancoPorId(Integer id);
}