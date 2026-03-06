package app.revanced.patches.studo.ads

import app.revanced.patcher.patch.bytecodePatch
import app.revanced.util.returnEarly

@Suppress("unused")
val hideAdsPatch = bytecodePatch(
    name = "Hide Ads",
    description = "Removes Advertisements from the app interface.",
) {
    compatibleWith("com.moshbit.studo")

    apply {
        showAdPatch.returnEarly()
    }
}
