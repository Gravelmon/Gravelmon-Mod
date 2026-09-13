package drai.dev.gravelmon.utils

import com.cobblemon.mod.common.pokemon.RenderablePokemon
import java.io.File
import java.util.*

fun getCleanName(name: String): String {
    return name.lowercase(Locale.getDefault()).replace(' ', '_').replace("[^a-zA-Z0-9_]".toRegex(), "").replace("'", "")
        .replace("\\.", "").replace("-", "").replace(" ", "")
}

fun modelWidgetCorrection(par5: RenderablePokemon, original: Float): Float {
    val labels = par5.species.labels
    if (labels.contains("not_modeled")) {
        return 0f
    }
    return original
}

fun isParsableAsInt(str: String): Boolean {
    try {
        str.toInt()
        return true // If parsing is successful, return true
    } catch (e: NumberFormatException) {
        return false // If an exception is thrown, return false
    }
}

fun getFileNameWithoutExtension(path: String) = File(path).nameWithoutExtension
