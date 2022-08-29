// Generated by view binder compiler. Do not edit!
package com.example.fika_project.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.example.fika_project.R;
import java.lang.NullPointerException;
import java.lang.Override;
import java.lang.String;

public final class ExploreCourseItemListBinding implements ViewBinding {
  @NonNull
  private final ConstraintLayout rootView;

  @NonNull
  public final TextView exploreChildTitle;

  @NonNull
  public final ImageView imageView24;

  @NonNull
  public final TextView itemHomeCoursescrapDramaTitleTv;

  @NonNull
  public final TextView itemHomeCoursescrapInfoTv;

  @NonNull
  public final TextView itemHomeCoursescrapNumberTv;

  @NonNull
  public final TextView itemHomeCoursescrapWhereTv;

  @NonNull
  public final ImageView itemHomeScrapcourseIv;

  private ExploreCourseItemListBinding(@NonNull ConstraintLayout rootView,
      @NonNull TextView exploreChildTitle, @NonNull ImageView imageView24,
      @NonNull TextView itemHomeCoursescrapDramaTitleTv,
      @NonNull TextView itemHomeCoursescrapInfoTv, @NonNull TextView itemHomeCoursescrapNumberTv,
      @NonNull TextView itemHomeCoursescrapWhereTv, @NonNull ImageView itemHomeScrapcourseIv) {
    this.rootView = rootView;
    this.exploreChildTitle = exploreChildTitle;
    this.imageView24 = imageView24;
    this.itemHomeCoursescrapDramaTitleTv = itemHomeCoursescrapDramaTitleTv;
    this.itemHomeCoursescrapInfoTv = itemHomeCoursescrapInfoTv;
    this.itemHomeCoursescrapNumberTv = itemHomeCoursescrapNumberTv;
    this.itemHomeCoursescrapWhereTv = itemHomeCoursescrapWhereTv;
    this.itemHomeScrapcourseIv = itemHomeScrapcourseIv;
  }

  @Override
  @NonNull
  public ConstraintLayout getRoot() {
    return rootView;
  }

  @NonNull
  public static ExploreCourseItemListBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, null, false);
  }

  @NonNull
  public static ExploreCourseItemListBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup parent, boolean attachToParent) {
    View root = inflater.inflate(R.layout.explore_course_item_list, parent, false);
    if (attachToParent) {
      parent.addView(root);
    }
    return bind(root);
  }

  @NonNull
  public static ExploreCourseItemListBinding bind(@NonNull View rootView) {
    // The body of this method is generated in a way you would not otherwise write.
    // This is done to optimize the compiled bytecode for size and performance.
    int id;
    missingId: {
      id = R.id.explore_child_title;
      TextView exploreChildTitle = ViewBindings.findChildViewById(rootView, id);
      if (exploreChildTitle == null) {
        break missingId;
      }

      id = R.id.imageView24;
      ImageView imageView24 = ViewBindings.findChildViewById(rootView, id);
      if (imageView24 == null) {
        break missingId;
      }

      id = R.id.item_home_coursescrap_drama_title_tv;
      TextView itemHomeCoursescrapDramaTitleTv = ViewBindings.findChildViewById(rootView, id);
      if (itemHomeCoursescrapDramaTitleTv == null) {
        break missingId;
      }

      id = R.id.item_home_coursescrap_info_tv;
      TextView itemHomeCoursescrapInfoTv = ViewBindings.findChildViewById(rootView, id);
      if (itemHomeCoursescrapInfoTv == null) {
        break missingId;
      }

      id = R.id.item_home_coursescrap_number_tv;
      TextView itemHomeCoursescrapNumberTv = ViewBindings.findChildViewById(rootView, id);
      if (itemHomeCoursescrapNumberTv == null) {
        break missingId;
      }

      id = R.id.item_home_coursescrap_where_tv;
      TextView itemHomeCoursescrapWhereTv = ViewBindings.findChildViewById(rootView, id);
      if (itemHomeCoursescrapWhereTv == null) {
        break missingId;
      }

      id = R.id.item_home_scrapcourse_iv;
      ImageView itemHomeScrapcourseIv = ViewBindings.findChildViewById(rootView, id);
      if (itemHomeScrapcourseIv == null) {
        break missingId;
      }

      return new ExploreCourseItemListBinding((ConstraintLayout) rootView, exploreChildTitle,
          imageView24, itemHomeCoursescrapDramaTitleTv, itemHomeCoursescrapInfoTv,
          itemHomeCoursescrapNumberTv, itemHomeCoursescrapWhereTv, itemHomeScrapcourseIv);
    }
    String missingId = rootView.getResources().getResourceName(id);
    throw new NullPointerException("Missing required view with ID: ".concat(missingId));
  }
}