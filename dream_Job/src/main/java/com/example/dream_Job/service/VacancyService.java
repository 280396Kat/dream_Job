package com.example.dream_Job.service;

import com.example.dream_Job.model.Vacancy;

import java.util.Collection;
import java.util.Optional;

public interface VacancyService {

    Vacancy save(Vacancy vacancy); // сохранить

    boolean isDeleteById(int id); // удалить по id

    boolean isUpdate(Vacancy vacancy); // изменить

    Vacancy getById(int id); // найти по id

    Collection<Vacancy> getAll(); // найти все вакансии
}

