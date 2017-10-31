package com.tencent.mm.plugin.wear.model;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.os.HandlerThread;
import android.os.Message;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.ac.d.c;
import com.tencent.mm.bt.g.d;
import com.tencent.mm.plugin.wear.model.e.f;
import com.tencent.mm.plugin.wear.model.e.h;
import com.tencent.mm.plugin.wear.model.e.k;
import com.tencent.mm.plugin.wear.model.e.l;
import com.tencent.mm.plugin.wear.model.e.m;
import com.tencent.mm.plugin.wear.model.e.n;
import com.tencent.mm.plugin.wear.model.e.o;
import com.tencent.mm.plugin.wear.model.e.p;
import com.tencent.mm.plugin.wear.model.e.q;
import com.tencent.mm.plugin.wear.model.e.r;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.ae;
import com.tencent.mm.sdk.platformtools.aj;
import com.tencent.mm.sdk.platformtools.w;
import com.tencent.mm.storage.ar;
import com.tencent.mm.x.am;
import com.tencent.mm.x.ap;
import com.tencent.mm.x.bn;
import java.util.HashMap;

public final class a
  implements am
{
  q shf;
  public r shg;
  public d shh;
  private e shi;
  public g shj;
  public b shk;
  private WearMessageLogic shl;
  private i shm;
  public j shn;
  public com.tencent.mm.plugin.wear.model.g.a sho;
  private com.tencent.mm.ac.d shp;
  
  public a()
  {
    GMTrace.i(9185190215680L, 68435);
    w.i("MicroMsg.Wear.SubCoreWear", "Create SubCore, classLoader=%s", new Object[] { getClass().getClassLoader() });
    GMTrace.o(9185190215680L, 68435);
  }
  
  public static a bzo()
  {
    GMTrace.i(9185458651136L, 68437);
    a locala2 = (a)ap.AL().gJ("plugin.wear");
    a locala1 = locala2;
    if (locala2 == null)
    {
      locala1 = new a();
      ap.AL().a("plugin.wear", locala1);
    }
    GMTrace.o(9185458651136L, 68437);
    return locala1;
  }
  
  public final void aW(boolean paramBoolean)
  {
    GMTrace.i(9185727086592L, 68439);
    com.tencent.mm.pluginsdk.l.ab.sRy = new c();
    w.i("MicroMsg.Wear.SubCoreWear", "onAccountPostReset, updated=%b", new Object[] { Boolean.valueOf(paramBoolean) });
    this.shf = new q();
    this.shg = new r();
    this.shn = new j();
    this.shi = new e();
    this.shj = new g();
    this.shk = new b();
    this.shh = new d();
    this.shl = new WearMessageLogic();
    this.shm = new i();
    this.sho = new com.tencent.mm.plugin.wear.model.g.a();
    this.shp = new com.tencent.mm.plugin.wear.model.g.b();
    d.c.a(Integer.valueOf(63), this.shp);
    this.shf.a(this.shh.shx);
    this.shf.a(this.shh.shy);
    this.shf.a(this.shh.shz);
    this.shf.a(new h());
    this.shf.a(new com.tencent.mm.plugin.wear.model.e.g());
    this.shf.a(new com.tencent.mm.plugin.wear.model.e.d());
    this.shf.a(new com.tencent.mm.plugin.wear.model.e.c());
    this.shf.a(new com.tencent.mm.plugin.wear.model.e.e());
    this.shf.a(new f());
    this.shf.a(new k());
    this.shf.a(new m());
    this.shf.a(new o());
    this.shf.a(new n());
    this.shf.a(new l());
    this.shn.a(new com.tencent.mm.plugin.wear.model.f.c()
    {
      public final String getName()
      {
        GMTrace.i(9209483624448L, 68616);
        GMTrace.o(9209483624448L, 68616);
        return "PhoneStartTask";
      }
      
      protected final void send()
      {
        GMTrace.i(9209349406720L, 68615);
        r.a(20001, null, false);
        r.a(20008, null, false);
        GMTrace.o(9209349406720L, 68615);
      }
    });
    j localj = this.shn;
    Object localObject = new com.tencent.mm.plugin.wear.model.f.c()
    {
      public final String getName()
      {
        GMTrace.i(18826049617920L, 140265);
        GMTrace.o(18826049617920L, 140265);
        return "SyncFileTask";
      }
      
      protected final void send()
      {
        GMTrace.i(18825915400192L, 140264);
        if (a.this.shh.bzu() != null) {
          a.this.shh.bzu().bzB();
        }
        r.a(20009, null, false);
        r.a(20017, null, false);
        GMTrace.o(18825915400192L, 140264);
      }
    };
    if (localj.jht != null)
    {
      localObject = localj.jht.obtainMessage(0, localObject);
      localj.jht.sendMessageDelayed((Message)localObject, 5000L);
    }
    GMTrace.o(9185727086592L, 68439);
  }
  
  public final void aX(boolean paramBoolean)
  {
    GMTrace.i(9185861304320L, 68440);
    w.i("MicroMsg.Wear.SubCoreWear", "onSdcardMount, mounted=%b", new Object[] { Boolean.valueOf(paramBoolean) });
    GMTrace.o(9185861304320L, 68440);
  }
  
  public final void eI(int paramInt)
  {
    GMTrace.i(9185592868864L, 68438);
    w.i("MicroMsg.Wear.SubCoreWear", "clearPluginData, pluginFlag=%d", new Object[] { Integer.valueOf(paramInt) });
    GMTrace.o(9185592868864L, 68438);
  }
  
  public final void onAccountRelease()
  {
    GMTrace.i(9185995522048L, 68441);
    d.c.aB(Integer.valueOf(63));
    this.shp = null;
    w.i("MicroMsg.Wear.SubCoreWear", "onAccountRelease");
    this.shf.siz.clear();
    this.shf = null;
    this.shg = null;
    Object localObject = this.shi;
    ((e)localObject).ilg.MM();
    ((e)localObject).qzh.dead();
    ((e)localObject).shD.dead();
    ((e)localObject).shE.dead();
    ((e)localObject).shF.dead();
    ((e)localObject).shG.dead();
    ((e)localObject).shH.dead();
    ((e)localObject).shI.dead();
    ((e)localObject).gCR.dead();
    ((e)localObject).nxx.dead();
    ap.AS();
    com.tencent.mm.x.c.yN().a(((e)localObject).lAk);
    this.shi = null;
    this.shj = null;
    localObject = this.shk;
    com.tencent.mm.sdk.b.a.uLm.c(((b)localObject).shs);
    ap.AS();
    com.tencent.mm.x.c.yL().b(((b)localObject).mlf);
    ((b)localObject).sht.MM();
    this.shk = null;
    localObject = this.shh;
    ((d)localObject).shw.finish();
    ((d)localObject).shA.reset();
    this.shh = null;
    localObject = this.shl;
    ab.getContext().unregisterReceiver((BroadcastReceiver)localObject);
    this.shl = null;
    localObject = this.shn;
    if (((j)localObject).handlerThread != null) {
      ((j)localObject).handlerThread.quit();
    }
    this.shn = null;
    localObject = this.shm;
    ((i)localObject).gFp = null;
    ((i)localObject).bzw();
    ab.getContext().unregisterReceiver(((i)localObject).shZ);
    this.shm = null;
    GMTrace.o(9185995522048L, 68441);
  }
  
  public final HashMap<Integer, g.d> vM()
  {
    GMTrace.i(9185324433408L, 68436);
    GMTrace.o(9185324433408L, 68436);
    return null;
  }
}


/* Location:              /Users/xianghongyan/decompile/dex2jar/classes2-dex2jar.jar!/com/tencent/mm/plugin/wear/model/a.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */