package balevuta.com.android_navigation

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.view.MenuItem
import android.widget.Toast
import androidx.navigation.NavController
import androidx.navigation.findNavController
import androidx.navigation.ui.setupActionBarWithNavController
import androidx.navigation.ui.setupWithNavController
import kotlinx.android.synthetic.main.activity_tab.*

class TabActivity : AppCompatActivity() {

    lateinit var navController: NavController

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_tab)

        navController = findNavController(R.id.tab_nav_host_fragment)

        setSupportActionBar(toolbar)

        setupActionBarWithNavController(navController)

        bottom_nav_view.setupWithNavController(navController)
//        bottom_nav_view.setOnNavigationItemSelectedListener(object : BottomNavigationView.OnNavigationItemSelectedListener {
//            override fun onNavigationItemSelected(item: MenuItem): Boolean {
//                val navOptions = NavOptions.Builder().setLaunchSingleTop(true)
//                navController.navigate(item.itemId, null, navOptions.build())
//                return false
//            }
//        })

        val isSkip = intent.extras?.let {
            TabActivityArgs.fromBundle(it).skip
        }

        Toast.makeText(this, "is skip from sign in? $isSkip", Toast.LENGTH_SHORT).show()
    }

    override fun onOptionsItemSelected(item: MenuItem?): Boolean {
        when (item?.itemId) {
            android.R.id.home -> {
                navController.navigateUp()
            }
        }
        return super.onOptionsItemSelected(item)
    }

//    override fun onBackPressed() {
//        if (!navController.navigateUp()) {
//            super.onBackPressed()
//        }
//    }

}