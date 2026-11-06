package com.premyer.studio

import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyRow
import androidx.compose.foundation.lazy.items
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.NavigationBar
import androidx.compose.material3.NavigationBarItem
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.material3.TopAppBar
import androidx.compose.material3.TopAppBarDefaults
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableIntStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.premyer.studio.ui.theme.Premyer18StudioTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: android.os.Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            Premyer18StudioTheme {
                StudioApp()
            }
        }
    }
}

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun StudioApp() {
    val tabs = listOf("Home", "AI Studio", "Beachwear", "Gallery", "Profile")
    var selectedTab by remember { mutableIntStateOf(0) }

    Scaffold(
        topBar = {
            TopAppBar(
                title = {
                    Text(
                        text = "Premyer 18+ Studio",
                        style = MaterialTheme.typography.titleLarge,
                        color = Color.White
                    )
                },
                colors = TopAppBarDefaults.topAppBarColors(
                    containerColor = Color(0xFF111111),
                    titleContentColor = Color.White
                )
            )
        },
        bottomBar = {
            NavigationBar(containerColor = Color(0xFF111111)) {
                tabs.forEachIndexed { index, title ->
                    NavigationBarItem(
                        selected = selectedTab == index,
                        onClick = { selectedTab = index },
                        icon = {},
                        label = { Text(title, color = if (selectedTab == index) Color(0xFF7CFFB2) else Color.White) }
                    )
                }
            }
        }
    ) { paddingValues ->
        Surface(
            modifier = Modifier
                .fillMaxSize()
                .background(
                    Brush.verticalGradient(
                        colors = listOf(
                            Color(0xFF0A0A0A),
                            Color(0xFF121212),
                            Color(0xFF171717)
                        )
                    )
                )
                .padding(paddingValues),
            color = Color.Transparent
        ) {
            when (selectedTab) {
                0 -> HomeScreen()
                1 -> StudioScreen()
                2 -> BeachwearScreen()
                3 -> GalleryScreen()
                else -> ProfileScreen()
            }
        }
    }
}

@Composable
private fun HomeScreen() {
    Column(
        modifier = Modifier
            .fillMaxSize()
            .padding(20.dp),
        verticalArrangement = Arrangement.spacedBy(18.dp)
    ) {
        Text(
            text = "Luxury creative studio",
            style = MaterialTheme.typography.headlineMedium,
            color = Color.White,
            fontWeight = FontWeight.Bold
        )

        Text(
            text = "Design prompts, AI workflows, and exclusive beachwear concepts in one place.",
            style = MaterialTheme.typography.bodyLarge,
            color = Color(0xFFB9B9B9)
        )

        PromoCard(
            title = "Daily creative brief",
            text = "Generate high-quality concepts for editorial shoots and premium lifestyle content.",
            accent = Color(0xFF6BF1A3)
        )

        PromoCard(
            title = "Private workspace",
            text = "Keep personal media securely organized, previewed, and managed inside your account.",
            accent = Color(0xFF6FC8FF)
        )
    }
}

@Composable
private fun StudioScreen() {
    Column(
        modifier = Modifier
            .fillMaxSize()
            .padding(20.dp),
        verticalArrangement = Arrangement.spacedBy(18.dp)
    ) {
        Text(
            text = "AI Studio",
            style = MaterialTheme.typography.headlineMedium,
            color = Color.White,
            fontWeight = FontWeight.Bold
        )

        Card(
            modifier = Modifier.fillMaxWidth(),
            colors = CardDefaults.cardColors(containerColor = Color(0xFF161616)),
            shape = RoundedCornerShape(20.dp)
        ) {
            Column(
                modifier = Modifier.padding(20.dp),
                verticalArrangement = Arrangement.spacedBy(12.dp)
            ) {
                Text(
                    text = "Prompt input",
                    style = MaterialTheme.typography.titleLarge,
                    color = Color.White
                )
                Text(
                    text = "Create a refined generation request for style, tone, lighting, framing, and brand direction.",
                    color = Color(0xFFB7B7B7)
                )
                Button(
                    onClick = { },
                    colors = ButtonDefaults.buttonColors(containerColor = Color(0xFF7CFFB2))
                ) {
                    Text(text = "Generate concept", color = Color(0xFF101010))
                }
            }
        }
    }
}

@Composable
private fun BeachwearScreen() {
    Column(
        modifier = Modifier
            .fillMaxSize()
            .padding(20.dp),
        verticalArrangement = Arrangement.spacedBy(18.dp)
    ) {
        Text(
            text = "Beachwear",
            style = MaterialTheme.typography.headlineMedium,
            color = Color.White,
            fontWeight = FontWeight.Bold
        )

        val styles = listOf("Resort edit", "Sunset glow", "Minimal luxury", "Yacht mood")
        LazyRow(horizontalArrangement = Arrangement.spacedBy(12.dp)) {
            items(styles) { style ->
                Chip(label = style)
            }
        }

        PromoCard(
            title = "Collection board",
            text = "Build lookbooks, styling references, and premium outfit narratives with sleek visual prompts.",
            accent = Color(0xFFF7C96B)
        )
    }
}

@Composable
private fun GalleryScreen() {
    Column(
        modifier = Modifier
            .fillMaxSize()
            .padding(20.dp),
        verticalArrangement = Arrangement.spacedBy(18.dp)
    ) {
        Text(
            text = "Gallery",
            style = MaterialTheme.typography.headlineMedium,
            color = Color.White,
            fontWeight = FontWeight.Bold
        )

        val items = listOf("Latest", "Favorites", "Private", "Shared")
        val color = listOf(Color(0xFF7CFFB2), Color(0xFF6FC8FF), Color(0xFFB18CFF), Color(0xFFF5B4FF))

        items.forEachIndexed { index, title ->
            Box(
                modifier = Modifier
                    .fillMaxWidth()
                    .height(90.dp)
                    .background(color[index], RoundedCornerShape(20.dp)),
                contentAlignment = Alignment.Center
            ) {
                Text(title, color = Color(0xFF111111), fontWeight = FontWeight.Bold, fontSize = 18.sp)
            }
        }
    }
}

@Composable
private fun ProfileScreen() {
    Column(
        modifier = Modifier
            .fillMaxSize()
            .padding(20.dp),
        verticalArrangement = Arrangement.spacedBy(18.dp)
    ) {
        Text(
            text = "Profile",
            style = MaterialTheme.typography.headlineMedium,
            color = Color.White,
            fontWeight = FontWeight.Bold
        )

        PromoCard(
            title = "Account overview",
            text = "Privacy controls, media library access, and content retention management are ready for extension.",
            accent = Color(0xFF9DF7B8)
        )
    }
}

@Composable
private fun PromoCard(title: String, text: String, accent: Color) {
    Card(
        modifier = Modifier.fillMaxWidth(),
        colors = CardDefaults.cardColors(containerColor = Color(0xFF181818)),
        shape = RoundedCornerShape(20.dp)
    ) {
        Column(
            modifier = Modifier.padding(18.dp),
            verticalArrangement = Arrangement.spacedBy(10.dp)
        ) {
            Box(
                modifier = Modifier
                    .height(6.dp)
                    .fillMaxWidth()
                    .background(accent, RoundedCornerShape(100.dp))
            )
            Text(text = title, style = MaterialTheme.typography.titleLarge, color = Color.White)
            Text(text = text, color = Color(0xFFB9B9B9))
        }
    }
}

@Composable
private fun Chip(label: String) {
    Box(
        modifier = Modifier
            .background(Color(0xFF1A1A1A), RoundedCornerShape(999.dp))
            .padding(horizontal = 16.dp, vertical = 10.dp)
    ) {
        Text(text = label, color = Color.White)
    }
}
