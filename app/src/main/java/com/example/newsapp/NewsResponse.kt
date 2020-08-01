package com.example.newsapp

data class NewsResponse(
	val totalResults: Int,
	val articles: List<Article>,
	val status: String
)
