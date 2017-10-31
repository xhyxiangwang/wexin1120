package com.tencent.mm.plugin.wear.model.e;

import android.os.Looper;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.e.b.g.a;
import com.tencent.mm.g.a.sr;
import com.tencent.mm.g.a.st;
import com.tencent.mm.k.e;
import com.tencent.mm.kernel.h;
import com.tencent.mm.modelvoice.q;
import com.tencent.mm.plugin.wear.model.j;
import com.tencent.mm.pluginsdk.i.n;
import com.tencent.mm.protocal.c.bfp;
import com.tencent.mm.protocal.c.bqb;
import com.tencent.mm.protocal.c.bqv;
import com.tencent.mm.protocal.c.bqw;
import com.tencent.mm.protocal.c.bqx;
import com.tencent.mm.protocal.c.bqy;
import com.tencent.mm.protocal.c.brc;
import com.tencent.mm.protocal.c.bry;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.w;
import com.tencent.mm.storage.as;
import com.tencent.mm.x.ap;
import com.tencent.mm.x.o;
import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.LinkedList;
import java.util.List;

public final class m
  extends a
{
  public m()
  {
    GMTrace.i(9202638520320L, 68565);
    GMTrace.o(9202638520320L, 68565);
  }
  
  public final List<Integer> bzC()
  {
    GMTrace.i(9202772738048L, 68566);
    ArrayList localArrayList = new ArrayList();
    localArrayList.add(Integer.valueOf(11022));
    localArrayList.add(Integer.valueOf(11023));
    localArrayList.add(Integer.valueOf(11025));
    localArrayList.add(Integer.valueOf(11024));
    localArrayList.add(Integer.valueOf(11026));
    localArrayList.add(Integer.valueOf(11029));
    GMTrace.o(9202772738048L, 68566);
    return localArrayList;
  }
  
  protected final byte[] l(int paramInt, byte[] paramArrayOfByte)
  {
    GMTrace.i(9203041173504L, 68568);
    switch (paramInt)
    {
    }
    for (;;)
    {
      GMTrace.o(9203041173504L, 68568);
      return null;
      Object localObject = new bqy();
      try
      {
        ((bqy)localObject).aC(paramArrayOfByte);
        com.tencent.mm.plugin.wear.model.a.bzo().shn.a(new a((bqy)localObject));
        com.tencent.mm.plugin.wear.model.a.bzo().shj.Kc(((bqy)localObject).uFL);
        com.tencent.mm.plugin.wear.model.c.a.dB(2, ((bqy)localObject).ttY);
        com.tencent.mm.plugin.wear.model.c.a.wQ(2);
        continue;
        localObject = new bqx();
      }
      catch (IOException paramArrayOfByte)
      {
        try
        {
          ((bqx)localObject).aC(paramArrayOfByte);
          com.tencent.mm.plugin.messenger.a.d.aNb().A(((bqx)localObject).uFL, ((bqx)localObject).tXq, o.fY(((bqx)localObject).uFL));
          ap.AS();
          com.tencent.mm.x.c.yQ().SX(((bqx)localObject).uFL);
          com.tencent.mm.plugin.wear.model.c.a.dB(3, ((bqx)localObject).ttY);
          com.tencent.mm.plugin.wear.model.c.a.wQ(5);
          continue;
          localObject = new bqw();
        }
        catch (IOException paramArrayOfByte)
        {
          try
          {
            ((bqw)localObject).aC(paramArrayOfByte);
            com.tencent.mm.plugin.messenger.a.d.aNb().A(((bqw)localObject).uFL, ((bqw)localObject).tXq, o.fY(((bqw)localObject).uFL));
            ((com.tencent.mm.plugin.emoji.b.c)h.j(com.tencent.mm.plugin.emoji.b.c.class)).getEmojiMgr().m(ab.getContext(), ((bqw)localObject).uFL, ((bqw)localObject).tLN);
            ap.AS();
            com.tencent.mm.x.c.yQ().SX(((bqw)localObject).uFL);
            com.tencent.mm.plugin.wear.model.c.a.dB(8, ((bqw)localObject).ttY);
            com.tencent.mm.plugin.wear.model.c.a.wQ(4);
            continue;
            localObject = new bqv();
          }
          catch (IOException paramArrayOfByte)
          {
            try
            {
              ((bqv)localObject).aC(paramArrayOfByte);
              ((com.tencent.mm.plugin.emoji.b.c)h.j(com.tencent.mm.plugin.emoji.b.c.class)).getEmojiMgr().m(ab.getContext(), ((bqv)localObject).uFL, ((bqv)localObject).tLN);
              ap.AS();
              com.tencent.mm.x.c.yQ().SX(((bqv)localObject).uFL);
              com.tencent.mm.plugin.wear.model.c.a.dB(7, ((bqv)localObject).ttY);
              com.tencent.mm.plugin.wear.model.c.a.wQ(3);
              continue;
              localObject = new brc();
            }
            catch (IOException paramArrayOfByte)
            {
              try
              {
                ((brc)localObject).aC(paramArrayOfByte);
                com.tencent.mm.plugin.wear.model.a.bzo();
                paramArrayOfByte = com.tencent.mm.plugin.wear.model.a.bzo().shh.shy.sim;
                if (paramArrayOfByte == null)
                {
                  w.e("MicroMsg.Wear.WearBizLogic", "logicRequest is null");
                  continue;
                }
                w.i("MicroMsg.Wear.WearBizLogic", "receive step count %d | time %s", new Object[] { Integer.valueOf(((brc)localObject).uGl), n.ab("yyyy-MM-dd HH:mm:ss", ((brc)localObject).uGm / 1000L) });
                localbry = new bry();
                bfp localbfp = new bfp();
                if (((brc)localObject).uGl > 0)
                {
                  paramInt = ((brc)localObject).uGl;
                  localbfp.jXN = paramInt;
                  localbfp.tMS = ((int)(((brc)localObject).uGm / 1000L));
                  Calendar localCalendar = Calendar.getInstance();
                  localCalendar.setTimeInMillis(((brc)localObject).uGm);
                  localbfp.uxJ = localCalendar.get(1);
                  localbfp.uxK = (localCalendar.get(2) + 1);
                  localbfp.uxL = localCalendar.get(5);
                  localbfp.uxM = localCalendar.get(11);
                  localbfp.uxN = localCalendar.get(12);
                  localbfp.uxO = localCalendar.get(13);
                  localbry.uGW.add(localbfp);
                  localObject = new st();
                }
              }
              catch (IOException paramArrayOfByte)
              {
                try
                {
                  for (;;)
                  {
                    bry localbry;
                    ((st)localObject).fRw.data = localbry.toByteArray();
                    ((st)localObject).fRw.fvy = 4;
                    ((st)localObject).fRw.flE = paramArrayOfByte.uFE;
                    ((st)localObject).fRw.fxj = "gh_43f2581f6fd6";
                    com.tencent.mm.sdk.b.a.uLm.m((com.tencent.mm.sdk.b.b)localObject);
                    break;
                    paramInt = 0;
                    continue;
                    if ((!com.tencent.mm.plugin.wear.model.a.bzo().shh.bzt()) || (com.tencent.mm.k.g.uz().getInt("WearLuckyBlock", 0) != 0))
                    {
                      GMTrace.o(9203041173504L, 68568);
                      return null;
                    }
                    long l1 = 0L;
                    try
                    {
                      long l2 = Long.valueOf(new String(paramArrayOfByte)).longValue();
                      l1 = l2;
                    }
                    catch (Exception paramArrayOfByte)
                    {
                      for (;;) {}
                    }
                    paramArrayOfByte = new sr();
                    paramArrayOfByte.fRk.action = 1;
                    paramArrayOfByte.fRk.fvM = l1;
                    com.tencent.mm.sdk.b.a.uLm.a(paramArrayOfByte, Looper.getMainLooper());
                    com.tencent.mm.plugin.wear.model.c.a.dB(11, 0);
                    com.tencent.mm.plugin.wear.model.c.a.wQ(11);
                    break;
                    paramArrayOfByte = paramArrayOfByte;
                    continue;
                    paramArrayOfByte = paramArrayOfByte;
                    continue;
                    paramArrayOfByte = paramArrayOfByte;
                    continue;
                    paramArrayOfByte = paramArrayOfByte;
                  }
                  paramArrayOfByte = paramArrayOfByte;
                }
                catch (IOException localIOException)
                {
                  for (;;) {}
                }
              }
            }
          }
        }
      }
    }
  }
  
  protected final boolean wS(int paramInt)
  {
    GMTrace.i(9202906955776L, 68567);
    switch (paramInt)
    {
    case 11024: 
    default: 
      GMTrace.o(9202906955776L, 68567);
      return false;
    }
    GMTrace.o(9202906955776L, 68567);
    return true;
  }
  
  private static final class a
    extends com.tencent.mm.plugin.wear.model.f.d
  {
    private bqy sio;
    
    public a(bqy parambqy)
    {
      GMTrace.i(9202235867136L, 68562);
      this.sio = parambqy;
      GMTrace.o(9202235867136L, 68562);
    }
    
    protected final void execute()
    {
      GMTrace.i(9202370084864L, 68563);
      String str = q.mz(this.sio.uFL);
      w.i("MicroMsg.Wear.HttpReplyServer", "get fileName=%s", new Object[] { str });
      Object localObject = q.E(str, false);
      w.i("MicroMsg.Wear.HttpReplyServer", "get fullPath=%s", new Object[] { localObject });
      ByteArrayInputStream localByteArrayInputStream = new ByteArrayInputStream(this.sio.twT.toByteArray());
      com.tencent.mm.e.c.c localc = new com.tencent.mm.e.c.c(8000, 16000);
      localc.bP((String)localObject);
      localObject = new byte['ŀ'];
      int i = 0;
      for (;;)
      {
        try
        {
          int j = localByteArrayInputStream.read((byte[])localObject, 0, 320);
          i = j;
        }
        catch (IOException localIOException)
        {
          continue;
        }
        if (i <= 0) {
          continue;
        }
        localc.a(new g.a((byte[])localObject, i), 0, false);
      }
      localc.qN();
      w.i("MicroMsg.Wear.HttpReplyServer", "amr compress finish");
      q.N(str, (int)this.sio.uGg);
      com.tencent.mm.modelvoice.m.NF().run();
      w.i("MicroMsg.Wear.HttpReplyServer", "run service to send the voice");
      ap.AS();
      com.tencent.mm.x.c.yQ().SX(this.sio.uFL);
      GMTrace.o(9202370084864L, 68563);
    }
    
    public final String getName()
    {
      GMTrace.i(9202504302592L, 68564);
      GMTrace.o(9202504302592L, 68564);
      return "SendVioceMsgTask";
    }
  }
}


/* Location:              /Users/xianghongyan/decompile/dex2jar/classes2-dex2jar.jar!/com/tencent/mm/plugin/wear/model/e/m.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */