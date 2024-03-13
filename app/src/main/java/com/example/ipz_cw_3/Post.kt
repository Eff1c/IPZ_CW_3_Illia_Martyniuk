package com.example.ipz_cw_3

class Post(val day: Int, val title: String = "Title $day", val description: String = "This is description $day.") {
    val randomImageRes = listOf(
        R.drawable.catherine_falls,
        R.drawable.park,
        R.drawable.local,
        R.drawable.dolphin_nose,
        R.drawable.cq5dam_web_756_756,
    ).random()
}
