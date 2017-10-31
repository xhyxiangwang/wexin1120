package com.tencent.mm.plugin.favorite.ui.base;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.TextView;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.sdk.platformtools.bg;
import com.tencent.mm.sdk.platformtools.w;
import com.tencent.mm.ui.base.MMTagPanel;
import com.tencent.mm.ui.base.MMTagPanel.a;
import com.tencent.mm.ui.base.MMTagPanel.d;
import java.util.Iterator;
import java.util.LinkedList;

public class FavTagPanel
  extends MMTagPanel
{
  public LinkedList<MMTagPanel.d> lUv;
  a lUw;
  public View.OnClickListener lUx;
  
  public FavTagPanel(Context paramContext, AttributeSet paramAttributeSet)
  {
    super(paramContext, paramAttributeSet);
    GMTrace.i(6450369789952L, 48059);
    this.lUv = new LinkedList();
    this.lUw = null;
    this.lUx = new View.OnClickListener()
    {
      public final void onClick(final View paramAnonymousView)
      {
        GMTrace.i(6447953870848L, 48041);
        if (((Integer)paramAnonymousView.getTag()).intValue() == 0)
        {
          FavTagPanel.a(FavTagPanel.this, (TextView)paramAnonymousView);
          if (FavTagPanel.a(FavTagPanel.this) != null)
          {
            paramAnonymousView.post(new Runnable()
            {
              public final void run()
              {
                GMTrace.i(6459496595456L, 48127);
                FavTagPanel.a(FavTagPanel.this);
                ((TextView)paramAnonymousView).getText().toString();
                GMTrace.o(6459496595456L, 48127);
              }
            });
            GMTrace.o(6447953870848L, 48041);
          }
        }
        else
        {
          FavTagPanel.b(FavTagPanel.this, (TextView)paramAnonymousView);
          if (FavTagPanel.a(FavTagPanel.this) != null) {
            paramAnonymousView.post(new Runnable()
            {
              public final void run()
              {
                GMTrace.i(6451309314048L, 48066);
                FavTagPanel.a(FavTagPanel.this).xA(((TextView)paramAnonymousView).getText().toString());
                GMTrace.o(6451309314048L, 48066);
              }
            });
          }
        }
        GMTrace.o(6447953870848L, 48041);
      }
    };
    GMTrace.o(6450369789952L, 48059);
  }
  
  public FavTagPanel(Context paramContext, AttributeSet paramAttributeSet, int paramInt)
  {
    super(paramContext, paramAttributeSet, paramInt);
    GMTrace.i(6450235572224L, 48058);
    this.lUv = new LinkedList();
    this.lUw = null;
    this.lUx = new View.OnClickListener()
    {
      public final void onClick(final View paramAnonymousView)
      {
        GMTrace.i(6447953870848L, 48041);
        if (((Integer)paramAnonymousView.getTag()).intValue() == 0)
        {
          FavTagPanel.a(FavTagPanel.this, (TextView)paramAnonymousView);
          if (FavTagPanel.a(FavTagPanel.this) != null)
          {
            paramAnonymousView.post(new Runnable()
            {
              public final void run()
              {
                GMTrace.i(6459496595456L, 48127);
                FavTagPanel.a(FavTagPanel.this);
                ((TextView)paramAnonymousView).getText().toString();
                GMTrace.o(6459496595456L, 48127);
              }
            });
            GMTrace.o(6447953870848L, 48041);
          }
        }
        else
        {
          FavTagPanel.b(FavTagPanel.this, (TextView)paramAnonymousView);
          if (FavTagPanel.a(FavTagPanel.this) != null) {
            paramAnonymousView.post(new Runnable()
            {
              public final void run()
              {
                GMTrace.i(6451309314048L, 48066);
                FavTagPanel.a(FavTagPanel.this).xA(((TextView)paramAnonymousView).getText().toString());
                GMTrace.o(6451309314048L, 48066);
              }
            });
          }
        }
        GMTrace.o(6447953870848L, 48041);
      }
    };
    GMTrace.o(6450235572224L, 48058);
  }
  
  protected final void aya()
  {
    GMTrace.i(6450504007680L, 48060);
    if (this.tQK.size() > 0)
    {
      GMTrace.o(6450504007680L, 48060);
      return;
    }
    if (this.lUv.isEmpty())
    {
      GMTrace.o(6450504007680L, 48060);
      return;
    }
    String str = ((MMTagPanel.d)this.lUv.getLast()).vJu;
    xB(str);
    if (this.lUw != null) {
      this.lUw.xz(str);
    }
    bXx();
    GMTrace.o(6450504007680L, 48060);
  }
  
  public final void xB(String paramString)
  {
    GMTrace.i(6450638225408L, 48061);
    if (bg.mZ(paramString))
    {
      w.w("MicroMsg.FavTagPanel", "want to remove type, but it is null or empty");
      GMTrace.o(6450638225408L, 48061);
      return;
    }
    Iterator localIterator = this.lUv.iterator();
    while (localIterator.hasNext())
    {
      MMTagPanel.d locald = (MMTagPanel.d)localIterator.next();
      if (paramString.equals(locald.vJu))
      {
        this.lUv.remove(locald);
        removeView(locald.vJv);
        a(locald);
        bXx();
        GMTrace.o(6450638225408L, 48061);
        return;
      }
    }
    w.w("MicroMsg.FavTagPanel", "want to remove type %s, but it not exsited!", new Object[] { paramString });
    GMTrace.o(6450638225408L, 48061);
  }
  
  public static abstract interface a
    extends MMTagPanel.a
  {
    public abstract void xA(String paramString);
    
    public abstract void xz(String paramString);
  }
}


/* Location:              /Users/xianghongyan/decompile/dex2jar/classes2-dex2jar.jar!/com/tencent/mm/plugin/favorite/ui/base/FavTagPanel.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */