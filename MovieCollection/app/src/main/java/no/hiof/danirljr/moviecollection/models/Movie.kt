package no.hiof.danirljr.moviecollection.models

import android.graphics.drawable.Icon
import android.media.Image
import androidx.compose.ui.graphics.painter.Painter
import androidx.compose.ui.graphics.vector.ImageVector

data class Movie(val coverImage: Painter, val name: String, val relaseYear: Int, val Time: Double,
                 val icon: ImageVector
)
