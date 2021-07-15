// Generated by view binder compiler. Do not edit!
package com.example.learning.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.constraintlayout.widget.Guideline;
import androidx.viewbinding.ViewBinding;
import com.example.learning.R;
import java.lang.NullPointerException;
import java.lang.Override;
import java.lang.String;

public final class InnerNumberViewPagerBinding implements ViewBinding {
  @NonNull
  private final ConstraintLayout rootView;

  @NonNull
  public final Guideline guideline3;

  @NonNull
  public final ImageView imgNumber;

  @NonNull
  public final TextView txtPagination;

  @NonNull
  public final TextView txtTitle;

  private InnerNumberViewPagerBinding(@NonNull ConstraintLayout rootView,
      @NonNull Guideline guideline3, @NonNull ImageView imgNumber, @NonNull TextView txtPagination,
      @NonNull TextView txtTitle) {
    this.rootView = rootView;
    this.guideline3 = guideline3;
    this.imgNumber = imgNumber;
    this.txtPagination = txtPagination;
    this.txtTitle = txtTitle;
  }

  @Override
  @NonNull
  public ConstraintLayout getRoot() {
    return rootView;
  }

  @NonNull
  public static InnerNumberViewPagerBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, null, false);
  }

  @NonNull
  public static InnerNumberViewPagerBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup parent, boolean attachToParent) {
    View root = inflater.inflate(R.layout.inner_number_view_pager, parent, false);
    if (attachToParent) {
      parent.addView(root);
    }
    return bind(root);
  }

  @NonNull
  public static InnerNumberViewPagerBinding bind(@NonNull View rootView) {
    // The body of this method is generated in a way you would not otherwise write.
    // This is done to optimize the compiled bytecode for size and performance.
    int id;
    missingId: {
      id = R.id.guideline3;
      Guideline guideline3 = rootView.findViewById(id);
      if (guideline3 == null) {
        break missingId;
      }

      id = R.id.img_number;
      ImageView imgNumber = rootView.findViewById(id);
      if (imgNumber == null) {
        break missingId;
      }

      id = R.id.txt_pagination;
      TextView txtPagination = rootView.findViewById(id);
      if (txtPagination == null) {
        break missingId;
      }

      id = R.id.txt_title;
      TextView txtTitle = rootView.findViewById(id);
      if (txtTitle == null) {
        break missingId;
      }

      return new InnerNumberViewPagerBinding((ConstraintLayout) rootView, guideline3, imgNumber,
          txtPagination, txtTitle);
    }
    String missingId = rootView.getResources().getResourceName(id);
    throw new NullPointerException("Missing required view with ID: ".concat(missingId));
  }
}