package dev.brassrat.client

import dev.brassrat.model.WineQuery
import dev.brassrat.model.Wine
import io.micronaut.http.annotation.Body
import io.micronaut.http.annotation.Get
import io.micronaut.http.annotation.Post
import io.reactivex.Single

import javax.validation.Valid

/**
 * Operations to perform on the Wine database
 */
interface WineOperations {
    @Get("/list")
    Single<List<Wine>> list()

    @Get("/find{?query*}")
    Single<Wine> find(WineQuery query)

    @Post("/add")
    Single<Wine> add(@Body @Valid Wine wine)
}