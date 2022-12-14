package com.fika.fika_project.ui.main.explore.drama_info

import android.content.Intent
import android.os.Bundle
import android.view.View
import android.view.ViewGroup
import androidx.appcompat.app.AppCompatActivity
import com.fika.fika_project.R
import com.fika.fika_project.databinding.ActivityLargeMapBinding
import com.fika.fika_project.ui.main.MainActivity
import com.fika.fika_project.ui.main.explore.spotDataList
import net.daum.mf.map.api.MapPOIItem
import net.daum.mf.map.api.MapPoint.mapPointWithGeoCoord
import net.daum.mf.map.api.MapView

class LargeMapActivity : AppCompatActivity() {
    private var _Binding: ActivityLargeMapBinding? = null
    private val binding get() = _Binding!!
    val markerList = ArrayList<MapPOIItem>()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        _Binding = ActivityLargeMapBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val spotlist = intent.getSerializableExtra("spotlist") as ArrayList<spotDataList>
        val position = intent.getStringExtra("position")

        binding.largeMapTitleName.text = position
        binding.myholdBackBtn.setOnClickListener {
            finish()
        }
        binding.myholdHomeBtn.setOnClickListener {
            val intent = Intent(this, MainActivity::class.java)
            intent.addFlags(Intent.FLAG_ACTIVITY_CLEAR_TASK);
            intent.addFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
            startActivity(intent)
            finish()
        }

        val mapView = MapView(this)
        val mapViewContainer = findViewById<View>(R.id.large_map) as ViewGroup

        val marker = MapPOIItem()
        for (i in 0 until spotlist.size) {
            marker.apply {
                itemName = spotlist[i].spotTitle
                mapPoint = mapPointWithGeoCoord(spotlist[i].mapY!!, spotlist[i].mapX!!)
                markerType = MapPOIItem.MarkerType.CustomImage
                if (spotlist[i].type.equals("cafe")) {
                    customImageResourceId = R.drawable.marker_yellow
                } else if (spotlist[i].type.equals("place")) {
                    customImageResourceId = R.drawable.marker_blue
                } else {
                    customImageResourceId = R.drawable.marker_red
                }
                setCustomImageAnchor(0.5f,0.5f)
                isCustomImageAutoscale = false
            }
            mapView.addPOIItem(marker)
            markerList.add(marker)
        }
        mapView.setMapCenterPoint(mapPointWithGeoCoord(spotlist[0].mapY!!, spotlist[0].mapX!!),true)
        mapViewContainer.addView(mapView)

        val fragment = ViewPagerFragment(mapView)
        val bundle = Bundle()
        bundle.putString("position",position)
        bundle.putSerializable("spotlist",spotlist)
        fragment.arguments = bundle
        supportFragmentManager.beginTransaction().replace(R.id.viewpager_container,fragment).commit()

    }
}