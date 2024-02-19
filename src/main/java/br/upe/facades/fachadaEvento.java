package br.upe.facades;

import br.upe.models.Evento;
import br.upe.repositories.EventosRepositorio;

public class FachadaEvento {
    public void criarNovoEvento(String nomeE, String horaC, String horaS, String esta) {
        EventosRepositorio eventosRepositorio = new EventosRepositorio();

        int id = EventosRepositorio.ultimoID();

        Evento evento = new Evento(id, nomeE, horaC, horaS, esta);

        eventosRepositorio.criarEventos(evento);
    }
}
