package com.tencent.mm.plugin.favorite.ui.base;

import android.content.Context;
import android.content.res.Resources;
import android.util.AttributeSet;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.ImageButton;
import android.widget.LinearLayout;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.R.e;
import com.tencent.mm.R.h;
import com.tencent.mm.R.l;
import com.tencent.mm.plugin.favorite.b.x;
import com.tencent.mm.sdk.platformtools.bg;
import com.tencent.mm.sdk.platformtools.w;
import com.tencent.mm.ui.base.MMTagPanel;
import com.tencent.mm.ui.base.MMTagPanel.d;
import com.tencent.mm.ui.widget.MMEditText;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class FavSearchActionView
  extends LinearLayout
{
  public FavTagPanel lSI;
  public List<Integer> lTy;
  private ImageButton lUn;
  public List<String> lUo;
  public List<String> lUp;
  public a lUq;
  
  public FavSearchActionView(Context paramContext, AttributeSet paramAttributeSet)
  {
    super(paramContext, paramAttributeSet);
    GMTrace.i(6462046732288L, 48146);
    this.lTy = new LinkedList();
    this.lUo = new LinkedList();
    this.lUp = new LinkedList();
    GMTrace.o(6462046732288L, 48146);
  }
  
  public final void axZ()
  {
    GMTrace.i(6462449385472L, 48149);
    if ((this.lTy.isEmpty()) && (this.lUo.isEmpty()))
    {
      this.lSI.UK(getResources().getString(R.l.dwX));
      GMTrace.o(6462449385472L, 48149);
      return;
    }
    this.lSI.UK("");
    GMTrace.o(6462449385472L, 48149);
  }
  
  protected void onFinishInflate()
  {
    GMTrace.i(6462180950016L, 48147);
    super.onFinishInflate();
    this.lUn = ((ImageButton)findViewById(R.h.ctj));
    this.lSI = ((FavTagPanel)findViewById(R.h.bHt));
    if (this.lSI != null)
    {
      FavTagPanel localFavTagPanel = this.lSI;
      int i = getResources().getColor(R.e.white);
      if (localFavTagPanel.vJg != null) {
        localFavTagPanel.vJg.setTextColor(i);
      }
      this.lSI.vIX = 0;
      this.lSI.vIZ = 0;
      this.lSI.ndZ = 0;
      this.lSI.nea = R.e.aQR;
      this.lSI.lTI = 0;
      this.lSI.lTH = R.e.white;
      this.lSI.UK(getResources().getString(R.l.dwX));
      this.lSI.lw(true);
      this.lSI.vIU = false;
      this.lSI.vIV = true;
      localFavTagPanel = this.lSI;
      FavTagPanel.a local1 = new FavTagPanel.a()
      {
        public final void asn()
        {
          GMTrace.i(6449430265856L, 48052);
          if (FavSearchActionView.d(FavSearchActionView.this) == null)
          {
            GMTrace.o(6449430265856L, 48052);
            return;
          }
          FavSearchActionView.d(FavSearchActionView.this).Qu();
          GMTrace.o(6449430265856L, 48052);
        }
        
        public final void h(boolean paramAnonymousBoolean, int paramAnonymousInt)
        {
          GMTrace.i(6449832919040L, 48055);
          GMTrace.o(6449832919040L, 48055);
        }
        
        public final void vX(String paramAnonymousString)
        {
          GMTrace.i(6448759177216L, 48047);
          w.d("MicroMsg.FavSearchActionView", "unselected tag %s", new Object[] { paramAnonymousString });
          FavSearchActionView.a(FavSearchActionView.this).removeTag(paramAnonymousString);
          vZ(paramAnonymousString);
          GMTrace.o(6448759177216L, 48047);
        }
        
        public final void vY(String paramAnonymousString)
        {
          GMTrace.i(6448893394944L, 48048);
          GMTrace.o(6448893394944L, 48048);
        }
        
        public final void vZ(String paramAnonymousString)
        {
          GMTrace.i(6449027612672L, 48049);
          FavSearchActionView.a(FavSearchActionView.this, FavSearchActionView.a(FavSearchActionView.this).bXq());
          FavSearchActionView.b(FavSearchActionView.this).remove(paramAnonymousString);
          FavSearchActionView.c(FavSearchActionView.this);
          if (FavSearchActionView.d(FavSearchActionView.this) == null)
          {
            GMTrace.o(6449027612672L, 48049);
            return;
          }
          FavSearchActionView.d(FavSearchActionView.this).a(FavSearchActionView.e(FavSearchActionView.this), FavSearchActionView.f(FavSearchActionView.this), FavSearchActionView.b(FavSearchActionView.this), true);
          GMTrace.o(6449027612672L, 48049);
        }
        
        public final void wa(String paramAnonymousString)
        {
          GMTrace.i(6449161830400L, 48050);
          FavSearchActionView.a(FavSearchActionView.this, FavSearchActionView.a(FavSearchActionView.this).bXq());
          FavSearchActionView.c(FavSearchActionView.this);
          if (FavSearchActionView.d(FavSearchActionView.this) == null)
          {
            GMTrace.o(6449161830400L, 48050);
            return;
          }
          FavSearchActionView.d(FavSearchActionView.this).a(FavSearchActionView.e(FavSearchActionView.this), FavSearchActionView.f(FavSearchActionView.this), FavSearchActionView.b(FavSearchActionView.this));
          GMTrace.o(6449161830400L, 48050);
        }
        
        public final void wb(String paramAnonymousString)
        {
          GMTrace.i(6449296048128L, 48051);
          FavSearchActionView.a(FavSearchActionView.this, paramAnonymousString);
          FavSearchActionView.d(FavSearchActionView.this).a(FavSearchActionView.e(FavSearchActionView.this), FavSearchActionView.f(FavSearchActionView.this), FavSearchActionView.b(FavSearchActionView.this), false);
          GMTrace.o(6449296048128L, 48051);
        }
        
        public final void xA(String paramAnonymousString)
        {
          GMTrace.i(6449698701312L, 48054);
          w.d("MicroMsg.FavSearchActionView", "unselected type %s", new Object[] { paramAnonymousString });
          FavSearchActionView.a(FavSearchActionView.this).xB(paramAnonymousString);
          xz(paramAnonymousString);
          GMTrace.o(6449698701312L, 48054);
        }
        
        public final void xz(String paramAnonymousString)
        {
          GMTrace.i(6449564483584L, 48053);
          FavSearchActionView.a(FavSearchActionView.this, FavSearchActionView.a(FavSearchActionView.this).bXq());
          FavSearchActionView.e(FavSearchActionView.this).remove(x.T(FavSearchActionView.this.getContext(), paramAnonymousString));
          FavSearchActionView.c(FavSearchActionView.this);
          if (FavSearchActionView.d(FavSearchActionView.this) == null)
          {
            GMTrace.o(6449564483584L, 48053);
            return;
          }
          FavSearchActionView.d(FavSearchActionView.this).a(FavSearchActionView.e(FavSearchActionView.this), FavSearchActionView.f(FavSearchActionView.this), FavSearchActionView.b(FavSearchActionView.this), true);
          GMTrace.o(6449564483584L, 48053);
        }
      };
      localFavTagPanel.lUw = local1;
      localFavTagPanel.vJd = local1;
    }
    if (this.lUn != null) {
      this.lUn.setOnClickListener(new View.OnClickListener()
      {
        public final void onClick(View paramAnonymousView)
        {
          GMTrace.i(6448490741760L, 48045);
          if (FavSearchActionView.d(FavSearchActionView.this) == null)
          {
            GMTrace.o(6448490741760L, 48045);
            return;
          }
          paramAnonymousView = FavSearchActionView.a(FavSearchActionView.this);
          Iterator localIterator = paramAnonymousView.lUv.iterator();
          MMTagPanel.d locald;
          while (localIterator.hasNext())
          {
            locald = (MMTagPanel.d)localIterator.next();
            paramAnonymousView.removeView(locald.vJv);
            paramAnonymousView.a(locald);
          }
          paramAnonymousView.lUv.clear();
          paramAnonymousView.bXx();
          paramAnonymousView = FavSearchActionView.a(FavSearchActionView.this);
          localIterator = paramAnonymousView.tQK.iterator();
          while (localIterator.hasNext())
          {
            locald = (MMTagPanel.d)localIterator.next();
            paramAnonymousView.removeView(locald.vJv);
            paramAnonymousView.a(locald);
          }
          paramAnonymousView.tQK.clear();
          paramAnonymousView.bXx();
          FavSearchActionView.a(FavSearchActionView.this).bXr();
          FavSearchActionView.e(FavSearchActionView.this).clear();
          FavSearchActionView.f(FavSearchActionView.this).clear();
          FavSearchActionView.b(FavSearchActionView.this).clear();
          FavSearchActionView.d(FavSearchActionView.this).a(FavSearchActionView.e(FavSearchActionView.this), FavSearchActionView.f(FavSearchActionView.this), FavSearchActionView.b(FavSearchActionView.this), true);
          FavSearchActionView.c(FavSearchActionView.this);
          GMTrace.o(6448490741760L, 48045);
        }
      });
    }
    GMTrace.o(6462180950016L, 48147);
  }
  
  public final void xy(String paramString)
  {
    GMTrace.i(6462315167744L, 48148);
    this.lUp.clear();
    paramString = bg.ap(paramString, "").split(" ");
    int j = paramString.length;
    int i = 0;
    while (i < j)
    {
      String str = paramString[i];
      if (!bg.mZ(str)) {
        this.lUp.add(str);
      }
      i += 1;
    }
    GMTrace.o(6462315167744L, 48148);
  }
  
  public static abstract interface a
  {
    public abstract void Qu();
    
    public abstract void a(List<Integer> paramList, List<String> paramList1, List<String> paramList2);
    
    public abstract void a(List<Integer> paramList, List<String> paramList1, List<String> paramList2, boolean paramBoolean);
  }
}


/* Location:              /Users/xianghongyan/decompile/dex2jar/classes2-dex2jar.jar!/com/tencent/mm/plugin/favorite/ui/base/FavSearchActionView.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */