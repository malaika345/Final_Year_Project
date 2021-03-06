// Generated by view binder compiler. Do not edit!
package com.example.learning.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.viewbinding.ViewBinding;
import com.example.learning.R;
import com.google.android.material.floatingactionbutton.FloatingActionButton;
import java.lang.NullPointerException;
import java.lang.Override;
import java.lang.String;

public final class FragmentHomepageBinding implements ViewBinding {
  @NonNull
  private final ConstraintLayout rootView;

  @NonNull
  public final TextView BOOKTIQUE;

  @NonNull
  public final Button button;

  @NonNull
  public final FloatingActionButton floatingActionButton;

  @NonNull
  public final FloatingActionButton floatingActionButton2;

  private FragmentHomepageBinding(@NonNull ConstraintLayout rootView, @NonNull TextView BOOKTIQUE,
      @NonNull Button button, @NonNull FloatingActionButton floatingActionButton,
      @NonNull FloatingActionButton floatingActionButton2) {
    this.rootView = rootView;
    this.BOOKTIQUE = BOOKTIQUE;
    this.button = button;
    this.floatingActionButton = floatingActionButton;
    this.floatingActionButton2 = floatingActionButton2;
  }

  @Override
  @NonNull
  public ConstraintLayout getRoot() {
    return rootView;
  }

  @NonNull
  public static FragmentHomepageBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, null, false);
  }

  @NonNull
  public static FragmentHomepageBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup parent, boolean attachToParent) {
    View root = inflater.inflate(R.layout.fragment_homepage, parent, false);
    if (attachToParent) {
      parent.addView(root);
    }
    return bind(root);
  }

  @NonNull
  public static FragmentHomepageBinding bind(@NonNull View rootView) {
    // The body of this method is generated in a way you would not otherwise write.
    // This is done to optimize the compiled bytecode for size and performance.
    int id;
    missingId: {
      id = R.id.BOOKTIQUE;
      TextView BOOKTIQUE = rootView.findViewById(id);
      if (BOOKTIQUE == null) {
        break missingId;
      }

      id = R.id.button;
      Button button = rootView.findViewById(id);
      if (button == null) {
        break missingId;
      }

      id = R.id.floatingActionButton;
      FloatingActionButton floatingActionButton = rootView.findViewById(id);
      if (floatingActionButton == null) {
        break missingId;
      }

      id = R.id.floatingActionButton2;
      FloatingActionButton floatingActionButton2 = rootView.findViewById(id);
      if (floatingActionButton2 == null) {
        break missingId;
      }

      return new FragmentHomepageBinding((ConstraintLayout) rootView, BOOKTIQUE, button,
          floatingActionButton, floatingActionButton2);
    }
    String missingId = rootView.getResources().getResourceName(id);
    throw new NullPointerException("Missing required view with ID: ".concat(missingId));
  }
}
