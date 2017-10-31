package com.tencent.mm.plugin.favorite.b;

import android.os.HandlerThread;
import android.os.Looper;
import android.os.Message;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.ac.b.a;
import com.tencent.mm.ac.b.b;
import com.tencent.mm.ac.b.c;
import com.tencent.mm.ac.k.b;
import com.tencent.mm.network.p;
import com.tencent.mm.protocal.ad;
import com.tencent.mm.protocal.c.axs;
import com.tencent.mm.protocal.c.bp;
import com.tencent.mm.protocal.c.mx;
import com.tencent.mm.protocal.c.my;
import com.tencent.mm.protocal.c.tb;
import com.tencent.mm.protocal.c.tc;
import com.tencent.mm.sdk.platformtools.ae;
import com.tencent.mm.sdk.platformtools.bg;
import com.tencent.mm.sdk.platformtools.w;
import com.tencent.mm.storage.t;
import com.tencent.mm.x.ap;
import com.tencent.mm.x.c;
import java.io.IOException;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedList;

public final class af
  extends com.tencent.mm.ac.k
  implements com.tencent.mm.network.j
{
  public static final byte[] lPR;
  private int cvb;
  final com.tencent.mm.ac.b gMC;
  com.tencent.mm.ac.e gMF;
  private a lPS;
  long lPT;
  public boolean lPU;
  
  static
  {
    GMTrace.i(6303267160064L, 46963);
    lPR = null;
    GMTrace.o(6303267160064L, 46963);
  }
  
  public af()
  {
    GMTrace.i(6301924982784L, 46953);
    this.gMF = null;
    this.cvb = 1;
    this.lPS = new a();
    this.lPT = -1L;
    this.lPU = false;
    b.a locala = new b.a();
    locala.hlX = new tb();
    locala.hlY = new tc();
    locala.uri = "/cgi-bin/micromsg-bin/favsync";
    locala.hlW = 400;
    locala.hlZ = 195;
    locala.hma = 1000000195;
    locala.hmb = false;
    this.gMC = locala.DA();
    GMTrace.o(6301924982784L, 46953);
  }
  
  public af(int paramInt)
  {
    GMTrace.i(15698239684608L, 116961);
    this.gMF = null;
    this.cvb = 1;
    this.lPS = new a();
    this.lPT = -1L;
    this.lPU = false;
    b.a locala = new b.a();
    locala.hlX = new tb();
    locala.hlY = new tc();
    locala.uri = "/cgi-bin/micromsg-bin/favsync";
    locala.hlW = 400;
    locala.hlZ = 195;
    locala.hma = 1000000195;
    locala.hmb = false;
    this.gMC = locala.DA();
    this.cvb = paramInt;
    GMTrace.o(15698239684608L, 116961);
  }
  
  public final boolean DE()
  {
    GMTrace.i(6302193418240L, 46955);
    GMTrace.o(6302193418240L, 46955);
    return true;
  }
  
  public final int a(com.tencent.mm.network.e parame, com.tencent.mm.ac.e parame1)
  {
    GMTrace.i(6302327635968L, 46956);
    this.gMF = parame1;
    tb localtb = (tb)this.gMC.hlU.hmc;
    localtb.tEN = this.cvb;
    e locale = com.tencent.mm.plugin.favorite.h.awA();
    parame1 = locale.awG();
    if (8216 != parame1.field_configId)
    {
      w.w("MicroMsg.FavConfigStorage", "get sync key from fav db fail, try to load from mmdb");
      ap.AS();
      if (((Boolean)c.xi().get(8224, Boolean.valueOf(false))).booleanValue()) {
        w.w("MicroMsg.FavConfigStorage", "get sync from mmdb fail, has trans");
      }
    }
    else
    {
      w.i("MicroMsg.FavConfigStorage", "get sync key, id %d, value %s", new Object[] { Integer.valueOf(parame1.field_configId), parame1.field_value });
      parame1 = bg.RA(parame1.field_value);
    }
    for (;;)
    {
      if (this.cvb == 2) {
        parame1 = new byte[0];
      }
      localtb.tEO = com.tencent.mm.platformtools.n.H(parame1);
      int i = a(parame, this.gMC, this);
      GMTrace.o(6302327635968L, 46956);
      return i;
      ap.AS();
      parame1 = bg.mY((String)c.xi().get(8216, ""));
      w.i("MicroMsg.FavConfigStorage", "get sync key(%s) from mmdb, do update fav sync key", new Object[] { parame1 });
      parame1 = bg.RA(parame1);
      locale.aq(parame1);
      w.w("MicroMsg.FavConfigStorage", "set fav sync key has trans");
      ap.AS();
      c.xi().set(8224, Boolean.valueOf(true));
    }
  }
  
  protected final int a(p paramp)
  {
    GMTrace.i(6302730289152L, 46959);
    int i = k.b.hmE;
    GMTrace.o(6302730289152L, 46959);
    return i;
  }
  
  public final void a(int paramInt1, int paramInt2, int paramInt3, String paramString, p paramp, byte[] paramArrayOfByte)
  {
    GMTrace.i(6302461853696L, 46957);
    w.i("MicroMsg.NetSceneFavSync", "netId : " + paramInt1 + " errType :" + paramInt2 + " errCode: " + paramInt3 + " errMsg :" + paramString);
    if (com.tencent.mm.plugin.favorite.h.awt().frZ)
    {
      w.w("MicroMsg.NetSceneFavSync", "sending item, skip sync onGYNetEnd");
      this.gMF.a(paramInt2, paramInt3, paramString, this);
      GMTrace.o(6302461853696L, 46957);
      return;
    }
    if ((paramInt2 != 0) || (paramInt3 != 0))
    {
      this.gMF.a(paramInt2, paramInt3, paramString, this);
      GMTrace.o(6302461853696L, 46957);
      return;
    }
    tc localtc = (tc)((com.tencent.mm.ac.b)paramp).hlV.hmc;
    paramArrayOfByte = localtc.tER.jWR;
    if ((paramArrayOfByte != null) && (paramArrayOfByte.size() > 0))
    {
      w.i("MicroMsg.NetSceneFavSync", "cmdList size:" + paramArrayOfByte.size());
      if (this.cvb != 2)
      {
        paramString = this.lPS;
        paramString.lPV = paramArrayOfByte;
        if ((paramString.lPV != null) && (paramString.lPV.size() > 0))
        {
          paramp = new ag();
          ap.wT().a(paramp, 0);
        }
        paramString.lPW.sendEmptyMessage(0);
        GMTrace.o(6302461853696L, 46957);
        return;
      }
      paramp = paramArrayOfByte.iterator();
      while (paramp.hasNext())
      {
        paramArrayOfByte = com.tencent.mm.platformtools.n.a(((mx)paramp.next()).tJq);
        try
        {
          paramInt1 = ((bp)new bp().aC(paramArrayOfByte)).tve;
        }
        catch (IOException paramArrayOfByte)
        {
          w.e("MicroMsg.NetSceneFavSync", "get favdelitem error, errmsg is %s", new Object[] { paramArrayOfByte.getMessage() });
        }
      }
      this.gMF.a(paramInt2, paramInt3, paramString, this);
      GMTrace.o(6302461853696L, 46957);
      return;
    }
    if (localtc.tEO.ush != null)
    {
      paramArrayOfByte = localtc.tEO.ush.toByteArray();
      paramp = ad.g(((tb)((com.tencent.mm.ac.b)paramp).hlU.hmc).tEO.ush.toByteArray(), paramArrayOfByte);
      if ((paramp != null) && (paramp.length > 0)) {
        com.tencent.mm.plugin.favorite.h.awA().aq(paramp);
      }
    }
    for (;;)
    {
      ap.AS();
      c.xi().set(8217, Integer.valueOf(1));
      this.gMF.a(paramInt2, paramInt3, paramString, this);
      GMTrace.o(6302461853696L, 46957);
      return;
      w.e("MicroMsg.NetSceneFavSync", "merge key should not be null");
    }
  }
  
  public final void ar(byte[] paramArrayOfByte)
  {
    int j = 1;
    GMTrace.i(16031770738688L, 119446);
    if (paramArrayOfByte != null) {}
    for (;;)
    {
      try
      {
        i = paramArrayOfByte.length;
        w.i("MicroMsg.NetSceneFavSync", "processAddItem bufSize=%d", new Object[] { Integer.valueOf(i) });
        bp localbp = (bp)new bp().aC(paramArrayOfByte);
        if (localbp == null)
        {
          w.e("MicroMsg.NetSceneFavSync", "klem processAddItem favitem null");
          GMTrace.o(16031770738688L, 119446);
          return;
          i = 0;
          continue;
        }
        w.i("MicroMsg.NetSceneFavSync", "klem processAddItem id:%d, flag:%d, updateSeq:%d, updateTime:%d", new Object[] { Integer.valueOf(localbp.tvd), Integer.valueOf(localbp.tve), Integer.valueOf(localbp.tvg), Integer.valueOf(localbp.tvf) });
        if ((localbp.tve & 0x1) != 0)
        {
          x.a(com.tencent.mm.plugin.favorite.h.awD().cd(localbp.tvd), false, null);
          GMTrace.o(16031770738688L, 119446);
          return;
        }
        if ((this.lPT < 0L) || (localbp.tvf < this.lPT)) {
          this.lPT = localbp.tvf;
        }
        paramArrayOfByte = com.tencent.mm.plugin.favorite.h.awD().cd(localbp.tvd);
        if (paramArrayOfByte != null) {
          break label395;
        }
        paramArrayOfByte = new j();
        paramArrayOfByte.field_updateTime = (localbp.tvf * 1000L);
        i = j;
        paramArrayOfByte.field_id = localbp.tvd;
        paramArrayOfByte.field_updateSeq = localbp.tvg;
        if (paramArrayOfByte.field_localSeq == localbp.tvg) {
          paramArrayOfByte.field_updateTime = (localbp.tvf * 1000L);
        }
        paramArrayOfByte.field_flag = localbp.tve;
        paramArrayOfByte.field_type = localbp.jXP;
        if (i != 0)
        {
          paramArrayOfByte.field_localId = System.currentTimeMillis();
          com.tencent.mm.plugin.favorite.h.awD().c(paramArrayOfByte);
          GMTrace.o(16031770738688L, 119446);
          return;
        }
      }
      catch (IOException paramArrayOfByte)
      {
        w.printErrStackTrace("MicroMsg.NetSceneFavSync", paramArrayOfByte, "", new Object[0]);
        GMTrace.o(16031770738688L, 119446);
        return;
      }
      com.tencent.mm.plugin.favorite.h.awD().a(paramArrayOfByte, new String[] { "localId" });
      GMTrace.o(16031770738688L, 119446);
      return;
      label395:
      int i = 0;
    }
  }
  
  public final int getType()
  {
    GMTrace.i(6302864506880L, 46960);
    GMTrace.o(6302864506880L, 46960);
    return 400;
  }
  
  protected final int vG()
  {
    GMTrace.i(6302596071424L, 46958);
    GMTrace.o(6302596071424L, 46958);
    return 50;
  }
  
  final class a
  {
    LinkedList<mx> lPV;
    ae lPW;
    
    a()
    {
      GMTrace.i(6274141913088L, 46746);
      this.lPW = new ae(ap.xC().nTP.getLooper())
      {
        public final void handleMessage(Message paramAnonymousMessage)
        {
          GMTrace.i(6271860211712L, 46729);
          if ((af.a.this.lPV == null) || (af.a.this.lPV.isEmpty()))
          {
            af localaf = af.this;
            paramAnonymousMessage = (tb)localaf.gMC.hlU.hmc;
            Object localObject = (tc)localaf.gMC.hlV.hmc;
            byte[] arrayOfByte = ((tc)localObject).tEO.ush.toByteArray();
            arrayOfByte = ad.g(paramAnonymousMessage.tEO.ush.toByteArray(), arrayOfByte);
            if ((arrayOfByte != null) && (arrayOfByte.length > 0)) {
              com.tencent.mm.plugin.favorite.h.awA().aq(arrayOfByte);
            }
            paramAnonymousMessage.tEO = com.tencent.mm.platformtools.n.H(arrayOfByte);
            int i = ((tc)localObject).tCI;
            if ((paramAnonymousMessage.tEN & i) == 0)
            {
              w.i("MicroMsg.NetSceneFavSync", "processEnd, minUpdateTime:%d", new Object[] { Long.valueOf(localaf.lPT) });
              ap.AS();
              c.xi().set(8217, Integer.valueOf(1));
              if (localaf.lPT > 0L)
              {
                localObject = com.tencent.mm.plugin.favorite.h.awD().p(localaf.lPT, -1);
                if (((LinkedList)localObject).size() > 0)
                {
                  paramAnonymousMessage = (Message)localObject;
                  if (((LinkedList)localObject).size() > 40)
                  {
                    localObject = ((LinkedList)localObject).subList(0, 40);
                    paramAnonymousMessage = new LinkedList();
                    paramAnonymousMessage.addAll((Collection)localObject);
                  }
                  localaf.lPU = true;
                  w.i("MicroMsg.NetSceneFavSync", "processEnd, start batch get list size:%d", new Object[] { Integer.valueOf(paramAnonymousMessage.size()) });
                  paramAnonymousMessage = new ac(paramAnonymousMessage);
                  if (!ap.wT().a(paramAnonymousMessage, 0))
                  {
                    w.w("MicroMsg.NetSceneFavSync", "do scene BatchGetFav fail");
                    ac.axr();
                  }
                }
              }
              localaf.gMF.a(0, 0, "", localaf);
              GMTrace.o(6271860211712L, 46729);
              return;
            }
            w.i("MicroMsg.NetSceneFavSync", "continue flag:%d", new Object[] { Integer.valueOf(((tc)localObject).tCI) });
            localaf.a(localaf.hmo, localaf.gMF);
            GMTrace.o(6271860211712L, 46729);
            return;
          }
          paramAnonymousMessage = (mx)af.a.this.lPV.getFirst();
          w.d("MicroMsg.NetSceneFavSync", "cmdId = " + paramAnonymousMessage.tJp);
          af.a.this.lPV.removeFirst();
          switch (paramAnonymousMessage.tJp)
          {
          }
          for (;;)
          {
            GMTrace.o(6271860211712L, 46729);
            return;
            paramAnonymousMessage = com.tencent.mm.platformtools.n.a(paramAnonymousMessage.tJq);
            if (paramAnonymousMessage == null)
            {
              w.e("MicroMsg.NetSceneFavSync", "docmd: no protobuf found.");
              sendEmptyMessage(0);
              GMTrace.o(6271860211712L, 46729);
              return;
            }
            af.this.ar(paramAnonymousMessage);
            sendEmptyMessage(0);
          }
        }
      };
      GMTrace.o(6274141913088L, 46746);
    }
  }
}


/* Location:              /Users/xianghongyan/decompile/dex2jar/classes2-dex2jar.jar!/com/tencent/mm/plugin/favorite/b/af.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */