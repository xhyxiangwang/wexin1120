package com.tencent.mm.plugin.card.a;

import android.os.Looper;
import android.text.TextUtils;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.ac.e;
import com.tencent.mm.ac.k;
import com.tencent.mm.ac.n;
import com.tencent.mm.modelgeo.a;
import com.tencent.mm.modelgeo.a.a;
import com.tencent.mm.modelgeo.c;
import com.tencent.mm.plugin.card.model.v;
import com.tencent.mm.protocal.c.ji;
import com.tencent.mm.sdk.platformtools.ae;
import com.tencent.mm.sdk.platformtools.w;
import com.tencent.mm.x.ap;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public final class m
  implements e, a.a
{
  private ae handler;
  public Map<String, Set<a>> knj;
  public HashMap<String, String> knk;
  private String knl;
  public v knm;
  
  public m()
  {
    GMTrace.i(5127519862784L, 38203);
    this.knj = new HashMap();
    this.knk = new HashMap();
    ap.wT().a(563, this);
    this.handler = new ae(Looper.getMainLooper());
    GMTrace.o(5127519862784L, 38203);
  }
  
  private void a(final String paramString, final boolean paramBoolean, final ArrayList<ji> paramArrayList)
  {
    GMTrace.i(5127788298240L, 38205);
    this.handler.post(new Runnable()
    {
      public final void run()
      {
        GMTrace.i(5128593604608L, 38211);
        synchronized (m.this.knj)
        {
          Object localObject2 = (Set)m.this.knj.get(paramString);
          if ((localObject2 != null) && (((Set)localObject2).size() > 0))
          {
            ??? = new HashSet();
            ((Set)???).addAll((Collection)localObject2);
            ??? = ((Set)???).iterator();
            while (((Iterator)???).hasNext())
            {
              localObject2 = (m.a)((Iterator)???).next();
              if (localObject2 != null) {
                ((m.a)localObject2).a(paramBoolean, paramArrayList);
              }
            }
          }
        }
        GMTrace.o(5128593604608L, 38211);
      }
    });
    GMTrace.o(5127788298240L, 38205);
  }
  
  public final void a(int paramInt1, int paramInt2, String paramString, k paramk)
  {
    GMTrace.i(5128056733696L, 38207);
    this.knm = null;
    paramString = ((v)paramk).kpy;
    w.i("MicroMsg.CardShopLBSManager", "onSceneEnd, reqCardTpId = %s, errType = %d, errCode = %d", new Object[] { paramString, Integer.valueOf(paramInt1), Integer.valueOf(paramInt2) });
    if ((paramInt1 != 0) || (paramInt2 != 0))
    {
      w.e("MicroMsg.CardShopLBSManager", "onSceneEnd, cardshoplbs fail");
      a(paramString, false, null);
      GMTrace.o(5128056733696L, 38207);
      return;
    }
    paramk = ((v)paramk).kpz;
    if (paramk == null) {}
    for (paramInt1 = 0;; paramInt1 = paramk.size())
    {
      w.d("MicroMsg.CardShopLBSManager", "onSceneEnd, respShopList size = %d", new Object[] { Integer.valueOf(paramInt1) });
      a(paramString, true, paramk);
      GMTrace.o(5128056733696L, 38207);
      return;
    }
  }
  
  public final void a(String paramString, a arg2)
  {
    GMTrace.i(5127654080512L, 38204);
    try
    {
      synchronized (this.knj)
      {
        if (this.knj.get(paramString) != null) {
          ((Set)this.knj.get(paramString)).remove(???);
        }
      }
      synchronized (this.knk)
      {
        this.knk.remove(paramString);
        GMTrace.o(5127654080512L, 38204);
        return;
        paramString = finally;
        throw paramString;
      }
    }
    catch (Exception ???)
    {
      for (;;) {}
    }
  }
  
  public final boolean a(String paramString1, String paramString2, a arg3)
  {
    GMTrace.i(5127922515968L, 38206);
    w.d("MicroMsg.CardShopLBSManager", "getShopList, cardTpId = %s, card_id = %s", new Object[] { paramString1, paramString2 });
    this.knl = paramString1;
    synchronized (this.knj)
    {
      if (!this.knj.containsKey(paramString1)) {
        this.knj.put(paramString1, new HashSet());
      }
      if (!((Set)this.knj.get(paramString1)).contains(???)) {
        ((Set)this.knj.get(paramString1)).add(???);
      }
    }
    for (;;)
    {
      synchronized (this.knk)
      {
        if (!TextUtils.isEmpty(paramString2)) {
          this.knk.put(paramString1, paramString2);
        }
        paramString1 = c.Io();
        if (paramString1 == null)
        {
          w.e("MicroMsg.CardShopLBSManager", "getShopList fail, get IGetLocation fail, plugin no loaded?");
          i = 0;
          if (i != 0) {
            break;
          }
          w.e("MicroMsg.CardShopLBSManager", "getShopList fail, get IGetLocation fail, plugin no loaded?");
          GMTrace.o(5127922515968L, 38206);
          return false;
          paramString1 = finally;
          throw paramString1;
        }
      }
      paramString1.b(this);
      int i = 1;
    }
    if (this.knm != null) {
      ap.wT().c(this.knm);
    }
    GMTrace.o(5127922515968L, 38206);
    return true;
  }
  
  public final boolean a(boolean paramBoolean, float paramFloat1, float paramFloat2, int paramInt, double paramDouble1, double paramDouble2, double paramDouble3)
  {
    GMTrace.i(15361755840512L, 114454);
    if (!paramBoolean)
    {
      GMTrace.o(15361755840512L, 114454);
      return true;
    }
    ??? = c.Io();
    if (??? != null) {
      ((a)???).c(this);
    }
    w.d("MicroMsg.CardShopLBSManager", "onGetLocation, fLongitude = %f, fLatitude = %f, locType = %d, speed = %f, accuracy = %f", new Object[] { Float.valueOf(paramFloat1), Float.valueOf(paramFloat2), Integer.valueOf(paramInt), Double.valueOf(paramDouble1), Double.valueOf(paramDouble2) });
    synchronized (this.knj)
    {
      Set localSet = (Set)this.knj.get(this.knl);
      if ((localSet == null) || (localSet.size() == 0))
      {
        w.e("MicroMsg.CardShopLBSManager", "onGetLocation, already cancelled, no need to doScene");
        GMTrace.o(15361755840512L, 114454);
        return false;
      }
    }
    for (;;)
    {
      synchronized (this.knk)
      {
        String str = (String)this.knk.get(this.knl);
        ??? = new v(this.knl, paramFloat1, paramFloat2, str);
        if (ap.wT().a((k)???, 0))
        {
          this.knm = ((v)???);
          GMTrace.o(15361755840512L, 114454);
          return true;
        }
      }
      w.e("MicroMsg.CardShopLBSManager", "doScene fail, callback immediate");
      a(this.knl, false, null);
    }
  }
  
  public static abstract interface a
  {
    public abstract void a(boolean paramBoolean, ArrayList<ji> paramArrayList);
  }
}


/* Location:              /Users/xianghongyan/decompile/dex2jar/classes2-dex2jar.jar!/com/tencent/mm/plugin/card/a/m.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */