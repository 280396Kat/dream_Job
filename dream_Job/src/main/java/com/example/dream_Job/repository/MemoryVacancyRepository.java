package com.example.dream_Job.repository;

import com.example.dream_Job.model.Vacancy;
import org.springframework.stereotype.Component;

import java.time.LocalDate;
import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Optional;

@Component
public class MemoryVacancyRepository implements VacancyRepository {
    private final Map<Integer, Vacancy> vacancyMap = new HashMap<>();

    private int nextId = 1;

    public MemoryVacancyRepository() {
        save(new Vacancy(0, "Java-разработчик", "1", LocalDate.now()));
        save(new Vacancy(0, "Кассир", "1", LocalDate.now()));
        save(new Vacancy(0, "Бармен", "1", LocalDate.now()));
        save(new Vacancy(0, "Менеджер", "1", LocalDate.now()));

    }

    @Override
    public Vacancy save(Vacancy vacancy) {
        vacancy.setId(nextId++);
        vacancyMap.put(vacancy.getId(), vacancy);
        return vacancy;
    }

    @Override
    public boolean isDeleteById(int id) {
        return vacancyMap.remove(id) != null;
    }

    @Override
    public boolean isUpdate(Vacancy vacancy) {
        return vacancyMap.computeIfPresent(vacancy.getId(), (id, oldVacancy) -> // -> значит сделать действие с параметрами слева
                new Vacancy(oldVacancy.getId(), vacancy.getTitle(), vacancy.getDescription(), vacancy.getDate())) != null;
    }

    @Override
    public Optional<Vacancy> findById(int id) {
        return Optional.ofNullable(vacancyMap.get(id));
    }

    @Override
    public Collection<Vacancy> findAll() {
        return vacancyMap.values();
    }
}
