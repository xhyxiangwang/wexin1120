package com.tencent.mm.plugin.webview.ui.tools.widget.input;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AbsListView.LayoutParams;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemClickListener;
import android.widget.BaseAdapter;
import android.widget.GridView;
import android.widget.ImageView;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.R.f;
import com.tencent.mm.R.g;
import com.tencent.mm.R.h;
import com.tencent.mm.R.i;
import com.tencent.mm.R.l;
import com.tencent.mm.bq.a;
import com.tencent.mm.bs.e;
import com.tencent.mm.ui.v;

public class WebViewSmileyGrid
  extends GridView
{
  AdapterView.OnItemClickListener WK;
  int jFh;
  int jFi;
  int jFj;
  int jFk;
  int jFl;
  int jFm;
  c sCN;
  a sCO;
  
  public WebViewSmileyGrid(Context paramContext, AttributeSet paramAttributeSet)
  {
    super(paramContext, paramAttributeSet);
    GMTrace.i(12083085180928L, 90026);
    this.jFi = 0;
    this.jFk = 0;
    this.jFl = 0;
    this.jFm = 0;
    this.WK = new AdapterView.OnItemClickListener()
    {
      public final void onItemClick(AdapterView<?> paramAnonymousAdapterView, View paramAnonymousView, int paramAnonymousInt, long paramAnonymousLong)
      {
        GMTrace.i(12078924431360L, 89995);
        if (paramAnonymousInt == WebViewSmileyGrid.a(WebViewSmileyGrid.this).getCount() - 1)
        {
          if (WebViewSmileyGrid.b(WebViewSmileyGrid.this).sCU != null) {
            WebViewSmileyGrid.b(WebViewSmileyGrid.this).sCU.acx();
          }
          GMTrace.o(12078924431360L, 89995);
          return;
        }
        if (WebViewSmileyGrid.c(WebViewSmileyGrid.this) * (WebViewSmileyGrid.d(WebViewSmileyGrid.this) - 1) + paramAnonymousInt >= WebViewSmileyGrid.e(WebViewSmileyGrid.this))
        {
          GMTrace.o(12078924431360L, 89995);
          return;
        }
        int i = WebViewSmileyGrid.c(WebViewSmileyGrid.this);
        int j = WebViewSmileyGrid.d(WebViewSmileyGrid.this);
        if (WebViewSmileyGrid.b(WebViewSmileyGrid.this).sCU != null) {
          WebViewSmileyGrid.b(WebViewSmileyGrid.this).sCU.append(e.bOH().kb(i * (j - 1) + paramAnonymousInt));
        }
        GMTrace.o(12078924431360L, 89995);
      }
    };
    GMTrace.o(12083085180928L, 90026);
  }
  
  private final class a
    extends BaseAdapter
  {
    private a()
    {
      GMTrace.i(12082279874560L, 90020);
      GMTrace.o(12082279874560L, 90020);
    }
    
    public final int getCount()
    {
      GMTrace.i(12082414092288L, 90021);
      int i = WebViewSmileyGrid.d(WebViewSmileyGrid.this);
      GMTrace.o(12082414092288L, 90021);
      return i;
    }
    
    public final Object getItem(int paramInt)
    {
      GMTrace.i(12082548310016L, 90022);
      GMTrace.o(12082548310016L, 90022);
      return null;
    }
    
    public final long getItemId(int paramInt)
    {
      GMTrace.i(12082682527744L, 90023);
      long l = paramInt;
      GMTrace.o(12082682527744L, 90023);
      return l;
    }
    
    public final View getView(int paramInt, View paramView, ViewGroup paramViewGroup)
    {
      GMTrace.i(12082816745472L, 90024);
      if ((paramView == null) || (paramView.getTag() == null))
      {
        paramView = v.fa(WebViewSmileyGrid.this.getContext()).inflate(R.i.djM, null);
        paramView.setLayoutParams(new AbsListView.LayoutParams(-1, (WebViewSmileyGrid.b(WebViewSmileyGrid.this).jFw - a.U(WebViewSmileyGrid.this.getContext(), R.f.aRW) - a.U(WebViewSmileyGrid.this.getContext(), R.f.aTO)) / WebViewSmileyGrid.f(WebViewSmileyGrid.this)));
        paramViewGroup = new WebViewSmileyGrid.b(paramView);
        paramView.setTag(paramViewGroup);
        if (paramInt != getCount() - 1) {
          break label170;
        }
        paramViewGroup.jjR.setImageResource(R.g.aYj);
        paramViewGroup.jjR.setContentDescription(WebViewSmileyGrid.this.getContext().getString(R.l.dPN));
      }
      for (;;)
      {
        GMTrace.o(12082816745472L, 90024);
        return paramView;
        paramViewGroup = (WebViewSmileyGrid.b)paramView.getTag();
        break;
        label170:
        paramInt = (WebViewSmileyGrid.d(WebViewSmileyGrid.this) - 1) * WebViewSmileyGrid.c(WebViewSmileyGrid.this) + paramInt;
        if (paramInt > WebViewSmileyGrid.e(WebViewSmileyGrid.this) - 1)
        {
          paramViewGroup.jjR.setImageDrawable(null);
        }
        else
        {
          Drawable localDrawable = e.bOH().jZ(paramInt);
          paramViewGroup.jjR.setImageDrawable(localDrawable);
        }
      }
    }
  }
  
  private static final class b
  {
    ImageView jjR;
    
    public b(View paramView)
    {
      GMTrace.i(12078521778176L, 89992);
      this.jjR = ((ImageView)paramView.findViewById(R.h.biV));
      GMTrace.o(12078521778176L, 89992);
    }
  }
}


/* Location:              /Users/xianghongyan/decompile/dex2jar/classes2-dex2jar.jar!/com/tencent/mm/plugin/webview/ui/tools/widget/input/WebViewSmileyGrid.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */