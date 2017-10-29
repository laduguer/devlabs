package com.realdolmen.repository.storage.impl;

import com.realdolmen.model.DevlabsEntity;
import com.realdolmen.repository.storage.api.StorageResult;

import java.util.UUID;

public class TestEntity implements DevlabsEntity {

    private UUID id;

    TestEntity() {
        id = UUID.randomUUID();
    }

    @Override
    public UUID getId() {
        return id;
    }

    @Override
    public StorageResult save() {
        return null;
    }

    @Override
    public StorageResult delete() {
        return null;
    }
}
