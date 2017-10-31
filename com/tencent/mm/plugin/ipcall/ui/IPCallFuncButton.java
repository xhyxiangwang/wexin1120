package com.tencent.mm.plugin.ipcall.ui;

import android.content.Context;
import android.content.res.Resources.Theme;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.View.OnTouchListener;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.R.h;
import com.tencent.mm.R.i;
import com.tencent.mm.R.n;
import com.tencent.mm.sdk.platformtools.bg;

public class IPCallFuncButton
  extends LinearLayout
{
  private boolean knG;
  private boolean mai;
  private ImageView neg;
  private TextView neh;
  private Drawable nei;
  private Drawable nej;
  private Drawable nek;
  private boolean nel;
  a nem;
  private View.OnTouchListener nen;
  private String text;
  
  public IPCallFuncButton(Context paramContext, AttributeSet paramAttributeSet)
  {
    super(paramContext, paramAttributeSet);
    GMTrace.i(11657078112256L, 86852);
    this.knG = false;
    this.mai = true;
    this.nen = new View.OnTouchListener()
    {
      public final boolean onTouch(View paramAnonymousView, MotionEvent paramAnonymousMotionEvent)
      {
        GMTrace.i(11695195947008L, 87136);
        if (!IPCallFuncButton.a(IPCallFuncButton.this))
        {
          GMTrace.o(11695195947008L, 87136);
          return false;
        }
        if (paramAnonymousMotionEvent.getAction() == 0) {
          if (!IPCallFuncButton.b(IPCallFuncButton.this)) {
            if (IPCallFuncButton.c(IPCallFuncButton.this) != null) {
              IPCallFuncButton.d(IPCallFuncButton.this).setImageDrawable(IPCallFuncButton.c(IPCallFuncButton.this));
            }
          }
        }
        for (;;)
        {
          GMTrace.o(11695195947008L, 87136);
          return false;
          if (IPCallFuncButton.e(IPCallFuncButton.this))
          {
            IPCallFuncButton.d(IPCallFuncButton.this).setImageDrawable(IPCallFuncButton.f(IPCallFuncButton.this));
            IPCallFuncButton.a(IPCallFuncButton.this, false);
          }
          for (;;)
          {
            if (IPCallFuncButton.g(IPCallFuncButton.this) == null) {
              break label177;
            }
            IPCallFuncButton.g(IPCallFuncButton.this).fx(IPCallFuncButton.e(IPCallFuncButton.this));
            break;
            IPCallFuncButton.d(IPCallFuncButton.this).setImageDrawable(IPCallFuncButton.c(IPCallFuncButton.this));
            IPCallFuncButton.a(IPCallFuncButton.this, true);
          }
          label177:
          continue;
          if (((paramAnonymousMotionEvent.getAction() == 3) || (paramAnonymousMotionEvent.getAction() == 1)) && (!IPCallFuncButton.b(IPCallFuncButton.this)))
          {
            if (IPCallFuncButton.f(IPCallFuncButton.this) != null) {
              IPCallFuncButton.d(IPCallFuncButton.this).setImageDrawable(IPCallFuncButton.f(IPCallFuncButton.this));
            }
            if (IPCallFuncButton.g(IPCallFuncButton.this) != null) {
              IPCallFuncButton.g(IPCallFuncButton.this).fx(false);
            }
          }
        }
      }
    };
    LayoutInflater.from(getContext()).inflate(R.i.cXS, this);
    this.neg = ((ImageView)findViewById(R.h.button));
    this.neh = ((TextView)findViewById(R.h.text));
    paramContext = getContext().getTheme().obtainStyledAttributes(paramAttributeSet, R.n.feR, 0, 0);
    this.nei = paramContext.getDrawable(R.n.feU);
    this.nej = paramContext.getDrawable(R.n.feV);
    this.nel = paramContext.getBoolean(R.n.feS, false);
    this.nek = paramContext.getDrawable(R.n.feT);
    int i = paramContext.getResourceId(R.n.feW, 0);
    if (i != 0) {
      this.text = getContext().getString(i);
    }
    paramContext.recycle();
    if (!bg.mZ(this.text)) {
      this.neh.setText(this.text);
    }
    for (;;)
    {
      if (this.nei != null) {
        this.neg.setImageDrawable(this.nei);
      }
      this.neg.setClickable(true);
      this.neg.setOnTouchListener(this.nen);
      GMTrace.o(11657078112256L, 86852);
      return;
      this.neh.setVisibility(8);
    }
  }
  
  public final void fw(boolean paramBoolean)
  {
    GMTrace.i(11657346547712L, 86854);
    if (paramBoolean != this.mai)
    {
      this.mai = paramBoolean;
      if ((this.mai) || (this.nek == null)) {
        break label60;
      }
      this.neg.setImageDrawable(this.nek);
    }
    for (;;)
    {
      this.knG = false;
      GMTrace.o(11657346547712L, 86854);
      return;
      label60:
      this.neg.setImageDrawable(this.nei);
    }
  }
  
  public final boolean isChecked()
  {
    GMTrace.i(11657212329984L, 86853);
    if (this.nel)
    {
      boolean bool = this.knG;
      GMTrace.o(11657212329984L, 86853);
      return bool;
    }
    GMTrace.o(11657212329984L, 86853);
    return false;
  }
  
  public final void setChecked(boolean paramBoolean)
  {
    GMTrace.i(11657480765440L, 86855);
    if ((paramBoolean != this.knG) && (this.nel))
    {
      this.knG = paramBoolean;
      if (this.knG)
      {
        this.neg.setImageDrawable(this.nej);
        GMTrace.o(11657480765440L, 86855);
        return;
      }
      this.neg.setImageDrawable(this.nei);
    }
    GMTrace.o(11657480765440L, 86855);
  }
  
  public static abstract interface a
  {
    public abstract void fx(boolean paramBoolean);
  }
}


/* Location:              /Users/xianghongyan/decompile/dex2jar/classes2-dex2jar.jar!/com/tencent/mm/plugin/ipcall/ui/IPCallFuncButton.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */