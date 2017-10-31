package com.tencent.mm.plugin.backup.g;

import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.g.b.aj;
import com.tencent.mm.g.b.ce;
import com.tencent.mm.modelvideo.r;
import com.tencent.mm.modelvideo.s;
import com.tencent.mm.sdk.platformtools.bg;
import com.tencent.mm.sdk.platformtools.h;
import com.tencent.mm.sdk.platformtools.j;
import com.tencent.mm.sdk.platformtools.w;
import com.tencent.mm.storage.ae;
import com.tencent.mm.storage.ar;
import com.tencent.mm.storage.as;
import com.tencent.mm.storage.au;
import com.tencent.mm.storage.x;
import com.tencent.mm.x.aa;
import java.io.File;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Set;

public final class d
{
  public static void d(HashMap<String, Integer> paramHashMap)
  {
    GMTrace.i(14860721061888L, 110721);
    Iterator localIterator = paramHashMap.keySet().iterator();
    while (localIterator.hasNext())
    {
      Object localObject = (String)localIterator.next();
      au localau = a.afe().aff().yN().cN((String)localObject, " and not ( type = 10000 and isSend != 2 ) ");
      if (localau != null)
      {
        int j = ((Integer)paramHashMap.get(localObject)).intValue();
        String str = localau.field_talker;
        w.i("MicroMsg.TempStorageLogic", "talker:%s, addUnreadCount:%d", new Object[] { str, Integer.valueOf(j) });
        int i = 0;
        ae localae = a.afe().aff().yQ().SV(str);
        if ((localae != null) && (localae.field_conversationTime > localau.field_createTime) && (localae.field_conversationTime != Long.MAX_VALUE))
        {
          w.i("MicroMsg.TempStorageLogic", "updateConvFromLastMsg ignore(maybe the system time is bigger than normal)");
        }
        else
        {
          localObject = localae;
          if (localae == null)
          {
            w.i("MicroMsg.TempStorageLogic", "updateConvFromLastMsg conversation is null.");
            w.d("MicroMsg.TempStorageLogic", "updateConvFromLastMsg cvs:%s", new Object[] { str });
            localObject = new ae(str);
            i = 1;
          }
          ((ae)localObject).dC(localau.field_isSend);
          ((ae)localObject).dz(j + ((aj)localObject).field_unReadCount);
          ((ae)localObject).W(localau);
          ((ae)localObject).cI(Integer.toString(localau.field_type));
          ((ae)localObject).x(((aj)localObject).field_flag & 0x4000000000000000 | localau.field_createTime & 0xFFFFFFFFFFFFFF);
          ((ae)localObject).dy(0);
          if (i != 0)
          {
            w.d("MicroMsg.TempStorageLogic", "updateConvFromLastMsg cvs:%s, cvs.flag:%d", new Object[] { str, Long.valueOf(((aj)localObject).field_flag) });
            a.afe().aff().yQ().d((ae)localObject);
          }
          else
          {
            a.afe().aff().yQ().a((ae)localObject, str);
          }
        }
      }
    }
    a.afe().aff().yQ().bQi();
    GMTrace.o(14860721061888L, 110721);
  }
  
  public static boolean dW(String paramString)
  {
    GMTrace.i(14860855279616L, 110722);
    if ((paramString == null) || (paramString.length() <= 0))
    {
      GMTrace.o(14860855279616L, 110722);
      return false;
    }
    boolean bool = paramString.endsWith("@chatroom");
    GMTrace.o(14860855279616L, 110722);
    return bool;
  }
  
  public static int gy(String paramString)
  {
    GMTrace.i(14861123715072L, 110724);
    if (paramString == null)
    {
      GMTrace.o(14861123715072L, 110724);
      return -1;
    }
    if (paramString.length() <= 0)
    {
      GMTrace.o(14861123715072L, 110724);
      return -1;
    }
    int i = paramString.indexOf(':');
    if ((i != -1) && (paramString.substring(0, i).contains("<")))
    {
      GMTrace.o(14861123715072L, 110724);
      return -1;
    }
    GMTrace.o(14861123715072L, 110724);
    return i;
  }
  
  public static long i(au paramau)
  {
    GMTrace.i(14860989497344L, 110723);
    Object localObject = a.afe().aff().yL().SL(paramau.field_talker);
    if ((localObject == null) || ((int)((com.tencent.mm.l.a)localObject).gLS == 0))
    {
      if (bg.mZ(paramau.field_talker)) {
        break label151;
      }
      a.afe().afg().c(2, paramau.field_talker);
      a.afe().aff().yL().R(new x(paramau.field_talker));
    }
    for (;;)
    {
      long l = a.afe().aff().yN().K(paramau);
      if (l < 0L) {
        w.e("MicroMsg.TempStorageLogic", "insertMsgWithContact faile: type:%d, talker:%s", new Object[] { Integer.valueOf(paramau.field_type), paramau.field_talker });
      }
      GMTrace.o(14860989497344L, 110723);
      return l;
      label151:
      if (paramau.field_talker.endsWith("@chatroom"))
      {
        localObject = a.afe().aff();
        if (((c)localObject).uin == 0) {
          throw new com.tencent.mm.x.b();
        }
        if (((c)localObject).jSo.gq(paramau.field_talker) == null) {
          a.afe().afg().c(2, paramau.field_talker);
        }
      }
    }
  }
  
  public static r sV(String paramString)
  {
    GMTrace.i(14861257932800L, 110725);
    if (bg.mZ(paramString))
    {
      GMTrace.o(14861257932800L, 110725);
      return null;
    }
    paramString = a.afe().aff().Na().lU(paramString);
    GMTrace.o(14861257932800L, 110725);
    return paramString;
  }
  
  public static String sW(String paramString)
  {
    GMTrace.i(14861392150528L, 110726);
    Object localObject = a.afe().aff();
    if (((c)localObject).uin == 0) {
      throw new com.tencent.mm.x.b();
    }
    localObject = h.a(((c)localObject).gRr + "voice2/", "msg_", paramString, ".amr", 2);
    if (bg.mZ((String)localObject))
    {
      GMTrace.o(14861392150528L, 110726);
      return null;
    }
    if (new File((String)localObject).exists())
    {
      GMTrace.o(14861392150528L, 110726);
      return (String)localObject;
    }
    StringBuilder localStringBuilder = new StringBuilder();
    c localc = a.afe().aff();
    if (localc.uin == 0) {
      throw new com.tencent.mm.x.b();
    }
    paramString = new StringBuilder().append(localc.gRr).append("voice/").toString() + paramString;
    if (new File(paramString + ".amr").exists()) {
      j.r(paramString + ".amr", (String)localObject, true);
    }
    for (;;)
    {
      GMTrace.o(14861392150528L, 110726);
      return (String)localObject;
      if (new File(paramString).exists()) {
        j.r(paramString, (String)localObject, true);
      }
    }
  }
}


/* Location:              /Users/xianghongyan/decompile/dex2jar/classes2-dex2jar.jar!/com/tencent/mm/plugin/backup/g/d.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */