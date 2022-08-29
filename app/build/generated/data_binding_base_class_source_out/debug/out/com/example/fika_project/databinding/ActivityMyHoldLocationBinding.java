// Generated by view binder compiler. Do not edit!
package com.example.fika_project.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.example.fika_project.R;
import java.lang.NullPointerException;
import java.lang.Override;
import java.lang.String;

public final class ActivityMyHoldLocationBinding implements ViewBinding {
  @NonNull
  private final RelativeLayout rootView;

  @NonNull
  public final TextView mycourseViewAddLocation;

  @NonNull
  public final ImageView myholdBackBtn;

  @NonNull
  public final ImageView myholdHomeBtn;

  @NonNull
  public final RecyclerView myholdLocationRecyclerview;

  @NonNull
  public final TextView myholdTitle;

  @NonNull
  public final FrameLayout myholdTitleBar;

  private ActivityMyHoldLocationBinding(@NonNull RelativeLayout rootView,
      @NonNull TextView mycourseViewAddLocation, @NonNull ImageView myholdBackBtn,
      @NonNull ImageView myholdHomeBtn, @NonNull RecyclerView myholdLocationRecyclerview,
      @NonNull TextView myholdTitle, @NonNull FrameLayout myholdTitleBar) {
    this.rootView = rootView;
    this.mycourseViewAddLocation = mycourseViewAddLocation;
    this.myholdBackBtn = myholdBackBtn;
    this.myholdHomeBtn = myholdHomeBtn;
    this.myholdLocationRecyclerview = myholdLocationRecyclerview;
    this.myholdTitle = myholdTitle;
    this.myholdTitleBar = myholdTitleBar;
  }

  @Override
  @NonNull
  public RelativeLayout getRoot() {
    return rootView;
  }

  @NonNull
  public static ActivityMyHoldLocationBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, null, false);
  }

  @NonNull
  public static ActivityMyHoldLocationBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup parent, boolean attachToParent) {
    View root = inflater.inflate(R.layout.activity_my_hold_location, parent, false);
    if (attachToParent) {
      parent.addView(root);
    }
    return bind(root);
  }

  @NonNull
  public static ActivityMyHoldLocationBinding bind(@NonNull View rootView) {
    // The body of this method is generated in a way you would not otherwise write.
    // This is done to optimize the compiled bytecode for size and performance.
    int id;
    missingId: {
      id = R.id.mycourse_view_add_location;
      TextView mycourseViewAddLocation = ViewBindings.findChildViewById(rootView, id);
      if (mycourseViewAddLocation == null) {
        break missingId;
      }

      id = R.id.myhold_back_btn;
      ImageView myholdBackBtn = ViewBindings.findChildViewById(rootView, id);
      if (myholdBackBtn == null) {
        break missingId;
      }

      id = R.id.myhold_home_btn;
      ImageView myholdHomeBtn = ViewBindings.findChildViewById(rootView, id);
      if (myholdHomeBtn == null) {
        break missingId;
      }

      id = R.id.myhold_location_recyclerview;
      RecyclerView myholdLocationRecyclerview = ViewBindings.findChildViewById(rootView, id);
      if (myholdLocationRecyclerview == null) {
        break missingId;
      }

      id = R.id.myhold_title;
      TextView myholdTitle = ViewBindings.findChildViewById(rootView, id);
      if (myholdTitle == null) {
        break missingId;
      }

      id = R.id.myhold_title_bar;
      FrameLayout myholdTitleBar = ViewBindings.findChildViewById(rootView, id);
      if (myholdTitleBar == null) {
        break missingId;
      }

      return new ActivityMyHoldLocationBinding((RelativeLayout) rootView, mycourseViewAddLocation,
          myholdBackBtn, myholdHomeBtn, myholdLocationRecyclerview, myholdTitle, myholdTitleBar);
    }
    String missingId = rootView.getResources().getResourceName(id);
    throw new NullPointerException("Missing required view with ID: ".concat(missingId));
  }
}