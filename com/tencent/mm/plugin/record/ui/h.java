package com.tencent.mm.plugin.record.ui;

import android.content.Context;
import android.graphics.Bitmap;
import android.os.Looper;
import android.os.Message;
import android.util.SparseArray;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.TextView;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.R.h;
import com.tencent.mm.ab.i;
import com.tencent.mm.plugin.record.ui.b.d;
import com.tencent.mm.pluginsdk.ui.a.b;
import com.tencent.mm.protocal.c.sp;
import com.tencent.mm.protocal.c.sq;
import com.tencent.mm.protocal.c.sr;
import com.tencent.mm.sdk.platformtools.ae;
import com.tencent.mm.sdk.platformtools.w;
import com.tencent.mm.x.m;
import com.tencent.mm.x.o;
import java.util.LinkedList;
import java.util.List;

public abstract class h
  extends BaseAdapter
{
  ListView EA;
  protected Context context;
  private Runnable lRf;
  protected ae oUH;
  SparseArray<b> oUI;
  boolean oUJ;
  private boolean oUK;
  protected a oUL;
  protected a oUM;
  protected List<sp> oUt;
  private int padding;
  
  public h(Context paramContext, a parama)
  {
    GMTrace.i(7528406581248L, 56091);
    this.oUH = null;
    this.oUI = new SparseArray();
    this.oUJ = false;
    this.oUK = false;
    this.padding = com.tencent.mm.bq.a.fromDPToPix(this.context, 35);
    this.oUt = new LinkedList();
    this.lRf = new Runnable()
    {
      public final void run()
      {
        GMTrace.i(7554713255936L, 56287);
        w.d("MicroMsg.RecordMsgBaseAdapter", "refresh adapter");
        h.this.notifyDataSetChanged();
        GMTrace.o(7554713255936L, 56287);
      }
    };
    this.context = paramContext;
    this.oUH = new ae(Looper.getMainLooper())
    {
      public final void handleMessage(Message paramAnonymousMessage)
      {
        GMTrace.i(7530956718080L, 56110);
        if (paramAnonymousMessage.what == 1)
        {
          w.d("MicroMsg.RecordMsgBaseAdapter", "do play music");
          h.this.notifyDataSetChanged();
        }
        GMTrace.o(7530956718080L, 56110);
      }
    };
    this.oUM = parama;
    GMTrace.o(7528406581248L, 56091);
  }
  
  private static void EJ(String paramString)
  {
    GMTrace.i(7530017193984L, 56103);
    if (!o.fm(paramString))
    {
      com.tencent.mm.ab.h localh = new com.tencent.mm.ab.h();
      localh.username = paramString;
      com.tencent.mm.ab.n.Di().a(localh);
    }
    GMTrace.o(7530017193984L, 56103);
  }
  
  private static int m(sp paramsp)
  {
    GMTrace.i(7529211887616L, 56097);
    switch (paramsp.aHe)
    {
    default: 
      GMTrace.o(7529211887616L, 56097);
      return 3;
    case 2: 
      GMTrace.o(7529211887616L, 56097);
      return 1;
    case 1: 
      GMTrace.o(7529211887616L, 56097);
      return 0;
    }
    GMTrace.o(7529211887616L, 56097);
    return 2;
  }
  
  private sp sV(int paramInt)
  {
    GMTrace.i(7529614540800L, 56100);
    if (this.oUt == null)
    {
      GMTrace.o(7529614540800L, 56100);
      return null;
    }
    if ((paramInt < 0) || (paramInt >= this.oUt.size()))
    {
      GMTrace.o(7529614540800L, 56100);
      return null;
    }
    sp localsp = (sp)this.oUt.get(paramInt);
    GMTrace.o(7529614540800L, 56100);
    return localsp;
  }
  
  public abstract void a(a parama);
  
  public final void aZs()
  {
    GMTrace.i(7528540798976L, 56092);
    this.oUI.put(0, new d(this.context));
    this.oUI.put(1, new com.tencent.mm.plugin.record.ui.b.a(this.oUM, this.EA));
    this.oUI.put(2, new com.tencent.mm.plugin.record.ui.b.e());
    this.oUI.put(3, new com.tencent.mm.plugin.record.ui.b.b(this.oUM, this.oUH));
    this.oUI.put(4, new com.tencent.mm.plugin.record.ui.b.c(this.oUM));
    GMTrace.o(7528540798976L, 56092);
  }
  
  protected final void aZt()
  {
    GMTrace.i(7530151411712L, 56104);
    this.oUH.post(this.lRf);
    GMTrace.o(7530151411712L, 56104);
  }
  
  public abstract void d(com.tencent.mm.plugin.record.ui.a.b paramb);
  
  public final void destroy()
  {
    GMTrace.i(7528943452160L, 56095);
    int i = 0;
    while (i < this.oUI.size())
    {
      b localb = (b)this.oUI.valueAt(i);
      if (localb != null) {
        localb.destroy();
      }
      i += 1;
    }
    if (this.oUM != null)
    {
      this.oUM.aZk();
      this.oUM = null;
    }
    GMTrace.o(7528943452160L, 56095);
  }
  
  public int getCount()
  {
    GMTrace.i(7529480323072L, 56099);
    if (this.oUt == null)
    {
      GMTrace.o(7529480323072L, 56099);
      return 0;
    }
    int i = this.oUt.size();
    GMTrace.o(7529480323072L, 56099);
    return i;
  }
  
  public long getItemId(int paramInt)
  {
    GMTrace.i(7529748758528L, 56101);
    long l = paramInt;
    GMTrace.o(7529748758528L, 56101);
    return l;
  }
  
  public int getItemViewType(int paramInt)
  {
    GMTrace.i(7529077669888L, 56096);
    paramInt = m(sV(paramInt));
    GMTrace.o(7529077669888L, 56096);
    return paramInt;
  }
  
  public View getView(int paramInt, View paramView, ViewGroup paramViewGroup)
  {
    GMTrace.i(7529882976256L, 56102);
    Object localObject1 = sV(paramInt);
    Object localObject2 = (b)this.oUI.get(m((sp)localObject1));
    paramViewGroup = paramView;
    if (paramView == null) {
      paramViewGroup = ((b)localObject2).cY(this.context);
    }
    Object localObject3;
    switch (((sp)localObject1).aHe)
    {
    default: 
      paramView = new com.tencent.mm.plugin.record.ui.a.b();
      paramView.fBc = ((sp)localObject1);
      d(paramView);
      ((b)localObject2).a(paramViewGroup, paramInt, paramView);
      localObject2 = (ImageView)paramViewGroup.findViewById(R.h.cpN);
      paramView = (TextView)paramViewGroup.findViewById(R.h.cpR);
      paramView.setText(com.tencent.mm.pluginsdk.ui.d.h.b(paramView.getContext(), ((sp)localObject1).tPt, paramView.getTextSize()));
      paramView = (TextView)paramViewGroup.findViewById(R.h.cpQ);
      w.d("MicroMsg.RecordMsgBaseAdapter", "datasrctime %s", new Object[] { ((sp)localObject1).tPv });
      if (((sp)localObject1).tPv != null)
      {
        if (this.oUJ)
        {
          localObject3 = ((sp)localObject1).tPv;
          paramView.setText(((String)localObject3).substring(((String)localObject3).indexOf("-") + 1));
        }
      }
      else
      {
        label225:
        if (paramInt != 0) {
          break label523;
        }
        if (((sp)localObject1).tPr == null) {
          break label488;
        }
        paramView = ((sp)localObject1).tPr.tPJ;
        ((ImageView)localObject2).setVisibility(0);
        if (!paramView.tQg) {
          break label400;
        }
        EJ(paramView.tQf);
        if (!com.tencent.mm.ae.a.e.iP(paramView.tQf)) {
          break label388;
        }
        com.tencent.mm.an.n.Ja().a(com.tencent.mm.ae.a.e.iS(paramView.tQf), (ImageView)localObject2);
        label291:
        if (paramInt != getCount() - 1) {
          break label818;
        }
        paramViewGroup.findViewById(R.h.cpP).setVisibility(8);
      }
      break;
    }
    for (;;)
    {
      GMTrace.o(7529882976256L, 56102);
      return paramViewGroup;
      paramView = new com.tencent.mm.plugin.record.ui.a.a();
      break;
      paramView = new com.tencent.mm.plugin.record.ui.a.c();
      break;
      localObject3 = ((sp)localObject1).tPv.split(" ");
      if (localObject3.length < 2)
      {
        paramView.setText(((sp)localObject1).tPv);
        break label225;
      }
      paramView.setText(localObject3[1]);
      break label225;
      label388:
      a.b.a((ImageView)localObject2, paramView.tQf);
      break label291;
      label400:
      if ((paramView.tQb) && ((!m.zF().equals(paramView.fFB)) || (!paramView.fFB.equals(paramView.toUser))))
      {
        EJ(paramView.fFB);
        a.b.a((ImageView)localObject2, paramView.fFB);
        break label291;
      }
      ((ImageView)localObject2).setVisibility(8);
      paramViewGroup.setPadding(this.padding, paramViewGroup.getPaddingTop(), this.padding, paramViewGroup.getPaddingBottom());
      this.oUK = true;
      break label291;
      label488:
      ((ImageView)localObject2).setVisibility(8);
      paramViewGroup.setPadding(this.padding, paramViewGroup.getPaddingTop(), this.padding, paramViewGroup.getPaddingBottom());
      this.oUK = true;
      break label291;
      label523:
      if ((paramInt > 0) && (!this.oUK))
      {
        paramView = "";
        localObject3 = ((sp)localObject1).tPr.tPJ;
        if (sV(paramInt - 1).tPr.tPJ.tQg) {
          paramView = sV(paramInt - 1).tPr.tPJ.tQf;
        }
        for (;;)
        {
          ((ImageView)localObject2).setVisibility(0);
          if (!((sp)localObject1).tPr.tPJ.tQg) {
            break label719;
          }
          localObject1 = ((sp)localObject1).tPr.tPJ.tQf;
          if (paramView.equals(localObject1)) {
            break label710;
          }
          EJ((String)localObject1);
          if (!com.tencent.mm.ae.a.e.iP(((sr)localObject3).tQf)) {
            break label700;
          }
          com.tencent.mm.an.n.Ja().a(com.tencent.mm.ae.a.e.iS(((sr)localObject3).tQf), (ImageView)localObject2);
          break;
          if (sV(paramInt - 1).tPr.tPJ.tQb) {
            paramView = sV(paramInt - 1).tPr.tPJ.fFB;
          }
        }
        label700:
        a.b.a((ImageView)localObject2, (String)localObject1);
        break label291;
        label710:
        ((ImageView)localObject2).setVisibility(4);
        break label291;
        label719:
        if (((sp)localObject1).tPr.tPJ.tQb)
        {
          localObject1 = ((sp)localObject1).tPr.tPJ.fFB;
          if (!paramView.equals(localObject1))
          {
            EJ((String)localObject1);
            a.b.a((ImageView)localObject2, (String)localObject1);
            break label291;
          }
          ((ImageView)localObject2).setVisibility(4);
          break label291;
        }
        ((ImageView)localObject2).setVisibility(4);
        break label291;
      }
      ((ImageView)localObject2).setVisibility(8);
      paramViewGroup.setPadding(this.padding, paramViewGroup.getPaddingTop(), this.padding, paramViewGroup.getPaddingBottom());
      break label291;
      label818:
      paramViewGroup.findViewById(R.h.cpP).setVisibility(0);
    }
  }
  
  public int getViewTypeCount()
  {
    GMTrace.i(7529346105344L, 56098);
    GMTrace.o(7529346105344L, 56098);
    return 5;
  }
  
  public static abstract interface a
  {
    public abstract Bitmap a(b paramb);
    
    public abstract Bitmap a(c paramc);
    
    public abstract void a(a parama);
    
    public abstract void aZk();
    
    public static final class a
    {
      public sp fBc;
      public ImageView fBd;
      public int fBe;
      public int height;
      public long oUO;
      public int width;
      
      public a()
      {
        GMTrace.i(7522366783488L, 56046);
        GMTrace.o(7522366783488L, 56046);
      }
    }
    
    public static final class b
    {
      public sp fBc;
      public boolean fBf;
      public boolean fBg;
      public int maxWidth;
      public long oUO;
      
      public b()
      {
        GMTrace.i(7521695694848L, 56041);
        GMTrace.o(7521695694848L, 56041);
      }
    }
    
    public static final class c
    {
      public sp fBc;
      public long oUO;
      
      public c()
      {
        GMTrace.i(7535385903104L, 56143);
        GMTrace.o(7535385903104L, 56143);
      }
    }
  }
  
  public static abstract interface b
  {
    public abstract void a(View paramView, int paramInt, com.tencent.mm.plugin.record.ui.a.b paramb);
    
    public abstract View cY(Context paramContext);
    
    public abstract void destroy();
    
    public abstract void pause();
  }
}


/* Location:              /Users/xianghongyan/decompile/dex2jar/classes2-dex2jar.jar!/com/tencent/mm/plugin/record/ui/h.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */