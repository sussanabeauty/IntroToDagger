package org.sussanacode.daggerapplication.model

data class Car (val maker: String, val price: Double, val engine: Engine, val color: Color )

data class Engine(val type: String, val model: String, val engineColor: Color)
data class Color(val red: String, val green: String, val blue: String )