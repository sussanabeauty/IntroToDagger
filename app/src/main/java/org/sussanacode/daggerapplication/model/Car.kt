package org.sussanacode.daggerapplication.model

data class Car (val brand: String, val price: String, val engine: Engine, val color: Color )

data class Engine(val type: String, val model: String)
data class Color(val red: String, val green: String, val blue: String )