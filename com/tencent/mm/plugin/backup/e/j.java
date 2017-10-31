package com.tencent.mm.plugin.backup.e;

import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.g.b.ce;
import com.tencent.mm.plugin.backup.g.a;
import com.tencent.mm.plugin.backup.g.d;
import com.tencent.mm.plugin.backup.h.u;
import com.tencent.mm.protocal.c.axt;
import com.tencent.mm.protocal.c.eh;
import com.tencent.mm.storage.au;
import java.util.HashMap;
import java.util.LinkedList;

public final class j
  implements e
{
  public j()
  {
    GMTrace.i(14816831864832L, 110394);
    GMTrace.o(14816831864832L, 110394);
  }
  
  public final int a(eh parameh, boolean paramBoolean1, au paramau, String paramString, LinkedList<u> paramLinkedList, HashMap<Long, a.c> paramHashMap, boolean paramBoolean2, long paramLong)
  {
    GMTrace.i(14816966082560L, 110395);
    if (paramau.field_content == null)
    {
      GMTrace.o(14816966082560L, 110395);
      return 0;
    }
    int i = paramau.field_content.getBytes().length;
    GMTrace.o(14816966082560L, 110395);
    return i;
  }
  
  public final int a(String paramString, eh parameh, au paramau)
  {
    GMTrace.i(14817100300288L, 110396);
    paramString = new String(parameh.tvq.usj);
    com.tencent.mm.plugin.messenger.foundation.a.a.c localc = a.afe().aff().yN();
    paramau.setContent(paramString);
    switch (parameh.jXP)
    {
    default: 
      if (paramau.field_msgId == 0L) {
        d.i(paramau);
      }
      break;
    }
    for (;;)
    {
      GMTrace.o(14817100300288L, 110396);
      return 0;
      paramau.dB(6);
      break;
      localc.b(parameh.tvv, paramau);
    }
  }
}


/* Location:              /Users/xianghongyan/decompile/dex2jar/classes2-dex2jar.jar!/com/tencent/mm/plugin/backup/e/j.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */