package com.tencent.mm.ui.base.preference;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewGroup.LayoutParams;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.LinearLayout.LayoutParams;
import android.widget.TextView;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.bq.a;
import com.tencent.mm.sdk.platformtools.bg;
import com.tencent.mm.u.a.e;
import com.tencent.mm.u.a.g;
import com.tencent.mm.u.a.h;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class KeyValuePreference
  extends Preference
{
  private TextView oAy;
  private Drawable vOk;
  public boolean vOl;
  private boolean vOm;
  private boolean vOn;
  public boolean vOo;
  private int vOp;
  public int vOq;
  public int vOr;
  private ImageView vOs;
  public Drawable vOt;
  public List<View> vOu;
  public String voI;
  
  public KeyValuePreference(Context paramContext)
  {
    this(paramContext, null);
    GMTrace.i(3227667922944L, 24048);
    GMTrace.o(3227667922944L, 24048);
  }
  
  public KeyValuePreference(Context paramContext, AttributeSet paramAttributeSet)
  {
    this(paramContext, paramAttributeSet, 0);
    GMTrace.i(3227802140672L, 24049);
    GMTrace.o(3227802140672L, 24049);
  }
  
  public KeyValuePreference(Context paramContext, AttributeSet paramAttributeSet, int paramInt)
  {
    super(paramContext, paramAttributeSet, paramInt);
    GMTrace.i(3227936358400L, 24050);
    this.vOk = null;
    this.vOl = true;
    this.vOm = false;
    this.voI = null;
    this.vOn = false;
    this.vOo = false;
    this.vOp = 17;
    this.vOq = 17;
    this.vOr = 0;
    this.vOs = null;
    this.vOt = null;
    this.vOu = new LinkedList();
    setLayoutResource(a.h.dap);
    GMTrace.o(3227936358400L, 24050);
  }
  
  public final void bYc()
  {
    GMTrace.i(3228473229312L, 24054);
    this.vOn = true;
    this.vOp = 49;
    GMTrace.o(3228473229312L, 24054);
  }
  
  public final void lC(boolean paramBoolean)
  {
    GMTrace.i(3228339011584L, 24053);
    this.vOm = paramBoolean;
    if (this.vOm) {
      setWidgetLayoutResource(a.h.daZ);
    }
    GMTrace.o(3228339011584L, 24053);
  }
  
  public void onBindView(View paramView)
  {
    GMTrace.i(3228204793856L, 24052);
    super.onBindView(paramView);
    this.oAy = ((TextView)paramView.findViewById(16908304));
    this.oAy.setSingleLine(this.vOl);
    if (this.vOm) {
      setWidgetLayoutResource(a.h.daZ);
    }
    Object localObject2;
    if (this.vOo)
    {
      localObject2 = (LinearLayout)paramView.findViewById(a.g.byT);
      localObject1 = (LinearLayout.LayoutParams)((LinearLayout)localObject2).getLayoutParams();
      ((LinearLayout.LayoutParams)localObject1).width = -1;
      ((LinearLayout)localObject2).setLayoutParams((ViewGroup.LayoutParams)localObject1);
      localObject2 = (LinearLayout)paramView.findViewById(a.g.gWx);
      ((LinearLayout)localObject2).setLayoutParams((ViewGroup.LayoutParams)localObject1);
      ((LinearLayout)localObject2).getChildAt(0).setLayoutParams((ViewGroup.LayoutParams)localObject1);
      this.oAy.setGravity(this.vOq);
    }
    Object localObject1 = (TextView)paramView.findViewById(16908310);
    if (!bg.mZ(this.voI)) {
      ((TextView)localObject1).setText(this.voI);
    }
    if (localObject1 != null)
    {
      localObject2 = ((TextView)localObject1).getLayoutParams();
      ((ViewGroup.LayoutParams)localObject2).width = a.U(this.mContext, a.e.aRI);
      ((TextView)localObject1).setLayoutParams((ViewGroup.LayoutParams)localObject2);
    }
    if (this.vOk != null) {
      ((ImageView)paramView.findViewById(a.g.gVI)).setImageDrawable(this.vOk);
    }
    this.vOs = ((ImageView)paramView.findViewById(a.g.bPv));
    if (this.vOt != null)
    {
      this.vOs.setVisibility(this.vOr);
      this.vOs.setImageDrawable(this.vOt);
    }
    for (;;)
    {
      if (this.vOn)
      {
        localObject1 = (LinearLayout)paramView.findViewById(a.g.byT);
        if (localObject1 != null) {
          ((LinearLayout)localObject1).setGravity(this.vOp);
        }
      }
      if (this.vOu.size() <= 0) {
        break;
      }
      paramView = (LinearLayout)paramView.findViewById(a.g.gWx);
      paramView.removeAllViews();
      localObject1 = this.vOu.iterator();
      while (((Iterator)localObject1).hasNext())
      {
        localObject2 = (View)((Iterator)localObject1).next();
        ViewGroup localViewGroup = (ViewGroup)((View)localObject2).getParent();
        if (localViewGroup != null) {
          localViewGroup.removeView((View)localObject2);
        }
        paramView.addView((View)localObject2);
      }
      this.vOs.setVisibility(8);
    }
    GMTrace.o(3228204793856L, 24052);
  }
  
  public View onCreateView(ViewGroup paramViewGroup)
  {
    GMTrace.i(3228070576128L, 24051);
    paramViewGroup = super.onCreateView(paramViewGroup);
    LayoutInflater localLayoutInflater = (LayoutInflater)this.mContext.getSystemService("layout_inflater");
    ViewGroup localViewGroup = (ViewGroup)paramViewGroup.findViewById(a.g.content);
    localViewGroup.removeAllViews();
    localLayoutInflater.inflate(a.h.gXO, localViewGroup);
    GMTrace.o(3228070576128L, 24051);
    return paramViewGroup;
  }
}


/* Location:              /Users/xianghongyan/decompile/dex2jar/classes2-dex2jar.jar!/com/tencent/mm/ui/base/preference/KeyValuePreference.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */