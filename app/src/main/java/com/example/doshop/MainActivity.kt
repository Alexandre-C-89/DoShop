package com.example.doshop

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.ui.Modifier
import com.example.doshop.theme.DoShopTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            DoShopTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                    //DoShopNavHost()
                }
            }
        }
    }
}

/**
 * Application de prise de note que ce soit pour les courses, les tâches quotidienne ou autre .
 * Je veux pouvoir créer notes
 * Je veux pouvoir les supprimer
 * Je veux pouvoir les modifier
 *
 * A afficher sur une note :
 * - titre
 * - la personne qui a créé cette note
 * - une description (selon l'envie)
 */