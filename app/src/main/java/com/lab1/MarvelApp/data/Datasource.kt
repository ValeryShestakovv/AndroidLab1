package com.lab1.MarvelApp.data

import com.lab1.MarvelApp.R
import com.lab1.MarvelApp.model.Images

class Datasource {
    fun loadImages (): List<Images> {
        return listOf<Images>(
            Images(R.drawable.img1, R.string.name1),
            Images(R.drawable.img2, R.string.name2),
            Images (R.drawable.img3, R.string.name3),
            Images(R.drawable.img4, R.string.name4),
            Images (R.drawable.img5, R.string.name5)
        )
    }
}