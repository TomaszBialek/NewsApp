package com.example.newsapp.models

import com.example.newsapp.models.Article

data class NewsResponse(
    val totalResults: Int,
    val articles: List<Article>,
    val status: String
)
