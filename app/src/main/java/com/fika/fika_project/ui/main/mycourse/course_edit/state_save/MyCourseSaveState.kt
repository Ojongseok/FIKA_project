package com.fika.fika_project.ui.main.mycourse.course_edit
import android.content.Context
import android.os.Bundle
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.fika.fika_project.R
import com.fika.fika_project.databinding.FragmentMyCourseSaveStateBinding
import com.fika.fika_project.ui.main.mycourse.course_edit.state_edit.MyCourseEditState
import com.fika.fika_project.ui.main.mycourse.course_edit.state_save.CourseViewResponse
import com.fika.fika_project.ui.main.mycourse.course_edit.state_save.CourseViewService
import com.fika.fika_project.ui.main.mycourse.course_edit.state_save.CourseViewView
import com.fika.fika_project.ui.main.mycourse.course_edit.state_save.spotList
import kotlinx.android.synthetic.main.activity_mycourse_view.*
import kotlinx.android.synthetic.main.drama_info_course_item.view.*
import kotlinx.android.synthetic.main.mycourse_save_state_list.view.*
import kotlinx.android.synthetic.main.mycourse_view_item_list.view.*
import kotlinx.android.synthetic.main.mycourse_view_item_list.view.course_item_number

class MyCourseSaveState : Fragment(),CourseViewView {
    private var _binding: FragmentMyCourseSaveStateBinding? = null
    private val binding get() = _binding!!
    lateinit var list : ArrayList<spotList>

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View {
        _binding = FragmentMyCourseSaveStateBinding.inflate(inflater, container, false)



        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        val courseId = arguments?.getInt("courseId", 0)!!
        val service = CourseViewService(this, courseId)
        service.tryCourseView()

        binding.mycourseEditBtn.setOnClickListener {
            parentFragmentManager.beginTransaction()
                .replace(R.id.mycourse_view_list_container, MyCourseEditState()
                    .apply {
                        val bundle = Bundle()
                        bundle.putInt("courseId", courseId)
                        bundle.putSerializable("spotList", list)
                        arguments = bundle
                    }).commit()
        }
    }
    override fun onExploreSuccess(response: CourseViewResponse) {
        when(response.code) {
            1000 -> {
                response.let {
                    binding.saveStateRecyclerview.layoutManager = LinearLayoutManager(requireContext())
                    binding.saveStateRecyclerview.adapter = SaveStateAdapter(it.result?.spotList!!,requireContext())
                    list=it.result?.spotList
                }
            }
        }
    }

    override fun onExploreFailure() {
    }
    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }
}
class SaveStateAdapter(val spotList : ArrayList<spotList>,val context: Context) : RecyclerView.Adapter<RecyclerView.ViewHolder>() {
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RecyclerView.ViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.mycourse_save_state_list,parent,false)

        return CustomViewHolder(view)
    }

    override fun onBindViewHolder(holder: RecyclerView.ViewHolder, position: Int) {
        val view = (holder as CustomViewHolder).itemView
        view.course_edit_title.text = spotList[position].spotTitle
        view.course_edit_sub.text = spotList[position].shortAddress + "·" + spotList[position].type
        if (spotList[position].type.equals("cafe")) {
            view.course_edit_bar.setImageResource(R.drawable.course_edit_bar_yellow)
        } else if (spotList[position].type.equals("playground")) {
            view.course_edit_bar.setImageResource(R.drawable.course_edit_bar_blue)
        } else {
            view.course_edit_bar.setImageResource(R.drawable.course_edit_bar_red)
        }
        Glide.with(context).load(spotList[position].spotImageUrl).into(view.course_edit_image)
        view.course_item_number.text = (position+1).toString()


    }
    inner class CustomViewHolder(var view : View) : RecyclerView.ViewHolder(view)
    override fun getItemCount() = spotList.size
}