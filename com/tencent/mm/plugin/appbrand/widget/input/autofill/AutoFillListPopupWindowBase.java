package com.tencent.mm.plugin.appbrand.widget.input.autofill;

import android.content.Context;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.database.DataSetObserver;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Build.VERSION;
import android.util.AttributeSet;
import android.util.DisplayMetrics;
import android.view.MotionEvent;
import android.view.View;
import android.view.View.MeasureSpec;
import android.view.View.OnTouchListener;
import android.view.ViewGroup;
import android.view.ViewGroup.LayoutParams;
import android.view.ViewParent;
import android.widget.AbsListView;
import android.widget.AbsListView.OnScrollListener;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemClickListener;
import android.widget.AdapterView.OnItemSelectedListener;
import android.widget.FrameLayout;
import android.widget.FrameLayout.LayoutParams;
import android.widget.ListAdapter;
import android.widget.ListView;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.bw.a.a;
import com.tencent.mm.sdk.platformtools.ae;
import com.tencent.mm.ui.base.p;

public class AutoFillListPopupWindowBase
{
  public ListAdapter EU;
  int Pc;
  int RT;
  int RU;
  int RV;
  boolean RX;
  boolean RY;
  boolean RZ;
  int Sa;
  public View Sb;
  private int Sc;
  View Sd;
  private Drawable Se;
  private AdapterView.OnItemClickListener Sf;
  private AdapterView.OnItemSelectedListener Sg;
  private Runnable Sl;
  boolean Sm;
  private Rect dF;
  public p ioi;
  public a jEL;
  public final f jEM;
  private final e jEN;
  private final d jEO;
  private final b jEP;
  private boolean jEQ;
  private Context mContext;
  public ae mHandler;
  DataSetObserver mObserver;
  
  public AutoFillListPopupWindowBase(Context paramContext, AttributeSet paramAttributeSet)
  {
    this(paramContext, paramAttributeSet, a.a.listPopupWindowStyle);
    GMTrace.i(18264482643968L, 136081);
    GMTrace.o(18264482643968L, 136081);
  }
  
  public AutoFillListPopupWindowBase(Context paramContext, AttributeSet paramAttributeSet, int paramInt)
  {
    GMTrace.i(18264616861696L, 136082);
    this.RT = -2;
    this.Pc = -2;
    this.RY = false;
    this.RZ = false;
    this.Sa = Integer.MAX_VALUE;
    this.Sc = 0;
    this.jEM = new f();
    this.jEN = new e();
    this.jEO = new d();
    this.jEP = new b();
    this.mHandler = new ae();
    this.dF = new Rect();
    this.jEQ = false;
    this.mContext = paramContext;
    this.ioi = new p(paramContext);
    this.ioi.setInputMethodMode(1);
    paramContext = this.mContext.getResources().getConfiguration().locale;
    GMTrace.o(18264616861696L, 136082);
  }
  
  private void acP()
  {
    GMTrace.i(18265153732608L, 136086);
    if (this.Sb != null)
    {
      ViewParent localViewParent = this.Sb.getParent();
      if ((localViewParent instanceof ViewGroup)) {
        ((ViewGroup)localViewParent).removeView(this.Sb);
      }
    }
    GMTrace.o(18265153732608L, 136086);
  }
  
  public final void clearListSelection()
  {
    GMTrace.i(18265287950336L, 136087);
    a locala = this.jEL;
    if (locala != null)
    {
      a.a(locala, true);
      locala.requestLayout();
    }
    GMTrace.o(18265287950336L, 136087);
  }
  
  public final void dismiss()
  {
    GMTrace.i(18265019514880L, 136085);
    this.ioi.dismiss();
    acP();
    this.ioi.setContentView(null);
    this.jEL = null;
    this.mHandler.removeCallbacks(this.jEM);
    GMTrace.o(18265019514880L, 136085);
  }
  
  public final boolean isInputMethodNotNeeded()
  {
    GMTrace.i(18265422168064L, 136088);
    if (this.ioi.getInputMethodMode() == 2)
    {
      GMTrace.o(18265422168064L, 136088);
      return true;
    }
    GMTrace.o(18265422168064L, 136088);
    return false;
  }
  
  public final void setVerticalOffset(int paramInt)
  {
    GMTrace.i(18264751079424L, 136083);
    this.RV = paramInt;
    this.RX = true;
    GMTrace.o(18264751079424L, 136083);
  }
  
  public void show()
  {
    boolean bool3 = true;
    boolean bool2 = true;
    int n = -1;
    GMTrace.i(18264885297152L, 136084);
    Object localObject2;
    boolean bool1;
    Object localObject1;
    View localView;
    FrameLayout.LayoutParams localLayoutParams1;
    FrameLayout.LayoutParams localLayoutParams2;
    if (this.jEL == null)
    {
      localObject2 = this.mContext;
      this.Sl = new Runnable()
      {
        public final void run()
        {
          GMTrace.i(18264348426240L, 136080);
          View localView = AutoFillListPopupWindowBase.this.Sd;
          if ((localView != null) && (localView.getWindowToken() != null)) {
            AutoFillListPopupWindowBase.this.show();
          }
          GMTrace.o(18264348426240L, 136080);
        }
      };
      if (!this.Sm)
      {
        bool1 = true;
        this.jEL = new a((Context)localObject2, bool1);
        if (this.Se != null) {
          this.jEL.setSelector(this.Se);
        }
        this.jEL.setAdapter(this.EU);
        this.jEL.setOnItemClickListener(this.Sf);
        this.jEL.setFocusable(true);
        this.jEL.setFocusableInTouchMode(true);
        this.jEL.setDivider(null);
        this.jEL.setDividerHeight(0);
        this.jEL.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener()
        {
          public final void onItemSelected(AdapterView<?> paramAnonymousAdapterView, View paramAnonymousView, int paramAnonymousInt, long paramAnonymousLong)
          {
            GMTrace.i(18268240740352L, 136109);
            if (paramAnonymousInt != -1)
            {
              paramAnonymousAdapterView = AutoFillListPopupWindowBase.this.jEL;
              if (paramAnonymousAdapterView != null) {
                AutoFillListPopupWindowBase.a.a(paramAnonymousAdapterView, false);
              }
            }
            GMTrace.o(18268240740352L, 136109);
          }
          
          public final void onNothingSelected(AdapterView<?> paramAnonymousAdapterView)
          {
            GMTrace.i(18268374958080L, 136110);
            GMTrace.o(18268374958080L, 136110);
          }
        });
        this.jEL.setOnScrollListener(this.jEO);
        if (this.Sg != null) {
          this.jEL.setOnItemSelectedListener(this.Sg);
        }
        localObject1 = this.jEL;
        localView = this.Sb;
        if (localView == null) {
          break label1357;
        }
        acP();
        localObject2 = new FrameLayout((Context)localObject2);
        localLayoutParams1 = new FrameLayout.LayoutParams(-1, -1);
        localLayoutParams2 = new FrameLayout.LayoutParams(-1, -2);
        switch (this.Sc)
        {
        default: 
          new StringBuilder("Invalid hint position ").append(this.Sc);
          label282:
          localView.measure(View.MeasureSpec.makeMeasureSpec(this.Pc, Integer.MIN_VALUE), 0);
          localObject1 = localObject2;
        }
      }
    }
    label313:
    label376:
    label389:
    label549:
    label562:
    label584:
    label591:
    label764:
    label918:
    label946:
    label951:
    label956:
    label987:
    label1004:
    label1010:
    label1052:
    label1072:
    label1105:
    label1246:
    label1284:
    label1290:
    label1346:
    label1352:
    label1357:
    for (;;)
    {
      this.ioi.setContentView((View)localObject1);
      int i = 0;
      for (;;)
      {
        localObject1 = this.ioi.getBackground();
        int k;
        int i1;
        int m;
        if (localObject1 != null)
        {
          ((Drawable)localObject1).getPadding(this.dF);
          j = this.dF.top + this.dF.bottom;
          k = j;
          if (!this.RX)
          {
            this.RV = (-this.dF.top);
            k = j;
          }
          if (this.ioi.getInputMethodMode() != 2) {
            break label764;
          }
          j = 1;
          localObject1 = this.Sd;
          i1 = this.RV;
          localObject2 = new Rect();
          ((View)localObject1).getWindowVisibleDisplayFrame((Rect)localObject2);
          ((View)localObject1).getLocationOnScreen(new int[2]);
          m = ((Rect)localObject2).bottom;
          if (j == 0) {
            break label1346;
          }
        }
        for (int j = ((View)localObject1).getContext().getResources().getDisplayMetrics().heightPixels;; j = m)
        {
          j -= i1;
          m = j;
          if (this.ioi.getBackground() != null)
          {
            this.ioi.getBackground().getPadding(this.dF);
            m = j - (this.dF.top + this.dF.bottom);
          }
          if ((this.RY) || (this.RT == -1))
          {
            i = m + k;
            bool1 = isInputMethodNotNeeded();
            if (!this.ioi.isShowing()) {
              break label1052;
            }
            if (this.Pc != -1) {
              break label918;
            }
            j = -1;
            if (this.RT != -1) {
              break label987;
            }
            if (!bool1) {
              break label946;
            }
            if (!bool1) {
              break label956;
            }
            localObject1 = this.ioi;
            if (this.Pc != -1) {
              break label951;
            }
            k = n;
            ((p)localObject1).setWindowLayoutMode(k, 0);
            this.ioi.update(j, i);
            localObject1 = this.ioi;
            if ((this.RZ) || (this.RY)) {
              break label1004;
            }
          }
          for (bool1 = bool2;; bool1 = false)
          {
            ((p)localObject1).setOutsideTouchable(bool1);
            if (!this.jEQ) {
              break label1010;
            }
            this.ioi.showAtLocation(this.Sd, 17, 0, 0);
            GMTrace.o(18264885297152L, 136084);
            return;
            bool1 = false;
            break;
            localLayoutParams2.gravity = 80;
            ((FrameLayout)localObject2).addView((View)localObject1, localLayoutParams1);
            ((FrameLayout)localObject2).addView(localView, localLayoutParams2);
            break label282;
            localLayoutParams2.gravity = 48;
            ((FrameLayout)localObject2).addView((View)localObject1, localLayoutParams1);
            ((FrameLayout)localObject2).addView(localView, localLayoutParams2);
            break label282;
            this.ioi.getContentView();
            localObject1 = this.Sb;
            if (localObject1 == null) {
              break label1352;
            }
            i = ((View)localObject1).getMeasuredHeight();
            break label313;
            this.dF.setEmpty();
            k = 0;
            break label376;
            j = 0;
            break label389;
            switch (this.Pc)
            {
            default: 
              j = View.MeasureSpec.makeMeasureSpec(this.Pc, 1073741824);
            }
            for (;;)
            {
              m = this.jEL.K(j, m - i);
              j = i;
              if (m > 0) {
                j = i + k;
              }
              i = j + m;
              break;
              j = View.MeasureSpec.makeMeasureSpec(this.mContext.getResources().getDisplayMetrics().widthPixels - (this.dF.left + this.dF.right), Integer.MIN_VALUE);
              continue;
              j = View.MeasureSpec.makeMeasureSpec(this.mContext.getResources().getDisplayMetrics().widthPixels - (this.dF.left + this.dF.right), 1073741824);
            }
            if (this.Pc == -2)
            {
              j = this.Sd.getWidth();
              break label549;
            }
            j = this.Pc;
            break label549;
            i = -1;
            break label562;
            k = 0;
            break label584;
            localObject1 = this.ioi;
            if (this.Pc == -1) {}
            for (k = -1;; k = 0)
            {
              ((p)localObject1).setWindowLayoutMode(k, -1);
              break;
            }
            if (this.RT == -2) {
              break label591;
            }
            i = this.RT;
            break label591;
          }
          this.ioi.update(this.Sd, this.RU, this.RV, this.ioi.getWidth(), this.ioi.getHeight());
          GMTrace.o(18264885297152L, 136084);
          return;
          if (this.Pc == -1)
          {
            j = -1;
            if (this.RT != -1) {
              break label1246;
            }
            i = -1;
            this.ioi.setWindowLayoutMode(j, i);
            localObject1 = this.ioi;
            if ((this.RZ) || (this.RY)) {
              break label1284;
            }
            bool1 = bool3;
            ((p)localObject1).setOutsideTouchable(bool1);
            this.ioi.setTouchInterceptor(this.jEN);
            if (!this.jEQ) {
              break label1290;
            }
            this.ioi.showAtLocation(this.Sd, 17, 0, 0);
          }
          for (;;)
          {
            this.jEL.setSelection(-1);
            if ((!this.Sm) || (this.jEL.isInTouchMode())) {
              clearListSelection();
            }
            if (!this.Sm) {
              this.mHandler.post(this.jEP);
            }
            GMTrace.o(18264885297152L, 136084);
            return;
            if (this.Pc == -2)
            {
              this.ioi.setWidth(this.Sd.getWidth());
              j = 0;
              break;
            }
            this.ioi.setWidth(this.Pc);
            j = 0;
            break;
            if (this.RT == -2)
            {
              this.ioi.setHeight(i);
              i = 0;
              break label1072;
            }
            this.ioi.setHeight(this.RT);
            i = 0;
            break label1072;
            bool1 = false;
            break label1105;
            if (Build.VERSION.SDK_INT >= 19) {
              this.ioi.showAsDropDown(this.Sd, this.RU, this.RV, 53);
            } else {
              this.ioi.showAtLocation(this.Sd, 53, this.RU, this.RV);
            }
          }
        }
        i = 0;
      }
    }
  }
  
  private static final class a
    extends ListView
  {
    private boolean So;
    private boolean Sp;
    
    public a(Context paramContext, boolean paramBoolean)
    {
      super(null, a.a.dropDownListViewStyle);
      GMTrace.i(18258308628480L, 136035);
      this.Sp = paramBoolean;
      setCacheColorHint(0);
      GMTrace.o(18258308628480L, 136035);
    }
    
    final int K(int paramInt1, int paramInt2)
    {
      GMTrace.i(18258979717120L, 136040);
      int i = getListPaddingTop();
      int k = getListPaddingBottom();
      getListPaddingLeft();
      getListPaddingRight();
      int j = getDividerHeight();
      Object localObject = getDivider();
      ListAdapter localListAdapter = getAdapter();
      if (localListAdapter == null)
      {
        GMTrace.o(18258979717120L, 136040);
        return i + k;
      }
      i = k + i;
      label98:
      int n;
      if ((j > 0) && (localObject != null))
      {
        localObject = null;
        int m = 0;
        int i1 = localListAdapter.getCount();
        k = 0;
        if (k >= i1) {
          break label234;
        }
        n = localListAdapter.getItemViewType(k);
        if (n == m) {
          break label244;
        }
        localObject = null;
        m = n;
        label130:
        localObject = localListAdapter.getView(k, (View)localObject, this);
        n = ((View)localObject).getLayoutParams().height;
        if (n <= 0) {
          break label215;
        }
        n = View.MeasureSpec.makeMeasureSpec(n, 1073741824);
        label168:
        ((View)localObject).measure(paramInt1, n);
        if (k <= 0) {
          break label247;
        }
        i += j;
      }
      label215:
      label234:
      label244:
      label247:
      for (;;)
      {
        i = ((View)localObject).getMeasuredHeight() + i;
        if (i >= paramInt2)
        {
          GMTrace.o(18258979717120L, 136040);
          return paramInt2;
          j = 0;
          break;
          n = View.MeasureSpec.makeMeasureSpec(0, 0);
          break label168;
        }
        k += 1;
        break label98;
        GMTrace.o(18258979717120L, 136040);
        return i;
        break label130;
      }
    }
    
    public final boolean hasFocus()
    {
      GMTrace.i(18258845499392L, 136039);
      if ((this.Sp) || (super.hasFocus()))
      {
        GMTrace.o(18258845499392L, 136039);
        return true;
      }
      GMTrace.o(18258845499392L, 136039);
      return false;
    }
    
    public final boolean hasWindowFocus()
    {
      GMTrace.i(18258577063936L, 136037);
      if ((this.Sp) || (super.hasWindowFocus()))
      {
        GMTrace.o(18258577063936L, 136037);
        return true;
      }
      GMTrace.o(18258577063936L, 136037);
      return false;
    }
    
    public final boolean isFocused()
    {
      GMTrace.i(18258711281664L, 136038);
      if ((this.Sp) || (super.isFocused()))
      {
        GMTrace.o(18258711281664L, 136038);
        return true;
      }
      GMTrace.o(18258711281664L, 136038);
      return false;
    }
    
    public final boolean isInTouchMode()
    {
      GMTrace.i(18258442846208L, 136036);
      if (((this.Sp) && (this.So)) || (super.isInTouchMode()))
      {
        GMTrace.o(18258442846208L, 136036);
        return true;
      }
      GMTrace.o(18258442846208L, 136036);
      return false;
    }
  }
  
  private final class b
    implements Runnable
  {
    public b()
    {
      GMTrace.i(18259919241216L, 136047);
      GMTrace.o(18259919241216L, 136047);
    }
    
    public final void run()
    {
      GMTrace.i(18260053458944L, 136048);
      AutoFillListPopupWindowBase.this.clearListSelection();
      GMTrace.o(18260053458944L, 136048);
    }
  }
  
  private final class c
    extends DataSetObserver
  {
    private c()
    {
      GMTrace.i(18266898563072L, 136099);
      GMTrace.o(18266898563072L, 136099);
    }
    
    public final void onChanged()
    {
      GMTrace.i(18267032780800L, 136100);
      if (AutoFillListPopupWindowBase.this.ioi.isShowing()) {
        AutoFillListPopupWindowBase.this.show();
      }
      GMTrace.o(18267032780800L, 136100);
    }
    
    public final void onInvalidated()
    {
      GMTrace.i(18267166998528L, 136101);
      AutoFillListPopupWindowBase.this.dismiss();
      GMTrace.o(18267166998528L, 136101);
    }
  }
  
  private final class d
    implements AbsListView.OnScrollListener
  {
    public d()
    {
      GMTrace.i(18259248152576L, 136042);
      GMTrace.o(18259248152576L, 136042);
    }
    
    public final void onScroll(AbsListView paramAbsListView, int paramInt1, int paramInt2, int paramInt3)
    {
      GMTrace.i(18259382370304L, 136043);
      if ((AutoFillListPopupWindowBase.this.jEL != null) && (AutoFillListPopupWindowBase.this.Sb != null) && (AutoFillListPopupWindowBase.this.EU != null) && (AutoFillListPopupWindowBase.this.jEL != null))
      {
        if ((AutoFillListPopupWindowBase.this.jEL.getLastVisiblePosition() == AutoFillListPopupWindowBase.this.EU.getCount() - 1) && (AutoFillListPopupWindowBase.this.jEL.getChildAt(AutoFillListPopupWindowBase.this.jEL.getChildCount() - 1) != null) && (AutoFillListPopupWindowBase.this.jEL.getChildAt(AutoFillListPopupWindowBase.this.jEL.getChildCount() - 1).getBottom() <= AutoFillListPopupWindowBase.this.jEL.getHeight()))
        {
          AutoFillListPopupWindowBase.this.Sb.setVisibility(8);
          GMTrace.o(18259382370304L, 136043);
          return;
        }
        AutoFillListPopupWindowBase.this.Sb.setVisibility(0);
      }
      GMTrace.o(18259382370304L, 136043);
    }
    
    public final void onScrollStateChanged(AbsListView paramAbsListView, int paramInt)
    {
      GMTrace.i(18259516588032L, 136044);
      if ((paramInt == 1) && (!AutoFillListPopupWindowBase.this.isInputMethodNotNeeded()) && (AutoFillListPopupWindowBase.this.ioi.getContentView() != null))
      {
        AutoFillListPopupWindowBase.this.mHandler.removeCallbacks(AutoFillListPopupWindowBase.this.jEM);
        AutoFillListPopupWindowBase.this.jEM.run();
      }
      GMTrace.o(18259516588032L, 136044);
    }
  }
  
  private final class e
    implements View.OnTouchListener
  {
    public e()
    {
      GMTrace.i(18267569651712L, 136104);
      GMTrace.o(18267569651712L, 136104);
    }
    
    public final boolean onTouch(View paramView, MotionEvent paramMotionEvent)
    {
      GMTrace.i(18267703869440L, 136105);
      int i = paramMotionEvent.getAction();
      int j = (int)paramMotionEvent.getX();
      int k = (int)paramMotionEvent.getY();
      if ((i == 0) && (AutoFillListPopupWindowBase.this.ioi != null) && (AutoFillListPopupWindowBase.this.ioi.isShowing()) && (j >= 0) && (j < AutoFillListPopupWindowBase.this.ioi.getWidth()) && (k >= 0) && (k < AutoFillListPopupWindowBase.this.ioi.getHeight())) {
        AutoFillListPopupWindowBase.this.mHandler.postDelayed(AutoFillListPopupWindowBase.this.jEM, 250L);
      }
      for (;;)
      {
        GMTrace.o(18267703869440L, 136105);
        return false;
        if (i == 1) {
          AutoFillListPopupWindowBase.this.mHandler.removeCallbacks(AutoFillListPopupWindowBase.this.jEM);
        }
      }
    }
  }
  
  private final class f
    implements Runnable
  {
    public f()
    {
      GMTrace.i(18260456112128L, 136051);
      GMTrace.o(18260456112128L, 136051);
    }
    
    public final void run()
    {
      GMTrace.i(18260590329856L, 136052);
      if ((AutoFillListPopupWindowBase.this.jEL != null) && (AutoFillListPopupWindowBase.this.jEL.getCount() > AutoFillListPopupWindowBase.this.jEL.getChildCount()) && (AutoFillListPopupWindowBase.this.jEL.getChildCount() <= AutoFillListPopupWindowBase.this.Sa))
      {
        AutoFillListPopupWindowBase.this.ioi.setInputMethodMode(2);
        AutoFillListPopupWindowBase.this.show();
      }
      GMTrace.o(18260590329856L, 136052);
    }
  }
}


/* Location:              /Users/xianghongyan/decompile/dex2jar/classes2-dex2jar.jar!/com/tencent/mm/plugin/appbrand/widget/input/autofill/AutoFillListPopupWindowBase.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */