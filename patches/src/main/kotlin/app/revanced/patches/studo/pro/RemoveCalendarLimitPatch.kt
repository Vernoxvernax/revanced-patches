package app.revanced.patches.studo.pro

import app.revanced.patcher.extensions.addInstructions
import app.revanced.patcher.patch.bytecodePatch

@Suppress("unused")
val removeCalendarRestrictionsPatch = bytecodePatch(
    name = "Remove calendar restriction",
    description = "Removes the 14-day calendar restriction.",
) {
    compatibleWith("com.moshbit.studo"("4.72.2"))

    apply {
        settingsIsProPatch.addInstructions(
            0,
            """
                const/4 v0, 0x1
                return v0
            """.trimIndent()
        )
    }
}
