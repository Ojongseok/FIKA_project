// Generated by view binder compiler. Do not edit!
package com.example.fika_project.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
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

public final class FragmentQuitBinding implements ViewBinding {
  @NonNull
  private final ConstraintLayout rootView;

  @NonNull
  public final ImageView quitBackBtn;

  @NonNull
  public final ImageView quitBtn;

  @NonNull
  public final LinearLayout quitContentsLayout;

  @NonNull
  public final TextView quitContentsTv1;

  @NonNull
  public final TextView quitContentsTv2;

  @NonNull
  public final LinearLayout quitContentsWarningLayout;

  @NonNull
  public final TextView quitSubTitleTv;

  @NonNull
  public final TextView quitTitleTv;

  private FragmentQuitBinding(@NonNull ConstraintLayout rootView, @NonNull ImageView quitBackBtn,
      @NonNull ImageView quitBtn, @NonNull LinearLayout quitContentsLayout,
      @NonNull TextView quitContentsTv1, @NonNull TextView quitContentsTv2,
      @NonNull LinearLayout quitContentsWarningLayout, @NonNull TextView quitSubTitleTv,
      @NonNull TextView quitTitleTv) {
    this.rootView = rootView;
    this.quitBackBtn = quitBackBtn;
    this.quitBtn = quitBtn;
    this.quitContentsLayout = quitContentsLayout;
    this.quitContentsTv1 = quitContentsTv1;
    this.quitContentsTv2 = quitContentsTv2;
    this.quitContentsWarningLayout = quitContentsWarningLayout;
    this.quitSubTitleTv = quitSubTitleTv;
    this.quitTitleTv = quitTitleTv;
  }

  @Override
  @NonNull
  public ConstraintLayout getRoot() {
    return rootView;
  }

  @NonNull
  public static FragmentQuitBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, null, false);
  }

  @NonNull
  public static FragmentQuitBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup parent, boolean attachToParent) {
    View root = inflater.inflate(R.layout.fragment_quit, parent, false);
    if (attachToParent) {
      parent.addView(root);
    }
    return bind(root);
  }

  @NonNull
  public static FragmentQuitBinding bind(@NonNull View rootView) {
    // The body of this method is generated in a way you would not otherwise write.
    // This is done to optimize the compiled bytecode for size and performance.
    int id;
    missingId: {
      id = R.id.quit_back_btn;
      ImageView quitBackBtn = ViewBindings.findChildViewById(rootView, id);
      if (quitBackBtn == null) {
        break missingId;
      }

      id = R.id.quit_btn;
      ImageView quitBtn = ViewBindings.findChildViewById(rootView, id);
      if (quitBtn == null) {
        break missingId;
      }

      id = R.id.quit_contents_layout;
      LinearLayout quitContentsLayout = ViewBindings.findChildViewById(rootView, id);
      if (quitContentsLayout == null) {
        break missingId;
      }

      id = R.id.quit_contents_tv_1;
      TextView quitContentsTv1 = ViewBindings.findChildViewById(rootView, id);
      if (quitContentsTv1 == null) {
        break missingId;
      }

      id = R.id.quit_contents_tv_2;
      TextView quitContentsTv2 = ViewBindings.findChildViewById(rootView, id);
      if (quitContentsTv2 == null) {
        break missingId;
      }

      id = R.id.quit_contents_warning_layout;
      LinearLayout quitContentsWarningLayout = ViewBindings.findChildViewById(rootView, id);
      if (quitContentsWarningLayout == null) {
        break missingId;
      }

      id = R.id.quit_sub_title_tv;
      TextView quitSubTitleTv = ViewBindings.findChildViewById(rootView, id);
      if (quitSubTitleTv == null) {
        break missingId;
      }

      id = R.id.quit_title_tv;
      TextView quitTitleTv = ViewBindings.findChildViewById(rootView, id);
      if (quitTitleTv == null) {
        break missingId;
      }

      return new FragmentQuitBinding((ConstraintLayout) rootView, quitBackBtn, quitBtn,
          quitContentsLayout, quitContentsTv1, quitContentsTv2, quitContentsWarningLayout,
          quitSubTitleTv, quitTitleTv);
    }
    String missingId = rootView.getResources().getResourceName(id);
    throw new NullPointerException("Missing required view with ID: ".concat(missingId));
  }
}