package id.mondo.myanimals

import android.os.Parcelable
import kotlinx.parcelize.Parcelize

@Parcelize
data class Animals(
    val name: String,
    val description: String,
    val photo: Int
): Parcelable
