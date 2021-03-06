package com.github.ppamorim.dragger;

import android.content.Context;
import android.util.AttributeSet;

public class LazyDraggerView extends DraggerView {

  public LazyDraggerView(Context context) {
    super(context);
  }

  public LazyDraggerView(Context context, AttributeSet attrs) {
    super(context, attrs);
  }

  public LazyDraggerView(Context context, AttributeSet attrs, int defStyle) {
    super(context, attrs, defStyle);
  }

  @Override public void expandWithDelay() { }

  public void expand() {
    if (isEnabled()) {
      showViews();
      openActivity();
      setCanFinish(true);
    }
  }

}
