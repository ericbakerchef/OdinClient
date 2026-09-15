package foo.starred.odinclient.features.impl.floor7

import com.odtheking.odin.clickgui.settings.impl.BooleanSetting
import com.odtheking.odin.features.Module
import foo.starred.odinclient.api.category.OdinClientCategory

object QueueTerms : Module(
    name = "Queue Terms",
    description = "Queues clicks in terminals to ensure every click is registered (only works in custom term gui).",
    category = OdinClientCategory.CHEATS
) {
    private val hover by BooleanSetting(
        "HOVER HERE!!!",
        true,
        "Please do not use this module, look into using another mod."
    )
}
