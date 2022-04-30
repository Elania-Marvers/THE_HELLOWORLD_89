fun getAppreciation(grade: Int) = when(grade){
    null -> "Aucune valeur"
    in 0..4 -> "Nulle"
    in 5..9 -> "Mauvais"
    10 -> "La moyenne"
    in 11..15 -> "Bien"
    in 16..20 -> "Très bien"
    else -> Exception("HEY ON TRICHE PAS !")
}