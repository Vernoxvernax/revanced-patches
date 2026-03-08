package app.revanced.patches.studo.pro

import app.revanced.patcher.*
import app.revanced.patcher.patch.BytecodePatchContext

internal val BytecodePatchContext.settingsIsProPatch by gettingFirstMethodDeclaratively {
    definingClass("Lcom/moshbit/studo/app/Settings;")
    name("isPro")
    returnType("Z")
    parameterTypes()
}
