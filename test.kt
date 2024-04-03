fun main(){
    var nom = "Reda"
    var bonjour_nom = Bonjour(nom)
    println(bonjour_nom)
    println(nom)
}

fun Bonjour(nom:String):String{
    nom = "Bonjour" + nom
    return nom
}
