package com.tencent.mm.plugin.favorite.b;

import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.protocal.c.sp;
import com.tencent.mm.protocal.c.sy;
import com.tencent.mm.protocal.c.sz;
import com.tencent.mm.protocal.c.ta;
import com.tencent.mm.protocal.c.td;
import com.tencent.mm.protocal.c.tj;
import com.tencent.mm.sdk.platformtools.bg;
import com.tencent.mm.sdk.platformtools.w;
import java.io.File;
import java.util.Iterator;
import java.util.LinkedList;

public final class q
  implements x.a
{
  public boolean lOG;
  
  public q()
  {
    GMTrace.i(6260317487104L, 46643);
    this.lOG = true;
    GMTrace.o(6260317487104L, 46643);
  }
  
  public static boolean b(sp paramsp)
  {
    GMTrace.i(6260585922560L, 46645);
    if (paramsp == null)
    {
      GMTrace.o(6260585922560L, 46645);
      return true;
    }
    switch (paramsp.aHe)
    {
    case 5: 
    case 6: 
    case 9: 
    case 10: 
    case 11: 
    case 12: 
    case 13: 
    case 14: 
    default: 
      GMTrace.o(6260585922560L, 46645);
      return false;
    case 2: 
    case 8: 
      if (!new File(x.g(paramsp)).exists())
      {
        GMTrace.o(6260585922560L, 46645);
        return true;
      }
      GMTrace.o(6260585922560L, 46645);
      return false;
    case 15: 
      if (bg.RF(com.tencent.mm.k.g.uz().getValue("SIGHTCannotTransmitForFav")) != 0)
      {
        w.w("MicroMsg.FavSendFilter", "can not retransmit short video");
        GMTrace.o(6260585922560L, 46645);
        return true;
      }
      if (new File(x.g(paramsp)).exists())
      {
        GMTrace.o(6260585922560L, 46645);
        return false;
      }
      GMTrace.o(6260585922560L, 46645);
      return true;
    case 4: 
      if (new File(x.g(paramsp)).exists())
      {
        GMTrace.o(6260585922560L, 46645);
        return false;
      }
      boolean bool = bg.mZ(paramsp.tOE);
      GMTrace.o(6260585922560L, 46645);
      return bool;
    case 7: 
      if ((bg.mZ(paramsp.tOE)) && (bg.mZ(paramsp.tOG)) && (bg.mZ(paramsp.tOI)) && (bg.mZ(paramsp.tOI)))
      {
        GMTrace.o(6260585922560L, 46645);
        return true;
      }
      GMTrace.o(6260585922560L, 46645);
      return false;
    }
    GMTrace.o(6260585922560L, 46645);
    return true;
  }
  
  public static boolean h(j paramj)
  {
    GMTrace.i(6260720140288L, 46646);
    if (paramj == null)
    {
      GMTrace.o(6260720140288L, 46646);
      return false;
    }
    if (!x.s(paramj))
    {
      GMTrace.o(6260720140288L, 46646);
      return false;
    }
    Object localObject = new File(x.g(x.n(paramj)));
    switch (paramj.field_type)
    {
    }
    do
    {
      do
      {
        do
        {
          GMTrace.o(6260720140288L, 46646);
          return false;
          if (paramj.field_id <= 0)
          {
            GMTrace.o(6260720140288L, 46646);
            return false;
          }
          if ((paramj.field_favProto == null) || (paramj.field_favProto.tQC.size() <= 1))
          {
            GMTrace.o(6260720140288L, 46646);
            return false;
          }
          paramj = paramj.field_favProto.tQC.iterator();
          do
          {
            if (!paramj.hasNext()) {
              break;
            }
            localObject = (sp)paramj.next();
          } while ((bg.mZ(((sp)localObject).tOx)) || (bg.mZ(((sp)localObject).tOz)) || (com.tencent.mm.a.e.aZ(x.g((sp)localObject))));
          GMTrace.o(6260720140288L, 46646);
          return true;
        } while (((File)localObject).exists());
        GMTrace.o(6260720140288L, 46646);
        return true;
        if (bg.RF(com.tencent.mm.k.g.uz().getValue("SIGHTCannotTransmitForFav")) != 0)
        {
          w.w("MicroMsg.FavSendFilter", "can not retransmit short video");
          GMTrace.o(6260720140288L, 46646);
          return false;
        }
      } while (((File)localObject).exists());
      GMTrace.o(6260720140288L, 46646);
      return true;
    } while ((!bg.mZ(x.n(paramj).tOE)) || (((File)localObject).exists()));
    GMTrace.o(6260720140288L, 46646);
    return true;
  }
  
  public final boolean g(j paramj)
  {
    GMTrace.i(6260451704832L, 46644);
    if (paramj == null)
    {
      GMTrace.o(6260451704832L, 46644);
      return true;
    }
    if (x.u(paramj))
    {
      GMTrace.o(6260451704832L, 46644);
      return true;
    }
    Object localObject1;
    boolean bool;
    Object localObject2;
    switch (paramj.field_type)
    {
    case 9: 
    case 12: 
    case 13: 
    case 17: 
    default: 
      GMTrace.o(6260451704832L, 46644);
      return false;
    case 14: 
    case 18: 
      if (paramj.field_id <= 0)
      {
        GMTrace.o(6260451704832L, 46644);
        return true;
      }
      if ((paramj.field_type == 18) && ((paramj.field_favProto == null) || (paramj.field_favProto.tQC.size() <= 1)))
      {
        GMTrace.o(6260451704832L, 46644);
        return true;
      }
      if ((paramj.field_type == 18) && ((bg.mZ(((sp)paramj.field_favProto.tQC.get(0)).tOx)) || (bg.mZ(((sp)paramj.field_favProto.tQC.get(0)).tOz))))
      {
        GMTrace.o(6260451704832L, 46644);
        return true;
      }
      paramj = paramj.field_favProto.tQC.iterator();
      while (paramj.hasNext())
      {
        localObject1 = (sp)paramj.next();
        if (((((sp)localObject1).aHe == 2) || (((sp)localObject1).aHe == 8) || (((sp)localObject1).aHe == 15) || (((sp)localObject1).aHe == 4)) && (!com.tencent.mm.a.e.aZ(x.g((sp)localObject1))))
        {
          GMTrace.o(6260451704832L, 46644);
          return true;
        }
      }
      GMTrace.o(6260451704832L, 46644);
      return false;
    case 1: 
      bool = bg.mZ(paramj.field_favProto.desc);
      GMTrace.o(6260451704832L, 46644);
      return bool;
    case 2: 
    case 8: 
      if (!new File(x.g(x.n(paramj))).exists())
      {
        GMTrace.o(6260451704832L, 46644);
        return true;
      }
      GMTrace.o(6260451704832L, 46644);
      return false;
    case 16: 
      if (bg.RF(com.tencent.mm.k.g.uz().getValue("SIGHTCannotTransmitForFav")) != 0)
      {
        w.w("MicroMsg.FavSendFilter", "can not retransmit short video");
        GMTrace.o(6260451704832L, 46644);
        return true;
      }
      localObject1 = x.n(paramj);
      localObject2 = new File(x.g((sp)localObject1));
      w.v("MicroMsg.FavSendFilter", "type size, favid %d, localid %d, path %s, exist %B", new Object[] { Integer.valueOf(paramj.field_id), Long.valueOf(paramj.field_localId), ((File)localObject2).getAbsolutePath(), Boolean.valueOf(((File)localObject2).exists()) });
      if (((File)localObject2).exists())
      {
        long l1 = ((File)localObject2).length();
        long l2 = ((sp)localObject1).tOS;
        if (Math.abs(l2 - l1) > 16L)
        {
          w.w("MicroMsg.FavSendFilter", "it can not retransmit short video because of file was replaced. file[%d, %s], data[%d, %s]", new Object[] { Long.valueOf(l1), com.tencent.mm.a.g.h((File)localObject2), Long.valueOf(l2), ((sp)localObject1).tOO });
          GMTrace.o(6260451704832L, 46644);
          return true;
        }
        GMTrace.o(6260451704832L, 46644);
        return false;
      }
      GMTrace.o(6260451704832L, 46644);
      return true;
    case 4: 
      paramj = x.n(paramj);
      if (new File(x.g(paramj)).exists())
      {
        GMTrace.o(6260451704832L, 46644);
        return false;
      }
      bool = bg.mZ(paramj.tOE);
      GMTrace.o(6260451704832L, 46644);
      return bool;
    case 6: 
      if (paramj.field_favProto.tPL == null)
      {
        GMTrace.o(6260451704832L, 46644);
        return true;
      }
      GMTrace.o(6260451704832L, 46644);
      return false;
    case 7: 
      paramj = x.n(paramj);
      if ((bg.mZ(paramj.tOE)) && (bg.mZ(paramj.tOG)) && (bg.mZ(paramj.tOI)) && (bg.mZ(paramj.tOI)))
      {
        GMTrace.o(6260451704832L, 46644);
        return true;
      }
      GMTrace.o(6260451704832L, 46644);
      return false;
    case 5: 
      localObject2 = paramj.field_favProto.tQA;
      localObject1 = paramj.field_favProto.tPN;
      paramj = null;
      if (localObject1 != null) {
        paramj = ((tj)localObject1).tRc;
      }
      localObject1 = paramj;
      if (localObject2 != null)
      {
        localObject1 = paramj;
        if (bg.mZ(paramj)) {
          localObject1 = ((ta)localObject2).hNh;
        }
      }
      bool = bg.mZ((String)localObject1);
      GMTrace.o(6260451704832L, 46644);
      return bool;
    case 10: 
      paramj = paramj.field_favProto.tPP;
      if ((paramj == null) || (bg.mZ(paramj.info)))
      {
        GMTrace.o(6260451704832L, 46644);
        return true;
      }
      GMTrace.o(6260451704832L, 46644);
      return false;
    case 15: 
      paramj = paramj.field_favProto.tPR;
      if ((paramj == null) || (bg.mZ(paramj.info)))
      {
        GMTrace.o(6260451704832L, 46644);
        return true;
      }
      GMTrace.o(6260451704832L, 46644);
      return false;
    case 11: 
      paramj = paramj.field_favProto.tPP;
      if ((paramj == null) || (bg.mZ(paramj.info)))
      {
        GMTrace.o(6260451704832L, 46644);
        return true;
      }
      GMTrace.o(6260451704832L, 46644);
      return false;
    }
    if (this.lOG)
    {
      GMTrace.o(6260451704832L, 46644);
      return true;
    }
    GMTrace.o(6260451704832L, 46644);
    return false;
  }
}


/* Location:              /Users/xianghongyan/decompile/dex2jar/classes2-dex2jar.jar!/com/tencent/mm/plugin/favorite/b/q.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */