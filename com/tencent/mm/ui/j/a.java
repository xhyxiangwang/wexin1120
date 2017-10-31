package com.tencent.mm.ui.j;

import android.annotation.SuppressLint;
import android.content.Context;
import android.os.Bundle;
import android.os.Looper;
import android.os.Message;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.au.i.a;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.ae;
import com.tencent.mm.sdk.platformtools.af;
import com.tencent.mm.sdk.platformtools.bg;
import com.tencent.mm.sdk.platformtools.w;
import com.tencent.mm.storage.t;
import java.util.ArrayList;
import java.util.List;
import org.a.a.a.c.a;
import org.a.d.c;
import org.a.d.j;
import org.a.d.k;

@SuppressLint({"HandlerLeak"})
public final class a
  implements b.a
{
  public Context context;
  public ae qxq;
  public org.a.e.b wPs;
  public org.a.d.i wPt;
  public org.a.d.i wPu;
  private boolean wPv;
  boolean wPw;
  public b wPx;
  public a wPy;
  
  public a()
  {
    GMTrace.i(2885010063360L, 21495);
    this.wPs = null;
    this.wPt = null;
    this.wPu = null;
    this.wPv = false;
    this.wPw = false;
    this.wPx = null;
    this.wPy = null;
    this.context = null;
    this.qxq = new ae()
    {
      public final void handleMessage(Message paramAnonymousMessage)
      {
        GMTrace.i(2886486458368L, 21506);
        Object localObject;
        Context localContext;
        a locala;
        if (paramAnonymousMessage.what == 1000)
        {
          localObject = (String)paramAnonymousMessage.obj;
          if (localObject == null) {
            break label150;
          }
          localContext = a.this.context;
          locala = a.this;
          if (localContext.checkCallingOrSelfPermission("android.permission.INTERNET") == 0) {
            break label133;
          }
          com.tencent.mm.ui.g.a.e.C(localContext, "Error", "Application requires permission to access the Internet");
        }
        for (;;)
        {
          if (paramAnonymousMessage.what == 1010)
          {
            paramAnonymousMessage = (a.c)paramAnonymousMessage.obj;
            localObject = a.this;
            ((a)localObject).wPw = false;
            if (paramAnonymousMessage == a.c.wPD)
            {
              ((a)localObject).wPu = null;
              a.a(null);
            }
            if (((a)localObject).wPy != null) {
              ((a)localObject).wPy.b(paramAnonymousMessage);
            }
          }
          GMTrace.o(2886486458368L, 21506);
          return;
          label133:
          new b(localContext, (String)localObject, locala).show();
          continue;
          label150:
          a.this.c(a.c.wPD);
        }
      }
    };
    Object localObject = new org.a.a.a();
    ((org.a.a.a)localObject).xVf = org.a.a.a.H(c.a.class);
    org.a.g.d.fB("XMr2y8FEVEqZBcZ1TU3gLA", "Invalid Api key");
    ((org.a.a.a)localObject).xVc = "XMr2y8FEVEqZBcZ1TU3gLA";
    org.a.g.d.fB("kyWwA5vbB6H1NDQFufR9hD5vWGStxhweIbatclCo", "Invalid Api secret");
    ((org.a.a.a)localObject).xVd = "kyWwA5vbB6H1NDQFufR9hD5vWGStxhweIbatclCo";
    org.a.g.d.e("wechatapp://sign-in-twitter.wechatapp.com/", "Callback can't be null");
    ((org.a.a.a)localObject).xVe = "wechatapp://sign-in-twitter.wechatapp.com/";
    org.a.g.d.e(((org.a.a.a)localObject).xVf, "You must specify a valid api through the provider() method");
    org.a.g.d.fB(((org.a.a.a)localObject).xVc, "You must provide an api key");
    org.a.g.d.fB(((org.a.a.a)localObject).xVd, "You must provide an api secret");
    this.wPs = ((org.a.a.a)localObject).xVf.a(new org.a.d.a(((org.a.a.a)localObject).xVc, ((org.a.a.a)localObject).xVd, ((org.a.a.a)localObject).xVe, ((org.a.a.a)localObject).xVg, ((org.a.a.a)localObject).scope, ((org.a.a.a)localObject).xVh));
    String str;
    if (com.tencent.mm.kernel.h.xx().wM())
    {
      localObject = (String)com.tencent.mm.kernel.h.xz().xi().get(69377, null);
      str = (String)com.tencent.mm.kernel.h.xz().xi().get(69378, null);
      if ((bg.mZ((String)localObject)) || (bg.mZ(str))) {
        localObject = null;
      }
    }
    for (;;)
    {
      this.wPt = ((org.a.d.i)localObject);
      GMTrace.o(2885010063360L, 21495);
      return;
      localObject = new org.a.d.i((String)localObject, str);
      continue;
      w.e("Twitter", "acchas not ready for restoreTwitterAccessToken");
      localObject = null;
    }
  }
  
  public static void a(org.a.d.i parami)
  {
    GMTrace.i(2885546934272L, 21499);
    ab.getContext().getSharedPreferences(ab.bNa(), 0);
    if (parami == null)
    {
      com.tencent.mm.kernel.h.xz().xi().set(69377, "");
      com.tencent.mm.kernel.h.xz().xi().set(69378, "");
      GMTrace.o(2885546934272L, 21499);
      return;
    }
    com.tencent.mm.kernel.h.xz().xi().set(69377, parami.token);
    com.tencent.mm.kernel.h.xz().xi().set(69378, parami.uih);
    GMTrace.o(2885546934272L, 21499);
  }
  
  public static void mt(boolean paramBoolean)
  {
    GMTrace.i(2886218022912L, 21504);
    ArrayList localArrayList = new ArrayList();
    if (paramBoolean) {}
    for (String str = "1";; str = "2")
    {
      localArrayList.add(new i.a(10251, str));
      ((com.tencent.mm.plugin.messenger.foundation.a.h)com.tencent.mm.kernel.h.h(com.tencent.mm.plugin.messenger.foundation.a.h.class)).yK().b(new com.tencent.mm.au.i(localArrayList));
      GMTrace.o(2886218022912L, 21504);
      return;
    }
  }
  
  public final void a(a parama)
  {
    GMTrace.i(2885412716544L, 21498);
    if (this.wPw)
    {
      GMTrace.o(2885412716544L, 21498);
      return;
    }
    this.wPy = parama;
    this.wPw = true;
    com.tencent.mm.sdk.f.e.post(new Runnable()
    {
      public final void run()
      {
        GMTrace.i(2887157547008L, 21511);
        Object localObject = a.c.wPC;
        if (a.this.wPt == null) {
          localObject = a.c.wPD;
        }
        for (;;)
        {
          localObject = a.this.qxq.obtainMessage(1010, localObject);
          a.this.qxq.sendMessage((Message)localObject);
          GMTrace.o(2887157547008L, 21511);
          return;
          c localc1 = new c(j.xVA, "https://api.twitter.com/1.1/account/verify_credentials.json");
          a.this.wPs.a(a.this.wPt, localc1);
          try
          {
            if (localc1.cqm().code != 200) {
              localObject = a.c.wPD;
            }
          }
          catch (Exception localException)
          {
            w.printErrStackTrace("MicroMsg.Twitter", localException, "request error.", new Object[0]);
            a.c localc = a.c.wPD;
          }
        }
      }
    }, "Twitter_validationAccessToken");
    GMTrace.o(2885412716544L, 21498);
  }
  
  public final void a(b paramb, Context paramContext)
  {
    GMTrace.i(2885144281088L, 21496);
    if (this.wPv)
    {
      GMTrace.o(2885144281088L, 21496);
      return;
    }
    com.tencent.mm.plugin.report.service.g.paX.a(583L, 0L, 1L, false);
    this.wPx = paramb;
    this.context = paramContext;
    this.wPv = true;
    com.tencent.mm.sdk.f.e.post(new Runnable()
    {
      public final void run()
      {
        GMTrace.i(2883667886080L, 21485);
        try
        {
          a.this.wPu = a.this.wPs.cqr();
          Object localObject1 = a.this.wPs.b(a.this.wPu);
          localObject1 = a.this.qxq.obtainMessage(1000, localObject1);
          a.this.qxq.sendMessage((Message)localObject1);
          GMTrace.o(2883667886080L, 21485);
          return;
        }
        catch (org.a.b.a locala)
        {
          for (;;)
          {
            Object localObject2 = null;
          }
        }
      }
    }, "Twitter_doOAuth");
    GMTrace.o(2885144281088L, 21496);
  }
  
  public final void c(c paramc)
  {
    GMTrace.i(2885681152000L, 21500);
    this.wPv = false;
    this.wPu = null;
    if (this.wPx != null) {
      this.wPx.a(paramc);
    }
    GMTrace.o(2885681152000L, 21500);
  }
  
  public final boolean cfO()
  {
    GMTrace.i(2885278498816L, 21497);
    if (this.wPt != null)
    {
      GMTrace.o(2885278498816L, 21497);
      return true;
    }
    GMTrace.o(2885278498816L, 21497);
    return false;
  }
  
  public final void cfP()
  {
    GMTrace.i(2885949587456L, 21502);
    mt(false);
    c(c.wPD);
    com.tencent.mm.plugin.report.service.g.paX.a(583L, 2L, 1L, false);
    GMTrace.o(2885949587456L, 21502);
  }
  
  public final void m(final Bundle paramBundle)
  {
    GMTrace.i(2885815369728L, 21501);
    com.tencent.mm.kernel.h.xC().C(new Runnable()
    {
      public final void run()
      {
        Object localObject3 = null;
        GMTrace.i(2886754893824L, 21508);
        if (a.this.wPu == null)
        {
          GMTrace.o(2886754893824L, 21508);
          return;
        }
        a.mt(true);
        String str = paramBundle.getString("oauth_verifier");
        Object localObject1 = localObject3;
        if (str != null) {
          localObject1 = new k(str);
        }
        try
        {
          localObject1 = a.this.wPs.a(a.this.wPu, (k)localObject1);
          if (localObject1 != null)
          {
            a.this.wPt = ((org.a.d.i)localObject1);
            a.a(a.this.wPt);
            new ae(Looper.getMainLooper()).post(new Runnable()
            {
              public final void run()
              {
                GMTrace.i(2882459926528L, 21476);
                a.this.c(a.c.wPC);
                com.tencent.mm.plugin.report.service.g.paX.a(583L, 1L, 1L, false);
                GMTrace.o(2882459926528L, 21476);
              }
            });
            GMTrace.o(2886754893824L, 21508);
            return;
          }
          new ae(Looper.getMainLooper()).post(new Runnable()
          {
            public final void run()
            {
              GMTrace.i(2880580878336L, 21462);
              a.this.c(a.c.wPD);
              com.tencent.mm.plugin.report.service.g.paX.a(583L, 4L, 1L, false);
              GMTrace.o(2880580878336L, 21462);
            }
          });
          GMTrace.o(2886754893824L, 21508);
          return;
        }
        catch (org.a.b.a locala)
        {
          for (;;)
          {
            Object localObject2 = localObject3;
          }
        }
      }
      
      public final String toString()
      {
        GMTrace.i(2886889111552L, 21509);
        String str = super.toString() + "|onComplete";
        GMTrace.o(2886889111552L, 21509);
        return str;
      }
    });
    GMTrace.o(2885815369728L, 21501);
  }
  
  public final void onCancel()
  {
    GMTrace.i(2886083805184L, 21503);
    mt(false);
    c(c.wPE);
    com.tencent.mm.plugin.report.service.g.paX.a(583L, 3L, 1L, false);
    GMTrace.o(2886083805184L, 21503);
  }
  
  public static abstract interface a
  {
    public abstract void b(a.c paramc);
  }
  
  public static abstract interface b
  {
    public abstract void a(a.c paramc);
  }
  
  public static enum c
  {
    static
    {
      GMTrace.i(2883399450624L, 21483);
      wPC = new c("Finished", 0);
      wPD = new c("Failed", 1);
      wPE = new c("Canceled", 2);
      wPF = new c[] { wPC, wPD, wPE };
      GMTrace.o(2883399450624L, 21483);
    }
    
    private c()
    {
      GMTrace.i(2883265232896L, 21482);
      GMTrace.o(2883265232896L, 21482);
    }
  }
}


/* Location:              /Users/xianghongyan/decompile/dex2jar/classes2-dex2jar.jar!/com/tencent/mm/ui/j/a.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */