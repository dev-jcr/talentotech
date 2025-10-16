package com.example.demo.service;

import java.util.List;
import java.util.Random;

import org.springframework.stereotype.Service;

import com.example.demo.model.Chiste;
import com.example.demo.repository.ChisteRepository;

@Service
public class ChisteService {
    ChisteRepository repo;

    public ChisteService(ChisteRepository repo) {
        this.repo = repo;
    }

    public List<Chiste> retornarChistes() {
        return repo.findAll();
    }

    public void agregarChiste(Chiste chiste) {
        repo.save(chiste);
    }

    public void eliminarChiste(int id) {
        repo.deleteById(id);
    }

    public void actualizarChiste(int id, Chiste chiste) {
        Chiste chisteModificado = repo.findById(id).get();
        chisteModificado.setTexto(chiste.getTexto());
        chisteModificado.setAutor(chiste.getAutor());
        repo.save(chisteModificado);
    }

    public Chiste obtenerChiste(int id) {
        return repo.findById(id).get();
    }

    public Chiste obtenerChisteAleatorio() {
        List<Chiste> todosLosChistes = repo.findAll();
        Random rand = new Random();
        int indiceAleatorio = rand.nextInt(todosLosChistes.size());
        return todosLosChistes.get(indiceAleatorio);
    }

}
