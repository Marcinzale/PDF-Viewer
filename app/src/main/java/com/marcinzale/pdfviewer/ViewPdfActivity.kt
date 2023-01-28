package com.marcinzale.pdfviewer

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import com.github.barteksc.pdfviewer.PDFView

class ViewPdfActivity : AppCompatActivity() {

    lateinit var pdfView: PDFView
    private val PDF_SELECTION_CODE = 100

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_view_pdf)

        pdfView = findViewById(R.id.pdfView)
        selectPdfFromStorage()
    }

    private fun selectPdfFromStorage() {
        Toast.makeText( this@ViewPdfActivity, "Wybierz plik Pdf", Toast.LENGTH_LONG).show()
        val browseStorage = Intent(Intent.ACTION_GET_CONTENT)
        browseStorage.type = "application/pdf"
        browseStorage.addCategory(Intent.CATEGORY_OPENABLE)
        startActivityForResult(Intent.createChooser(browseStorage, "Wybierz Pdf"), PDF_SELECTION_CODE)
    }
}