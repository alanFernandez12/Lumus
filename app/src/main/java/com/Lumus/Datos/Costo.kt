package com.Lumus.Datos

class Costo {
    private lateinit var producto : Producto
    var cantidad: Int?         = null
    var costo:Float?           = null
    var costoProducion: Float? = null
    var costoVariable:  Float?  = null
    var costoProducto:  Float?  = null


    constructor()

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (javaClass != other?.javaClass) return false

        other as Costo

        if (producto != other.producto) return false
        if (cantidad != other.cantidad) return false
        if (costo != other.costo) return false
        if (costoProducion != other.costoProducion) return false
        if (costoVariable != other.costoVariable) return false
        return costoProducto == other.costoProducto
    }

    override fun hashCode(): Int {
        var result = producto.hashCode()
        result = 31 * result + (cantidad ?: 0)
        result = 31 * result + (costo?.hashCode() ?: 0)
        result = 31 * result + (costoProducion?.hashCode() ?: 0)
        result = 31 * result + (costoVariable?.hashCode() ?: 0)
        result = 31 * result + (costoProducto?.hashCode() ?: 0)
        return result
    }
}