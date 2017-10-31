package com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage;

import android.content.Context;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.text.TextUtils;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.k.g;
import com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.j;
import com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.k;
import com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.l;
import com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.m;
import com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.n;
import com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.p;
import com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.t;
import com.tencent.mm.pointers.PInt;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.af;
import com.tencent.mm.sdk.platformtools.w;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.concurrent.ConcurrentLinkedQueue;

public final class f
{
  private static f quo;
  ConcurrentLinkedQueue<String> qun;
  
  static
  {
    GMTrace.i(8191576375296L, 61032);
    quo = new f();
    GMTrace.o(8191576375296L, 61032);
  }
  
  private f()
  {
    GMTrace.i(8190771068928L, 61026);
    this.qun = new ConcurrentLinkedQueue();
    GMTrace.o(8190771068928L, 61026);
  }
  
  private boolean Hv(String paramString)
  {
    GMTrace.i(8190905286656L, 61027);
    boolean bool = this.qun.contains(paramString);
    GMTrace.o(8190905286656L, 61027);
    return bool;
  }
  
  private void Hx(final String paramString)
  {
    GMTrace.i(20373982674944L, 151798);
    if (TextUtils.isEmpty(paramString))
    {
      GMTrace.o(20373982674944L, 151798);
      return;
    }
    if (Hv(paramString))
    {
      GMTrace.o(20373982674944L, 151798);
      return;
    }
    this.qun.add(paramString);
    d.a("adId", paramString, true, 0, 0, new d.a()
    {
      public final void Hp(String paramAnonymousString)
      {
        GMTrace.i(20373580021760L, 151795);
        f.this.Hw(paramString);
        GMTrace.o(20373580021760L, 151795);
      }
      
      public final void biT()
      {
        GMTrace.i(20373311586304L, 151793);
        GMTrace.o(20373311586304L, 151793);
      }
      
      public final void biU()
      {
        GMTrace.i(20373445804032L, 151794);
        w.e("AdLandingPagesPreDownloadResHelper", " pre download " + paramString + "is error");
        f.this.Hw(paramString);
        GMTrace.o(20373445804032L, 151794);
      }
    });
    GMTrace.o(20373982674944L, 151798);
  }
  
  public static f bjE()
  {
    GMTrace.i(8190636851200L, 61025);
    f localf = quo;
    GMTrace.o(8190636851200L, 61025);
    return localf;
  }
  
  public final void Hw(String paramString)
  {
    GMTrace.i(16042508156928L, 119526);
    this.qun.remove(paramString);
    GMTrace.o(16042508156928L, 119526);
  }
  
  public final void a(String paramString, final p paramp)
  {
    GMTrace.i(8191039504384L, 61028);
    final Object localObject;
    if (paramp.qnp == 101)
    {
      paramp = ((k)paramp).qna.iterator();
      while (paramp.hasNext())
      {
        localObject = ((j)paramp.next()).qna.iterator();
        while (((Iterator)localObject).hasNext()) {
          a(paramString, (p)((Iterator)localObject).next());
        }
      }
      GMTrace.o(8191039504384L, 61028);
      return;
    }
    if (paramp.qnp == 41)
    {
      localObject = (m)paramp;
      if (Hv(((m)localObject).qne))
      {
        GMTrace.o(8191039504384L, 61028);
        return;
      }
      this.qun.add(((m)localObject).qne);
      d.a(paramString, ((m)localObject).qne, true, paramp.qnp, 0, new d.a()
      {
        public final void Hp(String paramAnonymousString)
        {
          GMTrace.i(8204461277184L, 61128);
          f.this.Hw(localObject.qne);
          GMTrace.o(8204461277184L, 61128);
        }
        
        public final void biT()
        {
          GMTrace.i(8204192841728L, 61126);
          GMTrace.o(8204192841728L, 61126);
        }
        
        public final void biU()
        {
          GMTrace.i(8204327059456L, 61127);
          w.e("AdLandingPagesPreDownloadResHelper", " pre download " + localObject.qne + "is error");
          f.this.Hw(localObject.qne);
          GMTrace.o(8204327059456L, 61127);
        }
      });
      GMTrace.o(8191039504384L, 61028);
      return;
    }
    if (paramp.qnp == 44)
    {
      localObject = (l)paramp;
      if (Hv(((l)localObject).qne))
      {
        GMTrace.o(8191039504384L, 61028);
        return;
      }
      this.qun.add(((l)localObject).qne);
      d.a(paramString, ((l)localObject).qne, true, paramp.qnp, 0, new d.a()
      {
        public final void Hp(String paramAnonymousString)
        {
          GMTrace.i(8192113246208L, 61036);
          f.this.Hw(localObject.qne);
          GMTrace.o(8192113246208L, 61036);
        }
        
        public final void biT()
        {
          GMTrace.i(8191844810752L, 61034);
          GMTrace.o(8191844810752L, 61034);
        }
        
        public final void biU()
        {
          GMTrace.i(8191979028480L, 61035);
          w.e("AdLandingPagesPreDownloadResHelper", " pre download " + localObject.qne + "is error");
          f.this.Hw(localObject.qne);
          GMTrace.o(8191979028480L, 61035);
        }
      });
      GMTrace.o(8191039504384L, 61028);
      return;
    }
    if (paramp.qnp == 45)
    {
      localObject = (m)paramp;
      if (Hv(((m)localObject).qne))
      {
        GMTrace.o(8191039504384L, 61028);
        return;
      }
      this.qun.add(((m)localObject).qne);
      d.a(paramString, ((m)localObject).qne, true, paramp.qnp, 0, new d.a()
      {
        public final void Hp(String paramAnonymousString)
        {
          GMTrace.i(8188086714368L, 61006);
          f.this.Hw(localObject.qne);
          GMTrace.o(8188086714368L, 61006);
        }
        
        public final void biT()
        {
          GMTrace.i(8187818278912L, 61004);
          GMTrace.o(8187818278912L, 61004);
        }
        
        public final void biU()
        {
          GMTrace.i(8187952496640L, 61005);
          w.e("AdLandingPagesPreDownloadResHelper", " pre download " + localObject.qne + "is error");
          f.this.Hw(localObject.qne);
          GMTrace.o(8187952496640L, 61005);
        }
      });
      GMTrace.o(8191039504384L, 61028);
      return;
    }
    if (paramp.qnp == 61)
    {
      paramp = (n)paramp;
      if (!Hv(paramp.qnf))
      {
        localObject = new PInt();
        PInt localPInt = new PInt();
        com.tencent.mm.modelcontrol.c.Gp();
        if (com.tencent.mm.modelcontrol.c.a((PInt)localObject, localPInt))
        {
          this.qun.add(paramp.qnf);
          d.a(paramString, paramp.qnf, true, 61, new d.a()
          {
            public final void Hp(String paramAnonymousString)
            {
              GMTrace.i(8188623585280L, 61010);
              f.this.Hw(paramp.qnf);
              GMTrace.o(8188623585280L, 61010);
            }
            
            public final void biT()
            {
              GMTrace.i(8188355149824L, 61008);
              GMTrace.o(8188355149824L, 61008);
            }
            
            public final void biU()
            {
              GMTrace.i(8188489367552L, 61009);
              w.e("AdLandingPagesPreDownloadResHelper", " pre download " + paramp.qnf + "is error");
              f.this.Hw(paramp.qnf);
              GMTrace.o(8188489367552L, 61009);
            }
          });
        }
      }
      if (!Hv(paramp.qng))
      {
        this.qun.add(paramp.qng);
        d.a(paramString, paramp.qng, true, 1000000001, 0, new d.a()
        {
          public final void Hp(String paramAnonymousString)
          {
            GMTrace.i(8189160456192L, 61014);
            f.this.Hw(paramp.qng);
            GMTrace.o(8189160456192L, 61014);
          }
          
          public final void biT()
          {
            GMTrace.i(8188892020736L, 61012);
            GMTrace.o(8188892020736L, 61012);
          }
          
          public final void biU()
          {
            GMTrace.i(8189026238464L, 61013);
            w.e("AdLandingPagesPreDownloadResHelper", " pre download " + paramp.qng + "is error");
            f.this.Hw(paramp.qng);
            GMTrace.o(8189026238464L, 61013);
          }
        });
      }
      GMTrace.o(8191039504384L, 61028);
      return;
    }
    if (paramp.qnp == 62) {
      if (g.uz().getInt("SnsAdNativePagePreloadStreamMedia", 0) <= 0) {
        break label645;
      }
    }
    label645:
    for (boolean bool = true;; bool = false)
    {
      w.i("AdLandingPagesPreDownloadResHelper", "pre down video value: " + bool);
      localObject = (t)paramp;
      if ((bool) && (!Hv(((t)localObject).qnh)))
      {
        this.qun.add(((t)localObject).qnh);
        d.a(paramString, ((t)localObject).qnh, true, paramp.qnp, new d.b()
        {
          public final void Hr(String paramAnonymousString)
          {
            GMTrace.i(8194126512128L, 61051);
            w.e("AdLandingPagesPreDownloadResHelper", " pre download " + localObject.qnh + "is error");
            f.this.Hw(localObject.qnh);
            GMTrace.o(8194126512128L, 61051);
          }
          
          public final void Hs(String paramAnonymousString)
          {
            GMTrace.i(8194260729856L, 61052);
            f.this.Hw(localObject.qnh);
            GMTrace.o(8194260729856L, 61052);
          }
        });
      }
      if (!Hv(((t)localObject).qnM))
      {
        this.qun.add(((t)localObject).qnM);
        d.a("adId", ((t)localObject).qnM, true, paramp.qnp, 0, new d.a()
        {
          public final void Hp(String paramAnonymousString)
          {
            GMTrace.i(8203119099904L, 61118);
            f.this.Hw(localObject.qnM);
            GMTrace.o(8203119099904L, 61118);
          }
          
          public final void biT()
          {
            GMTrace.i(8202850664448L, 61116);
            GMTrace.o(8202850664448L, 61116);
          }
          
          public final void biU()
          {
            GMTrace.i(8202984882176L, 61117);
            w.e("AdLandingPagesPreDownloadResHelper", " pre download " + localObject.qnM + "is error");
            f.this.Hw(localObject.qnh);
            GMTrace.o(8202984882176L, 61117);
          }
        });
      }
      GMTrace.o(8191039504384L, 61028);
      return;
    }
  }
  
  public final void d(final String paramString1, String paramString2, String paramString3, int paramInt)
  {
    GMTrace.i(8191173722112L, 61029);
    Object localObject = ((ConnectivityManager)ab.getContext().getSystemService("connectivity")).getActiveNetworkInfo();
    paramString2 = e.k(paramString2, paramString3, "", "");
    int i;
    if (paramInt == 0)
    {
      if ((localObject != null) && (((NetworkInfo)localObject).getType() == 1))
      {
        w.i("AdLandingPagesPreDownloadResHelper", "start pre download all resource in wifi");
        paramString2 = paramString2.iterator();
        while (paramString2.hasNext())
        {
          paramString3 = (c)paramString2.next();
          localObject = paramString3.qtX.iterator();
          while (((Iterator)localObject).hasNext()) {
            a(paramString1, (p)((Iterator)localObject).next());
          }
          Hx(paramString3.qtV);
        }
        GMTrace.o(8191173722112L, 61029);
        return;
      }
      w.i("AdLandingPagesPreDownloadResHelper", "start pre download resource in no wifi");
      i = g.uz().getInt("SnsAdNativePageNormalFeedPreloadPageCount", 1);
      paramInt = g.uz().getInt("SnsAdNativePageNormalFeedPreloadResourceCount", 2);
      if (paramString2.size() > 0)
      {
        paramString2 = paramString2.iterator();
        if (paramString2.hasNext())
        {
          paramString3 = (c)paramString2.next();
          Hx(paramString3.qtV);
          if ((paramInt > 0) && (i > 0))
          {
            paramString3 = paramString3.qtX.iterator();
            label233:
            if (!paramString3.hasNext()) {
              break label544;
            }
            af.u(new Runnable()
            {
              public final void run()
              {
                GMTrace.i(8187147190272L, 60999);
                f.this.a(paramString1, this.qur);
                GMTrace.o(8187147190272L, 60999);
              }
            });
            paramInt -= 1;
            if (paramInt > 0) {
              break label541;
            }
          }
        }
      }
    }
    label409:
    label535:
    label538:
    label541:
    label544:
    for (;;)
    {
      i -= 1;
      break;
      GMTrace.o(8191173722112L, 61029);
      return;
      if (paramInt == 1)
      {
        w.i("AdLandingPagesPreDownloadResHelper", "start pre download first pages resource");
        if ((localObject != null) && (((NetworkInfo)localObject).getType() == 1))
        {
          w.i("AdLandingPagesPreDownloadResHelper", "start pre download resource in shared scene in wifi");
          i = g.uz().getInt("SnsAdNativePageForwardFeedPreloadPageCount", 1);
          paramInt = g.uz().getInt("SnsAdNativePageForwardFeedPreloadResourceCount", 2);
          if (paramString2.size() > 0)
          {
            paramString2 = paramString2.iterator();
            if (paramString2.hasNext())
            {
              paramString3 = (c)paramString2.next();
              Hx(paramString3.qtV);
              if ((paramInt > 0) && (i > 0))
              {
                paramString3 = paramString3.qtX.iterator();
                if (!paramString3.hasNext()) {
                  break label538;
                }
                af.u(new Runnable()
                {
                  public final void run()
                  {
                    GMTrace.i(20373848457216L, 151797);
                    f.this.a(paramString1, this.qur);
                    GMTrace.o(20373848457216L, 151797);
                  }
                });
                paramInt -= 1;
                if (paramInt > 0) {
                  break label535;
                }
              }
            }
          }
        }
      }
      for (;;)
      {
        i -= 1;
        break;
        GMTrace.o(8191173722112L, 61029);
        return;
        w.i("AdLandingPagesPreDownloadResHelper", "start pre download resource in shared scene in no wifi,this can't download everything");
        paramString1 = paramString2.iterator();
        while (paramString1.hasNext()) {
          Hx(((c)paramString1.next()).qtV);
        }
        GMTrace.o(8191173722112L, 61029);
        return;
        w.e("AdLandingPagesPreDownloadResHelper", "the dwnloadKind is error");
        GMTrace.o(8191173722112L, 61029);
        return;
        break label409;
      }
      break label233;
    }
  }
}


/* Location:              /Users/xianghongyan/decompile/dex2jar/classes2-dex2jar.jar!/com/tencent/mm/plugin/sns/storage/AdLandingPagesStorage/f.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */