import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.*
import androidx.compose.material3.*
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.input.PasswordVisualTransformation
import androidx.compose.ui.unit.dp
import androidx.navigation.NavController
import com.example.littlelemon.R
import com.example.littlelemon.Routes

@Composable
fun LoginScreen(navController: NavController) {
    var username by remember { mutableStateOf("") }
    var password by remember { mutableStateOf("") }

    // UI layout
    Column(
        modifier = Modifier
            .fillMaxSize()
            .padding(16.dp),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        // Displaying logo
        Image(
            painter = painterResource(id = R.drawable.logo),
            contentDescription = "Restaurant Logo",
            modifier = Modifier.padding(bottom = 16.dp)
        )

        // Username TextField
        TextField(
            value = username,
            onValueChange = { username = it },
            label = { Text("Enter Username") },
            modifier = Modifier
                .fillMaxWidth()
                .padding(vertical = 8.dp)
        )

        // Password TextField
        TextField(
            value = password,
            onValueChange = { password = it },
            label = { Text("Enter Password") },
            visualTransformation = PasswordVisualTransformation(),
            modifier = Modifier
                .fillMaxWidth()
                .padding(vertical = 8.dp)
        )

        // Login button
        Button(
            onClick = {
                // Condition for navigating to HomeScreen
                if (username == "admin" && password == "ad123") {
                    navController.navigate(Routes.HomeScreen)
                }
            },
            modifier = Modifier
                .padding(top = 16.dp)
                .fillMaxWidth(),
            colors = ButtonDefaults.buttonColors(
                containerColor = Color(0xFF495E57)
            )
        ) {
            Text("Login", color = Color(0xFFEDEFEE))
        }
    }
}
