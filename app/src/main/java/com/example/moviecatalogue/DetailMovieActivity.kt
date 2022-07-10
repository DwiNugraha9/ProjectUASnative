package com.example.moviecatalogue

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.bumptech.glide.Glide
import kotlinx.android.synthetic.main.activity_detail_movie.*

class DetailMovieActivity : AppCompatActivity() {
    companion object {
        const val EXTRA_DATA = "extra_data"
    }

    var movies: Movie? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_detail_movie)

        movies = intent.getParcelableExtra(EXTRA_DATA)

        movie_title.text = movies?.title
        movie_rating.text = movies?.popularity.toString()
        movie_status.text = movies?.vote_average.toString()
        movie_overview.text = movies?.overview

        Glide.with(img_poster).load(IMAGE_BASE + movies!!.poster_path).into(img_poster)
    }
}