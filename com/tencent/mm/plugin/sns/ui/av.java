package com.tencent.mm.plugin.sns.ui;

import android.content.Context;
import android.view.ContextMenu;
import android.view.ContextMenu.ContextMenuInfo;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.View.OnCreateContextMenuListener;
import android.view.View.OnTouchListener;
import android.view.animation.Animation;
import android.view.animation.Animation.AnimationListener;
import android.view.animation.ScaleAnimation;
import android.widget.LinearLayout;
import android.widget.ListView;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.g.a.jg;
import com.tencent.mm.g.a.pq;
import com.tencent.mm.g.a.pr;
import com.tencent.mm.g.a.ps;
import com.tencent.mm.plugin.sns.i.j;
import com.tencent.mm.plugin.sns.model.ao;
import com.tencent.mm.plugin.sns.model.ao.b;
import com.tencent.mm.plugin.sns.storage.n;
import com.tencent.mm.plugin.sns.ui.a.a.c;
import com.tencent.mm.plugin.sns.ui.a.e;
import com.tencent.mm.plugin.sns.ui.a.e.a;
import com.tencent.mm.plugin.sns.ui.a.f;
import com.tencent.mm.plugin.sns.ui.a.f.a;
import com.tencent.mm.plugin.sns.ui.widget.SnsCommentPreloadTextView;
import com.tencent.mm.protocal.c.amn;
import com.tencent.mm.protocal.c.amo;
import com.tencent.mm.protocal.c.bhc;
import com.tencent.mm.protocal.c.cr;
import com.tencent.mm.protocal.c.nn;
import com.tencent.mm.sdk.platformtools.w;
import com.tencent.mm.ui.MMActivity;
import com.tencent.mm.ui.tools.l;
import com.tencent.mm.x.ag.b.a;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Set;

public final class av
  implements y
{
  public MMActivity fsU;
  protected com.tencent.mm.sdk.platformtools.ae handler;
  com.tencent.mm.sdk.b.c iSb;
  private ListView inK;
  public com.tencent.mm.ui.widget.g kkG;
  public l kwF;
  public View.OnTouchListener qBi;
  boolean qGP;
  public bg qHC;
  com.tencent.mm.sdk.b.c qHN;
  com.tencent.mm.sdk.b.c qHO;
  com.tencent.mm.sdk.b.c qHP;
  protected ScaleAnimation qHn;
  protected ScaleAnimation qHo;
  public ar qHu;
  private int qHx;
  public k qHz;
  protected x qPh;
  public j qPi;
  protected LinkedList<SnsCommentPreloadTextView> qPj;
  public HashMap<Integer, WeakReference<View>> qPk;
  public View qPl;
  public int qPm;
  int qPn;
  protected HashMap<Integer, View> qPo;
  public HashMap<String, String> qPp;
  private HashMap<Integer, com.tencent.mm.plugin.sns.ui.a.a> qPq;
  private HashMap<Integer, a.c> qPr;
  public View.OnClickListener qPs;
  public View.OnClickListener qPt;
  public HashMap<String, Boolean> qPu;
  private c qPv;
  public com.tencent.mm.plugin.sns.ui.b.b qgD;
  protected HashMap<String, Integer> qyp;
  protected int requestType;
  
  public av(MMActivity paramMMActivity, ListView paramListView, com.tencent.mm.plugin.sns.ui.b.b paramb, j paramj, int paramInt, final x paramx)
  {
    GMTrace.i(8574767988736L, 63887);
    this.qPj = new LinkedList();
    this.qPk = new HashMap();
    this.qGP = false;
    this.qHx = 0;
    this.qPm = -1;
    this.qPn = 0;
    this.qyp = new HashMap();
    this.qPo = new HashMap();
    this.requestType = 0;
    this.handler = new com.tencent.mm.sdk.platformtools.ae();
    this.qPp = new HashMap();
    this.qHO = new com.tencent.mm.sdk.b.c() {};
    this.qHN = new com.tencent.mm.sdk.b.c() {};
    this.qHP = new com.tencent.mm.sdk.b.c() {};
    this.qPq = new HashMap();
    this.qPq.put(Integer.valueOf(6), new f());
    this.qPq.put(Integer.valueOf(2), new e());
    this.qPq.put(Integer.valueOf(3), new e());
    this.qPq.put(Integer.valueOf(4), new e());
    this.qPq.put(Integer.valueOf(5), new e());
    this.qPq.put(Integer.valueOf(0), new com.tencent.mm.plugin.sns.ui.a.c());
    this.qPq.put(Integer.valueOf(1), new com.tencent.mm.plugin.sns.ui.a.d());
    this.qPq.put(Integer.valueOf(7), new com.tencent.mm.plugin.sns.ui.a.d());
    this.qPq.put(Integer.valueOf(8), new com.tencent.mm.plugin.sns.ui.a.d());
    this.qPq.put(Integer.valueOf(9), new com.tencent.mm.plugin.sns.ui.a.g());
    this.qPq.put(Integer.valueOf(11), new com.tencent.mm.plugin.sns.ui.a.b());
    this.qPq.put(Integer.valueOf(10), new com.tencent.mm.plugin.sns.ui.a.d());
    this.qPr = new HashMap();
    this.qPr.put(Integer.valueOf(6), new f.a());
    this.qPr.put(Integer.valueOf(2), new e.a());
    this.qPr.put(Integer.valueOf(3), new e.a());
    this.qPr.put(Integer.valueOf(4), new e.a());
    this.qPr.put(Integer.valueOf(5), new e.a());
    this.qPr.put(Integer.valueOf(0), new e.a());
    this.qPr.put(Integer.valueOf(1), new e.a());
    this.qPr.put(Integer.valueOf(7), new e.a());
    this.qPr.put(Integer.valueOf(8), new e.a());
    this.qPr.put(Integer.valueOf(9), new e.a());
    this.qPr.put(Integer.valueOf(10), new e.a());
    this.qPs = new View.OnClickListener()
    {
      public final void onClick(View paramAnonymousView)
      {
        GMTrace.i(8751398518784L, 65203);
        w.i("MicroMsg.SnsTimeLineBaseAdapter", "showCommentBtn");
        com.tencent.mm.plugin.sns.abtest.a.bfJ();
        if (!(paramAnonymousView.getTag() instanceof a.c))
        {
          w.e("MicroMsg.SnsTimeLineBaseAdapter", "showCommentBtn err1");
          GMTrace.o(8751398518784L, 65203);
          return;
        }
        a.c localc = (a.c)paramAnonymousView.getTag();
        if ((localc.qUE != null) && (localc.qUE.uyu.tKc == 21))
        {
          amo localamo = localc.qvb;
          if ((!com.tencent.mm.x.m.zF().equals(localc.qUE.jWW)) && ((localamo == null) || (localamo.fQZ == 0)))
          {
            com.tencent.mm.plugin.sns.lucky.ui.a.e(av.this.fsU, localc.qUe.uS(0));
            GMTrace.o(8751398518784L, 65203);
            return;
          }
        }
        if ((av.this.fsU instanceof u)) {
          ((u)av.this.fsU).cB(paramAnonymousView);
        }
        GMTrace.o(8751398518784L, 65203);
      }
    };
    this.qPt = new View.OnClickListener()
    {
      public final void onClick(View paramAnonymousView)
      {
        GMTrace.i(8505511641088L, 63371);
        if (!(paramAnonymousView.getTag() instanceof a.c))
        {
          GMTrace.o(8505511641088L, 63371);
          return;
        }
        paramAnonymousView = (a.c)paramAnonymousView.getTag();
        if (paramAnonymousView == null)
        {
          GMTrace.o(8505511641088L, 63371);
          return;
        }
        if ((av.this.qyp.containsKey(paramAnonymousView.fxL)) && (((Integer)av.this.qyp.get(paramAnonymousView.fxL)).equals(Integer.valueOf(1))))
        {
          av.this.qyp.put(paramAnonymousView.fxL, Integer.valueOf(2));
          av.this.qPh.notifyDataSetChanged();
          GMTrace.o(8505511641088L, 63371);
          return;
        }
        av.this.qyp.put(paramAnonymousView.fxL, Integer.valueOf(1));
        if (paramAnonymousView.msJ.getTop() < 0)
        {
          av.this.qgD.c(paramAnonymousView.msJ, paramAnonymousView.position, paramAnonymousView.msJ.getTop(), paramAnonymousView.qTH.bla());
          GMTrace.o(8505511641088L, 63371);
          return;
        }
        av.this.qPh.notifyDataSetChanged();
        GMTrace.o(8505511641088L, 63371);
      }
    };
    this.qBi = com.tencent.mm.sdk.platformtools.bg.bOc();
    this.qPu = new HashMap();
    this.qPv = new c();
    this.iSb = new com.tencent.mm.sdk.b.c() {};
    this.qPh = paramx;
    this.qPi = paramj;
    w.d("MicroMsg.SnsTimeLineBaseAdapter", "SnsTimeLineAdapter 2");
    this.inK = paramListView;
    com.tencent.mm.plugin.sns.model.ae.bhm();
    this.fsU = paramMMActivity;
    this.qgD = paramb;
    this.kwF = new l(paramMMActivity);
    this.kkG = new com.tencent.mm.ui.widget.g(paramMMActivity);
    this.qHu = new ar(paramMMActivity, (byte)0);
    this.qHn = new ScaleAnimation(0.0F, 1.0F, 1.0F, 1.0F, 1, 1.0F, 1, 0.0F);
    this.qHn.setDuration(150L);
    this.qHo = new ScaleAnimation(1.0F, 0.0F, 1.0F, 1.0F, 1, 1.0F, 1, 0.0F);
    this.qHo.setDuration(150L);
    this.qHz = new k(paramMMActivity, 0, paramj.qxL);
    this.requestType = 10;
    this.qHC = new bg(paramMMActivity, new bg.a()
    {
      public final void bmI()
      {
        GMTrace.i(8710193676288L, 64896);
        paramx.notifyDataSetChanged();
        GMTrace.o(8710193676288L, 64896);
      }
    }, 0, paramj.qxL);
    com.tencent.mm.sdk.b.a.uLm.b(this.iSb);
    GMTrace.o(8574767988736L, 63887);
  }
  
  public static String Ix(String paramString)
  {
    GMTrace.i(8575573295104L, 63893);
    if (com.tencent.mm.sdk.platformtools.bg.mZ(paramString))
    {
      GMTrace.o(8575573295104L, 63893);
      return paramString;
    }
    int i = paramString.indexOf("://");
    String str = paramString;
    if (i != -1) {
      str = paramString.substring(i + 3);
    }
    i = str.indexOf("/");
    paramString = str;
    if (i != -1) {
      paramString = str.substring(0, i);
    }
    GMTrace.o(8575573295104L, 63893);
    return paramString;
  }
  
  public static String Iy(String paramString)
  {
    GMTrace.i(8575975948288L, 63896);
    w.d("MicroMsg.SnsTimeLineBaseAdapter", "url:" + paramString);
    paramString = com.tencent.mm.plugin.sns.c.a.ifN.r(paramString, "timeline");
    GMTrace.o(8575975948288L, 63896);
    return paramString;
  }
  
  public static String a(bhc parambhc, Context paramContext)
  {
    GMTrace.i(8575841730560L, 63895);
    parambhc = com.tencent.mm.plugin.sns.c.a.ifN.f(paramContext, parambhc.uyt.nas, "timeline");
    GMTrace.o(8575841730560L, 63895);
    return parambhc;
  }
  
  protected static int d(bhc parambhc)
  {
    GMTrace.i(8575439077376L, 63892);
    if (parambhc.uyu.tKc == 1)
    {
      int i = parambhc.uyu.tKd.size();
      if (i <= 1)
      {
        GMTrace.o(8575439077376L, 63892);
        return 2;
      }
      if (i <= 3)
      {
        GMTrace.o(8575439077376L, 63892);
        return 3;
      }
      if (i <= 6)
      {
        GMTrace.o(8575439077376L, 63892);
        return 4;
      }
      GMTrace.o(8575439077376L, 63892);
      return 5;
    }
    switch (parambhc.uyu.tKc)
    {
    case 3: 
    case 6: 
    case 9: 
    case 10: 
    case 11: 
    case 12: 
    case 13: 
    case 16: 
    case 17: 
    case 18: 
    case 19: 
    case 20: 
    default: 
      GMTrace.o(8575439077376L, 63892);
      return 1;
    case 4: 
      GMTrace.o(8575439077376L, 63892);
      return 0;
    case 5: 
      GMTrace.o(8575439077376L, 63892);
      return 1;
    case 2: 
      GMTrace.o(8575439077376L, 63892);
      return 6;
    case 1: 
    case 8: 
      GMTrace.o(8575439077376L, 63892);
      return 3;
    case 7: 
      GMTrace.o(8575439077376L, 63892);
      return 2;
    case 14: 
      GMTrace.o(8575439077376L, 63892);
      return 7;
    case 15: 
      if (parambhc.uyB == 1)
      {
        GMTrace.o(8575439077376L, 63892);
        return 1;
      }
      GMTrace.o(8575439077376L, 63892);
      return 9;
    }
    GMTrace.o(8575439077376L, 63892);
    return 11;
  }
  
  protected static String e(bhc parambhc)
  {
    GMTrace.i(8575707512832L, 63894);
    parambhc = com.tencent.mm.plugin.sns.c.a.ifN.r(parambhc.uyu.mDo, "timeline");
    GMTrace.o(8575707512832L, 63894);
    return parambhc;
  }
  
  public final void B(Runnable paramRunnable)
  {
    GMTrace.i(8576110166016L, 63897);
    this.qPh.blG();
    paramRunnable.run();
    GMTrace.o(8576110166016L, 63897);
  }
  
  public final void Ir(String paramString)
  {
    GMTrace.i(16045326729216L, 119547);
    w.d("MicroMsg.SnsTimeLineBaseAdapter", "postDescTranslateStart, id: %s", new Object[] { paramString });
    Object localObject = com.tencent.mm.plugin.sns.model.ae.bhp().Hz(paramString);
    if (localObject != null)
    {
      localObject = ((com.tencent.mm.plugin.sns.storage.m)localObject).bkg();
      if ((this.qyp.containsKey(localObject)) && (((Integer)this.qyp.get(localObject)).equals(Integer.valueOf(1)))) {
        this.qyp.put(localObject, Integer.valueOf(2));
      }
      ao.bO(paramString, 2);
      notifyDataSetChanged();
    }
    GMTrace.o(16045326729216L, 119547);
  }
  
  public final void Is(String paramString)
  {
    GMTrace.i(16045460946944L, 119548);
    w.d("MicroMsg.SnsTimeLineBaseAdapter", "postDescTranslateFinish, id: %s", new Object[] { paramString });
    ao.bO(paramString, 2);
    notifyDataSetChanged();
    GMTrace.o(16045460946944L, 119548);
  }
  
  public final void It(String paramString)
  {
    GMTrace.i(16045595164672L, 119549);
    w.d("MicroMsg.SnsTimeLineBaseAdapter", "unTranslatePostDesc, id: %s", new Object[] { paramString });
    ao.bP(paramString, 2);
    notifyDataSetChanged();
    GMTrace.o(16045595164672L, 119549);
  }
  
  public final void Iu(String paramString)
  {
    GMTrace.i(16045729382400L, 119550);
    w.d("MicroMsg.SnsTimeLineBaseAdapter", "commentTranslateStart, id: %s", new Object[] { paramString });
    ao.bO(paramString, 2);
    notifyDataSetChanged();
    GMTrace.o(16045729382400L, 119550);
  }
  
  public final void Iv(String paramString)
  {
    GMTrace.i(16045863600128L, 119551);
    w.d("MicroMsg.SnsTimeLineBaseAdapter", "commentTranslateFinish, id: %s", new Object[] { paramString });
    ao.bO(paramString, 2);
    notifyDataSetChanged();
    GMTrace.o(16045863600128L, 119551);
  }
  
  public final void Iw(String paramString)
  {
    GMTrace.i(16045997817856L, 119552);
    w.d("MicroMsg.SnsTimeLineBaseAdapter", "unTranslateComment, id: %s", new Object[] { paramString });
    ao.bP(paramString, 2);
    notifyDataSetChanged();
    GMTrace.o(16045997817856L, 119552);
  }
  
  public final void a(SnsCommentPreloadTextView paramSnsCommentPreloadTextView)
  {
    GMTrace.i(8574231117824L, 63883);
    this.qPj.add(paramSnsCommentPreloadTextView);
    GMTrace.o(8574231117824L, 63883);
  }
  
  public final void bnC()
  {
    GMTrace.i(8573828464640L, 63880);
    this.qyp.clear();
    GMTrace.o(8573828464640L, 63880);
  }
  
  public final u bnD()
  {
    GMTrace.i(8573962682368L, 63881);
    if ((this.fsU instanceof u))
    {
      u localu = (u)this.fsU;
      GMTrace.o(8573962682368L, 63881);
      return localu;
    }
    GMTrace.o(8573962682368L, 63881);
    return null;
  }
  
  public final SnsCommentPreloadTextView bnE()
  {
    GMTrace.i(8574096900096L, 63882);
    if (this.qPj.size() == 0)
    {
      localSnsCommentPreloadTextView = new SnsCommentPreloadTextView(this.fsU);
      GMTrace.o(8574096900096L, 63882);
      return localSnsCommentPreloadTextView;
    }
    SnsCommentPreloadTextView localSnsCommentPreloadTextView = (SnsCommentPreloadTextView)this.qPj.removeFirst();
    GMTrace.o(8574096900096L, 63882);
    return localSnsCommentPreloadTextView;
  }
  
  public final boolean bnF()
  {
    GMTrace.i(8574365335552L, 63884);
    if (this.qPj != null) {
      this.qPj.clear();
    }
    if (this.qPr != null) {
      this.qPr.clear();
    }
    if (this.qPq != null) {
      this.qPq.clear();
    }
    com.tencent.mm.pluginsdk.ui.d.h.clearCache();
    com.tencent.mm.kiss.widget.textview.c.gTt.xO();
    GMTrace.o(8574365335552L, 63884);
    return true;
  }
  
  public final void bnG()
  {
    GMTrace.i(8574633771008L, 63886);
    this.qPh.blG();
    GMTrace.o(8574633771008L, 63886);
  }
  
  public final void bnH()
  {
    GMTrace.i(8574902206464L, 63888);
    int i = this.inK.getFirstVisiblePosition() - this.inK.getHeaderViewsCount();
    int j = this.inK.getLastVisiblePosition() - this.inK.getHeaderViewsCount();
    w.i("MicroMsg.SnsTimeLineBaseAdapter", "reConverItem start ~ end" + i + " " + j);
    int k = this.qPh.getCount();
    if ((i <= j) && (i < k))
    {
      com.tencent.mm.plugin.sns.storage.m localm = uN(i);
      Object localObject = (View)this.qPo.get(Integer.valueOf(i));
      if ((localObject == null) || (localm == null) || (((View)localObject).getTag() == null)) {
        w.e("MicroMsg.SnsTimeLineBaseAdapter", " passe " + i);
      }
      for (;;)
      {
        i += 1;
        break;
        localObject = (a.c)((View)localObject).getTag();
        w.i("MicroMsg.SnsTimeLineBaseAdapter", "reConverItem " + i + " " + ((a.c)localObject).position);
        ((a.c)localObject).qUH.a((a.c)localObject, i, localm);
      }
    }
    GMTrace.o(8574902206464L, 63888);
  }
  
  public final x bnI()
  {
    GMTrace.i(8575304859648L, 63891);
    x localx = this.qPh;
    GMTrace.o(8575304859648L, 63891);
    return localx;
  }
  
  public final void cC(View paramView)
  {
    GMTrace.i(8576244383744L, 63898);
    if (!(paramView.getTag() instanceof a.c))
    {
      GMTrace.o(8576244383744L, 63898);
      return;
    }
    w.d("MicroMsg.SnsTimeLineBaseAdapter", "close comment v");
    if ((this.qPl != null) && (this.qPl.getVisibility() == 0))
    {
      this.qPl.startAnimation(this.qHo);
      this.qHo.setAnimationListener(new Animation.AnimationListener()
      {
        public final void onAnimationEnd(Animation paramAnonymousAnimation)
        {
          GMTrace.i(8689121492992L, 64739);
          if (av.this.qPl != null)
          {
            av.this.qPl.clearAnimation();
            av.this.qPl.setVisibility(8);
          }
          av.this.qPl = null;
          GMTrace.o(8689121492992L, 64739);
        }
        
        public final void onAnimationRepeat(Animation paramAnonymousAnimation)
        {
          GMTrace.i(8688987275264L, 64738);
          GMTrace.o(8688987275264L, 64738);
        }
        
        public final void onAnimationStart(Animation paramAnonymousAnimation)
        {
          GMTrace.i(8688853057536L, 64737);
          GMTrace.o(8688853057536L, 64737);
        }
      });
    }
    GMTrace.o(8576244383744L, 63898);
  }
  
  public final View g(int paramInt, View paramView)
  {
    GMTrace.i(8575036424192L, 63889);
    Object localObject4 = this.qPh.uN(paramInt);
    bhc localbhc = ((com.tencent.mm.plugin.sns.storage.m)localObject4).bjL();
    int i = d(localbhc);
    Object localObject1;
    Object localObject3;
    Object localObject2;
    if (paramView == null) {
      switch (i)
      {
      default: 
        paramView = new com.tencent.mm.plugin.sns.ui.a.d();
        localObject1 = new e.a();
        ((a.c)localObject1).qUH = paramView;
        ((a.c)localObject1).qUE = localbhc;
        localObject3 = paramView.a(this.fsU, (a.c)localObject1, i, this, (com.tencent.mm.plugin.sns.storage.m)localObject4);
        localObject2 = paramView;
        paramView = (View)localObject3;
      }
    }
    ArrayList localArrayList;
    for (;;)
    {
      ((com.tencent.mm.plugin.sns.ui.a.a)localObject2).ie(this.qGP);
      localObject3 = ((com.tencent.mm.plugin.sns.storage.m)localObject4).bjM();
      localArrayList = new ArrayList();
      if (ao.bhR().size() <= 0) {
        break label414;
      }
      Iterator localIterator = ao.bhR().keySet().iterator();
      while (localIterator.hasNext())
      {
        Object localObject5 = (String)localIterator.next();
        if (((String)localObject5).startsWith((String)localObject3))
        {
          localObject5 = (ao.b)ao.bhR().get(localObject5);
          if (ao.c((ao.b)localObject5)) {
            localArrayList.add(localObject5);
          }
        }
      }
      paramView = new f();
      break;
      paramView = new e();
      break;
      paramView = new e();
      break;
      paramView = new e();
      break;
      paramView = new e();
      break;
      paramView = new com.tencent.mm.plugin.sns.ui.a.c();
      break;
      paramView = new com.tencent.mm.plugin.sns.ui.a.d();
      break;
      paramView = new com.tencent.mm.plugin.sns.ui.a.d();
      break;
      paramView = new com.tencent.mm.plugin.sns.ui.a.d();
      break;
      paramView = new com.tencent.mm.plugin.sns.ui.a.g();
      break;
      paramView = new com.tencent.mm.plugin.sns.ui.a.d();
      break;
      paramView = new com.tencent.mm.plugin.sns.ui.a.b();
      break;
      localObject1 = (a.c)paramView.getTag();
      localObject2 = ((a.c)localObject1).qUH;
    }
    label414:
    ((com.tencent.mm.plugin.sns.ui.a.a)localObject2).qTA = localArrayList;
    ((com.tencent.mm.plugin.sns.ui.a.a)localObject2).a((a.c)localObject1, paramInt, (com.tencent.mm.plugin.sns.storage.m)localObject4, localbhc, i, this);
    if (ao.bQ(((com.tencent.mm.plugin.sns.storage.m)localObject4).bjM(), 2))
    {
      localObject2 = ao.GJ(((com.tencent.mm.plugin.sns.storage.m)localObject4).bjM());
      if (((com.tencent.mm.plugin.sns.storage.m)localObject4).field_snsId == 0L) {
        localObject2 = new ao.b();
      }
      if (((ao.b)localObject2).hie) {
        if (!((ao.b)localObject2).hkX)
        {
          localObject3 = ((ao.b)localObject2).result;
          localObject4 = ((ao.b)localObject2).hpO;
          if ((localObject1 != null) && (((a.c)localObject1).qTK != null))
          {
            ((a.c)localObject1).qTK.a((ao.b)localObject2, 1, (String)localObject3, (String)localObject4, ((ao.b)localObject2).qeR);
            ((a.c)localObject1).qTK.setVisibility(0);
          }
        }
      }
    }
    for (;;)
    {
      this.qPo.put(Integer.valueOf(paramInt), paramView);
      GMTrace.o(8575036424192L, 63889);
      return paramView;
      com.tencent.mm.plugin.sns.ui.a.a.e((a.c)localObject1);
      ao.bP(((ao.b)localObject2).id, 2);
      continue;
      if ((localObject1 != null) && (((a.c)localObject1).qTK != null))
      {
        ((a.c)localObject1).qTK.vi(1);
        ((a.c)localObject1).qTK.setVisibility(0);
        continue;
        com.tencent.mm.plugin.sns.ui.a.a.e((a.c)localObject1);
      }
    }
  }
  
  public final int getCount()
  {
    GMTrace.i(8576512819200L, 63900);
    int i = this.qPh.getCount();
    GMTrace.o(8576512819200L, 63900);
    return i;
  }
  
  public final int getItemViewType(int paramInt)
  {
    GMTrace.i(8575170641920L, 63890);
    paramInt = d(this.qPh.uN(paramInt).bjL());
    GMTrace.o(8575170641920L, 63890);
    return paramInt;
  }
  
  public final void notifyDataSetChanged()
  {
    GMTrace.i(8574499553280L, 63885);
    this.qPh.notifyDataSetChanged();
    GMTrace.o(8574499553280L, 63885);
  }
  
  public final com.tencent.mm.plugin.sns.storage.m uN(int paramInt)
  {
    GMTrace.i(8576378601472L, 63899);
    com.tencent.mm.plugin.sns.storage.m localm = this.qPh.uN(paramInt);
    GMTrace.o(8576378601472L, 63899);
    return localm;
  }
  
  public final boolean uO(int paramInt)
  {
    GMTrace.i(8576647036928L, 63901);
    if ((paramInt < this.inK.getFirstVisiblePosition() - 1) || (paramInt > this.inK.getLastVisiblePosition() - 1))
    {
      GMTrace.o(8576647036928L, 63901);
      return false;
    }
    GMTrace.o(8576647036928L, 63901);
    return true;
  }
  
  public static abstract interface a
  {
    public abstract boolean blr();
  }
  
  public static final class b
    implements ag.b.a
  {
    public int jR;
    public x qPy;
    
    public b(x paramx, int paramInt)
    {
      GMTrace.i(8541884645376L, 63642);
      this.qPy = null;
      this.qPy = paramx;
      this.jR = paramInt;
      GMTrace.o(8541884645376L, 63642);
    }
    
    public final void p(String paramString, boolean paramBoolean)
    {
      GMTrace.i(8542018863104L, 63643);
      if (paramBoolean)
      {
        com.tencent.mm.kernel.h.xA();
        if (com.tencent.mm.kernel.h.xx().wM()) {
          com.tencent.mm.plugin.sns.model.ae.aCa().post(new Runnable()
          {
            public final void run()
            {
              GMTrace.i(8335994650624L, 62108);
              if (av.b.this.qPy.blH() != null) {
                ((aw)av.b.this.qPy.blH()).DR(av.b.this.jR);
              }
              av.b.this.qPy.notifyDataSetChanged();
              GMTrace.o(8335994650624L, 62108);
            }
          });
        }
      }
      GMTrace.o(8542018863104L, 63643);
    }
  }
  
  static final class c
    implements View.OnCreateContextMenuListener
  {
    private String fAx;
    private bhc qAK;
    private com.tencent.mm.plugin.sns.storage.m qGc;
    private amn qbr;
    private View targetView;
    private String url;
    
    c()
    {
      GMTrace.i(8349416423424L, 62208);
      GMTrace.o(8349416423424L, 62208);
    }
    
    public final void onCreateContextMenu(ContextMenu paramContextMenu, View paramView, ContextMenu.ContextMenuInfo paramContextMenuInfo)
    {
      GMTrace.i(8349550641152L, 62209);
      paramContextMenuInfo = paramView.getTag();
      if ((paramContextMenuInfo instanceof r))
      {
        paramContextMenuInfo = (r)paramContextMenuInfo;
        bhc localbhc = paramContextMenuInfo.qAK;
        paramView.getContext();
        String str1 = localbhc.uyu.mDo;
        String str2 = localbhc.uyt.nas;
        str1 = av.Iy(str1);
        if ((str1 == null) || (str1.length() == 0))
        {
          GMTrace.o(8349550641152L, 62209);
          return;
        }
        this.url = str1;
        this.fAx = paramContextMenuInfo.fxL;
        this.targetView = paramView;
        if (localbhc.uyu.tKd.size() > 0) {}
        for (paramContextMenuInfo = (amn)localbhc.uyu.tKd.get(0);; paramContextMenuInfo = null)
        {
          this.qbr = paramContextMenuInfo;
          this.qGc = com.tencent.mm.plugin.sns.model.ae.bhp().HA(this.fAx);
          this.qAK = localbhc;
          if ((localbhc.uyu.tKc != 10) && (localbhc.uyu.tKc != 13)) {
            break;
          }
          GMTrace.o(8349550641152L, 62209);
          return;
        }
        if (com.tencent.mm.bi.d.KT("favorite")) {
          switch (localbhc.uyu.tKc)
          {
          default: 
            paramContextMenu.add(0, 3, 0, paramView.getContext().getString(i.j.euj));
          }
        }
      }
      for (;;)
      {
        if ((this.qGc != null) && (!this.qGc.field_userName.equals(com.tencent.mm.plugin.sns.model.ae.bgV()))) {
          paramContextMenu.add(0, 8, 0, paramView.getContext().getString(i.j.dNr));
        }
        GMTrace.o(8349550641152L, 62209);
        return;
        paramContextMenu.add(0, 4, 0, paramView.getContext().getString(i.j.euj));
        continue;
        paramContextMenu.add(0, 5, 0, paramView.getContext().getString(i.j.euj));
        continue;
        paramContextMenu.add(0, 9, 0, paramView.getContext().getString(i.j.euj));
      }
    }
  }
}


/* Location:              /Users/xianghongyan/decompile/dex2jar/classes2-dex2jar.jar!/com/tencent/mm/plugin/sns/ui/av.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */