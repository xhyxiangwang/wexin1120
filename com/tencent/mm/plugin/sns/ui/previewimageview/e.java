package com.tencent.mm.plugin.sns.ui.previewimageview;

import android.animation.Animator;
import android.animation.Animator.AnimatorListener;
import android.animation.ObjectAnimator;
import android.content.Context;
import android.content.SharedPreferences;
import android.content.SharedPreferences.Editor;
import android.content.res.Resources;
import android.graphics.Color;
import android.graphics.Rect;
import android.graphics.drawable.ColorDrawable;
import android.os.Build.VERSION;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup.MarginLayoutParams;
import android.view.ViewTreeObserver;
import android.view.ViewTreeObserver.OnPreDrawListener;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemClickListener;
import android.widget.AdapterView.OnItemLongClickListener;
import android.widget.ImageView;
import android.widget.TextView;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.plugin.sns.i.d;
import com.tencent.mm.plugin.sns.i.f;
import com.tencent.mm.plugin.sns.i.i;
import com.tencent.mm.plugin.sns.ui.w.a;
import com.tencent.mm.sdk.platformtools.ab;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public final class e
  implements com.tencent.mm.plugin.sns.ui.w
{
  private Context context;
  TextView qBB;
  private ImageView qMa;
  private boolean qWc;
  public c qWd;
  DynamicGridView qWe;
  public w.a qWf;
  public float qWg;
  public View qWh;
  ImageView qWi;
  private View qWj;
  Rect qWk;
  
  public e(final View paramView1, View paramView2, View paramView3, final Context paramContext, List<String> paramList, final DynamicGridView paramDynamicGridView, w.a parama, c.a parama1, boolean paramBoolean)
  {
    GMTrace.i(15976741470208L, 119036);
    this.qWc = paramBoolean;
    this.context = paramContext;
    this.qWf = parama;
    this.qWh = paramView2;
    this.qWj = paramView3;
    this.qWe = paramDynamicGridView;
    this.qWi = ((ImageView)paramView2.findViewById(i.f.pJw));
    this.qBB = ((TextView)paramView2.findViewById(i.f.pJy));
    paramDynamicGridView.qWH = false;
    paramDynamicGridView.setColumnWidth(paramContext.getResources().getDimensionPixelSize(i.d.pGC) + paramContext.getResources().getDimensionPixelSize(i.d.pGB) * 2);
    paramDynamicGridView.setNumColumns(4);
    paramDynamicGridView.setOverScrollMode(2);
    paramDynamicGridView.setStretchMode(0);
    paramDynamicGridView.setClipChildren(false);
    paramDynamicGridView.setClipToPadding(false);
    paramDynamicGridView.setSelector(new ColorDrawable(0));
    this.qWd = new c(paramContext, paramList, 9, paramBoolean, parama1);
    bof();
    paramDynamicGridView.setAdapter(this.qWd);
    paramDynamicGridView.qWL = new DynamicGridView.e()
    {
      public final void boi()
      {
        GMTrace.i(15969762148352L, 118984);
        e locale = e.this;
        ObjectAnimator localObjectAnimator = ObjectAnimator.ofFloat(locale.qWh, "translationY", new float[] { 0.0F, locale.qWh.getHeight() });
        localObjectAnimator.setDuration(200L);
        localObjectAnimator.addListener(new e.7(locale));
        localObjectAnimator.start();
        e.this.qWd.bod();
        GMTrace.o(15969762148352L, 118984);
      }
      
      public final void k(Rect paramAnonymousRect)
      {
        GMTrace.i(15969627930624L, 118983);
        if (l(paramAnonymousRect))
        {
          paramAnonymousRect = e.this;
          paramAnonymousRect.qWh.setBackgroundColor(Color.parseColor("#ce3c39"));
          paramAnonymousRect.qWi.setImageResource(i.i.pQC);
          paramAnonymousRect.qBB.setText("松手即可删除");
          GMTrace.o(15969627930624L, 118983);
          return;
        }
        e.this.boh();
        GMTrace.o(15969627930624L, 118983);
      }
      
      public final boolean l(Rect paramAnonymousRect)
      {
        GMTrace.i(15969896366080L, 118985);
        e locale = e.this;
        if (paramAnonymousRect == null)
        {
          GMTrace.o(15969896366080L, 118985);
          return false;
        }
        if (locale.qWk == null) {
          locale.qWk = new Rect(locale.qWh.getLeft(), locale.qWh.getTop(), locale.qWh.getRight(), locale.qWh.getBottom());
        }
        com.tencent.mm.sdk.platformtools.w.d("DynamicGrid", "del area " + locale.qWk + ", test rect " + paramAnonymousRect);
        boolean bool = locale.qWk.intersects(paramAnonymousRect.left, paramAnonymousRect.top, paramAnonymousRect.right, paramAnonymousRect.bottom);
        GMTrace.o(15969896366080L, 118985);
        return bool;
      }
      
      public final void vm(int paramAnonymousInt)
      {
        GMTrace.i(15969359495168L, 118981);
        com.tencent.mm.sdk.platformtools.w.i("DynamicGrid", "drag started at position " + paramAnonymousInt);
        if (Build.VERSION.SDK_INT >= 21)
        {
          e.this.qWg = paramDynamicGridView.getElevation();
          paramDynamicGridView.setElevation(100.0F);
        }
        for (;;)
        {
          Object localObject = e.this;
          ((e)localObject).qWh.setVisibility(0);
          localObject = ObjectAnimator.ofFloat(((e)localObject).qWh, "translationY", new float[] { ((e)localObject).qWh.getHeight(), 0.0F });
          ((ObjectAnimator)localObject).setDuration(200L);
          ((ObjectAnimator)localObject).start();
          e.this.bog();
          GMTrace.o(15969359495168L, 118981);
          return;
          paramDynamicGridView.bringToFront();
        }
      }
      
      public final void vn(int paramAnonymousInt)
      {
        GMTrace.i(15969493712896L, 118982);
        com.tencent.mm.sdk.platformtools.w.i("DynamicGrid", "drag to del " + paramAnonymousInt);
        c localc = e.this.qWd;
        Object localObject = localc.getItem(paramAnonymousInt);
        localc.dw.remove(localObject);
        localc.qVV.remove(localObject);
        localc.notifyDataSetChanged();
        if (localc.qWa != null)
        {
          int i = localc.qVW;
          localc.qWa.removeItem(paramAnonymousInt - i);
        }
        GMTrace.o(15969493712896L, 118982);
      }
    };
    paramDynamicGridView.setOnItemLongClickListener(new AdapterView.OnItemLongClickListener()
    {
      public final boolean onItemLongClick(AdapterView<?> paramAnonymousAdapterView, View paramAnonymousView, int paramAnonymousInt, long paramAnonymousLong)
      {
        GMTrace.i(15990163243008L, 119136);
        GMTrace.o(15990163243008L, 119136);
        return true;
      }
    });
    paramDynamicGridView.setOnItemClickListener(new AdapterView.OnItemClickListener()
    {
      public final void onItemClick(AdapterView<?> paramAnonymousAdapterView, View paramAnonymousView, int paramAnonymousInt, long paramAnonymousLong)
      {
        GMTrace.i(15974593986560L, 119020);
        if (e.this.qWf != null)
        {
          if (paramAnonymousView.getTag() == null)
          {
            GMTrace.o(15974593986560L, 119020);
            return;
          }
          paramAnonymousInt = ((Integer)paramAnonymousView.getTag()).intValue();
          com.tencent.mm.sdk.platformtools.w.i("DynamicGrid", "click " + paramAnonymousInt);
          if (paramAnonymousInt == Integer.MAX_VALUE)
          {
            GMTrace.o(15974593986560L, 119020);
            return;
          }
          e.this.qWf.uM(paramAnonymousInt);
        }
        GMTrace.o(15974593986560L, 119020);
      }
    });
    paramDynamicGridView.qWK = new DynamicGridView.f()
    {
      public final void boj()
      {
        GMTrace.i(15969091059712L, 118979);
        DynamicGridView localDynamicGridView = paramDynamicGridView;
        localDynamicGridView.lvJ = false;
        localDynamicGridView.requestDisallowInterceptTouchEvent(false);
        if ((DynamicGridView.boo()) && (localDynamicGridView.qWH)) {
          localDynamicGridView.jdMethod_if(true);
        }
        if (Build.VERSION.SDK_INT >= 21)
        {
          paramDynamicGridView.setElevation(e.this.qWg);
          GMTrace.o(15969091059712L, 118979);
          return;
        }
        paramView1.bringToFront();
        GMTrace.o(15969091059712L, 118979);
      }
    };
    paramDynamicGridView.getViewTreeObserver().addOnPreDrawListener(new ViewTreeObserver.OnPreDrawListener()
    {
      public final boolean onPreDraw()
      {
        GMTrace.i(15981707526144L, 119073);
        paramDynamicGridView.getViewTreeObserver().removeOnPreDrawListener(this);
        ViewGroup.MarginLayoutParams localMarginLayoutParams = (ViewGroup.MarginLayoutParams)paramDynamicGridView.getLayoutParams();
        int i = paramContext.getResources().getDimensionPixelSize(i.d.pGA);
        int j = paramContext.getResources().getDimensionPixelSize(i.d.pGB);
        localMarginLayoutParams.setMargins(localMarginLayoutParams.leftMargin, paramView1.getHeight() - (i + j * 2), localMarginLayoutParams.rightMargin, localMarginLayoutParams.bottomMargin);
        paramDynamicGridView.setLayoutParams(localMarginLayoutParams);
        GMTrace.o(15981707526144L, 119073);
        return true;
      }
    });
    GMTrace.o(15976741470208L, 119036);
  }
  
  private void bof()
  {
    GMTrace.i(15976875687936L, 119037);
    if ((ab.bNb().getBoolean("key_show_tips", true)) && (this.qWd.boe() > 1))
    {
      this.qWj.setVisibility(0);
      this.qMa = ((ImageView)this.qWj.findViewById(i.f.pMf));
      this.qMa.setOnClickListener(new View.OnClickListener()
      {
        public final void onClick(View paramAnonymousView)
        {
          GMTrace.i(15976607252480L, 119035);
          e.this.bog();
          GMTrace.o(15976607252480L, 119035);
        }
      });
      GMTrace.o(15976875687936L, 119037);
      return;
    }
    this.qWj.setVisibility(8);
    GMTrace.o(15976875687936L, 119037);
  }
  
  public final void a(w.a parama)
  {
    GMTrace.i(15977144123392L, 119039);
    this.qWf = parama;
    GMTrace.o(15977144123392L, 119039);
  }
  
  public final void blF()
  {
    GMTrace.i(15977009905664L, 119038);
    this.qWc = false;
    GMTrace.o(15977009905664L, 119038);
  }
  
  public final void bog()
  {
    GMTrace.i(16044387205120L, 119540);
    this.qWj.setVisibility(8);
    ab.bNb().edit().putBoolean("key_show_tips", false).commit();
    GMTrace.o(16044387205120L, 119540);
  }
  
  public final void boh()
  {
    GMTrace.i(16044521422848L, 119541);
    this.qWh.setBackgroundColor(Color.parseColor("#e64340"));
    this.qWi.setImageResource(i.i.pQB);
    this.qBB.setText("拖动到此处删除");
    GMTrace.o(16044521422848L, 119541);
  }
  
  public final void by(List<String> paramList)
  {
    GMTrace.i(15977412558848L, 119041);
    if (this.qWd != null)
    {
      this.qWd.bD(paramList);
      bof();
    }
    GMTrace.o(15977412558848L, 119041);
  }
  
  public final void clean()
  {
    GMTrace.i(15977546776576L, 119042);
    if ((this.qWe != null) && (this.qWe.getAdapter() == null)) {
      ((c)this.qWe.getAdapter()).qEp = true;
    }
    GMTrace.o(15977546776576L, 119042);
  }
  
  public final View getView()
  {
    GMTrace.i(15977278341120L, 119040);
    DynamicGridView localDynamicGridView = this.qWe;
    GMTrace.o(15977278341120L, 119040);
    return localDynamicGridView;
  }
}


/* Location:              /Users/xianghongyan/decompile/dex2jar/classes2-dex2jar.jar!/com/tencent/mm/plugin/sns/ui/previewimageview/e.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */