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

public final class ItemHomePlacerankBinding implements ViewBinding {
  @NonNull
  private final ConstraintLayout rootView;

  @NonNull
  public final ConstraintLayout itemHomePlacerankLayout;

  @NonNull
  public final TextView itemPlacerankCategoryTv;

  @NonNull
  public final ImageView itemPlacerankFlagIv;

  @NonNull
  public final ImageView itemPlacerankImgIv;

  @NonNull
  public final TextView itemPlacerankTitleTv;

  @NonNull
  public final TextView itemPlacerankWhereTv;

  @NonNull
  public final TextView itemPlacerankWhereTv2;

  private ItemHomePlacerankBinding(@NonNull ConstraintLayout rootView,
      @NonNull ConstraintLayout itemHomePlacerankLayout, @NonNull TextView itemPlacerankCategoryTv,
      @NonNull ImageView itemPlacerankFlagIv, @NonNull ImageView itemPlacerankImgIv,
      @NonNull TextView itemPlacerankTitleTv, @NonNull TextView itemPlacerankWhereTv,
      @NonNull TextView itemPlacerankWhereTv2) {
    this.rootView = rootView;
    this.itemHomePlacerankLayout = itemHomePlacerankLayout;
    this.itemPlacerankCategoryTv = itemPlacerankCategoryTv;
    this.itemPlacerankFlagIv = itemPlacerankFlagIv;
    this.itemPlacerankImgIv = itemPlacerankImgIv;
    this.itemPlacerankTitleTv = itemPlacerankTitleTv;
    this.itemPlacerankWhereTv = itemPlacerankWhereTv;
    this.itemPlacerankWhereTv2 = itemPlacerankWhereTv2;
  }

  @Override
  @NonNull
  public ConstraintLayout getRoot() {
    return rootView;
  }

  @NonNull
  public static ItemHomePlacerankBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, null, false);
  }

  @NonNull
  public static ItemHomePlacerankBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup parent, boolean attachToParent) {
    View root = inflater.inflate(R.layout.item_home_placerank, parent, false);
    if (attachToParent) {
      parent.addView(root);
    }
    return bind(root);
  }

  @NonNull
  public static ItemHomePlacerankBinding bind(@NonNull View rootView) {
    // The body of this method is generated in a way you would not otherwise write.
    // This is done to optimize the compiled bytecode for size and performance.
    int id;
    missingId: {
      ConstraintLayout itemHomePlacerankLayout = (ConstraintLayout) rootView;

      id = R.id.item_placerank_category_tv;
      TextView itemPlacerankCategoryTv = ViewBindings.findChildViewById(rootView, id);
      if (itemPlacerankCategoryTv == null) {
        break missingId;
      }

      id = R.id.item_placerank_flag_iv;
      ImageView itemPlacerankFlagIv = ViewBindings.findChildViewById(rootView, id);
      if (itemPlacerankFlagIv == null) {
        break missingId;
      }

      id = R.id.item_placerank_img_iv;
      ImageView itemPlacerankImgIv = ViewBindings.findChildViewById(rootView, id);
      if (itemPlacerankImgIv == null) {
        break missingId;
      }

      id = R.id.item_placerank_title_tv;
      TextView itemPlacerankTitleTv = ViewBindings.findChildViewById(rootView, id);
      if (itemPlacerankTitleTv == null) {
        break missingId;
      }

      id = R.id.item_placerank_where_tv;
      TextView itemPlacerankWhereTv = ViewBindings.findChildViewById(rootView, id);
      if (itemPlacerankWhereTv == null) {
        break missingId;
      }

      id = R.id.item_placerank_where_tv_2;
      TextView itemPlacerankWhereTv2 = ViewBindings.findChildViewById(rootView, id);
      if (itemPlacerankWhereTv2 == null) {
        break missingId;
      }

      return new ItemHomePlacerankBinding((ConstraintLayout) rootView, itemHomePlacerankLayout,
          itemPlacerankCategoryTv, itemPlacerankFlagIv, itemPlacerankImgIv, itemPlacerankTitleTv,
          itemPlacerankWhereTv, itemPlacerankWhereTv2);
    }
    String missingId = rootView.getResources().getResourceName(id);
    throw new NullPointerException("Missing required view with ID: ".concat(missingId));
  }
}