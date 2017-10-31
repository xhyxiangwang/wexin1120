package com.tencent.mm.plugin.card.a;

import android.text.TextUtils;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.ac.e;
import com.tencent.mm.ac.k;
import com.tencent.mm.ac.n;
import com.tencent.mm.plugin.card.model.ac;
import com.tencent.mm.sdk.platformtools.aj;
import com.tencent.mm.sdk.platformtools.aj.a;
import com.tencent.mm.sdk.platformtools.w;
import com.tencent.mm.x.ap;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public final class c
  implements e
{
  private int kmA;
  private int kmB;
  private boolean kmC;
  private aj kmD;
  private aj kmE;
  List<WeakReference<a>> kmu;
  public String kmv;
  public LinkedList<String> kmw;
  public int kmx;
  private int kmy;
  private int kmz;
  
  public c()
  {
    GMTrace.i(5125238161408L, 38186);
    this.kmu = new ArrayList();
    this.kmv = "";
    this.kmw = new LinkedList();
    this.kmB = 60;
    this.kmC = false;
    this.kmD = new aj(new aj.a()
    {
      public final boolean pO()
      {
        GMTrace.i(5117185097728L, 38126);
        w.i("MicroMsg.CardCodeMgr", "onTimerExpired, do request code");
        c.this.tr(c.this.kmv);
        c.this.aiY();
        GMTrace.o(5117185097728L, 38126);
        return true;
      }
    }, false);
    this.kmE = new aj(new aj.a()
    {
      public final boolean pO()
      {
        GMTrace.i(5115708702720L, 38115);
        w.i("MicroMsg.CardCodeMgr", "onTimerExpired, do refresh code one minute");
        c localc = c.this;
        w.i("MicroMsg.CardCodeMgr", "onCodeChange()");
        if (localc.kmu != null)
        {
          int i = 0;
          while (i < localc.kmu.size())
          {
            Object localObject = (WeakReference)localc.kmu.get(i);
            if (localObject != null)
            {
              localObject = (c.a)((WeakReference)localObject).get();
              if (localObject != null) {
                ((c.a)localObject).ajc();
              }
            }
            i += 1;
          }
        }
        c.this.aja();
        GMTrace.o(5115708702720L, 38115);
        return true;
      }
    }, false);
    GMTrace.o(5125238161408L, 38186);
  }
  
  private void aiZ()
  {
    GMTrace.i(5126580338688L, 38196);
    w.i("MicroMsg.CardCodeMgr", "stopRequestCodeTimer!");
    if (!this.kmD.bNt()) {
      this.kmD.MM();
    }
    GMTrace.o(5126580338688L, 38196);
  }
  
  private void onSuccess()
  {
    GMTrace.i(5125775032320L, 38190);
    w.i("MicroMsg.CardCodeMgr", "onSuccess()");
    if (this.kmu == null)
    {
      GMTrace.o(5125775032320L, 38190);
      return;
    }
    int i = 0;
    while (i < this.kmu.size())
    {
      Object localObject = (WeakReference)this.kmu.get(i);
      if (localObject != null)
      {
        localObject = (a)((WeakReference)localObject).get();
        if (localObject != null) {
          ((a)localObject).onSuccess();
        }
      }
      i += 1;
    }
    GMTrace.o(5125775032320L, 38190);
  }
  
  private void tq(String paramString)
  {
    GMTrace.i(5125909250048L, 38191);
    w.i("MicroMsg.CardCodeMgr", "onFail()");
    if (this.kmu == null)
    {
      GMTrace.o(5125909250048L, 38191);
      return;
    }
    int i = 0;
    while (i < this.kmu.size())
    {
      Object localObject = (WeakReference)this.kmu.get(i);
      if (localObject != null)
      {
        localObject = (a)((WeakReference)localObject).get();
        if (localObject != null) {
          ((a)localObject).tq(paramString);
        }
      }
      i += 1;
    }
    GMTrace.o(5125909250048L, 38191);
  }
  
  public final void a(int paramInt1, int paramInt2, String paramString, k paramk)
  {
    GMTrace.i(5126311903232L, 38194);
    w.i("MicroMsg.CardCodeMgr", "onSceneEnd, errType = " + paramInt1 + " errCode = " + paramInt2);
    if ((paramInt1 == 0) && (paramInt2 == 0))
    {
      if ((paramk instanceof ac))
      {
        this.kmC = false;
        w.e("MicroMsg.CardCodeMgr", "get codes success for card id " + this.kmv);
        paramString = (ac)paramk;
        this.kmy = paramString.kmy;
        this.kmz = paramString.kmz;
        this.kmA = paramString.kmA;
        if (paramString.kmw != null)
        {
          this.kmw.clear();
          this.kmw.addAll(paramString.kmw);
          this.kmx = 0;
        }
        onSuccess();
        aiY();
        if (this.kmA != 0) {
          aja();
        }
        GMTrace.o(5126311903232L, 38194);
      }
    }
    else if ((paramk instanceof ac))
    {
      this.kmC = false;
      w.e("MicroMsg.CardCodeMgr", "get codes failed  for card id " + this.kmv);
      tq(paramString);
    }
    GMTrace.o(5126311903232L, 38194);
  }
  
  public final void a(a parama)
  {
    GMTrace.i(5125506596864L, 38188);
    if (this.kmu == null) {
      this.kmu = new ArrayList();
    }
    if (parama != null) {
      this.kmu.add(new WeakReference(parama));
    }
    GMTrace.o(5125506596864L, 38188);
  }
  
  public final void aiY()
  {
    GMTrace.i(5126446120960L, 38195);
    aiZ();
    w.i("MicroMsg.CardCodeMgr", "startRequestCodeTimer() request_time:" + this.kmy);
    if ((this.kmy > 0) && (!TextUtils.isEmpty(this.kmv)))
    {
      aj localaj = this.kmD;
      long l = this.kmy * 1000;
      localaj.w(l, l);
      w.i("MicroMsg.CardCodeMgr", "start request code timer!");
      GMTrace.o(5126446120960L, 38195);
      return;
    }
    w.e("MicroMsg.CardCodeMgr", "not to start request code timer!");
    GMTrace.o(5126446120960L, 38195);
  }
  
  public final void aja()
  {
    GMTrace.i(5126714556416L, 38197);
    ajb();
    w.i("MicroMsg.CardCodeMgr", "startRefreshCodeTimer() refresh_interval:" + this.kmA);
    if (this.kmA > 0)
    {
      localaj = this.kmE;
      l = this.kmA * 1000;
      localaj.w(l, l);
      w.i("MicroMsg.CardCodeMgr", "start refresh code timer!");
      GMTrace.o(5126714556416L, 38197);
      return;
    }
    aj localaj = this.kmE;
    long l = this.kmB * 1000;
    localaj.w(l, l);
    w.e("MicroMsg.CardCodeMgr", "not to start refresh code timer!");
    GMTrace.o(5126714556416L, 38197);
  }
  
  public final void ajb()
  {
    GMTrace.i(5126848774144L, 38198);
    w.i("MicroMsg.CardCodeMgr", "stopRefreshCodeTimer()!");
    if (!this.kmE.bNt()) {
      this.kmE.MM();
    }
    GMTrace.o(5126848774144L, 38198);
  }
  
  public final void b(a parama)
  {
    GMTrace.i(5125640814592L, 38189);
    if ((this.kmu == null) || (parama == null))
    {
      GMTrace.o(5125640814592L, 38189);
      return;
    }
    int i = 0;
    while (i < this.kmu.size())
    {
      WeakReference localWeakReference = (WeakReference)this.kmu.get(i);
      if (localWeakReference != null)
      {
        a locala = (a)localWeakReference.get();
        if ((locala != null) && (locala.equals(parama)))
        {
          this.kmu.remove(localWeakReference);
          GMTrace.o(5125640814592L, 38189);
          return;
        }
      }
      i += 1;
    }
    GMTrace.o(5125640814592L, 38189);
  }
  
  public final String getCode()
  {
    GMTrace.i(19559012630528L, 145726);
    if ((this.kmw == null) || (this.kmw.size() == 0))
    {
      w.e("MicroMsg.CardCodeMgr", "getCode, codes is empty");
      GMTrace.o(19559012630528L, 145726);
      return "";
    }
    if (this.kmx >= this.kmw.size())
    {
      w.e("MicroMsg.CardCodeMgr", "getCode, all codes has show! ");
      tr(this.kmv);
      GMTrace.o(19559012630528L, 145726);
      return "";
    }
    if (this.kmz >= this.kmw.size() - this.kmx)
    {
      w.i("MicroMsg.CardCodeMgr", "do request code, because the request_count >= than (codes.size() - show_count)");
      tr(this.kmv);
    }
    w.i("MicroMsg.CardCodeMgr", "getCode, show_count:" + this.kmx + " request_count:" + this.kmz + " codes size:" + this.kmw.size());
    Object localObject = this.kmw;
    int i = this.kmx;
    this.kmx = (i + 1);
    localObject = (String)((LinkedList)localObject).get(i);
    GMTrace.o(19559012630528L, 145726);
    return (String)localObject;
  }
  
  public final boolean isEmpty()
  {
    GMTrace.i(5126043467776L, 38192);
    if ((this.kmw == null) || (this.kmw.size() == 0))
    {
      w.e("MicroMsg.CardCodeMgr", "getCode, codes is empty");
      GMTrace.o(5126043467776L, 38192);
      return true;
    }
    if (this.kmx >= this.kmw.size())
    {
      w.e("MicroMsg.CardCodeMgr", "getCode, all codes has show! ");
      GMTrace.o(5126043467776L, 38192);
      return true;
    }
    GMTrace.o(5126043467776L, 38192);
    return false;
  }
  
  public final void release()
  {
    GMTrace.i(5125372379136L, 38187);
    ap.wT().b(577, this);
    this.kmw.clear();
    this.kmC = false;
    this.kmv = "";
    this.kmx = 0;
    this.kmy = 0;
    this.kmz = 0;
    this.kmA = 0;
    aiZ();
    ajb();
    GMTrace.o(5125372379136L, 38187);
  }
  
  public final void tr(String paramString)
  {
    GMTrace.i(5126177685504L, 38193);
    if (this.kmC)
    {
      w.e("MicroMsg.CardCodeMgr", "doGetCardCodes(), is doing get codes");
      GMTrace.o(5126177685504L, 38193);
      return;
    }
    if (TextUtils.isEmpty(paramString))
    {
      w.e("MicroMsg.CardCodeMgr", "doGetCardCodes(), mCardId is empty!");
      GMTrace.o(5126177685504L, 38193);
      return;
    }
    w.i("MicroMsg.CardCodeMgr", "doGetCardCodes() do get codes, card id " + paramString);
    this.kmC = true;
    this.kmv = paramString;
    paramString = new ac(this.kmv);
    ap.wT().a(paramString, 0);
    GMTrace.o(5126177685504L, 38193);
  }
  
  public static abstract interface a
  {
    public abstract void ajc();
    
    public abstract void onSuccess();
    
    public abstract void tq(String paramString);
  }
}


/* Location:              /Users/xianghongyan/decompile/dex2jar/classes2-dex2jar.jar!/com/tencent/mm/plugin/card/a/c.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */