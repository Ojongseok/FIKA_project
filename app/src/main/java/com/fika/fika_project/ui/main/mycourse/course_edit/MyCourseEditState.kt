package com.fika.fika_project.ui.main.mycourse.course_edit
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.recyclerview.widget.ItemTouchHelper
import com.fika.fika_project.databinding.FragmentMyCourseEditStateBinding
import com.fika.myapplication.MyRecyclerViewAdapter
import com.fika.myapplication.SwipeHelperCallback

class MyCourseEditState : Fragment() {
    private var _binding: FragmentMyCourseEditStateBinding? = null
    private val binding get() = _binding!!
    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View {
        _binding = FragmentMyCourseEditStateBinding.inflate(inflater, container, false)


        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        val items = arrayListOf("안녕 - 조이","안녕 - 조이","안녕 - 조이","안녕 - 조이","안녕 - 조이","안녕 - 조이")

        val recyclerViewAdapter = MyRecyclerViewAdapter(items)
        binding.editStateRecyclerview.adapter = recyclerViewAdapter

        // 리사이클러뷰에 스와이프, 드래그 기능 달기
        val swipeHelperCallback = SwipeHelperCallback(recyclerViewAdapter).apply {
            // 스와이프한 뒤 고정시킬 위치 지정
            setClamp(resources.displayMetrics.widthPixels.toFloat() / 4)    // 1080 / 4 = 270
        }
        ItemTouchHelper(swipeHelperCallback).attachToRecyclerView(binding.editStateRecyclerview)
        // 다른 곳 터치 시 기존 선택했던 뷰 닫기
        binding.editStateRecyclerview.setOnTouchListener { _, _ ->
            swipeHelperCallback.removePreviousClamp(binding.editStateRecyclerview)
            false
        }

    }
    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }
}