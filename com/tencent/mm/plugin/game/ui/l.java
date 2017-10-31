package com.tencent.mm.plugin.game.ui;

import android.content.Context;
import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;
import android.util.SparseArray;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.R.h;
import com.tencent.mm.R.i;
import com.tencent.mm.plugin.game.model.ai;
import com.tencent.mm.plugin.game.model.c;
import com.tencent.mm.plugin.game.model.m;
import com.tencent.mm.plugin.game.widget.TextProgressBar;
import com.tencent.mm.sdk.platformtools.af;
import com.tencent.mm.sdk.platformtools.bg;
import com.tencent.mm.sdk.platformtools.w;
import com.tencent.mm.x.ap;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.concurrent.ConcurrentHashMap;

abstract class l
  extends b<c>
{
  protected int mBs;
  protected Context mContext;
  private a mIe;
  protected int mJk;
  protected int mKn;
  private com.tencent.mm.plugin.game.model.l.b mKr;
  protected e mKs;
  private DialogInterface.OnClickListener mLc;
  protected View.OnClickListener mLd;
  protected int mNf;
  protected boolean mNg;
  protected boolean mNh;
  protected boolean mNi;
  protected ConcurrentHashMap<String, m> mNj;
  protected SparseArray<View> mNk;
  
  public l(Context paramContext)
  {
    super(paramContext);
    GMTrace.i(12720619388928L, 94776);
    this.mNg = true;
    this.mNh = false;
    this.mNi = false;
    this.mKn = 14;
    this.mBs = 0;
    this.mKr = new com.tencent.mm.plugin.game.model.l.b()
    {
      public final void g(int paramAnonymousInt, String paramAnonymousString, boolean paramAnonymousBoolean)
      {
        GMTrace.i(12696594415616L, 94597);
        if ((!paramAnonymousBoolean) || (l.this.mNj == null) || (paramAnonymousString == null))
        {
          GMTrace.o(12696594415616L, 94597);
          return;
        }
        Object localObject;
        try
        {
          localObject = l.this.mNj.values().iterator();
          while (((Iterator)localObject).hasNext())
          {
            m localm = (m)((Iterator)localObject).next();
            if ((localm != null) && (localm.mzY != null) && ((localm.mzY.field_appId.equals(paramAnonymousString)) || (localm.mzY.field_packageName.equals(paramAnonymousString))))
            {
              localm.cA(l.this.mContext);
              localm.aEn();
            }
          }
          paramAnonymousInt = 0;
        }
        catch (Exception paramAnonymousString)
        {
          w.e("MicroMsg.GameListAdapter", paramAnonymousString.getMessage());
          GMTrace.o(12696594415616L, 94597);
          return;
        }
        while (paramAnonymousInt < l.this.mBJ.size())
        {
          localObject = (c)l.this.mBJ.get(paramAnonymousInt);
          if ((((c)localObject).type == 0) && ((((c)localObject).field_appId.equals(paramAnonymousString)) || (((c)localObject).field_packageName.equals(paramAnonymousString))) && (l.a(l.this) != null))
          {
            l.a(l.this).oB(paramAnonymousInt);
            GMTrace.o(12696594415616L, 94597);
            return;
          }
          paramAnonymousInt += 1;
        }
        GMTrace.o(12696594415616L, 94597);
      }
    };
    this.mLd = new View.OnClickListener()
    {
      public final void onClick(View paramAnonymousView)
      {
        GMTrace.i(12766521851904L, 95118);
        if (!(paramAnonymousView.getTag() instanceof c))
        {
          w.e("MicroMsg.GameListAdapter", "No button tag retrived, ignore click");
          GMTrace.o(12766521851904L, 95118);
          return;
        }
        paramAnonymousView = (c)paramAnonymousView.getTag();
        if (!l.this.mNj.containsKey(paramAnonymousView.field_appId))
        {
          w.e("MicroMsg.GameListAdapter", "No DownloadInfo found");
          GMTrace.o(12766521851904L, 95118);
          return;
        }
        m localm = (m)l.this.mNj.get(paramAnonymousView.field_appId);
        localm.cA(l.this.mContext);
        l.this.mKs.mHt = paramAnonymousView.mzp;
        l.this.mKs.mBs = l.this.mBs;
        l.this.mKs.a(paramAnonymousView, localm);
        GMTrace.o(12766521851904L, 95118);
      }
    };
    this.mLc = new DialogInterface.OnClickListener()
    {
      public final void onClick(DialogInterface paramAnonymousDialogInterface, int paramAnonymousInt)
      {
        GMTrace.i(12774843351040L, 95180);
        l.this.notifyDataSetChanged();
        GMTrace.o(12774843351040L, 95180);
      }
    };
    this.mContext = paramContext;
    this.mNj = new ConcurrentHashMap();
    com.tencent.mm.plugin.game.model.l.a(this.mKr);
    this.mNk = new SparseArray();
    this.mKs = new e(paramContext);
    this.mKs.mHJ = this.mLc;
    GMTrace.o(12720619388928L, 94776);
  }
  
  public void P(final LinkedList<c> paramLinkedList)
  {
    GMTrace.i(12721156259840L, 94780);
    if (paramLinkedList == null)
    {
      GMTrace.o(12721156259840L, 94780);
      return;
    }
    ap.xC().C(new Runnable()
    {
      public final void run()
      {
        GMTrace.i(12701828907008L, 94636);
        l.a(l.this, paramLinkedList);
        af.u(new Runnable()
        {
          public final void run()
          {
            GMTrace.i(12728001363968L, 94831);
            l.b(l.this, l.1.this.mNl);
            w.i("MicroMsg.GameListAdapter", "add size: %d", new Object[] { Integer.valueOf(l.1.this.mNl.size()) });
            GMTrace.o(12728001363968L, 94831);
          }
        });
        GMTrace.o(12701828907008L, 94636);
      }
    });
    GMTrace.o(12721156259840L, 94780);
  }
  
  public void Q(final LinkedList<c> paramLinkedList)
  {
    GMTrace.i(12721290477568L, 94781);
    if (paramLinkedList == null)
    {
      GMTrace.o(12721290477568L, 94781);
      return;
    }
    com.tencent.mm.sdk.f.e.post(new Runnable()
    {
      public final void run()
      {
        GMTrace.i(12673240530944L, 94423);
        l.a(l.this, paramLinkedList);
        af.u(new Runnable()
        {
          public final void run()
          {
            GMTrace.i(12659952975872L, 94324);
            l.c(l.this, l.2.this.mNl);
            w.i("MicroMsg.GameListAdapter", "set size: %d", new Object[] { Integer.valueOf(l.2.this.mNl.size()) });
            GMTrace.o(12659952975872L, 94324);
          }
        });
        GMTrace.o(12673240530944L, 94423);
      }
    }, "game_get_download_info");
    GMTrace.o(12721290477568L, 94781);
  }
  
  abstract void a(c paramc, b paramb);
  
  abstract void a(c paramc, b paramb, int paramInt);
  
  public void a(a parama)
  {
    GMTrace.i(12722230001664L, 94788);
    this.mIe = parama;
    GMTrace.o(12722230001664L, 94788);
  }
  
  public void b(SparseArray<View> paramSparseArray)
  {
    GMTrace.i(12722095783936L, 94787);
    if (paramSparseArray != null) {}
    for (this.mNk = paramSparseArray;; this.mNk = new SparseArray())
    {
      notifyDataSetChanged();
      GMTrace.o(12722095783936L, 94787);
      return;
    }
  }
  
  public void clear()
  {
    GMTrace.i(12722498437120L, 94790);
    super.clear();
    com.tencent.mm.plugin.game.model.l.b(this.mKr);
    GMTrace.o(12722498437120L, 94790);
  }
  
  public int getItemViewType(int paramInt)
  {
    GMTrace.i(12721424695296L, 94782);
    paramInt = ((c)getItem(paramInt)).type;
    GMTrace.o(12721424695296L, 94782);
    return paramInt;
  }
  
  public View getView(int paramInt, View paramView, ViewGroup paramViewGroup)
  {
    GMTrace.i(12721693130752L, 94784);
    c localc = (c)getItem(paramInt);
    int i;
    View localView;
    if (paramView == null)
    {
      paramView = this.mContext;
      switch (localc.type)
      {
      default: 
        i = 0;
        localView = View.inflate(paramView, i, null);
        paramView = new b();
        paramView.mNq = ((ViewGroup)localView.findViewById(R.h.bZp));
        paramView.mNp = ((TextView)localView.findViewById(R.h.bNk));
        paramView.mGS = ((ImageView)localView.findViewById(R.h.bMC));
        paramView.mGT = ((TextView)localView.findViewById(R.h.bNj));
        paramView.mNr = ((TextView)localView.findViewById(R.h.cfX));
        paramView.mNs = ((TextView)localView.findViewById(R.h.bME));
        paramView.mNt = ((TextView)localView.findViewById(R.h.bLp));
        paramView.mNu = ((Button)localView.findViewById(R.h.bMs));
        paramView.mNv = ((TextProgressBar)localView.findViewById(R.h.bMt));
        paramView.mNy = ((LinearLayout)localView.findViewById(R.h.bLc));
        paramView.mNw = ((GameListSocialView)localView.findViewById(R.h.bNw));
        paramView.mNx = ((ViewGroup)localView.findViewById(R.h.bAa));
        localView.setTag(paramView);
        paramViewGroup = paramView;
        label264:
        switch (localc.type)
        {
        }
        break;
      }
    }
    for (;;)
    {
      GMTrace.o(12721693130752L, 94784);
      return localView;
      i = this.mNf;
      break;
      i = R.i.bLc;
      break;
      paramViewGroup = (b)paramView.getTag();
      localView = paramView;
      break label264;
      a(localc, paramViewGroup, paramInt);
      if ((this.mJk == 2) && (!localc.mzq))
      {
        ai.a(this.mContext, 1004, localc.position, localc.field_appId, this.mBs, localc.mzp);
        localc.mzq = true;
        continue;
        a(localc, paramViewGroup);
      }
    }
  }
  
  public int getViewTypeCount()
  {
    GMTrace.i(12721558913024L, 94783);
    GMTrace.o(12721558913024L, 94783);
    return 2;
  }
  
  public void oD(int paramInt)
  {
    GMTrace.i(12720887824384L, 94778);
    this.mJk = paramInt;
    GMTrace.o(12720887824384L, 94778);
  }
  
  public void oz(int paramInt)
  {
    GMTrace.i(12720753606656L, 94777);
    this.mBs = paramInt;
    GMTrace.o(12720753606656L, 94777);
  }
  
  public void refresh()
  {
    GMTrace.i(12721022042112L, 94779);
    notifyDataSetChanged();
    GMTrace.o(12721022042112L, 94779);
  }
  
  public void w(View paramView, int paramInt)
  {
    GMTrace.i(12722364219392L, 94789);
    paramView = (b)paramView.getTag();
    c localc = (c)this.mBJ.get(paramInt);
    if (paramView != null)
    {
      this.mKs.a(paramView.mNv, paramView.mNu, localc, (m)this.mNj.get(localc.field_appId));
      GMTrace.o(12722364219392L, 94789);
      return;
    }
    w.e("MicroMsg.GameListAdapter", "holder should not be null, %d", new Object[] { Integer.valueOf(paramInt) });
    GMTrace.o(12722364219392L, 94789);
  }
  
  public void zl(String paramString)
  {
    GMTrace.i(12722901090304L, 94793);
    if (bg.mZ(paramString))
    {
      GMTrace.o(12722901090304L, 94793);
      return;
    }
    if (!this.mNj.containsKey(paramString))
    {
      GMTrace.o(12722901090304L, 94793);
      return;
    }
    paramString = (m)this.mNj.get(paramString);
    if (paramString == null)
    {
      GMTrace.o(12722901090304L, 94793);
      return;
    }
    paramString.aEo();
    GMTrace.o(12722901090304L, 94793);
  }
  
  public void zm(String paramString)
  {
    GMTrace.i(12722766872576L, 94792);
    if (bg.mZ(paramString))
    {
      GMTrace.o(12722766872576L, 94792);
      return;
    }
    if (!this.mNj.containsKey(paramString))
    {
      GMTrace.o(12722766872576L, 94792);
      return;
    }
    paramString = (m)this.mNj.get(paramString);
    if (paramString == null)
    {
      GMTrace.o(12722766872576L, 94792);
      return;
    }
    paramString.aEn();
    GMTrace.o(12722766872576L, 94792);
  }
  
  public void zn(String paramString)
  {
    GMTrace.i(12722632654848L, 94791);
    int i = 0;
    if (i < this.mBJ.size()) {
      if (!((c)this.mBJ.get(i)).field_appId.equals(paramString)) {}
    }
    for (paramString = (c)this.mBJ.get(i);; paramString = null)
    {
      if (paramString != null) {
        break label81;
      }
      GMTrace.o(12722632654848L, 94791);
      return;
      i += 1;
      break;
    }
    label81:
    if (!this.mNj.containsKey(paramString.field_appId))
    {
      w.e("MicroMsg.GameListAdapter", "No DownloadInfo found");
      GMTrace.o(12722632654848L, 94791);
      return;
    }
    m localm = (m)this.mNj.get(paramString.field_appId);
    this.mKs.a(paramString, localm);
    GMTrace.o(12722632654848L, 94791);
  }
  
  public static abstract interface a
  {
    public abstract void oB(int paramInt);
  }
  
  protected static final class b
  {
    public ImageView mGS;
    public TextView mGT;
    public TextView mNp;
    public ViewGroup mNq;
    public TextView mNr;
    public TextView mNs;
    public TextView mNt;
    public Button mNu;
    public TextProgressBar mNv;
    public GameListSocialView mNw;
    public ViewGroup mNx;
    public LinearLayout mNy;
    
    protected b()
    {
      GMTrace.i(12699278770176L, 94617);
      GMTrace.o(12699278770176L, 94617);
    }
  }
}


/* Location:              /Users/xianghongyan/decompile/dex2jar/classes2-dex2jar.jar!/com/tencent/mm/plugin/game/ui/l.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */