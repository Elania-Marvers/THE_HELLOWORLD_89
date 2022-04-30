fun sanslese(texte: String): String {
    var sortie = ""
    for (c in texte) if (c != 'e' && c != 'E') sortie += c
    return sortie
}