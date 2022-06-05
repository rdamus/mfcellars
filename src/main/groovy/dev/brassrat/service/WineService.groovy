package dev.brassrat.service

import dev.brassrat.client.WineOperations
import dev.brassrat.model.Wine
import dev.brassrat.model.WineQuery
import io.micronaut.http.annotation.Body
import io.reactivex.Single
import jakarta.inject.Singleton

import javax.validation.Valid

@Singleton
class WineService implements WineOperations{
    @Override
    Single<List<Wine>> list() {
        return null
    }

    @Override
    Single<Wine> find(WineQuery query) {
        return null
    }

    @Override
    Single<Wine> add(@Body @Valid Wine wine) {
        return null
    }
}
