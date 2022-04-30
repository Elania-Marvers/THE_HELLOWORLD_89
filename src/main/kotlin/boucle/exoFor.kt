fun sanslese(texte: String): String {
    var sortie = ""
    for (c in texte) if (c != 'e' && c != 'E') sortie += c
    return sortie
}

fun nba(texte: String): Int {
    var sortie = 0
    for (c in texte) if (c != 'a' && c != 'A') sortie++
    return sortie
}

fun reverseString(str: String) = str.reversed()


fun nbMaj(texte: String): Int {
    var sortie = 0
    for (c in texte) if (c in 'A'..'Z') sortie++
    return sortie
}

fun sansVoyelles(texte: String): String {
    var sortie = ""
    for (c in texte) if (c != 'e' && c != 'a' && c != 'i' && c != 'o' && c != 'u' && c != 'y') sortie += c
    return sortie
}

fun maxChar(texte: String): Char {
    var sortie: Char = texte[0]
    for (c in texte) if (c > sortie) sortie = c
    return sortie
}


fun trim(texte: String): String {
    while (texte.startsWith(' ')) texte.drop(1)
    while (texte.endsWith(' ')) texte.dropLast(1)
    return texte
}

fun noSpace(texte: String): String {
    var sortie = ""
    for (c in texte) if (c == ' ') sortie += '_' else sortie += c
    return sortie
}