package com.marlonluan.mlframework.service;

import com.marlonluan.mlframework.domain.GenericEntity;
import java.util.UUID;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.PathVariable;

@Transactional
public interface CrudService<E extends GenericEntity> {

    @Transactional(readOnly = true)
    Page<E> findAll(final Pageable pageable);

    @Transactional(readOnly = true)
    E findById(final UUID id);

    E save(final E entity);

    E update(final UUID id, final E entity);

    void deleteById(@PathVariable final UUID id);

}
