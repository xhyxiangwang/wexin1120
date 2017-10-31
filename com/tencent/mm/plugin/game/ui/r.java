package com.tencent.mm.plugin.game.ui;

import android.content.Context;
import android.content.res.Resources;
import android.text.Spannable;
import android.text.SpannableString;
import android.text.style.ForegroundColorSpan;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.view.ViewTreeObserver.OnGlobalLayoutListener;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.R.e;
import com.tencent.mm.R.f;
import com.tencent.mm.R.g;
import com.tencent.mm.R.h;
import com.tencent.mm.R.i;
import com.tencent.mm.R.k;
import com.tencent.mm.plugin.game.d.b;
import com.tencent.mm.plugin.game.d.e;
import com.tencent.mm.plugin.game.d.e.a.a;
import com.tencent.mm.pluginsdk.ui.d.h;
import com.tencent.mm.protocal.c.ui;
import com.tencent.mm.protocal.c.uj;
import com.tencent.mm.sdk.platformtools.bg;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public final class r
  extends BaseAdapter
{
  Context context;
  boolean fuq;
  ArrayList<b> kIh;
  int mBx;
  int mMA;
  boolean mPh;
  int mPi;
  int mPj;
  int mPk;
  int mPl;
  private int mPm;
  boolean mPn;
  boolean mPo;
  private ArrayList<d> mPp;
  
  public r(Context paramContext)
  {
    GMTrace.i(12673508966400L, 94425);
    this.fuq = false;
    this.mPh = false;
    this.mMA = 0;
    this.mPi = 0;
    this.mPj = 0;
    this.mPk = 0;
    this.mPl = 0;
    this.mBx = 0;
    this.mPn = false;
    this.mPo = false;
    this.context = paramContext;
    this.kIh = null;
    this.mPm = paramContext.getResources().getColor(R.e.aOv);
    GMTrace.o(12673508966400L, 94425);
  }
  
  private void a(TextView paramTextView, String paramString)
  {
    GMTrace.i(12674448490496L, 94432);
    if (!bg.mZ(paramString))
    {
      if (this.mPp == null) {
        this.mPp = new ArrayList();
      }
      for (;;)
      {
        paramString = new StringBuilder(paramString);
        localObject = new d();
        for (int i = paramString.indexOf("<em>"); i >= 0; i = paramString.indexOf("<em>"))
        {
          ((d)localObject).start = i;
          paramString.delete(i, i + 4);
          i = paramString.indexOf("</em>");
          if (i < 0) {
            break;
          }
          ((d)localObject).end = i;
          paramString.delete(i, i + 5);
          this.mPp.add(localObject);
        }
        this.mPp.clear();
      }
      paramString = new SpannableString(paramString.toString());
      Object localObject = this.mPp.iterator();
      while (((Iterator)localObject).hasNext())
      {
        d locald = (d)((Iterator)localObject).next();
        if (locald.start < locald.end) {
          paramString.setSpan(new ForegroundColorSpan(this.mPm), locald.start, locald.end, 33);
        }
      }
      paramTextView.setText(paramString);
      paramTextView.setVisibility(0);
      GMTrace.o(12674448490496L, 94432);
      return;
    }
    paramTextView.setVisibility(8);
    GMTrace.o(12674448490496L, 94432);
  }
  
  public final int getCount()
  {
    GMTrace.i(12673643184128L, 94426);
    if (this.kIh == null)
    {
      GMTrace.o(12673643184128L, 94426);
      return 0;
    }
    int i = this.kIh.size();
    GMTrace.o(12673643184128L, 94426);
    return i;
  }
  
  public final Object getItem(int paramInt)
  {
    GMTrace.i(12673777401856L, 94427);
    Object localObject = this.kIh.get(paramInt);
    GMTrace.o(12673777401856L, 94427);
    return localObject;
  }
  
  public final long getItemId(int paramInt)
  {
    GMTrace.i(12673911619584L, 94428);
    long l = paramInt;
    GMTrace.o(12673911619584L, 94428);
    return l;
  }
  
  public final int getItemViewType(int paramInt)
  {
    GMTrace.i(12674045837312L, 94429);
    paramInt = ((b)getItem(paramInt)).type;
    GMTrace.o(12674045837312L, 94429);
    return paramInt;
  }
  
  public final View getView(int paramInt, final View paramView, final ViewGroup paramViewGroup)
  {
    GMTrace.i(12674314272768L, 94431);
    b localb = (b)getItem(paramInt);
    Object localObject1;
    Object localObject2;
    if (paramView == null)
    {
      localObject1 = new a();
      paramView = this.context;
      switch (localb.type)
      {
      case 4: 
      default: 
        paramInt = 0;
        localObject2 = View.inflate(paramView, paramInt, null);
        ((a)localObject1).iiK = ((View)localObject2).findViewById(R.h.bMI);
        ((a)localObject1).mPt = ((ImageView)((View)localObject2).findViewById(R.h.bML));
        ((a)localObject1).mPu = ((TextView)((View)localObject2).findViewById(R.h.bMM));
        ((a)localObject1).mPv = ((TextView)((View)localObject2).findViewById(R.h.bMH));
        ((a)localObject1).mPw = ((TextView)((View)localObject2).findViewById(R.h.bMJ));
        ((a)localObject1).mPx = ((TextView)((View)localObject2).findViewById(R.h.bMN));
        ((a)localObject1).mPy = ((View)localObject2).findViewById(R.h.bMK);
        ((a)localObject1).mPz = ((TextView)((View)localObject2).findViewById(R.h.cyL));
        ((a)localObject1).mPA = ((TextView)((View)localObject2).findViewById(R.h.bzG));
        ((View)localObject2).setTag(localObject1);
        paramViewGroup = (ViewGroup)localObject1;
        paramView = (View)localObject2;
        if (((a)localObject1).mPu != null)
        {
          paramViewGroup = (ViewGroup)localObject1;
          paramView = (View)localObject2;
          if (((a)localObject1).mPw != null)
          {
            paramView = ((a)localObject1).mPu;
            paramViewGroup = ((a)localObject1).mPw;
            paramView.getViewTreeObserver().addOnGlobalLayoutListener(new ViewTreeObserver.OnGlobalLayoutListener()
            {
              public final void onGlobalLayout()
              {
                GMTrace.i(12701426253824L, 94633);
                if (paramView.getLineCount() > 1)
                {
                  paramView.setMaxLines(2);
                  paramViewGroup.setMaxLines(1);
                  GMTrace.o(12701426253824L, 94633);
                  return;
                }
                paramViewGroup.setMaxLines(2);
                GMTrace.o(12701426253824L, 94633);
              }
            });
            paramView = (View)localObject2;
            paramViewGroup = (ViewGroup)localObject1;
          }
        }
        label302:
        switch (localb.type)
        {
        case 4: 
        default: 
          label348:
          switch (localb.type)
          {
          }
          break;
        }
        break;
      }
    }
    for (;;)
    {
      GMTrace.o(12674314272768L, 94431);
      return paramView;
      paramInt = R.i.cWY;
      break;
      paramInt = R.i.cXf;
      break;
      paramInt = R.i.cXe;
      break;
      paramInt = R.i.cXa;
      break;
      paramInt = R.i.cXb;
      break;
      paramInt = R.i.cXd;
      break;
      paramViewGroup = (a)paramView.getTag();
      break label302;
      if (!bg.mZ(localb.iconUrl))
      {
        localObject1 = new e.a.a();
        ((e.a.a)localObject1).hCN = false;
        ((e.a.a)localObject1).hCP = false;
        e.aFP().a(paramViewGroup.mPt, localb.iconUrl, ((e.a.a)localObject1).aFQ());
      }
      a(paramViewGroup.mPu, localb.name);
      a(paramViewGroup.mPv, localb.mPB);
      a(paramViewGroup.mPw, localb.iDL);
      break label348;
      if (!bg.mZ(localb.iconUrl))
      {
        localObject1 = new e.a.a();
        ((e.a.a)localObject1).hCN = false;
        ((e.a.a)localObject1).hCP = false;
        ((e.a.a)localObject1).mRD = true;
        e.aFP().a(paramViewGroup.mPt, localb.iconUrl, ((e.a.a)localObject1).aFQ());
        paramViewGroup.mPt.setVisibility(0);
        label615:
        a(paramViewGroup.mPu, localb.name);
        a(paramViewGroup.mPw, localb.iDL);
        if (bg.mZ(localb.hhb)) {
          break label735;
        }
        paramViewGroup.mPz.setText(h.a(this.context, localb.hhb));
        paramViewGroup.mPz.setVisibility(0);
      }
      for (;;)
      {
        if (localb.hUw <= 0L) {
          break label747;
        }
        paramViewGroup.mPA.setText(b.f(this.context, localb.hUw * 1000L));
        paramViewGroup.mPA.setVisibility(0);
        break;
        paramViewGroup.mPt.setVisibility(8);
        break label615;
        label735:
        paramViewGroup.mPz.setVisibility(8);
      }
      label747:
      paramViewGroup.mPA.setVisibility(8);
      break label348;
      if (!bg.mZ(localb.iconUrl))
      {
        localObject1 = new e.a.a();
        ((e.a.a)localObject1).hCN = false;
        ((e.a.a)localObject1).hCP = false;
        e.aFP().a(paramViewGroup.mPt, localb.iconUrl, ((e.a.a)localObject1).aFQ());
      }
      a(paramViewGroup.mPu, localb.name);
      a(paramViewGroup.mPv, localb.mPB);
      a(paramViewGroup.mPw, localb.iDL);
      localObject1 = paramViewGroup.mPx;
      localObject2 = localb.mPE;
      StringBuilder localStringBuilder = new StringBuilder();
      if (!bg.bX((List)localObject2))
      {
        int i = ((LinkedList)localObject2).size();
        paramInt = 0;
        while (paramInt < i - 1)
        {
          localStringBuilder.append((String)((LinkedList)localObject2).get(paramInt) + "\n");
          paramInt += 1;
        }
        localStringBuilder.append((String)((LinkedList)localObject2).get(i - 1));
        ((TextView)localObject1).setVisibility(0);
        ((TextView)localObject1).setText(localStringBuilder.toString());
        break label348;
      }
      ((TextView)localObject1).setVisibility(8);
      break label348;
      paramViewGroup.mPw.setText(localb.name);
      break label348;
      paramViewGroup.mPt.setImageResource(R.k.dqE);
      paramViewGroup.mPu.setText(localb.name);
      break label348;
      if (localb.mPI) {
        paramViewGroup.iiK.setBackgroundResource(R.g.aYd);
      }
      for (;;)
      {
        paramInt = this.context.getResources().getDimensionPixelSize(R.f.aSm);
        paramViewGroup.iiK.setPadding(0, paramInt, 0, paramInt);
        break;
        paramViewGroup.iiK.setBackgroundResource(R.g.aYc);
      }
      if (localb.mPH) {
        paramViewGroup.mPy.setVisibility(8);
      } else {
        paramViewGroup.mPy.setVisibility(0);
      }
    }
  }
  
  public final int getViewTypeCount()
  {
    GMTrace.i(12674180055040L, 94430);
    GMTrace.o(12674180055040L, 94430);
    return 7;
  }
  
  private static final class a
  {
    public View iiK;
    TextView mPA;
    ImageView mPt;
    TextView mPu;
    TextView mPv;
    TextView mPw;
    TextView mPx;
    View mPy;
    TextView mPz;
    
    public a()
    {
      GMTrace.i(12733370073088L, 94871);
      GMTrace.o(12733370073088L, 94871);
    }
  }
  
  public static final class b
  {
    public int actionType;
    public String appId;
    public String fum;
    public long hUw;
    public String hhb;
    public String iDL;
    public String iconUrl;
    public String mPB;
    public uj mPC;
    public String mPD;
    public LinkedList<String> mPE;
    public int mPF;
    public int mPG;
    public boolean mPH;
    public boolean mPI;
    public r.c mPJ;
    public String name;
    public int type;
    
    public b()
    {
      GMTrace.i(12719545647104L, 94768);
      this.mPH = false;
      this.mPI = false;
      GMTrace.o(12719545647104L, 94768);
    }
    
    public static b a(ui paramui)
    {
      GMTrace.i(17974706569216L, 133922);
      b localb = new b();
      localb.type = 2;
      localb.name = paramui.fuw;
      localb.iDL = paramui.mCK;
      localb.iconUrl = paramui.osy;
      localb.mPD = paramui.tSb;
      localb.mPF = paramui.tSw;
      localb.mPG = paramui.tSx;
      localb.appId = paramui.mDD;
      localb.hhb = paramui.mFw;
      localb.hUw = paramui.bzG;
      localb.mPJ = new r.c(paramui.tSb, (byte)0);
      GMTrace.o(17974706569216L, 133922);
      return localb;
    }
    
    public static b ac(int paramInt, String paramString)
    {
      GMTrace.i(12719679864832L, 94769);
      b localb = new b();
      localb.type = paramInt;
      localb.name = paramString;
      localb.mPJ = new r.c();
      GMTrace.o(12719679864832L, 94769);
      return localb;
    }
  }
  
  public static final class c
  {
    public int actionType;
    String appId;
    int fKV;
    int mPF;
    int mPG;
    String mPK;
    String mPL;
    int position;
    int type;
    
    public c()
    {
      GMTrace.i(12745986539520L, 94965);
      GMTrace.o(12745986539520L, 94965);
    }
    
    public c(int paramInt1, int paramInt2, String paramString1, String paramString2)
    {
      GMTrace.i(12746389192704L, 94968);
      this.actionType = paramInt1;
      this.type = paramInt2;
      this.appId = paramString1;
      if (paramInt1 == 2) {
        this.mPK = paramString2;
      }
      GMTrace.o(12746389192704L, 94968);
    }
    
    public c(String paramString)
    {
      GMTrace.i(12746120757248L, 94966);
      this.actionType = 2;
      this.mPK = paramString;
      GMTrace.o(12746120757248L, 94966);
    }
    
    public c(String paramString, byte paramByte)
    {
      GMTrace.i(12746254974976L, 94967);
      this.actionType = 2;
      this.type = 3;
      this.mPK = paramString;
      GMTrace.o(12746254974976L, 94967);
    }
  }
  
  private final class d
  {
    int end;
    int start;
    
    public d()
    {
      GMTrace.i(12767192940544L, 95123);
      this.start = -1;
      this.end = -1;
      GMTrace.o(12767192940544L, 95123);
    }
  }
}


/* Location:              /Users/xianghongyan/decompile/dex2jar/classes2-dex2jar.jar!/com/tencent/mm/plugin/game/ui/r.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */