package me.carlossaulvillabonapinilla.tallergitgithubapp

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material3.Button
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.Divider
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import me.carlossaulvillabonapinilla.tallergitgithubapp.ui.theme.TallerGitGithubAppTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            MaterialTheme {
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                    ProfileCard()
                }
            }
        }
    }
}
@Composable
fun ProfileCard() {

    Card(
        modifier = Modifier
            .fillMaxWidth()
            .padding(16.dp),
        shape = MaterialTheme.shapes.large,
        elevation = CardDefaults.cardElevation(defaultElevation = 8.dp)
    ) {
        Column(
            modifier = Modifier
                .padding(24.dp),
            horizontalAlignment = Alignment.CenterHorizontally
        ) {

            // Imagen circular
            Image(
                painter = painterResource(id = R.drawable.fotomia),
                contentDescription = "Foto de perfil",
                modifier = Modifier
                    .size(120.dp)
                    .clip(CircleShape)
                    .background(Color.LightGray)
            )

            Spacer(modifier = Modifier.height(16.dp))

            // Nombre en negrita
            Text(
                text = "Carlos Saul Villabona",
                fontSize = 22.sp,
                fontWeight = FontWeight.Bold
            )

            // Rol
            Text(
                text = "Ingeniero de sistemas",
                fontSize = 16.sp,
                color = Color.Gray
            )

            Spacer(modifier = Modifier.height(16.dp))

            Divider()

            Spacer(modifier = Modifier.height(16.dp))

            // Edad
            Text(text = "EDAD", fontWeight = FontWeight.Bold, fontSize = 12.sp)
            Text(text = "22 Años")

            Spacer(modifier = Modifier.height(8.dp))

            // Correo
            Text(text = "CORREO", fontWeight = FontWeight.Bold, fontSize = 12.sp)
            Text(text = "cvillabona353@unab.edu.co", color = MaterialTheme.colorScheme.primary)

            Spacer(modifier = Modifier.height(8.dp))

            // Ciudad
            Text(text = "CIUDAD", fontWeight = FontWeight.Bold, fontSize = 12.sp)
            Text(text = "Bucaramanga")

            Spacer(modifier = Modifier.height(16.dp))

            Divider()

            Spacer(modifier = Modifier.height(16.dp))

            // Sección descriptiva
            Text(
                text = "SOBRE MI MATERIA FAVORITA",
                fontWeight = FontWeight.Bold,
                fontSize = 12.sp
            )

            Spacer(modifier = Modifier.height(8.dp))

            Text(
                text = "Mi materia preferida de este semestre es esta desarrollo de aplicaciones moviles, pero me gustaria mucho aprender sobre siberseguridad es un tema que me apasiona demasiado y me veo en un futuro ejerciendo como ingeniero en ciberseguridad",
                textAlign = TextAlign.Center
            )

            Spacer(modifier = Modifier.height(20.dp))

            // Botón inferior
            Button(
                onClick = { /* Acción */ },
                modifier = Modifier.fillMaxWidth()
            ) {
                Text("Contactar")
            }
        }
    }
}