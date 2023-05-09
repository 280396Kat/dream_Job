package com.example.dream_Job.repository;

import com.example.dream_Job.model.Vacancy;

import java.util.Collection;
import java.util.Optional;

public interface VacancyRepository {

    Vacancy save(Vacancy vacancy); // сохранить

    boolean isDeleteById(int id); // удалить по id

    boolean isUpdate(Vacancy vacancy); // изменить

    Optional<Vacancy> findById(int id); // найти по id

    Collection<Vacancy> findAll(); // найти все вакансии
}
