package foo.starred.odinclient.utils

import com.odtheking.odin.utils.customData
import net.minecraft.world.item.ItemStack
import kotlin.jvm.optionals.getOrNull

inline val ItemStack.nullableID: String?
    get() = customData.getString("id").getOrNull()

inline val ItemStack.nullableUUID: String?
    get() = customData.getString("uuid").getOrNull()
