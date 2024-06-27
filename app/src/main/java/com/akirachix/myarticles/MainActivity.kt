package com.akirachix.myarticles

import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import androidx.recyclerview.widget.LinearLayoutManager
import com.akirachix.myarticles.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        binding.tvAuthors.layoutManager = LinearLayoutManager(this)
        displayAuthors()
    }


    fun displayAuthors(){
        val author1 = AthourD("Trevor Noah","08.08.2002","Born A crime")
        val author2 = AthourD("Mumina Abdo","08.08.2002","The One")
        val author3 = AthourD("Joseph Pharmuat","08.08.2002","Beautiful")
        val author4 = AthourD("Olekaelo","08.08.2002","Love At First sight")
        val author5 = AthourD("Chimamanda","08.08.2002","Get inspired")

        val myBlogs = listOf(author1,author2,author3,author4,author5)
         val MyBlogs=MyBlogs(myBlogs)
        binding.tvAuthors.adapter=MyBlogs
    }

}