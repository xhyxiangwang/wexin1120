package com.tencent.mm.plugin.wear.model.e;

import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.bl.b;
import com.tencent.mm.g.b.ce;
import com.tencent.mm.modelsfs.FileOp;
import com.tencent.mm.modelvoice.o;
import com.tencent.mm.modelvoice.q;
import com.tencent.mm.plugin.wear.model.h;
import com.tencent.mm.protocal.c.bqj;
import com.tencent.mm.protocal.c.bqk;
import com.tencent.mm.protocal.c.bqo;
import com.tencent.mm.protocal.c.bqp;
import com.tencent.mm.protocal.c.bqr;
import com.tencent.mm.protocal.c.bqs;
import com.tencent.mm.sdk.platformtools.w;
import com.tencent.mm.storage.au;
import com.tencent.mm.x.ap;
import java.io.IOException;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public final class j
  extends a
{
  public String sin;
  
  public j()
  {
    GMTrace.i(9201162125312L, 68554);
    this.sin = "";
    GMTrace.o(9201162125312L, 68554);
  }
  
  public final List<Integer> bzC()
  {
    GMTrace.i(9201296343040L, 68555);
    ArrayList localArrayList = new ArrayList();
    localArrayList.add(Integer.valueOf(11019));
    localArrayList.add(Integer.valueOf(11020));
    localArrayList.add(Integer.valueOf(11021));
    localArrayList.add(Integer.valueOf(11031));
    GMTrace.o(9201296343040L, 68555);
    return localArrayList;
  }
  
  protected final byte[] l(int paramInt, byte[] paramArrayOfByte)
  {
    boolean bool = true;
    GMTrace.i(9201430560768L, 68556);
    switch (paramInt)
    {
    }
    for (;;)
    {
      GMTrace.o(9201430560768L, 68556);
      return null;
      Object localObject2 = new bqj();
      try
      {
        ((bqj)localObject2).aC(paramArrayOfByte);
        localObject1 = new bqk();
        ((bqk)localObject1).uFU = ((bqj)localObject2).uFU;
        if (((bqk)localObject1).uFU) {
          ap.AS();
        }
        for (paramArrayOfByte = com.tencent.mm.x.c.yN().E(((bqj)localObject2).twR, ((bqj)localObject2).uoJ);; paramArrayOfByte = com.tencent.mm.x.c.yN().D(((bqj)localObject2).twR, ((bqj)localObject2).uoJ))
        {
          paramInt = 0;
          while ((paramInt < 10) && (paramInt < paramArrayOfByte.size()))
          {
            localObject2 = (au)paramArrayOfByte.get(paramInt);
            ((bqk)localObject1).tYL.add(h.Q((au)localObject2));
            paramInt += 1;
          }
          ap.AS();
        }
        if (paramArrayOfByte.size() > 10) {}
        for (bool = true;; bool = false)
        {
          ((bqk)localObject1).uFC = bool;
          try
          {
            paramArrayOfByte = ((bqk)localObject1).toByteArray();
            GMTrace.o(9201430560768L, 68556);
            return paramArrayOfByte;
          }
          catch (IOException paramArrayOfByte)
          {
            w.printErrStackTrace("MicroMsg.Wear.HttpMessageServer", paramArrayOfByte, "", new Object[0]);
          }
        }
        continue;
        this.sin = "";
        continue;
        com.tencent.mm.plugin.wear.model.c.a.dB(9, 0);
        com.tencent.mm.plugin.wear.model.c.a.wQ(8);
        localObject1 = new bqo();
        try
        {
          ((bqo)localObject1).aC(paramArrayOfByte);
          this.sin = ((bqo)localObject1).twR;
          paramArrayOfByte = new bqp();
          ap.AS();
          localObject1 = com.tencent.mm.x.c.yN().D(((bqo)localObject1).twR, ((bqo)localObject1).uoJ);
          paramInt = 0;
          while ((paramInt < 10) && (paramInt < ((List)localObject1).size()))
          {
            localObject2 = (au)((List)localObject1).get(paramInt);
            paramArrayOfByte.tYL.add(h.Q((au)localObject2));
            paramInt += 1;
          }
          if (((List)localObject1).size() <= 10) {}
        }
        catch (IOException paramArrayOfByte)
        {
          GMTrace.o(9201430560768L, 68556);
          return null;
        }
        for (;;)
        {
          paramArrayOfByte.uFC = bool;
          try
          {
            paramArrayOfByte = paramArrayOfByte.toByteArray();
            GMTrace.o(9201430560768L, 68556);
            return paramArrayOfByte;
          }
          catch (IOException paramArrayOfByte)
          {
            w.printErrStackTrace("MicroMsg.Wear.HttpMessageServer", paramArrayOfByte, "", new Object[0]);
          }
          bool = false;
        }
        continue;
        com.tencent.mm.plugin.wear.model.c.a.dB(12, 0);
        com.tencent.mm.plugin.wear.model.c.a.wQ(14);
        localObject1 = new bqr();
      }
      catch (IOException paramArrayOfByte)
      {
        try
        {
          Object localObject1;
          ((bqr)localObject1).aC(paramArrayOfByte);
          ap.AS();
          paramArrayOfByte = com.tencent.mm.x.c.yN().cI(((bqr)localObject1).uFM);
          localObject2 = new bqs();
          String str = q.getFullPath(paramArrayOfByte.field_imgPath);
          ((bqs)localObject2).uGf = o.e(str, 0, true);
          ((bqs)localObject2).uFM = ((bqr)localObject1).uFM;
          ((bqs)localObject2).twT = new b(FileOp.c(str, 0, -1));
          q.D(paramArrayOfByte);
          try
          {
            paramArrayOfByte = ((bqs)localObject2).toByteArray();
            GMTrace.o(9201430560768L, 68556);
            return paramArrayOfByte;
          }
          catch (IOException paramArrayOfByte)
          {
            GMTrace.o(9201430560768L, 68556);
            return null;
          }
          paramArrayOfByte = paramArrayOfByte;
        }
        catch (IOException paramArrayOfByte)
        {
          for (;;) {}
        }
      }
    }
  }
  
  protected final boolean wR(int paramInt)
  {
    GMTrace.i(9201698996224L, 68558);
    switch (paramInt)
    {
    default: 
      GMTrace.o(9201698996224L, 68558);
      return true;
    }
    GMTrace.o(9201698996224L, 68558);
    return false;
  }
  
  protected final boolean wS(int paramInt)
  {
    GMTrace.i(9201564778496L, 68557);
    switch (paramInt)
    {
    default: 
      GMTrace.o(9201564778496L, 68557);
      return true;
    }
    GMTrace.o(9201564778496L, 68557);
    return false;
  }
}


/* Location:              /Users/xianghongyan/decompile/dex2jar/classes2-dex2jar.jar!/com/tencent/mm/plugin/wear/model/e/j.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */