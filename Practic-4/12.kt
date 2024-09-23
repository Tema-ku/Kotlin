fun main() {
    println("Введите страну (США, Россия, Япония и т.д.):")
    val country = readLine()?.toLowerCase() // Считываем страну и приводим к нижнему регистру

    val nationality = when (country) {
        "сша" -> "Национальность: американец/американка."
        "россия" -> "Национальность: русский/русская."
        "япония" -> "Национальность: японец/японка."
        "франция" -> "Национальность: француз/француженка."
        "германия" -> "Национальность: немец/немка."
        "италия" -> "Национальность: итальянец/итальянка."
        "канада" -> "Национальность: канадец/канадка."
        "великобритания" -> "Национальность: британец/британка."
        "испания" -> "Национальность: испанец/испанка."
        "китай" -> "Национальность: китаец/китаянка."
        "аргентина" -> "Национальность: аргентинец/аргентинка."
        "мексика" -> "Национальность: мексиканец/мексиканка."
        "марокко" -> "Национальность: марокканец/марокканка."
        "украина" -> "Национальность: украинец/украинка."
        "польша" -> "Национальность: поляк/полячка."
        "швеция" -> "Национальность: швед/шведка."
        "чехия" -> "Национальность: чех/чешка."
        "греция" -> "Национальность: грек/гречанка."
        "египет" -> "Национальность: египтянин/египтянка."
        "куба" -> "Национальность: кубинец/кубинка."
        "таиланд" -> "Национальность: таец/тайка."
        "турция" -> "Национальность: турок/турчанка."
        else -> "Неизвестная страна. Пожалуйста, введите одну из известных стран."
    }

    println(nationality) // Выводим результат
}