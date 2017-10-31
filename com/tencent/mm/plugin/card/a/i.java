package com.tencent.mm.plugin.card.a;

import android.text.TextUtils;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.ac.e;
import com.tencent.mm.ac.k;
import com.tencent.mm.ac.n;
import com.tencent.mm.k.c;
import com.tencent.mm.k.g;
import com.tencent.mm.plugin.card.sharecard.model.f;
import com.tencent.mm.sdk.platformtools.ae;
import com.tencent.mm.sdk.platformtools.bg;
import com.tencent.mm.sdk.platformtools.w;
import com.tencent.mm.x.ap;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;

public final class i
  implements e
{
  public ArrayList<String> kmU;
  public ArrayList<String> kmV;
  public ae kmW;
  public HashMap<String, Runnable> kmX;
  private List<WeakReference<a>> kmu;
  
  public i()
  {
    GMTrace.i(5117721968640L, 38130);
    this.kmu = new ArrayList();
    this.kmU = new ArrayList();
    this.kmV = new ArrayList();
    this.kmW = new ae();
    this.kmX = new LinkedHashMap();
    ap.wT().a(907, this);
    this.kmU.clear();
    this.kmV.clear();
    this.kmX.clear();
    GMTrace.o(5117721968640L, 38130);
  }
  
  private void a(String paramString, b paramb)
  {
    GMTrace.i(5118124621824L, 38133);
    w.i("MicroMsg.CardMarkCodeMgr", "markSuccess()");
    if (this.kmu == null)
    {
      GMTrace.o(5118124621824L, 38133);
      return;
    }
    if ((!this.kmU.contains(paramString)) && (!this.kmV.contains(paramString)))
    {
      w.i("MicroMsg.CardMarkCodeMgr", "markSuccess the card id is not in mark list and un mark list.");
      GMTrace.o(5118124621824L, 38133);
      return;
    }
    int i = 0;
    if (i < this.kmu.size())
    {
      Object localObject = (WeakReference)this.kmu.get(i);
      if (localObject != null)
      {
        localObject = (a)((WeakReference)localObject).get();
        if (localObject != null)
        {
          if (!this.kmU.contains(paramString)) {
            break label146;
          }
          ((a)localObject).b(paramString, paramb);
        }
      }
      for (;;)
      {
        i += 1;
        break;
        label146:
        if (this.kmV.contains(paramString)) {
          ((a)localObject).tw(paramString);
        }
      }
    }
    GMTrace.o(5118124621824L, 38133);
  }
  
  private void bt(String paramString1, String paramString2)
  {
    GMTrace.i(5118258839552L, 38134);
    w.i("MicroMsg.CardMarkCodeMgr", "onMarkFail()");
    if (this.kmu == null)
    {
      GMTrace.o(5118258839552L, 38134);
      return;
    }
    if ((!this.kmU.contains(paramString1)) || (this.kmV.contains(paramString1)))
    {
      w.i("MicroMsg.CardMarkCodeMgr", "markSuccess the card is not in mark list");
      GMTrace.o(5118258839552L, 38134);
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
          ((a)localObject).bu(paramString1, paramString2);
        }
      }
      i += 1;
    }
    GMTrace.o(5118258839552L, 38134);
  }
  
  public static void f(String paramString, int paramInt1, int paramInt2, int paramInt3)
  {
    GMTrace.i(5118929928192L, 38139);
    if (TextUtils.isEmpty(paramString))
    {
      w.i("MicroMsg.CardMarkCodeMgr", "card_id is empty, don't call NetSceneMarkShareCard cgi");
      GMTrace.o(5118929928192L, 38139);
      return;
    }
    w.i("MicroMsg.CardMarkCodeMgr", "doMarkNetscene()");
    paramString = new f(paramString, paramInt1, paramInt2, paramInt3);
    ap.wT().a(paramString, 0);
    GMTrace.o(5118929928192L, 38139);
  }
  
  private void tu(String paramString)
  {
    GMTrace.i(5118393057280L, 38135);
    w.i("MicroMsg.CardMarkCodeMgr", "removeId()");
    if ((this.kmU.contains(paramString)) && (!this.kmV.contains(paramString)))
    {
      this.kmU.remove(paramString);
      w.i("MicroMsg.CardMarkCodeMgr", "remove mark card id in mMarkList. card is " + paramString);
    }
    if ((!this.kmU.contains(paramString)) && (this.kmV.contains(paramString)))
    {
      this.kmV.remove(paramString);
      Runnable localRunnable = (Runnable)this.kmX.get(paramString);
      this.kmX.remove(paramString);
      this.kmW.removeCallbacks(localRunnable);
      w.i("MicroMsg.CardMarkCodeMgr", "remove unmark card id in mUnMarkList. card is " + paramString);
      w.i("MicroMsg.CardMarkCodeMgr", "remove unmark card mask id in mId2Runner. card is " + paramString);
    }
    GMTrace.o(5118393057280L, 38135);
  }
  
  private void tv(String paramString)
  {
    GMTrace.i(5118527275008L, 38136);
    w.i("MicroMsg.CardMarkCodeMgr", "cancelUnmark()");
    if (this.kmV.contains(paramString))
    {
      this.kmV.remove(paramString);
      w.i("MicroMsg.CardMarkCodeMgr", "remove unmark card id in mUnMarkList. card is " + paramString);
    }
    if (this.kmX.containsKey(paramString))
    {
      w.i("MicroMsg.CardMarkCodeMgr", "remove unmark card mask id in mId2Runner. card is " + paramString);
      Runnable localRunnable = (Runnable)this.kmX.get(paramString);
      this.kmX.remove(paramString);
      this.kmW.removeCallbacks(localRunnable);
    }
    GMTrace.o(5118527275008L, 38136);
  }
  
  public final void a(int paramInt1, int paramInt2, String paramString, k paramk)
  {
    GMTrace.i(5119064145920L, 38140);
    w.i("MicroMsg.CardMarkCodeMgr", "onSceneEnd, errType = " + paramInt1 + " errCode = " + paramInt2);
    if ((paramInt1 == 0) && (paramInt2 == 0))
    {
      if ((paramk instanceof f))
      {
        paramString = (f)paramk;
        paramk = new b();
        paramk.knc = paramString.knc;
        paramk.knd = paramString.knd;
        paramk.kne = paramString.kne;
        paramk.knf = paramString.knf;
        paramk.kng = paramString.kng;
        w.i("MicroMsg.CardMarkCodeMgr", "onSceneEnd, markSuccess original_card_id = " + paramString.kqJ);
        w.i("MicroMsg.CardMarkCodeMgr", "mark_user:" + paramk.knc + " mark_succ:" + paramk.knd + " mark_card_id:" + paramk.kne + " expire_time:" + paramk.knf + " pay_qrcode_wording:" + paramk.kng);
        a(paramString.kqJ, paramk);
        tu(paramString.kqJ);
        GMTrace.o(5119064145920L, 38140);
      }
    }
    else if ((paramk instanceof f))
    {
      paramk = (f)paramk;
      w.i("MicroMsg.CardMarkCodeMgr", "onSceneEnd, markFail original_card_id = " + paramk.kqJ);
      bt(paramk.kqJ, paramString);
      tu(paramk.kqJ);
    }
    GMTrace.o(5119064145920L, 38140);
  }
  
  public final void a(a parama)
  {
    GMTrace.i(5117856186368L, 38131);
    if (this.kmu == null) {
      this.kmu = new ArrayList();
    }
    if (parama != null) {
      this.kmu.add(new WeakReference(parama));
    }
    GMTrace.o(5117856186368L, 38131);
  }
  
  public final void aH(final String paramString, final int paramInt)
  {
    GMTrace.i(5118795710464L, 38138);
    w.i("MicroMsg.CardMarkCodeMgr", "doUnmarkCode()");
    tv(paramString);
    this.kmV.add(paramString);
    Runnable local1 = new Runnable()
    {
      public final void run()
      {
        GMTrace.i(5119466799104L, 38143);
        i.f(paramString, this.kmZ, this.kna, paramInt);
        w.i("MicroMsg.CardMarkCodeMgr", "run the unmark task, the card is " + paramString + " system.time:" + System.currentTimeMillis());
        GMTrace.o(5119466799104L, 38143);
      }
    };
    paramInt = bg.getInt(g.uA().y("ShareCard", "UnMarkDelay"), 0);
    this.kmW.postDelayed(local1, paramInt * 1000);
    this.kmX.put(paramString, local1);
    w.i("MicroMsg.CardMarkCodeMgr", "add unmark card mask id in mId2Runner. card is " + paramString + " system.time:" + System.currentTimeMillis());
    GMTrace.o(5118795710464L, 38138);
  }
  
  public final void b(a parama)
  {
    GMTrace.i(5117990404096L, 38132);
    if ((this.kmu == null) || (parama == null))
    {
      GMTrace.o(5117990404096L, 38132);
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
          GMTrace.o(5117990404096L, 38132);
          return;
        }
      }
      i += 1;
    }
    GMTrace.o(5117990404096L, 38132);
  }
  
  public final void y(String paramString, int paramInt1, int paramInt2)
  {
    GMTrace.i(5118661492736L, 38137);
    w.i("MicroMsg.CardMarkCodeMgr", "doMarkCode()");
    tv(paramString);
    if (!this.kmU.contains(paramString)) {
      this.kmU.add(paramString);
    }
    f(paramString, paramInt1, 1, paramInt2);
    GMTrace.o(5118661492736L, 38137);
  }
  
  public static abstract interface a
  {
    public abstract void b(String paramString, i.b paramb);
    
    public abstract void bu(String paramString1, String paramString2);
    
    public abstract void tw(String paramString);
  }
  
  public static final class b
  {
    public String knc;
    public int knd;
    public String kne;
    public int knf;
    public String kng;
    
    public b()
    {
      GMTrace.i(5128325169152L, 38209);
      this.knd = 0;
      GMTrace.o(5128325169152L, 38209);
    }
  }
}


/* Location:              /Users/xianghongyan/decompile/dex2jar/classes2-dex2jar.jar!/com/tencent/mm/plugin/card/a/i.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */