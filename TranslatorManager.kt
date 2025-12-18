package com.example.livecaption

import com.google.mlkit.nl.translate.*

class TranslatorManager {

    private val translator by lazy {
        val options = TranslatorOptions.Builder()
            .setSourceLanguage(TranslateLanguage.JAPANESE)
            .setTargetLanguage(TranslateLanguage.ENGLISH)
            .build()

        Translation.getClient(options)
    }

    fun translate(text: String, callback: (String) -> Unit) {
        translator.downloadModelIfNeeded()
            .addOnSuccessListener {
                translator.translate(text)
                    .addOnSuccessListener { callback(it) }
            }
    }
}
