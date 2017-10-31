package com.tencent.mm.plugin.sns.model;

import android.content.Context;
import android.content.SharedPreferences;
import android.os.Looper;
import android.os.Message;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.kernel.a;
import com.tencent.mm.kernel.h;
import com.tencent.mm.modelsfs.FileOp;
import com.tencent.mm.modelsfs.SFSContext.FileEntry;
import com.tencent.mm.plugin.sns.storage.l;
import com.tencent.mm.pointers.PInt;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.bg;
import com.tencent.mm.sdk.platformtools.w;
import com.tencent.mm.x.m;
import java.util.Iterator;
import java.util.List;

public final class aa
{
  public static boolean nmt;
  public static char[] qct;
  public com.tencent.mm.sdk.platformtools.ae handler;
  public boolean qcq;
  public long qcr;
  public int qcs;
  
  static
  {
    int i = 0;
    GMTrace.i(8060177219584L, 60053);
    nmt = false;
    qct = new char[36];
    int j = 48;
    while (j <= 57)
    {
      qct[i] = ((char)j);
      j += 1;
      i += 1;
    }
    j = 97;
    while (j <= 122)
    {
      qct[i] = ((char)j);
      j += 1;
      i += 1;
    }
    GMTrace.o(8060177219584L, 60053);
  }
  
  public aa()
  {
    GMTrace.i(8058969260032L, 60044);
    this.qcq = false;
    this.qcr = 0L;
    this.qcs = 0;
    this.handler = new com.tencent.mm.sdk.platformtools.ae(Looper.getMainLooper())
    {
      public final void handleMessage(Message paramAnonymousMessage)
      {
        GMTrace.i(8072256815104L, 60143);
        super.handleMessage(paramAnonymousMessage);
        if ((aa.this.qcs >= 5) || (System.currentTimeMillis() - aa.this.qcr > 300000L))
        {
          w.d("MicroMsg.RemoveSnsTask", "cleanCount: " + aa.this.qcs);
          aa.nmt = false;
          GMTrace.o(8072256815104L, 60143);
          return;
        }
        if (aa.this.qcq)
        {
          GMTrace.o(8072256815104L, 60143);
          return;
        }
        if (aa.nmt) {
          new aa.a(aa.this).m(new String[] { "" });
        }
        GMTrace.o(8072256815104L, 60143);
      }
    };
    GMTrace.o(8058969260032L, 60044);
  }
  
  public static boolean Q(String paramString1, String paramString2, String paramString3)
  {
    GMTrace.i(16041165979648L, 119516);
    paramString1 = FileOp.x(paramString1, true).iterator();
    while (paramString1.hasNext())
    {
      SFSContext.FileEntry localFileEntry = (SFSContext.FileEntry)paramString1.next();
      if (!nmt)
      {
        w.d("MicroMsg.RemoveSnsTask", "broken here by ??");
        GMTrace.o(16041165979648L, 119516);
        return false;
      }
      if ((localFileEntry.name != null) && (!bg.mZ(paramString2)) && (paramString3 != null) && ((localFileEntry.name.contains(paramString2)) || (localFileEntry.name.contains(paramString3)))) {
        w.d("MicroMsg.RemoveSnsTask", "do not delete my bg %s", new Object[] { paramString2 });
      } else if (bg.aF(localFileEntry.timestamp) > 604800000L) {
        FileOp.deleteFile(localFileEntry.name);
      }
    }
    GMTrace.o(16041165979648L, 119516);
    return true;
  }
  
  public static void b(PInt paramPInt1, PInt paramPInt2)
  {
    GMTrace.i(8059103477760L, 60045);
    if (paramPInt2.value + 1 >= 36)
    {
      paramPInt2.value = 0;
      paramPInt1.value = ((paramPInt1.value + 1) % 36);
      GMTrace.o(8059103477760L, 60045);
      return;
    }
    paramPInt2.value = ((paramPInt2.value + 1) % 36);
    GMTrace.o(8059103477760L, 60045);
  }
  
  public final class a
    extends com.tencent.mm.pluginsdk.model.k<String, String, Boolean>
  {
    private String amo;
    private SharedPreferences gZW;
    private String qcv;
    PInt qcw;
    PInt qcx;
    private String qcy;
    private String username;
    
    public a()
    {
      GMTrace.i(8111985262592L, 60439);
      this.gZW = null;
      this.qcv = "";
      this.amo = "";
      this.qcw = new PInt();
      this.qcx = new PInt();
      this.gZW = ab.getContext().getSharedPreferences("preferences_remove_task", 0);
      h.xA();
      if (!h.xx().wM())
      {
        GMTrace.o(8111985262592L, 60439);
        return;
      }
      this.username = m.zF();
      this.qcv = ("remove_key_base" + this.username);
      this.amo = ("remove_key" + this.username);
      h.xA();
      if (!h.xx().wM())
      {
        GMTrace.o(8111985262592L, 60439);
        return;
      }
      if (ae.bgY())
      {
        GMTrace.o(8111985262592L, 60439);
        return;
      }
      if (ae.yI() == null)
      {
        GMTrace.o(8111985262592L, 60439);
        return;
      }
      if (ae.bhs() == null)
      {
        GMTrace.o(8111985262592L, 60439);
        return;
      }
      com.tencent.mm.plugin.sns.storage.k localk = ae.bhs().HE(this.username);
      if (localk != null) {
        this.qcy = localk.field_bgId;
      }
      w.d("MicroMsg.RemoveSnsTask", "my bgid %s", new Object[] { this.qcy });
      aa.this.qcq = true;
      GMTrace.o(8111985262592L, 60439);
    }
    
    private Boolean bgN()
    {
      GMTrace.i(8112119480320L, 60440);
      w.d("MicroMsg.RemoveSnsTask", "simpleCleans sns");
      if (!aa.nmt)
      {
        GMTrace.o(8112119480320L, 60440);
        return Boolean.valueOf(false);
      }
      if (!aa.this.qcq)
      {
        GMTrace.o(8112119480320L, 60440);
        return Boolean.valueOf(false);
      }
      if (ae.bgY())
      {
        aa.nmt = false;
        GMTrace.o(8112119480320L, 60440);
        return Boolean.valueOf(false);
      }
      this.qcw.value = this.gZW.getInt(this.qcv, 0);
      this.qcx.value = this.gZW.getInt(this.amo, 0);
      String str = ae.getAccSnsPath();
      try
      {
        long l = System.currentTimeMillis();
        if (!aa.Q(str + aa.qct[(this.qcw.value % 36)] + "/" + aa.qct[(this.qcx.value % 36)], this.qcy, this.username))
        {
          GMTrace.o(8112119480320L, 60440);
          return Boolean.valueOf(false);
        }
        w.d("MicroMsg.RemoveSnsTask", "clean sns uses time : " + (System.currentTimeMillis() - l) + " " + this.qcw.value + " " + this.qcx.value);
      }
      catch (Exception localException)
      {
        for (;;) {}
      }
      GMTrace.o(8112119480320L, 60440);
      return Boolean.valueOf(true);
    }
    
    public final com.tencent.mm.sdk.platformtools.ae bgG()
    {
      GMTrace.i(8112253698048L, 60441);
      com.tencent.mm.sdk.platformtools.ae localae = ae.bhb();
      GMTrace.o(8112253698048L, 60441);
      return localae;
    }
  }
}


/* Location:              /Users/xianghongyan/decompile/dex2jar/classes2-dex2jar.jar!/com/tencent/mm/plugin/sns/model/aa.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */