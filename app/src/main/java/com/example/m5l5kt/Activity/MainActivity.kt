package com.example.m5l5kt.Activity

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.m5l5kt.Adapter.BraveAdapter
import com.example.m5l5kt.Adapter.FavouriteAdapter
import com.example.m5l5kt.Adapter.FreeAdapter
import com.example.m5l5kt.Model.Brave
import com.example.m5l5kt.Model.Favourite
import com.example.m5l5kt.Model.Free
import com.example.m5l5kt.R

class MainActivity : AppCompatActivity() {
    lateinit var recyclerView: RecyclerView
    lateinit var recyclerView1: RecyclerView
    lateinit var recyclerView2: RecyclerView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        initViews()
        initViews1()
        initViews2()
    }

    fun initViews(){
        recyclerView = findViewById(R.id.recyclerView)
        val manager = LinearLayoutManager(this,LinearLayoutManager.HORIZONTAL,false)
        recyclerView.setLayoutManager(manager)

        refreshAdapter(getAllItems())
    }

    fun initViews1(){
        recyclerView1 = findViewById(R.id.recyclerView1)
        val manager = LinearLayoutManager(this,LinearLayoutManager.HORIZONTAL,false)
        recyclerView1.setLayoutManager(manager)

        refreshAdapter1(getAllItems1())
    }
    fun initViews2(){
        recyclerView2 = findViewById(R.id.recyclerView2)
        recyclerView2.setLayoutManager(GridLayoutManager(this,3))

        refreshAdapter2(getAllItems2())
    }

    fun refreshAdapter(items:ArrayList<Favourite>){
        val adapter = FavouriteAdapter(this,items)
        recyclerView.adapter = adapter
    }

    fun refreshAdapter1(items:ArrayList<Free>){
        val adapter = FreeAdapter(this,items)
        recyclerView1.adapter = adapter
    }
    fun refreshAdapter2(items:ArrayList<Brave>){
        val adapter = BraveAdapter(this,items)
        recyclerView2.adapter = adapter
    }

    fun getAllItems():ArrayList<Favourite>{
        var items:ArrayList<Favourite> = ArrayList()

        items.add(Favourite("Apple Watch", R.drawable.img))
        items.add(Favourite("Rolex", R.drawable.img_8))
        items.add(Favourite("Tissot", R.drawable.img_9))
        items.add(Favourite("Pandora", R.drawable.img_10))


        return items
    }
    fun getAllItems1():ArrayList<Free>{
        var items:ArrayList<Free> = ArrayList()

        items.add(Free(R.drawable.img_1))
        items.add(Free(R.drawable.img_1))
        items.add(Free(R.drawable.img_1))
        items.add(Free(R.drawable.img_1))

        return items
    }
    fun getAllItems2():ArrayList<Brave>{
        var items:ArrayList<Brave> = ArrayList()

        items.add(Brave("Blankets", R.drawable.img_2))
        items.add(Brave("Heaters", R.drawable.img_3))
        items.add(Brave("Thermostats", R.drawable.img_4))
        items.add(Brave("Generators", R.drawable.img_5))
        items.add(Brave("Snowblowers", R.drawable.img_6))
        items.add(Brave("Snow Shovels", R.drawable.img_7))

        return items
    }
}