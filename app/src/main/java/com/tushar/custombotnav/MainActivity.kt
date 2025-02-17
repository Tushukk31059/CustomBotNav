package com.tushar.custombotnav

import android.os.Bundle
import android.widget.Toast
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.appcompat.app.AppCompatDelegate
import androidx.appcompat.widget.PopupMenu
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import androidx.navigation.fragment.NavHostFragment
import com.tushar.custombotnav.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        AppCompatDelegate.setDefaultNightMode(AppCompatDelegate.MODE_NIGHT_NO)
        binding=ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, 0)
            insets
        }
        val navHost:NavHostFragment=supportFragmentManager.findFragmentById(R.id.fragmentContainerView) as NavHostFragment
        val navController=navHost.navController
        binding.bottomNav.setOnItemSelectedListener {
            if (it.itemId==R.id.first){
                if (navController.currentDestination?.id!=R.id.firstFragment){
                    navController.navigate(R.id.action_secondFragment_to_firstFragment)
                }
            }
            if (it.itemId==R.id.second){
                if (navController.currentDestination?.id!=R.id.secondFragment){
                    navController.navigate(R.id.action_firstFragment_to_secondFragment)
                }
            }
            true
        }
        binding.popupMenu.setOnClickListener{
            val popupmenu=PopupMenu(this,it)
            popupmenu.inflate(R.menu.pop_up_menu)
            popupmenu.show()
            
            popupmenu.setOnMenuItemClickListener {item->
                if (item.itemId==R.id.share){
                    Toast.makeText(this,"Shared",Toast.LENGTH_SHORT).show()
                }
                if (item.itemId==R.id.settings){
                    Toast.makeText(this,"Settings Opened",Toast.LENGTH_SHORT).show()
                }
                if (item.itemId==R.id.delete){
                    Toast.makeText(this,"Deleted",Toast.LENGTH_SHORT).show()
                }
                true
            }

        }
    }
}