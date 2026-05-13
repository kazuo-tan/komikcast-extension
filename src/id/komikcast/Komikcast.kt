package eu.kanade.tachiyomi.extension.id.komikcast

import eu.kanade.tachiyomi.multisrc.madara.Madara

class Komikcast : Madara(
    "Komikcast",
    "https://v2.komikcast.fit",
    "id",
) {
    override val versionId = 1
}
