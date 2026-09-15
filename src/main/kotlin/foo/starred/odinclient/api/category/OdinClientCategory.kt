package foo.starred.odinclient.api.category

import com.odtheking.odin.features.Category

object OdinClientCategory {
    @JvmField
    //~ if >= 26.2 '"Cheats"' -> '"Cheats", 860, 10'
    val CHEATS = Category.custom("Cheats")
}
