package com.lab1.MarvelApp.model

import androidx.annotation.DrawableRes
import androidx.annotation.StringRes

data class Images (@DrawableRes val imageResourceId: Int,
                   @StringRes val stringResourceId: Int, ) {
}