package dev.brassrat.controller

import dev.brassrat.client.WineOperations
import dev.brassrat.model.Wine
import dev.brassrat.model.WineQuery
import dev.brassrat.service.WineService
import io.micronaut.http.annotation.Body
import io.micronaut.http.annotation.Controller
import io.reactivex.Single
import jakarta.inject.Inject

import javax.validation.Valid

@Controller("/wine")
class WineController implements WineOperations{
    @Inject
    WineService wineService

    @Override
    Single<List<Wine>> list() {
        wineService.list()
    }

    @Override
    Single<Wine> find(WineQuery query) {
        wineService.find(query)
    }

    @Override
    Single<Wine> add(@Body @Valid Wine wine) {
        wineService.add(wine)
    }
}
