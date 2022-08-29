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
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.example.fika_project.R;
import java.lang.NullPointerException;
import java.lang.Override;
import java.lang.String;

public final class ActivityFolderSelectBinding implements ViewBinding {
  @NonNull
  private final ConstraintLayout rootView;

  @NonNull
  public final TextView folderSelectGoCourseBtn;

  @NonNull
  public final RecyclerView folderSelectRecyclerview;

  @NonNull
  public final TextView folderSelectStayBtn;

  @NonNull
  public final ImageView imageView9;

  @NonNull
  public final TextView textView34;

  private ActivityFolderSelectBinding(@NonNull ConstraintLayout rootView,
      @NonNull TextView folderSelectGoCourseBtn, @NonNull RecyclerView folderSelectRecyclerview,
      @NonNull TextView folderSelectStayBtn, @NonNull ImageView imageView9,
      @NonNull TextView textView34) {
    this.rootView = rootView;
    this.folderSelectGoCourseBtn = folderSelectGoCourseBtn;
    this.folderSelectRecyclerview = folderSelectRecyclerview;
    this.folderSelectStayBtn = folderSelectStayBtn;
    this.imageView9 = imageView9;
    this.textView34 = textView34;
  }

  @Override
  @NonNull
  public ConstraintLayout getRoot() {
    return rootView;
  }

  @NonNull
  public static ActivityFolderSelectBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, null, false);
  }

  @NonNull
  public static ActivityFolderSelectBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup parent, boolean attachToParent) {
    View root = inflater.inflate(R.layout.activity_folder_select, parent, false);
    if (attachToParent) {
      parent.addView(root);
    }
    return bind(root);
  }

  @NonNull
  public static ActivityFolderSelectBinding bind(@NonNull View rootView) {
    // The body of this method is generated in a way you would not otherwise write.
    // This is done to optimize the compiled bytecode for size and performance.
    int id;
    missingId: {
      id = R.id.folder_select_go_course_btn;
      TextView folderSelectGoCourseBtn = ViewBindings.findChildViewById(rootView, id);
      if (folderSelectGoCourseBtn == null) {
        break missingId;
      }

      id = R.id.folder_select_recyclerview;
      RecyclerView folderSelectRecyclerview = ViewBindings.findChildViewById(rootView, id);
      if (folderSelectRecyclerview == null) {
        break missingId;
      }

      id = R.id.folder_select_stay_btn;
      TextView folderSelectStayBtn = ViewBindings.findChildViewById(rootView, id);
      if (folderSelectStayBtn == null) {
        break missingId;
      }

      id = R.id.imageView9;
      ImageView imageView9 = ViewBindings.findChildViewById(rootView, id);
      if (imageView9 == null) {
        break missingId;
      }

      id = R.id.textView34;
      TextView textView34 = ViewBindings.findChildViewById(rootView, id);
      if (textView34 == null) {
        break missingId;
      }

      return new ActivityFolderSelectBinding((ConstraintLayout) rootView, folderSelectGoCourseBtn,
          folderSelectRecyclerview, folderSelectStayBtn, imageView9, textView34);
    }
    String missingId = rootView.getResources().getResourceName(id);
    throw new NullPointerException("Missing required view with ID: ".concat(missingId));
  }
}