package com.marlonluan.mlframework.resource;

import com.marlonluan.mlframework.annotations.MlApiCreated;
import com.marlonluan.mlframework.annotations.MlApiNoContent;
import com.marlonluan.mlframework.annotations.MlApiNotFound;
import com.marlonluan.mlframework.annotations.MlApiOk;
import com.marlonluan.mlframework.dto.GenericDTO;
import java.util.UUID;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public interface CrudResource<D extends GenericDTO> {

    @GetMapping
    @MlApiOk
    Page<D> findAll(final Pageable pageable);

    @GetMapping("{id}")
    @MlApiNotFound
    @MlApiOk
    D findById(@PathVariable final UUID id);

    @PostMapping
    @MlApiCreated
    @MlApiOk
    D save(@RequestBody final D dto);

    @PutMapping("{id}")
    @MlApiOk
    D update(@PathVariable final UUID id, @RequestBody final D dto);

    @DeleteMapping("{id}")
    @MlApiNoContent
    void deleteById(@PathVariable final UUID id);

}
