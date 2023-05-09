package com.example.dream_Job.service;

import com.example.dream_Job.model.Vacancy;
import com.example.dream_Job.repository.VacancyRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;

import java.util.Collection;

@Component
@RequiredArgsConstructor
public class SimpleVacancyService implements VacancyService {
    private final VacancyRepository vacancyRepository;

    @Override
    public Vacancy save(Vacancy vacancy) {
        return vacancyRepository.save(vacancy);
    }

    @Override
    public boolean isDeleteById(int id) {
        return vacancyRepository.isDeleteById(id);
    }

    @Override
    public boolean isUpdate(Vacancy vacancy) {
        return vacancyRepository.isUpdate(vacancy);
    }

    @Override
    public Vacancy getById(int id) {
        return vacancyRepository.findById(id).orElseThrow(() -> new IllegalArgumentException("Вакансия не найдена"));
    }

    @Override
    public Collection<Vacancy> getAll() {
        return vacancyRepository.findAll();
    }
}
