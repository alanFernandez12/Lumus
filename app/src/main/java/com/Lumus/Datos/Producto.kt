package com.Lumus.Datos


class Producto {
    private var id : Int?       = null
    var nombre: String? = null
    var insumos: MutableList<String> = mutableListOf()
    var cantidadInsumo: MutableMap<String,Double> = mutableMapOf()
    var Precio: Float?  = null

    constructor()


    override fun equals(other: Any?): Boolean {
        return super.equals(other)
    }

    override fun hashCode(): Int {
        return super.hashCode()
    }

    override fun toString(): String {
        return super.toString()
    }

    fun agregarMedida(insumo:String, cantidad: Double ){
        cantidadInsumo[insumo] = cantidad
    }

}