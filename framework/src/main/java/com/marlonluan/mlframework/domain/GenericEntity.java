package com.marlonluan.mlframework.domain;

import java.io.Serializable;
import java.util.UUID;

@FunctionalInterface
public interface GenericEntity extends Serializable {

    void setId(UUID id);

}
