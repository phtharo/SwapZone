// Generated by view binder compiler. Do not edit!
package com.example.savethanh2.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.example.savethanh2.R;
import java.lang.NullPointerException;
import java.lang.Override;
import java.lang.String;

public final class ActivityHomeBinding implements ViewBinding {
  @NonNull
  private final LinearLayout rootView;

  @NonNull
  public final ImageView add;

  @NonNull
  public final Button donate;

  @NonNull
  public final ImageView home;

  @NonNull
  public final ImageView imageView;

  @NonNull
  public final LinearLayout main;

  @NonNull
  public final ImageView pro;

  @NonNull
  public final ImageView regis;

  @NonNull
  public final ImageView shop;

  @NonNull
  public final TextView textView;

  @NonNull
  public final TextView textView2;

  private ActivityHomeBinding(@NonNull LinearLayout rootView, @NonNull ImageView add,
      @NonNull Button donate, @NonNull ImageView home, @NonNull ImageView imageView,
      @NonNull LinearLayout main, @NonNull ImageView pro, @NonNull ImageView regis,
      @NonNull ImageView shop, @NonNull TextView textView, @NonNull TextView textView2) {
    this.rootView = rootView;
    this.add = add;
    this.donate = donate;
    this.home = home;
    this.imageView = imageView;
    this.main = main;
    this.pro = pro;
    this.regis = regis;
    this.shop = shop;
    this.textView = textView;
    this.textView2 = textView2;
  }

  @Override
  @NonNull
  public LinearLayout getRoot() {
    return rootView;
  }

  @NonNull
  public static ActivityHomeBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, null, false);
  }

  @NonNull
  public static ActivityHomeBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup parent, boolean attachToParent) {
    View root = inflater.inflate(R.layout.activity_home, parent, false);
    if (attachToParent) {
      parent.addView(root);
    }
    return bind(root);
  }

  @NonNull
  public static ActivityHomeBinding bind(@NonNull View rootView) {
    // The body of this method is generated in a way you would not otherwise write.
    // This is done to optimize the compiled bytecode for size and performance.
    int id;
    missingId: {
      id = R.id.add;
      ImageView add = ViewBindings.findChildViewById(rootView, id);
      if (add == null) {
        break missingId;
      }

      id = R.id.donate;
      Button donate = ViewBindings.findChildViewById(rootView, id);
      if (donate == null) {
        break missingId;
      }

      id = R.id.home;
      ImageView home = ViewBindings.findChildViewById(rootView, id);
      if (home == null) {
        break missingId;
      }

      id = R.id.imageView;
      ImageView imageView = ViewBindings.findChildViewById(rootView, id);
      if (imageView == null) {
        break missingId;
      }

      LinearLayout main = (LinearLayout) rootView;

      id = R.id.pro;
      ImageView pro = ViewBindings.findChildViewById(rootView, id);
      if (pro == null) {
        break missingId;
      }

      id = R.id.regis;
      ImageView regis = ViewBindings.findChildViewById(rootView, id);
      if (regis == null) {
        break missingId;
      }

      id = R.id.shop;
      ImageView shop = ViewBindings.findChildViewById(rootView, id);
      if (shop == null) {
        break missingId;
      }

      id = R.id.textView;
      TextView textView = ViewBindings.findChildViewById(rootView, id);
      if (textView == null) {
        break missingId;
      }

      id = R.id.textView2;
      TextView textView2 = ViewBindings.findChildViewById(rootView, id);
      if (textView2 == null) {
        break missingId;
      }

      return new ActivityHomeBinding((LinearLayout) rootView, add, donate, home, imageView, main,
          pro, regis, shop, textView, textView2);
    }
    String missingId = rootView.getResources().getResourceName(id);
    throw new NullPointerException("Missing required view with ID: ".concat(missingId));
  }
}
