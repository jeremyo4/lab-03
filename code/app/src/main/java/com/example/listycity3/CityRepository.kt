package com.example.listycity3

import androidx.compose.runtime.mutableStateListOf
import androidx.compose.runtime.mutableStateOf

class CityRepository {
    private val _cities = mutableStateListOf(
        City("Edmonton", "AB"),
        City("Vancouver", "BC"),
        City("Toronto", "ON")
    )
    val cities: List<City>
        get() = _cities

    fun addCity(city: City) {
        _cities.add(city)
    }

    fun updateCity(oldCity: City, updatedCity: City) {
        val ide = _cities.indexOf(oldCity)
        if(ide != -1) {
            _cities[ide] = updatedCity
        }
    }
}