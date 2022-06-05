package dev.brassrat.model

import io.micronaut.core.annotation.Nullable

import java.time.LocalDate

class WineQuery {
    @Nullable
    String region
    @Nullable
    String vineyard
    @Nullable
    String wineMaker
    @Nullable
    Integer year
    @Nullable
    LocalDate dateTasted

    WineQuery(){}

    static class Builder<T extends Builder<T>>{
        Map fields
        Builder(){
            this.fields = [:]
        }

        T withRegion(String region){
            fields.region = region
            this as T
        }

        T withVineyard(String vineyard){
            fields.vineyard = vineyard
            this as T
        }

        T withWineMaker(String wineMaker){
            fields.wineMaker = wineMaker
            this as T
        }

        T withYear(Integer year){
            fields.year = year
            this as T
        }

        T withDateTasted(LocalDate dateTasted){
            fields.dateTasted = dateTasted
            this as T
        }
    }
}
