package alex.emulador20230431renealejandro

import android.os.Bundle
import com.google.android.material.bottomnavigation.BottomNavigationView
import androidx.appcompat.app.AppCompatActivity
import androidx.navigation.findNavController
import androidx.navigation.ui.AppBarConfiguration
import androidx.navigation.ui.setupActionBarWithNavController
import androidx.navigation.ui.setupWithNavController
import alex.emulador20230431renealejandro.databinding.ActivityContactanosBinding
import android.widget.Button
import androidx.appcompat.widget.SearchView.OnCloseListener

class Contactanos : AppCompatActivity() {

    private lateinit var binding: ActivityContactanosBinding


    lateinit var btncorreo: Button


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivityContactanosBinding.inflate(layoutInflater)
        setContentView(binding.root)

        btncorreo = findViewById(R.id.btncorreo)

        btncorreo.setOnClickListener {
            btncorreo.text = "20230431@ricaldone.edu.sv"
        }

        val navView: BottomNavigationView = binding.navView

        val navController = findNavController(R.id.nav_host_fragment_activity_contactanos)
        // Passing each menu ID as a set of Ids because each
        // menu should be considered as top level destinations.
        val appBarConfiguration = AppBarConfiguration(
            setOf(
                R.id.navigation_home, R.id.navigation_dashboard, R.id.navigation_notifications
            )
        )
        setupActionBarWithNavController(navController, appBarConfiguration)
        navView.setupWithNavController(navController)


    }


}